package p057o0000Oo0;

import OooO00o.OooO00o;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import p023Oooo00O.o00O0;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0000OO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f27634OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o000000 f27635OooO00o;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public String f27639OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f27640OooO0o0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f27636OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int[] f27637OooO0OO = new int[10];

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float[][] f27638OooO0Oo = (float[][]) Array.newInstance((Class<?>) float.class, 10, 3);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float[] f27641OooO0oO = new float[3];

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f27642OooO0oo = false;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f27643OooOO0 = Float.NaN;

    public final float OooO00o(float f) {
        float fAbs;
        switch (this.f27636OooO0O0) {
            case 1:
                return Math.signum(f * 6.2831855f);
            case 2:
                fAbs = Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f * 6.2831855f);
            case 6:
                float fAbs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) Math.sin(f * 6.2831855f);
        }
        return 1.0f - fAbs;
    }

    public void OooO0O0(int i, float f, float f2, int i2, float f3) {
        int[] iArr = this.f27637OooO0OO;
        int i3 = this.f27640OooO0o0;
        iArr[i3] = i;
        float[][] fArr = this.f27638OooO0Oo;
        fArr[i3][0] = f;
        fArr[i3][1] = f2;
        fArr[i3][2] = f3;
        this.f27636OooO0O0 = Math.max(this.f27636OooO0O0, i2);
        this.f27640OooO0o0++;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b6  */
    public void OooO0OO(int i) {
        int i2 = this.f27640OooO0o0;
        if (i2 == 0) {
            PrintStream printStream = System.err;
            StringBuilder sbOooO0O0 = OooO00o.OooO0O0("Error no points added to ");
            sbOooO0O0.append(this.f27639OooO0o);
            printStream.println(sbOooO0O0.toString());
            return;
        }
        int[] iArr = this.f27637OooO0OO;
        float[][] fArr = this.f27638OooO0Oo;
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
                        float[] fArr2 = fArr[i9];
                        fArr[i9] = fArr[i8];
                        fArr[i8] = fArr2;
                        i9++;
                    }
                    i8++;
                }
                int i11 = iArr[i9];
                iArr[i9] = iArr[i6];
                iArr[i6] = i11;
                float[] fArr3 = fArr[i9];
                fArr[i9] = fArr[i6];
                fArr[i6] = fArr3;
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
        int i16 = 0;
        while (true) {
            int[] iArr3 = this.f27637OooO0OO;
            if (i15 >= iArr3.length) {
                break;
            }
            if (iArr3[i15] != iArr3[i15 - 1]) {
                i16++;
            }
            i15++;
        }
        if (i16 == 0) {
            i16 = 1;
        }
        double[] dArr = new double[i16];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) double.class, i16, 3);
        int i17 = 0;
        for (int i18 = 0; i18 < this.f27640OooO0o0; i18++) {
            if (i18 > 0) {
                int[] iArr4 = this.f27637OooO0OO;
                if (iArr4[i18] != iArr4[i18 - 1]) {
                    dArr[i17] = ((double) this.f27637OooO0OO[i18]) * 0.01d;
                    double[] dArr3 = dArr2[i17];
                    float[][] fArr4 = this.f27638OooO0Oo;
                    dArr3[0] = fArr4[i18][0];
                    dArr2[i17][1] = fArr4[i18][1];
                    dArr2[i17][2] = fArr4[i18][2];
                    i17++;
                }
            } else {
                dArr[i17] = ((double) this.f27637OooO0OO[i18]) * 0.01d;
                double[] dArr4 = dArr2[i17];
                float[][] fArr5 = this.f27638OooO0Oo;
                dArr4[0] = fArr5[i18][0];
                dArr2[i17][1] = fArr5[i18][1];
                dArr2[i17][2] = fArr5[i18][2];
                i17++;
            }
        }
        this.f27635OooO00o = o000000.OooO00o(i, dArr, dArr2);
    }

    public final String toString() {
        String string = this.f27639OooO0o;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f27640OooO0o0; i++) {
            StringBuilder sbOooO0O0 = o00O0.OooO0O0(string, "[");
            sbOooO0O0.append(this.f27637OooO0OO[i]);
            sbOooO0O0.append(" , ");
            sbOooO0O0.append(decimalFormat.format(this.f27638OooO0Oo[i]));
            sbOooO0O0.append("] ");
            string = sbOooO0O0.toString();
        }
        return string;
    }
}
