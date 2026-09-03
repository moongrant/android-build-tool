package p492o0o00OO0;

import android.widget.ImageView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.yalla.yalla.model.topic.TopicBlackUserModel;
import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import com.yalla.yalla.ui.view.SexView;
import com.yalla.yalla.ui.view.UserPremiumView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p368o0OOo0Oo.Oooo000;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p571o0oOoO0.o0000oo;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO00 extends o0000oo<TopicBlackUserModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ TopicBlackListActivity f49324OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO00(TopicBlackListActivity topicBlackListActivity, int i) {
        super(topicBlackListActivity, i);
        this.f49324OooOoo0 = topicBlackListActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        TopicBlackUserModel topicBlackUserModel = (TopicBlackUserModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        if (topicBlackUserModel == null) {
            return;
        }
        TopicBlackListActivity topicBlackListActivity = this.f49324OooOoo0;
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(topicBlackListActivity);
        oooO00o.f43126OooO0OO = topicBlackUserModel.getImageurl();
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO00o(d1.OooO0OO());
        oooO00o.OooO0Oo((ImageView) helper.getView(o0OO00O.nivUserHeader));
        helper.setText(o0OO00O.tvUserName, topicBlackUserModel.getNickName());
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Long l = (Long) o0O00oO0.OooOOo0().getValue();
        helper.setText(o0OO00O.tvInfo, (l != null && l.longValue() == topicBlackUserModel.getExUserid()) ? o0000.OooO0OO(o000000.topic_black_list_Blocked_by_you) : o0000O.OooO00o(o0000.OooO0OO(o000000.topic_black_list_Blocked_by_Admin_XX), topicBlackUserModel.getExnickName()));
        ((SexView) helper.getView(o0OO00O.sexView)).setSex(topicBlackUserModel.getSex());
        ((UserPremiumView) helper.getView(o0OO00O.vipView)).OooO0OO(topicBlackUserModel.getVip(), topicBlackUserModel.getVipLevel());
        int i = o0OO00O.ivDelete;
        helper.setGone(i, topicBlackListActivity.f25830OooOo0O);
        helper.addOnClickListener(i);
    }
}
