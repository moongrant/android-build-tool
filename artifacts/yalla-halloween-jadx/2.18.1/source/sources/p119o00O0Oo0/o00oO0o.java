package p119o00O0Oo0;

import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@JvmName(name = "-Logs")
public final class o00oO0o {
    public static final void OooO00o(@NotNull o0OO00O o0oo00o2, @NotNull String tag, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(o0oo00o2, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (o0oo00o2.getLevel() <= 6) {
            o0oo00o2.OooO00o();
        }
    }
}
