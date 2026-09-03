package Oooo0;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends Lambda implements Function1<o0O0O00.o000O000.OooO00o, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O0O00.o000O000 f492Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f493Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(o0O0O00.o000O000 o000o001, int i) {
        super(1);
        this.f492Oooo0o = o000o001;
        this.f493Oooo0oO = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o0O0O00.o000O000.OooO00o oooO00o) {
        o0O0O00.o000O000.OooO00o layout = oooO00o;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        o0O0O00.o000O000 o000o001 = this.f492Oooo0o;
        int iOoooOoO = ((-this.f493Oooo0oO) / 2) - ((o000o001.f35265Oooo0o - o000o001.OoooOoO()) / 2);
        int i = (-this.f493Oooo0oO) / 2;
        o0O0O00.o000O000 o000o002 = this.f492Oooo0o;
        o0O0O00.o000O000.OooO00o.OooOO0O(layout, o000o001, iOoooOoO, i - ((o000o002.f35266Oooo0oO - o000o002.OoooOOO()) / 2), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, 12, null);
        return Unit.INSTANCE;
    }
}
