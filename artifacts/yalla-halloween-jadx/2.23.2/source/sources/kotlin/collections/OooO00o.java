package kotlin.collections;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.ResultReceiver;
import android.view.inputmethod.InputMethodManager;
import kotlin.UInt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p371o0OOo0oO.o0OOO0o;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class OooO00o {
    public static int OooO00o(UInt uInt, int i) {
        return UInt.m4310constructorimpl(uInt.getData() + i);
    }

    public static void OooO0O0(final Context context, final Handler handler, InputMethodManager inputMethodManager, IBinder iBinder, int i) {
        inputMethodManager.hideSoftInputFromWindow(iBinder, i, new ResultReceiver(handler) { // from class: com.yalla.support.keyboardpanel.KeyBoardUtil$hideKeyboard$1
            @Override // android.os.ResultReceiver
            public final void onReceiveResult(int i2, @Nullable Bundle bundle) {
                if (i2 == 0 || i2 == 2) {
                    Context context2 = context;
                    Intrinsics.checkNotNullExpressionValue(context2, "$applicationContext");
                    Intrinsics.checkNotNullParameter(context2, "context");
                    o0OOO0o.OooO00o(context2).toggleSoftInput(0, 0);
                }
            }
        });
    }
}
