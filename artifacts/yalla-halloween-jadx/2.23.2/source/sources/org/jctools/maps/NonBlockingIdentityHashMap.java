package org.jctools.maps;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
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
public class NonBlockingIdentityHashMap<TypeK, TypeV> extends AbstractMap<TypeK, TypeV> implements ConcurrentMap<TypeK, TypeV>, Cloneable, Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object MATCH_ANY;
    private static final int MIN_SIZE = 8;
    private static final int MIN_SIZE_LOG = 3;
    private static final Object NO_MATCH_OLD;
    private static final int REPROBE_LIMIT = 10;
    private static final Prime TOMBPRIME;
    private static final Object TOMBSTONE;
    private static final int _Obase;
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

        private final void copy_check_and_promote(NonBlockingIdentityHashMap nonBlockingIdentityHashMap, Object[] objArr, int i) {
            int iLen = NonBlockingIdentityHashMap.len(objArr);
            long j = this._copyDone;
            if (i > 0) {
                while (!_copyDoneUpdater.compareAndSet(this, j, j + ((long) i))) {
                    j = this._copyDone;
                }
            }
            if (j + ((long) i) == iLen && nonBlockingIdentityHashMap._kvs == objArr && nonBlockingIdentityHashMap.CAS_kvs(objArr, this._newkvs)) {
                nonBlockingIdentityHashMap._last_resize_milli = System.currentTimeMillis();
            }
        }

        private boolean copy_slot(NonBlockingIdentityHashMap nonBlockingIdentityHashMap, int i, Object[] objArr, Object[] objArr2) {
            Object objKey;
            while (true) {
                objKey = NonBlockingIdentityHashMap.key(objArr, i);
                if (objKey != null) {
                    break;
                }
                NonBlockingIdentityHashMap.CAS_key(objArr, i, null, NonBlockingIdentityHashMap.TOMBSTONE);
            }
            Object objVal = NonBlockingIdentityHashMap.val(objArr, i);
            while (!(objVal instanceof Prime)) {
                Prime prime = (objVal == null || objVal == NonBlockingIdentityHashMap.TOMBSTONE) ? NonBlockingIdentityHashMap.TOMBPRIME : new Prime(objVal);
                if (NonBlockingIdentityHashMap.CAS_val(objArr, i, objVal, prime)) {
                    if (prime != NonBlockingIdentityHashMap.TOMBPRIME) {
                        objVal = prime;
                        break;
                    }
                    return true;
                }
                objVal = NonBlockingIdentityHashMap.val(objArr, i);
            }
            if (objVal == NonBlockingIdentityHashMap.TOMBPRIME) {
                return false;
            }
            NonBlockingIdentityHashMap.putIfMatch0(nonBlockingIdentityHashMap, objArr2, objKey, ((Prime) objVal)._V, null);
            while (objVal != NonBlockingIdentityHashMap.TOMBPRIME && !NonBlockingIdentityHashMap.CAS_val(objArr, i, objVal, NonBlockingIdentityHashMap.TOMBPRIME)) {
                objVal = NonBlockingIdentityHashMap.val(objArr, i);
            }
            return objVal != NonBlockingIdentityHashMap.TOMBPRIME;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object[] copy_slot_and_check(NonBlockingIdentityHashMap nonBlockingIdentityHashMap, Object[] objArr, int i, Object obj) {
            Object[] objArr2 = this._newkvs;
            if (copy_slot(nonBlockingIdentityHashMap, i, objArr, this._newkvs)) {
                copy_check_and_promote(nonBlockingIdentityHashMap, objArr, 1);
            }
            return obj == null ? objArr2 : nonBlockingIdentityHashMap.help_copy(objArr2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void help_copy_impl(NonBlockingIdentityHashMap nonBlockingIdentityHashMap, Object[] objArr, boolean z) {
            int i;
            int i2;
            Object[] objArr2 = this._newkvs;
            int iLen = NonBlockingIdentityHashMap.len(objArr);
            int iMin = Math.min(iLen, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
            int i3 = -1;
            int i4 = -9999;
            int i5 = -1;
            while (this._copyDone < iLen) {
                if (i5 == i3) {
                    int i6 = (int) this._copyIdx;
                    while (true) {
                        i = iLen << 1;
                        if (i6 >= i) {
                            i2 = i5;
                            break;
                        }
                        i2 = i5;
                        if (_copyIdxUpdater.compareAndSet(this, i6, i6 + iMin)) {
                            break;
                        }
                        i6 = (int) this._copyIdx;
                        i5 = i2;
                    }
                    i4 = i6;
                    i5 = i6 >= i ? i4 : i2;
                }
                int i7 = 0;
                for (int i8 = 0; i8 < iMin; i8++) {
                    if (copy_slot(nonBlockingIdentityHashMap, (i4 + i8) & (iLen - 1), objArr, objArr2)) {
                        i7++;
                    }
                }
                if (i7 > 0) {
                    copy_check_and_promote(nonBlockingIdentityHashMap, objArr, i7);
                }
                i4 += iMin;
                if (!z && i5 == -1) {
                    return;
                } else {
                    i3 = -1;
                }
            }
            copy_check_and_promote(nonBlockingIdentityHashMap, objArr, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object[] resize(NonBlockingIdentityHashMap nonBlockingIdentityHashMap, Object[] objArr) {
            int i;
            int i2;
            Object[] objArr2 = this._newkvs;
            if (objArr2 != null) {
                return objArr2;
            }
            int iLen = NonBlockingIdentityHashMap.len(objArr);
            int size = size();
            if (size >= (iLen >> 2)) {
                i = iLen << 1;
                if (size >= (iLen >> 1)) {
                    i = iLen << 2;
                }
            } else {
                i = size;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (i <= iLen && jCurrentTimeMillis <= nonBlockingIdentityHashMap._last_resize_milli + 10000 && this._slots.estimate_get() >= (size << 1)) {
                i = iLen << 1;
            }
            if (i >= iLen) {
                iLen = i;
            }
            int i3 = 3;
            while (true) {
                i2 = 1 << i3;
                if (i2 >= iLen) {
                    break;
                }
                i3++;
            }
            long j = this._resizers;
            while (!_resizerUpdater.compareAndSet(this, j, j + 1)) {
                j = this._resizers;
            }
            int i4 = i2 << 1;
            int i5 = ((i4 + 4) << 3) >> 20;
            if (j >= 2 && i5 > 0) {
                Object[] objArr3 = this._newkvs;
                if (objArr3 != null) {
                    return objArr3;
                }
                try {
                    Thread.sleep(((long) i5) * 8);
                } catch (Exception unused) {
                }
            }
            Object[] objArr4 = this._newkvs;
            if (objArr4 != null) {
                return objArr4;
            }
            Object[] objArr5 = new Object[i4 + 2];
            objArr5[0] = new CHM(this._size);
            objArr5[1] = new int[i2];
            if (this._newkvs != null) {
                return this._newkvs;
            }
            if (!CAS_newkvs(objArr5)) {
                return this._newkvs;
            }
            nonBlockingIdentityHashMap.rehash();
            return objArr5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean tableFull(int i, int i2) {
            return i >= 10 && this._slots.estimate_get() >= ((long) NonBlockingIdentityHashMap.reprobe_limit(i2));
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
            return (TypeV) NonBlockingIdentityHashMap.this.put(this._key, typev);
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
        final NonBlockingIdentityHashMap<TypeK, TypeV>.SnapshotV _ss;

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
        final NonBlockingIdentityHashMap<TypeK, TypeV>.SnapshotV _ss;

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
                Object[] objArr = NonBlockingIdentityHashMap.this._kvs;
                CHM chm = NonBlockingIdentityHashMap.chm(objArr);
                if (chm._newkvs == null) {
                    this._sskvs = objArr;
                    next();
                    return;
                }
                chm.help_copy_impl(NonBlockingIdentityHashMap.this, objArr, true);
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
            return NonBlockingIdentityHashMap.key(this._sskvs, i);
        }

        public int length() {
            return NonBlockingIdentityHashMap.len(this._sskvs);
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
                if (objKey != null && objKey != NonBlockingIdentityHashMap.TOMBSTONE) {
                    TypeV typev = (TypeV) NonBlockingIdentityHashMap.this.get(this._nextK);
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
            NonBlockingIdentityHashMap.this.putIfMatch(this._prevK, NonBlockingIdentityHashMap.TOMBSTONE, NonBlockingIdentityHashMap.NO_MATCH_OLD);
            this._prevV = null;
        }
    }

    static {
        Unsafe unsafe = UnsafeAccess.UNSAFE;
        _Obase = unsafe.arrayBaseOffset(Object[].class);
        _Oscale = unsafe.arrayIndexScale(Object[].class);
        _kvs_offset = UnsafeAccess.fieldOffset(NonBlockingHashMap.class, "_kvs");
        NO_MATCH_OLD = new Object();
        MATCH_ANY = new Object();
        Object obj = new Object();
        TOMBSTONE = obj;
        TOMBPRIME = new Prime(obj);
    }

    public NonBlockingIdentityHashMap() {
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

    private static final Object get_impl(NonBlockingIdentityHashMap nonBlockingIdentityHashMap, Object[] objArr, Object obj) {
        Object[] objArr2;
        int iHash = hash(obj);
        int iLen = len(objArr);
        CHM chm = chm(objArr);
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
            if (objKey == obj) {
                if (objVal instanceof Prime) {
                    return get_impl(nonBlockingIdentityHashMap, chm.copy_slot_and_check(nonBlockingIdentityHashMap, objArr, i2, obj), obj);
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
        return get_impl(nonBlockingIdentityHashMap, nonBlockingIdentityHashMap.help_copy(objArr2), obj);
    }

    private static final int hash(Object obj) {
        obj.getClass();
        return System.identityHashCode(obj);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object putIfMatch0(NonBlockingIdentityHashMap nonBlockingIdentityHashMap, Object[] objArr, Object obj, Object obj2, Object obj3) {
        Object objVal;
        Object obj4;
        int iHash = hash(obj);
        int iLen = len(objArr);
        CHM chm = chm(objArr);
        int i = iLen - 1;
        int i2 = iHash & i;
        int i3 = 0;
        Object[] objArrResize = null;
        while (true) {
            objVal = val(objArr, i2);
            Object objKey = key(objArr, i2);
            if (objKey == null) {
                Object obj5 = TOMBSTONE;
                if (obj2 == obj5) {
                    return obj5;
                }
                if (obj3 == MATCH_ANY) {
                    return obj5;
                }
                if (CAS_key(objArr, i2, null, obj)) {
                    chm._slots.add(1L);
                    break;
                }
                Object obj6 = NonBlockingHashMap.TOMBSTONE;
            } else {
                objArrResize = chm._newkvs;
                if (objKey == obj) {
                    break;
                }
                i3++;
                if (i3 >= reprobe_limit(iLen) || objKey == TOMBSTONE) {
                    Object[] objArrResize2 = chm.resize(nonBlockingIdentityHashMap, objArr);
                    if (obj3 != null) {
                        nonBlockingIdentityHashMap.help_copy(objArrResize2);
                    }
                    return putIfMatch0(nonBlockingIdentityHashMap, objArrResize2, obj, obj2, obj3);
                }
                i2 = (i2 + 1) & i;
            }
        }
        while (obj2 != objVal) {
            if (objArrResize == null && ((objVal == null && chm.tableFull(i3, iLen)) || (objVal instanceof Prime))) {
                objArrResize = chm.resize(nonBlockingIdentityHashMap, objArr);
            }
            if (objArrResize != null) {
                return putIfMatch0(nonBlockingIdentityHashMap, chm.copy_slot_and_check(nonBlockingIdentityHashMap, objArr, i2, obj3), obj, obj2, obj3);
            }
            if (obj3 != NO_MATCH_OLD && objVal != obj3 && ((obj3 != MATCH_ANY || objVal == TOMBSTONE || objVal == null) && ((objVal != null || obj3 != TOMBSTONE) && (obj3 == null || !obj3.equals(objVal))))) {
                return objVal == null ? TOMBSTONE : objVal;
            }
            if (CAS_val(objArr, i2, objVal, obj2)) {
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
            objVal = val(objArr, i2);
            if (objVal instanceof Prime) {
                return putIfMatch0(nonBlockingIdentityHashMap, chm.copy_slot_and_check(nonBlockingIdentityHashMap, objArr, i2, obj3), obj, obj2, obj3);
            }
            Object obj7 = NonBlockingHashMap.TOMBSTONE;
        }
        return objVal;
    }

    private static long rawIndex(Object[] objArr, int i) {
        return (((long) i) * ((long) _Oscale)) + ((long) _Obase);
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
    public static final int reprobe_limit(int i) {
        return (i >> 2) + 10;
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
        while (!CAS_kvs(this._kvs, new NonBlockingIdentityHashMap(8)._kvs)) {
        }
    }

    @Override // java.util.AbstractMap
    public Object clone() {
        try {
            NonBlockingIdentityHashMap nonBlockingIdentityHashMap = (NonBlockingIdentityHashMap) super.clone();
            nonBlockingIdentityHashMap.clear();
            for (TypeK typek : keySet()) {
                nonBlockingIdentityHashMap.put(typek, get(typek));
            }
            return nonBlockingIdentityHashMap;
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
        return new AbstractSet<Map.Entry<TypeK, TypeV>>() { // from class: org.jctools.maps.NonBlockingIdentityHashMap.3
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                NonBlockingIdentityHashMap.this.clear();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = NonBlockingIdentityHashMap.this.get(entry.getKey());
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
                return NonBlockingIdentityHashMap.this.remove(entry.getKey(), entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return NonBlockingIdentityHashMap.this.size();
            }
        };
    }

    @Override // java.util.AbstractMap, java.util.Map
    public TypeV get(Object obj) {
        return (TypeV) get_impl(this, this._kvs, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<TypeK> keySet() {
        return new AbstractSet<TypeK>() { // from class: org.jctools.maps.NonBlockingIdentityHashMap.2
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                NonBlockingIdentityHashMap.this.clear();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return NonBlockingIdentityHashMap.this.containsKey(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<TypeK> iterator() {
                return new SnapshotK();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                return NonBlockingIdentityHashMap.this.remove(obj) != null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return NonBlockingIdentityHashMap.this.size();
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
        return new AbstractCollection<TypeV>() { // from class: org.jctools.maps.NonBlockingIdentityHashMap.1
            @Override // java.util.AbstractCollection, java.util.Collection
            public void clear() {
                NonBlockingIdentityHashMap.this.clear();
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public boolean contains(Object obj) {
                return NonBlockingIdentityHashMap.this.containsValue(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            public Iterator<TypeV> iterator() {
                return new SnapshotV();
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public int size() {
                return NonBlockingIdentityHashMap.this.size();
            }
        };
    }

    public NonBlockingIdentityHashMap(int i) {
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
