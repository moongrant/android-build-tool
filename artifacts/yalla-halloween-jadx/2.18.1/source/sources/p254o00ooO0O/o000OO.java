package p254o00ooO0O;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0000O0O.OooOOO0;
import o00O0O.OooO;
import o00O0O.OooOo00;
import p191o00o0O.o000000;
import p191o00o0O.o000OOo;
import p191o00o0O.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO extends Lambda implements Function1<o00oO0o, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ long f34327Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ float f34328Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ OooOOO0 f34329Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ long f34330Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO(float f, OooOOO0 oooOOO0, long j, long j2) {
        super(1);
        this.f34328Oooo0o = f;
        this.f34329Oooo0oO = oooOOO0;
        this.f34330Oooo0oo = j;
        this.f34327Oooo = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00oO0o o00oo0o2) {
        o00oO0o drawWithContent = o00oo0o2;
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        float fOoooOoo = drawWithContent.OoooOoo(this.f34328Oooo0o);
        OooOOO0 oooOOO0 = this.f34329Oooo0oO;
        float fOoooOoo2 = oooOOO0 != null ? drawWithContent.OoooOoo(oooOOO0.f27306Oooo0o) : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        drawWithContent.o00oO0O(this.f34330Oooo0oo, (124 & 2) != 0 ? OooOo00.OooO0OO(drawWithContent.OooO0OO()) / 2.0f : fOoooOoo, (124 & 4) != 0 ? drawWithContent.o00Oo0() : OooO.OooO0oO(drawWithContent.o00Oo0(), this.f34327Oooo), (124 & 8) != 0 ? 1.0f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, (124 & 16) != 0 ? o000OOo.f33065OooO00o : fOoooOoo2 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? new o000000(fOoooOoo2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0, 0, null, 30) : o000OOo.f33065OooO00o, null, (124 & 64) != 0 ? 3 : 0);
        drawWithContent.o0ooOOo();
        return Unit.INSTANCE;
    }
}
