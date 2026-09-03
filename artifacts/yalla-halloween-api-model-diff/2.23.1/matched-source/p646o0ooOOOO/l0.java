package p646o0ooOOOO;

import android.view.View;
import android.widget.TextView;
import com.code.android.util.o0000;
import com.yalla.yalla.base.paging.PagingViewHolder;
import com.yalla.yalla.ui.view.TopicInfoHeadView;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import p407o0Oo0OOO.r3;
import p425o0OoO0OO.o00O0O0;
import p565o0oOo000.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f57574OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f57575OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f57576OooO0o0;

    public /* synthetic */ l0(int i, Object obj, Object obj2) {
        this.f57574OooO0Oo = i;
        this.f57576OooO0o0 = obj;
        this.f57575OooO0o = obj2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Function3<? super n0<T>, ? super View, ? super Integer, Unit> function3;
        int i = this.f57574OooO0Oo;
        Object obj = this.f57575OooO0o;
        Object obj2 = this.f57576OooO0o0;
        switch (i) {
            case 0:
                n0 this$0 = (n0) obj2;
                PagingViewHolder holder = (PagingViewHolder) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(holder, "$holder");
                int itemCount = this$0.getItemCount();
                int bindingAdapterPosition = holder.getBindingAdapterPosition();
                if ((bindingAdapterPosition >= 0 && bindingAdapterPosition < itemCount) && (function3 = this$0.f57586OooOO0o) != 0) {
                    Intrinsics.checkNotNull(view);
                    function3.invoke(this$0, view, Integer.valueOf(holder.getBindingAdapterPosition()));
                    break;
                }
                break;
            default:
                TopicInfoHeadView this$1 = (TopicInfoHeadView) obj2;
                TextView this_apply = (TextView) obj;
                int i2 = TopicInfoHeadView.f30240OooO0oO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                int maxLines = this$1.f30243OooO0o0.f45440OooOOO0.getMaxLines();
                r3 r3Var = this$1.f30243OooO0o0;
                if (maxLines != 2) {
                    o00O0O0.OooO0o(this_apply, o0000.OooO0O0(o0OOO0o.icon_arrow_bottom_gray));
                    r3Var.f45440OooOOO0.setMaxLines(2);
                } else {
                    o00O0O0.OooO0o(this_apply, o0000.OooO0O0(o0OOO0o.icon_arrow_top_gray));
                    r3Var.f45440OooOOO0.setMaxLines(Integer.MAX_VALUE);
                }
                break;
        }
    }
}
