package p045Oooooo;

import android.app.Activity;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.code.android.util.OooO0O0;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.fragment.moment.MainMomentsTopicAddMoreFragment;
import com.yalla.yalla.ui.fragment.moment.o00oO0o;
import kotlin.jvm.internal.Intrinsics;
import p464o0Oooo.o000000O;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000O00 implements o00O000.OooO0OO, BaseQuickAdapter.OooO0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f1887OooO0Oo;

    public /* synthetic */ o0000O00(Object obj) {
        this.f1887OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0O0
    public final void OooO0OO(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        MainMomentsTopicAddMoreFragment this$0 = (MainMomentsTopicAddMoreFragment) this.f1887OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o00oO0o onLogin = new o00oO0o(this$0, i);
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

    @Override // o0ooOO0.o00O000.OooO0OO
    public final Object OooO0o0(o00O000.OooO00o oooO00o) {
        o0000Ooo.OooO0OO oooO0OO = (o0000Ooo.OooO0OO) this.f1887OooO0Oo;
        o0000Ooo.this.f1905OooO0oo.execute(new o000OO(0, oooO0OO, oooO00o));
        return "acquireBuffer";
    }
}
