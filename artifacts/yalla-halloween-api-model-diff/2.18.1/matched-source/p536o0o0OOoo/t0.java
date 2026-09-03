package p536o0o0OOoo;

import android.app.Activity;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.message.SearchFriendActivity;
import com.yalla.yalla.ui.activity.store.ArrearsDetailActivity;
import com.yalla.yalla.ui.fragment.PostDetailCommentFragment;
import com.youth.banner.listener.OnBannerListener;
import kotlin.jvm.internal.Intrinsics;
import o00OO0O0.o0OOO0o;
import p186o00o00Oo.o0ooOOo;
import p254o00ooO0O.o00000O;
import p407o0Oo0OOo.oO000Oo;
import p417o0Oo0oOo.oO00OO0O;
import p498o0o00Oo0.OooOOO;
import p601o0oo00Oo.o00O0;
import p601o0oo00Oo.oo00o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t0 implements o0ooOOo, oO00OO0O, OnBannerListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f43869OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f43870OooO0o0;

    public /* synthetic */ t0(Object obj, int i) {
        this.f43869OooO0Oo = i;
        this.f43870OooO0o0 = obj;
    }

    @Override // com.youth.banner.listener.OnBannerListener
    public final void OnBannerClick(Object obj, int i) {
        o00O0 this$0 = (o00O0) this.f43870OooO0o0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        oo00o onLogin = new oo00o(this$0, i);
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

    @Override // p417o0Oo0oOo.oO00OO0O
    public final void OooO0OO(oO000Oo oo000oo) {
        PostDetailCommentFragment.m387init$lambda2((PostDetailCommentFragment) this.f43870OooO0o0, oo000oo);
    }

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        switch (this.f43869OooO0Oo) {
            case 0:
                SearchFriendActivity searchFriendActivity = (SearchFriendActivity) this.f43870OooO0o0;
                int i = SearchFriendActivity.f22198Oooooo0;
                searchFriendActivity.OooOoO(false);
                break;
            default:
                ArrearsDetailActivity this$0 = (ArrearsDetailActivity) this.f43870OooO0o0;
                ArrearsDetailActivity.OooO00o oooO00o = ArrearsDetailActivity.f23194OooooOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOooo(false);
                break;
        }
    }
}
