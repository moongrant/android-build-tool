package p032OoooO0;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0O0O00.o000O000;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0o extends Lambda implements Function1<o000O000.OooO00o, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000O000 f3359Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o(o000O000 o000o001) {
        super(1);
        this.f3359Oooo0o = o000o001;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o000O000.OooO00o oooO00o) {
        o000O000.OooO00o layout = oooO00o;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        o000O000.OooO00o.OooO0oO(layout, this.f3359Oooo0o, 0, 0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
        return Unit.INSTANCE;
    }
}
