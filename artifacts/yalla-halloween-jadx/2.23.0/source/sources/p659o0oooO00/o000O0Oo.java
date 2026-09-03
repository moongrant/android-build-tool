package p659o0oooO00;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o000O0Oo {
    @NotNull
    public static final o00 OooO00o(@NotNull o00O000 o00o001) {
        Intrinsics.checkNotNullParameter(o00o001, "<this>");
        return new o00(o00o001);
    }

    @NotNull
    public static final o00O0000 OooO0O0(@NotNull o00O00 o00o01) {
        Intrinsics.checkNotNullParameter(o00o01, "<this>");
        return new o00O0000(o00o01);
    }

    public static final boolean OooO0OO(@NotNull AssertionError assertionError) {
        Logger logger = o000OO0O.f60223OooO00o;
        Intrinsics.checkNotNullParameter(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? StringsKt.OooO0o(message, "getsockname failed") : false;
    }

    @NotNull
    public static final o000000O OooO0Oo(@NotNull Socket socket) throws IOException {
        Logger logger = o000OO0O.f60223OooO00o;
        Intrinsics.checkNotNullParameter(socket, "<this>");
        o00O000o o00o000o2 = new o00O000o(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream()");
        o000O sink = new o000O(outputStream, o00o000o2);
        Intrinsics.checkNotNullParameter(sink, "sink");
        return new o000000O(o00o000o2, sink);
    }

    @NotNull
    public static final o00000 OooO0o(@NotNull Socket socket) throws IOException {
        Logger logger = o000OO0O.f60223OooO00o;
        Intrinsics.checkNotNullParameter(socket, "<this>");
        o00O000o o00o000o2 = new o00O000o(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream()");
        o000Oo0 source = new o000Oo0(inputStream, o00o000o2);
        Intrinsics.checkNotNullParameter(source, "source");
        return new o00000(o00o000o2, source);
    }

    @NotNull
    public static final o000O OooO0o0(@NotNull OutputStream outputStream) {
        Logger logger = o000OO0O.f60223OooO00o;
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        return new o000O(outputStream, new o00O00O());
    }

    @NotNull
    public static final o000Oo0 OooO0oO(@NotNull File file) throws FileNotFoundException {
        Logger logger = o000OO0O.f60223OooO00o;
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new o000Oo0(new FileInputStream(file), o00O00O.f60237OooO0Oo);
    }

    @NotNull
    public static final o000Oo0 OooO0oo(@NotNull InputStream inputStream) {
        Logger logger = o000OO0O.f60223OooO00o;
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return new o000Oo0(inputStream, new o00O00O());
    }
}
