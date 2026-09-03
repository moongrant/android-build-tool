package p650o0ooOoO;

import android.view.KeyEvent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p387o0OOoo0o.o00O0OOO;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final long OooO00o(@NotNull KeyEvent key) {
        Intrinsics.checkNotNullParameter(key, "$this$key");
        return o00O0OOO.OooO0OO(key.getKeyCode());
    }

    public static final int OooO0O0(@NotNull KeyEvent type) {
        Intrinsics.checkNotNullParameter(type, "$this$type");
        int action = type.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final boolean OooO0OO(@NotNull KeyEvent isCtrlPressed) {
        Intrinsics.checkNotNullParameter(isCtrlPressed, "$this$isCtrlPressed");
        return isCtrlPressed.isCtrlPressed();
    }
}
