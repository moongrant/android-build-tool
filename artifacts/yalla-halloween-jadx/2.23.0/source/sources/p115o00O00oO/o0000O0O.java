package p115o00O00oO;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import o00O0.OooOOO;
import p113o00O00Oo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O0O implements o00O000o<o00Oo0> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f36458OooO00o;

    public o0000O0O(int i) {
        this.f36458OooO00o = i;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    @Override // p115o00O00oO.o00O000o
    public final o00Oo0 OooO00o(JsonReader jsonReader, float f) throws IOException {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        int i3 = 1;
        int i4 = 0;
        boolean z = jsonReader.Oooo0() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.OooO00o();
        }
        while (jsonReader.OooOo00()) {
            arrayList.add(Float.valueOf((float) jsonReader.OooOo()));
        }
        if (z) {
            jsonReader.OooO0oO();
        }
        if (this.f36458OooO00o == -1) {
            this.f36458OooO00o = arrayList.size() / 4;
        }
        int i5 = this.f36458OooO00o;
        float[] fArr = new float[i5];
        int[] iArr = new int[i5];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i = this.f36458OooO00o * 4;
            if (i6 >= i) {
                break;
            }
            int i9 = i6 / 4;
            double dFloatValue = ((Float) arrayList.get(i6)).floatValue();
            int i10 = i6 % 4;
            if (i10 != 0) {
                if (i10 == 1) {
                    i7 = (int) (dFloatValue * 255.0d);
                } else if (i10 == 2) {
                    i8 = (int) (dFloatValue * 255.0d);
                } else if (i10 == 3) {
                    iArr[i9] = Color.argb(255, i7, i8, (int) (dFloatValue * 255.0d));
                }
            } else if (i9 > 0) {
                float f2 = (float) dFloatValue;
                if (fArr[i9 - 1] >= f2) {
                    fArr[i9] = f2 + 0.01f;
                } else {
                    fArr[i9] = (float) dFloatValue;
                }
            } else {
                fArr[i9] = (float) dFloatValue;
            }
            i6++;
        }
        o00Oo0 o00oo1 = new o00Oo0(fArr, iArr);
        if (arrayList.size() > i) {
            int size = (arrayList.size() - i) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i11 = 0;
            while (i < arrayList.size()) {
                if (i % 2 == 0) {
                    dArr[i11] = ((Float) arrayList.get(i)).floatValue();
                } else {
                    dArr2[i11] = ((Float) arrayList.get(i)).floatValue();
                    i11++;
                }
                i++;
            }
            while (true) {
                int[] iArr2 = o00oo1.f36357OooO0O0;
                if (i4 >= iArr2.length) {
                    break;
                }
                int i12 = iArr2[i4];
                double d = o00oo1.f36356OooO00o[i4];
                int i13 = i3;
                while (true) {
                    if (i13 >= size) {
                        i2 = (int) (dArr2[size - 1] * 255.0d);
                        break;
                    }
                    int i14 = i13 - 1;
                    double d2 = dArr[i14];
                    double d3 = dArr[i13];
                    if (d3 >= d) {
                        double d4 = (d - d2) / (d3 - d2);
                        PointF pointF = OooOOO.f35980OooO00o;
                        double dMax = Math.max(0.0d, Math.min(1.0d, d4));
                        double d5 = dArr2[i14];
                        i2 = (int) ((((dArr2[i13] - d5) * dMax) + d5) * 255.0d);
                        break;
                    }
                    i13++;
                }
                iArr2[i4] = Color.argb(i2, Color.red(i12), Color.green(i12), Color.blue(i12));
                i4++;
                i3 = 1;
            }
        }
        return o00oo1;
    }
}
