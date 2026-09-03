package p540o0o0Oo0;

import android.content.Context;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.lifecycle.LifecycleOwnerKt;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.moment.PostDetailCommentSonListActivity;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import kotlin.jvm.internal.Intrinsics;
import p025Oooo0O0.o000O0Oo;
import p472o0Oooo0.o00O000;
import p568o0oOo00O.o0OO0oO0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00OO0OO implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f43981Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ BaseActivityK f43982OoooO00;

    public /* synthetic */ o00OO0OO(BaseActivityK baseActivityK, int i) {
        this.f43981Oooo = i;
        this.f43982OoooO00 = baseActivityK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f43981Oooo) {
            case 0:
                PostDetailCommentSonListActivity this$0 = (PostDetailCommentSonListActivity) this.f43982OoooO00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (!this$0.isDestroyed()) {
                    this$0.OoooO00(true);
                    break;
                }
                break;
            default:
                UserInfoEditActivity this$1 = (UserInfoEditActivity) this.f43982OoooO00;
                UserInfoEditActivity.OooO00o oooO00o = UserInfoEditActivity.f23512o0Oo0oo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                EditText view = this$1.OooOooo().f50430OooO0O0;
                Intrinsics.checkNotNullExpressionValue(view, "it");
                Intrinsics.checkNotNullParameter(view, "view");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "view.context");
                InputMethodManager inputMethodManagerOooO00o = o00O000.OooO00o(context);
                view.setFocusable(true);
                view.setFocusableInTouchMode(true);
                view.requestFocus();
                inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(o000O0Oo.OooO0O0(view, "view.context"), new Handler()));
                LifecycleOwnerKt.getLifecycleScope(this$1).launchWhenResumed(new o0OO0oO0(view, null));
                break;
        }
    }
}
