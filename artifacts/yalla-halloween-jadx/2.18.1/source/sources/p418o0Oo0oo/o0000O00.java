package p418o0Oo0oo;

import com.facebook.internal.AnalyticsEvents;
import kotlin.jvm.JvmInline;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@JvmInline
public final class o0000O00 {
    @NotNull
    public static String OooO00o(int i) {
        if (i == 1) {
            return "Touch";
        }
        if (i == 2) {
            return "Mouse";
        }
        if (i != 3) {
            return i != 4 ? AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN : "Eraser";
        }
        return "Stylus";
    }
}
