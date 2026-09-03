package Oooo0;

import androidx.compose.foundation.BorderKt;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo extends Lambda implements Function1<p191o00o0O.o00oO0o, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ float f508Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f509Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ p145o00Oo0.o0Oo0oo f510Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ long f511Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ p191o00o0O.o000000 f512OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ long f513OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ float f514OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ long f515OoooO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(boolean z, p145o00Oo0.o0Oo0oo o0oo0oo2, long j, float f, float f2, long j2, long j3, p191o00o0O.o000000 o000000Var) {
        super(1);
        this.f509Oooo0o = z;
        this.f510Oooo0oO = o0oo0oo2;
        this.f511Oooo0oo = j;
        this.f508Oooo = f;
        this.f514OoooO00 = f2;
        this.f513OoooO0 = j2;
        this.f515OoooO0O = j3;
        this.f512OoooO = o000000Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(p191o00o0O.o00oO0o o00oo0o2) {
        p191o00o0O.o00oO0o onDrawWithContent = o00oo0o2;
        Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.o0ooOOo();
        if (this.f509Oooo0o) {
            p191o00o0O.o0OOO0o.OooOO0O(onDrawWithContent, this.f510Oooo0oO, 0L, 0L, this.f511Oooo0oo, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, null, 0, 246, null);
        } else {
            float fOooO0O0 = o00O0O.OooO00o.OooO0O0(this.f511Oooo0oo);
            float f = this.f508Oooo;
            if (fOooO0O0 < f) {
                float f2 = this.f514OoooO00;
                float fOooO0Oo = o00O0O.OooOo00.OooO0Oo(onDrawWithContent.OooO0OO()) - this.f514OoooO00;
                float fOooO0O1 = o00O0O.OooOo00.OooO0O0(onDrawWithContent.OooO0OO()) - this.f514OoooO00;
                p145o00Oo0.o0Oo0oo o0oo0oo2 = this.f510Oooo0oO;
                long j = this.f511Oooo0oo;
                p191o00o0O.o0ooOOo o0oooooOoooo0o = onDrawWithContent.Ooooo0o();
                long jOooO0OO = o0oooooOoooo0o.OooO0OO();
                o0oooooOoooo0o.OooO0o().OooO0oo();
                o0oooooOoooo0o.OooO0Oo().OooO00o(f2, f2, fOooO0Oo, fOooO0O1, 0);
                p191o00o0O.o0OOO0o.OooOO0O(onDrawWithContent, o0oo0oo2, 0L, 0L, j, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, null, 0, 246, null);
                o0oooooOoooo0o.OooO0o().OooOOo0();
                o0oooooOoooo0o.OooO0o0(jOooO0OO);
            } else {
                p191o00o0O.o0OOO0o.OooOO0O(onDrawWithContent, this.f510Oooo0oO, this.f513OoooO0, this.f515OoooO0O, BorderKt.OooO0o0(this.f511Oooo0oo, f), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, this.f512OoooO, null, 0, 208, null);
            }
        }
        return Unit.INSTANCE;
    }
}
