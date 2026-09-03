package p190o00o0O;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO<E> implements Cloneable {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final Object f38558OooO0oo = new Object();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f38559OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Object[] f38560OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long[] f38561OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f38562OooO0oO;

    public OooOOOO() {
        this(10);
    }

    public final void OooO(long j, E e) {
        int iOooO0O0 = OooOOO0.OooO0O0(this.f38561OooO0o0, this.f38562OooO0oO, j);
        if (iOooO0O0 >= 0) {
            this.f38560OooO0o[iOooO0O0] = e;
            return;
        }
        int i = ~iOooO0O0;
        int i2 = this.f38562OooO0oO;
        if (i < i2) {
            Object[] objArr = this.f38560OooO0o;
            if (objArr[i] == f38558OooO0oo) {
                this.f38561OooO0o0[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f38559OooO0Oo && i2 >= this.f38561OooO0o0.length) {
            OooO0o();
            i = ~OooOOO0.OooO0O0(this.f38561OooO0o0, this.f38562OooO0oO, j);
        }
        int i3 = this.f38562OooO0oO;
        if (i3 >= this.f38561OooO0o0.length) {
            int i4 = (i3 + 1) * 8;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 8;
            long[] jArr = new long[i7];
            Object[] objArr2 = new Object[i7];
            long[] jArr2 = this.f38561OooO0o0;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f38560OooO0o;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f38561OooO0o0 = jArr;
            this.f38560OooO0o = objArr2;
        }
        int i8 = this.f38562OooO0oO - i;
        if (i8 != 0) {
            long[] jArr3 = this.f38561OooO0o0;
            int i9 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i9, i8);
            Object[] objArr4 = this.f38560OooO0o;
            System.arraycopy(objArr4, i, objArr4, i9, this.f38562OooO0oO - i);
        }
        this.f38561OooO0o0[i] = j;
        this.f38560OooO0o[i] = e;
        this.f38562OooO0oO++;
    }

    public final void OooO0O0(long j, Long l) {
        int i = this.f38562OooO0oO;
        if (i != 0 && j <= this.f38561OooO0o0[i - 1]) {
            OooO(j, l);
            return;
        }
        if (this.f38559OooO0Oo && i >= this.f38561OooO0o0.length) {
            OooO0o();
        }
        int i2 = this.f38562OooO0oO;
        if (i2 >= this.f38561OooO0o0.length) {
            int i3 = (i2 + 1) * 8;
            for (int i4 = 4; i4 < 32; i4++) {
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
            }
            int i6 = i3 / 8;
            long[] jArr = new long[i6];
            Object[] objArr = new Object[i6];
            long[] jArr2 = this.f38561OooO0o0;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f38560OooO0o;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f38561OooO0o0 = jArr;
            this.f38560OooO0o = objArr;
        }
        this.f38561OooO0o0[i2] = j;
        this.f38560OooO0o[i2] = l;
        this.f38562OooO0oO = i2 + 1;
    }

    public final void OooO0Oo() {
        int i = this.f38562OooO0oO;
        Object[] objArr = this.f38560OooO0o;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f38562OooO0oO = 0;
        this.f38559OooO0Oo = false;
    }

    public final void OooO0o() {
        int i = this.f38562OooO0oO;
        long[] jArr = this.f38561OooO0o0;
        Object[] objArr = this.f38560OooO0o;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f38558OooO0oo) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f38559OooO0Oo = false;
        this.f38562OooO0oO = i2;
    }

    /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
    public final OooOOOO<E> clone() {
        try {
            OooOOOO<E> oooOOOO = (OooOOOO) super.clone();
            oooOOOO.f38561OooO0o0 = (long[]) this.f38561OooO0o0.clone();
            oooOOOO.f38560OooO0o = (Object[]) this.f38560OooO0o.clone();
            return oooOOOO;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final Object OooO0oO(long j, Long l) {
        Object obj;
        int iOooO0O0 = OooOOO0.OooO0O0(this.f38561OooO0o0, this.f38562OooO0oO, j);
        return (iOooO0O0 < 0 || (obj = this.f38560OooO0o[iOooO0O0]) == f38558OooO0oo) ? l : obj;
    }

    public final long OooO0oo(int i) {
        if (this.f38559OooO0Oo) {
            OooO0o();
        }
        return this.f38561OooO0o0[i];
    }

    public final void OooOO0(long j) {
        int iOooO0O0 = OooOOO0.OooO0O0(this.f38561OooO0o0, this.f38562OooO0oO, j);
        if (iOooO0O0 >= 0) {
            Object[] objArr = this.f38560OooO0o;
            Object obj = objArr[iOooO0O0];
            Object obj2 = f38558OooO0oo;
            if (obj != obj2) {
                objArr[iOooO0O0] = obj2;
                this.f38559OooO0Oo = true;
            }
        }
    }

    public final int OooOO0O() {
        if (this.f38559OooO0Oo) {
            OooO0o();
        }
        return this.f38562OooO0oO;
    }

    public final E OooOO0o(int i) {
        if (this.f38559OooO0Oo) {
            OooO0o();
        }
        return (E) this.f38560OooO0o[i];
    }

    public final String toString() {
        if (OooOO0O() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f38562OooO0oO * 28);
        sb.append('{');
        for (int i = 0; i < this.f38562OooO0oO; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(OooO0oo(i));
            sb.append('=');
            E eOooOO0o = OooOO0o(i);
            if (eOooOO0o != this) {
                sb.append(eOooOO0o);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public OooOOOO(int i) {
        this.f38559OooO0Oo = false;
        if (i == 0) {
            this.f38561OooO0o0 = OooOOO0.f38556OooO0O0;
            this.f38560OooO0o = OooOOO0.f38557OooO0OO;
            return;
        }
        int i2 = i * 8;
        for (int i3 = 4; i3 < 32; i3++) {
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
        }
        int i5 = i2 / 8;
        this.f38561OooO0o0 = new long[i5];
        this.f38560OooO0o = new Object[i5];
    }
}
