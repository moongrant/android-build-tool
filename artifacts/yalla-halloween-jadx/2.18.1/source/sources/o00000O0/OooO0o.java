package o00000O0;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class OooO0o {
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO0o)) {
            return false;
        }
        OooO0o oooO0o = (OooO0o) obj;
        Objects.requireNonNull(oooO0o);
        if (!Intrinsics.areEqual((Object) null, (Object) null)) {
            return false;
        }
        Objects.requireNonNull(oooO0o);
        return Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        throw null;
    }

    @NotNull
    public final String toString() {
        return "CustomAccessibilityAction(label=null, action=null)";
    }
}
