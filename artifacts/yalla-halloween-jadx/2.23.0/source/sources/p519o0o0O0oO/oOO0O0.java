package p519o0o0O0oO;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0O0 extends RecyclerView.o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ oOO0O00O f52967OooO00o;

    public oOO0O0(oOO0O00O ooo0o00o) {
        this.f52967OooO00o = ooo0o00o;
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
            oOO0O00O ooo0o00o = this.f52967OooO00o;
            ooo0o00o.f52970OooOO0o = iFindFirstCompletelyVisibleItemPosition;
            RecyclerView.Adapter adapter = ooo0o00o.f52969OooOO0O.f59399OooO0OO.getAdapter();
            boolean z = false;
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            int i2 = ooo0o00o.f52970OooOO0o;
            if (i2 >= 0 && i2 < itemCount) {
                z = true;
            }
            if (!z || itemCount <= 1) {
                return;
            }
            ooo0o00o.f52969OooOO0O.f59398OooO0O0.scrollToPosition(i2);
            oOO0O00O.OooO0O0 oooO0O0 = ooo0o00o.f52972OooOOO0;
            if (oooO0O0 != null) {
                oooO0O0.notifyDataSetChanged();
            }
        }
    }
}
