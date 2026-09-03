package p418o0Oo0oo;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O implements o00oO0o {
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(OooOO0O.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIcon");
        return Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        throw null;
    }

    @NotNull
    public final String toString() {
        return "AndroidPointerIcon(pointerIcon=null)";
    }
}
