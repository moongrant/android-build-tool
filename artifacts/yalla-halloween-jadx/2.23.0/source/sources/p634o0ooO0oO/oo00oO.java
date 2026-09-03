package p634o0ooO0oO;

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
import p635o0ooO0oo.o0O000o0;
import p659o0oooO00.o0000Ooo;

/* JADX INFO: loaded from: classes5.dex */
public abstract class oo00oO {

    @NotNull
    public static final OooO00o Companion = new OooO00o();

    public static final class OooO00o {
        @JvmStatic
        @JvmName(name = "create")
        @NotNull
        public static o0O00o0 OooO00o(@NotNull String str, @Nullable o00OOO0 o00ooo1) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Charset charset = Charsets.UTF_8;
            if (o00ooo1 != null) {
                Pattern pattern = o00OOO0.f57234OooO0o0;
                Charset charsetOooO00o = o00ooo1.OooO00o(null);
                if (charsetOooO00o == null) {
                    o00ooo1 = o00OOO0.OooO00o.OooO0O0(o00ooo1 + "; charset=utf-8");
                } else {
                    charset = charsetOooO00o;
                }
            }
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return OooO0O0(bytes, o00ooo1, 0, bytes.length);
        }

        @JvmStatic
        @JvmName(name = "create")
        @NotNull
        @JvmOverloads
        public static o0O00o0 OooO0O0(@NotNull byte[] bArr, @Nullable o00OOO0 o00ooo1, int i, int i2) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            long length = bArr.length;
            long j = i;
            long j2 = i2;
            byte[] bArr2 = o0O000o0.f57386OooO00o;
            if ((j | j2) < 0 || j > length || length - j < j2) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return new o0O00o0(o00ooo1, bArr, i2, i);
        }

        public static /* synthetic */ o0O00o0 OooO0OO(OooO00o oooO00o, byte[] bArr, o00OOO0 o00ooo1, int i, int i2) {
            if ((i2 & 1) != 0) {
                o00ooo1 = null;
            }
            if ((i2 & 2) != 0) {
                i = 0;
            }
            int length = (i2 & 4) != 0 ? bArr.length : 0;
            oooO00o.getClass();
            return OooO0O0(bArr, o00ooo1, i, length);
        }
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public static final oo00oO create(@NotNull File file, @Nullable o00OOO0 o00ooo1) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new o00Oo00(file, o00ooo1);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    @Nullable
    public abstract o00OOO0 contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(@NotNull o0000Ooo o0000ooo) throws IOException;

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public static final oo00oO create(@NotNull String str, @Nullable o00OOO0 o00ooo1) {
        Companion.getClass();
        return OooO00o.OooO00o(str, o00ooo1);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @ReplaceWith(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
    @JvmStatic
    @NotNull
    public static final oo00oO create(@Nullable o00OOO0 o00ooo1, @NotNull File file) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new o00Oo00(file, o00ooo1);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @NotNull
    public static final oo00oO create(@Nullable o00OOO0 o00ooo1, @NotNull String content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return OooO00o.OooO00o(content, o00ooo1);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @NotNull
    public static final oo00oO create(@Nullable o00OOO0 o00ooo1, @NotNull ByteString content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(content, "<this>");
        return new o0oOO(o00ooo1, content);
    }

    @JvmStatic
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmOverloads
    public static final oo00oO create(@Nullable o00OOO0 o00ooo1, @NotNull byte[] content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        int length = content.length;
        Intrinsics.checkNotNullParameter(content, "content");
        return OooO00o.OooO0O0(content, o00ooo1, 0, length);
    }

    @JvmStatic
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmOverloads
    public static final oo00oO create(@Nullable o00OOO0 o00ooo1, @NotNull byte[] content, int i) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        int length = content.length;
        Intrinsics.checkNotNullParameter(content, "content");
        return OooO00o.OooO0O0(content, o00ooo1, i, length);
    }

    @JvmStatic
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmOverloads
    public static final oo00oO create(@Nullable o00OOO0 o00ooo1, @NotNull byte[] content, int i, int i2) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return OooO00o.OooO0O0(content, o00ooo1, i, i2);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public static final oo00oO create(@NotNull ByteString byteString, @Nullable o00OOO0 o00ooo1) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        return new o0oOO(o00ooo1, byteString);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    @JvmOverloads
    public static final oo00oO create(@NotNull byte[] bArr) {
        OooO00o oooO00o = Companion;
        oooO00o.getClass();
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return OooO00o.OooO0OO(oooO00o, bArr, null, 0, 7);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    @JvmOverloads
    public static final oo00oO create(@NotNull byte[] bArr, @Nullable o00OOO0 o00ooo1) {
        OooO00o oooO00o = Companion;
        oooO00o.getClass();
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return OooO00o.OooO0OO(oooO00o, bArr, o00ooo1, 0, 6);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    @JvmOverloads
    public static final oo00oO create(@NotNull byte[] bArr, @Nullable o00OOO0 o00ooo1, int i) {
        OooO00o oooO00o = Companion;
        oooO00o.getClass();
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return OooO00o.OooO0OO(oooO00o, bArr, o00ooo1, i, 4);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    @JvmOverloads
    public static final oo00oO create(@NotNull byte[] bArr, @Nullable o00OOO0 o00ooo1, int i, int i2) {
        Companion.getClass();
        return OooO00o.OooO0O0(bArr, o00ooo1, i, i2);
    }
}
