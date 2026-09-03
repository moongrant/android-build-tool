package p334o0OO00o;

import com.app.base.protobuf.OooO00o;
import com.google.android.gms.internal.measurement.zzkk;
import com.google.android.gms.internal.measurement.zzkm;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import p100o000oOoO.o00O00OO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O000o0 extends o00OO000 implements RandomAccess, zzkk, o0O0O0Oo {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final o0O000o0 f37363Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public long[] f37364Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f37365Oooo0oo;

    static {
        o0O000o0 o0o000o1 = new o0O000o0(new long[0], 0);
        f37363Oooo = o0o000o1;
        o0o000o1.zzb();
    }

    public o0O000o0() {
        this(new long[10], 0);
    }

    public final void OooO0O0(long j) {
        OooO00o();
        int i = this.f37365Oooo0oo;
        long[] jArr = this.f37364Oooo0oO;
        if (i == jArr.length) {
            long[] jArr2 = new long[OooO00o.OooO00o(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f37364Oooo0oO = jArr2;
        }
        long[] jArr3 = this.f37364Oooo0oO;
        int i2 = this.f37365Oooo0oo;
        this.f37365Oooo0oo = i2 + 1;
        jArr3[i2] = j;
    }

    public final String OooO0OO(int i) {
        return o00O00OO.OooO00o("Index:", i, ", Size:", this.f37365Oooo0oo);
    }

    public final void OooO0o0(int i) {
        if (i < 0 || i >= this.f37365Oooo0oo) {
            throw new IndexOutOfBoundsException(OooO0OO(i));
        }
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        OooO00o();
        if (i < 0 || i > (i2 = this.f37365Oooo0oo)) {
            throw new IndexOutOfBoundsException(OooO0OO(i));
        }
        long[] jArr = this.f37364Oooo0oO;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[OooO00o.OooO00o(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f37364Oooo0oO, i, jArr2, i + 1, this.f37365Oooo0oo - i);
            this.f37364Oooo0oO = jArr2;
        }
        this.f37364Oooo0oO[i] = jLongValue;
        this.f37365Oooo0oo++;
        ((AbstractList) this).modCount++;
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        OooO00o();
        Charset charset = zzkm.f15980OooO00o;
        Objects.requireNonNull(collection);
        if (!(collection instanceof o0O000o0)) {
            return super.addAll(collection);
        }
        o0O000o0 o0o000o1 = (o0O000o0) collection;
        int i = o0o000o1.f37365Oooo0oo;
        if (i == 0) {
            return false;
        }
        int i2 = this.f37365Oooo0oo;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f37364Oooo0oO;
        if (i3 > jArr.length) {
            this.f37364Oooo0oO = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(o0o000o1.f37364Oooo0oO, 0, this.f37364Oooo0oO, this.f37365Oooo0oo, o0o000o1.f37365Oooo0oo);
        this.f37365Oooo0oo = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0O000o0)) {
            return super.equals(obj);
        }
        o0O000o0 o0o000o1 = (o0O000o0) obj;
        if (this.f37365Oooo0oo != o0o000o1.f37365Oooo0oo) {
            return false;
        }
        long[] jArr = o0o000o1.f37364Oooo0oO;
        for (int i = 0; i < this.f37365Oooo0oo; i++) {
            if (this.f37364Oooo0oO[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        OooO0o0(i);
        return Long.valueOf(this.f37364Oooo0oO[i]);
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZzc = 1;
        for (int i = 0; i < this.f37365Oooo0oo; i++) {
            iZzc = (iZzc * 31) + zzkm.zzc(this.f37364Oooo0oO[i]);
        }
        return iZzc;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.f37365Oooo0oo;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f37364Oooo0oO[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        OooO00o();
        OooO0o0(i);
        long[] jArr = this.f37364Oooo0oO;
        long j = jArr[i];
        int i2 = this.f37365Oooo0oo;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f37365Oooo0oo--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        OooO00o();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f37364Oooo0oO;
        System.arraycopy(jArr, i2, jArr, i, this.f37365Oooo0oo - i2);
        this.f37365Oooo0oo -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        OooO00o();
        OooO0o0(i);
        long[] jArr = this.f37364Oooo0oO;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37365Oooo0oo;
    }

    @Override // com.google.android.gms.internal.measurement.zzkk
    public final long zza(int i) {
        OooO0o0(i);
        return this.f37364Oooo0oO[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzkl
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzkk zzd(int i) {
        if (i >= this.f37365Oooo0oo) {
            return new o0O000o0(Arrays.copyOf(this.f37364Oooo0oO, i), this.f37365Oooo0oo);
        }
        throw new IllegalArgumentException();
    }

    public o0O000o0(long[] jArr, int i) {
        this.f37364Oooo0oO = jArr;
        this.f37365Oooo0oo = i;
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        OooO0O0(((Long) obj).longValue());
        return true;
    }
}
