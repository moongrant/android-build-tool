package p536o0o0OOoo;

import com.yalla.yalla.model.FeedbackModel;
import com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes2.dex */
public final class r2 extends Lambda implements Function1<FeedbackModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessageActivity f43860Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(YallaTeamMessageActivity yallaTeamMessageActivity) {
        super(1);
        this.f43860Oooo0o = yallaTeamMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(FeedbackModel feedbackModel) {
        o0O00000.OooO0OO("Message_team_send");
        YallaTeamMessageActivity yallaTeamMessageActivity = this.f43860Oooo0o;
        YallaTeamMessageActivity.OooO00o oooO00o = YallaTeamMessageActivity.f22251OoooooO;
        yallaTeamMessageActivity.OooOooO().f50439OooO0O0.setText("");
        return Unit.INSTANCE;
    }
}
