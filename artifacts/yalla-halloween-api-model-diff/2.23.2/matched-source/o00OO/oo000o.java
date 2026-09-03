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
    public static p190o00o0O.Oooo000<WeakReference<Interpolator>> f36917OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final LinearInterpolator f36916OooO00o = new LinearInterpolator();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final JsonReader.OooO00o f36918OooO0OO = JsonReader.OooO00o.OooO00o("t", "s", "e", "o", "i", "h", "to", "ti");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final JsonReader.OooO00o f36919OooO0Oo = JsonReader.OooO00o.OooO00o("x", "y");

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
        o00OOO0.OooOOOO.OooO00o oooO00o = o00OOO0.OooOOOO.f37433OooO00o;
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
            if (f36917OooO0O0 == null) {
                f36917OooO0O0 = new p190o00o0O.Oooo000<>();
            }
            weakReference = (WeakReference) f36917OooO0O0.OooO0o(i, null);
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
        LinearInterpolator linearInterpolator2 = f36916OooO00o;
        int i = 1;
        JsonReader.OooO00o oooO00o3 = f36918OooO0OO;
        if (!z || !z2) {
            JsonReader.OooO00o oooO00o4 = oooO00o3;
            if (!z) {
                return new o00OOO0O.OooO00o<>(o0000o00.OooO00o(jsonReader, f));
            }
            jsonReader.OooO0OO();
            T tOooO00o = null;
            PointF pointFOooO0O0 = null;
            boolean z3 = false;
            float fOooOooo = 0.0f;
            PointF pointFOooO0O1 = null;
            PointF pointFOooO0O2 = null;
            PointF pointFOooO0O3 = null;
            T tOooO00o2 = null;
            while (jsonReader.OooOo0()) {
                JsonReader.OooO00o oooO00o5 = oooO00o4;
                switch (jsonReader.Oooo0o0(oooO00o5)) {
                    case 0:
                        fOooOooo = (float) jsonReader.OooOooo();
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
                        z3 = jsonReader.Oooo00o() == 1;
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
                        jsonReader.OoooO00();
                        oooO00o4 = oooO00o5;
                        break;
                }
            }
            jsonReader.OooOOo();
            if (z3) {
                t = tOooO00o;
                interpolatorOooO00o = linearInterpolator2;
            } else {
                interpolatorOooO00o = (pointFOooO0O1 == null || pointFOooO0O0 == null) ? linearInterpolator2 : OooO00o(pointFOooO0O1, pointFOooO0O0);
                t = tOooO00o2;
            }
            o00OOO0O.OooO00o<T> oooO00o6 = new o00OOO0O.OooO00o<>(oooOO1, tOooO00o, t, interpolatorOooO00o, fOooOooo, (Float) null);
            oooO00o6.f37453OooOOOO = pointFOooO0O2;
            oooO00o6.f37454OooOOOo = pointFOooO0O3;
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
        float fOooOooo2 = 0.0f;
        while (jsonReader.OooOo0()) {
            int iOooo0o0 = jsonReader.Oooo0o0(oooO00o3);
            JsonReader.OooO00o oooO00o7 = f36919OooO0Oo;
            switch (iOooo0o0) {
                case 0:
                    linearInterpolator = linearInterpolator2;
                    oooO00o2 = oooO00o3;
                    pointF = pointFOooO0O4;
                    pointF2 = pointFOooO0O5;
                    fOooOooo2 = (float) jsonReader.OooOooo();
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
                    if (jsonReader.Oooo0O0() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.OooO0OO();
                        float fOooOooo3 = 0.0f;
                        float fOooOooo4 = 0.0f;
                        float fOooOooo5 = 0.0f;
                        float fOooOooo6 = 0.0f;
                        while (jsonReader.OooOo0()) {
                            int iOooo0o1 = jsonReader.Oooo0o0(oooO00o7);
                            if (iOooo0o1 == 0) {
                                pointF3 = pointFOooO0O5;
                                JsonReader.Token tokenOooo0O0 = jsonReader.Oooo0O0();
                                JsonReader.Token token = JsonReader.Token.NUMBER;
                                if (tokenOooo0O0 == token) {
                                    fOooOooo5 = (float) jsonReader.OooOooo();
                                    pointFOooO0O5 = pointF3;
                                    fOooOooo3 = fOooOooo5;
                                } else {
                                    jsonReader.OooO00o();
                                    fOooOooo3 = (float) jsonReader.OooOooo();
                                    fOooOooo5 = jsonReader.Oooo0O0() == token ? (float) jsonReader.OooOooo() : fOooOooo3;
                                    jsonReader.OooO0oO();
                                    pointFOooO0O5 = pointF3;
                                }
                            } else if (iOooo0o1 != 1) {
                                jsonReader.OoooO00();
                            } else {
                                JsonReader.Token tokenOooo0O1 = jsonReader.Oooo0O0();
                                JsonReader.Token token2 = JsonReader.Token.NUMBER;
                                if (tokenOooo0O1 == token2) {
                                    fOooOooo6 = (float) jsonReader.OooOooo();
                                    fOooOooo4 = fOooOooo6;
                                } else {
                                    jsonReader.OooO00o();
                                    pointF3 = pointFOooO0O5;
                                    fOooOooo4 = (float) jsonReader.OooOooo();
                                    fOooOooo6 = jsonReader.Oooo0O0() == token2 ? (float) jsonReader.OooOooo() : fOooOooo4;
                                    jsonReader.OooO0oO();
                                    pointFOooO0O5 = pointF3;
                                }
                            }
                        }
                        pointF2 = pointFOooO0O5;
                        PointF pointF9 = new PointF(fOooOooo3, fOooOooo4);
                        PointF pointF10 = new PointF(fOooOooo5, fOooOooo6);
                        jsonReader.OooOOo();
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
                    if (jsonReader.Oooo0O0() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.OooO0OO();
                        float fOooOooo7 = 0.0f;
                        float fOooOooo8 = 0.0f;
                        float fOooOooo9 = 0.0f;
                        float fOooOooo10 = 0.0f;
                        while (jsonReader.OooOo0()) {
                            JsonReader.OooO00o oooO00o8 = oooO00o3;
                            int iOooo0o2 = jsonReader.Oooo0o0(oooO00o7);
                            if (iOooo0o2 != 0) {
                                pointF4 = pointFOooO0O4;
                                if (iOooo0o2 != 1) {
                                    jsonReader.OoooO00();
                                } else {
                                    JsonReader.Token tokenOooo0O2 = jsonReader.Oooo0O0();
                                    JsonReader.Token token3 = JsonReader.Token.NUMBER;
                                    if (tokenOooo0O2 == token3) {
                                        fOooOooo8 = (float) jsonReader.OooOooo();
                                        fOooOooo10 = fOooOooo8;
                                    } else {
                                        jsonReader.OooO00o();
                                        fOooOooo8 = (float) jsonReader.OooOooo();
                                        fOooOooo10 = jsonReader.Oooo0O0() == token3 ? (float) jsonReader.OooOooo() : fOooOooo8;
                                        jsonReader.OooO0oO();
                                    }
                                }
                            } else {
                                pointF4 = pointFOooO0O4;
                                JsonReader.Token tokenOooo0O3 = jsonReader.Oooo0O0();
                                JsonReader.Token token4 = JsonReader.Token.NUMBER;
                                if (tokenOooo0O3 == token4) {
                                    fOooOooo7 = (float) jsonReader.OooOooo();
                                    fOooOooo9 = fOooOooo7;
                                } else {
                                    jsonReader.OooO00o();
                                    fOooOooo7 = (float) jsonReader.OooOooo();
                                    fOooOooo9 = jsonReader.Oooo0O0() == token4 ? (float) jsonReader.OooOooo() : fOooOooo7;
                                    jsonReader.OooO0oO();
                                }
                            }
                            pointFOooO0O4 = pointF4;
                            oooO00o3 = oooO00o8;
                        }
                        oooO00o2 = oooO00o3;
                        pointF = pointFOooO0O4;
                        PointF pointF11 = new PointF(fOooOooo7, fOooOooo8);
                        PointF pointF12 = new PointF(fOooOooo9, fOooOooo10);
                        jsonReader.OooOOo();
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
                    i2 = jsonReader.Oooo00o() == i ? i : 0;
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
                    jsonReader.OoooO00();
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
        jsonReader.OooOOo();
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
                oooO00o = new o00OOO0O.OooO00o<>(oooOO1, tOooO00o4, t2, interpolatorOooO00o4, fOooOooo2, (Float) null);
            } else {
                oooO00o = new o00OOO0O.OooO00o<>(oooOO1, tOooO00o4, t2, interpolatorOooO00o2, interpolatorOooO00o3, fOooOooo2);
            }
            oooO00o.f37453OooOOOO = pointF14;
            oooO00o.f37454OooOOOo = pointF13;
            return oooO00o;
        }
        tOooO00o3 = tOooO00o4;
        interpolatorOooO00o4 = linearInterpolator3;
        t2 = tOooO00o3;
        interpolatorOooO00o2 = null;
        interpolatorOooO00o3 = null;
        if (interpolatorOooO00o2 != null) {
            oooO00o = new o00OOO0O.OooO00o<>(oooOO1, tOooO00o4, t2, interpolatorOooO00o4, fOooOooo2, (Float) null);
        } else {
            oooO00o = new o00OOO0O.OooO00o<>(oooOO1, tOooO00o4, t2, interpolatorOooO00o4, fOooOooo2, (Float) null);
        }
        oooO00o.f37453OooOOOO = pointF14;
        oooO00o.f37454OooOOOo = pointF13;
        return oooO00o;
    }

    public static void OooO0OO(int i, WeakReference<Interpolator> weakReference) {
        synchronized (oo000o.class) {
            f36917OooO0O0.OooO0oo(i, weakReference);
        }
    }
}
