package p538o0o0OOoo;

import android.app.Activity;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.message.SearchFriendActivity;
import com.yalla.yalla.ui.activity.store.ArrearsDetailActivity;
import com.yalla.yalla.ui.fragment.PostDetailCommentFragment;
import com.youth.banner.listener.OnBannerListener;
import kotlin.jvm.internal.Intrinsics;
import o00OO0O0.o0OOO0o;
import p187o00o00Oo.o0ooOOo;
import p255o00ooO0O.o00000O;
import p410o0Oo0OOo.oO000Oo0;
import p420o0Oo0oOo.oO00O0oO;
import p500o0o00Oo0.OooOOO;
import p603o0oo00Oo.o00O0;
import p603o0oo00Oo.oo00o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s0 implements o0ooOOo, oO00O0oO, OnBannerListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f43881Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f43882OoooO00;

    public /* synthetic */ s0(Object obj, int i) {
        this.f43881Oooo = i;
        this.f43882OoooO00 = obj;
    }

    @Override // com.youth.banner.listener.OnBannerListener
    public final void OnBannerClick(Object obj, int i) {
        o00O0 this$0 = (o00O0) this.f43882OoooO00;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        oo00o onLogin = new oo00o(this$0, i);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        if (Intrinsics.areEqual(OooOOO.f41235OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = o00000O.f34276OooO00o.OooO0O0();
        if (activityOooO0O0 != null) {
            LoginActivity.OooO00o oooO00o = LoginActivity.f21771Oooooo0;
            o0OOO0o.OooO00o(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
        }
    }

    @Override // p420o0Oo0oOo.oO00O0oO
    public final void OooO0OO(oO000Oo0 oo000oo0) {
        PostDetailCommentFragment.m387init$lambda2((PostDetailCommentFragment) this.f43882OoooO00, oo000oo0);
    }

    @Override // p187o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        switch (this.f43881Oooo) {
            case 0:
                SearchFriendActivity searchFriendActivity = (SearchFriendActivity) this.f43882OoooO00;
                int i = SearchFriendActivity.f22217Ooooooo;
                searchFriendActivity.OooOoO(false);
                break;
            default:
                ArrearsDetailActivity this$0 = (ArrearsDetailActivity) this.f43882OoooO00;
                ArrearsDetailActivity.OooO00o oooO00o = ArrearsDetailActivity.f23213Oooooo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOooo(false);
                break;
        }
    }
}
