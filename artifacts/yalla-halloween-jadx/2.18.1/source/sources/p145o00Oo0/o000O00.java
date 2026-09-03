package p145o00Oo0;

import androidx.compose.runtime.Immutable;
import com.facebook.internal.AnalyticsEvents;
import kotlin.jvm.JvmInline;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@JvmInline
public final class o000O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f32082OooO00o;

    public final boolean equals(Object obj) {
        return (obj instanceof o000O00) && this.f32082OooO00o == ((o000O00) obj).f32082OooO00o;
    }

    public final int hashCode() {
        return this.f32082OooO00o;
    }

    @NotNull
    public final String toString() {
        int i = this.f32082OooO00o;
        if (i == 0) {
            return "NonZero";
        }
        return i == 1 ? "EvenOdd" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }
}
