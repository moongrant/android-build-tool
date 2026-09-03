package androidx.compose.ui.platform;

import androidx.compose.ui.text.AnnotatedString;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00oO0o {
    public static boolean OooO00o(ClipboardManager clipboardManager) {
        AnnotatedString text = clipboardManager.getText();
        if (text != null) {
            return text.length() > 0;
        }
        return false;
    }
}
