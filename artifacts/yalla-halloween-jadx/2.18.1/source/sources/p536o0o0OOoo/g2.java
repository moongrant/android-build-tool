package p536o0o0OOoo;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class g2 extends RecyclerView.o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessageActivity f43791OooO00o;

    public g2(YallaTeamMessageActivity yallaTeamMessageActivity) {
        this.f43791OooO00o = yallaTeamMessageActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00O0O
    public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        if (i != 0) {
            if (i != 1) {
                return;
            }
            this.f43791OooO00o.f22259Oooooo0 = false;
        } else {
            YallaTeamMessageActivity yallaTeamMessageActivity = this.f43791OooO00o;
            YallaTeamMessageActivity.OooO00o oooO00o = YallaTeamMessageActivity.f22251OoooooO;
            RecyclerView.Oooo000 layoutManager = yallaTeamMessageActivity.OooOooO().f50441OooO0Oo.getLayoutManager();
            Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            this.f43791OooO00o.f22259Oooooo0 = ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition() == 0;
        }
    }
}
