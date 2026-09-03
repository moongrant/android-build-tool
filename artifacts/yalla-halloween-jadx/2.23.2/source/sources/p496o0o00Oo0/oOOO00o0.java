package p496o0o00Oo0;

import android.app.Activity;
import com.code.android.util.OooO0O0;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.moment.postDetailCommentSonList.MomentReplyHeaderView;
import com.yalla.yalla.ui.fragment.CrystalDetailFragment;
import kotlin.jvm.internal.Intrinsics;
import p475o0Ooooo0.o0O00oO0;
import p559o0oOo.o00O0O;
import p593o0oo0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oOOO00o0 implements OooOOOO.OooO00o, o00O0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f49667OooO0Oo;

    public /* synthetic */ oOOO00o0(Object obj) {
        this.f49667OooO0Oo = obj;
    }

    @Override // p559o0oOo.o00O0O
    public final void OooO0OO() {
        ((CrystalDetailFragment) this.f49667OooO0Oo).lambda$initView$1();
    }

    @Override // o0oo0.OooOOOO.OooO00o
    public final void OooO0Oo() {
        MomentReplyHeaderView this$0 = (MomentReplyHeaderView) this.f49667OooO0Oo;
        int i = MomentReplyHeaderView.f25998OooOO0O;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a onLogin = new a(this$0);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            int i2 = LoginActivity.f24727OooOo0O;
            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
        }
    }
}
