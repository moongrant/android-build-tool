package p367o0OOo0o0;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.ResultReceiver;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p367o0OOo0o0.Oooo000;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class OooOO0O {
    public static void OooO00o(final Context context, final Handler handler, InputMethodManager inputMethodManager, IBinder iBinder, int i) {
        inputMethodManager.hideSoftInputFromWindow(iBinder, i, new ResultReceiver(handler) { // from class: com.yalla.support.keyboardpanel.KeyBoardUtil$hideKeyboard$1
            @Override // android.os.ResultReceiver
            public final void onReceiveResult(int i2, @Nullable Bundle bundle) {
                if (i2 == 0 || i2 == 2) {
                    Context context2 = context;
                    Intrinsics.checkNotNullExpressionValue(context2, "applicationContext");
                    Intrinsics.checkNotNullParameter(context2, "context");
                    Oooo000.OooO00o(context2).toggleSoftInput(0, 0);
                }
            }
        });
    }
}
