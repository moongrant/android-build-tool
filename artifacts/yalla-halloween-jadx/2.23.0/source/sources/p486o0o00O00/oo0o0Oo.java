package p486o0o00O00;

import android.widget.ImageView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.BlackUserModel;
import com.yalla.yalla.ui.activity.main.BlackListActivity;
import com.yalla.yalla.ui.view.UserPremiumView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p362o0OOo0O.OooOO0;
import p543o0oO0O00.OooO;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0o0Oo extends o000O<BlackUserModel.DataBean> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ BlackListActivity f48414OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0Oo(BlackListActivity blackListActivity, int i) {
        super(blackListActivity, i);
        this.f48414OooOoo0 = blackListActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        BlackUserModel.DataBean item = (BlackUserModel.DataBean) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        int i = oO00O0oO.item_black_list_del_iv;
        BlackListActivity blackListActivity = this.f48414OooOoo0;
        helper.setGone(i, blackListActivity.f25369OooOOo);
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(this.f10108OooOOOo);
        oooO00o.OooO00o(OooO.OooO00o());
        oooO00o.f43911OooO0OO = item.headurl;
        oooO00o.f43909OooO00o = 0;
        int i2 = oO00O0oO.item_black_list_head_iv;
        oooO00o.OooO0Oo((ImageView) helper.getView(i2));
        helper.setText(oO00O0oO.item_black_list_name_tv, item.nickname);
        ((UserPremiumView) helper.getView(oO00O0oO.iv_vip)).OooO0OO(item.vip, item.viplevel);
        int i3 = item.sex;
        if (i3 == 0) {
            int i4 = oO00O0oO.item_black_list_sex_iv;
            helper.setGone(i4, true);
            helper.setImageResource(i4, oOo00OO0.icon_female);
        } else if (i3 != 1) {
            helper.setGone(oO00O0oO.item_black_list_sex_iv, false);
        } else {
            int i5 = oO00O0oO.item_black_list_sex_iv;
            helper.setGone(i5, true);
            helper.setImageResource(i5, oOo00OO0.icon_male);
        }
        helper.setViewOnClickListener(i2, new o0Oo0oo(blackListActivity, item));
        helper.setViewOnClickListener(i, new o0OO00O(blackListActivity, item, helper));
    }
}
