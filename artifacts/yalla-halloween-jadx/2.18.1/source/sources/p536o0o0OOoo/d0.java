package p536o0o0OOoo;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends RecyclerView.o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f43766OooO00o;

    public d0(PrivateChatActivity privateChatActivity) {
        this.f43766OooO00o = privateChatActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00O0O
    public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        if (i != 0) {
            if (i != 1) {
                return;
            }
            this.f43766OooO00o.f22170Ooooo00 = false;
        } else {
            PrivateChatActivity privateChatActivity = this.f43766OooO00o;
            PrivateChatActivity.OooO00o oooO00o = PrivateChatActivity.f22166o00oO0o;
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) privateChatActivity.Oooo00o().f49091OooO.getLayoutManager();
            PrivateChatActivity privateChatActivity2 = this.f43766OooO00o;
            Intrinsics.checkNotNull(linearLayoutManager);
            privateChatActivity2.f22170Ooooo00 = linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0;
        }
    }
}
