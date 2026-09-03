package p188o00o0O;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0<E> implements Cloneable {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final Object f38806OooO0oo = new Object();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f38807OooO0Oo = false;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Object[] f38808OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int[] f38809OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f38810OooO0oO;

    public Oooo0() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.f38809OooO0o0 = new int[i4];
        this.f38808OooO0o = new Object[i4];
    }

    public final int OooO() {
        if (this.f38807OooO0Oo) {
            OooO0o0();
        }
        return this.f38810OooO0oO;
    }

    public final void OooO0O0(int i, E e) {
        int i2 = this.f38810OooO0oO;
        if (i2 != 0 && i <= this.f38809OooO0o0[i2 - 1]) {
            OooO0oo(i, e);
            return;
        }
        if (this.f38807OooO0Oo && i2 >= this.f38809OooO0o0.length) {
            OooO0o0();
        }
        int i3 = this.f38810OooO0oO;
        if (i3 >= this.f38809OooO0o0.length) {
            int i4 = (i3 + 1) * 4;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            int[] iArr = new int[i7];
            Object[] objArr = new Object[i7];
            int[] iArr2 = this.f38809OooO0o0;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f38808OooO0o;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f38809OooO0o0 = iArr;
            this.f38808OooO0o = objArr;
        }
        this.f38809OooO0o0[i3] = i;
        this.f38808OooO0o[i3] = e;
        this.f38810OooO0oO = i3 + 1;
    }

    /* JADX INFO: renamed from: OooO0Oo, reason: merged with bridge method [inline-methods] */
    public final Oooo0<E> clone() {
        try {
            Oooo0<E> oooo0 = (Oooo0) super.clone();
            oooo0.f38809OooO0o0 = (int[]) this.f38809OooO0o0.clone();
            oooo0.f38808OooO0o = (Object[]) this.f38808OooO0o.clone();
            return oooo0;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final Object OooO0o(int i, Integer num) {
        Object obj;
        int iOooO0O0 = OooOOO.OooO0O0(this.f38810OooO0oO, i, this.f38809OooO0o0);
        return (iOooO0O0 < 0 || (obj = this.f38808OooO0o[iOooO0O0]) == f38806OooO0oo) ? num : obj;
    }

    public final void OooO0o0() {
        int i = this.f38810OooO0oO;
        int[] iArr = this.f38809OooO0o0;
        Object[] objArr = this.f38808OooO0o;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f38806OooO0oo) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f38807OooO0Oo = false;
        this.f38810OooO0oO = i2;
    }

    public final int OooO0oO(int i) {
        if (this.f38807OooO0Oo) {
            OooO0o0();
        }
        return this.f38809OooO0o0[i];
    }

    public final void OooO0oo(int i, E e) {
        int iOooO0O0 = OooOOO.OooO0O0(this.f38810OooO0oO, i, this.f38809OooO0o0);
        if (iOooO0O0 >= 0) {
            this.f38808OooO0o[iOooO0O0] = e;
            return;
        }
        int i2 = ~iOooO0O0;
        int i3 = this.f38810OooO0oO;
        if (i2 < i3) {
            Object[] objArr = this.f38808OooO0o;
            if (objArr[i2] == f38806OooO0oo) {
                this.f38809OooO0o0[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f38807OooO0Oo && i3 >= this.f38809OooO0o0.length) {
            OooO0o0();
            i2 = ~OooOOO.OooO0O0(this.f38810OooO0oO, i, this.f38809OooO0o0);
        }
        int i4 = this.f38810OooO0oO;
        if (i4 >= this.f38809OooO0o0.length) {
            int i5 = (i4 + 1) * 4;
            for (int i6 = 4; i6 < 32; i6++) {
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
            }
            int i8 = i5 / 4;
            int[] iArr = new int[i8];
            Object[] objArr2 = new Object[i8];
            int[] iArr2 = this.f38809OooO0o0;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f38808OooO0o;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f38809OooO0o0 = iArr;
            this.f38808OooO0o = objArr2;
        }
        int i9 = this.f38810OooO0oO - i2;
        if (i9 != 0) {
            int[] iArr3 = this.f38809OooO0o0;
            int i10 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i10, i9);
            Object[] objArr4 = this.f38808OooO0o;
            System.arraycopy(objArr4, i2, objArr4, i10, this.f38810OooO0oO - i2);
        }
        this.f38809OooO0o0[i2] = i;
        this.f38808OooO0o[i2] = e;
        this.f38810OooO0oO++;
    }

    public final E OooOO0(int i) {
        if (this.f38807OooO0Oo) {
            OooO0o0();
        }
        return (E) this.f38808OooO0o[i];
    }

    public final String toString() {
        if (OooO() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f38810OooO0oO * 28);
        sb.append('{');
        for (int i = 0; i < this.f38810OooO0oO; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(OooO0oO(i));
            sb.append('=');
            E eOooOO0 = OooOO0(i);
            if (eOooOO0 != this) {
                sb.append(eOooOO0);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
