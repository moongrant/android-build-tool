package com.facebook.internal;

import android.content.Context;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.ui.activity.moment.TopicEditRuleActivity;
import com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment;
import kotlin.jvm.internal.Intrinsics;
import p371o0OOo0oO.o0OOO0o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f13707OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f13708OooO0o0;

    public /* synthetic */ OooOO0(Object obj, int i) {
        this.f13707OooO0Oo = i;
        this.f13708OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f13707OooO0Oo;
        Object obj = this.f13708OooO0o0;
        switch (i) {
            case 0:
                ((FetchedAppSettingsManager.FetchedAppSettingsCallback) obj).onError();
                break;
            case 1:
                TopicEditRuleActivity this$0 = (TopicEditRuleActivity) obj;
                int i2 = TopicEditRuleActivity.f25907OooOo0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                EditText view = this$0.OooOo().f45045OooO0O0;
                Intrinsics.checkNotNullExpressionValue(view, "etRule");
                Intrinsics.checkNotNullParameter(view, "view");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                InputMethodManager inputMethodManagerOooO00o = o0OOO0o.OooO00o(context);
                view.setFocusable(true);
                view.setFocusableInTouchMode(true);
                view.requestFocus();
                inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
                break;
            default:
                MomentDetailCommentFragment.smoothScrollToPositionCommentMessageIndex$lambda$13((MomentDetailCommentFragment) obj);
                break;
        }
    }
}
