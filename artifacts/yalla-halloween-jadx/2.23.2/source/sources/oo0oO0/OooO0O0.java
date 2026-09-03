package oo0oO0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f60355OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int[] f60356OooO0O0;

    public OooO0O0(OooO00o oooO00o, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f60355OooO00o = oooO00o;
        int length = iArr.length;
        int i = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f60356OooO0O0 = iArr;
            return;
        }
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.f60356OooO0O0 = new int[]{0};
            return;
        }
        int i2 = length - i;
        int[] iArr2 = new int[i2];
        this.f60356OooO0O0 = iArr2;
        System.arraycopy(iArr, i, iArr2, 0, i2);
    }

    public final OooO0O0 OooO00o(OooO0O0 oooO0O0) {
        OooO00o oooO00o = oooO0O0.f60355OooO00o;
        OooO00o oooO00o2 = this.f60355OooO00o;
        if (!oooO00o2.equals(oooO00o)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        int[] iArr = this.f60356OooO0O0;
        if (iArr[0] == 0) {
            return oooO0O0;
        }
        int[] iArr2 = oooO0O0.f60356OooO0O0;
        if (iArr2[0] == 0) {
            return this;
        }
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
        return new OooO0O0(oooO00o2, iArr3);
    }

    public final String toString() {
        int[] iArr = this.f60356OooO0O0;
        StringBuilder sb = new StringBuilder((iArr.length - 1) * 8);
        int length = iArr.length;
        while (true) {
            length--;
            if (length < 0) {
                return sb.toString();
            }
            int i = iArr[(iArr.length - 1) - length];
            if (i != 0) {
                if (i < 0) {
                    sb.append(" - ");
                    i = -i;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (length == 0 || i != 1) {
                    OooO00o oooO00o = this.f60355OooO00o;
                    if (i == 0) {
                        oooO00o.getClass();
                        throw new IllegalArgumentException();
                    }
                    int i2 = oooO00o.f60350OooO0O0[i];
                    if (i2 == 0) {
                        sb.append('1');
                    } else if (i2 == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(i2);
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
