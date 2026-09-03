package o00OO;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static p190o00o0O.Oooo000<WeakReference<Interpolator>> f36913OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final LinearInterpolator f36912OooO00o = new LinearInterpolator();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final JsonReader.OooO00o f36914OooO0OO = JsonReader.OooO00o.OooO00o("t", "s", "e", "o", "i", "h", "to", "ti");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final JsonReader.OooO00o f36915OooO0Oo = JsonReader.OooO00o.OooO00o("x", "y");

    public static Interpolator OooO00o(PointF pointF, PointF pointF2) {
        WeakReference weakReference;
        Interpolator interpolatorOooO0O0;
        pointF.x = o00OOO0.OooOOO.OooO0O0(pointF.x, -1.0f, 1.0f);
        pointF.y = o00OOO0.OooOOO.OooO0O0(pointF.y, -100.0f, 100.0f);
        pointF2.x = o00OOO0.OooOOO.OooO0O0(pointF2.x, -1.0f, 1.0f);
        float fOooO0O0 = o00OOO0.OooOOO.OooO0O0(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fOooO0O0;
        float f = pointF.x;
        float f2 = pointF.y;
        float f3 = pointF2.x;
        o00OOO0.OooOOOO.OooO00o oooO00o = o00OOO0.OooOOOO.f37429OooO00o;
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
        synchronized (oo000o.class) {
            if (f36913OooO0O0 == null) {
                f36913OooO0O0 = new p190o00o0O.Oooo000<>();
            }
            weakReference = (WeakReference) f36913OooO0O0.OooO0o(i, null);
        }
        Interpolator interpolator = weakReference != null ? (Interpolator) weakReference.get() : null;
        if (weakReference == null || interpolator == null) {
            try {
                interpolatorOooO0O0 = o0000OO0.OooO00o.OooO0O0(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                interpolatorOooO0O0 = "The Path cannot loop back on itself.".equals(e.getMessage()) ? o0000OO0.OooO00o.OooO0O0(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
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
    public static <T> o00OOO0O.OooO00o<T> OooO0O0(JsonReader jsonReader, com.airbnb.lottie.OooOO0 oooOO1, float f, o0000O00<T> o0000o00, boolean z, boolean z2) throws IOException {
        Interpolator interpolatorOooO00o;
        T t;
        Interpolator interpolatorOooO00o2;
        Interpolator interpolatorOooO00o3;
        T t2;
        Interpolator interpolatorOooO00o4;
        o00OOO0O.OooO00o<T> oooO00o;
        LinearInterpolator linearInterpolator;
        JsonReader.OooO00o oooO00o2;
        PointF pointF;
        PointF pointF2;
        PointF pointF3;
        PointF pointF4;
        LinearInterpolator linearInterpolator2 = f36912OooO00o;
        int i = 1;
        JsonReader.OooO00o oooO00o3 = f36914OooO0OO;
        if (!z || !z2) {
            JsonReader.OooO00o oooO00o4 = oooO00o3;
            if (!z) {
                return new o00OOO0O.OooO00o<>(o0000o00.OooO00o(jsonReader, f));
            }
            jsonReader.OooO0OO();
            T tOooO00o = null;
            PointF pointFOooO0O0 = null;
            boolean z3 = false;
            float fOooOoO = 0.0f;
            PointF pointFOooO0O1 = null;
            PointF pointFOooO0O2 = null;
            PointF pointFOooO0O3 = null;
            T tOooO00o2 = null;
            while (jsonReader.OooOo0O()) {
                JsonReader.OooO00o oooO00o5 = oooO00o4;
                switch (jsonReader.Oooo0oO(oooO00o5)) {
                    case 0:
                        fOooOoO = (float) jsonReader.OooOoO();
                        oooO00o4 = oooO00o5;
                        break;
                    case 1:
                        tOooO00o = o0000o00.OooO00o(jsonReader, f);
                        oooO00o4 = oooO00o5;
                        break;
                    case 2:
                        tOooO00o2 = o0000o00.OooO00o(jsonReader, f);
                        oooO00o4 = oooO00o5;
                        break;
                    case 3:
                        pointFOooO0O1 = o00Ooo.OooO0O0(jsonReader, 1.0f);
                        oooO00o4 = oooO00o5;
                        break;
                    case 4:
                        pointFOooO0O0 = o00Ooo.OooO0O0(jsonReader, 1.0f);
                        oooO00o4 = oooO00o5;
                        break;
                    case 5:
                        oooO00o4 = oooO00o5;
                        z3 = jsonReader.Oooo00O() == 1;
                        break;
                    case 6:
                        pointFOooO0O2 = o00Ooo.OooO0O0(jsonReader, f);
                        oooO00o4 = oooO00o5;
                        break;
                    case 7:
                        pointFOooO0O3 = o00Ooo.OooO0O0(jsonReader, f);
                        oooO00o4 = oooO00o5;
                        break;
                    default:
                        jsonReader.Oooo();
                        oooO00o4 = oooO00o5;
                        break;
                }
            }
            jsonReader.OooOOoo();
            if (z3) {
                t = tOooO00o;
                interpolatorOooO00o = linearInterpolator2;
            } else {
                interpolatorOooO00o = (pointFOooO0O1 == null || pointFOooO0O0 == null) ? linearInterpolator2 : OooO00o(pointFOooO0O1, pointFOooO0O0);
                t = tOooO00o2;
            }
            o00OOO0O.OooO00o<T> oooO00o6 = new o00OOO0O.OooO00o<>(oooOO1, tOooO00o, t, interpolatorOooO00o, fOooOoO, (Float) null);
            oooO00o6.f37449OooOOOO = pointFOooO0O2;
            oooO00o6.f37450OooOOOo = pointFOooO0O3;
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
        float fOooOoO2 = 0.0f;
        while (jsonReader.OooOo0O()) {
            int iOooo0oO = jsonReader.Oooo0oO(oooO00o3);
            JsonReader.OooO00o oooO00o7 = f36915OooO0Oo;
            switch (iOooo0oO) {
                case 0:
                    linearInterpolator = linearInterpolator2;
                    oooO00o2 = oooO00o3;
                    pointF = pointFOooO0O4;
                    pointF2 = pointFOooO0O5;
                    fOooOoO2 = (float) jsonReader.OooOoO();
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
                    tOooO00o4 = o0000o00.OooO00o(jsonReader, f);
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
                    tOooO00o3 = o0000o00.OooO00o(jsonReader, f);
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
                    if (jsonReader.Oooo0OO() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.OooO0OO();
                        float fOooOoO3 = 0.0f;
                        float fOooOoO4 = 0.0f;
                        float fOooOoO5 = 0.0f;
                        float fOooOoO6 = 0.0f;
                        while (jsonReader.OooOo0O()) {
                            int iOooo0oO2 = jsonReader.Oooo0oO(oooO00o7);
                            if (iOooo0oO2 == 0) {
                                pointF3 = pointFOooO0O5;
                                JsonReader.Token tokenOooo0OO = jsonReader.Oooo0OO();
                                JsonReader.Token token = JsonReader.Token.NUMBER;
                                if (tokenOooo0OO == token) {
                                    fOooOoO5 = (float) jsonReader.OooOoO();
                                    pointFOooO0O5 = pointF3;
                                    fOooOoO3 = fOooOoO5;
                                } else {
                                    jsonReader.OooO00o();
                                    fOooOoO3 = (float) jsonReader.OooOoO();
                                    fOooOoO5 = jsonReader.Oooo0OO() == token ? (float) jsonReader.OooOoO() : fOooOoO3;
                                    jsonReader.OooO0oO();
                                    pointFOooO0O5 = pointF3;
                                }
                            } else if (iOooo0oO2 != 1) {
                                jsonReader.Oooo();
                            } else {
                                JsonReader.Token tokenOooo0OO2 = jsonReader.Oooo0OO();
                                JsonReader.Token token2 = JsonReader.Token.NUMBER;
                                if (tokenOooo0OO2 == token2) {
                                    fOooOoO6 = (float) jsonReader.OooOoO();
                                    fOooOoO4 = fOooOoO6;
                                } else {
                                    jsonReader.OooO00o();
                                    pointF3 = pointFOooO0O5;
                                    fOooOoO4 = (float) jsonReader.OooOoO();
                                    fOooOoO6 = jsonReader.Oooo0OO() == token2 ? (float) jsonReader.OooOoO() : fOooOoO4;
                                    jsonReader.OooO0oO();
                                    pointFOooO0O5 = pointF3;
                                }
                            }
                        }
                        pointF2 = pointFOooO0O5;
                        PointF pointF9 = new PointF(fOooOoO3, fOooOoO4);
                        PointF pointF10 = new PointF(fOooOoO5, fOooOoO6);
                        jsonReader.OooOOoo();
                        pointF8 = pointF10;
                        pointF7 = pointF9;
                    } else {
                        pointF2 = pointFOooO0O5;
                        pointFOooO0O6 = o00Ooo.OooO0O0(jsonReader, f);
                    }
                    pointFOooO0O4 = pointF;
                    pointFOooO0O5 = pointF2;
                    linearInterpolator2 = linearInterpolator;
                    oooO00o3 = oooO00o2;
                    i = 1;
                    break;
                case 4:
                    linearInterpolator = linearInterpolator2;
                    if (jsonReader.Oooo0OO() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.OooO0OO();
                        float fOooOoO7 = 0.0f;
                        float fOooOoO8 = 0.0f;
                        float fOooOoO9 = 0.0f;
                        float fOooOoO10 = 0.0f;
                        while (jsonReader.OooOo0O()) {
                            JsonReader.OooO00o oooO00o8 = oooO00o3;
                            int iOooo0oO3 = jsonReader.Oooo0oO(oooO00o7);
                            if (iOooo0oO3 != 0) {
                                pointF4 = pointFOooO0O4;
                                if (iOooo0oO3 != 1) {
                                    jsonReader.Oooo();
                                } else {
                                    JsonReader.Token tokenOooo0OO3 = jsonReader.Oooo0OO();
                                    JsonReader.Token token3 = JsonReader.Token.NUMBER;
                                    if (tokenOooo0OO3 == token3) {
                                        fOooOoO8 = (float) jsonReader.OooOoO();
                                        fOooOoO10 = fOooOoO8;
                                    } else {
                                        jsonReader.OooO00o();
                                        fOooOoO8 = (float) jsonReader.OooOoO();
                                        fOooOoO10 = jsonReader.Oooo0OO() == token3 ? (float) jsonReader.OooOoO() : fOooOoO8;
                                        jsonReader.OooO0oO();
                                    }
                                }
                            } else {
                                pointF4 = pointFOooO0O4;
                                JsonReader.Token tokenOooo0OO4 = jsonReader.Oooo0OO();
                                JsonReader.Token token4 = JsonReader.Token.NUMBER;
                                if (tokenOooo0OO4 == token4) {
                                    fOooOoO7 = (float) jsonReader.OooOoO();
                                    fOooOoO9 = fOooOoO7;
                                } else {
                                    jsonReader.OooO00o();
                                    fOooOoO7 = (float) jsonReader.OooOoO();
                                    fOooOoO9 = jsonReader.Oooo0OO() == token4 ? (float) jsonReader.OooOoO() : fOooOoO7;
                                    jsonReader.OooO0oO();
                                }
                            }
                            pointFOooO0O4 = pointF4;
                            oooO00o3 = oooO00o8;
                        }
                        oooO00o2 = oooO00o3;
                        pointF = pointFOooO0O4;
                        PointF pointF11 = new PointF(fOooOoO7, fOooOoO8);
                        PointF pointF12 = new PointF(fOooOoO9, fOooOoO10);
                        jsonReader.OooOOoo();
                        pointF6 = pointF12;
                        pointF5 = pointF11;
                        pointF2 = pointFOooO0O5;
                    } else {
                        oooO00o2 = oooO00o3;
                        pointF = pointFOooO0O4;
                        pointFOooO0O7 = o00Ooo.OooO0O0(jsonReader, f);
                        pointF2 = pointFOooO0O5;
                    }
                    pointFOooO0O4 = pointF;
                    pointFOooO0O5 = pointF2;
                    linearInterpolator2 = linearInterpolator;
                    oooO00o3 = oooO00o2;
                    i = 1;
                    break;
                case 5:
                    i2 = jsonReader.Oooo00O() == i ? i : 0;
                    linearInterpolator = linearInterpolator2;
                    oooO00o2 = oooO00o3;
                    pointF2 = pointFOooO0O5;
                    pointFOooO0O5 = pointF2;
                    linearInterpolator2 = linearInterpolator;
                    oooO00o3 = oooO00o2;
                    i = 1;
                    break;
                case 6:
                    pointFOooO0O5 = o00Ooo.OooO0O0(jsonReader, f);
                    break;
                case 7:
                    pointFOooO0O4 = o00Ooo.OooO0O0(jsonReader, f);
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
                    jsonReader.Oooo();
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
        jsonReader.OooOOoo();
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
                oooO00o = new o00OOO0O.OooO00o<>(oooOO1, tOooO00o4, t2, interpolatorOooO00o4, fOooOoO2, (Float) null);
            } else {
                oooO00o = new o00OOO0O.OooO00o<>(oooOO1, tOooO00o4, t2, interpolatorOooO00o2, interpolatorOooO00o3, fOooOoO2);
            }
            oooO00o.f37449OooOOOO = pointF14;
            oooO00o.f37450OooOOOo = pointF13;
            return oooO00o;
        }
        tOooO00o3 = tOooO00o4;
        interpolatorOooO00o4 = linearInterpolator3;
        t2 = tOooO00o3;
        interpolatorOooO00o2 = null;
        interpolatorOooO00o3 = null;
        if (interpolatorOooO00o2 != null) {
            oooO00o = new o00OOO0O.OooO00o<>(oooOO1, tOooO00o4, t2, interpolatorOooO00o4, fOooOoO2, (Float) null);
        } else {
            oooO00o = new o00OOO0O.OooO00o<>(oooOO1, tOooO00o4, t2, interpolatorOooO00o4, fOooOoO2, (Float) null);
        }
        oooO00o.f37449OooOOOO = pointF14;
        oooO00o.f37450OooOOOo = pointF13;
        return oooO00o;
    }

    public static void OooO0OO(int i, WeakReference<Interpolator> weakReference) {
        synchronized (oo000o.class) {
            f36913OooO0O0.OooO0oo(i, weakReference);
        }
    }
}
