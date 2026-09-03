package o00000O0;

import androidx.compose.runtime.Immutable;
import java.util.Objects;
import kotlin.jvm.JvmInline;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@JvmInline
public final class OooO {
    public final boolean equals(Object obj) {
        if (!(obj instanceof OooO)) {
            return false;
        }
        Objects.requireNonNull((OooO) obj);
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    @NotNull
    public final String toString() {
        return "Polite";
    }
}
