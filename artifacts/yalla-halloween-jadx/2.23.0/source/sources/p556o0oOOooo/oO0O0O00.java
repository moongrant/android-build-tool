package p556o0oOOooo;

import android.content.Context;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.ui.view.moment.SendMomentPollView;
import kotlin.jvm.internal.Intrinsics;
import p367o0OOo0o0.Oooo000;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class oO0O0O00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SendMomentPollView f56129OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f56130OooO0o0;

    public /* synthetic */ oO0O0O00(SendMomentPollView sendMomentPollView, int i) {
        this.f56129OooO0Oo = sendMomentPollView;
        this.f56130OooO0o0 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = SendMomentPollView.f31222OooOO0o;
        SendMomentPollView this$0 = this.f56129OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EditText view = (EditText) this$0.f31225OooO0o.f27533OooOooO.get(Integer.valueOf(this.f56130OooO0o0));
        if (view != null) {
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            InputMethodManager inputMethodManagerOooO00o = Oooo000.OooO00o(context);
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
            inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
        }
    }
}
