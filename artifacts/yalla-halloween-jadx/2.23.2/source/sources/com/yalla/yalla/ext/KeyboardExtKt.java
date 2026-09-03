package com.yalla.yalla.ext;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.ResultReceiver;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class KeyboardExtKt {
    public static final void OooO00o(@Nullable EditText editText) {
        if (editText != null) {
            Context context = editText.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Intrinsics.checkNotNullParameter(context, "<this>");
            Object systemService = context.getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            final InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            IBinder windowToken = editText.getWindowToken();
            final Handler handler = new Handler();
            inputMethodManager.hideSoftInputFromWindow(windowToken, 0, new ResultReceiver(handler) { // from class: com.yalla.yalla.ext.KeyboardExtKt$keyboardHide$2$1
                @Override // android.os.ResultReceiver
                public final void onReceiveResult(int i, @Nullable Bundle bundle) {
                    if (i == 0 || i == 2) {
                        inputMethodManager.toggleSoftInput(0, 0);
                    }
                }
            });
        }
    }

    public static final void OooO0O0(@Nullable EditText editText) {
        if (editText != null) {
            Context context = editText.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Intrinsics.checkNotNullParameter(context, "<this>");
            Object systemService = context.getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            final InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            editText.setFocusable(true);
            editText.setFocusableInTouchMode(true);
            editText.requestFocus();
            final Handler handler = new Handler();
            inputMethodManager.showSoftInput(editText, 2, new ResultReceiver(handler) { // from class: com.yalla.yalla.ext.KeyboardExtKt$keyboardShow$1$1
                @Override // android.os.ResultReceiver
                public final void onReceiveResult(int i, @Nullable Bundle bundle) {
                    if (i == 1 || i == 3) {
                        inputMethodManager.toggleSoftInput(0, 0);
                    }
                }
            });
        }
    }
}
