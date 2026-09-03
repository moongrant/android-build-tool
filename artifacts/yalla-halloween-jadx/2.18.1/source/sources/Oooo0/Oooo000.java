package Oooo0;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 extends Lambda implements Function1<p191o00o0O.o00oO0o, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ p145o00Oo0.o000O0o f522Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ p145o00Oo0.o0Oo0oo f523Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(p145o00Oo0.o000O0o o000o0o2, p145o00Oo0.o0Oo0oo o0oo0oo2) {
        super(1);
        this.f522Oooo0o = o000o0o2;
        this.f523Oooo0oO = o0oo0oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(p191o00o0O.o00oO0o o00oo0o2) {
        p191o00o0O.o00oO0o onDrawWithContent = o00oo0o2;
        Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.o0ooOOo();
        p191o00o0O.o0OOO0o.OooO0oO(onDrawWithContent, this.f522Oooo0o, this.f523Oooo0oO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, null, 0, 60, null);
        return Unit.INSTANCE;
    }
}
