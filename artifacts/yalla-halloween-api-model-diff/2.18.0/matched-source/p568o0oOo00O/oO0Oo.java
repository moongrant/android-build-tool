package p568o0oOo00O;

import android.content.Context;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.ui.activity.user.UserInfoEditRemarkActivity;
import com.yalla.yalla.ui.fragment.PostDetailCommentFragment;
import kotlin.jvm.internal.Intrinsics;
import p025Oooo0O0.o000O0Oo;
import p472o0Oooo0.o00O000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oO0Oo implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f45385Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f45386OoooO00;

    public /* synthetic */ oO0Oo(Object obj, int i) {
        this.f45385Oooo = i;
        this.f45386OoooO00 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f45385Oooo) {
            case 0:
                UserInfoEditRemarkActivity this$0 = (UserInfoEditRemarkActivity) this.f45386OoooO00;
                UserInfoEditRemarkActivity.OooO00o oooO00o = UserInfoEditRemarkActivity.f23548Oooooo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                EditText view = this$0.OooOoo().f50061OooO0O0;
                Intrinsics.checkNotNullExpressionValue(view, "binding.etText");
                Intrinsics.checkNotNullParameter(view, "view");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "view.context");
                InputMethodManager inputMethodManagerOooO00o = o00O000.OooO00o(context);
                view.setFocusable(true);
                view.setFocusableInTouchMode(true);
                view.requestFocus();
                inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(o000O0Oo.OooO0O0(view, "view.context"), new Handler()));
                break;
            default:
                PostDetailCommentFragment this$1 = (PostDetailCommentFragment) this.f45386OoooO00;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.smoothScrollToPositionCommentMessageIndex();
                break;
        }
    }
}
