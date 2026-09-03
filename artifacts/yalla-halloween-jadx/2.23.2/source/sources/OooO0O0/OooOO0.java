package OooO0O0;

import OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.o0OoOo0;
import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.firebase.messaging.o000Oo0;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.ui.dialog.PasswordSettingDialog;
import kotlin.jvm.internal.Intrinsics;
import p371o0OOo0oO.o0OOO0o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f96OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f97OooO0o0;

    public /* synthetic */ OooOO0(Object obj, int i) {
        this.f96OooO0Oo = i;
        this.f97OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f96OooO0Oo;
        Object obj = this.f97OooO0o0;
        switch (i) {
            case 0:
                OooOOO0 this$0 = (OooOOO0) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o0OoOo0.OooO00o oooO00o = this$0.f106OooO0Oo;
                if (oooO00o != null) {
                    oooO00o.invoke(OooOo00.f108OooO0O0);
                    break;
                }
                break;
            case 1:
                o000Oo0.OooO00o oooO00o2 = (o000Oo0.OooO00o) obj;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + oooO00o2.f19892OooO00o.getAction() + " Releasing WakeLock.");
                oooO00o2.f19893OooO0O0.trySetResult(null);
                break;
            default:
                EditText view = ((PasswordSettingDialog) obj).f27408OooOOo0;
                Intrinsics.checkNotNullParameter(view, "view");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                InputMethodManager inputMethodManagerOooO00o = o0OOO0o.OooO00o(context);
                view.setFocusable(true);
                view.setFocusableInTouchMode(true);
                view.requestFocus();
                inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
                break;
        }
    }
}
