package p641o0ooOO0o;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p648o0ooOoo.oO000o00;
import p662o0oooO0O.o0O0o0;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes5.dex */
public abstract class o0O00oO0 implements Closeable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public OooO00o f57873OooO0Oo;

    public static final class OooO00o extends Reader {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final o0O0o0 f57874OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f57875OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public final Charset f57876OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public InputStreamReader f57877OooO0oO;

        public OooO00o(@NotNull o0O0o0 source, @NotNull Charset charset) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(charset, "charset");
            this.f57874OooO0Oo = source;
            this.f57876OooO0o0 = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            Unit unit;
            this.f57875OooO0o = true;
            InputStreamReader inputStreamReader = this.f57877OooO0oO;
            if (inputStreamReader == null) {
                unit = null;
            } else {
                inputStreamReader.close();
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                this.f57874OooO0Oo.close();
            }
        }

        @Override // java.io.Reader
        public final int read(@NotNull char[] cbuf, int i, int i2) throws IOException {
            Intrinsics.checkNotNullParameter(cbuf, "cbuf");
            if (this.f57875OooO0o) {
                throw new IOException("Stream closed");
            }
            InputStreamReader inputStreamReader = this.f57877OooO0oO;
            if (inputStreamReader == null) {
                o0O0o0 o0o0o0 = this.f57874OooO0Oo;
                inputStreamReader = new InputStreamReader(o0o0o0.o0000OoO(), oO000o00.OooOOoo(o0o0o0, this.f57876OooO0o0));
                this.f57877OooO0oO = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, i, i2);
        }
    }

    public static final class OooO0O0 {
        @JvmStatic
        @JvmName(name = "create")
        @NotNull
        public static o0O0O0O OooO00o(@NotNull String string, @Nullable o0O000Oo o0o000oo2) {
            Intrinsics.checkNotNullParameter(string, "<this>");
            Charset charset = Charsets.UTF_8;
            Pattern pattern = o0O000Oo.f57807OooO0o0;
            Charset charsetOooO00o = o0o000oo2.OooO00o(null);
            if (charsetOooO00o == null) {
                o0o000oo2 = o0O000Oo.OooO00o.OooO0O0(o0o000oo2 + "; charset=utf-8");
            } else {
                charset = charsetOooO00o;
            }
            oo0OOoo oo0oooo = new oo0OOoo();
            Intrinsics.checkNotNullParameter(string, "string");
            Intrinsics.checkNotNullParameter(charset, "charset");
            oo0oooo.o000000(string, 0, string.length(), charset);
            long j = oo0oooo.f59828OooO0o0;
            Intrinsics.checkNotNullParameter(oo0oooo, "<this>");
            return new o0O0O0O(o0o000oo2, j, oo0oooo);
        }
    }

    static {
        new OooO0O0();
    }

    @NotNull
    public final byte[] OooO00o() throws IOException {
        long jOooO0OO = OooO0OO();
        if (jOooO0OO > 2147483647L) {
            throw new IOException(Intrinsics.stringPlus("Cannot buffer entire body for content length: ", Long.valueOf(jOooO0OO)));
        }
        o0O0o0 o0o0o0OooOOo = OooOOo();
        try {
            byte[] bArrO00ooo = o0o0o0OooOOo.o00ooo();
            CloseableKt.closeFinally(o0o0o0OooOOo, null);
            int length = bArrO00ooo.length;
            if (jOooO0OO == -1 || jOooO0OO == length) {
                return bArrO00ooo;
            }
            throw new IOException("Content-Length (" + jOooO0OO + ") and stream length (" + length + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(o0o0o0OooOOo, th);
                throw th2;
            }
        }
    }

    public abstract long OooO0OO();

    @Nullable
    public abstract o0O000Oo OooO0oO();

    @NotNull
    public abstract o0O0o0 OooOOo();

    @NotNull
    public final String OooOo00() throws IOException {
        o0O0o0 o0o0o0OooOOo = OooOOo();
        try {
            o0O000Oo o0o000ooOooO0oO = OooO0oO();
            Charset charsetOooO00o = o0o000ooOooO0oO == null ? null : o0o000ooOooO0oO.OooO00o(Charsets.UTF_8);
            if (charsetOooO00o == null) {
                charsetOooO00o = Charsets.UTF_8;
            }
            String strO000000o = o0o0o0OooOOo.o000000o(oO000o00.OooOOoo(o0o0o0OooOOo, charsetOooO00o));
            CloseableKt.closeFinally(o0o0o0OooOOo, null);
            return strO000000o;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(o0o0o0OooOOo, th);
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        oO000o00.OooO0OO(OooOOo());
    }
}
