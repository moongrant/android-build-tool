package p142o00OOooO;

import android.app.Activity;
import com.app.base.fragment.MomentListFeaturedFragment;
import com.app.base.fragment.OooOOO0;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.message.SearchFriendActivity;
import com.yalla.yalla.ui.activity.moment.PostDetailCommentSonListActivity;
import com.youth.banner.listener.OnBannerListener;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import o00OO0O0.o0OOO0o;
import o00Oo00.OooO0OO;
import p172o00OooO.o00O0O0O;
import p254o00ooO0O.o00000O;
import p391o0OOooOo.o0O00000;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000O0Oo implements OnBannerListener, o00O0O0O, OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f31948OooO0Oo;

    public /* synthetic */ o000O0Oo(Object obj) {
        this.f31948OooO0Oo = obj;
    }

    @Override // com.youth.banner.listener.OnBannerListener
    public final void OnBannerClick(Object obj, int i) {
        MomentListFeaturedFragment this$0 = (MomentListFeaturedFragment) this.f31948OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o0O00000.OooO0OO("Moments_Featured_banner");
        OooOOO0 onLogin = new OooOOO0(this$0, i);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        if (Intrinsics.areEqual(OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
        if (activityOooO0O0 != null) {
            LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
            o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
        }
    }

    @Override // o00Oo00.OooO0OO
    public final void OooO00o(Object obj) {
        PostDetailCommentSonListActivity this$0 = (PostDetailCommentSonListActivity) this.f31948OooO0Oo;
        int iIntValue = ((Integer) obj).intValue();
        PostDetailCommentSonListActivity.OooO00o oooO00o = PostDetailCommentSonListActivity.f22473o0ooOOo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.Oooo000().f49452OooO.setVisibility(0);
        this$0.Oooo000().f49452OooO.OooO0oo("svga/anim_loading_horse_gray.svga", this$0);
        this$0.Oooo000().f49452OooO.OooO();
        this$0.f22487o00o0O = iIntValue;
        this$0.Oooo0o();
    }

    @Override // p172o00OooO.o00O0O0O
    public final void OooO0O0(String str) {
        SearchFriendActivity searchFriendActivity = (SearchFriendActivity) this.f31948OooO0Oo;
        int i = SearchFriendActivity.f22198Oooooo0;
        Objects.requireNonNull(searchFriendActivity);
        if (str.length() > 0) {
            searchFriendActivity.OooOoO(true);
            searchFriendActivity.f22202Ooooo00.setVisibility(0);
            searchFriendActivity.f22201OoooOoo.setVisibility(4);
        } else {
            searchFriendActivity.f22204OooooO0.setNewData(null);
            searchFriendActivity.f22202Ooooo00.setVisibility(8);
            searchFriendActivity.f22204OooooO0.notifyDataSetChanged();
            searchFriendActivity.f22201OoooOoo.setVisibility(0);
        }
    }
}
