package p202o00o0o;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00O0O implements o0OoOo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final String f39340OooO0Oo;

    public o00O0O(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f39340OooO0Oo = text;
    }

    @Override // p202o00o0o.o0OoOo0
    @NotNull
    public final String getShowText() {
        return this.f39340OooO0Oo;
    }
}
