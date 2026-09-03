package p643o0ooOOOO;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.base.paging.PagingViewHolder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class k3 extends RecyclerView.Adapter<PagingViewHolder> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final View f58018OooO00o;

    public k3(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f58018OooO00o = view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.o0O0O00 o0o0o00, int i) {
        PagingViewHolder holder = (PagingViewHolder) o0o0o00;
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.o0O0O00 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new PagingViewHolder(this.f58018OooO00o);
    }
}
