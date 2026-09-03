package p021OooOooo;

/* JADX INFO: loaded from: classes.dex */
public final class o0ooOOo<E> implements Cloneable {

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final Object f434OoooO00 = new Object();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f435Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f436Oooo0o = false;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int[] f437Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Object[] f438Oooo0oo;

    public o0ooOOo() {
        int iOooO0o = o00O0O.OooO0o(10);
        this.f437Oooo0oO = new int[iOooO0o];
        this.f438Oooo0oo = new Object[iOooO0o];
    }

    public final int OooO(E e) {
        if (this.f436Oooo0o) {
            OooO0o();
        }
        for (int i = 0; i < this.f435Oooo; i++) {
            if (this.f438Oooo0oo[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public final void OooO0OO(int i, E e) {
        int i2 = this.f435Oooo;
        if (i2 != 0 && i <= this.f437Oooo0oO[i2 - 1]) {
            OooOO0O(i, e);
            return;
        }
        if (this.f436Oooo0o && i2 >= this.f437Oooo0oO.length) {
            OooO0o();
        }
        int i3 = this.f435Oooo;
        if (i3 >= this.f437Oooo0oO.length) {
            int iOooO0o = o00O0O.OooO0o(i3 + 1);
            int[] iArr = new int[iOooO0o];
            Object[] objArr = new Object[iOooO0o];
            int[] iArr2 = this.f437Oooo0oO;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f438Oooo0oo;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f437Oooo0oO = iArr;
            this.f438Oooo0oo = objArr;
        }
        this.f437Oooo0oO[i3] = i;
        this.f438Oooo0oo[i3] = e;
        this.f435Oooo = i3 + 1;
    }

    /* JADX INFO: renamed from: OooO0Oo, reason: merged with bridge method [inline-methods] */
    public final o0ooOOo<E> clone() {
        try {
            o0ooOOo<E> o0ooooo2 = (o0ooOOo) super.clone();
            o0ooooo2.f437Oooo0oO = (int[]) this.f437Oooo0oO.clone();
            o0ooooo2.f438Oooo0oo = (Object[]) this.f438Oooo0oo.clone();
            return o0ooooo2;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final void OooO0o() {
        int i = this.f435Oooo;
        int[] iArr = this.f437Oooo0oO;
        Object[] objArr = this.f438Oooo0oo;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f434OoooO00) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f436Oooo0o = false;
        this.f435Oooo = i2;
    }

    public final boolean OooO0o0(int i) {
        if (this.f436Oooo0o) {
            OooO0o();
        }
        return o00O0O.OooO0O0(this.f437Oooo0oO, this.f435Oooo, i) >= 0;
    }

    public final E OooO0oO(int i, E e) {
        int iOooO0O0 = o00O0O.OooO0O0(this.f437Oooo0oO, this.f435Oooo, i);
        if (iOooO0O0 >= 0) {
            Object[] objArr = this.f438Oooo0oo;
            if (objArr[iOooO0O0] != f434OoooO00) {
                return (E) objArr[iOooO0O0];
            }
        }
        return e;
    }

    public final int OooOO0(int i) {
        if (this.f436Oooo0o) {
            OooO0o();
        }
        return this.f437Oooo0oO[i];
    }

    public final void OooOO0O(int i, E e) {
        int iOooO0O0 = o00O0O.OooO0O0(this.f437Oooo0oO, this.f435Oooo, i);
        if (iOooO0O0 >= 0) {
            this.f438Oooo0oo[iOooO0O0] = e;
            return;
        }
        int i2 = ~iOooO0O0;
        int i3 = this.f435Oooo;
        if (i2 < i3) {
            Object[] objArr = this.f438Oooo0oo;
            if (objArr[i2] == f434OoooO00) {
                this.f437Oooo0oO[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f436Oooo0o && i3 >= this.f437Oooo0oO.length) {
            OooO0o();
            i2 = ~o00O0O.OooO0O0(this.f437Oooo0oO, this.f435Oooo, i);
        }
        int i4 = this.f435Oooo;
        if (i4 >= this.f437Oooo0oO.length) {
            int iOooO0o = o00O0O.OooO0o(i4 + 1);
            int[] iArr = new int[iOooO0o];
            Object[] objArr2 = new Object[iOooO0o];
            int[] iArr2 = this.f437Oooo0oO;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f438Oooo0oo;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f437Oooo0oO = iArr;
            this.f438Oooo0oo = objArr2;
        }
        int i5 = this.f435Oooo;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.f437Oooo0oO;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.f438Oooo0oo;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f435Oooo - i2);
        }
        this.f437Oooo0oO[i2] = i;
        this.f438Oooo0oo[i2] = e;
        this.f435Oooo++;
    }

    public final int OooOO0o() {
        if (this.f436Oooo0o) {
            OooO0o();
        }
        return this.f435Oooo;
    }

    public final E OooOOO0(int i) {
        if (this.f436Oooo0o) {
            OooO0o();
        }
        return (E) this.f438Oooo0oo[i];
    }

    public final String toString() {
        if (OooOO0o() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f435Oooo * 28);
        sb.append('{');
        for (int i = 0; i < this.f435Oooo; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(OooOO0(i));
            sb.append('=');
            E eOooOOO0 = OooOOO0(i);
            if (eOooOOO0 != this) {
                sb.append(eOooOOO0);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
