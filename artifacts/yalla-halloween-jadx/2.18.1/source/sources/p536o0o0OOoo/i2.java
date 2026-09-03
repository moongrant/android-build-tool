package p536o0o0OOoo;

import com.yalla.yalla.common.manager.data.SharedUrlManager;
import com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p143o00OOooo.o00O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class i2 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessageActivity f43801Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(YallaTeamMessageActivity yallaTeamMessageActivity) {
        super(0);
        this.f43801Oooo0o = yallaTeamMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        YallaTeamMessageActivity yallaTeamMessageActivity = this.f43801Oooo0o;
        if (!yallaTeamMessageActivity.f22258Oooooo) {
            yallaTeamMessageActivity.f22258Oooooo = true;
            SharedUrlManager.INSTANCE.getFeedBackUrl().observe(yallaTeamMessageActivity, new o00O0O0(yallaTeamMessageActivity, 2));
        }
        return Unit.INSTANCE;
    }
}
