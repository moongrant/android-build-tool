package p491o0o00O0o;

import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.user.CountryItemData;
import com.yalla.yalla.ui.activity.account.PhoneCountryCodeSelectActivity;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p368o0OOo0Oo.Oooo000;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p571o0oOoO0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oo00oO extends o0000oo<CountryItemData> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ PhoneCountryCodeSelectActivity f49073OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo00oO(PhoneCountryCodeSelectActivity phoneCountryCodeSelectActivity, int i, ArrayList arrayList) {
        super(i, phoneCountryCodeSelectActivity, arrayList);
        this.f49073OooOoo0 = phoneCountryCodeSelectActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        CountryItemData item = (CountryItemData) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        PhoneCountryCodeSelectActivity phoneCountryCodeSelectActivity = this.f49073OooOoo0;
        TextView textView = phoneCountryCodeSelectActivity.f24800OooOo00;
        oo00oO oo00oo = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etSearch");
            textView = null;
        }
        CharSequence text = textView.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if ((!StringsKt.isBlank(text)) || phoneCountryCodeSelectActivity.f24802OooOo0o == 0) {
            helper.setGone(o0OO00O.tv_title, false);
        } else {
            int layoutPosition = helper.getLayoutPosition();
            oo00oO oo00oo2 = phoneCountryCodeSelectActivity.f24798OooOo;
            if (oo00oo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                oo00oo2 = null;
            }
            if (layoutPosition == oo00oo2.OooOOO0()) {
                int i = o0OO00O.tv_title;
                helper.setGone(i, true);
                helper.setText(i, o000000.select_country_Hot);
            } else {
                int layoutPosition2 = helper.getLayoutPosition();
                int i2 = phoneCountryCodeSelectActivity.f24802OooOo0o;
                oo00oO oo00oo3 = phoneCountryCodeSelectActivity.f24798OooOo;
                if (oo00oo3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                } else {
                    oo00oo = oo00oo3;
                }
                if (layoutPosition2 == oo00oo.OooOOO0() + i2) {
                    int i3 = o0OO00O.tv_title;
                    helper.setGone(i3, true);
                    helper.setText(i3, o000000.All);
                } else {
                    helper.setGone(o0OO00O.tv_title, false);
                }
            }
        }
        helper.setText(o0OO00O.tv_country, item.getCountryName());
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(phoneCountryCodeSelectActivity);
        oooO00o.f43126OooO0OO = item.getIcon();
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0Oo((ImageView) helper.getView(o0OO00O.niv_flag));
        helper.setText(o0OO00O.tv_code, "+" + item.getCountryCode());
        helper.addOnClickListener(o0OO00O.ll_country_item);
    }
}
