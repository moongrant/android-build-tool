package o0Oo00o0;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f38953OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int[] f38954OooO0O0;

    public OooO0O0(OooO00o oooO00o, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f38953OooO00o = oooO00o;
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            this.f38954OooO0O0 = iArr;
            return;
        }
        int i = 1;
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.f38954OooO0O0 = new int[]{0};
            return;
        }
        int i2 = length - i;
        int[] iArr2 = new int[i2];
        this.f38954OooO0O0 = iArr2;
        System.arraycopy(iArr, i, iArr2, 0, i2);
    }

    public final OooO0O0 OooO00o(OooO0O0 oooO0O0) {
        if (!this.f38953OooO00o.equals(oooO0O0.f38953OooO00o)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (OooO0OO()) {
            return oooO0O0;
        }
        if (oooO0O0.OooO0OO()) {
            return this;
        }
        int[] iArr = this.f38954OooO0O0;
        int[] iArr2 = oooO0O0.f38954OooO0O0;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = iArr2[i - length] ^ iArr[i];
        }
        return new OooO0O0(this.f38953OooO00o, iArr3);
    }

    public final int OooO0O0(int i) {
        int[] iArr = this.f38954OooO0O0;
        return iArr[(iArr.length - 1) - i];
    }

    public final boolean OooO0OO() {
        return this.f38954OooO0O0[0] == 0;
    }

    public final OooO0O0 OooO0Oo(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.f38953OooO00o.f38949OooO0OO;
        }
        int length = this.f38954OooO0O0.length;
        int[] iArr = new int[i + length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = this.f38953OooO00o.OooO00o(this.f38954OooO0O0[i3], i2);
        }
        return new OooO0O0(this.f38953OooO00o, iArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f38954OooO0O0.length - 1) * 8);
        int length = this.f38954OooO0O0.length;
        while (true) {
            length--;
            if (length < 0) {
                return sb.toString();
            }
            int iOooO0O0 = OooO0O0(length);
            if (iOooO0O0 != 0) {
                if (iOooO0O0 < 0) {
                    sb.append(" - ");
                    iOooO0O0 = -iOooO0O0;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (length == 0 || iOooO0O0 != 1) {
                    OooO00o oooO00o = this.f38953OooO00o;
                    Objects.requireNonNull(oooO00o);
                    if (iOooO0O0 == 0) {
                        throw new IllegalArgumentException();
                    }
                    int i = oooO00o.f38948OooO0O0[iOooO0O0];
                    if (i == 0) {
                        sb.append('1');
                    } else if (i == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(i);
                    }
                }
                if (length != 0) {
                    if (length == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(length);
                    }
                }
            }
        }
    }
}
