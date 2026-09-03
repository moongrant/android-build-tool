package p579o0oOoOOo;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b1 extends RecyclerView.o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ c1 f45933OooO00o;

    public b1(c1 c1Var) {
        this.f45933OooO00o = c1Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00O0O
    public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            c1 c1Var = this.f45933OooO00o;
            RecyclerView.Oooo000 layoutManager = recyclerView.getLayoutManager();
            Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            c1Var.f45938OoooOOo = ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
            this.f45933OooO00o.OooOO0O();
        }
    }
}
