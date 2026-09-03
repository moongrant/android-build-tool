package p003OooO0o0;

import OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.o0OoOo0;
import android.content.Context;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import com.facebook.appevents.codeless.CodelessMatcher;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.view.editTextSpan.EditTextSpan;
import kotlin.jvm.internal.Intrinsics;
import p373o0OOo0oO.o0OOO0o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f123OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f124OooO0o0;

    public /* synthetic */ o000000(Object obj, int i) {
        this.f123OooO0Oo = i;
        this.f124OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f123OooO0Oo;
        Object obj = this.f124OooO0o0;
        switch (i) {
            case 0:
                o0OoOo0 this$0 = (o0OoOo0) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0o();
                break;
            case 1:
                CodelessMatcher.m4083startTracking$lambda1((CodelessMatcher) obj);
                break;
            default:
                MomentSendActivity this$1 = (MomentSendActivity) obj;
                int i2 = MomentSendActivity.f25728Oooo0OO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                EditTextSpan view = this$1.OooOo().f44319OooO0o0;
                Intrinsics.checkNotNullExpressionValue(view, "mEditContent");
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
