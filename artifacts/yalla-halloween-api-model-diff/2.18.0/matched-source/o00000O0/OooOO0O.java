package o00000O0;

import androidx.compose.runtime.Immutable;
import com.facebook.internal.AnalyticsEvents;
import kotlin.jvm.JvmInline;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@JvmInline
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f26932OooO00o;

    public final boolean equals(Object obj) {
        return (obj instanceof OooOO0O) && this.f26932OooO00o == ((OooOO0O) obj).f26932OooO00o;
    }

    public final int hashCode() {
        return this.f26932OooO00o;
    }

    @NotNull
    public final String toString() {
        int i = this.f26932OooO00o;
        if (i == 0) {
            return "Button";
        }
        if (i == 1) {
            return "Checkbox";
        }
        if (i == 2) {
            return "Switch";
        }
        if (i == 3) {
            return "RadioButton";
        }
        if (i == 4) {
            return "Tab";
        }
        return i == 5 ? "Image" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }
}
