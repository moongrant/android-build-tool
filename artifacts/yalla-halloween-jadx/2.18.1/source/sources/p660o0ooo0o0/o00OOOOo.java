package p660o0ooo0o0;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p659o0ooo0o.o00OOO00;
import p674o0oooo0.o0oOO;
import p674o0oooo0.o0oOOo;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o00OOOOo implements Closeable {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final OooO0O0 f51464Oooo0oO = new OooO0O0();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public OooO00o f51465Oooo0o;

    public static final class OooO00o extends Reader {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final Charset f51466Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public boolean f51467Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public InputStreamReader f51468Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final o0oOOo f51469Oooo0oo;

        public OooO00o(@NotNull o0oOOo source, @NotNull Charset charset) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(charset, "charset");
            this.f51469Oooo0oo = source;
            this.f51466Oooo = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.f51467Oooo0o = true;
            InputStreamReader inputStreamReader = this.f51468Oooo0oO;
            if (inputStreamReader != null) {
                inputStreamReader.close();
            } else {
                this.f51469Oooo0oo.close();
            }
        }

        @Override // java.io.Reader
        public final int read(@NotNull char[] cbuf, int i, int i2) throws IOException {
            Intrinsics.checkNotNullParameter(cbuf, "cbuf");
            if (this.f51467Oooo0o) {
                throw new IOException("Stream closed");
            }
            InputStreamReader inputStreamReader = this.f51468Oooo0oO;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.f51469Oooo0oo.o0000OO0(), o00OOO00.OooOo00(this.f51469Oooo0oo, this.f51466Oooo));
                this.f51468Oooo0oO = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, i, i2);
        }
    }

    public static final class OooO0O0 {

        public static final class OooO00o extends o00OOOOo {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ o00OO0O0 f51470Oooo;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ o0oOOo f51471Oooo0oo;

            /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
            public final /* synthetic */ long f51472OoooO00;

            public OooO00o(o0oOOo o0oooo2, o00OO0O0 o00oo0o1, long j) {
                this.f51471Oooo0oo = o0oooo2;
                this.f51470Oooo = o00oo0o1;
                this.f51472OoooO00 = j;
            }

            @Override // p660o0ooo0o0.o00OOOOo
            public final long OooO0Oo() {
                return this.f51472OoooO00;
            }

            @Override // p660o0ooo0o0.o00OOOOo
            @Nullable
            public final o00OO0O0 OooO0o() {
                return this.f51470Oooo;
            }

            @Override // p660o0ooo0o0.o00OOOOo
            @NotNull
            public final o0oOOo OooO0oo() {
                return this.f51471Oooo0oo;
            }
        }

        @JvmStatic
        @JvmName(name = "create")
        @NotNull
        public final o00OOOOo OooO00o(@NotNull String string, @Nullable o00OO0O0 o00oo0o1) {
            Intrinsics.checkNotNullParameter(string, "$this$toResponseBody");
            Charset charset = Charsets.UTF_8;
            Pattern pattern = o00OO0O0.f51400OooO0o0;
            Charset charsetOooO00o = o00oo0o1.OooO00o(null);
            if (charsetOooO00o == null) {
                o00oo0o1 = o00OO0O0.f51401OooO0oO.OooO0O0(o00oo0o1 + "; charset=utf-8");
            } else {
                charset = charsetOooO00o;
            }
            o0oOO o0ooo2 = new o0oOO();
            Intrinsics.checkNotNullParameter(string, "string");
            Intrinsics.checkNotNullParameter(charset, "charset");
            o0oOO o0oooOo000o = o0ooo2.oo000o(string, 0, string.length(), charset);
            return OooO0O0(o0oooOo000o, o00oo0o1, o0oooOo000o.f52099Oooo0oO);
        }

        @JvmStatic
        @JvmName(name = "create")
        @NotNull
        public final o00OOOOo OooO0O0(@NotNull o0oOOo asResponseBody, @Nullable o00OO0O0 o00oo0o1, long j) {
            Intrinsics.checkNotNullParameter(asResponseBody, "$this$asResponseBody");
            return new OooO00o(asResponseBody, o00oo0o1, j);
        }
    }

    @NotNull
    public final InputStream OooO00o() {
        return OooO0oo().o0000OO0();
    }

    @NotNull
    public final byte[] OooO0O0() throws IOException {
        long jOooO0Oo = OooO0Oo();
        if (jOooO0Oo > Integer.MAX_VALUE) {
            throw new IOException(androidx.viewpager2.adapter.OooO00o.OooO00o("Cannot buffer entire body for content length: ", jOooO0Oo));
        }
        o0oOOo o0ooooOooO0oo = OooO0oo();
        try {
            byte[] bArrOooOoo0 = o0ooooOooO0oo.OooOoo0();
            CloseableKt.closeFinally(o0ooooOooO0oo, null);
            int length = bArrOooOoo0.length;
            if (jOooO0Oo == -1 || jOooO0Oo == length) {
                return bArrOooOoo0;
            }
            throw new IOException("Content-Length (" + jOooO0Oo + ") and stream length (" + length + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(o0ooooOooO0oo, th);
                throw th2;
            }
        }
    }

    public abstract long OooO0Oo();

    @Nullable
    public abstract o00OO0O0 OooO0o();

    @NotNull
    public abstract o0oOOo OooO0oo();

    @NotNull
    public final String OooOOO() throws IOException {
        Charset charsetOooO00o;
        o0oOOo o0ooooOooO0oo = OooO0oo();
        try {
            o00OO0O0 o00oo0o0OooO0o = OooO0o();
            if (o00oo0o0OooO0o == null || (charsetOooO00o = o00oo0o0OooO0o.OooO00o(Charsets.UTF_8)) == null) {
                charsetOooO00o = Charsets.UTF_8;
            }
            String strOooooO0 = o0ooooOooO0oo.OooooO0(o00OOO00.OooOo00(o0ooooOooO0oo, charsetOooO00o));
            CloseableKt.closeFinally(o0ooooOooO0oo, null);
            return strOooooO0;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(o0ooooOooO0oo, th);
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        o00OOO00.OooO0Oo(OooO0oo());
    }
}
