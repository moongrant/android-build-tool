package o000O0Oo;

import android.content.Context;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import androidx.profileinstaller.ProfileInstaller;
import com.facebook.login.DeviceAuthDialog;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.ui.view.editTextSpan.EditTextSpan;
import com.yalla.yalla.ui.view.moment.SendMomentEmojiAtPollView;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import p367o0OOo0o0.Oooo000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f34836OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f34837OooO0o0;

    public /* synthetic */ OooOO0(Object obj, int i) {
        this.f34836OooO0Oo = i;
        this.f34837OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        int i = this.f34836OooO0Oo;
        Object obj = this.f34837OooO0o0;
        switch (i) {
            case 0:
                ProfileInstaller.OooO0O0((Context) obj, new OooO(), ProfileInstaller.f7432OooO00o, false);
                break;
            case 1:
                DeviceAuthDialog.m4168schedulePoll$lambda3((DeviceAuthDialog) obj);
                break;
            default:
                SendMomentEmojiAtPollView this$0 = (SendMomentEmojiAtPollView) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                EditTextSpan view = this$0.f31189OooOO0O;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("editContent");
                    view = null;
                }
                Intrinsics.checkNotNullParameter(view, "view");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "view.context");
                InputMethodManager inputMethodManagerOooO00o = Oooo000.OooO00o(context);
                view.setFocusable(true);
                view.setFocusableInTouchMode(true);
                view.requestFocus();
                inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
                break;
        }
    }
}
