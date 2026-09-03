package org.jctools.maps;

import com.zego.zegoavkit2.ZegoConstants;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.io.ConstantsKt;
import org.jctools.util.RangeUtil;
import org.jctools.util.UnsafeAccess;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes5.dex */
public class NonBlockingSetInt extends AbstractSet<Integer> implements Serializable {
    private static final long _nbsi_offset = UnsafeAccess.fieldOffset(NonBlockingSetInt.class, "_nbsi");
    private static final long serialVersionUID = 1234123412341234123L;
    private transient NBSI _nbsi = new NBSI(63, new ConcurrentAutoTable(), this);

    public static final class NBSI {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final int _Lbase;
        private static final int _Lscale;
        private static final long _new_offset;
        private final long[] _bits;
        private final transient AtomicInteger _copyDone;
        private final transient AtomicInteger _copyIdx;
        private final NBSI _nbsi64;
        private NBSI _new;
        private final transient NonBlockingSetInt _non_blocking_set_int;
        private final transient ConcurrentAutoTable _size;
        private final transient int _sum_bits_length;

        static {
            Unsafe unsafe = UnsafeAccess.UNSAFE;
            _Lbase = unsafe.arrayBaseOffset(long[].class);
            _Lscale = unsafe.arrayIndexScale(long[].class);
            _new_offset = UnsafeAccess.fieldOffset(NBSI.class, "_new");
        }

        private final boolean CAS(int i, long j, long j2) {
            Unsafe unsafe = UnsafeAccess.UNSAFE;
            long[] jArr = this._bits;
            return unsafe.compareAndSwapLong(jArr, rawIndex(jArr, i), j, j2);
        }

        private final boolean CAS_new(NBSI nbsi) {
            return OooO0O0.OooO00o(UnsafeAccess.UNSAFE, this, _new_offset, nbsi);
        }

        private NBSI help_copy() {
            NBSI nbsi = this._non_blocking_set_int._nbsi;
            int andAdd = nbsi._copyIdx.getAndAdd(ConstantsKt.MINIMUM_BLOCK_SIZE);
            for (int i = 0; i < 8; i++) {
                int length = ((i * 64) + andAdd) % (nbsi._bits.length << 6);
                nbsi.help_copy_impl(length);
                nbsi.help_copy_impl(length + 63);
            }
            if (nbsi._copyDone.get() == nbsi._sum_bits_length) {
                this._non_blocking_set_int.CAS_nbsi(nbsi, nbsi._new);
            }
            return this._new;
        }

        private NBSI help_copy_impl(int i) {
            long jMask;
            NBSI nbsi = this._new;
            if (nbsi == null) {
                return this;
            }
            NBSI nbsi2 = this;
            NBSI nbsi3 = nbsi;
            int i2 = i;
            while ((i2 & 63) == 63) {
                nbsi2 = nbsi2._nbsi64;
                nbsi3 = nbsi3._nbsi64;
                i2 >>= 6;
            }
            int i3 = i2 >> 6;
            long j = nbsi2._bits[i3];
            while (true) {
                if (j < 0) {
                    jMask = j;
                    break;
                }
                jMask = j | mask(63);
                if (nbsi2.CAS(i3, j, jMask)) {
                    if (j != 0) {
                        break;
                    }
                    this._copyDone.addAndGet(1);
                    break;
                }
                j = nbsi2._bits[i3];
            }
            if (jMask != mask(63)) {
                if (nbsi3._bits[i3] == 0) {
                    if (!nbsi3.CAS(i3, 0L, jMask & (~mask(63)))) {
                        long j2 = nbsi3._bits[i3];
                    }
                }
                if (nbsi2.CAS(i3, jMask, mask(63))) {
                    this._copyDone.addAndGet(1);
                }
            }
            return this;
        }

        private NBSI install_larger_new_bits(int i) {
            if (this._new == null) {
                CAS_new(new NBSI((this._bits.length << 6) << 1, this._size, this._non_blocking_set_int));
            }
            return this;
        }

        private static final long mask(int i) {
            return 1 << (i & 63);
        }

        private void print(int i, String str) {
            for (int i2 = 0; i2 < i; i2++) {
                System.out.print("  ");
            }
            System.out.println(str);
        }

        private static long rawIndex(long[] jArr, int i) {
            return (((long) i) * ((long) _Lscale)) + ((long) _Lbase);
        }

        public boolean add(int i) {
            int i2;
            long j;
            if ((i >> 6) >= this._bits.length) {
                return install_larger_new_bits(i).help_copy().add(i);
            }
            NBSI nbsi = this;
            int i3 = i;
            while ((i3 & 63) == 63) {
                nbsi = nbsi._nbsi64;
                i3 >>= 6;
            }
            long jMask = mask(i3);
            do {
                i2 = i3 >> 6;
                j = nbsi._bits[i2];
                if (j < 0) {
                    return help_copy_impl(i).help_copy().add(i);
                }
                if ((j & jMask) != 0) {
                    return false;
                }
            } while (!nbsi.CAS(i2, j, j | jMask));
            this._size.add(1L);
            return true;
        }

        public boolean contains(int i) {
            if ((i >> 6) >= this._bits.length) {
                return this._new != null && help_copy().contains(i);
            }
            NBSI nbsi = this;
            int i2 = i;
            while ((i2 & 63) == 63) {
                nbsi = nbsi._nbsi64;
                i2 >>= 6;
            }
            long jMask = mask(i2);
            long j = nbsi._bits[i2 >> 6];
            if (j < 0) {
                return help_copy_impl(i).help_copy().contains(i);
            }
            return (j & jMask) != 0;
        }

