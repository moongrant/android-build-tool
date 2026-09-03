package p072o000O0o0;

import android.view.accessibility.AccessibilityManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
public final class o0000O0O {
    @DoNotInline
    public static boolean OooO00o(AccessibilityManager accessibilityManager, o000OO o000oo2) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new o0000O(o000oo2));
    }

    @DoNotInline
    public static boolean OooO0O0(AccessibilityManager accessibilityManager, o000OO o000oo2) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new o0000O(o000oo2));
    }
}
