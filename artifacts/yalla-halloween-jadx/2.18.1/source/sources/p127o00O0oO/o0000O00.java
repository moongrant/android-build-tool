package p127o00O0oO;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.KotlinVersion;
import p125o00O0o0O.o000000;
import p129o00O0oOo.o000O0;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O00 implements o0O0ooO<o000000> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f31094OooO00o;

    public o0000O00(int i) {
        this.f31094OooO00o = i;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    @Override // p127o00O0oO.o0O0ooO
    public final o000000 OooO00o(JsonReader jsonReader, float f) throws IOException {
        int i;
        double d;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        boolean z = jsonReader.OooOoo() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.OooO00o();
        }
        while (jsonReader.OooOOO()) {
            arrayList.add(Float.valueOf((float) jsonReader.OooOOoo()));
        }
        if (z) {
            jsonReader.OooO0Oo();
        }
        if (this.f31094OooO00o == -1) {
            this.f31094OooO00o = arrayList.size() / 4;
        }
        int i3 = this.f31094OooO00o;
        float[] fArr = new float[i3];
        int[] iArr = new int[i3];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = this.f31094OooO00o * 4;
            if (i4 >= i) {
                break;
            }
            int i7 = i4 / 4;
            double dFloatValue = ((Float) arrayList.get(i4)).floatValue();
            int i8 = i4 % 4;
            if (i8 != 0) {
                if (i8 == 1) {
                    i5 = (int) (dFloatValue * 255.0d);
                } else if (i8 == 2) {
                    i6 = (int) (dFloatValue * 255.0d);
                } else if (i8 == 3) {
                    iArr[i7] = Color.argb(KotlinVersion.MAX_COMPONENT_VALUE, i5, i6, (int) (dFloatValue * 255.0d));
                }
            } else if (i7 > 0) {
                float f2 = (float) dFloatValue;
                if (fArr[i7 - 1] >= f2) {
                    fArr[i7] = f2 + 0.01f;
                } else {
                    fArr[i7] = (float) dFloatValue;
                }
            } else {
                fArr[i7] = (float) dFloatValue;
            }
            i4++;
        }
        o000000 o000000Var = new o000000(fArr, iArr);
        if (arrayList.size() > i) {
            int size = (arrayList.size() - i) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i9 = 0;
            while (i < arrayList.size()) {
                if (i % 2 == 0) {
                    dArr[i9] = ((Float) arrayList.get(i)).floatValue();
                } else {
                    dArr2[i9] = ((Float) arrayList.get(i)).floatValue();
                    i9++;
                }
                i++;
            }
            while (true) {
                int[] iArr2 = o000000Var.f30996OooO0O0;
                if (i2 >= iArr2.length) {
                    break;
                }
                int i10 = iArr2[i2];
                double d2 = o000000Var.f30995OooO00o[i2];
                int i11 = 1;
                while (true) {
                    if (i11 >= size) {
                        d = dArr2[size - 1];
                        break;
                    }
                    int i12 = i11 - 1;
                    double d3 = dArr[i12];
                    double d4 = dArr[i11];
                    if (dArr[i11] >= d2) {
                        double d5 = (d2 - d3) / (d4 - d3);
                        PointF pointF = o000O0.f31128OooO00o;
                        double dMax = Math.max(0.0d, Math.min(1.0d, d5));
                        double d6 = dArr2[i12];
                        d = ((dArr2[i11] - d6) * dMax) + d6;
                        break;
                    }
                    i11++;
                }
                o000000 o000000Var2 = o000000Var;
                o000000Var2.f30996OooO0O0[i2] = Color.argb((int) (d * 255.0d), Color.red(i10), Color.green(i10), Color.blue(i10));
                i2++;
                o000000Var = o000000Var2;
            }
        }
        return o000000Var;
    }
}
