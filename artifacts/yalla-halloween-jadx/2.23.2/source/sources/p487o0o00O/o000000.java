package p487o0o00O;

import android.widget.ImageView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.BlackUserModel;
import com.yalla.yalla.ui.activity.main.BlackListActivity;
import com.yalla.yalla.ui.view.UserPremiumView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p368o0OOo0Oo.Oooo000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0Oo0oo;
import p571o0oOoO0.o0000oo;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000 extends o0000oo<BlackUserModel.DataBean> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ BlackListActivity f48749OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000(BlackListActivity blackListActivity, int i) {
        super(blackListActivity, i);
        this.f48749OooOoo0 = blackListActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        BlackUserModel.DataBean item = (BlackUserModel.DataBean) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        int i = o0OO00O.item_black_list_del_iv;
        BlackListActivity blackListActivity = this.f48749OooOoo0;
        helper.setGone(i, blackListActivity.f24915OooOOo);
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this.f13186OooOOOo);
        oooO00o.OooO00o(d1.OooO00o());
        oooO00o.f43126OooO0OO = item.headurl;
        oooO00o.f43124OooO00o = 0;
        int i2 = o0OO00O.item_black_list_head_iv;
        oooO00o.OooO0Oo((ImageView) helper.getView(i2));
        helper.setText(o0OO00O.item_black_list_name_tv, item.nickname);
        ((UserPremiumView) helper.getView(o0OO00O.iv_vip)).OooO0OO(item.vip, item.viplevel);
        int i3 = item.sex;
        if (i3 == 0) {
            int i4 = o0OO00O.item_black_list_sex_iv;
            helper.setGone(i4, true);
            helper.setImageResource(i4, o0Oo0oo.icon_female);
        } else if (i3 != 1) {
            helper.setGone(o0OO00O.item_black_list_sex_iv, false);
        } else {
            int i5 = o0OO00O.item_black_list_sex_iv;
            helper.setGone(i5, true);
            helper.setImageResource(i5, o0Oo0oo.icon_male);
        }
        helper.setViewOnClickListener(i2, new o0O0O00(blackListActivity, item));
        helper.setViewOnClickListener(i, new o000OOo(blackListActivity, item, helper));
    }
}
