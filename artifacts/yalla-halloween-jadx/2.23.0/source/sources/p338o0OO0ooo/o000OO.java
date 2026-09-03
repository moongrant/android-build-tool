package p338o0OO0ooo;

import com.squareup.okhttp.OooOOO;
import com.squareup.okhttp.OooOOOO;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.o00Ooo;
import com.squareup.okhttp.oo000o;
import java.io.EOFException;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import p336o0OO0oo0.OooOO0O;
import p336o0OO0oo0.o000oOoO;
import p659o0oooO00.o00;
import p659o0oooO00.o000;
import p659o0oooO00.o00000O;
import p659o0oooO00.o000O0Oo;
import p659o0oooO00.o00O00;
import p659o0oooO00.o00O000;
import p659o0oooO00.o00O0000;
import p659o0oooO00.o00O00O;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOOO f43527OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOO f43528OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Socket f43529OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00O0000 f43530OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00 f43532OooO0o0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f43531OooO0o = 0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f43533OooO0oO = 0;

    public class OooO extends OooO00o {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public long f43534OooO0oO;

        public OooO(long j) throws IOException {
            super();
            this.f43534OooO0oO = j;
            if (j == 0) {
                OooO00o(true);
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            boolean zOooO0oo;
            if (this.f43538OooO0o0) {
                return;
            }
            if (this.f43534OooO0oO != 0) {
                try {
                    zOooO0oo = o000oOoO.OooO0oo(this, 100, TimeUnit.MILLISECONDS);
                } catch (IOException unused) {
                    zOooO0oo = false;
                }
                if (!zOooO0oo) {
                    OooO0OO();
                }
            }
            this.f43538OooO0o0 = true;
        }

        @Override // p659o0oooO00.o00O00
        public final long o0000OO0(o00000O o00000o, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException(androidx.compose.ui.input.key.OooO00o.OooO00o("byteCount < 0: ", j));
            }
            if (this.f43538OooO0o0) {
                throw new IllegalStateException("closed");
            }
            long j2 = this.f43534OooO0oO;
            if (j2 == 0) {
                return -1L;
            }
            long jO0000OO0 = o000OO.this.f43530OooO0Oo.o0000OO0(o00000o, Math.min(j2, j));
            if (jO0000OO0 == -1) {
                OooO0OO();
                throw new ProtocolException("unexpected end of stream");
            }
            long j3 = this.f43534OooO0oO - jO0000OO0;
            this.f43534OooO0oO = j3;
            if (j3 == 0) {
                OooO00o(true);
            }
            return jO0000OO0;
        }
    }

    public abstract class OooO00o implements o00O00 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o000 f43536OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f43538OooO0o0;

        public OooO00o() {
            this.f43536OooO0Oo = new o000(o000OO.this.f43530OooO0Oo.timeout());
        }

        public final void OooO00o(boolean z) throws IOException {
            o000OO o000oo2 = o000OO.this;
            if (o000oo2.f43531OooO0o != 5) {
                throw new IllegalStateException("state: " + o000oo2.f43531OooO0o);
            }
            o000OO.OooO00o(o000oo2, this.f43536OooO0Oo);
            o000oo2.f43531OooO0o = 0;
            OooOOO oooOOO = o000oo2.f43528OooO0O0;
            if (z && o000oo2.f43533OooO0oO == 1) {
                o000oo2.f43533OooO0oO = 0;
                OooOO0O.f43304OooO0O0.OooO0O0(o000oo2.f43527OooO00o, oooOOO);
            } else if (o000oo2.f43533OooO0oO == 2) {
                o000oo2.f43531OooO0o = 6;
                oooOOO.f21557OooO0OO.close();
            }
        }

        public final void OooO0OO() {
            o000OO o000oo2 = o000OO.this;
            o000oOoO.OooO0OO(o000oo2.f43528OooO0O0.f21557OooO0OO);
            o000oo2.f43531OooO0o = 6;
        }

        @Override // p659o0oooO00.o00O00
        public final o00O00O timeout() {
            return this.f43536OooO0Oo;
        }
    }

    public final class OooO0O0 implements o00O000 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o000 f43539OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f43541OooO0o0;

        public OooO0O0() {
            this.f43539OooO0Oo = new o000(o000OO.this.f43532OooO0o0.timeout());
        }

        @Override // p659o0oooO00.o00O000, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() throws IOException {
            if (this.f43541OooO0o0) {
                return;
            }
            this.f43541OooO0o0 = true;
            o000OO.this.f43532OooO0o0.OooOooo("0\r\n\r\n");
            o000OO.OooO00o(o000OO.this, this.f43539OooO0Oo);
            o000OO.this.f43531OooO0o = 3;
        }

        @Override // p659o0oooO00.o00O000, java.io.Flushable
        public final synchronized void flush() throws IOException {
            if (this.f43541OooO0o0) {
                return;
            }
            o000OO.this.f43532OooO0o0.flush();
        }

        @Override // p659o0oooO00.o00O000
        public final o00O00O timeout() {
            return this.f43539OooO0Oo;
        }

        @Override // p659o0oooO00.o00O000
        public final void write(o00000O o00000o, long j) throws IOException {
            if (this.f43541OooO0o0) {
                throw new IllegalStateException("closed");
            }
            if (j == 0) {
                return;
            }
            o000OO o000oo2 = o000OO.this;
            o000oo2.f43532OooO0o0.o00000O0(j);
            o00 o00Var = o000oo2.f43532OooO0o0;
            o00Var.OooOooo("\r\n");
            o00Var.write(o00000o, j);
            o00Var.OooOooo("\r\n");
        }
    }

    public class OooO0OO extends OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final o0000OO0 f43542OooO;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public long f43543OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f43544OooO0oo;

        public OooO0OO(o0000OO0 o0000oo1) throws IOException {
            super();
            this.f43543OooO0oO = -1L;
            this.f43544OooO0oo = true;
            this.f43542OooO = o0000oo1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            boolean zOooO0oo;
            if (this.f43538OooO0o0) {
                return;
            }
            if (this.f43544OooO0oo) {
                try {
                    zOooO0oo = o000oOoO.OooO0oo(this, 100, TimeUnit.MILLISECONDS);
                } catch (IOException unused) {
                    zOooO0oo = false;
                }
                if (!zOooO0oo) {
                    OooO0OO();
                }
            }
            this.f43538OooO0o0 = true;
        }

        @Override // p659o0oooO00.o00O00
        public final long o0000OO0(o00000O o00000o, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException(androidx.compose.ui.input.key.OooO00o.OooO00o("byteCount < 0: ", j));
            }
            if (this.f43538OooO0o0) {
                throw new IllegalStateException("closed");
            }
            if (!this.f43544OooO0oo) {
                return -1L;
            }
            long j2 = this.f43543OooO0oO;
            o000OO o000oo2 = o000OO.this;
            if (j2 == 0 || j2 == -1) {
                if (j2 != -1) {
                    o000oo2.f43530OooO0Oo.OoooO0();
                }
                try {
                    this.f43543OooO0oO = o000oo2.f43530OooO0Oo.o0000Oo0();
                    String strTrim = o000oo2.f43530OooO0Oo.OoooO0().trim();
                    if (this.f43543OooO0oO < 0 || !(strTrim.isEmpty() || strTrim.startsWith(";"))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f43543OooO0oO + strTrim + "\"");
                    }
                    if (this.f43543OooO0oO == 0) {
                        this.f43544OooO0oo = false;
                        com.squareup.okhttp.o000oOoO.OooO00o oooO00o = new com.squareup.okhttp.o000oOoO.OooO00o();
                        while (true) {
                            String strOoooO0 = o000oo2.f43530OooO0Oo.OoooO0();
                            if (strOoooO0.length() == 0) {
                                break;
                            }
                            OooOO0O.f43304OooO0O0.getClass();
                            oooO00o.OooO0O0(strOoooO0);
                        }
                        com.squareup.okhttp.o000oOoO o000oooo2 = new com.squareup.okhttp.o000oOoO(oooO00o);
                        o0000OO0 o0000oo1 = this.f43542OooO;
                        CookieHandler cookieHandler = o0000oo1.f43490OooO00o.f21604OooOO0o;
                        if (cookieHandler != null) {
                            o00Ooo o00ooo2 = o0000oo1.f43499OooOO0O;
                            o00ooo2.getClass();
                            try {
                                URI uriOooOO0 = o00ooo2.f21625OooO0o0;
                                if (uriOooOO0 == null) {
                                    uriOooOO0 = o00ooo2.f21620OooO00o.OooOO0();
                                    o00ooo2.f21625OooO0o0 = uriOooOO0;
                                }
                                cookieHandler.put(uriOooOO0, o000Oo0.OooO0Oo(o000oooo2));
                            } catch (IllegalStateException e) {
                                throw new IOException(e.getMessage());
                            }
                        }
                        OooO00o(true);
                    }
                    if (!this.f43544OooO0oo) {
                        return -1L;
                    }
                } catch (NumberFormatException e2) {
                    throw new ProtocolException(e2.getMessage());
                }
            }
            long jO0000OO0 = o000oo2.f43530OooO0Oo.o0000OO0(o00000o, Math.min(j, this.f43543OooO0oO));
            if (jO0000OO0 != -1) {
                this.f43543OooO0oO -= jO0000OO0;
                return jO0000OO0;
            }
            OooO0OO();
            throw new ProtocolException("unexpected end of stream");
        }
    }

    public final class OooO0o implements o00O000 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o000 f43546OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public long f43547OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f43548OooO0o0;

        public OooO0o(long j) {
            this.f43546OooO0Oo = new o000(o000OO.this.f43532OooO0o0.timeout());
            this.f43547OooO0o = j;
        }

        @Override // p659o0oooO00.o00O000, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f43548OooO0o0) {
                return;
            }
            this.f43548OooO0o0 = true;
            if (this.f43547OooO0o > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            o000 o000Var = this.f43546OooO0Oo;
            o000OO o000oo2 = o000OO.this;
            o000OO.OooO00o(o000oo2, o000Var);
            o000oo2.f43531OooO0o = 3;
        }

        @Override // p659o0oooO00.o00O000, java.io.Flushable
        public final void flush() throws IOException {
            if (this.f43548OooO0o0) {
                return;
            }
            o000OO.this.f43532OooO0o0.flush();
        }

        @Override // p659o0oooO00.o00O000
        public final o00O00O timeout() {
            return this.f43546OooO0Oo;
        }

        @Override // p659o0oooO00.o00O000
        public final void write(o00000O o00000o, long j) throws IOException {
            if (this.f43548OooO0o0) {
                throw new IllegalStateException("closed");
            }
            long j2 = o00000o.f60177OooO0o0;
            byte[] bArr = o000oOoO.f43328OooO00o;
            if ((j | 0) < 0 || 0 > j2 || j2 - 0 < j) {
                throw new ArrayIndexOutOfBoundsException();
            }
            if (j <= this.f43547OooO0o) {
                o000OO.this.f43532OooO0o0.write(o00000o, j);
                this.f43547OooO0o -= j;
            } else {
                throw new ProtocolException("expected " + this.f43547OooO0o + " bytes but received " + j);
            }
        }
    }

    public class OooOO0 extends OooO00o {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f43550OooO0oO;

        public OooOO0() {
            super();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f43538OooO0o0) {
                return;
            }
            if (!this.f43550OooO0oO) {
                OooO0OO();
            }
            this.f43538OooO0o0 = true;
        }

        @Override // p659o0oooO00.o00O00
        public final long o0000OO0(o00000O o00000o, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException(androidx.compose.ui.input.key.OooO00o.OooO00o("byteCount < 0: ", j));
            }
            if (this.f43538OooO0o0) {
                throw new IllegalStateException("closed");
            }
            if (this.f43550OooO0oO) {
                return -1L;
            }
            long jO0000OO0 = o000OO.this.f43530OooO0Oo.o0000OO0(o00000o, j);
            if (jO0000OO0 != -1) {
                return jO0000OO0;
            }
            this.f43550OooO0oO = true;
            OooO00o(false);
            return -1L;
        }
    }

    public o000OO(OooOOOO oooOOOO, OooOOO oooOOO, Socket socket) throws IOException {
        this.f43527OooO00o = oooOOOO;
        this.f43528OooO0O0 = oooOOO;
        this.f43529OooO0OO = socket;
        this.f43530OooO0Oo = o000O0Oo.OooO0O0(o000O0Oo.OooO0o(socket));
        this.f43532OooO0o0 = o000O0Oo.OooO00o(o000O0Oo.OooO0Oo(socket));
    }

    public static void OooO00o(o000OO o000oo2, o000 o000Var) {
        o000oo2.getClass();
        o00O00O o00o00o2 = o000Var.f60165OooO0o0;
        o00O00O.OooO00o delegate = o00O00O.f60237OooO0Oo;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        o000Var.f60165OooO0o0 = delegate;
        o00o00o2.OooO00o();
        o00o00o2.OooO0O0();
    }

    public final OooO OooO0O0(long j) throws IOException {
        if (this.f43531OooO0o == 4) {
            this.f43531OooO0o = 5;
            return new OooO(j);
        }
        throw new IllegalStateException("state: " + this.f43531OooO0o);
    }

    public final oo000o.OooO00o OooO0OO() throws IOException {
        int i;
        oo000o.OooO00o oooO00o;
        o00O0000 o00o0001 = this.f43530OooO0Oo;
        int i2 = this.f43531OooO0o;
        if (i2 != 1 && i2 != 3) {
            throw new IllegalStateException("state: " + this.f43531OooO0o);
        }
        do {
            try {
                o000OO0O o000oo0oOooO00o = o000OO0O.OooO00o(o00o0001.OoooO0());
                i = o000oo0oOooO00o.f43553OooO0O0;
                Protocol protocol = o000oo0oOooO00o.f43552OooO00o;
                oooO00o = new oo000o.OooO00o();
                oooO00o.f21663OooO0O0 = protocol;
                oooO00o.f21664OooO0OO = i;
                oooO00o.f21665OooO0Oo = o000oo0oOooO00o.f43554OooO0OO;
                com.squareup.okhttp.o000oOoO.OooO00o oooO00o2 = new com.squareup.okhttp.o000oOoO.OooO00o();
                while (true) {
                    String strOoooO0 = o00o0001.OoooO0();
                    if (strOoooO0.length() == 0) {
                        break;
                    }
                    OooOO0O.f43304OooO0O0.getClass();
                    oooO00o2.OooO0O0(strOoooO0);
                }
                oooO00o2.OooO00o(o000Oo0.f43558OooO0Oo, protocol.toString());
                ArrayList arrayList = oooO00o2.f21592OooO00o;
                String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                com.squareup.okhttp.o000oOoO.OooO00o oooO00o3 = new com.squareup.okhttp.o000oOoO.OooO00o();
                Collections.addAll(oooO00o3.f21592OooO00o, strArr);
                oooO00o.f21666OooO0o = oooO00o3;
            } catch (EOFException e) {
                StringBuilder sb = new StringBuilder("unexpected end of stream on ");
                OooOOO oooOOO = this.f43528OooO0O0;
                sb.append(oooOOO);
                sb.append(" (recycle count=");
                OooOO0O.f43304OooO0O0.getClass();
                IOException iOException = new IOException(p022Oooo00O.OooOO0.OooO0O0(sb, oooOOO.f21563OooOO0, ")"));
                iOException.initCause(e);
                throw iOException;
            }
        } while (i == 100);
        this.f43531OooO0o = 4;
        return oooO00o;
    }

    public final void OooO0Oo(int i, int i2) {
        if (i != 0) {
            this.f43530OooO0Oo.timeout().OooO0oO(i, TimeUnit.MILLISECONDS);
        }
        if (i2 != 0) {
            this.f43532OooO0o0.timeout().OooO0oO(i2, TimeUnit.MILLISECONDS);
        }
    }

    public final void OooO0o0(com.squareup.okhttp.o000oOoO o000oooo2, String str) throws IOException {
        if (this.f43531OooO0o != 0) {
            throw new IllegalStateException("state: " + this.f43531OooO0o);
        }
        o00 o00Var = this.f43532OooO0o0;
        o00Var.OooOooo(str);
        o00Var.OooOooo("\r\n");
        int length = o000oooo2.f21591OooO00o.length / 2;
        for (int i = 0; i < length; i++) {
            o00Var.OooOooo(o000oooo2.OooO0O0(i));
            o00Var.OooOooo(": ");
            o00Var.OooOooo(o000oooo2.OooO0Oo(i));
            o00Var.OooOooo("\r\n");
        }
        o00Var.OooOooo("\r\n");
        this.f43531OooO0o = 1;
    }
}
