package p511o0o0O;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p562o0oOo000.o0OO00O;
import p571o0oOoO0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo0 extends o0000oo<Integer> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f50935OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(Oooo000 oooo000, Context context, int i) {
        super(context, i);
        this.f50935OooOoo0 = oooo000;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        int iIntValue = ((Number) obj).intValue();
        Intrinsics.checkNotNullParameter(helper, "helper");
        TextView textView = (TextView) helper.getView(o0OO00O.item_spinner_gift_num_tv_gift_num);
        Oooo000 oooo000 = this.f50935OooOoo0;
        textView.setTextColor(o0000.OooO00o(oooo000.f50940OooO0O0.f51047OooO0o0));
        textView.setText(String.valueOf(iIntValue));
        View view = helper.getView(o0OO00O.item_spinner_gift_num_view_line);
        view.setBackgroundColor(o0000.OooO00o(oooo000.f50940OooO0O0.f51043OooO0O0));
        if (helper.getLayoutPosition() == getItemCount() - 1) {
            Intrinsics.checkNotNull(view);
            o000O.OooO0O0(view);
        } else {
            Intrinsics.checkNotNull(view);
            o000O.OooOOOO(view);
        }
    }
}
