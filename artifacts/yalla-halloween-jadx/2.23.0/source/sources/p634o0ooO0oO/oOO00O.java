package p634o0ooO0oO;

import java.io.IOException;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public interface oOO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O00O f57368OooO00o = new o00O00O();

    static {
        o00O defaultDns = o00OO000.f57220OooO00o;
        Intrinsics.checkNotNullParameter(defaultDns, "defaultDns");
    }

    @Nullable
    o00OOOOo authenticate(@Nullable o0O00000 o0o00000, @NotNull o0oOOo o0oooo) throws IOException;
}
