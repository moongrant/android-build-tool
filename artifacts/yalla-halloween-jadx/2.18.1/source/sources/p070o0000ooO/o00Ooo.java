package p070o0000ooO;

import OooO00o.OooO00o;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.ui.activity.message.SearchFriendActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.fragment.BadgeNewsFragment;
import com.yalla.yalla.ui.fragment.PostDetailCommentFragment;
import java.util.Objects;
import o00Oo00.OooO0OO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00Ooo implements BaseQuickAdapter.OooOOOO, BaseQuickAdapter.OooOOO0, OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f28006OooO0Oo;

    public /* synthetic */ o00Ooo(Object obj) {
        this.f28006OooO0Oo = obj;
    }

    @Override // o00Oo00.OooO0OO
    public final void OooO00o(Object obj) {
        PostDetailCommentFragment.m388init$lambda3((PostDetailCommentFragment) this.f28006OooO0Oo, (Integer) obj);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        SearchFriendActivity searchFriendActivity = (SearchFriendActivity) this.f28006OooO0Oo;
        int i2 = SearchFriendActivity.f22198Oooooo0;
        Objects.requireNonNull(searchFriendActivity);
        UserInfo userInfo = (UserInfo) baseQuickAdapter.getData().get(i);
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23452o0ooOO0;
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("");
        sbOooO0o0.append(userInfo.getUserId());
        oooO00o.OooO00o(searchFriendActivity, sbOooO0o0.toString());
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOO0
    public final void OooO0oo(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        BadgeNewsFragment.m316initView$lambda0((BadgeNewsFragment) this.f28006OooO0Oo, baseQuickAdapter, view, i);
    }
}
