package p501o0o00o;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.chad.library.adapter.base.OooO00o;
import com.weieyu.yalla.R;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.oOO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000O0 extends OooO0OO<Integer> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o00000 f41448OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O0(o00000 o00000Var, Context context) {
        super(context, R.layout.item_spinner_gift_num);
        this.f41448OooO00o = o00000Var;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o helper = (OooO0o) oooO00o;
        int iIntValue = ((Number) obj).intValue();
        Intrinsics.checkNotNullParameter(helper, "helper");
        TextView textView = (TextView) helper.OooO0Oo(R.id.item_spinner_gift_num_tv_gift_num);
        Objects.requireNonNull(this.f41448OooO00o.f41441OooO0O0);
        textView.setTextColor(o000O0O0.OooO00o(R.color.color_white));
        textView.setText(String.valueOf(iIntValue));
        View viewOooO0Oo = helper.OooO0Oo(R.id.item_spinner_gift_num_view_line);
        Objects.requireNonNull(this.f41448OooO00o.f41441OooO0O0);
        viewOooO0Oo.setBackgroundColor(o000O0O0.OooO00o(R.color.color_white_8));
        if (helper.getLayoutPosition() == getItemCount() - 1) {
            Intrinsics.checkNotNullExpressionValue(viewOooO0Oo, "");
            oOO00O.OooO00o(viewOooO0Oo);
        } else {
            Intrinsics.checkNotNullExpressionValue(viewOooO0Oo, "");
            oOO00O.OooO(viewOooO0Oo);
        }
    }
}
