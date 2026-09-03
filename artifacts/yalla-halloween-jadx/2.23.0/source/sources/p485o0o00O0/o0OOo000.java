package p485o0o00O0;

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
import p362o0OOo0O.OooOO0;
import p464o0Oooo.o000000O;
import p543o0oO0O00.OooO;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOo000 extends o000O<TopicBlackUserModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ TopicBlackListActivity f48002OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOo000(TopicBlackListActivity topicBlackListActivity, int i) {
        super(topicBlackListActivity, i);
        this.f48002OooOoo0 = topicBlackListActivity;
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
        TopicBlackListActivity topicBlackListActivity = this.f48002OooOoo0;
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(topicBlackListActivity);
        oooO00o.f43911OooO0OO = topicBlackUserModel.getImageurl();
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO00o(OooO.OooO0OO());
        oooO00o.OooO0Oo((ImageView) helper.getView(oO00O0oO.nivUserHeader));
        helper.setText(oO00O0oO.tvUserName, topicBlackUserModel.getNickName());
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Long l = (Long) o000000O.OooOOo0().getValue();
        helper.setText(oO00O0oO.tvInfo, (l != null && l.longValue() == topicBlackUserModel.getExUserid()) ? o0000.OooO0OO(oO00OOo0.topic_black_list_Blocked_by_you) : o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.topic_black_list_Blocked_by_Admin_XX), topicBlackUserModel.getExnickName()));
        ((SexView) helper.getView(oO00O0oO.sexView)).setSex(topicBlackUserModel.getSex());
        ((UserPremiumView) helper.getView(oO00O0oO.vipView)).OooO0OO(topicBlackUserModel.getVip(), topicBlackUserModel.getVipLevel());
        int i = oO00O0oO.ivDelete;
        helper.setGone(i, topicBlackListActivity.f26279OooOo0O);
        helper.addOnClickListener(i);
    }
}
