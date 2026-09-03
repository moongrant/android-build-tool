package p560o0oOOoo;

import android.content.Context;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import com.app.base.framework.view.editTextSpan.EditTextSpan;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.ui.activity.room.live.side.RoomScreenShotManager;
import com.yalla.yalla.ui.view.SendMomentEmojiAtPollView;
import kotlin.jvm.internal.Intrinsics;
import p472o0Oooo0.o00O000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0 implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f44696Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f44697OoooO00;

    public /* synthetic */ o0(Object obj, int i) {
        this.f44696Oooo = i;
        this.f44697OoooO00 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f44696Oooo) {
            case 0:
                RoomScreenShotManager this$0 = (RoomScreenShotManager) this.f44697OoooO00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0Oo();
                break;
            default:
                SendMomentEmojiAtPollView this$1 = (SendMomentEmojiAtPollView) this.f44697OoooO00;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                EditTextSpan view = this$1.f25178OoooO;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("editContent");
                    view = null;
                }
                Intrinsics.checkNotNullParameter(view, "view");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "view.context");
                InputMethodManager inputMethodManagerOooO00o = o00O000.OooO00o(context);
                view.setFocusable(true);
                view.setFocusableInTouchMode(true);
                view.requestFocus();
                Context context2 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "view.context");
                inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(context2.getApplicationContext(), new Handler()));
                break;
        }
    }
}