        public boolean remove(int i) {
            int i2;
            long j;
            if ((i >> 6) >= this._bits.length) {
                return this._new != null && help_copy().remove(i);
            }
            NBSI nbsi = this;
            int i3 = i;
            while ((i3 & 63) == 63) {
                nbsi = nbsi._nbsi64;
                i3 >>= 6;
            }
            long jMask = mask(i3);
            do {
                i2 = i3 >> 6;
                j = nbsi._bits[i2];
                if (j < 0) {
                    return help_copy_impl(i).help_copy().remove(i);
                }
                if ((j & jMask) == 0) {
                    return false;
                }
            } while (!nbsi.CAS(i2, j, (~jMask) & j));
            this._size.add(-1L);
            return true;
        }

        public int size() {
            return (int) this._size.get();
        }

        private NBSI(int i, ConcurrentAutoTable concurrentAutoTable, NonBlockingSetInt nonBlockingSetInt) {
            this._non_blocking_set_int = nonBlockingSetInt;
            this._size = concurrentAutoTable;
            this._copyIdx = concurrentAutoTable == null ? null : new AtomicInteger();
            this._copyDone = concurrentAutoTable == null ? null : new AtomicInteger();
            long[] jArr = new long[(int) ((((long) i) + 63) >>> 6)];
            this._bits = jArr;
            int i2 = (i + 1) >>> 6;
            NBSI nbsi = i2 != 0 ? new NBSI(i2, null, null) : null;
            this._nbsi64 = nbsi;
            this._sum_bits_length = jArr.length + (nbsi == null ? 0 : nbsi._sum_bits_length);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void print(int i) {
            StringBuilder sb = new StringBuilder("NBSI - _bits.len=");
            for (NBSI nbsi = this; nbsi != null; nbsi = nbsi._nbsi64) {
                sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream + nbsi._bits.length);
            }
            print(i, sb.toString());
            NBSI nbsi2 = this;
            while (nbsi2 != null) {
                for (int i2 = 0; i2 < nbsi2._bits.length; i2++) {
                    System.out.print(Long.toHexString(nbsi2._bits[i2]) + ZegoConstants.ZegoVideoDataAuxPublishingStream);
                }
                nbsi2 = nbsi2._nbsi64;
                System.out.println();
            }
            if (this._copyIdx.get() != 0 || this._copyDone.get() != 0) {
                print(i, "_copyIdx=" + this._copyIdx.get() + " _copyDone=" + this._copyDone.get() + " _words_to_cpy=" + this._sum_bits_length);
            }
            if (this._new != null) {
                print(i, "__has_new - ");
                this._new.print(i + 1);
            }
        }
    }

    public class iter implements Iterator<Integer> {
        NBSI _nbsi2;
        int _idx = -1;
        int _prev = -1;

        public iter() {
            this._nbsi2 = NonBlockingSetInt.this._nbsi;
            advance();
        }

        private void advance() {
            do {
                this._idx++;
                while ((this._idx >> 6) >= this._nbsi2._bits.length) {
                    if (this._nbsi2._new == null) {
                        this._idx = -2;
                        return;
                    }
                    this._nbsi2 = this._nbsi2._new;
                }
            } while (!this._nbsi2.contains(this._idx));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this._idx != -2;
        }

        @Override // java.util.Iterator
        public void remove() {
            int i = this._prev;
            if (i == -1) {
                throw new IllegalStateException();
            }
            this._nbsi2.remove(i);
            this._prev = -1;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public Integer next() {
            int i = this._idx;
            if (i == -1) {
                throw new NoSuchElementException();
            }
            this._prev = i;
            advance();
            return Integer.valueOf(this._prev);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean CAS_nbsi(NBSI nbsi, NBSI nbsi2) {
        return OooO00o.OooO00o(UnsafeAccess.UNSAFE, this, _nbsi_offset, nbsi, nbsi2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        this._nbsi = new NBSI(i, new ConcurrentAutoTable(), this);
        for (int i2 = 0; i2 < i; i2++) {
            if (objectInputStream.readBoolean()) {
                this._nbsi.add(i2);
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int length = this._nbsi._bits.length << 6;
        objectOutputStream.writeInt(length);
        for (int i = 0; i < length; i++) {
            objectOutputStream.writeBoolean(this._nbsi.contains(i));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        while (!CAS_nbsi(this._nbsi, new NBSI(63, new ConcurrentAutoTable(), this))) {
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return (obj instanceof Integer) && contains(((Integer) obj).intValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Integer> iterator() {
        return new iter();
    }

    public int length() {
        return this._nbsi._bits.length << 6;
    }

    public void print() {
        this._nbsi.print(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return (obj instanceof Integer) && remove(((Integer) obj).intValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this._nbsi.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Integer num) {
        return add(num.intValue());
    }

    public boolean contains(int i) {
        return i >= 0 && this._nbsi.contains(i);
    }

    public boolean remove(int i) {
        return i >= 0 && this._nbsi.remove(i);
    }

    public boolean add(int i) {
        RangeUtil.checkPositiveOrZero(i, "i");
        return this._nbsi.add(i);
    }
}
