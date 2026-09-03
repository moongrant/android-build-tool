package p423o0OoO0OO;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O0 {
    public static final void OooO00o(@Nullable Boolean bool, @NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            listener.invoke();
        }
    }
}
