package com.google.android.material.search;

import android.content.Context;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.o0oOOo;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Oooo000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f17505OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f17506OooO0o0;

    public /* synthetic */ Oooo000(KeyEvent.Callback callback, int i) {
        this.f17505OooO0Oo = i;
        this.f17506OooO0o0 = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o0oOOo o0ooooOooO0oo;
        int i = this.f17505OooO0Oo;
        KeyEvent.Callback callback = this.f17506OooO0o0;
        switch (i) {
            case 0:
                SearchView searchView = (SearchView) callback;
                EditText editText = searchView.f17536OooOOO0;
                if (editText.requestFocus()) {
                    editText.sendAccessibilityEvent(8);
                }
                if (searchView.f17547OooOoO && (o0ooooOooO0oo = ViewCompat.OooO0oo(editText)) != null) {
                    o0ooooOooO0oo.f5453OooO00o.OooO0oO(8);
                } else {
                    Context context = editText.getContext();
                    Object obj = ContextCompat.f5271OooO00o;
                    ((InputMethodManager) ContextCompat.OooO0o.OooO0O0(context, InputMethodManager.class)).showSoftInput(editText, 1);
                }
                break;
            default:
                UserInfoEditActivity this$0 = (UserInfoEditActivity) callback;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoo();
                this$0.OooOoO().f58077OooO0O0.requestLayout();
                break;
        }
    }
}
