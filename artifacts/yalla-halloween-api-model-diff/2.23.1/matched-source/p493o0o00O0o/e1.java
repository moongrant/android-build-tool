package p493o0o00O0o;

import android.content.Context;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.moment.TopicEditDescActivity;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import kotlin.jvm.internal.Intrinsics;
import p373o0OOo0oO.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e1 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49088OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BaseActivityK f49089OooO0o0;

    public /* synthetic */ e1(BaseActivityK baseActivityK, int i) {
        this.f49088OooO0Oo = i;
        this.f49089OooO0o0 = baseActivityK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f49088OooO0Oo;
        BaseActivityK baseActivityK = this.f49089OooO0o0;
        switch (i) {
            case 0:
                TopicEditDescActivity this$0 = (TopicEditDescActivity) baseActivityK;
                int i2 = TopicEditDescActivity.f25900OooOo0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                EditText view = this$0.OooOo().f45068OooO0O0;
                Intrinsics.checkNotNullExpressionValue(view, "etDesc");
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
                UserInfoEditActivity this$1 = (UserInfoEditActivity) baseActivityK;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                int i3 = UserInfoEditActivity.f26819Oooo0oO;
                EditText view2 = this$1.OooOoO().f45672OooO0O0;
                Intrinsics.checkNotNullExpressionValue(view2, "etName");
                Intrinsics.checkNotNullParameter(view2, "view");
                Context context2 = view2.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                InputMethodManager inputMethodManagerOooO00o2 = o0OOO0o.OooO00o(context2);
                view2.setFocusable(true);
                view2.setFocusableInTouchMode(true);
                view2.requestFocus();
                inputMethodManagerOooO00o2.showSoftInput(view2, 2, new KeyBoardUtil$showKeyboard$1(view2.getContext().getApplicationContext(), new Handler()));
                break;
        }
    }
}
