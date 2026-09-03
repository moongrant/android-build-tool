package p257o00ooOO0;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0000OO.OooO;
import o0000OO.OooOO0;
import o0000OO.o00000O;
import o0000OO.o0O0O00;
import o0000OO.o0OOO0o;
import o0000OO.oo0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o0O00OO extends Lambda implements Function1<OooOO0, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final o0O00OO f34414Oooo0o = new o0O00OO();

    public o0O00OO() {
        super(1);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(OooOO0 oooOO1) {
        OooOO0 constrainAs = oooOO1;
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        float f = 40;
        o00000O.OooO00o.OooO00o(constrainAs.f27360OooO0Oo, constrainAs.f27359OooO0OO.f27365OooO0O0, f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
        o00000O.OooO00o.OooO00o(constrainAs.f27361OooO0o, constrainAs.f27359OooO0OO.f27367OooO0Oo, f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
        o0O0O00.OooO00o.OooO00o(constrainAs.f27362OooO0o0, constrainAs.f27359OooO0OO.f27366OooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
        o0O0O00.OooO00o.OooO00o(constrainAs.f27363OooO0oO, constrainAs.f27359OooO0OO.f27368OooO0o0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
        oo0o0Oo value = new oo0o0Oo(o0OOO0o.f27418Oooo0o);
        Intrinsics.checkNotNullParameter(value, "value");
        constrainAs.f27358OooO0O0.add(new OooO(constrainAs, value));
        return Unit.INSTANCE;
    }
}
