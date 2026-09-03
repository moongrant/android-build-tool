package p641o0ooOO0o;

import java.io.IOException;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public interface o00OO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00OO0O0 f57754OooO00o = new o00OO0O0();

    static {
        o0oOOo defaultDns = o0O0o.f57881OooO00o;
        Intrinsics.checkNotNullParameter(defaultDns, "defaultDns");
    }

    @Nullable
    o0O00O0o authenticate(@Nullable o0oO0O0o o0oo0o0o2, @NotNull o0O00o00 o0o00o01) throws IOException;
}
