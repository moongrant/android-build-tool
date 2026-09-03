package p035OoooOO0;

import Oooo0.o0O0ooO;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o000000.o00O0O;
import o00O0O.OooOo00;
import org.jetbrains.annotations.NotNull;
import p026Oooo0OO.o000Oo0;
import p100o000oOoO.oO0Oo;
import p145o00Oo0.o00000O0;
import p191o00o0O.o000OOo;
import p191o00o0O.o00Oo0;
import p191o00o0O.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0000 implements o0O0ooO {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final o0000O f3570Oooo0o;

    public o0000(boolean z, @NotNull oO0Oo<o000000> rippleAlpha) {
        Intrinsics.checkNotNullParameter(rippleAlpha, "rippleAlpha");
        this.f3570Oooo0o = new o0000O(z, rippleAlpha);
    }

    public final void OooO0o(@NotNull o0Oo0oo drawStateLayer, float f, long j) {
        Intrinsics.checkNotNullParameter(drawStateLayer, "$this$drawStateLayer");
        o0000O o0000o2 = this.f3570Oooo0o;
        Objects.requireNonNull(o0000o2);
        Intrinsics.checkNotNullParameter(drawStateLayer, "$this$drawStateLayer");
        float fOooO00o = Float.isNaN(f) ? o00000O.OooO00o(drawStateLayer, o0000o2.f3606OooO00o, ((o00O0O) drawStateLayer).OooO0OO()) : ((o00O0O) drawStateLayer).OoooOoo(f);
        float fFloatValue = o0000o2.f3608OooO0OO.OooO0o().floatValue();
        if (fFloatValue > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            long jOooO0OO = o00000O0.OooO0OO(j, fFloatValue);
            if (!o0000o2.f3606OooO00o) {
                drawStateLayer.o00oO0O(jOooO0OO, (124 & 2) != 0 ? OooOo00.OooO0OO(drawStateLayer.OooO0OO()) / 2.0f : fOooO00o, (124 & 4) != 0 ? drawStateLayer.o00Oo0() : 0L, (124 & 8) != 0 ? 1.0f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, (124 & 16) != 0 ? o000OOo.f33065OooO00o : null, null, (124 & 64) != 0 ? 3 : 0);
                return;
            }
            o00O0O o00o0o2 = (o00O0O) drawStateLayer;
            float fOooO0Oo = OooOo00.OooO0Oo(o00o0o2.OooO0OO());
            float fOooO0O0 = OooOo00.OooO0O0(o00o0o2.OooO0OO());
            o00Oo0.OooO0O0 oooO0O0 = o00o0o2.f26649Oooo0o.f33068Oooo0oO;
            long jOooO0OO2 = oooO0O0.OooO0OO();
            oooO0O0.OooO0o().OooO0oo();
            oooO0O0.f33074OooO00o.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, fOooO0Oo, fOooO0O0, 1);
            drawStateLayer.o00oO0O(jOooO0OO, (124 & 2) != 0 ? OooOo00.OooO0OO(drawStateLayer.OooO0OO()) / 2.0f : fOooO00o, (124 & 4) != 0 ? drawStateLayer.o00Oo0() : 0L, (124 & 8) != 0 ? 1.0f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, (124 & 16) != 0 ? o000OOo.f33065OooO00o : null, null, (124 & 64) != 0 ? 3 : 0);
            oooO0O0.OooO0o().OooOOo0();
            oooO0O0.OooO0o0(jOooO0OO2);
        }
    }

    public abstract void OooO0o0(@NotNull o000Oo0 o000oo1, @NotNull CoroutineScope coroutineScope);

    public abstract void OooO0oO(@NotNull o000Oo0 o000oo1);
}
