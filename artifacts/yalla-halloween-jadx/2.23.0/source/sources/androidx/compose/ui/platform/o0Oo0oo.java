package androidx.compose.ui.platform;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0Oo0oo {
    public static boolean OooO00o(OpenEndRange openEndRange, @NotNull Comparable value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value.compareTo(openEndRange.getStart()) >= 0 && value.compareTo(openEndRange.getEndExclusive()) < 0;
    }

    public static boolean OooO0O0(OpenEndRange openEndRange) {
        return openEndRange.getStart().compareTo(openEndRange.getEndExclusive()) >= 0;
    }
}
