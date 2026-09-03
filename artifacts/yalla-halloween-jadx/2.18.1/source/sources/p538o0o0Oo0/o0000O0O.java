package p538o0o0Oo0;

import com.yalla.yalla.model.PollConfig;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O0O extends Lambda implements Function1<PollConfig, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MomentSendActivity f43917Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0O(MomentSendActivity momentSendActivity) {
        super(1);
        this.f43917Oooo0o = momentSendActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(PollConfig pollConfig) {
        PollConfig pollConfig2 = pollConfig;
        MomentSendActivity momentSendActivity = this.f43917Oooo0o;
        MomentSendActivity.OooO00o oooO00o = MomentSendActivity.f22367o00oO0o;
        momentSendActivity.OooOooO().f48992OooOO0.setPollItemMax(pollConfig2 != null ? pollConfig2.getMaxOptionCount() : 4);
        return Unit.INSTANCE;
    }
}
