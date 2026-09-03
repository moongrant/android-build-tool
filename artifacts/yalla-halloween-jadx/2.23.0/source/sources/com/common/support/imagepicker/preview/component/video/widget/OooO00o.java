package com.common.support.imagepicker.preview.component.video.widget;

import android.content.Context;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.lifecycle.LifecycleOwnerKt;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import kotlin.jvm.internal.Intrinsics;
import p367o0OOo0o0.Oooo000;
import p496o0o00o.oO00Oo00;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f10544OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f10545OooO0o0;

    public /* synthetic */ OooO00o(Object obj, int i) {
        this.f10544OooO0Oo = i;
        this.f10545OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f10544OooO0Oo;
        Object obj = this.f10545OooO0o0;
        switch (i) {
            case 0:
                BaseVideoControlView.m4025updateProgressRunnable$lambda1$lambda0((BaseVideoControlView) obj);
                break;
            default:
                UserInfoEditActivity this$0 = (UserInfoEditActivity) obj;
                int i2 = UserInfoEditActivity.f27283Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                EditText view = this$0.OooOoO().f58077OooO0O0;
                Intrinsics.checkNotNullExpressionValue(view, "it");
                Intrinsics.checkNotNullParameter(view, "view");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "view.context");
                InputMethodManager inputMethodManagerOooO00o = Oooo000.OooO00o(context);
                view.setFocusable(true);
                view.setFocusableInTouchMode(true);
                view.requestFocus();
                inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
                LifecycleOwnerKt.getLifecycleScope(this$0).launchWhenResumed(new oO00Oo00(view, null));
                break;
        }
    }
}
