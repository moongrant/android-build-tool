package p641o0ooOO0o;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p648o0ooOoo.oO000o00;
import p662o0oooO0O.o0O0o00O;

/* JADX INFO: loaded from: classes5.dex */
public abstract class o0oO0Ooo {

    @NotNull
    public static final OooO00o Companion = new OooO00o();

    public static final class OooO00o {
        @JvmStatic
        @JvmName(name = "create")
        @NotNull
        public static o0O00OOO OooO00o(@NotNull String str, @Nullable o0O000Oo o0o000oo2) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Charset charset = Charsets.UTF_8;
            if (o0o000oo2 != null) {
                Pattern pattern = o0O000Oo.f57807OooO0o0;
                Charset charsetOooO00o = o0o000oo2.OooO00o(null);
                if (charsetOooO00o == null) {
                    o0o000oo2 = o0O000Oo.OooO00o.OooO0O0(o0o000oo2 + "; charset=utf-8");
                } else {
                    charset = charsetOooO00o;
                }
            }
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return OooO0O0(bytes, o0o000oo2, 0, bytes.length);
        }

        @JvmStatic
        @JvmName(name = "create")
        @NotNull
        @JvmOverloads
        public static o0O00OOO OooO0O0(@NotNull byte[] bArr, @Nullable o0O000Oo o0o000oo2, int i, int i2) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            long length = bArr.length;
            long j = i;
            long j2 = i2;
            byte[] bArr2 = oO000o00.f58124OooO00o;
            if ((j | j2) < 0 || j > length || length - j < j2) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return new o0O00OOO(o0o000oo2, bArr, i2, i);
        }

        public static /* synthetic */ o0O00OOO OooO0OO(OooO00o oooO00o, byte[] bArr, o0O000Oo o0o000oo2, int i, int i2) {
            if ((i2 & 1) != 0) {
                o0o000oo2 = null;
            }
            if ((i2 & 2) != 0) {
                i = 0;
            }
            int length = (i2 & 4) != 0 ? bArr.length : 0;
            oooO00o.getClass();
            return OooO0O0(bArr, o0o000oo2, i, length);
        }
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public static final o0oO0Ooo create(@NotNull File file, @Nullable o0O000Oo o0o000oo2) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new o0O00O(file, o0o000oo2);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    @Nullable
    public abstract o0O000Oo contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(@NotNull o0O0o00O o0o0o00o) throws IOException;

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public static final o0oO0Ooo create(@NotNull String str, @Nullable o0O000Oo o0o000oo2) {
        Companion.getClass();
        return OooO00o.OooO00o(str, o0o000oo2);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @ReplaceWith(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
    @JvmStatic
    @NotNull
    public static final o0oO0Ooo create(@Nullable o0O000Oo o0o000oo2, @NotNull File file) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new o0O00O(file, o0o000oo2);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @NotNull
    public static final o0oO0Ooo create(@Nullable o0O000Oo o0o000oo2, @NotNull String content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return OooO00o.OooO00o(content, o0o000oo2);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @NotNull
    public static final o0oO0Ooo create(@Nullable o0O000Oo o0o000oo2, @NotNull ByteString content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(content, "<this>");
        return new o0O00OO(o0o000oo2, content);
    }

    @JvmStatic
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmOverloads
    public static final o0oO0Ooo create(@Nullable o0O000Oo o0o000oo2, @NotNull byte[] content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        int length = content.length;
        Intrinsics.checkNotNullParameter(content, "content");
        return OooO00o.OooO0O0(content, o0o000oo2, 0, length);
    }

    @JvmStatic
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmOverloads
    public static final o0oO0Ooo create(@Nullable o0O000Oo o0o000oo2, @NotNull byte[] content, int i) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        int length = content.length;
        Intrinsics.checkNotNullParameter(content, "content");
        return OooO00o.OooO0O0(content, o0o000oo2, i, length);
    }

    @JvmStatic
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmOverloads
    public static final o0oO0Ooo create(@Nullable o0O000Oo o0o000oo2, @NotNull byte[] content, int i, int i2) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return OooO00o.OooO0O0(content, o0o000oo2, i, i2);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public static final o0oO0Ooo create(@NotNull ByteString byteString, @Nullable o0O000Oo o0o000oo2) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        return new o0O00OO(o0o000oo2, byteString);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    @JvmOverloads
    public static final o0oO0Ooo create(@NotNull byte[] bArr) {
        OooO00o oooO00o = Companion;
        oooO00o.getClass();
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return OooO00o.OooO0OO(oooO00o, bArr, null, 0, 7);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    @JvmOverloads
    public static final o0oO0Ooo create(@NotNull byte[] bArr, @Nullable o0O000Oo o0o000oo2) {
        OooO00o oooO00o = Companion;
        oooO00o.getClass();
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return OooO00o.OooO0OO(oooO00o, bArr, o0o000oo2, 0, 6);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    @JvmOverloads
    public static final o0oO0Ooo create(@NotNull byte[] bArr, @Nullable o0O000Oo o0o000oo2, int i) {
        OooO00o oooO00o = Companion;
        oooO00o.getClass();
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return OooO00o.OooO0OO(oooO00o, bArr, o0o000oo2, i, 4);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    @JvmOverloads
    public static final o0oO0Ooo create(@NotNull byte[] bArr, @Nullable o0O000Oo o0o000oo2, int i, int i2) {
        Companion.getClass();
        return OooO00o.OooO0O0(bArr, o0o000oo2, i, i2);
    }
}
