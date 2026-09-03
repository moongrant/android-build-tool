package p662o0oooO0O;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o0OO {
    @NotNull
    public static final o0OOo000 OooO00o(@NotNull ooo0Oo0 ooo0oo0) {
        Intrinsics.checkNotNullParameter(ooo0oo0, "<this>");
        return new o0OOo000(ooo0oo0);
    }

    @NotNull
    public static final o0o0000 OooO0O0(@NotNull oO00000 oo00000) {
        Intrinsics.checkNotNullParameter(oo00000, "<this>");
        return new o0o0000(oo00000);
    }

    public static final boolean OooO0OO(@NotNull AssertionError assertionError) {
        Logger logger = o0OOO00.f59784OooO00o;
        Intrinsics.checkNotNullParameter(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? StringsKt__StringsKt.contains$default(message, "getsockname failed", false, 2, (Object) null) : false;
    }

    @NotNull
    public static final o0O0OO0 OooO0Oo(@NotNull Socket socket) throws IOException {
        Logger logger = o0OOO00.f59784OooO00o;
        Intrinsics.checkNotNullParameter(socket, "<this>");
        o oVar = new o(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream()");
        o0OOO0OO sink = new o0OOO0OO(outputStream, oVar);
        Intrinsics.checkNotNullParameter(sink, "sink");
        return new o0O0OO0(oVar, sink);
    }

    @NotNull
    public static final o0O0OOO0 OooO0o(@NotNull Socket socket) throws IOException {
        Logger logger = o0OOO00.f59784OooO00o;
        Intrinsics.checkNotNullParameter(socket, "<this>");
        o oVar = new o(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream()");
        o0OO0O0 source = new o0OO0O0(inputStream, oVar);
        Intrinsics.checkNotNullParameter(source, "source");
        return new o0O0OOO0(oVar, source);
    }

    @NotNull
    public static final o0OOO0OO OooO0o0(@NotNull OutputStream outputStream) {
        Logger logger = o0OOO00.f59784OooO00o;
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        return new o0OOO0OO(outputStream, new oO00000o());
    }

    @NotNull
    public static final o0OO0O0 OooO0oO(@NotNull File file) throws FileNotFoundException {
        Logger logger = o0OOO00.f59784OooO00o;
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new o0OO0O0(new FileInputStream(file), oO00000o.f59811OooO0Oo);
    }

    @NotNull
    public static final o0OO0O0 OooO0oo(@NotNull InputStream inputStream) {
        Logger logger = o0OOO00.f59784OooO00o;
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return new o0OO0O0(inputStream, new oO00000o());
    }
}
