package o0000O;

import android.view.accessibility.AccessibilityManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
public final class OooO0OO {
    @DoNotInline
    public static boolean OooO00o(AccessibilityManager accessibilityManager, OooO0o oooO0o) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new OooO(oooO0o));
    }

    @DoNotInline
    public static boolean OooO0O0(AccessibilityManager accessibilityManager, OooO0o oooO0o) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new OooO(oooO0o));
    }
}
