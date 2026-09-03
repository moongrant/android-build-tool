package androidx.compose.ui.focus;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0OO {
    public static /* synthetic */ void OooO00o(FocusManager focusManager, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearFocus");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        focusManager.clearFocus(z);
    }
}
