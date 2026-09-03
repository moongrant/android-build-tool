package p334o0OO00o;

import com.app.base.protobuf.OooO00o;
import com.google.android.gms.internal.measurement.zzkl;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import p100o000oOoO.o00O00OO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0OO0 extends o00OO000 implements RandomAccess {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final o0O0OO0 f37394Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Object[] f37395Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f37396Oooo0oo;

    static {
        o0O0OO0 o0o0oo0 = new o0O0OO0(new Object[0], 0);
        f37394Oooo = o0o0oo0;
        o0o0oo0.zzb();
    }

    public o0O0OO0(Object[] objArr, int i) {
        this.f37395Oooo0oO = objArr;
        this.f37396Oooo0oo = i;
    }

    public final String OooO0O0(int i) {
        return o00O00OO.OooO00o("Index:", i, ", Size:", this.f37396Oooo0oo);
    }

    public final void OooO0OO(int i) {
        if (i < 0 || i >= this.f37396Oooo0oo) {
            throw new IndexOutOfBoundsException(OooO0O0(i));
        }
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        OooO00o();
        if (i < 0 || i > (i2 = this.f37396Oooo0oo)) {
            throw new IndexOutOfBoundsException(OooO0O0(i));
        }
        Object[] objArr = this.f37395Oooo0oO;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[OooO00o.OooO00o(i2, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f37395Oooo0oO, i, objArr2, i + 1, this.f37396Oooo0oo - i);
            this.f37395Oooo0oO = objArr2;
        }
        this.f37395Oooo0oO[i] = obj;
        this.f37396Oooo0oo++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        OooO0OO(i);
        return this.f37395Oooo0oO[i];
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        OooO00o();
        OooO0OO(i);
        Object[] objArr = this.f37395Oooo0oO;
        Object obj = objArr[i];
        int i2 = this.f37396Oooo0oo;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f37396Oooo0oo--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        OooO00o();
        OooO0OO(i);
        Object[] objArr = this.f37395Oooo0oO;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37396Oooo0oo;
    }

    @Override // com.google.android.gms.internal.measurement.zzkl
    public final /* bridge */ /* synthetic */ zzkl zzd(int i) {
        if (i >= this.f37396Oooo0oo) {
            return new o0O0OO0(Arrays.copyOf(this.f37395Oooo0oO, i), this.f37396Oooo0oo);
        }
        throw new IllegalArgumentException();
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        OooO00o();
        int i = this.f37396Oooo0oo;
        Object[] objArr = this.f37395Oooo0oO;
        if (i == objArr.length) {
            this.f37395Oooo0oO = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f37395Oooo0oO;
        int i2 = this.f37396Oooo0oo;
        this.f37396Oooo0oo = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
