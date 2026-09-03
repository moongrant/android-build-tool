package p032OoooO0;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00O0O.OooO;
import p145o00Oo0.o00000O;
import p145o00Oo0.o0000oo;
import p191o00o0O.o00oO0o;
import p191o00o0O.o0OOO0o;
import p191o00o0O.o0ooOOo;
import p191o00o0O.oo0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO extends Lambda implements Function1<o00oO0o, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ float f2931Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0000oo f2932Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o00000O f2933Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(float f, o0000oo o0000ooVar, o00000O o00000o) {
        super(1);
        this.f2931Oooo0o = f;
        this.f2932Oooo0oO = o0000ooVar;
        this.f2933Oooo0oo = o00000o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00oO0o o00oo0o2) {
        o00oO0o onDrawWithContent = o00oo0o2;
        Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.o0ooOOo();
        float f = this.f2931Oooo0o;
        o0000oo o0000ooVar = this.f2932Oooo0oO;
        o00000O o00000o = this.f2933Oooo0oo;
        o0ooOOo o0oooooOoooo0o = onDrawWithContent.Ooooo0o();
        long jOooO0OO = o0oooooOoooo0o.OooO0OO();
        o0oooooOoooo0o.OooO0o().OooO0oo();
        oo0o0Oo oo0o0ooOooO0Oo = o0oooooOoooo0o.OooO0Oo();
        oo0o0ooOooO0Oo.OooO0O0(f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        OooO.OooO00o oooO00o = OooO.f30391OooO0O0;
        oo0o0ooOooO0Oo.OooO0oO(OooO.f30392OooO0OO);
        o0OOO0o.OooO0o0(onDrawWithContent, o0000ooVar, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, o00000o, 0, 46, null);
        o0oooooOoooo0o.OooO0o().OooOOo0();
        o0oooooOoooo0o.OooO0o0(jOooO0OO);
        return Unit.INSTANCE;
    }
}
