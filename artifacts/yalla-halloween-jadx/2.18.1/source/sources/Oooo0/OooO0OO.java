package Oooo0;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO extends Lambda implements Function1<o0O0O00.o000O000.OooO00o, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O0O00.o000O000 f494Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f495Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(o0O0O00.o000O000 o000o001, int i) {
        super(1);
        this.f494Oooo0o = o000o001;
        this.f495Oooo0oO = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o0O0O00.o000O000.OooO00o oooO00o) {
        o0O0O00.o000O000.OooO00o layout = oooO00o;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        o0O0O00.o000O000 o000o001 = this.f494Oooo0o;
        int i = this.f495Oooo0oO / 2;
        layout.OooO0OO(o000o001, i, i, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        return Unit.INSTANCE;
    }
}
