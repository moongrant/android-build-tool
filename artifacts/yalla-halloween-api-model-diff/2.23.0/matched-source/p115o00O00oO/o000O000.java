package p115o00O00oO;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.airbnb.lottie.OooOO0;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.lang.ref.WeakReference;
import o0000OO0.OooO00o;
import o00O0.OooOOO;
import o00O0.OooOOOO;
import p188o00o0O.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O000 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static Oooo0<WeakReference<Interpolator>> f36474OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final LinearInterpolator f36473OooO00o = new LinearInterpolator();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final JsonReader.OooO00o f36475OooO0OO = JsonReader.OooO00o.OooO00o("t", "s", "e", "o", "i", "h", "to", "ti");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final JsonReader.OooO00o f36476OooO0Oo = JsonReader.OooO00o.OooO00o("x", "y");

    public static Interpolator OooO00o(PointF pointF, PointF pointF2) {
        WeakReference weakReference;
        Interpolator interpolatorOooO0O0;
        pointF.x = OooOOO.OooO0O0(pointF.x, -1.0f, 1.0f);
        pointF.y = OooOOO.OooO0O0(pointF.y, -100.0f, 100.0f);
        pointF2.x = OooOOO.OooO0O0(pointF2.x, -1.0f, 1.0f);
        float fOooO0O0 = OooOOO.OooO0O0(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fOooO0O0;
        float f = pointF.x;
        float f2 = pointF.y;
        float f3 = pointF2.x;
        OooOOOO.OooO00o oooO00o = OooOOOO.f35982OooO00o;
        int i = f != 0.0f ? (int) (527 * f) : 17;
        if (f2 != 0.0f) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        if (fOooO0O0 != 0.0f) {
            i = (int) (i * 31 * fOooO0O0);
        }
        synchronized (o000O000.class) {
            if (f36474OooO0O0 == null) {
                f36474OooO0O0 = new Oooo0<>();
            }
            weakReference = (WeakReference) f36474OooO0O0.OooO0o(i, null);
        }
        Interpolator interpolator = weakReference != null ? (Interpolator) weakReference.get() : null;
        if (weakReference == null || interpolator == null) {
            try {
                interpolatorOooO0O0 = OooO00o.OooO0O0(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                interpolatorOooO0O0 = "The Path cannot loop back on itself.".equals(e.getMessage()) ? OooO00o.OooO0O0(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
            }
            interpolator = interpolatorOooO0O0;
            try {
                OooO0OO(i, new WeakReference(interpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator;
    }

    /* JADX WARN: Code duplicated, block: B:97:0x020b  */
    public static <T> o00O0O00.OooO00o<T> OooO0O0(JsonReader jsonReader, OooOO0 oooOO1, float f, o00O000o<T> o00o000o2, boolean z, boolean z2) throws IOException {
        Interpolator interpolatorOooO00o;
        T t;
        Interpolator interpolatorOooO00o2;
        Interpolator interpolatorOooO00o3;
        T t2;
        Interpolator interpolatorOooO00o4;
        o00O0O00.OooO00o<T> oooO00o;
        LinearInterpolator linearInterpolator;
        JsonReader.OooO00o oooO00o2;
        PointF pointF;
        PointF pointF2;
        PointF pointF3;
        PointF pointF4;
        LinearInterpolator linearInterpolator2 = f36473OooO00o;
        int i = 1;
        JsonReader.OooO00o oooO00o3 = f36475OooO0OO;
        if (!z || !z2) {
            JsonReader.OooO00o oooO00o4 = oooO00o3;
            if (!z) {
                return new o00O0O00.OooO00o<>(o00o000o2.OooO00o(jsonReader, f));
            }
            jsonReader.OooO0OO();
            T tOooO00o = null;
            PointF pointFOooO0O0 = null;
            boolean z3 = false;
            float fOooOo = 0.0f;
            PointF pointFOooO0O1 = null;
            PointF pointFOooO0O2 = null;
            PointF pointFOooO0O3 = null;
            T tOooO00o2 = null;
            while (jsonReader.OooOo00()) {
                JsonReader.OooO00o oooO00o5 = oooO00o4;
                switch (jsonReader.Oooo0OO(oooO00o5)) {
                    case 0:
                        fOooOo = (float) jsonReader.OooOo();
                        oooO00o4 = oooO00o5;
                        break;
                    case 1:
                        tOooO00o = o00o000o2.OooO00o(jsonReader, f);
                        oooO00o4 = oooO00o5;
                        break;
                    case 2:
                        tOooO00o2 = o00o000o2.OooO00o(jsonReader, f);
                        oooO00o4 = oooO00o5;
                        break;
                    case 3:
                        pointFOooO0O1 = o000.OooO0O0(jsonReader, 1.0f);
                        oooO00o4 = oooO00o5;
                        break;
                    case 4:
                        pointFOooO0O0 = o000.OooO0O0(jsonReader, 1.0f);
                        oooO00o4 = oooO00o5;
                        break;
                    case 5:
                        oooO00o4 = oooO00o5;
                        z3 = jsonReader.OooOooO() == 1;
                        break;
                    case 6:
                        pointFOooO0O2 = o000.OooO0O0(jsonReader, f);
                        oooO00o4 = oooO00o5;
                        break;
                    case 7:
                        pointFOooO0O3 = o000.OooO0O0(jsonReader, f);
                        oooO00o4 = oooO00o5;
                        break;
                    default:
                        jsonReader.Oooo0o();
                        oooO00o4 = oooO00o5;
                        break;
                }
            }
            jsonReader.OooOOo0();
            if (z3) {
                t = tOooO00o;
                interpolatorOooO00o = linearInterpolator2;
            } else {
                interpolatorOooO00o = (pointFOooO0O1 == null || pointFOooO0O0 == null) ? linearInterpolator2 : OooO00o(pointFOooO0O1, pointFOooO0O0);
                t = tOooO00o2;
            }
            o00O0O00.OooO00o<T> oooO00o6 = new o00O0O00.OooO00o<>(oooOO1, tOooO00o, t, interpolatorOooO00o, fOooOo, (Float) null);
            oooO00o6.f36515OooOOOO = pointFOooO0O2;
            oooO00o6.f36516OooOOOo = pointFOooO0O3;
            return oooO00o6;
        }
        jsonReader.OooO0OO();
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointFOooO0O4 = null;
        PointF pointF7 = null;
        PointF pointFOooO0O5 = null;
        PointF pointF8 = null;
        int i2 = 0;
        PointF pointFOooO0O6 = null;
        PointF pointFOooO0O7 = null;
        T tOooO00o3 = null;
        T tOooO00o4 = null;
        float fOooOo2 = 0.0f;
        while (jsonReader.OooOo00()) {
            int iOooo0OO = jsonReader.Oooo0OO(oooO00o3);
            JsonReader.OooO00o oooO00o7 = f36476OooO0Oo;
            switch (iOooo0OO) {
                case 0:
                    linearInterpolator = linearInterpolator2;
                    oooO00o2 = oooO00o3;
                    pointF = pointFOooO0O4;
                    pointF2 = pointFOooO0O5;
                    fOooOo2 = (float) jsonReader.OooOo();
                    pointFOooO0O4 = pointF;
                    pointFOooO0O5 = pointF2;
                    linearInterpolator2 = linearInterpolator;
                    oooO00o3 = oooO00o2;
                    i = 1;
                    break;
                case 1:
                    linearInterpolator = linearInterpolator2;
                    oooO00o2 = oooO00o3;
                    pointF = pointFOooO0O4;
                    pointF2 = pointFOooO0O5;
                    tOooO00o4 = o00o000o2.OooO00o(jsonReader, f);
                    pointFOooO0O4 = pointF;
                    pointFOooO0O5 = pointF2;
                    linearInterpolator2 = linearInterpolator;
                    oooO00o3 = oooO00o2;
                    i = 1;
                    break;
                case 2:
                    linearInterpolator = linearInterpolator2;
                    oooO00o2 = oooO00o3;
                    pointF = pointFOooO0O4;
                    pointF2 = pointFOooO0O5;
                    tOooO00o3 = o00o000o2.OooO00o(jsonReader, f);
                    pointFOooO0O4 = pointF;
                    pointFOooO0O5 = pointF2;
                    linearInterpolator2 = linearInterpolator;
                    oooO00o3 = oooO00o2;
                    i = 1;
                    break;
                case 3:
                    linearInterpolator = linearInterpolator2;
                    oooO00o2 = oooO00o3;
                    pointF = pointFOooO0O4;
                    if (jsonReader.Oooo0() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.OooO0OO();
                        float fOooOo3 = 0.0f;
                        float fOooOo4 = 0.0f;
                        float fOooOo5 = 0.0f;
                        float fOooOo6 = 0.0f;
                        while (jsonReader.OooOo00()) {
                            int iOooo0OO2 = jsonReader.Oooo0OO(oooO00o7);
                            if (iOooo0OO2 == 0) {
                                pointF3 = pointFOooO0O5;
                                JsonReader.Token tokenOooo0 = jsonReader.Oooo0();
                                JsonReader.Token token = JsonReader.Token.NUMBER;
                                if (tokenOooo0 == token) {
                                    fOooOo5 = (float) jsonReader.OooOo();
                                    pointFOooO0O5 = pointF3;
                                    fOooOo3 = fOooOo5;
                                } else {
                                    jsonReader.OooO00o();
                                    fOooOo3 = (float) jsonReader.OooOo();
                                    fOooOo5 = jsonReader.Oooo0() == token ? (float) jsonReader.OooOo() : fOooOo3;
                                    jsonReader.OooO0oO();
                                    pointFOooO0O5 = pointF3;
                                }
                            } else if (iOooo0OO2 != 1) {
                                jsonReader.Oooo0o();
                            } else {
                                JsonReader.Token tokenOooo1 = jsonReader.Oooo0();
                                JsonReader.Token token2 = JsonReader.Token.NUMBER;
                                if (tokenOooo1 == token2) {
                                    fOooOo6 = (float) jsonReader.OooOo();
                                    fOooOo4 = fOooOo6;
                                } else {
                                    jsonReader.OooO00o();
                                    pointF3 = pointFOooO0O5;
                                    fOooOo4 = (float) jsonReader.OooOo();
                                    fOooOo6 = jsonReader.Oooo0() == token2 ? (float) jsonReader.OooOo() : fOooOo4;
                                    jsonReader.OooO0oO();
                                    pointFOooO0O5 = pointF3;
                                }
                            }
                        }
                        pointF2 = pointFOooO0O5;
                        PointF pointF9 = new PointF(fOooOo3, fOooOo4);
                        PointF pointF10 = new PointF(fOooOo5, fOooOo6);
                        jsonReader.OooOOo0();
                        pointF8 = pointF10;
                        pointF7 = pointF9;
                    } else {
                        pointF2 = pointFOooO0O5;
                        pointFOooO0O6 = o000.OooO0O0(jsonReader, f);
                    }
                    pointFOooO0O4 = pointF;
                    pointFOooO0O5 = pointF2;
                    linearInterpolator2 = linearInterpolator;
                    oooO00o3 = oooO00o2;
                    i = 1;
                    break;
                case 4:
                    linearInterpolator = linearInterpolator2;
                    if (jsonReader.Oooo0() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.OooO0OO();
                        float fOooOo7 = 0.0f;
                        float fOooOo8 = 0.0f;
                        float fOooOo9 = 0.0f;
                        float fOooOo10 = 0.0f;
                        while (jsonReader.OooOo00()) {
                            JsonReader.OooO00o oooO00o8 = oooO00o3;
                            int iOooo0OO3 = jsonReader.Oooo0OO(oooO00o7);
                            if (iOooo0OO3 != 0) {
                                pointF4 = pointFOooO0O4;
                                if (iOooo0OO3 != 1) {
                                    jsonReader.Oooo0o();
                                } else {
                                    JsonReader.Token tokenOooo2 = jsonReader.Oooo0();
                                    JsonReader.Token token3 = JsonReader.Token.NUMBER;
                                    if (tokenOooo2 == token3) {
                                        fOooOo8 = (float) jsonReader.OooOo();
                                        fOooOo10 = fOooOo8;
                                    } else {
                                        jsonReader.OooO00o();
                                        fOooOo8 = (float) jsonReader.OooOo();
                                        fOooOo10 = jsonReader.Oooo0() == token3 ? (float) jsonReader.OooOo() : fOooOo8;
                                        jsonReader.OooO0oO();
                                    }
                                }
                            } else {
                                pointF4 = pointFOooO0O4;
                                JsonReader.Token tokenOooo3 = jsonReader.Oooo0();
                                JsonReader.Token token4 = JsonReader.Token.NUMBER;
                                if (tokenOooo3 == token4) {
                                    fOooOo7 = (float) jsonReader.OooOo();
                                    fOooOo9 = fOooOo7;
                                } else {
                                    jsonReader.OooO00o();
                                    fOooOo7 = (float) jsonReader.OooOo();
                                    fOooOo9 = jsonReader.Oooo0() == token4 ? (float) jsonReader.OooOo() : fOooOo7;
                                    jsonReader.OooO0oO();
                                }
                            }
                            pointFOooO0O4 = pointF4;
                            oooO00o3 = oooO00o8;
                        }
                        oooO00o2 = oooO00o3;
                        pointF = pointFOooO0O4;
                        PointF pointF11 = new PointF(fOooOo7, fOooOo8);
                        PointF pointF12 = new PointF(fOooOo9, fOooOo10);
                        jsonReader.OooOOo0();
                        pointF6 = pointF12;
                        pointF5 = pointF11;
                        pointF2 = pointFOooO0O5;
                    } else {
                        oooO00o2 = oooO00o3;
                        pointF = pointFOooO0O4;
                        pointFOooO0O7 = o000.OooO0O0(jsonReader, f);
                        pointF2 = pointFOooO0O5;
                    }
                    pointFOooO0O4 = pointF;
                    pointFOooO0O5 = pointF2;
                    linearInterpolator2 = linearInterpolator;
                    oooO00o3 = oooO00o2;
                    i = 1;
                    break;
                case 5:
                    i2 = jsonReader.OooOooO() == i ? i : 0;
                    linearInterpolator = linearInterpolator2;
                    oooO00o2 = oooO00o3;
                    pointF2 = pointFOooO0O5;
                    pointFOooO0O5 = pointF2;
                    linearInterpolator2 = linearInterpolator;
                    oooO00o3 = oooO00o2;
                    i = 1;
                    break;
                case 6:
                    pointFOooO0O5 = o000.OooO0O0(jsonReader, f);
                    break;
                case 7:
                    pointFOooO0O4 = o000.OooO0O0(jsonReader, f);
                    linearInterpolator = linearInterpolator2;
                    oooO00o2 = oooO00o3;
                    pointF2 = pointFOooO0O5;
                    pointFOooO0O5 = pointF2;
                    linearInterpolator2 = linearInterpolator;
                    oooO00o3 = oooO00o2;
                    i = 1;
                    break;
                default:
                    linearInterpolator = linearInterpolator2;
                    oooO00o2 = oooO00o3;
                    pointF = pointFOooO0O4;
                    pointF2 = pointFOooO0O5;
                    jsonReader.Oooo0o();
                    pointFOooO0O4 = pointF;
                    pointFOooO0O5 = pointF2;
                    linearInterpolator2 = linearInterpolator;
                    oooO00o3 = oooO00o2;
                    i = 1;
                    break;
            }
        }
        LinearInterpolator linearInterpolator3 = linearInterpolator2;
        PointF pointF13 = pointFOooO0O4;
        PointF pointF14 = pointFOooO0O5;
        jsonReader.OooOOo0();
        if (i2 == 0) {
            if (pointFOooO0O6 != null && pointFOooO0O7 != null) {
                interpolatorOooO00o4 = OooO00o(pointFOooO0O6, pointFOooO0O7);
                t2 = tOooO00o3;
                interpolatorOooO00o2 = null;
                interpolatorOooO00o3 = null;
            } else if (pointF7 != null && pointF8 != null && pointF5 != null && pointF6 != null) {
                interpolatorOooO00o2 = OooO00o(pointF7, pointF5);
                interpolatorOooO00o3 = OooO00o(pointF8, pointF6);
                t2 = tOooO00o3;
                interpolatorOooO00o4 = null;
            }
            if (interpolatorOooO00o2 != null || interpolatorOooO00o3 == null) {
                oooO00o = new o00O0O00.OooO00o<>(oooOO1, tOooO00o4, t2, interpolatorOooO00o4, fOooOo2, (Float) null);
            } else {
                oooO00o = new o00O0O00.OooO00o<>(oooOO1, tOooO00o4, t2, interpolatorOooO00o2, interpolatorOooO00o3, fOooOo2);
            }
            oooO00o.f36515OooOOOO = pointF14;
            oooO00o.f36516OooOOOo = pointF13;
            return oooO00o;
        }
        tOooO00o3 = tOooO00o4;
        interpolatorOooO00o4 = linearInterpolator3;
        t2 = tOooO00o3;
        interpolatorOooO00o2 = null;
        interpolatorOooO00o3 = null;
        if (interpolatorOooO00o2 != null) {
            oooO00o = new o00O0O00.OooO00o<>(oooOO1, tOooO00o4, t2, interpolatorOooO00o4, fOooOo2, (Float) null);
        } else {
            oooO00o = new o00O0O00.OooO00o<>(oooOO1, tOooO00o4, t2, interpolatorOooO00o4, fOooOo2, (Float) null);
        }
        oooO00o.f36515OooOOOO = pointF14;
        oooO00o.f36516OooOOOo = pointF13;
        return oooO00o;
    }

    public static void OooO0OO(int i, WeakReference<Interpolator> weakReference) {
        synchronized (o000O000.class) {
            f36474OooO0O0.OooO0oo(i, weakReference);
        }
    }
}
