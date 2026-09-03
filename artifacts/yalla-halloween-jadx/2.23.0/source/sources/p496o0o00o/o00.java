package p496o0o00o;

import android.view.View;
import android.widget.ImageView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.user.FollowerActivity;
import com.yalla.yalla.ui.activity.user.OooO0O0;
import com.yalla.yalla.ui.view.UserTagView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p362o0OOo0O.OooOO0;
import p396o0Oo0O.OooOOO;
import p406o0Oo0Ooo.oOO0O0O;
import p543o0oO0O00.OooO;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00 extends o000O<UserInfoModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ FollowerActivity f48979OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00(FollowerActivity followerActivity, int i) {
        super(followerActivity, i);
        this.f48979OooOoo0 = followerActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        UserInfoModel item = (UserInfoModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        View view = helper.itemView;
        FollowerActivity followerActivity = this.f48979OooOoo0;
        view.setOnClickListener(new OooO0O0(item, followerActivity));
        int i = oO00O0oO.iv_follow;
        helper.getView(i).setOnClickListener(new o000OOo0(item, followerActivity));
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(this.f10108OooOOOo);
        oooO00o.OooO00o(OooO.OooO00o());
        oooO00o.f43911OooO0OO = OooOOO.OooO00o(item.getUserHeader());
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo((ImageView) helper.getView(oO00O0oO.niv_header));
        helper.setGone(oO00O0oO.iv_official, item.isOfficialRole());
        UserTagView userTagView = (UserTagView) helper.getView(oO00O0oO.userTagView);
        userTagView.setName(oOO0O0O.OooO0O0(item.getUserId(), item.getUserName()));
        userTagView.setSex(item.getSex());
        userTagView.OooO0oo(item.getPremiumLevel(), item.isPremium());
        int vipLevel = item.getVipLevel();
        followerActivity.getClass();
        userTagView.OooO0Oo(vipLevel, true, followerActivity);
        userTagView.OooOO0O(followerActivity, Integer.valueOf(item.getWealthLevel()), item.getWealthBadgeWithBg(), 10.0f);
        helper.setText(oO00O0oO.tv_bio, item.getBio() == null ? "" : item.getBio());
        helper.setImageResource(i, item.getIsFollow() ? oOo00OO0.icon_fans_followed : oOo00OO0.icon_fans_follow);
    }
}
