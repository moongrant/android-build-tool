package p540o0o0OoOo;

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
import p500o0o00oO.o0OO00O;
import p500o0o00oO.o0Oo0oo;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes5.dex */
public abstract class s3<T> extends RecyclerView.Adapter<BannerViewHolder> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f55771OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f55772OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<T> f55773OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f55774OooO0Oo;

    public s3(int i, Context context, List list) {
        this.f55771OooO00o = context;
        LayoutInflater.from(context);
        this.f55772OooO0O0 = i;
        this.f55773OooO0OO = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List<T> list = this.f55773OooO0OO;
        int size = list == null ? 0 : list.size();
        if (size == 0) {
            return 0;
        }
        if (this.f55774OooO0Oo) {
            return 2147483646;
        }
        return size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull RecyclerView.o0O0O00 o0o0o00, int i) {
        T t;
        BannerViewHolder holder = (BannerViewHolder) o0o0o00;
        boolean z = this.f55774OooO0Oo;
        List<T> list = this.f55773OooO0OO;
        if (z) {
            int size = i % list.size();
            t = list.get(size);
            holder.updatePosition(size);
        } else {
            holder.updatePosition(i);
            t = list.get(i);
        }
        o0OO00O o0oo00o2 = (o0OO00O) this;
        Integer[] t2 = t;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(t2, "t");
        int layoutPosition = holder.getLayoutPosition() % o0oo00o2.f55773OooO0OO.size();
        ComposeView composeView = (ComposeView) holder.itemView.findViewById(oO00O0oO.composeView);
        if (composeView != null) {
            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(129165415, true, new o0Oo0oo(o0oo00o2, layoutPosition)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public final RecyclerView.o0O0O00 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return BannerViewHolder.create(this.f55771OooO00o, viewGroup, this.f55772OooO0O0);
    }
}
