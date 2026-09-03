package p536o0o0OOoo;

import android.content.Context;
import android.widget.ImageView;
import com.chad.library.adapter.base.OooO00o;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.common.ui.view.UserTagView;
import com.yalla.yalla.ui.activity.message.SearchFriendActivity;
import p168o00Ooo0.o0O0O00;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class v0 extends OooO0OO<UserInfo> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ SearchFriendActivity f43879OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(SearchFriendActivity searchFriendActivity, Context context) {
        super(context, R.layout.item_searchfriend_result);
        this.f43879OooO00o = searchFriendActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o oooO0o = (OooO0o) oooO00o;
        UserInfo userInfo = (UserInfo) obj;
        String strTrim = this.f43879OooO00o.f22199OoooOo0.getText().toString().trim();
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.mContext);
        oooO00o2.OooO00o(o00OOO.OooO00o.OooO00o());
        oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgSize(userInfo.getUserHeader(), OooOo00.OooO00o(80), true);
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.OooO0o((ImageView) oooO0o.OooO0Oo(R.id.fr_icon));
        UserTagView userTagView = (UserTagView) oooO0o.OooO0Oo(R.id.searchUserTagView);
        userTagView.OooO0oO(userInfo.isPremium(), userInfo.getPremiumLevel());
        userTagView.setSex(userInfo.getSex());
        userTagView.setName(o0O0O00.OooO0O0(OooOOO.OooO00o(R.color.color_00d8c9), userInfo.getUserName(), strTrim));
    }
}
