package p198o00o0OoO;

import android.app.Activity;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.code.android.util.OooO0O0;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity;
import com.yalla.yalla.ui.adapter.oo0o0O0;
import com.yalla.yalla.ui.fragment.moment.MainMomentsTopicNewFragment;
import com.yalla.yalla.ui.fragment.moment.o0O0O00;
import kotlin.jvm.internal.Intrinsics;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O0O0 implements BaseQuickAdapter.OooO0o, BaseQuickAdapter.OooO0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f39080OooO0Oo;

    public /* synthetic */ o00O0O0(Object obj) {
        this.f39080OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0O0
    public final void OooO0OO(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        MainMomentsTopicNewFragment this$0 = (MainMomentsTopicNewFragment) this.f39080OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o0O0O00 onLogin = new o0O0O00(this$0, i);
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

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        YallaTeamMessageActivity this$0 = (YallaTeamMessageActivity) this.f39080OooO0Oo;
        int i2 = YallaTeamMessageActivity.f25774OooOoo0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        oo0o0O0 oo0o0o0 = this$0.f25776OooOo;
        if (oo0o0o0 != null) {
            oo0o0o0.f27694OooOoo0 = i;
        }
        if (oo0o0o0 != null) {
            oo0o0o0.notifyDataSetChanged();
        }
    }
}
