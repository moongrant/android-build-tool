package p311o0O0o0oo;

import android.content.Context;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p025Oooo0O0.o000O0Oo;
import p472o0Oooo0.o00O000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O0OO0 implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f36379Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f36380OoooO00;

    public /* synthetic */ o00O0OO0(Object obj, int i) {
        this.f36379Oooo = i;
        this.f36380OoooO00 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36379Oooo) {
            case 0:
                oo0o0O0 oo0o0o0 = (oo0o0O0) this.f36380OoooO00;
                if (!oo0o0o0.f36461oo0o0Oo) {
                    o00O00O.OooO00o oooO00o = oo0o0o0.f36440OooooOo;
                    Objects.requireNonNull(oooO00o);
                    oooO00o.OooO0o0(oo0o0o0);
                }
                break;
            default:
                UserInfoEditActivity this$0 = (UserInfoEditActivity) this.f36380OoooO00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                UserInfoEditActivity.OooO00o oooO00o2 = UserInfoEditActivity.f23512o0Oo0oo;
                EditText view = this$0.OooOooo().f50430OooO0O0;
                Intrinsics.checkNotNullExpressionValue(view, "binding.etName");
                Intrinsics.checkNotNullParameter(view, "view");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "view.context");
                InputMethodManager inputMethodManagerOooO00o = o00O000.OooO00o(context);
                view.setFocusable(true);
                view.setFocusableInTouchMode(true);
                view.requestFocus();
                inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(o000O0Oo.OooO0O0(view, "view.context"), new Handler()));
                break;
        }
    }
}
