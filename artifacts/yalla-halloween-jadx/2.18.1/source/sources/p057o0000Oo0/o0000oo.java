package p057o0000Oo0;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import p708oo000o.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0000oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o000000 f27628OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int[] f27629OooO0O0 = new int[10];

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float[] f27630OooO0OO = new float[10];

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f27631OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f27632OooO0o0;

    public final float OooO00o(float f) {
        return (float) this.f27628OooO00o.OooO0O0(f);
    }

    public final float OooO0O0(float f) {
        return (float) this.f27628OooO00o.OooO0o0(f);
    }

    public void OooO0OO(int i, float f) {
        int[] iArr = this.f27629OooO0O0;
        if (iArr.length < this.f27631OooO0Oo + 1) {
            this.f27629OooO0O0 = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f27630OooO0OO;
            this.f27630OooO0OO = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f27629OooO0O0;
        int i2 = this.f27631OooO0Oo;
        iArr2[i2] = i;
        this.f27630OooO0OO[i2] = f;
        this.f27631OooO0Oo = i2 + 1;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    public void OooO0Oo(int i) {
        int i2 = this.f27631OooO0Oo;
        if (i2 == 0) {
            return;
        }
        int[] iArr = this.f27629OooO0O0;
        float[] fArr = this.f27630OooO0OO;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i2 - 1;
        iArr2[1] = 0;
        int i3 = 2;
        while (i3 > 0) {
            int i4 = i3 - 1;
            int i5 = iArr2[i4];
            i3 = i4 - 1;
            int i6 = iArr2[i3];
            if (i5 < i6) {
                int i7 = iArr[i6];
                int i8 = i5;
                int i9 = i8;
                while (i8 < i6) {
                    if (iArr[i8] <= i7) {
                        int i10 = iArr[i9];
                        iArr[i9] = iArr[i8];
                        iArr[i8] = i10;
                        float f = fArr[i9];
                        fArr[i9] = fArr[i8];
                        fArr[i8] = f;
                        i9++;
                    }
                    i8++;
                }
                int i11 = iArr[i9];
                iArr[i9] = iArr[i6];
                iArr[i6] = i11;
                float f2 = fArr[i9];
                fArr[i9] = fArr[i6];
                fArr[i6] = f2;
                int i12 = i3 + 1;
                iArr2[i3] = i9 - 1;
                int i13 = i12 + 1;
                iArr2[i12] = i5;
                int i14 = i13 + 1;
                iArr2[i13] = i6;
                i3 = i14 + 1;
                iArr2[i14] = i9 + 1;
            }
        }
        int i15 = 1;
        for (int i16 = 1; i16 < this.f27631OooO0Oo; i16++) {
            int[] iArr3 = this.f27629OooO0O0;
            if (iArr3[i16 - 1] != iArr3[i16]) {
                i15++;
            }
        }
        double[] dArr = new double[i15];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) double.class, i15, 1);
        int i17 = 0;
        for (int i18 = 0; i18 < this.f27631OooO0Oo; i18++) {
            if (i18 > 0) {
                int[] iArr4 = this.f27629OooO0O0;
                if (iArr4[i18] != iArr4[i18 - 1]) {
                    dArr[i17] = ((double) this.f27629OooO0O0[i18]) * 0.01d;
                    dArr2[i17][0] = this.f27630OooO0OO[i18];
                    i17++;
                }
            } else {
                dArr[i17] = ((double) this.f27629OooO0O0[i18]) * 0.01d;
                dArr2[i17][0] = this.f27630OooO0OO[i18];
                i17++;
            }
        }
        this.f27628OooO00o = o000000.OooO00o(i, dArr, dArr2);
    }

    public final String toString() {
        String string = this.f27632OooO0o0;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f27631OooO0Oo; i++) {
            StringBuilder sbOooO00o = Oooo0.OooO00o(string, "[");
            sbOooO00o.append(this.f27629OooO0O0[i]);
            sbOooO00o.append(" , ");
            sbOooO00o.append(decimalFormat.format(this.f27630OooO0OO[i]));
            sbOooO00o.append("] ");
            string = sbOooO00o.toString();
        }
        return string;
    }
}
