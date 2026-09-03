package p522o0o0O0o;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00OO {
    public static final void OooO00o(@NotNull RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null || !(recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
            return;
        }
        RecyclerView.Oooo000 layoutManager = recyclerView.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        if (i < 0 || i >= adapter.getItemCount()) {
            return;
        }
        boolean z = false;
        if (iFindFirstVisibleItemPosition <= i && i <= iFindLastVisibleItemPosition) {
            z = true;
        }
        if (z) {
            adapter.notifyItemChanged(i);
        }
    }
}
