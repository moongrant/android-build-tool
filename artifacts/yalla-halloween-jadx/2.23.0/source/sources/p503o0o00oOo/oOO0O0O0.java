package p503o0o00oOo;

import android.app.Activity;
import android.view.View;
import com.code.android.util.OooO0O0;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import kotlin.jvm.internal.Intrinsics;
import p464o0Oooo.o000000O;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oOO0O0O0 implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        o0OO000.OooO00o("101008");
        oOO0O0O.OooO0O0 onLogin = oOO0O0O.OooO0O0.f49717OooO0Oo;
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            int i = LoginActivity.f25186OooOo0O;
            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
        }
    }
}
