package androidx.fragment.app;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.lifecycle.LifecycleOwnerKt;
import com.facebook.internal.FacebookWebFallbackDialog;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import kotlin.jvm.internal.Intrinsics;
import p506o0o00oOo.z;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000oOoO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f6042OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View.OnCreateContextMenuListener f6043OooO0o0;

    public /* synthetic */ o000oOoO(View.OnCreateContextMenuListener onCreateContextMenuListener, int i) {
        this.f6042OooO0Oo = i;
        this.f6043OooO0o0 = onCreateContextMenuListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6042OooO0Oo;
        View.OnCreateContextMenuListener onCreateContextMenuListener = this.f6043OooO0o0;
        switch (i) {
            case 0:
                ((Fragment) onCreateContextMenuListener).lambda$performCreateView$0();
                break;
            case 1:
                FacebookWebFallbackDialog.m4125cancel$lambda0((FacebookWebFallbackDialog) onCreateContextMenuListener);
                break;
            default:
                UserInfoEditActivity this$0 = (UserInfoEditActivity) onCreateContextMenuListener;
                int i2 = UserInfoEditActivity.f26818Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                EditText view = this$0.OooOoO().f45657OooO0O0;
                Intrinsics.checkNotNull(view);
                Intrinsics.checkNotNullParameter(view, "view");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                InputMethodManager inputMethodManagerOooO00o = p371o0OOo0oO.o0OOO0o.OooO00o(context);
                view.setFocusable(true);
                view.setFocusableInTouchMode(true);
                view.requestFocus();
                inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
                LifecycleOwnerKt.getLifecycleScope(this$0).launchWhenResumed(new z(view, null));
                break;
        }
    }
}
