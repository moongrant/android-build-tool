package p032OoooO0;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import o00000O.o0OO00O;
import o00000O.o0OOO0o;
import o00O0O.OooOO0;
import o00O0O.OooOO0O;
import o00O0O.OooOo00;
import p023Oooo00O.Oooo0;
import p023Oooo00O.o0Oo0oo;
import p054o00000oo.o00O0O00;
import p054o00000oo.oo0oOO0;
import p191o00o0O.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
public final class oo00o extends Lambda implements Function1<o00oO0o, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o0O0000O f3399Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Oooo0<Float, o0Oo0oo> f3400Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00O0O00 f3401Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ oo0oOO0 f3402Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ p145o00Oo0.o0Oo0oo f3403OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo00o(Oooo0<Float, o0Oo0oo> oooo0, o00O0O00 o00o0o01, oo0oOO0 oo0ooo0, o0O0000O o0o0000o2, p145o00Oo0.o0Oo0oo o0oo0oo2) {
        super(1);
        this.f3400Oooo0o = oooo0;
        this.f3401Oooo0oO = o00o0o01;
        this.f3402Oooo0oo = oo0ooo0;
        this.f3399Oooo = o0o0000o2;
        this.f3403OoooO00 = o0oo0oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00oO0o o00oo0o2) {
        o0OOO0o o0ooo0o2;
        o00oO0o drawWithContent = o00oo0o2;
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        drawWithContent.o0ooOOo();
        float fCoerceIn = RangesKt.coerceIn(this.f3400Oooo0o.OooO0o().floatValue(), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f);
        if (!(fCoerceIn == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
            o00O0O00 o00o0o01 = this.f3401Oooo0oO;
            long j = this.f3402Oooo0oo.f27237OooO0O0;
            o0OO00O.OooO00o oooO00o = o0OO00O.f26874OooO0O0;
            int iOooO0O0 = o00o0o01.OooO0O0((int) (j >> 32));
            o0O000 o0o000OooO0OO = this.f3399Oooo.OooO0OO();
            OooOO0O oooOO0O = (o0o000OooO0OO == null || (o0ooo0o2 = o0o000OooO0OO.f3314OooO00o) == null) ? new OooOO0O(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) : o0ooo0o2.OooO0OO(iOooO0O0);
            float f = o00O0O0.f3169OooO00o;
            float fOoooOoo = drawWithContent.OoooOoo(o00O0O0.f3169OooO00o);
            float f2 = fOoooOoo / 2;
            float fCoerceAtMost = RangesKt.coerceAtMost(oooOO0O.f30404OooO00o + f2, OooOo00.OooO0Oo(drawWithContent.OooO0OO()) - f2);
            long jOooO00o = OooOO0.OooO00o(fCoerceAtMost, oooOO0O.f30405OooO0O0);
            long jOooO00o2 = OooOO0.OooO00o(fCoerceAtMost, oooOO0O.f30407OooO0Oo);
            p145o00Oo0.o0Oo0oo o0oo0oo2 = this.f3403OoooO00;
            int i = p191o00o0O.o0OOO0o.f33077OooO00o;
            int i2 = p191o00o0O.o0Oo0oo.f33078OooO0oO;
            drawWithContent.o00oO0o(o0oo0oo2, jOooO00o, jOooO00o2, fOoooOoo, 0, null, fCoerceIn, null, 3);
        }
        return Unit.INSTANCE;
    }
}
