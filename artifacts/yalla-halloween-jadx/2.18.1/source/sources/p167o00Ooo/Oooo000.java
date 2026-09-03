package p167o00Ooo;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 extends OooO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final float[] f32624OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final float[] f32625OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final float[] f32626OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final float[] f32627OooO0oO;

    static {
        float[] fArrOooO0o = OooOO0O.OooO0o(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, OooOO0O.OooO0O0(OooO0OO.f32559OooO0O0.f32560OooO00o, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f32624OooO0Oo = fArrOooO0o;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f32626OooO0o0 = fArr;
        f32625OooO0o = OooOO0O.OooO0o0(fArrOooO0o);
        f32627OooO0oO = OooOO0O.OooO0o0(fArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000() {
        super("Oklab", OooO0o.f32564OooO0Oo, 17);
        Intrinsics.checkNotNullParameter("Oklab", "name");
        OooO0o.OooO00o oooO00o = OooO0o.f32561OooO00o;
        OooO0o.OooO00o oooO00o2 = OooO0o.f32561OooO00o;
    }

    @Override // p167o00Ooo.OooO
    @NotNull
    public final float[] OooO00o(@NotNull float[] v) {
        Intrinsics.checkNotNullParameter(v, "v");
        OooOO0O.OooO0oo(f32624OooO0Oo, v);
        double d = 0.33333334f;
        v[0] = Math.signum(v[0]) * ((float) Math.pow(Math.abs(v[0]), d));
        v[1] = Math.signum(v[1]) * ((float) Math.pow(Math.abs(v[1]), d));
        v[2] = Math.signum(v[2]) * ((float) Math.pow(Math.abs(v[2]), d));
        OooOO0O.OooO0oo(f32626OooO0o0, v);
        return v;
    }

    @Override // p167o00Ooo.OooO
    public final float OooO0O0(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }

    @Override // p167o00Ooo.OooO
    public final float OooO0OO(int i) {
        if (i == 0) {
            return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        return -0.5f;
    }

    @Override // p167o00Ooo.OooO
    @NotNull
    public final float[] OooO0o0(@NotNull float[] v) {
        Intrinsics.checkNotNullParameter(v, "v");
        v[0] = RangesKt.coerceIn(v[0], ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f);
        v[1] = RangesKt.coerceIn(v[1], -0.5f, 0.5f);
        v[2] = RangesKt.coerceIn(v[2], -0.5f, 0.5f);
        OooOO0O.OooO0oo(f32627OooO0oO, v);
        v[0] = v[0] * v[0] * v[0];
        v[1] = v[1] * v[1] * v[1];
        v[2] = v[2] * v[2] * v[2];
        OooOO0O.OooO0oo(f32625OooO0o, v);
        return v;
    }
}
