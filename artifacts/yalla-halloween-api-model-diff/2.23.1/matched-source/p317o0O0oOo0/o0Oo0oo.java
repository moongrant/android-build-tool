package p317o0O0oOo0;

import android.content.Context;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.ui.activity.user.UserInfoEditRemarkActivity;
import kotlin.jvm.internal.Intrinsics;
import p373o0OOo0oO.o0OOO0o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0Oo0oo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f41929OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f41930OooO0o0;

    public /* synthetic */ o0Oo0oo(Object obj, int i) {
        this.f41929OooO0Oo = i;
        this.f41930OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f41929OooO0Oo;
        Object obj = this.f41930OooO0o0;
        switch (i) {
            case 0:
                o0OO00O o0oo00o2 = (o0OO00O) obj;
                o00oO0o o00oo0o2 = o0oo00o2.f41920OooOOOO;
                boolean z = o0oo00o2.f41925OooOo00;
                o00oO0o.OooO00o oooO00o = o00oo0o2.f41893OooO0Oo;
                synchronized (oooO00o) {
                    try {
                        oooO00o.f41901OooO0Oo = z ? oooO00o.f41904OooO0oO : oooO00o.f41905OooO0oo;
                        oooO00o.f41903OooO0o0 = z ? oooO00o.f41897OooO : oooO00o.f41906OooOO0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                o00oo0o2.f41894OooO0o0.OooO00o(z);
                return;
            default:
                UserInfoEditRemarkActivity this$0 = (UserInfoEditRemarkActivity) obj;
                int i2 = UserInfoEditRemarkActivity.f26859OooOo0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                EditText view = this$0.OooOo().f45508OooO0O0;
                Intrinsics.checkNotNullExpressionValue(view, "etText");
                Intrinsics.checkNotNullParameter(view, "view");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                InputMethodManager inputMethodManagerOooO00o = o0OOO0o.OooO00o(context);
                view.setFocusable(true);
                view.setFocusableInTouchMode(true);
                view.requestFocus();
                inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
                return;
        }
    }
}
