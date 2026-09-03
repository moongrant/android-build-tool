package p145o00Oo0;

import androidx.compose.runtime.Immutable;
import com.facebook.internal.AnalyticsEvents;
import kotlin.jvm.JvmInline;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@JvmInline
public final class o00oOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f32139OooO00o;

    @NotNull
    public static String OooO00o(int i) {
        if (i == 0) {
            return "Butt";
        }
        if (i == 1) {
            return "Round";
        }
        return i == 2 ? "Square" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o00oOoo) && this.f32139OooO00o == ((o00oOoo) obj).f32139OooO00o;
    }

    public final int hashCode() {
        return this.f32139OooO00o;
    }

    @NotNull
    public final String toString() {
        return OooO00o(this.f32139OooO00o);
    }
}
