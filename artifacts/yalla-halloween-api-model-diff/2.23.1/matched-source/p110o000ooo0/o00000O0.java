package p110o000ooo0;

import android.content.Context;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.ui.activity.room.VoteGameCreateActivity;
import kotlin.jvm.internal.Intrinsics;
import p373o0OOo0oO.o0OOO0o;
import p407o0Oo0OOO.a0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o00000O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f35880OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f35881OooO0o0;

    public /* synthetic */ o00000O0(Object obj, int i) {
        this.f35880OooO0Oo = i;
        this.f35881OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f35880OooO0Oo;
        Object obj = this.f35881OooO0o0;
        switch (i) {
            case 0:
                o00000O this$0 = (o00000O) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o000000O o000000o2 = this$0.f35869OooO0O0;
                o000000O.OooO0OO oooO0OO = this$0.f35873OooO0o0;
                if (oooO0OO == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("observer");
                    oooO0OO = null;
                }
                o000000o2.OooO0Oo(oooO0OO);
                break;
            default:
                a0 dialogBinding = (a0) obj;
                int i2 = VoteGameCreateActivity.f26303OooOo;
                Intrinsics.checkNotNullParameter(dialogBinding, "$dialogBinding");
                EditText view = dialogBinding.f43707OooO0O0;
                Intrinsics.checkNotNullExpressionValue(view, "etVoteSetTitle");
                Intrinsics.checkNotNullParameter(view, "view");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                InputMethodManager inputMethodManagerOooO00o = o0OOO0o.OooO00o(context);
                view.setFocusable(true);
                view.setFocusableInTouchMode(true);
                view.requestFocus();
                inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
                break;
        }
    }
}
