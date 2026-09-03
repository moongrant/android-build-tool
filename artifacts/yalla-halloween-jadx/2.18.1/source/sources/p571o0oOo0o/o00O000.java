package p571o0oOo0o;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00O0O.OooO0O0;
import p191o00o0O.o000000;
import p191o00o0O.o0OOO0o;
import p191o00o0O.o0Oo0oo;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O000 extends Lambda implements Function1<o0Oo0oo, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ float f45512Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ long f45513Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o000000 f45514Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000(float f, long j, o000000 o000000Var) {
        super(1);
        this.f45512Oooo0o = f;
        this.f45513Oooo0oO = j;
        this.f45514Oooo0oo = o000000Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o0Oo0oo o0oo0oo2) {
        o0Oo0oo Canvas = o0oo0oo2;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float f = this.f45512Oooo0o;
        o0OOO0o.OooOO0o(Canvas, this.f45513Oooo0oO, 0L, 0L, OooO0O0.OooO00o(f, f), this.f45514Oooo0oo, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, 0, 230, null);
        return Unit.INSTANCE;
    }
}
