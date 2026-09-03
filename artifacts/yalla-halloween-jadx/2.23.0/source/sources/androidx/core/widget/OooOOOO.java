package androidx.core.widget;

import android.widget.PopupWindow;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
public final class OooOOOO {
    @DoNotInline
    public static boolean OooO00o(PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }

    @DoNotInline
    public static int OooO0O0(PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }

    @DoNotInline
    public static void OooO0OO(PopupWindow popupWindow, boolean z) {
        popupWindow.setOverlapAnchor(z);
    }

    @DoNotInline
    public static void OooO0Oo(PopupWindow popupWindow, int i) {
        popupWindow.setWindowLayoutType(i);
    }
}
