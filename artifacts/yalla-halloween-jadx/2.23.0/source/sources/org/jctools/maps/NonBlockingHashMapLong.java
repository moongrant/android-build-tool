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
public class NonBlockingHashMapLong<TypeV> extends AbstractMap<Long, TypeV> implements ConcurrentMap<Long, TypeV>, Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object MATCH_ANY;
    private static final int MIN_SIZE = 16;
    private static final int MIN_SIZE_LOG = 4;
    private static final long NO_KEY = 0;
    private static final Object NO_MATCH_OLD;
    private static final int REPROBE_LIMIT = 10;
    private static final Prime TOMBPRIME;
    private static final Object TOMBSTONE;
    private static final int _Lbase;
    private static final int _Lscale;
    private static final int _Obase;
    private static final int _Oscale;
    private static final long _chm_offset;
    private static final long _val_1_offset;
    private static final long serialVersionUID = 1234123412341234124L;
    private transient CHM _chm;
    private transient long _last_resize_milli;
    private final boolean _opt_for_space;
    private transient Object _val_1;

    public static final class CHM implements Serializable {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        final long[] _keys;
        final NonBlockingHashMapLong _nbhml;
        volatile CHM _newchm;
        volatile long _resizers;
        private final ConcurrentAutoTable _size;
        final Object[] _vals;
        private static final AtomicReferenceFieldUpdater<CHM, CHM> _newchmUpdater = AtomicReferenceFieldUpdater.newUpdater(CHM.class, CHM.class, "_newchm");
        private static final AtomicLongFieldUpdater<CHM> _resizerUpdater = AtomicLongFieldUpdater.newUpdater(CHM.class, "_resizers");
        private static final AtomicLongFieldUpdater<CHM> _copyIdxUpdater = AtomicLongFieldUpdater.newUpdater(CHM.class, "_copyIdx");
        private static final AtomicLongFieldUpdater<CHM> _copyDoneUpdater = AtomicLongFieldUpdater.newUpdater(CHM.class, "_copyDone");
        volatile long _copyIdx = 0;
        volatile long _copyDone = 0;
        private final ConcurrentAutoTable _slots = new ConcurrentAutoTable();

        public CHM(NonBlockingHashMapLong nonBlockingHashMapLong, ConcurrentAutoTable concurrentAutoTable, int i) {
            this._nbhml = nonBlockingHashMapLong;
            this._size = concurrentAutoTable;
            int i2 = 1 << i;
            this._keys = new long[i2];
            this._vals = new Object[i2];
        }

        private boolean CAS_key(int i, long j, long j2) {
            Unsafe unsafe = UnsafeAccess.UNSAFE;
            long[] jArr = this._keys;
            return unsafe.compareAndSwapLong(jArr, NonBlockingHashMapLong.rawIndex(jArr, i), j, j2);
        }

        private boolean CAS_val(int i, Object obj, Object obj2) {
            Unsafe unsafe = UnsafeAccess.UNSAFE;
            Object[] objArr = this._vals;
            return OooO00o.OooO00o(unsafe, objArr, NonBlockingHashMapLong.rawIndex(objArr, i), obj, obj2);
        }

        private final void copy_check_and_promote(int i) {
            int length = this._keys.length;
            long j = this._copyDone;
            if (i > 0) {
                while (!_copyDoneUpdater.compareAndSet(this, j, j + ((long) i))) {
                    j = this._copyDone;
                }
            }
            if (j + ((long) i) == length && this._nbhml._chm == this && this._nbhml.CAS(NonBlockingHashMapLong._chm_offset, this, this._newchm)) {
                this._nbhml._last_resize_milli = System.currentTimeMillis();
            }
        }

        private boolean copy_slot(int i) {
            long j;
            while (true) {
                long[] jArr = this._keys;
                j = jArr[i];
                if (j != 0) {
                    break;
                }
                CAS_key(i, 0L, jArr.length + i);
            }
            Object obj = this._vals[i];
            while (!(obj instanceof Prime)) {
                Prime prime = (obj == null || obj == NonBlockingHashMapLong.TOMBSTONE) ? NonBlockingHashMapLong.TOMBPRIME : new Prime(obj);
                if (CAS_val(i, obj, prime)) {
                    if (prime != NonBlockingHashMapLong.TOMBPRIME) {
                        obj = prime;
                        break;
                    }
                    return true;
                }
                obj = this._vals[i];
            }
            if (obj == NonBlockingHashMapLong.TOMBPRIME) {
                return false;
            }
            this._newchm.putIfMatch(j, ((Prime) obj)._V, null);
            while (obj != NonBlockingHashMapLong.TOMBPRIME && !CAS_val(i, obj, NonBlockingHashMapLong.TOMBPRIME)) {
                obj = this._vals[i];
            }
            return obj != NonBlockingHashMapLong.TOMBPRIME;
        }

        private CHM copy_slot_and_check(int i, Object obj) {
            if (copy_slot(i)) {
                copy_check_and_promote(1);
            }
            if (obj != null) {
                this._nbhml.help_copy();
            }
            return this._newchm;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object get_impl(long j) {
            int length = this._keys.length;
            int i = length - 1;
            int i2 = (int) (((long) i) & j);
            int i3 = 0;
            while (true) {
                long j2 = this._keys[i2];
                Object obj = this._vals[i2];
                if (j2 == 0) {
                    return null;
                }
                if (j == j2) {
                    if (obj instanceof Prime) {
                        return copy_slot_and_check(i2, Long.valueOf(j)).get_impl(j);
                    }
                    if (obj == NonBlockingHashMapLong.TOMBSTONE) {
                        return null;
                    }
                    return obj;
                }
                i3++;
                if (i3 >= NonBlockingHashMapLong.reprobe_limit(length)) {
                    if (this._newchm == null) {
                        return null;
                    }
                    return copy_slot_and_check(i2, Long.valueOf(j)).get_impl(j);
                }
                i2 = (i2 + 1) & i;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void help_copy_impl(boolean z) {
            int length = this._keys.length;
            int iMin = Math.min(length, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
            int i = -9999;
            int i2 = -1;
            while (true) {
                if (this._copyDone >= length) {
                    copy_check_and_promote(0);
                    return;
                }
                if (i2 == -1) {
                    long j = this._copyIdx;
                    while (true) {
                        i = (int) j;
                        if (_copyIdxUpdater.compareAndSet(this, i, i + iMin)) {
                            break;
                        } else {
                            j = this._copyIdx;
                        }
                    }
                    if (i >= (length << 1)) {
                        i2 = i;
                    }
                }
                int i3 = 0;
                for (int i4 = 0; i4 < iMin; i4++) {
                    if (copy_slot((i + i4) & (length - 1))) {
                        i3++;
                    }
                }
                if (i3 > 0) {
                    copy_check_and_promote(i3);
                }
                i += iMin;
                if (!z && i2 == -1) {
                    return;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void print() {
            int i = 0;
            while (true) {
                long[] jArr = this._keys;
                if (i >= jArr.length) {
                    break;
                }
                long j = jArr[i];
                if (j != 0) {
                    NonBlockingHashMapLong.print_impl(i, j, this._vals[i]);
                }
                i++;
            }
            CHM chm = this._newchm;
            if (chm != null) {
                System.out.println("----");
                chm.print();
            }
        }

        private void print2() {
            int i = 0;
            while (true) {
                long[] jArr = this._keys;
                if (i >= jArr.length) {
                    break;
                }
                long j = jArr[i];
                if (j != 0) {
                    NonBlockingHashMapLong.print2_impl(i, j, this._vals[i]);
                }
                i++;
            }
            CHM chm = this._newchm;
            if (chm != null) {
                System.out.println("----");
                chm.print2();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object putIfMatch(long j, Object obj, Object obj2) {
            Object obj3;
            int i;
            long j2;
            Object obj4 = obj2;
            int length = this._keys.length;
            int i2 = length - 1;
            int i3 = (int) (((long) i2) & j);
            int i4 = 0;
            while (true) {
                obj3 = this._vals[i3];
                long j3 = this._keys[i3];
                if (j3 == 0) {
                    if (obj != NonBlockingHashMapLong.TOMBSTONE && obj4 != NonBlockingHashMapLong.MATCH_ANY) {
                        i = length;
                        j2 = 1;
                        if (CAS_key(i3, 0L, j)) {
                            this._slots.add(1L);
                            break;
                        }
                        j3 = this._keys[i3];
                    }
                    return NonBlockingHashMapLong.TOMBSTONE;
                }
                i = length;
                j2 = 1;
                if (j3 == j) {
                    break;
                }
                int i5 = i;
                i4++;
                if (i4 >= NonBlockingHashMapLong.reprobe_limit(i5)) {
                    CHM chmResize = resize();
                    if (obj2 != null) {
                        this._nbhml.help_copy();
                    }
                    return chmResize.putIfMatch(j, obj, obj2);
                }
                i3 = (i3 + 1) & i2;
                length = i5;
                obj4 = obj2;
            }
            while (obj != obj3) {
                int i6 = i;
                if ((obj3 == null && tableFull(i4, i6)) || (obj3 instanceof Prime)) {
                    resize();
                    return copy_slot_and_check(i3, obj2).putIfMatch(j, obj, obj2);
                }
                long j4 = j2;
                if (obj2 != NonBlockingHashMapLong.NO_MATCH_OLD && obj3 != obj2 && ((obj2 != NonBlockingHashMapLong.MATCH_ANY || obj3 == NonBlockingHashMapLong.TOMBSTONE || obj3 == null) && ((obj3 != null || obj2 != NonBlockingHashMapLong.TOMBSTONE) && (obj2 == null || !obj2.equals(obj3))))) {
                    return obj3 == null ? NonBlockingHashMapLong.TOMBSTONE : obj3;
                }
                if (CAS_val(i3, obj3, obj)) {
                    if (obj2 != null) {
                        if ((obj3 == null || obj3 == NonBlockingHashMapLong.TOMBSTONE) && obj != NonBlockingHashMapLong.TOMBSTONE) {
                            this._size.add(j4);
                        }
                        if (obj3 != null && obj3 != NonBlockingHashMapLong.TOMBSTONE && obj == NonBlockingHashMapLong.TOMBSTONE) {
                            this._size.add(-1L);
                        }
                    }
                    return (obj3 != null || obj2 == null) ? obj3 : NonBlockingHashMapLong.TOMBSTONE;
                }
                obj3 = this._vals[i3];
                if (obj3 instanceof Prime) {
                    return copy_slot_and_check(i3, obj2).putIfMatch(j, obj, obj2);
                }
                Object obj5 = NonBlockingHashMap.TOMBSTONE;
                i = i6;
                j2 = j4;
            }
            return obj3;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0028  */
        private final CHM resize() {
            int i;
            CHM chm = this._newchm;
            if (chm != null) {
                return chm;
            }
            int length = this._keys.length;
            int size = size();
            if (this._nbhml._opt_for_space) {
                if (size >= (length >> 1)) {
                    i = length << 1;
                } else {
                    i = size;
                }
            } else if (size >= (length >> 2)) {
                i = length << 1;
                if (size >= (length >> 1)) {
                    i = length << 2;
                }
            } else {
                i = size;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (i <= length && jCurrentTimeMillis <= this._nbhml._last_resize_milli + 10000) {
                i = length << 1;
            }
            if (i >= length) {
                length = i;
            }
            int i2 = 4;
            while ((1 << i2) < length) {
                i2++;
            }
            long j = ((1 << i2) << 1) + 2;
            if (((int) j) != j) {
                if (size > 805306369) {
                    throw new RuntimeException("Table is full.");
                }
                i2 = 30;
            }
            int i3 = i2;
            long j2 = this._resizers;
            while (!_resizerUpdater.compareAndSet(this, j2, j2 + 1)) {
                j2 = this._resizers;
            }
            long j3 = ((((1 << i3) << 1) + 8) << 3) >> 20;
            if (j2 >= 2 && j3 > 0) {
                CHM chm2 = this._newchm;
                if (chm2 != null) {
                    return chm2;
                }
                try {
                    Thread.sleep(j3);
                } catch (Exception unused) {
                }
            }
            CHM chm3 = this._newchm;
            if (chm3 != null) {
                return chm3;
            }
            CHM chm4 = new CHM(this._nbhml, this._size, i3);
            if (this._newchm != null) {
                return this._newchm;
            }
            return CAS_newchm(chm4) ? chm4 : this._newchm;
        }

        private final boolean tableFull(int i, int i2) {
            return i >= 10 && (i >= NonBlockingHashMapLong.reprobe_limit(i2) || this._slots.estimate_get() >= ((long) (i2 >> 1)));
        }

        public boolean CAS_newchm(CHM chm) {
            AtomicReferenceFieldUpdater<CHM, CHM> atomicReferenceFieldUpdater = _newchmUpdater;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, chm)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    return false;
                }
            }
            return true;
        }

        public int size() {
            return (int) this._size.get();
        }

        public int slots() {
            return (int) this._slots.get();
        }
    }

    public class IteratorLong implements Iterator<Long>, Enumeration<Long> {
        private final NonBlockingHashMapLong<TypeV>.SnapshotV _ss;

        public IteratorLong() {
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

        public long nextLong() {
            this._ss.next();
            return ((SnapshotV) this._ss)._prevK;
        }

        @Override // java.util.Iterator
        public void remove() {
            this._ss.removeKey();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public Long next() {
            this._ss.next();
            return Long.valueOf(((SnapshotV) this._ss)._prevK);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Enumeration
        public Long nextElement() {
            return next();
        }
    }

    public class NBHMLEntry extends AbstractEntry<Long, TypeV> {
        public NBHMLEntry(Long l, TypeV typev) {
            super(l, typev);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Map.Entry
        public TypeV setValue(TypeV typev) {
            typev.getClass();
            this._val = typev;
            return (TypeV) NonBlockingHashMapLong.this.put((Long) this._key, (Object) typev);
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

    public class SnapshotE implements Iterator<Map.Entry<Long, TypeV>> {
        final NonBlockingHashMapLong<TypeV>.SnapshotV _ss;

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
        public Map.Entry<Long, TypeV> next() {
            this._ss.next();
            return new NBHMLEntry(Long.valueOf(((SnapshotV) this._ss)._prevK), ((SnapshotV) this._ss)._prevV);
        }
    }

    public class SnapshotV implements Iterator<TypeV>, Enumeration<TypeV> {
        private int _idx;
        private long _nextK;
        private TypeV _nextV;
        private long _prevK;
        private TypeV _prevV;
        final CHM _sschm;

        public SnapshotV() {
            while (true) {
                CHM chm = NonBlockingHashMapLong.this._chm;
                if (chm._newchm == null) {
                    this._sschm = chm;
                    this._idx = -1;
                    next();
                    return;
                }
                chm.help_copy_impl(true);
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

        public long key(int i) {
            return this._sschm._keys[i];
        }

        public int length() {
            return this._sschm._keys.length;
        }

        @Override // java.util.Iterator
        public TypeV next() {
            int i = this._idx;
            if (i != -1 && this._nextV == null) {
                throw new NoSuchElementException();
            }
            this._prevK = this._nextK;
            this._prevV = this._nextV;
            this._nextV = null;
            if (i == -1) {
                this._idx = 0;
                this._nextK = 0L;
                TypeV typev = (TypeV) NonBlockingHashMapLong.this.get(0L);
                this._nextV = typev;
                if (typev != null) {
                    return this._prevV;
                }
            }
            while (this._idx < length()) {
                int i2 = this._idx;
                this._idx = i2 + 1;
                long jKey = key(i2);
                this._nextK = jKey;
                if (jKey != 0) {
                    TypeV typev2 = (TypeV) NonBlockingHashMapLong.this.get(jKey);
                    this._nextV = typev2;
                    if (typev2 != null) {
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
            NonBlockingHashMapLong.this.putIfMatch(this._prevK, NonBlockingHashMapLong.TOMBSTONE, NonBlockingHashMapLong.NO_MATCH_OLD);
            this._prevV = null;
        }
    }

    static {
        Unsafe unsafe = UnsafeAccess.UNSAFE;
        _Obase = unsafe.arrayBaseOffset(Object[].class);
        _Oscale = unsafe.arrayIndexScale(Object[].class);
        _Lbase = unsafe.arrayBaseOffset(long[].class);
        _Lscale = unsafe.arrayIndexScale(long[].class);
        _chm_offset = UnsafeAccess.fieldOffset(NonBlockingHashMapLong.class, "_chm");
        _val_1_offset = UnsafeAccess.fieldOffset(NonBlockingHashMapLong.class, "_val_1");
        NO_MATCH_OLD = new Object();
        MATCH_ANY = new Object();
        Object obj = new Object();
        TOMBSTONE = obj;
        TOMBPRIME = new Prime(obj);
    }

    public NonBlockingHashMapLong() {
        this(16, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean CAS(long j, Object obj, Object obj2) {
        return OooO00o.OooO00o(UnsafeAccess.UNSAFE, this, j, obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void help_copy() {
        CHM chm = this._chm;
        if (chm._newchm == null) {
            return;
        }
        chm.help_copy_impl(false);
    }

    private void initialize(int i) {
        RangeUtil.checkPositiveOrZero(i, "initial_sz");
        int i2 = 4;
        while ((1 << i2) < i) {
            i2++;
        }
        this._chm = new CHM(this, new ConcurrentAutoTable(), i2);
        this._val_1 = TOMBSTONE;
        this._last_resize_milli = System.currentTimeMillis();
    }

    private void print2() {
        System.out.println("=========");
        print2_impl(-99, 0L, this._val_1);
        this._chm.print();
        System.out.println("=========");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void print2_impl(int i, long j, Object obj) {
        if (obj == null || Prime.unbox(obj) == TOMBSTONE) {
            return;
        }
        print_impl(i, j, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void print_impl(int i, long j, Object obj) {
        String str = obj instanceof Prime ? "prime_" : "";
        Object objUnbox = Prime.unbox(obj);
        String string = objUnbox == TOMBSTONE ? "tombstone" : objUnbox.toString();
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder("[");
        sb.append(i);
        sb.append("]=(");
        sb.append(j);
        printStream.println(androidx.compose.material.OooO00o.OooO0O0(sb, ",", str, string, ")"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TypeV putIfMatch(long j, Object obj, Object obj2) {
        if (obj2 == null || obj == null) {
            throw null;
        }
        if (j != 0) {
            TypeV typev = (TypeV) this._chm.putIfMatch(j, obj, obj2);
            if (typev == TOMBSTONE) {
                return null;
            }
            return typev;
        }
        Object obj3 = this._val_1;
        if ((obj2 == NO_MATCH_OLD || obj3 == obj2 || ((obj2 == MATCH_ANY && obj3 != TOMBSTONE) || obj2.equals(obj3))) && !CAS(_val_1_offset, obj3, obj)) {
            obj3 = this._val_1;
        }
        if (obj3 == TOMBSTONE) {
            return null;
        }
        return (TypeV) obj3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long rawIndex(Object[] objArr, int i) {
        return (((long) i) * ((long) _Oscale)) + ((long) _Obase);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        initialize(16);
        while (true) {
            long j = objectInputStream.readLong();
            Object object = objectInputStream.readObject();
            if (j == 0 && object == null) {
                return;
            } else {
                put(j, object);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int reprobe_limit(int i) {
        return (i >> 4) + 10;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Iterator<Long> it = keySet().iterator();
        while (it.hasNext()) {
            long jLongValue = it.next().longValue();
            TypeV typev = get(jLongValue);
            objectOutputStream.writeLong(jLongValue);
            objectOutputStream.writeObject(typev);
        }
        objectOutputStream.writeLong(0L);
        objectOutputStream.writeObject(null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        while (!CAS(_chm_offset, this._chm, new CHM(this, new ConcurrentAutoTable(), 4))) {
        }
        CAS(_val_1_offset, this._val_1, TOMBSTONE);
    }

    public boolean contains(Object obj) {
        return containsValue(obj);
    }

    public boolean containsKey(long j) {
        return get(j) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this._val_1) {
            return true;
        }
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
    public Set<Map.Entry<Long, TypeV>> entrySet() {
        return new AbstractSet<Map.Entry<Long, TypeV>>() { // from class: org.jctools.maps.NonBlockingHashMapLong.3
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                NonBlockingHashMapLong.this.clear();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = NonBlockingHashMapLong.this.get(entry.getKey());
                return obj2 != null && obj2.equals(entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<Long, TypeV>> iterator() {
                return new SnapshotE();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return NonBlockingHashMapLong.this.remove(entry.getKey(), entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return NonBlockingHashMapLong.this.size();
            }
        };
    }

    public final TypeV get(long j) {
        if (j != 0) {
            return (TypeV) this._chm.get_impl(j);
        }
        TypeV typev = (TypeV) this._val_1;
        if (typev == TOMBSTONE) {
            return null;
        }
        return typev;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Long> keySet() {
        return new AbstractSet<Long>() { // from class: org.jctools.maps.NonBlockingHashMapLong.2
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                NonBlockingHashMapLong.this.clear();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return NonBlockingHashMapLong.this.containsKey(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                return NonBlockingHashMapLong.this.remove(obj) != null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return NonBlockingHashMapLong.this.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public NonBlockingHashMapLong<TypeV>.IteratorLong iterator() {
                return new IteratorLong();
            }
        };
    }

    public long[] keySetLong() {
        int size = size();
        long[] jArr = new long[size];
        IteratorLong iteratorLong = (IteratorLong) keySet().iterator();
        for (int i = 0; i < size && iteratorLong.hasNext(); i++) {
            jArr[i] = iteratorLong.nextLong();
        }
        return jArr;
    }

    public Enumeration<Long> keys() {
        return new IteratorLong();
    }

    public final void print() {
        System.out.println("=========");
        print_impl(-99, 0L, this._val_1);
        this._chm.print();
        System.out.println("=========");
    }

    public TypeV remove(long j) {
        return putIfMatch(j, TOMBSTONE, NO_MATCH_OLD);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return (this._val_1 == TOMBSTONE ? 0 : 1) + this._chm.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<TypeV> values() {
        return new AbstractCollection<TypeV>() { // from class: org.jctools.maps.NonBlockingHashMapLong.1
            @Override // java.util.AbstractCollection, java.util.Collection
            public void clear() {
                NonBlockingHashMapLong.this.clear();
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public boolean contains(Object obj) {
                return NonBlockingHashMapLong.this.containsValue(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            public Iterator<TypeV> iterator() {
                return new SnapshotV();
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public int size() {
                return NonBlockingHashMapLong.this.size();
            }
        };
    }

    public NonBlockingHashMapLong(int i) {
        this(i, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long rawIndex(long[] jArr, int i) {
        return (((long) i) * ((long) _Lscale)) + ((long) _Lbase);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return (obj instanceof Long) && containsKey(((Long) obj).longValue());
    }

    public TypeV put(long j, TypeV typev) {
        return putIfMatch(j, typev, NO_MATCH_OLD);
    }

    public TypeV putIfAbsent(long j, TypeV typev) {
        return putIfMatch(j, typev, TOMBSTONE);
    }

    public boolean remove(long j, Object obj) {
        return putIfMatch(j, TOMBSTONE, obj) == obj;
    }

    public NonBlockingHashMapLong(boolean z) {
        this(1, z);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public TypeV put(Long l, TypeV typev) {
        return put(l.longValue(), typev);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public TypeV putIfAbsent(Long l, TypeV typev) {
        return putIfAbsent(l.longValue(), typev);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public TypeV remove(Object obj) {
        if (obj instanceof Long) {
            return remove(((Long) obj).longValue());
        }
        return null;
    }

    public TypeV replace(long j, TypeV typev) {
        return putIfMatch(j, typev, MATCH_ANY);
    }

    public NonBlockingHashMapLong(int i, boolean z) {
        this._opt_for_space = z;
        initialize(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public TypeV get(Object obj) {
        if (obj instanceof Long) {
            return get(((Long) obj).longValue());
        }
        return null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        return (obj instanceof Long) && remove(((Long) obj).longValue(), obj2);
    }

    public boolean replace(long j, TypeV typev, TypeV typev2) {
        return putIfMatch(j, typev2, typev) == typev;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public TypeV replace(Long l, TypeV typev) {
        return replace(l.longValue(), typev);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(Long l, TypeV typev, TypeV typev2) {
        return replace(l.longValue(), typev, typev2);
    }
}
