package Oooo0;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 extends Lambda implements Function1<p191o00o0O.o00oO0o, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ p191o00o0O.o0OO00O f516Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ p145o00Oo0.o0Oo0oo f517Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ long f518Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ long f519Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(p145o00Oo0.o0Oo0oo o0oo0oo2, long j, long j2, p191o00o0O.o0OO00O o0oo00o2) {
        super(1);
        this.f517Oooo0o = o0oo0oo2;
        this.f518Oooo0oO = j;
        this.f519Oooo0oo = j2;
        this.f516Oooo = o0oo00o2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(p191o00o0O.o00oO0o o00oo0o2) {
        p191o00o0O.o00oO0o onDrawWithContent = o00oo0o2;
        Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.o0ooOOo();
        p191o00o0O.o0OOO0o.OooO(onDrawWithContent, this.f517Oooo0o, this.f518Oooo0oO, this.f519Oooo0oo, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, this.f516Oooo, null, 0, 104, null);
        return Unit.INSTANCE;
    }
}
