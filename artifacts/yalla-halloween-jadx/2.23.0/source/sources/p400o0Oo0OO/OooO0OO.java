package p400o0Oo0OO;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.base.paging.PagingViewHolder;
import com.yalla.yalla.ui.adapter.o000O0O0;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class OooO0OO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f44433OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.o0O0O00 f44434OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.Adapter f44435OooO0o0;

    public /* synthetic */ OooO0OO(RecyclerView.Adapter adapter, RecyclerView.o0O0O00 o0o0o00, int i) {
        this.f44433OooO0Oo = i;
        this.f44435OooO0o0 = adapter;
        this.f44434OooO0o = o0o0o00;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // android.view.View.OnClickListener
    public final void onClick(View it) {
        Function3<? super OooOO0O<T>, ? super View, ? super Integer, Unit> function3;
        int i = this.f44433OooO0Oo;
        boolean z = false;
        RecyclerView.o0O0O00 o0o0o00 = this.f44434OooO0o;
        RecyclerView.Adapter adapter = this.f44435OooO0o0;
        switch (i) {
            case 0:
                OooOO0O this$0 = (OooOO0O) adapter;
                PagingViewHolder holder = (PagingViewHolder) o0o0o00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(holder, "$holder");
                int itemCount = this$0.getItemCount();
                int bindingAdapterPosition = holder.getBindingAdapterPosition();
                if (bindingAdapterPosition >= 0 && bindingAdapterPosition < itemCount) {
                    z = true;
                }
                if (z && (function3 = this$0.f44446OooOO0O) != 0) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    function3.invoke(this$0, it, Integer.valueOf(holder.getBindingAdapterPosition()));
                    break;
                }
                break;
            default:
                o000O0O0 this$1 = (o000O0O0) adapter;
                ViewHolder helper = (ViewHolder) o0o0o00;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullParameter(helper, "$helper");
                this$1.f27535Oooo000 = false;
                this$1.f27533OooOooO.remove(Integer.valueOf(helper.getLayoutPosition()));
                Function1<? super Integer, Unit> function1 = this$1.f27531OooOoo;
                if (function1 != null) {
                    function1.invoke(Integer.valueOf(helper.getLayoutPosition()));
                }
                this$1.notifyDataSetChanged();
                break;
        }
    }
}
