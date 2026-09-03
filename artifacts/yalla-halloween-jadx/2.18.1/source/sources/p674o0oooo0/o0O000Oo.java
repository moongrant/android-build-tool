package p674o0oooo0;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O000Oo {
    @NotNull
    public static final o0O0O0O OooO(@NotNull InputStream source) {
        Logger logger = o0O000o0.f52053OooO00o;
        Intrinsics.checkNotNullParameter(source, "$this$source");
        return new o0OoOoOo(source, new o0oO0O0o());
    }

    @NotNull
    public static final o0O00o00 OooO00o(@NotNull File appendingSink) throws FileNotFoundException {
        Logger logger = o0O000o0.f52053OooO00o;
        Intrinsics.checkNotNullParameter(appendingSink, "$this$appendingSink");
        return OooO0o0(new FileOutputStream(appendingSink, true));
    }

    @NotNull
    public static final oo00oO OooO0O0(@NotNull o0O00o00 buffer) {
        Intrinsics.checkNotNullParameter(buffer, "$this$buffer");
        return new o0O00O(buffer);
    }

    @NotNull
    public static final o0oOOo OooO0OO(@NotNull o0O0O0O buffer) {
        Intrinsics.checkNotNullParameter(buffer, "$this$buffer");
        return new o0O00OO(buffer);
    }

    public static final boolean OooO0Oo(@NotNull AssertionError isAndroidGetsocknameError) {
        Logger logger = o0O000o0.f52053OooO00o;
        Intrinsics.checkNotNullParameter(isAndroidGetsocknameError, "$this$isAndroidGetsocknameError");
        if (isAndroidGetsocknameError.getCause() == null) {
            return false;
        }
        String message = isAndroidGetsocknameError.getMessage();
        return message != null ? StringsKt__StringsKt.contains$default(message, "getsockname failed", false, 2, (Object) null) : false;
    }

    @NotNull
    public static final o0O00o00 OooO0o(@NotNull Socket sink) throws IOException {
        Logger logger = o0O000o0.f52053OooO00o;
        Intrinsics.checkNotNullParameter(sink, "$this$sink");
        o0O00oO0 o0o00oo1 = new o0O00oO0(sink);
        OutputStream outputStream = sink.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream()");
        o0OoO00O sink2 = new o0OoO00O(outputStream, o0o00oo1);
        Intrinsics.checkNotNullParameter(sink2, "sink");
        return new o00OOOO0(o0o00oo1, sink2);
    }

    @NotNull
    public static final o0O00o00 OooO0o0(@NotNull OutputStream sink) {
        Logger logger = o0O000o0.f52053OooO00o;
        Intrinsics.checkNotNullParameter(sink, "$this$sink");
        return new o0OoO00O(sink, new o0oO0O0o());
    }

    public static o0O00o00 OooO0oO(File sink) throws FileNotFoundException {
        Logger logger = o0O000o0.f52053OooO00o;
        Intrinsics.checkNotNullParameter(sink, "$this$sink");
        return OooO0o0(new FileOutputStream(sink, false));
    }

    @NotNull
    public static final o0O0O0O OooO0oo(@NotNull File source) throws FileNotFoundException {
        Logger logger = o0O000o0.f52053OooO00o;
        Intrinsics.checkNotNullParameter(source, "$this$source");
        return OooO(new FileInputStream(source));
    }

    @NotNull
    public static final o0O0O0O OooOO0(@NotNull Socket source) throws IOException {
        Logger logger = o0O000o0.f52053OooO00o;
        Intrinsics.checkNotNullParameter(source, "$this$source");
        o0O00oO0 o0o00oo1 = new o0O00oO0(source);
        InputStream inputStream = source.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream()");
        o0OoOoOo source2 = new o0OoOoOo(inputStream, o0o00oo1);
        Intrinsics.checkNotNullParameter(source2, "source");
        return new o00OOOOo(o0o00oo1, source2);
    }
}
