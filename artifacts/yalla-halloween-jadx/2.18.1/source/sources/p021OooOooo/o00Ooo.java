package p021OooOooo;

/* JADX INFO: loaded from: classes.dex */
public final class o00Ooo<E> implements Cloneable {

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final Object f410OoooO00 = new Object();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f411Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f412Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public long[] f413Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Object[] f414Oooo0oo;

    public o00Ooo() {
        this(10);
    }

    public final E OooO(long j, E e) {
        int iOooO0OO = o00O0O.OooO0OO(this.f413Oooo0oO, this.f411Oooo, j);
        if (iOooO0OO >= 0) {
            Object[] objArr = this.f414Oooo0oo;
            if (objArr[iOooO0OO] != f410OoooO00) {
                return (E) objArr[iOooO0OO];
            }
        }
        return e;
    }

    public final void OooO0OO(long j, E e) {
        int i = this.f411Oooo;
        if (i != 0 && j <= this.f413Oooo0oO[i - 1]) {
            OooOO0o(j, e);
            return;
        }
        if (this.f412Oooo0o && i >= this.f413Oooo0oO.length) {
            OooO0oO();
        }
        int i2 = this.f411Oooo;
        if (i2 >= this.f413Oooo0oO.length) {
            int iOooO0oO = o00O0O.OooO0oO(i2 + 1);
            long[] jArr = new long[iOooO0oO];
            Object[] objArr = new Object[iOooO0oO];
            long[] jArr2 = this.f413Oooo0oO;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f414Oooo0oo;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f413Oooo0oO = jArr;
            this.f414Oooo0oo = objArr;
        }
        this.f413Oooo0oO[i2] = j;
        this.f414Oooo0oo[i2] = e;
        this.f411Oooo = i2 + 1;
    }

    public final void OooO0Oo() {
        int i = this.f411Oooo;
        Object[] objArr = this.f414Oooo0oo;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f411Oooo = 0;
        this.f412Oooo0o = false;
    }

    public final boolean OooO0o(long j) {
        if (this.f412Oooo0o) {
            OooO0oO();
        }
        return o00O0O.OooO0OO(this.f413Oooo0oO, this.f411Oooo, j) >= 0;
    }

    /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
    public final o00Ooo<E> clone() {
        try {
            o00Ooo<E> o00ooo2 = (o00Ooo) super.clone();
            o00ooo2.f413Oooo0oO = (long[]) this.f413Oooo0oO.clone();
            o00ooo2.f414Oooo0oo = (Object[]) this.f414Oooo0oo.clone();
            return o00ooo2;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final void OooO0oO() {
        int i = this.f411Oooo;
        long[] jArr = this.f413Oooo0oO;
        Object[] objArr = this.f414Oooo0oo;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f410OoooO00) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f412Oooo0o = false;
        this.f411Oooo = i2;
    }

    public final boolean OooOO0() {
        return OooOOO() == 0;
    }

    public final long OooOO0O(int i) {
        if (this.f412Oooo0o) {
            OooO0oO();
        }
        return this.f413Oooo0oO[i];
    }

    public final void OooOO0o(long j, E e) {
        int iOooO0OO = o00O0O.OooO0OO(this.f413Oooo0oO, this.f411Oooo, j);
        if (iOooO0OO >= 0) {
            this.f414Oooo0oo[iOooO0OO] = e;
            return;
        }
        int i = ~iOooO0OO;
        int i2 = this.f411Oooo;
        if (i < i2) {
            Object[] objArr = this.f414Oooo0oo;
            if (objArr[i] == f410OoooO00) {
                this.f413Oooo0oO[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f412Oooo0o && i2 >= this.f413Oooo0oO.length) {
            OooO0oO();
            i = ~o00O0O.OooO0OO(this.f413Oooo0oO, this.f411Oooo, j);
        }
        int i3 = this.f411Oooo;
        if (i3 >= this.f413Oooo0oO.length) {
            int iOooO0oO = o00O0O.OooO0oO(i3 + 1);
            long[] jArr = new long[iOooO0oO];
            Object[] objArr2 = new Object[iOooO0oO];
            long[] jArr2 = this.f413Oooo0oO;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f414Oooo0oo;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f413Oooo0oO = jArr;
            this.f414Oooo0oo = objArr2;
        }
        int i4 = this.f411Oooo;
        if (i4 - i != 0) {
            long[] jArr3 = this.f413Oooo0oO;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f414Oooo0oo;
            System.arraycopy(objArr4, i, objArr4, i5, this.f411Oooo - i);
        }
        this.f413Oooo0oO[i] = j;
        this.f414Oooo0oo[i] = e;
        this.f411Oooo++;
    }

    public final int OooOOO() {
        if (this.f412Oooo0o) {
            OooO0oO();
        }
        return this.f411Oooo;
    }

    public final void OooOOO0(long j) {
        int iOooO0OO = o00O0O.OooO0OO(this.f413Oooo0oO, this.f411Oooo, j);
        if (iOooO0OO >= 0) {
            Object[] objArr = this.f414Oooo0oo;
            Object obj = objArr[iOooO0OO];
            Object obj2 = f410OoooO00;
            if (obj != obj2) {
                objArr[iOooO0OO] = obj2;
                this.f412Oooo0o = true;
            }
        }
    }

    public final E OooOOOO(int i) {
        if (this.f412Oooo0o) {
            OooO0oO();
        }
        return (E) this.f414Oooo0oo[i];
    }

    public final String toString() {
        if (OooOOO() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f411Oooo * 28);
        sb.append('{');
        for (int i = 0; i < this.f411Oooo; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(OooOO0O(i));
            sb.append('=');
            E eOooOOOO = OooOOOO(i);
            if (eOooOOOO != this) {
                sb.append(eOooOOOO);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public o00Ooo(int i) {
        this.f412Oooo0o = false;
        if (i == 0) {
            this.f413Oooo0oO = o00O0O.f405OooO0O0;
            this.f414Oooo0oo = o00O0O.f406OooO0OO;
        } else {
            int iOooO0oO = o00O0O.OooO0oO(i);
            this.f413Oooo0oO = new long[iOooO0oO];
            this.f414Oooo0oo = new Object[iOooO0oO];
        }
    }
}
