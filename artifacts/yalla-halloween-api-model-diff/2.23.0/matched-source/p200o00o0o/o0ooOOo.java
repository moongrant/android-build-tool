package p200o00o0o;

import android.content.Context;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.OooO00o;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.ui.activity.user.UserInfoEditRemarkActivity;
import kotlin.jvm.internal.Intrinsics;
import p367o0OOo0o0.Oooo000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0ooOOo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f39139OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f39140OooO0o0;

    public /* synthetic */ o0ooOOo(Object obj, int i) {
        this.f39139OooO0Oo = i;
        this.f39140OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f39139OooO0Oo;
        Object obj = this.f39140OooO0o0;
        switch (i) {
            case 0:
                OooO00o oooO00o = (OooO00o) obj;
                AnalyticsListener.OooO00o oooO00oOooo0OO = oooO00o.Oooo0OO();
                oooO00o.Oooo(oooO00oOooo0OO, 1028, new o00O0000(oooO00oOooo0OO));
                oooO00o.f11375OooO.OooO0Oo();
                break;
            case 1:
                Object obj2 = com.google.firebase.installations.OooO00o.f20178OooOOO0;
                ((com.google.firebase.installations.OooO00o) obj).OooO0O0(false);
                break;
            default:
                UserInfoEditRemarkActivity this$0 = (UserInfoEditRemarkActivity) obj;
                int i2 = UserInfoEditRemarkActivity.f27323OooOo0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                EditText view = this$0.OooOo().f57751OooO0O0;
                Intrinsics.checkNotNullExpressionValue(view, "binding.etText");
                Intrinsics.checkNotNullParameter(view, "view");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "view.context");
                InputMethodManager inputMethodManagerOooO00o = Oooo000.OooO00o(context);
                view.setFocusable(true);
                view.setFocusableInTouchMode(true);
                view.requestFocus();
                inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
                break;
        }
    }
}
