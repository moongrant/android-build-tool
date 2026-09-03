package p662o0oooO0O;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p659o0oooO.o000O0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class o0OO000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o0OO0o00 f59771OooO00o;

    static {
        o0OO0o00 o0oo0o01;
        try {
            Class.forName("java.nio.file.Files");
            o0oo0o01 = new o0OO0oO0();
        } catch (ClassNotFoundException unused) {
            o0oo0o01 = new o0OO0o00();
        }
        f59771OooO00o = o0oo0o01;
        String str = o0OOOO00.f59787OooO0o0;
        String property = System.getProperty("java.io.tmpdir");
        Intrinsics.checkNotNullExpressionValue(property, "getProperty(\"java.io.tmpdir\")");
        o0OOOO00.OooO00o.OooO00o(property, false);
        ClassLoader classLoader = o000O0.class.getClassLoader();
        Intrinsics.checkNotNullExpressionValue(classLoader, "ResourceFileSystem::class.java.classLoader");
        new o000O0(classLoader);
    }

    @Nullable
    public abstract o0O OooO(@NotNull o0OOOO00 o0oooo01) throws IOException;

    @NotNull
    public abstract ooo0Oo0 OooO00o(@NotNull o0OOOO00 o0oooo01) throws IOException;

    public abstract void OooO0O0(@NotNull o0OOOO00 o0oooo01, @NotNull o0OOOO00 o0oooo02) throws IOException;

    public abstract void OooO0OO(@NotNull o0OOOO00 o0oooo01) throws IOException;

    public abstract void OooO0Oo(@NotNull o0OOOO00 o0oooo01) throws IOException;

    public final boolean OooO0o(@NotNull o0OOOO00 path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        return OooO(path) != null;
    }

    public final void OooO0o0(@NotNull o0OOOO00 path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        OooO0Oo(path);
    }

    @NotNull
    public abstract List<o0OOOO00> OooO0oO(@NotNull o0OOOO00 o0oooo01) throws IOException;

    @NotNull
    public final o0O OooO0oo(@NotNull o0OOOO00 path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        o0O o0oOooO2 = OooO(path);
        if (o0oOooO2 != null) {
            return o0oOooO2;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    @NotNull
    public abstract o0O0oo00 OooOO0(@NotNull o0OOOO00 o0oooo01) throws IOException;

    @NotNull
    public abstract ooo0Oo0 OooOO0O(@NotNull o0OOOO00 o0oooo01) throws IOException;

    @NotNull
    public abstract oO00000 OooOO0o(@NotNull o0OOOO00 o0oooo01) throws IOException;
}
