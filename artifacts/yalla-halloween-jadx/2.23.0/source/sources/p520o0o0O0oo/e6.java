package p520o0o0O0oo;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000;
import com.code.android.util.o000OO00;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
public final class e6 extends o000O<Integer> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ d6 f53274OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(d6 d6Var, Context context, int i) {
        super(context, i);
        this.f53274OooOoo0 = d6Var;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        int iIntValue = ((Number) obj).intValue();
        Intrinsics.checkNotNullParameter(helper, "helper");
        TextView textView = (TextView) helper.getView(oO00O0oO.item_spinner_gift_num_tv_gift_num);
        d6 d6Var = this.f53274OooOoo0;
        textView.setTextColor(o0000.OooO00o(d6Var.f53268OooO0O0.f53298OooO0o0));
        textView.setText(String.valueOf(iIntValue));
        View convert$lambda$1 = helper.getView(oO00O0oO.item_spinner_gift_num_view_line);
        convert$lambda$1.setBackgroundColor(o0000.OooO00o(d6Var.f53268OooO0O0.f53294OooO0O0));
        if (helper.getLayoutPosition() == getItemCount() - 1) {
            Intrinsics.checkNotNullExpressionValue(convert$lambda$1, "convert$lambda$1");
            o000OO00.OooO0O0(convert$lambda$1);
        } else {
            Intrinsics.checkNotNullExpressionValue(convert$lambda$1, "convert$lambda$1");
            o000OO00.OooOOOO(convert$lambda$1);
        }
    }
}
