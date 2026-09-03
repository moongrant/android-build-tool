package org.jctools.maps;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jctools.util.RangeUtil;
import org.jctools.util.UnsafeAccess;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes5.dex */
public class NonBlockingHashMap<TypeK, TypeV> extends AbstractMap<TypeK, TypeV> implements ConcurrentMap<TypeK, TypeV>, Cloneable, Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static volatile int DUMMY_VOLATILE = 0;
    private static final Object MATCH_ANY;
    private static final int MIN_SIZE = 8;
    private static final int MIN_SIZE_LOG = 3;
    private static final Object NO_MATCH_OLD;
    private static final int REPROBE_LIMIT = 10;
    private static final Prime TOMBPRIME;
    public static final Object TOMBSTONE;
    private static final int _Obase;
    private static final int _Olog;
    private static final int _Oscale;
    private static final long _kvs_offset;
    private static final long serialVersionUID = 1234123412341234123L;
    private transient Object[] _kvs;
    private transient long _last_resize_milli;
    private transient ConcurrentAutoTable _reprobes;

    public static final class CHM<TypeK, TypeV> {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        volatile Object[] _newkvs;
        volatile long _resizers;
        private final ConcurrentAutoTable _size;
        private static final AtomicReferenceFieldUpdater<CHM, Object[]> _newkvsUpdater = AtomicReferenceFieldUpdater.newUpdater(CHM.class, Object[].class, "_newkvs");
        private static final AtomicLongFieldUpdater<CHM> _resizerUpdater = AtomicLongFieldUpdater.newUpdater(CHM.class, "_resizers");
        private static final AtomicLongFieldUpdater<CHM> _copyIdxUpdater = AtomicLongFieldUpdater.newUpdater(CHM.class, "_copyIdx");
        private static final AtomicLongFieldUpdater<CHM> _copyDoneUpdater = AtomicLongFieldUpdater.newUpdater(CHM.class, "_copyDone");
        volatile long _copyIdx = 0;
        volatile long _copyDone = 0;
        private final ConcurrentAutoTable _slots = new ConcurrentAutoTable();

        public CHM(ConcurrentAutoTable concurrentAutoTable) {
            this._size = concurrentAutoTable;
        }

        private final void copy_check_and_promote(NonBlockingHashMap nonBlockingHashMap, Object[] objArr, int i) {
            int iLen = NonBlockingHashMap.len(objArr);
            long j = this._copyDone;
            if (i > 0) {
                while (!_copyDoneUpdater.compareAndSet(this, j, j + ((long) i))) {
                    j = this._copyDone;
                }
            }
            if (j + ((long) i) == iLen && nonBlockingHashMap._kvs == objArr && nonBlockingHashMap.CAS_kvs(objArr, this._newkvs)) {
                nonBlockingHashMap._last_resize_milli = System.currentTimeMillis();
            }
        }

        private boolean copy_slot(NonBlockingHashMap nonBlockingHashMap, int i, Object[] objArr, Object[] objArr2) {
            Object objKey;
            while (true) {
                objKey = NonBlockingHashMap.key(objArr, i);
                if (objKey != null) {
                    break;
                }
                NonBlockingHashMap.CAS_key(objArr, i, null, NonBlockingHashMap.TOMBSTONE);
            }
            Object objVal = NonBlockingHashMap.val(objArr, i);
            while (!(objVal instanceof Prime)) {
                Prime prime = (objVal == null || objVal == NonBlockingHashMap.TOMBSTONE) ? NonBlockingHashMap.TOMBPRIME : new Prime(objVal);
                if (NonBlockingHashMap.CAS_val(objArr, i, objVal, prime)) {
                    if (prime != NonBlockingHashMap.TOMBPRIME) {
                        objVal = prime;
                        break;
                    }
                    return true;
                }
                objVal = NonBlockingHashMap.val(objArr, i);
            }
            if (objVal == NonBlockingHashMap.TOMBPRIME) {
                return false;
            }
            NonBlockingHashMap.putIfMatch0(nonBlockingHashMap, objArr2, objKey, ((Prime) objVal)._V, null);
            while (objVal != NonBlockingHashMap.TOMBPRIME && !NonBlockingHashMap.CAS_val(objArr, i, objVal, NonBlockingHashMap.TOMBPRIME)) {
                objVal = NonBlockingHashMap.val(objArr, i);
            }
            return objVal != NonBlockingHashMap.TOMBPRIME;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object[] copy_slot_and_check(NonBlockingHashMap nonBlockingHashMap, Object[] objArr, int i, Object obj) {
            Object[] objArr2 = this._newkvs;
            if (copy_slot(nonBlockingHashMap, i, objArr, this._newkvs)) {
                copy_check_and_promote(nonBlockingHashMap, objArr, 1);
            }
            return obj == null ? objArr2 : nonBlockingHashMap.help_copy(objArr2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void help_copy_impl(NonBlockingHashMap nonBlockingHashMap, Object[] objArr, boolean z) {
            Object[] objArr2 = this._newkvs;
            int iLen = NonBlockingHashMap.len(objArr);
            int iMin = Math.min(iLen, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
            int i = -9999;
            int i2 = -1;
            while (true) {
                if (this._copyDone >= iLen) {
                    copy_check_and_promote(nonBlockingHashMap, objArr, 0);
                    return;
                }
                if (i2 == -1) {
                    int i3 = (int) this._copyIdx;
                    while (!_copyIdxUpdater.compareAndSet(this, i3, i3 + iMin)) {
                        i3 = (int) this._copyIdx;
                    }
                    if (i3 >= (iLen << 1)) {
                        i = i3;
                        i2 = i;
                    } else {
                        i = i3;
                    }
                }
                int i4 = 0;
                for (int i5 = 0; i5 < iMin; i5++) {
                    if (copy_slot(nonBlockingHashMap, (i + i5) & (iLen - 1), objArr, objArr2)) {
                        i4++;
                    }
                }
                if (i4 > 0) {
                    copy_check_and_promote(nonBlockingHashMap, objArr, i4);
                }
                i += iMin;
                if (!z && i2 == -1) {
                    return;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object[] resize(NonBlockingHashMap nonBlockingHashMap, Object[] objArr) {
            int i;
            long j;
            Object[] objArr2 = this._newkvs;
            if (objArr2 != null) {
                return objArr2;
            }
            int iLen = NonBlockingHashMap.len(objArr);
            int size = size();
            if (size >= (iLen >> 2)) {
                i = iLen << 1;
                if (((long) size) * 4 >= ((iLen >> 20) != 0 ? 3L : 2L) * ((long) iLen)) {
                    i = iLen << 2;
                }
            } else {
                i = size;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (i <= iLen && jCurrentTimeMillis <= nonBlockingHashMap._last_resize_milli + 10000) {
                i = iLen << 1;
            }
            if (i >= iLen) {
                iLen = i;
            }
            int i2 = 3;
            while ((1 << i2) < iLen) {
                i2++;
            }
            long j2 = ((1 << i2) << 1) + 2;
            if (((int) j2) != j2) {
                if (size > 805306369) {
                    throw new RuntimeException("Table is full.");
                }
                i2 = 30;
                j2 = 1073741826;
            }
            int i3 = i2;
            long j3 = j2;
            long j4 = this._resizers;
            while (true) {
                j = j4;
                if (_resizerUpdater.compareAndSet(this, j, j + 1)) {
                    break;
                }
                j4 = this._resizers;
            }
            long j5 = ((((1 << i3) << 1) + 8) << 3) >> 20;
            if (j >= 2 && j5 > 0) {
                Object[] objArr3 = this._newkvs;
                if (objArr3 != null) {
                    return objArr3;
                }
                try {
                    Thread.sleep(j5);
                } catch (Exception unused) {
                }
            }
            Object[] objArr4 = this._newkvs;
            if (objArr4 != null) {
                return objArr4;
            }
            Object[] objArr5 = new Object[(int) j3];
            objArr5[0] = new CHM(this._size);
            objArr5[1] = new int[1 << i3];
            if (this._newkvs != null) {
                return this._newkvs;
            }
            if (!CAS_newkvs(objArr5)) {
                return this._newkvs;
            }
            nonBlockingHashMap.rehash();
            return objArr5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean tableFull(int i, int i2) {
            return i >= 10 && (i >= NonBlockingHashMap.reprobe_limit(i2) || this._slots.estimate_get() >= ((long) (i2 >> 1)));
        }

        public boolean CAS_newkvs(Object[] objArr) {
            boolean z;
            do {
                z = false;
                if (this._newkvs != null) {
                    return false;
                }
                AtomicReferenceFieldUpdater<CHM, Object[]> atomicReferenceFieldUpdater = _newkvsUpdater;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, objArr)) {
                        z = true;
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } while (!z);
            return true;
        }

        public int size() {
            return (int) this._size.get();
        }

        public int slots() {
            return (int) this._slots.get();
        }
    }

    public class NBHMEntry extends AbstractEntry<TypeK, TypeV> {
        public NBHMEntry(TypeK typek, TypeV typev) {
            super(typek, typev);
        }

        @Override // java.util.Map.Entry
        public TypeV setValue(TypeV typev) {
            typev.getClass();
            this._val = typev;
            return (TypeV) NonBlockingHashMap.this.put(this._key, typev);
        }
    }

    public static final class Prime {
        final Object _V;

        public Prime(Object obj) {
            this._V = obj;
        }

        public static Object unbox(Object obj) {
            return obj instanceof Prime ? ((Prime) obj)._V : obj;
        }
    }

    public class SnapshotE implements Iterator<Map.Entry<TypeK, TypeV>> {
        final NonBlockingHashMap<TypeK, TypeV>.SnapshotV _ss;

        public SnapshotE() {
            this._ss = new SnapshotV();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this._ss.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this._ss.removeKey();
        }

        @Override // java.util.Iterator
        public Map.Entry<TypeK, TypeV> next() {
            this._ss.next();
            return new NBHMEntry(((SnapshotV) this._ss)._prevK, ((SnapshotV) this._ss)._prevV);
        }
    }

    public class SnapshotK implements Iterator<TypeK>, Enumeration<TypeK> {
        final NonBlockingHashMap<TypeK, TypeV>.SnapshotV _ss;

        public SnapshotK() {
            this._ss = new SnapshotV();
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return hasNext();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this._ss.hasNext();
        }

        @Override // java.util.Iterator
        public TypeK next() {
            this._ss.next();
            return (TypeK) ((SnapshotV) this._ss)._prevK;
        }

        @Override // java.util.Enumeration
        public TypeK nextElement() {
            return (TypeK) next();
        }

        @Override // java.util.Iterator
        public void remove() {
            this._ss.removeKey();
        }
    }

    public class SnapshotV implements Iterator<TypeV>, Enumeration<TypeV> {
        private int _idx;
        private Object _nextK;
        private TypeV _nextV;
        private Object _prevK;
        private TypeV _prevV;
        final Object[] _sskvs;

        public SnapshotV() {
            while (true) {
                Object[] objArr = NonBlockingHashMap.this._kvs;
                CHM chm = NonBlockingHashMap.chm(objArr);
                if (chm._newkvs == null) {
                    this._sskvs = objArr;
                    next();
                    return;
                }
                chm.help_copy_impl(NonBlockingHashMap.this, objArr, true);
            }
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return hasNext();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this._nextV != null;
        }

        public Object key(int i) {
            return NonBlockingHashMap.key(this._sskvs, i);
        }

        public int length() {
            return NonBlockingHashMap.len(this._sskvs);
        }

        @Override // java.util.Iterator
        public TypeV next() {
            if (this._idx != 0 && this._nextV == null) {
                throw new NoSuchElementException();
            }
            this._prevK = this._nextK;
            this._prevV = this._nextV;
            this._nextV = null;
            while (this._idx < length()) {
                int i = this._idx;
                this._idx = i + 1;
                Object objKey = key(i);
                this._nextK = objKey;
                if (objKey != null && objKey != NonBlockingHashMap.TOMBSTONE) {
                    TypeV typev = (TypeV) NonBlockingHashMap.this.get(objKey);
                    this._nextV = typev;
                    if (typev != null) {
                        break;
                    }
                }
            }
            return this._prevV;
        }

        @Override // java.util.Enumeration
        public TypeV nextElement() {
            return (TypeV) next();
        }

        @Override // java.util.Iterator
        public void remove() {
            removeKey();
        }

        public void removeKey() {
            if (this._prevV == null) {
                throw new IllegalStateException();
            }
            NonBlockingHashMap.this.putIfMatch(this._prevK, NonBlockingHashMap.TOMBSTONE, NonBlockingHashMap.NO_MATCH_OLD);
            this._prevV = null;
        }
    }

    static {
        int i;
        Unsafe unsafe = UnsafeAccess.UNSAFE;
        _Obase = unsafe.arrayBaseOffset(Object[].class);
        int iArrayIndexScale = unsafe.arrayIndexScale(Object[].class);
        _Oscale = iArrayIndexScale;
        if (iArrayIndexScale == 4) {
            i = 2;
        } else {
            i = iArrayIndexScale == 8 ? 3 : 9999;
        }
        _Olog = i;
        _kvs_offset = UnsafeAccess.fieldOffset(NonBlockingHashMap.class, "_kvs");
        NO_MATCH_OLD = new Object();
        MATCH_ANY = new Object();
        Object obj = new Object();
        TOMBSTONE = obj;
        TOMBPRIME = new Prime(obj);
    }

    public NonBlockingHashMap() {
        this(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CAS_key(Object[] objArr, int i, Object obj, Object obj2) {
        return OooO00o.OooO00o(UnsafeAccess.UNSAFE, objArr, rawIndex(objArr, (i << 1) + 2), obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean CAS_kvs(Object[] objArr, Object[] objArr2) {
        return OooO00o.OooO00o(UnsafeAccess.UNSAFE, this, _kvs_offset, objArr, objArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CAS_val(Object[] objArr, int i, Object obj, Object obj2) {
        return OooO00o.OooO00o(UnsafeAccess.UNSAFE, objArr, rawIndex(objArr, (i << 1) + 3), obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CHM chm(Object[] objArr) {
        return (CHM) objArr[0];
    }

    private static final Object get_impl(NonBlockingHashMap nonBlockingHashMap, Object[] objArr, Object obj) {
        Object[] objArr2;
        int iHash = hash(obj);
        int iLen = len(objArr);
        CHM chm = chm(objArr);
        int[] iArrHashes = hashes(objArr);
        int i = iLen - 1;
        int i2 = iHash & i;
        int i3 = 0;
        while (true) {
            Object objKey = key(objArr, i2);
            Object objVal = val(objArr, i2);
            if (objKey == null) {
                return null;
            }
            objArr2 = chm._newkvs;
            if (keyeq(objKey, obj, iArrHashes, i2, iHash)) {
                if (objVal instanceof Prime) {
                    return get_impl(nonBlockingHashMap, chm.copy_slot_and_check(nonBlockingHashMap, objArr, i2, obj), obj);
                }
                if (objVal == TOMBSTONE) {
                    return null;
                }
                return objVal;
            }
            i3++;
            if (i3 >= reprobe_limit(iLen) || objKey == TOMBSTONE) {
                break;
            }
            i2 = (i2 + 1) & i;
        }
        if (objArr2 == null) {
            return null;
        }
        return get_impl(nonBlockingHashMap, nonBlockingHashMap.help_copy(objArr2), obj);
    }

    private static final Object getk_impl(NonBlockingHashMap nonBlockingHashMap, Object[] objArr, Object obj) {
        int iHash = hash(obj);
        int iLen = len(objArr);
        CHM chm = chm(objArr);
        int[] iArrHashes = hashes(objArr);
        int i = iLen - 1;
        int i2 = iHash & i;
        int i3 = 0;
        while (true) {
            Object objKey = key(objArr, i2);
            if (objKey == null) {
                return null;
            }
            Object[] objArr2 = chm._newkvs;
            if (keyeq(objKey, obj, iArrHashes, i2, iHash)) {
                return objKey;
            }
            i3++;
            if (i3 >= reprobe_limit(iLen) || objKey == TOMBSTONE) {
                if (objArr2 == null) {
                    return null;
                }
                return getk_impl(nonBlockingHashMap, nonBlockingHashMap.help_copy(objArr2), obj);
            }
            i2 = (i2 + 1) & i;
        }
    }

    private static final int hash(Object obj) {
        int iHashCode = obj.hashCode();
        int i = iHashCode ^ ((iHashCode >>> 20) ^ (iHashCode >>> 12));
        int i2 = i ^ ((i >>> 7) ^ (i >>> 4));
        return i2 + (i2 << 7);
    }

    private static final int[] hashes(Object[] objArr) {
        return (int[]) objArr[1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] help_copy(Object[] objArr) {
        Object[] objArr2 = this._kvs;
        CHM chm = chm(objArr2);
        if (chm._newkvs == null) {
            return objArr;
        }
        chm.help_copy_impl(this, objArr2, false);
        return objArr;
    }

    private final void initialize(int i) {
        RangeUtil.checkPositiveOrZero(i, "initial_sz");
        if (i > 1048576) {
            i = 1048576;
        }
        int i2 = 3;
        while (true) {
            int i3 = 1 << i2;
            if (i3 >= (i << 2)) {
                Object[] objArr = new Object[(i3 << 1) + 2];
                this._kvs = objArr;
                objArr[0] = new CHM(new ConcurrentAutoTable());
                this._kvs[1] = new int[i3];
                this._last_resize_milli = System.currentTimeMillis();
                return;
            }
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object key(Object[] objArr, int i) {
        return objArr[(i << 1) + 2];
    }

    private static boolean keyeq(Object obj, Object obj2, int[] iArr, int i, int i2) {
        int i3;
        return obj == obj2 || (((i3 = iArr[i]) == 0 || i3 == i2) && obj != TOMBSTONE && obj2.equals(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int len(Object[] objArr) {
        return (objArr.length - 2) >> 1;
    }

    private static boolean objectsEquals(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private final void print2(Object[] objArr) {
        Object obj;
        for (int i = 0; i < len(objArr); i++) {
            Object objKey = key(objArr, i);
            Object objVal = val(objArr, i);
            Object objUnbox = Prime.unbox(objVal);
            if (objKey != null && objKey != (obj = TOMBSTONE) && objVal != null && objUnbox != obj) {
                String str = objVal == objUnbox ? "" : "prime_";
                System.out.println("" + i + " (" + objKey + "," + str + objVal + ")");
            }
        }
        Object[] objArr2 = chm(objArr)._newkvs;
        if (objArr2 != null) {
            System.out.println("----");
            print2(objArr2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object putIfMatch0(NonBlockingHashMap nonBlockingHashMap, Object[] objArr, Object obj, Object obj2, Object obj3) {
        Object objVal;
        int i;
        Object obj4;
        int iHash = hash(obj);
        int iLen = len(objArr);
        CHM chm = chm(objArr);
        int[] iArrHashes = hashes(objArr);
        int i2 = iLen - 1;
        int i3 = iHash & i2;
        int i4 = 0;
        Object[] objArrResize = null;
        while (true) {
            objVal = val(objArr, i3);
            Object objKey = key(objArr, i3);
            i = i4;
            if (objKey == null) {
                Object obj5 = TOMBSTONE;
                if (obj2 == obj5) {
                    return obj5;
                }
                if (obj3 == MATCH_ANY) {
                    return obj5;
                }
                if (CAS_key(objArr, i3, null, obj)) {
                    chm._slots.add(1L);
                    iArrHashes[i3] = iHash;
                    break;
                }
                i4 = i;
            } else {
                objArrResize = chm._newkvs;
                if (keyeq(objKey, obj, iArrHashes, i3, iHash)) {
                    break;
                }
                i4 = i + 1;
                if (i4 >= reprobe_limit(iLen) || objKey == TOMBSTONE) {
                    Object[] objArrResize2 = chm.resize(nonBlockingHashMap, objArr);
                    if (obj3 != null) {
                        nonBlockingHashMap.help_copy(objArrResize2);
                    }
                    return putIfMatch0(nonBlockingHashMap, objArrResize2, obj, obj2, obj3);
                }
                i3 = (i3 + 1) & i2;
            }
        }
        while (obj2 != objVal) {
            int i5 = i;
            if (objArrResize == null && ((objVal == null && chm.tableFull(i5, iLen)) || (objVal instanceof Prime))) {
                objArrResize = chm.resize(nonBlockingHashMap, objArr);
            }
            if (objArrResize != null) {
                return putIfMatch0(nonBlockingHashMap, chm.copy_slot_and_check(nonBlockingHashMap, objArr, i3, obj3), obj, obj2, obj3);
            }
            if (obj3 != NO_MATCH_OLD && objVal != obj3 && ((obj3 != MATCH_ANY || objVal == TOMBSTONE || objVal == null) && ((objVal != null || obj3 != TOMBSTONE) && (obj3 == null || !obj3.equals(objVal))))) {
                return objVal == null ? TOMBSTONE : objVal;
            }
            if (CAS_val(objArr, i3, objVal, obj2)) {
                if (obj3 != null) {
                    if ((objVal == null || objVal == TOMBSTONE) && obj2 != TOMBSTONE) {
                        chm._size.add(1L);
                    }
                    if (objVal != null && objVal != (obj4 = TOMBSTONE) && obj2 == obj4) {
                        chm._size.add(-1L);
                    }
                }
                return (objVal != null || obj3 == null) ? objVal : TOMBSTONE;
            }
            objVal = val(objArr, i3);
            if (objVal instanceof Prime) {
                return putIfMatch0(nonBlockingHashMap, chm.copy_slot_and_check(nonBlockingHashMap, objArr, i3, obj3), obj, obj2, obj3);
            }
            i = i5;
        }
        return objVal;
    }

    private static long rawIndex(Object[] objArr, int i) {
        return ((long) _Obase) + (((long) i) << _Olog);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        initialize(8);
        while (true) {
            Object object = objectInputStream.readObject();
            Object object2 = objectInputStream.readObject();
            if (object == null) {
                return;
            } else {
                put(object, object2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int reprobe_limit(int i) {
        return (i >> 4) + 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object val(Object[] objArr, int i) {
        return objArr[(i << 1) + 3];
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        for (TypeK typek : keySet()) {
            TypeV typev = get(typek);
            objectOutputStream.writeObject(typek);
            objectOutputStream.writeObject(typev);
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        while (!CAS_kvs(this._kvs, new NonBlockingHashMap(8)._kvs)) {
        }
    }

    @Override // java.util.AbstractMap
    public Object clone() {
        try {
            NonBlockingHashMap nonBlockingHashMap = (NonBlockingHashMap) super.clone();
            nonBlockingHashMap.clear();
            for (TypeK typek : keySet()) {
                nonBlockingHashMap.put(typek, get(typek));
            }
            return nonBlockingHashMap;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public boolean contains(Object obj) {
        return containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        obj.getClass();
        for (TypeV typev : values()) {
            if (typev == obj || typev.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public Enumeration<TypeV> elements() {
        return new SnapshotV();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<TypeK, TypeV>> entrySet() {
        return new AbstractSet<Map.Entry<TypeK, TypeV>>() { // from class: org.jctools.maps.NonBlockingHashMap.3
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                NonBlockingHashMap.this.clear();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = NonBlockingHashMap.this.get(entry.getKey());
                return obj2 != null && obj2.equals(entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<TypeK, TypeV>> iterator() {
                return new SnapshotE();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return NonBlockingHashMap.this.remove(entry.getKey(), entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return NonBlockingHashMap.this.size();
            }
        };
    }

    @Override // java.util.AbstractMap, java.util.Map
    public TypeV get(Object obj) {
        return (TypeV) get_impl(this, this._kvs, obj);
    }

    public TypeK getk(TypeK typek) {
        return (TypeK) getk_impl(this, this._kvs, typek);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<TypeK> keySet() {
        return new AbstractSet<TypeK>() { // from class: org.jctools.maps.NonBlockingHashMap.2
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                NonBlockingHashMap.this.clear();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return NonBlockingHashMap.this.containsKey(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<TypeK> iterator() {
                return new SnapshotK();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                return NonBlockingHashMap.this.remove(obj) != null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return NonBlockingHashMap.this.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public <T> T[] toArray(T[] tArr) {
                Object obj;
                Object[] objArrRaw_array = NonBlockingHashMap.this.raw_array();
                int size = size();
                Object[] objArrCopyOf = tArr.length >= size ? tArr : (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
                int i = 0;
                for (int i2 = 0; i2 < NonBlockingHashMap.len(objArrRaw_array); i2++) {
                    Object objKey = NonBlockingHashMap.key(objArrRaw_array, i2);
                    Object objUnbox = Prime.unbox(NonBlockingHashMap.val(objArrRaw_array, i2));
                    if (objKey != null && objKey != (obj = NonBlockingHashMap.TOMBSTONE) && objUnbox != null && objUnbox != obj) {
                        if (i >= objArrCopyOf.length) {
                            int iMin = (int) Math.min(2147483639L, ((long) i) << 1);
                            if (iMin <= objArrCopyOf.length) {
                                throw new OutOfMemoryError("Required array size too large");
                            }
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iMin);
                        }
                        objArrCopyOf[i] = objKey;
                        i++;
                    }
                }
                if (i > tArr.length) {
                    return (T[]) Arrays.copyOf(objArrCopyOf, i);
                }
                if (tArr != objArrCopyOf) {
                    System.arraycopy(objArrCopyOf, 0, tArr, 0, i);
                }
                if (i < tArr.length) {
                    objArrCopyOf[i] = null;
                }
                return tArr;
            }
        };
    }

    public Enumeration<TypeK> keys() {
        return new SnapshotK();
    }

    public final void print() {
        System.out.println("=========");
        print2(this._kvs);
        System.out.println("=========");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public TypeV put(TypeK typek, TypeV typev) {
        return putIfMatch(typek, typev, NO_MATCH_OLD);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends TypeK, ? extends TypeV> map) {
        for (Map.Entry<? extends TypeK, ? extends TypeV> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public TypeV putIfAbsent(TypeK typek, TypeV typev) {
        return putIfMatch(typek, typev, TOMBSTONE);
    }

    public final TypeV putIfMatch(Object obj, Object obj2, Object obj3) {
        if (obj3 == null || obj2 == null) {
            throw null;
        }
        TypeV typev = (TypeV) putIfMatch0(this, this._kvs, obj, obj2, obj3);
        if (typev == TOMBSTONE) {
            return null;
        }
        return typev;
    }

    public final TypeV putIfMatchAllowNull(Object obj, Object obj2, Object obj3) {
        if (obj3 == null) {
            obj3 = TOMBSTONE;
        }
        if (obj2 == null) {
            obj2 = TOMBSTONE;
        }
        TypeV typev = (TypeV) putIfMatch0(this, this._kvs, obj, obj2, obj3);
        if (typev == TOMBSTONE) {
            return null;
        }
        return typev;
    }

    public Object[] raw_array() {
        return new SnapshotV()._sskvs;
    }

    public void rehash() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public TypeV remove(Object obj) {
        return putIfMatch(obj, TOMBSTONE, NO_MATCH_OLD);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public TypeV replace(TypeK typek, TypeV typev) {
        return putIfMatch(typek, typev, MATCH_ANY);
    }

    public long reprobes() {
        long j = this._reprobes.get();
        this._reprobes = new ConcurrentAutoTable();
        return j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return chm(this._kvs).size();
    }

    @Override // java.util.AbstractMap
    public String toString() {
        Iterator<Map.Entry<TypeK, TypeV>> it = entrySet().iterator();
        if (!it.hasNext()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        while (true) {
            Map.Entry<TypeK, TypeV> next = it.next();
            Object key = next.getKey();
            Object value = next.getValue();
            if (key == this) {
                key = "(this Map)";
            }
            sb.append(key);
            sb.append('=');
            if (value == this) {
                value = "(this Map)";
            }
            sb.append(value);
            if (!it.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            sb.append(", ");
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<TypeV> values() {
        return new AbstractCollection<TypeV>() { // from class: org.jctools.maps.NonBlockingHashMap.1
            @Override // java.util.AbstractCollection, java.util.Collection
            public void clear() {
                NonBlockingHashMap.this.clear();
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public boolean contains(Object obj) {
                return NonBlockingHashMap.this.containsValue(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            public Iterator<TypeV> iterator() {
                return new SnapshotV();
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public int size() {
                return NonBlockingHashMap.this.size();
            }
        };
    }

    public NonBlockingHashMap(int i) {
        this._reprobes = new ConcurrentAutoTable();
        initialize(i);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        return objectsEquals(putIfMatch(obj, TOMBSTONE, obj2), obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(TypeK typek, TypeV typev, TypeV typev2) {
        return objectsEquals(putIfMatch(typek, typev2, typev), typev);
    }

    private final void print(Object[] objArr) {
        for (int i = 0; i < len(objArr); i++) {
            Object objKey = key(objArr, i);
            if (objKey != null) {
                Object obj = TOMBSTONE;
                String string = objKey == obj ? "XXX" : objKey.toString();
                Object objVal = val(objArr, i);
                Object objUnbox = Prime.unbox(objVal);
                String str = objVal == objUnbox ? "" : "prime_";
                String string2 = objUnbox == obj ? "tombstone" : objUnbox.toString();
                PrintStream printStream = System.out;
                StringBuilder sbOooO00o = oo0o0O0.OooO0O0.OooO00o("", i, " (", string, ",");
                sbOooO00o.append(str);
                sbOooO00o.append(string2);
                sbOooO00o.append(")");
                printStream.println(sbOooO00o.toString());
            }
        }
        Object[] objArr2 = chm(objArr)._newkvs;
        if (objArr2 != null) {
            System.out.println("----");
            print(objArr2);
        }
    }

    public final void initialize() {
        initialize(8);
    }
}
