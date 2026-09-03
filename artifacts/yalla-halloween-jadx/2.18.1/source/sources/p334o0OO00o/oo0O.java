package p334o0OO00o;

import com.app.base.protobuf.OooO00o;
import com.google.android.gms.internal.measurement.zzkl;
import com.google.android.gms.internal.measurement.zzkm;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import p100o000oOoO.o00O00OO;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0O extends o00OO000 implements RandomAccess, o0O0O0Oo {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean[] f37458Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f37459Oooo0oo;

    static {
        new oo0O(new boolean[0], 0).zzb();
    }

    public oo0O() {
        this(new boolean[10], 0);
    }

    public final void OooO0O0(boolean z) {
        OooO00o();
        int i = this.f37459Oooo0oo;
        boolean[] zArr = this.f37458Oooo0oO;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[OooO00o.OooO00o(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f37458Oooo0oO = zArr2;
        }
        boolean[] zArr3 = this.f37458Oooo0oO;
        int i2 = this.f37459Oooo0oo;
        this.f37459Oooo0oo = i2 + 1;
        zArr3[i2] = z;
    }

    public final String OooO0OO(int i) {
        return o00O00OO.OooO00o("Index:", i, ", Size:", this.f37459Oooo0oo);
    }

    public final void OooO0o0(int i) {
        if (i < 0 || i >= this.f37459Oooo0oo) {
            throw new IndexOutOfBoundsException(OooO0OO(i));
        }
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        OooO00o();
        if (i < 0 || i > (i2 = this.f37459Oooo0oo)) {
            throw new IndexOutOfBoundsException(OooO0OO(i));
        }
        boolean[] zArr = this.f37458Oooo0oO;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[OooO00o.OooO00o(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f37458Oooo0oO, i, zArr2, i + 1, this.f37459Oooo0oo - i);
            this.f37458Oooo0oO = zArr2;
        }
        this.f37458Oooo0oO[i] = zBooleanValue;
        this.f37459Oooo0oo++;
        ((AbstractList) this).modCount++;
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        OooO00o();
        Charset charset = zzkm.f15980OooO00o;
        Objects.requireNonNull(collection);
        if (!(collection instanceof oo0O)) {
            return super.addAll(collection);
        }
        oo0O oo0o = (oo0O) collection;
        int i = oo0o.f37459Oooo0oo;
        if (i == 0) {
            return false;
        }
        int i2 = this.f37459Oooo0oo;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f37458Oooo0oO;
        if (i3 > zArr.length) {
            this.f37458Oooo0oO = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(oo0o.f37458Oooo0oO, 0, this.f37458Oooo0oO, this.f37459Oooo0oo, oo0o.f37459Oooo0oo);
        this.f37459Oooo0oo = i3;
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
        if (!(obj instanceof oo0O)) {
            return super.equals(obj);
        }
        oo0O oo0o = (oo0O) obj;
        if (this.f37459Oooo0oo != oo0o.f37459Oooo0oo) {
            return false;
        }
        boolean[] zArr = oo0o.f37458Oooo0oO;
        for (int i = 0; i < this.f37459Oooo0oo; i++) {
            if (this.f37458Oooo0oO[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        OooO0o0(i);
        return Boolean.valueOf(this.f37458Oooo0oO[i]);
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i = 0; i < this.f37459Oooo0oo; i++) {
            iZza = (iZza * 31) + zzkm.zza(this.f37458Oooo0oO[i]);
        }
        return iZza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = this.f37459Oooo0oo;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f37458Oooo0oO[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        OooO00o();
        OooO0o0(i);
        boolean[] zArr = this.f37458Oooo0oO;
        boolean z = zArr[i];
        int i2 = this.f37459Oooo0oo;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f37459Oooo0oo--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        OooO00o();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f37458Oooo0oO;
        System.arraycopy(zArr, i2, zArr, i, this.f37459Oooo0oo - i2);
        this.f37459Oooo0oo -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        OooO00o();
        OooO0o0(i);
        boolean[] zArr = this.f37458Oooo0oO;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37459Oooo0oo;
    }

    @Override // com.google.android.gms.internal.measurement.zzkl
    public final /* bridge */ /* synthetic */ zzkl zzd(int i) {
        if (i >= this.f37459Oooo0oo) {
            return new oo0O(Arrays.copyOf(this.f37458Oooo0oO, i), this.f37459Oooo0oo);
        }
        throw new IllegalArgumentException();
    }

    public oo0O(boolean[] zArr, int i) {
        this.f37458Oooo0oO = zArr;
        this.f37459Oooo0oo = i;
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        OooO0O0(((Boolean) obj).booleanValue());
        return true;
    }
}
