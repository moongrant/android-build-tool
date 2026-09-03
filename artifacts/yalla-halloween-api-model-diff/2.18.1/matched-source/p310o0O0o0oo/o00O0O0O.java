package p310o0O0o0oo;

import android.content.Context;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p025Oooo0O0.o000O0Oo;
import p470o0Oooo0.o00O000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O0O0O implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f36349Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f36350Oooo0oO;

    public /* synthetic */ o00O0O0O(Object obj, int i) {
        this.f36349Oooo0o = i;
        this.f36350Oooo0oO = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36349Oooo0o) {
            case 0:
                o00O0OO0 o00o0oo1 = (o00O0OO0) this.f36350Oooo0oO;
                if (!o00o0oo1.f36396o0OOO0o) {
                    o00O00.OooO00o oooO00o = o00o0oo1.f36380Ooooo0o;
                    Objects.requireNonNull(oooO00o);
                    oooO00o.OooO0o0(o00o0oo1);
                }
                break;
            default:
                UserInfoEditActivity this$0 = (UserInfoEditActivity) this.f36350Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                UserInfoEditActivity.OooO00o oooO00o2 = UserInfoEditActivity.f23493o0ooOOo;
                EditText view = this$0.OooOooo().f50493OooO0O0;
                Intrinsics.checkNotNullExpressionValue(view, "binding.etName");
                Intrinsics.checkNotNullParameter(view, "view");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "view.context");
                InputMethodManager inputMethodManagerOooO00o = o00O000.OooO00o(context);
                view.setFocusable(true);
                view.setFocusableInTouchMode(true);
                view.requestFocus();
                inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(o000O0Oo.OooO00o(view, "view.context"), new Handler()));
                break;
        }
    }
}
