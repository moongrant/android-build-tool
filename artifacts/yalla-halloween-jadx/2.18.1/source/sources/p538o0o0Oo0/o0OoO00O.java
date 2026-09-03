package p538o0o0Oo0;

import android.widget.ImageView;
import com.app.base.view.SexView;
import com.chad.library.adapter.base.OooO00o;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.common.ui.view.UserPremiumView;
import com.yalla.yalla.model.TopicBlackUserModel;
import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import kotlin.jvm.internal.Intrinsics;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p254o00ooO0O.o000O0O0;
import p498o0o00Oo0.OooOOO;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoO00O extends OooO0OO<TopicBlackUserModel> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ TopicBlackListActivity f44059OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoO00O(TopicBlackListActivity topicBlackListActivity) {
        super(topicBlackListActivity, R.layout.item_black_list_topic);
        this.f44059OooO00o = topicBlackListActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o helper = (OooO0o) oooO00o;
        TopicBlackUserModel topicBlackUserModel = (TopicBlackUserModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        if (topicBlackUserModel == null) {
            return;
        }
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.f44059OooO00o);
        oooO00o2.f48429OooO0OO = topicBlackUserModel.getImageurl();
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o0());
        oooO00o2.OooO0o((ImageView) helper.OooO0Oo(R.id.nivUserHeader));
        helper.OooOO0(R.id.tvUserName, topicBlackUserModel.getNickName());
        Long value = OooOOO.f41216OooO00o.OooOo().getValue();
        helper.OooOO0(R.id.tvInfo, (value != null && value.longValue() == topicBlackUserModel.getExUserid()) ? o000O0O0.OooO0OO(R.string.topic_black_list_Blocked_by_you) : OooOo.OooO00o(o000O0O0.OooO0OO(R.string.topic_black_list_Blocked_by_Admin_XX), topicBlackUserModel.getExnickName()));
        ((SexView) helper.OooO0Oo(R.id.sexView)).setSex(topicBlackUserModel.getSex());
        ((UserPremiumView) helper.OooO0Oo(R.id.vipView)).OooO0OO(topicBlackUserModel.getVip(), topicBlackUserModel.getVipLevel());
        helper.OooO0oO(R.id.ivDelete, this.f44059OooO00o.f22543OooooO0);
        helper.OooO0O0(R.id.ivDelete);
    }
}
