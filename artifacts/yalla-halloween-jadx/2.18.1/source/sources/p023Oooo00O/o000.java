package p023Oooo00O;

import androidx.compose.runtime.internal.StabilityInferred;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o000 implements o000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f1034OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f1035OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o0000oo f1036OooO0OO;

    public o000(int i, int i2, @NotNull o0000oo easing) {
        Intrinsics.checkNotNullParameter(easing, "easing");
        this.f1034OooO00o = i;
        this.f1035OooO0O0 = i2;
        this.f1036OooO0OO = easing;
    }

    @Override // p023Oooo00O.o000OO
    public final float OooO0O0(long j, float f, float f2, float f3) {
        long jCoerceIn = RangesKt.coerceIn((j / 1000000) - ((long) this.f1035OooO0O0), 0L, this.f1034OooO00o);
        if (jCoerceIn < 0) {
            return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        if (jCoerceIn == 0) {
            return f3;
        }
        return (OooO0o0(jCoerceIn * 1000000, f, f2, f3) - OooO0o0((jCoerceIn - 1) * 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // p023Oooo00O.o000OO
    public final long OooO0OO(float f, float f2, float f3) {
        return ((long) (this.f1035OooO0O0 + this.f1034OooO00o)) * 1000000;
    }

    @Override // p023Oooo00O.o000OO
    public final float OooO0Oo(float f, float f2, float f3) {
        return OooO0O0(OooO0OO(f, f2, f3), f, f2, f3);
    }

    @Override // p023Oooo00O.oo000o
    /* JADX INFO: renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
    public final o0oOO OooO00o(o00OO0O0 converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        return new o0oOO(this);
    }

    @Override // p023Oooo00O.o000OO
    public final float OooO0o0(long j, float f, float f2, float f3) {
        long jCoerceIn = RangesKt.coerceIn((j / 1000000) - ((long) this.f1035OooO0O0), 0L, this.f1034OooO00o);
        int i = this.f1034OooO00o;
        float fOooO00o = this.f1036OooO0OO.OooO00o(RangesKt.coerceIn(i == 0 ? 1.0f : jCoerceIn / i, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f));
        o00OO0O0<Float, o0Oo0oo> o00oo0o1 = oo0O.f1293OooO00o;
        return (f2 * fOooO00o) + ((1 - fOooO00o) * f);
    }
}
