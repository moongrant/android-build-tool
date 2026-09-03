package p145o00Oo0;

import androidx.compose.runtime.Immutable;
import com.facebook.internal.AnalyticsEvents;
import kotlin.jvm.JvmInline;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@JvmInline
public final class o0000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f32071OooO00o;

    public final boolean equals(Object obj) {
        return (obj instanceof o0000O0) && this.f32071OooO00o == ((o0000O0) obj).f32071OooO00o;
    }

    public final int hashCode() {
        return this.f32071OooO00o;
    }

    @NotNull
    public final String toString() {
        int i = this.f32071OooO00o;
        if (i == 0) {
            return "Argb8888";
        }
        if (i == 1) {
            return "Alpha8";
        }
        if (i == 2) {
            return "Rgb565";
        }
        if (i == 3) {
            return "F16";
        }
        return i == 4 ? "Gpu" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }
}
