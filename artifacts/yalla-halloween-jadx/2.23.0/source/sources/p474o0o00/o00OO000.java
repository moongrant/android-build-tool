package p474o0o00;

import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.user.CountryItemData;
import com.yalla.yalla.ui.activity.account.PhoneCountryCodeSelectActivity;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p362o0OOo0O.OooOO0;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO000 extends o000O<CountryItemData> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ PhoneCountryCodeSelectActivity f47274OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO000(PhoneCountryCodeSelectActivity phoneCountryCodeSelectActivity, int i, ArrayList arrayList) {
        super(i, phoneCountryCodeSelectActivity, arrayList);
        this.f47274OooOoo0 = phoneCountryCodeSelectActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        CountryItemData item = (CountryItemData) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        PhoneCountryCodeSelectActivity phoneCountryCodeSelectActivity = this.f47274OooOoo0;
        TextView textView = phoneCountryCodeSelectActivity.f25255OooOo00;
        o00OO000 o00oo001 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etSearch");
            textView = null;
        }
        CharSequence text = textView.getText();
        Intrinsics.checkNotNullExpressionValue(text, "etSearch.text");
        if ((!StringsKt.isBlank(text)) || phoneCountryCodeSelectActivity.f25257OooOo0o == 0) {
            helper.setGone(oO00O0oO.tv_title, false);
        } else {
            int layoutPosition = helper.getLayoutPosition();
            o00OO000 o00oo002 = phoneCountryCodeSelectActivity.f25253OooOo;
            if (o00oo002 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                o00oo002 = null;
            }
            if (layoutPosition == o00oo002.OooOOO0()) {
                int i = oO00O0oO.tv_title;
                helper.setGone(i, true);
                helper.setText(i, oO00OOo0.select_country_Hot);
            } else {
                int layoutPosition2 = helper.getLayoutPosition();
                int i2 = phoneCountryCodeSelectActivity.f25257OooOo0o;
                o00OO000 o00oo003 = phoneCountryCodeSelectActivity.f25253OooOo;
                if (o00oo003 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                } else {
                    o00oo001 = o00oo003;
                }
                if (layoutPosition2 == o00oo001.OooOOO0() + i2) {
                    int i3 = oO00O0oO.tv_title;
                    helper.setGone(i3, true);
                    helper.setText(i3, oO00OOo0.All);
                } else {
                    helper.setGone(oO00O0oO.tv_title, false);
                }
            }
        }
        helper.setText(oO00O0oO.tv_country, item.getCountryName());
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(phoneCountryCodeSelectActivity);
        oooO00o.f43911OooO0OO = item.getIcon();
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo((ImageView) helper.getView(oO00O0oO.niv_flag));
        helper.setText(oO00O0oO.tv_code, "+" + item.getCountryCode());
        helper.addOnClickListener(oO00O0oO.ll_country_item);
    }
}
