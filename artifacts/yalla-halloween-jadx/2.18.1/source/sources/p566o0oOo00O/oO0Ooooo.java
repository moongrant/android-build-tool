package p566o0oOo00O;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import o000OO.OooO00o;
import o0O0O0O.OooO0o;
import p145o00Oo0.o0000;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0Ooooo extends Lambda implements Function1<o0000, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooO0o f45385Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f45386Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Ooooo(OooO0o oooO0o, int i) {
        super(1);
        this.f45385Oooo0o = oooO0o;
        this.f45386Oooo0oO = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o0000 o0000Var) {
        o0000 graphicsLayer = o0000Var;
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        OooO0o oooO0o = this.f45385Oooo0o;
        int i = this.f45386Oooo0oO;
        Intrinsics.checkNotNullParameter(oooO0o, "<this>");
        float fAbs = Math.abs(oooO0o.OooO0O0() + (oooO0o.OooO00o() - i));
        float fOooO00o = OooO00o.OooO00o(0.8f, 1.0f, 1.0f - RangesKt.coerceIn(fAbs, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f));
        graphicsLayer.OooOO0o(fOooO00o);
        graphicsLayer.OooOO0(fOooO00o);
        graphicsLayer.OooO0O0(OooO00o.OooO00o(0.8f, 1.0f, 1.0f - RangesKt.coerceIn(fAbs, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f)));
        return Unit.INSTANCE;
    }
}
