package p499o0o00o0O;

import android.app.Activity;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.code.android.util.OooO0O0;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.store.ArrearsDetailActivity;
import com.yalla.yalla.ui.fragment.ExploreTagRoomListFragment;
import com.yalla.yalla.ui.view.moment.MomentDetailCommentItemView;
import kotlin.jvm.internal.Intrinsics;
import p464o0Oooo.o000000O;
import p556o0oOOooo.ooo0Oo0;
import p562o0oOo0O.o000oOoO;
import p598o0oo00oO.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0000O implements o000oOoO, BaseQuickAdapter.OooOO0, o0000O00.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f49361OooO0Oo;

    public /* synthetic */ o0000O(Object obj) {
        this.f49361OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOO0
    public final void OooO00o() {
        ExploreTagRoomListFragment.initView$lambda$1((ExploreTagRoomListFragment) this.f49361OooO0Oo);
    }

    @Override // p562o0oOo0O.o000oOoO
    public final void OooO0O0() {
        ArrearsDetailActivity this$0 = (ArrearsDetailActivity) this.f49361OooO0Oo;
        int i = ArrearsDetailActivity.f26968OooOo0o;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooOoO(true);
    }

    @Override // o0oo00oO.o0000O00.OooO00o
    public final void OooO0Oo() {
        MomentDetailCommentItemView this$0 = (MomentDetailCommentItemView) this.f49361OooO0Oo;
        int i = MomentDetailCommentItemView.f31080OooOOO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getItem().isHide()) {
            return;
        }
        ooo0Oo0 onLogin = new ooo0Oo0(this$0);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            int i2 = LoginActivity.f25186OooOo0O;
            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
        }
    }
}
