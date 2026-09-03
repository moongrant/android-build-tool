package p502o0o00oOO;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import com.code.android.util.OooO0O0;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oO00OOOo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49547OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f49548OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49549OooO0o0;

    public /* synthetic */ oO00OOOo(int i, Object obj, Object obj2) {
        this.f49547OooO0Oo = i;
        this.f49549OooO0o0 = obj;
        this.f49548OooO0o = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f49547OooO0Oo;
        Object obj = this.f49548OooO0o;
        Object obj2 = this.f49549OooO0o0;
        switch (i) {
            case 0:
                oOOoOOO0 this$0 = (oOOoOOO0) obj2;
                ChatModel model = (ChatModel) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(model, "$model");
                this$0.getClass();
                oO00Oo0 onLogin = new oO00Oo0(this$0, model);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                o000000O o000000o2 = o000000O.f46674OooO00o;
                if (!Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                    Activity activityOooO0O0 = OooO0O0.OooO0O0();
                    if (activityOooO0O0 != null) {
                        int i2 = LoginActivity.f25186OooOo0O;
                        LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                    }
                } else {
                    onLogin.invoke();
                }
                break;
            default:
                Dialog this_apply = (Dialog) obj2;
                Function0 function0 = (Function0) obj;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                this_apply.dismiss();
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
        }
    }
}
