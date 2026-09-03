package p540o0o0Oo0;

import android.content.Context;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import com.yalla.yalla.ui.view.SendMomentPollView;
import kotlin.jvm.internal.Intrinsics;
import p025Oooo0O0.o000O0Oo;
import p472o0Oooo0.o00O000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00oOoo implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f43998Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f43999OoooO00;

    public /* synthetic */ o00oOoo(Object obj, int i) {
        this.f43998Oooo = i;
        this.f43999OoooO00 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, android.widget.EditText>] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f43998Oooo) {
            case 0:
                PostDetailActivity this$0 = (PostDetailActivity) this.f43999OoooO00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.Oooo0oO(true);
                break;
            default:
                SendMomentPollView this$1 = (SendMomentPollView) this.f43999OoooO00;
                int i = SendMomentPollView.f25205OoooOo0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                EditText view = (EditText) this$1.f25208OoooO0.f48257OooO0OO.get(0);
                if (view != null) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    Context context = view.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "view.context");
                    InputMethodManager inputMethodManagerOooO00o = o00O000.OooO00o(context);
                    view.setFocusable(true);
                    view.setFocusableInTouchMode(true);
                    view.requestFocus();
                    inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(o000O0Oo.OooO0O0(view, "view.context"), new Handler()));
                }
                break;
        }
    }
}
