package p660o0ooo0o0;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;
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
import p659o0ooo0o.o00OOO00;
import p674o0oooo0.oo00oO;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o0o0Oo {
    public static final OooO00o Companion = new OooO00o();

    public static final class OooO00o {

        /* JADX INFO: renamed from: o0ooo0o0.o0o0Oo$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0427OooO00o extends o0o0Oo {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ byte[] f51476OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final /* synthetic */ o00OO0O0 f51477OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public final /* synthetic */ int f51478OooO0OO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ int f51479OooO0Oo;

            public C0427OooO00o(byte[] bArr, o00OO0O0 o00oo0o1, int i, int i2) {
                this.f51476OooO00o = bArr;
                this.f51477OooO0O0 = o00oo0o1;
                this.f51478OooO0OO = i;
                this.f51479OooO0Oo = i2;
            }

            @Override // p660o0ooo0o0.o0o0Oo
            public final long contentLength() {
                return this.f51478OooO0OO;
            }

            @Override // p660o0ooo0o0.o0o0Oo
            @Nullable
            public final o00OO0O0 contentType() {
                return this.f51477OooO0O0;
            }

            @Override // p660o0ooo0o0.o0o0Oo
            public final void writeTo(@NotNull oo00oO sink) throws IOException {
                Intrinsics.checkNotNullParameter(sink, "sink");
                sink.Oooooo0(this.f51476OooO00o, this.f51479OooO0Oo, this.f51478OooO0OO);
            }
        }

        public static o0o0Oo OooO0OO(OooO00o oooO00o, o00OO0O0 o00oo0o1, byte[] content, int i, int i2) {
            if ((i2 & 4) != 0) {
                i = 0;
            }
            int length = (i2 & 8) != 0 ? content.length : 0;
            Objects.requireNonNull(oooO00o);
            Intrinsics.checkNotNullParameter(content, "content");
            return oooO00o.OooO0O0(content, o00oo0o1, i, length);
        }

        public static /* synthetic */ o0o0Oo OooO0Oo(OooO00o oooO00o, byte[] bArr, o00OO0O0 o00oo0o1, int i, int i2) {
            if ((i2 & 1) != 0) {
                o00oo0o1 = null;
            }
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return oooO00o.OooO0O0(bArr, o00oo0o1, i, (i2 & 4) != 0 ? bArr.length : 0);
        }

        @JvmStatic
        @JvmName(name = "create")
        @NotNull
        public final o0o0Oo OooO00o(@NotNull String toRequestBody, @Nullable o00OO0O0 o00oo0o1) {
            Intrinsics.checkNotNullParameter(toRequestBody, "$this$toRequestBody");
            Charset charset = Charsets.UTF_8;
            if (o00oo0o1 != null) {
                Pattern pattern = o00OO0O0.f51400OooO0o0;
                Charset charsetOooO00o = o00oo0o1.OooO00o(null);
                if (charsetOooO00o == null) {
                    o00oo0o1 = o00OO0O0.f51401OooO0oO.OooO0O0(o00oo0o1 + "; charset=utf-8");
                } else {
                    charset = charsetOooO00o;
                }
            }
            byte[] bytes = toRequestBody.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            return OooO0O0(bytes, o00oo0o1, 0, bytes.length);
        }

        @JvmStatic
        @JvmName(name = "create")
        @NotNull
        @JvmOverloads
        public final o0o0Oo OooO0O0(@NotNull byte[] toRequestBody, @Nullable o00OO0O0 o00oo0o1, int i, int i2) {
            Intrinsics.checkNotNullParameter(toRequestBody, "$this$toRequestBody");
            o00OOO00.OooO0OO(toRequestBody.length, i, i2);
            return new C0427OooO00o(toRequestBody, o00oo0o1, i2, i);
        }
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public static final o0o0Oo create(@NotNull File asRequestBody, @Nullable o00OO0O0 o00oo0o1) {
        Objects.requireNonNull(Companion);
        Intrinsics.checkNotNullParameter(asRequestBody, "$this$asRequestBody");
        return new o00OOO0(asRequestBody, o00oo0o1);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public static final o0o0Oo create(@NotNull String str, @Nullable o00OO0O0 o00oo0o1) {
        return Companion.OooO00o(str, o00oo0o1);
    }

    @JvmStatic
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmOverloads
    public static final o0o0Oo create(@Nullable o00OO0O0 o00oo0o1, @NotNull byte[] bArr) {
        return OooO00o.OooO0OO(Companion, o00oo0o1, bArr, 0, 12);
    }

    @JvmStatic
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmOverloads
    public static final o0o0Oo create(@Nullable o00OO0O0 o00oo0o1, @NotNull byte[] bArr, int i) {
        return OooO00o.OooO0OO(Companion, o00oo0o1, bArr, i, 8);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    @JvmOverloads
    public static final o0o0Oo create(@NotNull byte[] bArr) {
        return OooO00o.OooO0Oo(Companion, bArr, null, 0, 7);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    @JvmOverloads
    public static final o0o0Oo create(@NotNull byte[] bArr, @Nullable o00OO0O0 o00oo0o1) {
        return OooO00o.OooO0Oo(Companion, bArr, o00oo0o1, 0, 6);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    @JvmOverloads
    public static final o0o0Oo create(@NotNull byte[] bArr, @Nullable o00OO0O0 o00oo0o1, int i) {
        return OooO00o.OooO0Oo(Companion, bArr, o00oo0o1, i, 4);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    @JvmOverloads
    public static final o0o0Oo create(@NotNull byte[] bArr, @Nullable o00OO0O0 o00oo0o1, int i, int i2) {
        return Companion.OooO0O0(bArr, o00oo0o1, i, i2);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    @Nullable
    public abstract o00OO0O0 contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(@NotNull oo00oO oo00oo) throws IOException;

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @ReplaceWith(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
    @JvmStatic
    @NotNull
    public static final o0o0Oo create(@Nullable o00OO0O0 o00oo0o1, @NotNull File asRequestBody) {
        Objects.requireNonNull(Companion);
        Intrinsics.checkNotNullParameter(asRequestBody, "file");
        Intrinsics.checkNotNullParameter(asRequestBody, "$this$asRequestBody");
        return new o00OOO0(asRequestBody, o00oo0o1);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @NotNull
    public static final o0o0Oo create(@Nullable o00OO0O0 o00oo0o1, @NotNull String content) {
        OooO00o oooO00o = Companion;
        Objects.requireNonNull(oooO00o);
        Intrinsics.checkNotNullParameter(content, "content");
        return oooO00o.OooO00o(content, o00oo0o1);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @NotNull
    public static final o0o0Oo create(@Nullable o00OO0O0 o00oo0o1, @NotNull ByteString toRequestBody) {
        Objects.requireNonNull(Companion);
        Intrinsics.checkNotNullParameter(toRequestBody, "content");
        Intrinsics.checkNotNullParameter(toRequestBody, "$this$toRequestBody");
        return new o00OOO0O(toRequestBody, o00oo0o1);
    }

    @JvmStatic
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmOverloads
    public static final o0o0Oo create(@Nullable o00OO0O0 o00oo0o1, @NotNull byte[] content, int i, int i2) {
        OooO00o oooO00o = Companion;
        Objects.requireNonNull(oooO00o);
        Intrinsics.checkNotNullParameter(content, "content");
        return oooO00o.OooO0O0(content, o00oo0o1, i, i2);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public static final o0o0Oo create(@NotNull ByteString toRequestBody, @Nullable o00OO0O0 o00oo0o1) {
        Objects.requireNonNull(Companion);
        Intrinsics.checkNotNullParameter(toRequestBody, "$this$toRequestBody");
        return new o00OOO0O(toRequestBody, o00oo0o1);
    }
}
