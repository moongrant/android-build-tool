package p334o0OO00o;

import com.app.base.protobuf.OooO00o;
import com.google.android.gms.internal.measurement.zzkj;
import com.google.android.gms.internal.measurement.zzkm;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import p100o000oOoO.o00O00OO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O000 extends o00OO000 implements RandomAccess, zzkj, o0O0O0Oo {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final o0O000 f37354Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int[] f37355Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f37356Oooo0oo;

    static {
        o0O000 o0o001 = new o0O000(new int[0], 0);
        f37354Oooo = o0o001;
        o0o001.zzb();
    }

    public o0O000() {
        this(new int[10], 0);
    }

    public final int OooO0O0(int i) {
        OooO0oO(i);
        return this.f37355Oooo0oO[i];
    }

    public final void OooO0OO(int i) {
        OooO00o();
        int i2 = this.f37356Oooo0oo;
        int[] iArr = this.f37355Oooo0oO;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[OooO00o.OooO00o(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f37355Oooo0oO = iArr2;
        }
        int[] iArr3 = this.f37355Oooo0oO;
        int i3 = this.f37356Oooo0oo;
        this.f37356Oooo0oo = i3 + 1;
        iArr3[i3] = i;
    }

    public final String OooO0o0(int i) {
        return o00O00OO.OooO00o("Index:", i, ", Size:", this.f37356Oooo0oo);
    }

    public final void OooO0oO(int i) {
        if (i < 0 || i >= this.f37356Oooo0oo) {
            throw new IndexOutOfBoundsException(OooO0o0(i));
        }
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        OooO00o();
        if (i < 0 || i > (i2 = this.f37356Oooo0oo)) {
            throw new IndexOutOfBoundsException(OooO0o0(i));
        }
        int[] iArr = this.f37355Oooo0oO;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[OooO00o.OooO00o(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f37355Oooo0oO, i, iArr2, i + 1, this.f37356Oooo0oo - i);
            this.f37355Oooo0oO = iArr2;
        }
        this.f37355Oooo0oO[i] = iIntValue;
        this.f37356Oooo0oo++;
        ((AbstractList) this).modCount++;
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        OooO00o();
        Charset charset = zzkm.f15980OooO00o;
        Objects.requireNonNull(collection);
        if (!(collection instanceof o0O000)) {
            return super.addAll(collection);
        }
        o0O000 o0o001 = (o0O000) collection;
        int i = o0o001.f37356Oooo0oo;
        if (i == 0) {
            return false;
        }
        int i2 = this.f37356Oooo0oo;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f37355Oooo0oO;
        if (i3 > iArr.length) {
            this.f37355Oooo0oO = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(o0o001.f37355Oooo0oO, 0, this.f37355Oooo0oO, this.f37356Oooo0oo, o0o001.f37356Oooo0oo);
        this.f37356Oooo0oo = i3;
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
        if (!(obj instanceof o0O000)) {
            return super.equals(obj);
        }
        o0O000 o0o001 = (o0O000) obj;
        if (this.f37356Oooo0oo != o0o001.f37356Oooo0oo) {
            return false;
        }
        int[] iArr = o0o001.f37355Oooo0oO;
        for (int i = 0; i < this.f37356Oooo0oo; i++) {
            if (this.f37355Oooo0oO[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        OooO0oO(i);
        return Integer.valueOf(this.f37355Oooo0oO[i]);
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f37356Oooo0oo; i2++) {
            i = (i * 31) + this.f37355Oooo0oO[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f37356Oooo0oo;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f37355Oooo0oO[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        OooO00o();
        OooO0oO(i);
        int[] iArr = this.f37355Oooo0oO;
        int i2 = iArr[i];
        int i3 = this.f37356Oooo0oo;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f37356Oooo0oo--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        OooO00o();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f37355Oooo0oO;
        System.arraycopy(iArr, i2, iArr, i, this.f37356Oooo0oo - i2);
        this.f37356Oooo0oo -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        OooO00o();
        OooO0oO(i);
        int[] iArr = this.f37355Oooo0oO;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37356Oooo0oo;
    }

    @Override // com.google.android.gms.internal.measurement.zzkl
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzkj zzd(int i) {
        if (i >= this.f37356Oooo0oo) {
            return new o0O000(Arrays.copyOf(this.f37355Oooo0oO, i), this.f37356Oooo0oo);
        }
        throw new IllegalArgumentException();
    }

    public o0O000(int[] iArr, int i) {
        this.f37355Oooo0oO = iArr;
        this.f37356Oooo0oo = i;
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        OooO0OO(((Integer) obj).intValue());
        return true;
    }
}
