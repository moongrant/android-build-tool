package p506o0o00oOo;

import android.view.View;
import android.widget.ImageView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.user.FollowerActivity;
import com.yalla.yalla.ui.activity.user.OooO0O0;
import com.yalla.yalla.ui.view.UserTagView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p368o0OOo0Oo.Oooo000;
import p403o0Oo0OO.OooO0OO;
import p412o0Oo0o0O.o000O000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0Oo0oo;
import p571o0oOoO0.o0000oo;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000OOo extends o0000oo<UserInfoModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ FollowerActivity f50439OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000OOo(FollowerActivity followerActivity, int i) {
        super(followerActivity, i);
        this.f50439OooOoo0 = followerActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        UserInfoModel item = (UserInfoModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        View view = helper.itemView;
        FollowerActivity followerActivity = this.f50439OooOoo0;
        view.setOnClickListener(new OooO0O0(item, followerActivity));
        int i = o0OO00O.iv_follow;
        helper.getView(i).setOnClickListener(new oO0Oo0oo(item, followerActivity));
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this.f13186OooOOOo);
        oooO00o.OooO00o(d1.OooO00o());
        oooO00o.f43126OooO0OO = OooO0OO.OooO00o(item.getUserHeader());
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0Oo((ImageView) helper.getView(o0OO00O.niv_header));
        helper.setGone(o0OO00O.iv_official, item.isOfficialRole());
        UserTagView userTagView = (UserTagView) helper.getView(o0OO00O.userTagView);
        userTagView.setName(o000O000.OooO0O0(item.getUserId(), item.getUserName()));
        userTagView.setSex(item.getSex());
        userTagView.OooO0oo(item.getPremiumLevel(), item.isPremium());
        int vipLevel = item.getVipLevel();
        followerActivity.getClass();
        userTagView.OooO0Oo(vipLevel, true, followerActivity);
        userTagView.OooOO0O(followerActivity, Integer.valueOf(item.getWealthLevel()), item.getWealthBadgeWithBg(), 10.0f);
        helper.setText(o0OO00O.tv_bio, item.getBio() == null ? "" : item.getBio());
        helper.setImageResource(i, item.getIsFollow() ? o0Oo0oo.icon_fans_followed : o0Oo0oo.icon_fans_follow);
    }
}
