package p650o0ooo;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0OoO0 extends RecyclerView.o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ oOO0Oo00 f58984OooO00o;

    public oOO0OoO0(oOO0Oo00 ooo0oo00) {
        this.f58984OooO00o = ooo0oo00;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00O0O
    @SuppressLint({"NotifyDataSetChanged"})
    public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            RecyclerView.Oooo000 layoutManager = recyclerView.getLayoutManager();
            Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int iFindFirstCompletelyVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
            oOO0Oo00 ooo0oo00 = this.f58984OooO00o;
            ooo0oo00.f58977OooOO0o = iFindFirstCompletelyVisibleItemPosition;
            RecyclerView.Adapter adapter = ooo0oo00.f58976OooOO0O.f44104OooO0OO.getAdapter();
            boolean z = false;
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            int i2 = ooo0oo00.f58977OooOO0o;
            if (i2 >= 0 && i2 < itemCount) {
                z = true;
            }
            if (!z || itemCount <= 1) {
                return;
            }
            ooo0oo00.f58976OooOO0O.f44103OooO0O0.scrollToPosition(i2);
            oOO0Oo00.OooO0O0 oooO0O0 = ooo0oo00.f58979OooOOO0;
            if (oooO0O0 != null) {
                oooO0O0.notifyDataSetChanged();
            }
        }
    }
}
