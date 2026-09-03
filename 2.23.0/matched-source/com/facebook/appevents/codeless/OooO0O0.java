package com.facebook.appevents.codeless;

import android.content.Context;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.view.editTextSpan.EditTextSpan;
import kotlin.jvm.internal.Intrinsics;
import p367o0OOo0o0.Oooo000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO0O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f10595OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f10596OooO0o0;

    public /* synthetic */ OooO0O0(Object obj, int i) {
        this.f10595OooO0Oo = i;
        this.f10596OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f10595OooO0Oo;
        Object obj = this.f10596OooO0o0;
        switch (i) {
            case 0:
                CodelessManager.m4079checkCodelessSession$lambda1((String) obj);
                break;
            default:
                MomentSendActivity this$0 = (MomentSendActivity) obj;
                int i2 = MomentSendActivity.f26175Oooo0OO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                EditTextSpan view = this$0.OooOo().f58559OooO0o0;
                Intrinsics.checkNotNullExpressionValue(view, "binding.mEditContent");
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
