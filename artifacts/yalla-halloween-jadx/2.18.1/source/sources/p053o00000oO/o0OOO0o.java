package p053o00000oO;

import android.content.Context;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o {
    @NotNull
    public static final o0ooOOo OooO00o(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new o0ooOOo(Build.VERSION.SDK_INT >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0);
    }
}
