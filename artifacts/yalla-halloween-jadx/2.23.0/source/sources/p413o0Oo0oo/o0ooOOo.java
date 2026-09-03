package p413o0Oo0oo;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import p037OoooOo0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Oooo000 f45344OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int[] f45345OooO0O0 = new int[10];

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float[] f45346OooO0OO = new float[10];

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f45347OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f45348OooO0o0;

    public final float OooO00o(float f) {
        return (float) this.f45344OooO00o.OooO0O0(f);
    }

    public void OooO0O0(float f, int i) {
        int[] iArr = this.f45345OooO0O0;
        if (iArr.length < this.f45347OooO0Oo + 1) {
            this.f45345OooO0O0 = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f45346OooO0OO;
            this.f45346OooO0OO = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f45345OooO0O0;
        int i2 = this.f45347OooO0Oo;
        iArr2[i2] = i;
        this.f45346OooO0OO[i2] = f;
        this.f45347OooO0Oo = i2 + 1;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009a  */
    public void OooO0OO(int i) {
        int i2 = this.f45347OooO0Oo;
        if (i2 == 0) {
            return;
        }
        int[] iArr = this.f45345OooO0O0;
        float[] fArr = this.f45346OooO0OO;
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
                    int i10 = iArr[i8];
                    if (i10 <= i7) {
                        int i11 = iArr[i9];
                        iArr[i9] = i10;
                        iArr[i8] = i11;
                        float f = fArr[i9];
                        fArr[i9] = fArr[i8];
                        fArr[i8] = f;
                        i9++;
                    }
                    i8++;
                }
                int i12 = iArr[i9];
                iArr[i9] = iArr[i6];
                iArr[i6] = i12;
                float f2 = fArr[i9];
                fArr[i9] = fArr[i6];
                fArr[i6] = f2;
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
        int i16 = 1;
        for (int i17 = 1; i17 < this.f45347OooO0Oo; i17++) {
            int[] iArr3 = this.f45345OooO0O0;
            if (iArr3[i17 - 1] != iArr3[i17]) {
                i16++;
            }
        }
        double[] dArr = new double[i16];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i16, 1);
        int i18 = 0;
        for (int i19 = 0; i19 < this.f45347OooO0Oo; i19++) {
            if (i19 > 0) {
                int[] iArr4 = this.f45345OooO0O0;
                if (iArr4[i19] != iArr4[i19 - 1]) {
                    dArr[i18] = ((double) this.f45345OooO0O0[i19]) * 0.01d;
                    dArr2[i18][0] = this.f45346OooO0OO[i19];
                    i18++;
                }
            } else {
                dArr[i18] = ((double) this.f45345OooO0O0[i19]) * 0.01d;
                dArr2[i18][0] = this.f45346OooO0OO[i19];
                i18++;
            }
        }
        this.f45344OooO00o = Oooo000.OooO00o(i, dArr, dArr2);
    }

    public final String toString() {
        String string = this.f45348OooO0o0;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f45347OooO0Oo; i++) {
            StringBuilder sbOooO0O0 = o000Oo0.OooO0O0(string, "[");
            sbOooO0O0.append(this.f45345OooO0O0[i]);
            sbOooO0O0.append(" , ");
            sbOooO0O0.append(decimalFormat.format(this.f45346OooO0OO[i]));
            sbOooO0O0.append("] ");
            string = sbOooO0O0.toString();
        }
        return string;
    }
}
