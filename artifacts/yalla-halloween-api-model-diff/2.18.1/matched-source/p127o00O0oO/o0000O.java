package p127o00O0oO;

import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.airbnb.lottie.OooOO0O;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.umeng.analytics.pro.ak;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.IOException;
import java.lang.ref.WeakReference;
import p021OooOooo.o0ooOOo;
import p073o000O0oO.OooOO0;
import p129o00O0oOo.o000O0;
import p129o00O0oOo.o000O0Oo;
import p131o00O0oo0.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static o0ooOOo<WeakReference<Interpolator>> f31088OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final LinearInterpolator f31087OooO00o = new LinearInterpolator();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static JsonReader.OooO00o f31089OooO0OO = JsonReader.OooO00o.OooO00o(ak.aH, ak.aB, "e", "o", ak.aC, "h", "to", "ti");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static JsonReader.OooO00o f31090OooO0Oo = JsonReader.OooO00o.OooO00o("x", "y");

    public static Interpolator OooO00o(PointF pointF, PointF pointF2) {
        WeakReference<Interpolator> weakReferenceOooO0oO;
        Interpolator interpolatorOooO0O0;
        pointF.x = o000O0.OooO0O0(pointF.x, -1.0f, 1.0f);
        pointF.y = o000O0.OooO0O0(pointF.y, -100.0f, 100.0f);
        pointF2.x = o000O0.OooO0O0(pointF2.x, -1.0f, 1.0f);
        float fOooO0O0 = o000O0.OooO0O0(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fOooO0O0;
        float f = pointF.x;
        float f2 = pointF.y;
        float f3 = pointF2.x;
        ThreadLocal<PathMeasure> threadLocal = o000O0Oo.f31141OooO00o;
        int i = f != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? (int) (527 * f) : 17;
        if (f2 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            i = (int) (i * 31 * f3);
        }
        if (fOooO0O0 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            i = (int) (i * 31 * fOooO0O0);
        }
        synchronized (o0000O.class) {
            if (f31088OooO0O0 == null) {
                f31088OooO0O0 = new o0ooOOo<>();
            }
            weakReferenceOooO0oO = f31088OooO0O0.OooO0oO(i, null);
        }
        Interpolator interpolator = weakReferenceOooO0oO != null ? weakReferenceOooO0oO.get() : null;
        if (weakReferenceOooO0oO == null || interpolator == null) {
            try {
                interpolatorOooO0O0 = OooOO0.OooO0O0(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                interpolatorOooO0O0 = "The Path cannot loop back on itself.".equals(e.getMessage()) ? OooOO0.OooO0O0(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE), pointF2.y) : new LinearInterpolator();
            }
            interpolator = interpolatorOooO0O0;
            try {
                WeakReference<Interpolator> weakReference = new WeakReference<>(interpolator);
                synchronized (o0000O.class) {
                    f31088OooO0O0.OooOO0O(i, weakReference);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator;
    }

    /* JADX WARN: Code duplicated, block: B:96:0x01f5  */
    public static <T> o000OOo<T> OooO0O0(JsonReader jsonReader, OooOO0O oooOO0O, float f, o0O0ooO<T> o0o0ooo, boolean z, boolean z2) throws IOException {
        Interpolator interpolatorOooO00o;
        T t;
        Interpolator interpolatorOooO00o2;
        Interpolator interpolatorOooO00o3;
        Interpolator interpolatorOooO00o4;
        T t2;
        o000OOo<T> o000ooo2;
        PointF pointF;
        PointF pointF2;
        float f2;
        float f3;
        PointF pointF3;
        int i = 1;
        if (!z || !z2) {
            if (!z) {
                return new o000OOo<>(o0o0ooo.OooO00o(jsonReader, f));
            }
            jsonReader.OooO0O0();
            PointF pointFOooO0O0 = null;
            PointF pointFOooO0O1 = null;
            PointF pointFOooO0O2 = null;
            PointF pointFOooO0O3 = null;
            T tOooO00o = null;
            float fOooOOoo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            boolean z3 = false;
            T tOooO00o2 = null;
            while (jsonReader.OooOOO()) {
                switch (jsonReader.Oooo0(f31089OooO0OO)) {
                    case 0:
                        fOooOOoo = (float) jsonReader.OooOOoo();
                        break;
                    case 1:
                        tOooO00o = o0o0ooo.OooO00o(jsonReader, f);
                        break;
                    case 2:
                        tOooO00o2 = o0o0ooo.OooO00o(jsonReader, f);
                        break;
                    case 3:
                        pointFOooO0O3 = o000OO.OooO0O0(jsonReader, 1.0f);
                        break;
                    case 4:
                        pointFOooO0O0 = o000OO.OooO0O0(jsonReader, 1.0f);
                        break;
                    case 5:
                        z3 = jsonReader.OooOo0O() == 1;
                        break;
                    case 6:
                        pointFOooO0O1 = o000OO.OooO0O0(jsonReader, f);
                        break;
                    case 7:
                        pointFOooO0O2 = o000OO.OooO0O0(jsonReader, f);
                        break;
                    default:
                        jsonReader.Oooo0o();
                        break;
                }
            }
            jsonReader.OooO0o();
            if (z3) {
                interpolatorOooO00o = f31087OooO00o;
                t = tOooO00o;
            } else {
                interpolatorOooO00o = (pointFOooO0O3 == null || pointFOooO0O0 == null) ? f31087OooO00o : OooO00o(pointFOooO0O3, pointFOooO0O0);
                t = tOooO00o2;
            }
            o000OOo<T> o000ooo3 = new o000OOo<>(oooOO0O, tOooO00o, t, interpolatorOooO00o, fOooOOoo, (Float) null);
            o000ooo3.f31169OooOOOO = pointFOooO0O1;
            o000ooo3.f31170OooOOOo = pointFOooO0O2;
            return o000ooo3;
        }
        jsonReader.OooO0O0();
        PointF pointF4 = null;
        PointF pointF5 = null;
        PointF pointFOooO0O4 = null;
        boolean z4 = false;
        PointF pointFOooO0O5 = null;
        T tOooO00o3 = null;
        PointF pointFOooO0O6 = null;
        PointF pointF6 = null;
        PointF pointF7 = null;
        float fOooOOoo2 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        PointF pointFOooO0O7 = null;
        T tOooO00o4 = null;
        while (jsonReader.OooOOO()) {
            switch (jsonReader.Oooo0(f31089OooO0OO)) {
                case 0:
                    pointF = pointFOooO0O4;
                    pointF2 = pointFOooO0O7;
                    fOooOOoo2 = (float) jsonReader.OooOOoo();
                    pointFOooO0O7 = pointF2;
                    pointFOooO0O4 = pointF;
                    i = 1;
                    break;
                case 1:
                    pointF = pointFOooO0O4;
                    pointF2 = pointFOooO0O7;
                    tOooO00o3 = o0o0ooo.OooO00o(jsonReader, f);
                    pointFOooO0O7 = pointF2;
                    pointFOooO0O4 = pointF;
                    i = 1;
                    break;
                case 2:
                    pointF = pointFOooO0O4;
                    pointF2 = pointFOooO0O7;
                    tOooO00o4 = o0o0ooo.OooO00o(jsonReader, f);
                    pointFOooO0O7 = pointF2;
                    pointFOooO0O4 = pointF;
                    i = 1;
                    break;
                case 3:
                    pointF = pointFOooO0O4;
                    f2 = fOooOOoo2;
                    pointF2 = pointFOooO0O7;
                    if (jsonReader.OooOoo() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.OooO0O0();
                        float fOooOOoo3 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                        float fOooOOoo4 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                        float fOooOOoo5 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                        float fOooOOoo6 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                        while (jsonReader.OooOOO()) {
                            int iOooo0 = jsonReader.Oooo0(f31090OooO0Oo);
                            if (iOooo0 == 0) {
                                JsonReader.Token tokenOooOoo = jsonReader.OooOoo();
                                JsonReader.Token token = JsonReader.Token.NUMBER;
                                if (tokenOooOoo == token) {
                                    fOooOOoo5 = (float) jsonReader.OooOOoo();
                                    fOooOOoo3 = fOooOOoo5;
                                } else {
                                    jsonReader.OooO00o();
                                    fOooOOoo3 = (float) jsonReader.OooOOoo();
                                    fOooOOoo5 = jsonReader.OooOoo() == token ? (float) jsonReader.OooOOoo() : fOooOOoo3;
                                    jsonReader.OooO0Oo();
                                }
                            } else if (iOooo0 != 1) {
                                jsonReader.Oooo0o();
                            } else {
                                JsonReader.Token tokenOooOoo2 = jsonReader.OooOoo();
                                JsonReader.Token token2 = JsonReader.Token.NUMBER;
                                if (tokenOooOoo2 == token2) {
                                    fOooOOoo6 = (float) jsonReader.OooOOoo();
                                    fOooOOoo4 = fOooOOoo6;
                                } else {
                                    jsonReader.OooO00o();
                                    fOooOOoo4 = (float) jsonReader.OooOOoo();
                                    fOooOOoo6 = jsonReader.OooOoo() == token2 ? (float) jsonReader.OooOOoo() : fOooOOoo4;
                                    jsonReader.OooO0Oo();
                                }
                            }
                        }
                        PointF pointF8 = new PointF(fOooOOoo3, fOooOOoo4);
                        PointF pointF9 = new PointF(fOooOOoo5, fOooOOoo6);
                        jsonReader.OooO0o();
                        pointF6 = pointF8;
                        pointF7 = pointF9;
                        fOooOOoo2 = f2;
                    } else {
                        fOooOOoo2 = f2;
                        pointFOooO0O5 = o000OO.OooO0O0(jsonReader, f);
                    }
                    pointFOooO0O7 = pointF2;
                    pointFOooO0O4 = pointF;
                    i = 1;
                    break;
                case 4:
                    if (jsonReader.OooOoo() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.OooO0O0();
                        float fOooOOoo7 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                        float fOooOOoo8 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                        float fOooOOoo9 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                        float fOooOOoo10 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                        while (jsonReader.OooOOO()) {
                            PointF pointF10 = pointFOooO0O4;
                            int iOooo1 = jsonReader.Oooo0(f31090OooO0Oo);
                            if (iOooo1 != 0) {
                                pointF3 = pointFOooO0O7;
                                if (iOooo1 != 1) {
                                    jsonReader.Oooo0o();
                                } else {
                                    JsonReader.Token tokenOooOoo3 = jsonReader.OooOoo();
                                    JsonReader.Token token3 = JsonReader.Token.NUMBER;
                                    if (tokenOooOoo3 == token3) {
                                        fOooOOoo8 = (float) jsonReader.OooOOoo();
                                        fOooOOoo10 = fOooOOoo8;
                                    } else {
                                        jsonReader.OooO00o();
                                        f3 = fOooOOoo2;
                                        fOooOOoo8 = (float) jsonReader.OooOOoo();
                                        fOooOOoo10 = jsonReader.OooOoo() == token3 ? (float) jsonReader.OooOOoo() : fOooOOoo8;
                                        jsonReader.OooO0Oo();
                                    }
                                }
                                f3 = fOooOOoo2;
                            } else {
                                f3 = fOooOOoo2;
                                pointF3 = pointFOooO0O7;
                                JsonReader.Token tokenOooOoo4 = jsonReader.OooOoo();
                                JsonReader.Token token4 = JsonReader.Token.NUMBER;
                                if (tokenOooOoo4 == token4) {
                                    fOooOOoo7 = (float) jsonReader.OooOOoo();
                                    fOooOOoo9 = fOooOOoo7;
                                } else {
                                    jsonReader.OooO00o();
                                    fOooOOoo7 = (float) jsonReader.OooOOoo();
                                    fOooOOoo9 = jsonReader.OooOoo() == token4 ? (float) jsonReader.OooOOoo() : fOooOOoo7;
                                    jsonReader.OooO0Oo();
                                }
                            }
                            pointFOooO0O7 = pointF3;
                            fOooOOoo2 = f3;
                            pointFOooO0O4 = pointF10;
                        }
                        pointF = pointFOooO0O4;
                        f2 = fOooOOoo2;
                        pointF2 = pointFOooO0O7;
                        PointF pointF11 = new PointF(fOooOOoo7, fOooOOoo8);
                        PointF pointF12 = new PointF(fOooOOoo9, fOooOOoo10);
                        jsonReader.OooO0o();
                        pointF5 = pointF12;
                        pointF4 = pointF11;
                        fOooOOoo2 = f2;
                    } else {
                        pointF = pointFOooO0O4;
                        pointF2 = pointFOooO0O7;
                        pointFOooO0O6 = o000OO.OooO0O0(jsonReader, f);
                    }
                    pointFOooO0O7 = pointF2;
                    pointFOooO0O4 = pointF;
                    i = 1;
                    break;
                case 5:
                    z4 = jsonReader.OooOo0O() == i;
                    break;
                case 6:
                    pointFOooO0O7 = o000OO.OooO0O0(jsonReader, f);
                    break;
                case 7:
                    pointFOooO0O4 = o000OO.OooO0O0(jsonReader, f);
                    break;
                default:
                    pointF = pointFOooO0O4;
                    pointF2 = pointFOooO0O7;
                    jsonReader.Oooo0o();
                    pointFOooO0O7 = pointF2;
                    pointFOooO0O4 = pointF;
                    i = 1;
                    break;
            }
        }
        PointF pointF13 = pointFOooO0O4;
        float f4 = fOooOOoo2;
        PointF pointF14 = pointFOooO0O7;
        jsonReader.OooO0o();
        if (z4) {
            interpolatorOooO00o2 = f31087OooO00o;
            tOooO00o4 = tOooO00o3;
        } else {
            if (pointFOooO0O5 == null || pointFOooO0O6 == null) {
                if (pointF6 == null || pointF7 == null || pointF4 == null || pointF5 == null) {
                    interpolatorOooO00o2 = f31087OooO00o;
                } else {
                    interpolatorOooO00o3 = OooO00o(pointF6, pointF4);
                    interpolatorOooO00o4 = OooO00o(pointF7, pointF5);
                    t2 = tOooO00o4;
                    interpolatorOooO00o2 = null;
                }
                if (interpolatorOooO00o3 != null || interpolatorOooO00o4 == null) {
                    o000ooo2 = new o000OOo<>(oooOO0O, tOooO00o3, t2, interpolatorOooO00o2, f4, (Float) null);
                } else {
                    o000ooo2 = new o000OOo<>(oooOO0O, tOooO00o3, t2, interpolatorOooO00o3, interpolatorOooO00o4, f4);
                }
                o000ooo2.f31169OooOOOO = pointF14;
                o000ooo2.f31170OooOOOo = pointF13;
                return o000ooo2;
            }
            interpolatorOooO00o2 = OooO00o(pointFOooO0O5, pointFOooO0O6);
        }
        t2 = tOooO00o4;
        interpolatorOooO00o3 = null;
        interpolatorOooO00o4 = null;
        if (interpolatorOooO00o3 != null) {
            o000ooo2 = new o000OOo<>(oooOO0O, tOooO00o3, t2, interpolatorOooO00o2, f4, (Float) null);
        } else {
            o000ooo2 = new o000OOo<>(oooOO0O, tOooO00o3, t2, interpolatorOooO00o2, f4, (Float) null);
        }
        o000ooo2.f31169OooOOOO = pointF14;
        o000ooo2.f31170OooOOOo = pointF13;
        return o000ooo2;
    }
}
