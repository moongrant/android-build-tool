package p535o0o0OOoO;

import android.content.Context;
import android.widget.ImageView;
import com.app.base.model.BlackUserModel;
import com.chad.library.adapter.base.OooO00o;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.UserPremiumView;
import com.yalla.yalla.ui.activity.main.BlackListActivity;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class oO0OOO00 extends OooO0OO<BlackUserModel.DataBean> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ BlackListActivity f43668OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OOO00(BlackListActivity blackListActivity, Context context) {
        super(context, R.layout.item_black_list);
        this.f43668OooO00o = blackListActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o oooO0o = (OooO0o) oooO00o;
        BlackUserModel.DataBean dataBean = (BlackUserModel.DataBean) obj;
        oooO0o.OooO0oO(R.id.item_black_list_del_iv, this.f43668OooO00o.f21923OoooOoO);
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.mContext);
        oooO00o2.OooO00o(o00OOO.OooO00o.OooO00o());
        oooO00o2.f48429OooO0OO = dataBean.headurl;
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.OooO0o((ImageView) oooO0o.OooO0Oo(R.id.item_black_list_head_iv));
        oooO0o.OooOO0(R.id.item_black_list_name_tv, dataBean.nickname);
        ((UserPremiumView) oooO0o.OooO0Oo(R.id.iv_vip)).OooO0OO(dataBean.vip, dataBean.viplevel);
        int i = dataBean.sex;
        if (i == 0) {
            oooO0o.OooO0oO(R.id.item_black_list_sex_iv, true);
            oooO0o.OooO0oo(R.id.item_black_list_sex_iv, R.drawable.icon_female);
        } else if (i != 1) {
            oooO0o.OooO0oO(R.id.item_black_list_sex_iv, false);
        } else {
            oooO0o.OooO0oO(R.id.item_black_list_sex_iv, true);
            oooO0o.OooO0oo(R.id.item_black_list_sex_iv, R.drawable.icon_male);
        }
        oooO0o.OooOOOO(R.id.item_black_list_head_iv, new oO00o000(this, dataBean));
        oooO0o.OooOOOO(R.id.item_black_list_del_iv, new oO00o00(this, dataBean, oooO0o));
    }
}
