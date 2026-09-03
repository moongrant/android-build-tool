package p564o0oOo0O;

import android.content.Context;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.ui.view.moment.SendMomentPollView;
import kotlin.jvm.internal.Intrinsics;
import p371o0OOo0oO.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0OO0o00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SendMomentPollView f56368OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f56369OooO0o0;

    public /* synthetic */ o0OO0o00(SendMomentPollView sendMomentPollView, int i) {
        this.f56368OooO0Oo = sendMomentPollView;
        this.f56369OooO0o0 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = SendMomentPollView.f30681OooOO0o;
        SendMomentPollView this$0 = this.f56368OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EditText view = (EditText) this$0.f30684OooO0o.f27033OooOooO.get(Integer.valueOf(this.f56369OooO0o0));
        if (view != null) {
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            InputMethodManager inputMethodManagerOooO00o = o0OOO0o.OooO00o(context);
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
            inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
        }
    }
}
