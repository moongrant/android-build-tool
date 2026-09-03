package o0000O0O;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {
    @NotNull
    public static final OooO OooO00o(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new OooOO0(context.getResources().getDisplayMetrics().density, context.getResources().getConfiguration().fontScale);
    }
}
