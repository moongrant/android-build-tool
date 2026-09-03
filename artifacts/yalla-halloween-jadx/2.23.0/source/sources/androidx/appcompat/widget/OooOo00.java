package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import p403o0Oo0OOo.o00O0OO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 implements o00O0OO0 {
    public static void OooO00o(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof o00oOoo) {
                editorInfo.hintText = ((o00oOoo) parent).OooO00o();
                return;
            }
        }
    }
}
