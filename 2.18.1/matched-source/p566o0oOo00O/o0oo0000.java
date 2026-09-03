package p566o0oOo00O;

import android.content.Context;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.ui.activity.user.UserInfoEditRemarkActivity;
import com.yalla.yalla.ui.fragment.PostDetailCommentFragment;
import kotlin.jvm.internal.Intrinsics;
import p025Oooo0O0.o000O0Oo;
import p470o0Oooo0.o00O000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0oo0000 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f45348Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f45349Oooo0oO;

    public /* synthetic */ o0oo0000(Object obj, int i) {
        this.f45348Oooo0o = i;
        this.f45349Oooo0oO = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f45348Oooo0o) {
            case 0:
                UserInfoEditRemarkActivity this$0 = (UserInfoEditRemarkActivity) this.f45349Oooo0oO;
                UserInfoEditRemarkActivity.OooO00o oooO00o = UserInfoEditRemarkActivity.f23529OooooOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                EditText view = this$0.OooOoo().f50124OooO0O0;
                Intrinsics.checkNotNullExpressionValue(view, "binding.etText");
                Intrinsics.checkNotNullParameter(view, "view");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "view.context");
                InputMethodManager inputMethodManagerOooO00o = o00O000.OooO00o(context);
                view.setFocusable(true);
                view.setFocusableInTouchMode(true);
                view.requestFocus();
                inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(o000O0Oo.OooO00o(view, "view.context"), new Handler()));
                break;
            default:
                PostDetailCommentFragment this$1 = (PostDetailCommentFragment) this.f45349Oooo0oO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.smoothScrollToPositionCommentMessageIndex();
                break;
        }
    }
}
