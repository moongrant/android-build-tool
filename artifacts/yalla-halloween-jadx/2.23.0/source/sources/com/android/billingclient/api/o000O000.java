package com.android.billingclient.api;

import android.content.res.Resources;
import android.text.Selection;
import android.widget.EditText;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o000O000 {
    public static final int OooO00o(float f) {
        return (int) ((f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static final int OooO0O0(float f) {
        return (int) ((f / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static void OooO0OO(EditText editText) {
        if (editText == null) {
            return;
        }
        int length = editText.getText().length();
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.requestFocus();
        String strTrim = editText.getText().toString().trim();
        if (length > strTrim.length()) {
            length = strTrim.length();
        }
        Selection.setSelection(editText.getText(), length);
    }
}
