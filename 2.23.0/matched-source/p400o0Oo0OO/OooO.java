package p400o0Oo0OO;

import android.view.View;
import com.yalla.yalla.base.paging.PagingViewHolder;
import com.yalla.yalla.data.db.table.YallaTeamMessage;
import com.yalla.yalla.ui.adapter.o00O00o0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class OooO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f44430OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f44431OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f44432OooO0o0;

    public /* synthetic */ OooO(OooOO0O oooOO0O, Object obj, int i) {
        this.f44430OooO0Oo = i;
        this.f44432OooO0o0 = oooOO0O;
        this.f44431OooO0o = obj;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // android.view.View.OnClickListener
    public final void onClick(View it) {
        Function3<? super OooOO0O<T>, ? super View, ? super Integer, Unit> function3;
        int i = this.f44430OooO0Oo;
        OooOO0O this$0 = this.f44432OooO0o0;
        Object obj = this.f44431OooO0o;
        switch (i) {
            case 0:
                PagingViewHolder holder = (PagingViewHolder) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(holder, "$holder");
                int itemCount = this$0.getItemCount();
                int bindingAdapterPosition = holder.getBindingAdapterPosition();
                if ((bindingAdapterPosition >= 0 && bindingAdapterPosition < itemCount) && (function3 = this$0.f44447OooOO0o) != 0) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    function3.invoke(this$0, it, Integer.valueOf(holder.getBindingAdapterPosition()));
                    break;
                }
                break;
            default:
                o00O00o0 this$1 = (o00O00o0) this$0;
                YallaTeamMessage item = (YallaTeamMessage) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullParameter(item, "$item");
                Function1<? super YallaTeamMessage, Unit> function1 = this$1.f27619OooOOoo;
                if (function1 != null) {
                    function1.invoke(item);
                }
                break;
        }
    }
}
