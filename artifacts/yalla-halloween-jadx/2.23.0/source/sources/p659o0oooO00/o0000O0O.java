package p659o0oooO00;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p658o0oooO0.o00O0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class o0000O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o000O00O f60198OooO00o;

    static {
        o000O00O o000o00o2;
        try {
            Class.forName("java.nio.file.Files");
            o000o00o2 = new o000O0();
        } catch (ClassNotFoundException unused) {
            o000o00o2 = new o000O00O();
        }
        f60198OooO00o = o000o00o2;
        String str = o000OO00.f60221OooO0o0;
        String property = System.getProperty("java.io.tmpdir");
        Intrinsics.checkNotNullExpressionValue(property, "getProperty(\"java.io.tmpdir\")");
        o000OO00.OooO00o.OooO00o(property, false);
        ClassLoader classLoader = o00O0.class.getClassLoader();
        Intrinsics.checkNotNullExpressionValue(classLoader, "ResourceFileSystem::class.java.classLoader");
        new o00O0(classLoader);
    }

    @Nullable
    public abstract o0000O0 OooO(@NotNull o000OO00 o000oo01) throws IOException;

    @NotNull
    public abstract o00O000 OooO00o(@NotNull o000OO00 o000oo01) throws IOException;

    public abstract void OooO0O0(@NotNull o000OO00 o000oo01, @NotNull o000OO00 o000oo02) throws IOException;

    public abstract void OooO0OO(@NotNull o000OO00 o000oo01) throws IOException;

    public abstract void OooO0Oo(@NotNull o000OO00 o000oo01) throws IOException;

    public final boolean OooO0o(@NotNull o000OO00 path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        return OooO(path) != null;
    }

    public final void OooO0o0(@NotNull o000OO00 path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        OooO0Oo(path);
    }

    @NotNull
    public abstract List<o000OO00> OooO0oO(@NotNull o000OO00 o000oo01) throws IOException;

    @NotNull
    public final o0000O0 OooO0oo(@NotNull o000OO00 path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        o0000O0 o0000o0OooO = OooO(path);
        if (o0000o0OooO != null) {
            return o0000o0OooO;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    @NotNull
    public abstract o0000oo OooOO0(@NotNull o000OO00 o000oo01) throws IOException;

    @NotNull
    public abstract o00O000 OooOO0O(@NotNull o000OO00 o000oo01) throws IOException;

    @NotNull
    public abstract o00O00 OooOO0o(@NotNull o000OO00 o000oo01) throws IOException;
}
