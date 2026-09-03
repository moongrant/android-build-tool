package p167o00Ooo;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public static final Oooo0 f32566OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooOOO0 f32567OooO00o = new OooOOO0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final float[] f32568OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final float[] f32569OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final Oooo0 f32570OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final Oooo0 f32571OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final Oooo0 f32572OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final Oooo0 f32573OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static final Oooo0 f32574OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public static final Oooo0 f32575OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public static final Oooo0 f32576OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public static final Oooo0 f32577OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public static final Oooo0 f32578OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public static final Oooo0 f32579OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public static final Oooo0 f32580OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public static final Oooo0 f32581OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public static final o00O0O f32582OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public static final Oooo0 f32583OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public static final OooOo f32584OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public static final Oooo000 f32585OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public static final Oooo0 f32586OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public static final OooO[] f32587OooOo0O;

    public static final class OooO00o extends Lambda implements Function1<Double, Double> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f32588Oooo0o = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Double invoke(Double d) {
            double d2;
            double dDoubleValue = d.doubleValue();
            double dPow = dDoubleValue < 0.0d ? -dDoubleValue : dDoubleValue;
            if (dPow >= 0.0031308049535603718d) {
                dPow = Math.pow(dPow, 0.4166666666666667d) - 0.05213270142180095d;
                d2 = 0.9478672985781991d;
            } else {
                d2 = 0.07739938080495357d;
            }
            return Double.valueOf(Math.copySign(dPow / d2, dDoubleValue));
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Double, Double> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f32589Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Double invoke(Double d) {
            double dDoubleValue = d.doubleValue();
            double d2 = dDoubleValue < 0.0d ? -dDoubleValue : dDoubleValue;
            return Double.valueOf(Math.copySign(d2 >= 0.04045d ? Math.pow((d2 * 0.9478672985781991d) + 0.05213270142180095d, 2.4d) : d2 * 0.07739938080495357d, dDoubleValue));
        }
    }

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f32568OooO0O0 = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f32569OooO0OO = fArr2;
        o000oOoO o000oooo2 = new o000oOoO(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        o000oOoO o000oooo3 = new o000oOoO(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        o0OoOo0 o0oooo1 = OooOo00.f32599OooO0Oo;
        Oooo0 oooo0 = new Oooo0("sRGB IEC61966-2.1", fArr, o0oooo1, o000oooo2, 0);
        f32570OooO0Oo = oooo0;
        Oooo0 oooo1 = new Oooo0("sRGB IEC61966-2.1 (Linear)", fArr, o0oooo1, 1.0d, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f, 1);
        f32572OooO0o0 = oooo1;
        Oooo0 oooo2 = new Oooo0("scRGB-nl IEC 61966-2-2:2003", fArr, o0oooo1, null, OooO00o.f32588Oooo0o, OooO0O0.f32589Oooo0o, -0.799f, 2.399f, o000oooo2, 2);
        f32571OooO0o = oooo2;
        Oooo0 oooo3 = new Oooo0("scRGB IEC 61966-2-2:2003", fArr, o0oooo1, 1.0d, -0.5f, 7.499f, 3);
        f32573OooO0oO = oooo3;
        Oooo0 oooo4 = new Oooo0("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, o0oooo1, new o000oOoO(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f32574OooO0oo = oooo4;
        Oooo0 oooo5 = new Oooo0("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, o0oooo1, new o000oOoO(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        f32566OooO = oooo5;
        Oooo0 oooo6 = new Oooo0("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new o0OoOo0(0.314f, 0.351f), 2.6d, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f, 6);
        f32575OooOO0 = oooo6;
        Oooo0 oooo7 = new Oooo0("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, o0oooo1, o000oooo2, 7);
        f32576OooOO0O = oooo7;
        Oooo0 oooo8 = new Oooo0("NTSC (1953)", fArr2, OooOo00.f32596OooO00o, new o000oOoO(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        f32577OooOO0o = oooo8;
        Oooo0 oooo9 = new Oooo0("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, o0oooo1, new o000oOoO(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f32579OooOOO0 = oooo9;
        Oooo0 oooo10 = new Oooo0("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, o0oooo1, 2.2d, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f, 10);
        f32578OooOOO = oooo10;
        Oooo0 oooo11 = new Oooo0("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, OooOo00.f32597OooO0O0, new o000oOoO(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f32580OooOOOO = oooo11;
        float[] fArr3 = {0.7347f, 0.2653f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f, 1.0E-4f, -0.077f};
        o0OoOo0 o0oooo2 = OooOo00.f32598OooO0OO;
        Oooo0 oooo12 = new Oooo0("SMPTE ST 2065-1:2012 ACES", fArr3, o0oooo2, 1.0d, -65504.0f, 65504.0f, 12);
        f32581OooOOOo = oooo12;
        Oooo0 oooo13 = new Oooo0("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, o0oooo2, 1.0d, -65504.0f, 65504.0f, 13);
        f32583OooOOo0 = oooo13;
        o00O0O o00o0o2 = new o00O0O();
        f32582OooOOo = o00o0o2;
        OooOo oooOo = new OooOo();
        f32584OooOOoo = oooOo;
        Oooo0 oooo14 = new Oooo0("None", fArr, o0oooo1, o000oooo3, 16);
        f32586OooOo00 = oooo14;
        Oooo000 oooo000 = new Oooo000();
        f32585OooOo0 = oooo000;
        f32587OooOo0O = new OooO[]{oooo0, oooo1, oooo2, oooo3, oooo4, oooo5, oooo6, oooo7, oooo8, oooo9, oooo10, oooo11, oooo12, oooo13, o00o0o2, oooOo, oooo14, oooo000};
    }
}
