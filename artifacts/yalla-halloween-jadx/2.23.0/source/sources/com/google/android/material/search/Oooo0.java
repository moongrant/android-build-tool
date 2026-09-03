package com.google.android.material.search;

import android.content.Context;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.material.internal.oo0o0Oo;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Oooo0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f17503OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f17504OooO0o0;

    public /* synthetic */ Oooo0(KeyEvent.Callback callback, int i) {
        this.f17503OooO0Oo = i;
        this.f17504OooO0o0 = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f17503OooO0Oo;
        KeyEvent.Callback callback = this.f17504OooO0o0;
        switch (i) {
            case 0:
                SearchView searchView = (SearchView) callback;
                EditText editText = searchView.f17536OooOOO0;
                editText.clearFocus();
                SearchBar searchBar = searchView.f17543OooOo0;
                if (searchBar != null) {
                    searchBar.requestFocus();
                }
                oo0o0Oo.OooO0o0(editText, searchView.f17547OooOoO);
                break;
            default:
                UserInfoEditActivity this$0 = (UserInfoEditActivity) callback;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int i2 = UserInfoEditActivity.f27283Oooo0oO;
                EditText view = this$0.OooOoO().f58077OooO0O0;
                Intrinsics.checkNotNullExpressionValue(view, "binding.etName");
                Intrinsics.checkNotNullParameter(view, "view");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "view.context");
                InputMethodManager inputMethodManagerOooO00o = p367o0OOo0o0.Oooo000.OooO00o(context);
                view.setFocusable(true);
                view.setFocusableInTouchMode(true);
                view.requestFocus();
                inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
                break;
        }
    }
}
