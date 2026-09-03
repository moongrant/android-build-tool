package p634o0ooO0oO;

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
import p635o0ooO0oo.o0O000o0;
import p659o0oooO00.o0000;
import p659o0oooO00.o00000O;

/* JADX INFO: loaded from: classes5.dex */
public abstract class o0O0o implements Closeable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public OooO00o f57333OooO0Oo;

    public static final class OooO00o extends Reader {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final o0000 f57334OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f57335OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public final Charset f57336OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public InputStreamReader f57337OooO0oO;

        public OooO00o(@NotNull o0000 source, @NotNull Charset charset) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(charset, "charset");
            this.f57334OooO0Oo = source;
            this.f57336OooO0o0 = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            Unit unit;
            this.f57335OooO0o = true;
            InputStreamReader inputStreamReader = this.f57337OooO0oO;
            if (inputStreamReader == null) {
                unit = null;
            } else {
                inputStreamReader.close();
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                this.f57334OooO0Oo.close();
            }
        }

        @Override // java.io.Reader
        public final int read(@NotNull char[] cbuf, int i, int i2) throws IOException {
            Intrinsics.checkNotNullParameter(cbuf, "cbuf");
            if (this.f57335OooO0o) {
                throw new IOException("Stream closed");
            }
            InputStreamReader inputStreamReader = this.f57337OooO0oO;
            if (inputStreamReader == null) {
                o0000 o0000Var = this.f57334OooO0Oo;
                inputStreamReader = new InputStreamReader(o0000Var.o0000OoO(), o0O000o0.OooOOoo(o0000Var, this.f57336OooO0o0));
                this.f57337OooO0oO = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, i, i2);
        }
    }

    public static final class OooO0O0 {
        @JvmStatic
        @JvmName(name = "create")
        @NotNull
        public static o0 OooO00o(@NotNull String string, @Nullable o00OOO0 o00ooo1) {
            Intrinsics.checkNotNullParameter(string, "<this>");
            Charset charset = Charsets.UTF_8;
            Pattern pattern = o00OOO0.f57234OooO0o0;
            Charset charsetOooO00o = o00ooo1.OooO00o(null);
            if (charsetOooO00o == null) {
                o00ooo1 = o00OOO0.OooO00o.OooO0O0(o00ooo1 + "; charset=utf-8");
            } else {
                charset = charsetOooO00o;
            }
            o00000O o00000o = new o00000O();
            Intrinsics.checkNotNullParameter(string, "string");
            Intrinsics.checkNotNullParameter(charset, "charset");
            o00000o.o0O0O00(string, 0, string.length(), charset);
            long j = o00000o.f60177OooO0o0;
            Intrinsics.checkNotNullParameter(o00000o, "<this>");
            return new o0(o00ooo1, j, o00000o);
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
        o0000 o0000VarOooOOo0 = OooOOo0();
        try {
            byte[] bArrO00Ooo = o0000VarOooOOo0.o00Ooo();
            CloseableKt.closeFinally(o0000VarOooOOo0, null);
            int length = bArrO00Ooo.length;
            if (jOooO0OO == -1 || jOooO0OO == length) {
                return bArrO00Ooo;
            }
            throw new IOException("Content-Length (" + jOooO0OO + ") and stream length (" + length + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(o0000VarOooOOo0, th);
                throw th2;
            }
        }
    }

    public abstract long OooO0OO();

    @Nullable
    public abstract o00OOO0 OooO0oO();

    @NotNull
    public final String OooOOo() throws IOException {
        o0000 o0000VarOooOOo0 = OooOOo0();
        try {
            o00OOO0 o00ooo0OooO0oO = OooO0oO();
            Charset charsetOooO00o = o00ooo0OooO0oO == null ? null : o00ooo0OooO0oO.OooO00o(Charsets.UTF_8);
            if (charsetOooO00o == null) {
                charsetOooO00o = Charsets.UTF_8;
            }
            String strO000000 = o0000VarOooOOo0.o000000(o0O000o0.OooOOoo(o0000VarOooOOo0, charsetOooO00o));
            CloseableKt.closeFinally(o0000VarOooOOo0, null);
            return strO000000;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(o0000VarOooOOo0, th);
                throw th2;
            }
        }
    }

    @NotNull
    public abstract o0000 OooOOo0();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        o0O000o0.OooO0OO(OooOOo0());
    }
}
