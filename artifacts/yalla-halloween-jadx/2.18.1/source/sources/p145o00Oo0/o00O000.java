package p145o00Oo0;

import androidx.compose.runtime.Immutable;
import com.facebook.internal.AnalyticsEvents;
import kotlin.jvm.JvmInline;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@JvmInline
public final class o00O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f32115OooO00o;

    @NotNull
    public static String OooO00o(int i) {
        if (i == 0) {
            return "Miter";
        }
        if (i == 1) {
            return "Round";
        }
        return i == 2 ? "Bevel" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o00O000) && this.f32115OooO00o == ((o00O000) obj).f32115OooO00o;
    }

    public final int hashCode() {
        return this.f32115OooO00o;
    }

    @NotNull
    public final String toString() {
        return OooO00o(this.f32115OooO00o);
    }
}
