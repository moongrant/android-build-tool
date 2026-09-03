package p534o0o0OOo0;

import android.widget.ImageView;
import android.widget.TextView;
import com.app.base.model.CountryCodeItemModel;
import com.chad.library.adapter.base.OooO00o;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.account.PhoneCountryCodeSelectActivity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p168o00Ooo0.oo000o;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0oO0 extends OooO0OO<CountryCodeItemModel> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PhoneCountryCodeSelectActivity f43625OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0oO0(PhoneCountryCodeSelectActivity phoneCountryCodeSelectActivity, List<CountryCodeItemModel> list) {
        super(phoneCountryCodeSelectActivity, R.layout.item_country_code_seleted, list);
        this.f43625OooO00o = phoneCountryCodeSelectActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o helper = (OooO0o) oooO00o;
        CountryCodeItemModel item = (CountryCodeItemModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        TextView textView = this.f43625OooO00o.f21810Ooooo00;
        OooO0OO<CountryCodeItemModel> oooO0OO = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etSearch");
            textView = null;
        }
        CharSequence text = textView.getText();
        Intrinsics.checkNotNullExpressionValue(text, "etSearch.text");
        if ((!StringsKt.isBlank(text)) || this.f43625OooO00o.f21814OooooOo == 0) {
            helper.OooO0oO(R.id.tv_title, false);
        } else {
            int layoutPosition = helper.getLayoutPosition();
            OooO0OO<CountryCodeItemModel> oooO0OO2 = this.f43625OooO00o.f21815Oooooo0;
            if (oooO0OO2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                oooO0OO2 = null;
            }
            if (layoutPosition == oooO0OO2.getHeaderLayoutCount()) {
                helper.OooO0oO(R.id.tv_title, true);
                helper.OooO(R.id.tv_title, R.string.select_country_Hot);
            } else {
                int layoutPosition2 = helper.getLayoutPosition();
                PhoneCountryCodeSelectActivity phoneCountryCodeSelectActivity = this.f43625OooO00o;
                int i = phoneCountryCodeSelectActivity.f21814OooooOo;
                OooO0OO<CountryCodeItemModel> oooO0OO3 = phoneCountryCodeSelectActivity.f21815Oooooo0;
                if (oooO0OO3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                } else {
                    oooO0OO = oooO0OO3;
                }
                if (layoutPosition2 == oooO0OO.getHeaderLayoutCount() + i) {
                    helper.OooO0oO(R.id.tv_title, true);
                    helper.OooO(R.id.tv_title, R.string.All);
                } else {
                    helper.OooO0oO(R.id.tv_title, false);
                }
            }
        }
        helper.OooOO0(R.id.tv_country, item.getName());
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.f43625OooO00o);
        oooO00o2.f48429OooO0OO = oo000o.OooO0OO(item.getId());
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.OooO0o((ImageView) helper.OooO0Oo(R.id.niv_flag));
        helper.OooOO0(R.id.tv_code, '+' + item.getCountryCode());
        helper.OooO0O0(R.id.ll_country_item);
    }
}
