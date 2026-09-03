package p554o0oOOoOo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.ui.view.banner.BannerViewHolder;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p507o0o00oo.Oooo0;
import p507o0o00oo.Oooo000;
import p562o0oOo000.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
public abstract class oO0OOO00<T> extends RecyclerView.Adapter<BannerViewHolder> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f56151OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f56152OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<T> f56153OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f56154OooO0Oo;

    public oO0OOO00(int i, Context context, List list) {
        this.f56151OooO00o = context;
        LayoutInflater.from(context);
        this.f56152OooO0O0 = i;
        this.f56153OooO0OO = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List<T> list = this.f56153OooO0OO;
        int size = list == null ? 0 : list.size();
        if (size == 0) {
            return 0;
        }
        if (this.f56154OooO0Oo) {
            return 2147483646;
        }
        return size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull RecyclerView.o0O0O00 o0o0o00, int i) {
        T t;
        BannerViewHolder holder = (BannerViewHolder) o0o0o00;
        boolean z = this.f56154OooO0Oo;
        List<T> list = this.f56153OooO0OO;
        if (z) {
            int size = i % list.size();
            t = list.get(size);
            holder.updatePosition(size);
        } else {
            holder.updatePosition(i);
            t = list.get(i);
        }
        Oooo0 oooo0 = (Oooo0) this;
        Integer[] t2 = t;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(t2, "t");
        int layoutPosition = holder.getLayoutPosition() % oooo0.f56153OooO0OO.size();
        ComposeView composeView = (ComposeView) holder.itemView.findViewById(o0OO00O.composeView);
        if (composeView != null) {
            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(129165415, true, new Oooo000(oooo0, layoutPosition)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public final RecyclerView.o0O0O00 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return BannerViewHolder.create(this.f56151OooO00o, viewGroup, this.f56152OooO0O0);
    }
}
