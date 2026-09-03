package p536o0o0OOoo;

import android.view.View;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO0;
import com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p255o00ooO0o.oo0oOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class h2 extends OooOOO0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessageActivity f43797Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(YallaTeamMessageActivity yallaTeamMessageActivity) {
        super(0L, 1, null);
        this.f43797Oooo0o = yallaTeamMessageActivity;
    }

    @Override // com.yalla.support.common.util.OooOOO0
    public final void onNoDoubleClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        YallaTeamMessageActivity yallaTeamMessageActivity = this.f43797Oooo0o;
        YallaTeamMessageActivity.OooO00o oooO00o = YallaTeamMessageActivity.f22251OoooooO;
        oo0oOO0 oo0ooo0 = new oo0oOO0(yallaTeamMessageActivity);
        oo0ooo0.OooOo0(R.string.message_clear_yalla_team_message);
        oo0oOO0.OooOoo0(oo0ooo0, false, 1, null);
        oo0ooo0.OooOo0o(new e2(yallaTeamMessageActivity));
        oo0ooo0.OooOOO0();
    }
}
