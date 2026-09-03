package p566o0oOo00O;

import android.content.Context;
import android.widget.ImageView;
import com.chad.library.adapter.base.OooO00o;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.common.ui.view.UserTagView;
import com.yalla.yalla.ui.activity.user.FollowerActivity;
import com.yalla.yalla.ui.activity.user.OooO0O0;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p520o0o0O0O0.o00O0O;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000oo extends OooO0OO<UserInfoModel> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ FollowerActivity f45205OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000oo(FollowerActivity followerActivity, Context context) {
        super(context, R.layout.item_rec_follower);
        this.f45205OooO00o = followerActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o oooO0o = (OooO0o) oooO00o;
        UserInfoModel userInfoModel = (UserInfoModel) obj;
        oooO0o.itemView.setOnClickListener(new OooO0O0(this, userInfoModel));
        oooO0o.OooO0Oo(R.id.iv_follow).setOnClickListener(new o0000O00(this, userInfoModel));
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.mContext);
        oooO00o2.OooO00o(o00OOO.OooO00o.OooO00o());
        oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgSize(userInfoModel.getUserHeader(), OooOo00.OooO00o(80), true);
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.OooO0o((ImageView) oooO0o.OooO0Oo(R.id.niv_header));
        oooO0o.OooO0oO(R.id.iv_official, userInfoModel.isOfficialRole());
        UserTagView userTagView = (UserTagView) oooO0o.OooO0Oo(R.id.userTagView);
        userTagView.setName(o00O0O.f42677OooO00o.OooO0O0(userInfoModel.getUserId(), userInfoModel.getUserName()));
        userTagView.setSex(userInfoModel.getSex());
        userTagView.OooO0oO(userInfoModel.isPremium(), userInfoModel.getPremiumLevel());
        userTagView.setKaVip(userInfoModel.getVipLevel());
        oooO0o.OooOO0(R.id.tv_bio, userInfoModel.getBio() == null ? "" : userInfoModel.getBio());
        oooO0o.OooO0oo(R.id.iv_follow, userInfoModel.getIsFollow() ? R.drawable.icon_fans_followed : R.drawable.icon_fans_follow);
    }
}
