package p538o0o0Oo0;

import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MomentSendActivity f43922Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0(MomentSendActivity momentSendActivity) {
        super(0);
        this.f43922Oooo0o = momentSendActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O00000.OooO0OO("Moemnts_post_vote");
        MomentSendActivity momentSendActivity = this.f43922Oooo0o;
        MomentSendActivity.OooO00o oooO00o = MomentSendActivity.f22367o00oO0o;
        momentSendActivity.OooOooO().f48992OooOO0.OooO0OO();
        return Unit.INSTANCE;
    }
}
