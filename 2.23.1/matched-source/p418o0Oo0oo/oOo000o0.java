package p418o0Oo0oo;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import p037OoooOo0.o000O0o;

/* JADX INFO: loaded from: classes.dex */
public abstract class oOo000o0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f46526OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public oO00OOo0 f46527OooO00o;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public String f46531OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f46532OooO0o0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f46528OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int[] f46529OooO0OO = new int[10];

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float[][] f46530OooO0Oo = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final float[] f46533OooO0oO = new float[3];

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f46534OooO0oo = false;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f46535OooOO0 = Float.NaN;

    public final float OooO00o(float f) {
        float fAbs;
        switch (this.f46528OooO0O0) {
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

    public void OooO0O0(float f, float f2, float f3, int i, int i2) {
        int i3 = this.f46532OooO0o0;
        this.f46529OooO0OO[i3] = i;
        float[] fArr = this.f46530OooO0Oo[i3];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        this.f46528OooO0O0 = Math.max(this.f46528OooO0O0, i2);
        this.f46532OooO0o0++;
    }

    public void OooO0OO(int i) {
        float[][] fArr;
        int i2 = this.f46532OooO0o0;
        if (i2 == 0) {
            System.err.println("Error no points added to " + this.f46531OooO0o);
            return;
        }
        int[] iArr = this.f46529OooO0OO;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i2 - 1;
        iArr2[1] = 0;
        int i3 = 2;
        while (true) {
            fArr = this.f46530OooO0Oo;
            if (i3 <= 0) {
                break;
            }
            int i4 = i3 - 1;
            int i5 = iArr2[i4];
            i3 = i4 - 1;
            int i6 = iArr2[i3];
            if (i5 < i6) {
                int i7 = iArr[i6];
                int i8 = i5;
                int i9 = i8;
                while (i8 < i6) {
                    int i10 = iArr[i8];
                    if (i10 <= i7) {
                        int i11 = iArr[i9];
                        iArr[i9] = i10;
                        iArr[i8] = i11;
                        float[] fArr2 = fArr[i9];
                        fArr[i9] = fArr[i8];
                        fArr[i8] = fArr2;
                        i9++;
                    }
                    i8++;
                }
                int i12 = iArr[i9];
                iArr[i9] = iArr[i6];
                iArr[i6] = i12;
                float[] fArr3 = fArr[i9];
                fArr[i9] = fArr[i6];
                fArr[i6] = fArr3;
                int i13 = i3 + 1;
                iArr2[i3] = i9 - 1;
                int i14 = i13 + 1;
                iArr2[i13] = i5;
                int i15 = i14 + 1;
                iArr2[i14] = i6;
                i3 = i15 + 1;
                iArr2[i15] = i9 + 1;
            }
        }
        int i16 = 0;
        for (int i17 = 1; i17 < iArr.length; i17++) {
            if (iArr[i17] != iArr[i17 - 1]) {
                i16++;
            }
        }
        if (i16 == 0) {
            i16 = 1;
        }
        double[] dArr = new double[i16];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i16, 3);
        int i18 = 0;
        for (int i19 = 0; i19 < this.f46532OooO0o0; i19++) {
            if (i19 <= 0 || iArr[i19] != iArr[i19 - 1]) {
                dArr[i18] = ((double) iArr[i19]) * 0.01d;
                double[] dArr3 = dArr2[i18];
                float[] fArr4 = fArr[i19];
                dArr3[0] = fArr4[0];
                dArr3[1] = fArr4[1];
                dArr3[2] = fArr4[2];
                i18++;
            }
        }
        this.f46527OooO00o = oO00OOo0.OooO00o(i, dArr, dArr2);
    }

    public final String toString() {
        String string = this.f46531OooO0o;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f46532OooO0o0; i++) {
            StringBuilder sbOooO0O0 = o000O0o.OooO0O0(string, "[");
            sbOooO0O0.append(this.f46529OooO0OO[i]);
            sbOooO0O0.append(" , ");
            sbOooO0O0.append(decimalFormat.format(this.f46530OooO0Oo[i]));
            sbOooO0O0.append("] ");
            string = sbOooO0O0.toString();
        }
        return string;
    }
}
