package o0OO;

import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.o00Oo0;
import com.squareup.okhttp.o00Ooo;
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
import p340o0OO0ooO.o000OOo;
import p340o0OO0ooO.oo000o;
import p662o0oooO0O.o0OO;
import p662o0oooO0O.o0OO00OO;
import p662o0oooO0O.o0OOo000;
import p662o0oooO0O.o0o0000;
import p662o0oooO0O.oO00000;
import p662o0oooO0O.oO00000o;
import p662o0oooO0O.oo0OOoo;
import p662o0oooO0O.ooo0Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final com.squareup.okhttp.OooOOOO f42149OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final com.squareup.okhttp.OooOOO f42150OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Socket f42151OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0o0000 f42152OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0OOo000 f42154OooO0o0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f42153OooO0o = 0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f42155OooO0oO = 0;

    /* JADX INFO: renamed from: o0OO.OooO$OooO, reason: collision with other inner class name */
    public class C0444OooO extends OooO00o {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public long f42156OooO0oO;

        public C0444OooO(long j) throws IOException {
            super();
            this.f42156OooO0oO = j;
            if (j == 0) {
                OooO00o(true);
            }
        }

        @Override // p662o0oooO0O.oO00000
        public final long OooOO0O(oo0OOoo oo0oooo, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException(androidx.compose.ui.input.key.OooO00o.OooO00o("byteCount < 0: ", j));
            }
            if (this.f42160OooO0o0) {
                throw new IllegalStateException("closed");
            }
            long j2 = this.f42156OooO0oO;
            if (j2 == 0) {
                return -1L;
            }
            long jOooOO0O = OooO.this.f42152OooO0Oo.OooOO0O(oo0oooo, Math.min(j2, j));
            if (jOooOO0O == -1) {
                OooO0OO();
                throw new ProtocolException("unexpected end of stream");
            }
            long j3 = this.f42156OooO0oO - jOooOO0O;
            this.f42156OooO0oO = j3;
            if (j3 == 0) {
                OooO00o(true);
            }
            return jOooOO0O;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            boolean zOooO0oo;
            if (this.f42160OooO0o0) {
                return;
            }
            if (this.f42156OooO0oO != 0) {
                try {
                    zOooO0oo = o000OOo.OooO0oo(this, 100, TimeUnit.MILLISECONDS);
                } catch (IOException unused) {
                    zOooO0oo = false;
                }
                if (!zOooO0oo) {
                    OooO0OO();
                }
            }
            this.f42160OooO0o0 = true;
        }
    }

    public abstract class OooO00o implements oO00000 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o0OO00OO f42158OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f42160OooO0o0;

        public OooO00o() {
            this.f42158OooO0Oo = new o0OO00OO(OooO.this.f42152OooO0Oo.timeout());
        }

        public final void OooO00o(boolean z) throws IOException {
            OooO oooO = OooO.this;
            if (oooO.f42153OooO0o != 5) {
                throw new IllegalStateException("state: " + oooO.f42153OooO0o);
            }
            OooO.OooO00o(oooO, this.f42158OooO0Oo);
            oooO.f42153OooO0o = 0;
            com.squareup.okhttp.OooOOO oooOOO = oooO.f42150OooO0O0;
            if (z && oooO.f42155OooO0oO == 1) {
                oooO.f42155OooO0oO = 0;
                oo000o.f42599OooO0O0.OooO0O0(oooO.f42149OooO00o, oooOOO);
            } else if (oooO.f42155OooO0oO == 2) {
                oooO.f42153OooO0o = 6;
                oooOOO.f21084OooO0OO.close();
            }
        }

        public final void OooO0OO() {
            OooO oooO = OooO.this;
            o000OOo.OooO0OO(oooO.f42150OooO0O0.f21084OooO0OO);
            oooO.f42153OooO0o = 6;
        }

        @Override // p662o0oooO0O.oO00000
        public final oO00000o timeout() {
            return this.f42158OooO0Oo;
        }
    }

    public final class OooO0O0 implements ooo0Oo0 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o0OO00OO f42161OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f42163OooO0o0;

        public OooO0O0() {
            this.f42161OooO0Oo = new o0OO00OO(OooO.this.f42154OooO0o0.timeout());
        }

        @Override // p662o0oooO0O.ooo0Oo0, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() throws IOException {
            if (this.f42163OooO0o0) {
                return;
            }
            this.f42163OooO0o0 = true;
            OooO.this.f42154OooO0o0.Oooo000("0\r\n\r\n");
            OooO.OooO00o(OooO.this, this.f42161OooO0Oo);
            OooO.this.f42153OooO0o = 3;
        }

        @Override // p662o0oooO0O.ooo0Oo0, java.io.Flushable
        public final synchronized void flush() throws IOException {
            if (this.f42163OooO0o0) {
                return;
            }
            OooO.this.f42154OooO0o0.flush();
        }

        @Override // p662o0oooO0O.ooo0Oo0
        public final oO00000o timeout() {
            return this.f42161OooO0Oo;
        }

        @Override // p662o0oooO0O.ooo0Oo0
        public final void write(oo0OOoo oo0oooo, long j) throws IOException {
            if (this.f42163OooO0o0) {
                throw new IllegalStateException("closed");
            }
            if (j == 0) {
                return;
            }
            OooO oooO = OooO.this;
            oooO.f42154OooO0o0.o00000O(j);
            o0OOo000 o0ooo001 = oooO.f42154OooO0o0;
            o0ooo001.Oooo000("\r\n");
            o0ooo001.write(oo0oooo, j);
            o0ooo001.Oooo000("\r\n");
        }
    }

    public class OooO0OO extends OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final OooOO0O f42164OooO;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public long f42165OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f42166OooO0oo;

        public OooO0OO(OooOO0O oooOO0O) throws IOException {
            super();
            this.f42165OooO0oO = -1L;
            this.f42166OooO0oo = true;
            this.f42164OooO = oooOO0O;
        }

        @Override // p662o0oooO0O.oO00000
        public final long OooOO0O(oo0OOoo oo0oooo, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException(androidx.compose.ui.input.key.OooO00o.OooO00o("byteCount < 0: ", j));
            }
            if (this.f42160OooO0o0) {
                throw new IllegalStateException("closed");
            }
            if (!this.f42166OooO0oo) {
                return -1L;
            }
            long j2 = this.f42165OooO0oO;
            OooO oooO = OooO.this;
            if (j2 == 0 || j2 == -1) {
                if (j2 != -1) {
                    oooO.f42152OooO0Oo.OoooO0O();
                }
                try {
                    this.f42165OooO0oO = oooO.f42152OooO0Oo.o0000Oo0();
                    String strTrim = oooO.f42152OooO0Oo.OoooO0O().trim();
                    if (this.f42165OooO0oO < 0 || !(strTrim.isEmpty() || strTrim.startsWith(";"))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f42165OooO0oO + strTrim + "\"");
                    }
                    if (this.f42165OooO0oO == 0) {
                        this.f42166OooO0oo = false;
                        com.squareup.okhttp.Oooo0.OooO00o oooO00o = new com.squareup.okhttp.Oooo0.OooO00o();
                        while (true) {
                            String strOoooO0O = oooO.f42152OooO0Oo.OoooO0O();
                            if (strOoooO0O.length() == 0) {
                                break;
                            }
                            oo000o.f42599OooO0O0.getClass();
                            oooO00o.OooO0O0(strOoooO0O);
                        }
                        com.squareup.okhttp.Oooo0 oooo0 = new com.squareup.okhttp.Oooo0(oooO00o);
                        OooOO0O oooOO0O = this.f42164OooO;
                        CookieHandler cookieHandler = oooOO0O.f42188OooO00o.f21148OooOO0o;
                        if (cookieHandler != null) {
                            o00Oo0 o00oo1 = oooOO0O.f42197OooOO0O;
                            o00oo1.getClass();
                            try {
                                URI uriOooOO0 = o00oo1.f21169OooO0o0;
                                if (uriOooOO0 == null) {
                                    uriOooOO0 = o00oo1.f21164OooO00o.OooOO0();
                                    o00oo1.f21169OooO0o0 = uriOooOO0;
                                }
                                cookieHandler.put(uriOooOO0, OooOOOO.OooO0Oo(oooo0));
                            } catch (IllegalStateException e) {
                                throw new IOException(e.getMessage());
                            }
                        }
                        OooO00o(true);
                    }
                    if (!this.f42166OooO0oo) {
                        return -1L;
                    }
                } catch (NumberFormatException e2) {
                    throw new ProtocolException(e2.getMessage());
                }
            }
            long jOooOO0O = oooO.f42152OooO0Oo.OooOO0O(oo0oooo, Math.min(j, this.f42165OooO0oO));
            if (jOooOO0O != -1) {
                this.f42165OooO0oO -= jOooOO0O;
                return jOooOO0O;
            }
            OooO0OO();
            throw new ProtocolException("unexpected end of stream");
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            boolean zOooO0oo;
            if (this.f42160OooO0o0) {
                return;
            }
            if (this.f42166OooO0oo) {
                try {
                    zOooO0oo = o000OOo.OooO0oo(this, 100, TimeUnit.MILLISECONDS);
                } catch (IOException unused) {
                    zOooO0oo = false;
                }
                if (!zOooO0oo) {
                    OooO0OO();
                }
            }
            this.f42160OooO0o0 = true;
        }
    }

    public final class OooO0o implements ooo0Oo0 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o0OO00OO f42168OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public long f42169OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f42170OooO0o0;

        public OooO0o(long j) {
            this.f42168OooO0Oo = new o0OO00OO(OooO.this.f42154OooO0o0.timeout());
            this.f42169OooO0o = j;
        }

        @Override // p662o0oooO0O.ooo0Oo0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f42170OooO0o0) {
                return;
            }
            this.f42170OooO0o0 = true;
            if (this.f42169OooO0o > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            o0OO00OO o0oo00oo2 = this.f42168OooO0Oo;
            OooO oooO = OooO.this;
            OooO.OooO00o(oooO, o0oo00oo2);
            oooO.f42153OooO0o = 3;
        }

        @Override // p662o0oooO0O.ooo0Oo0, java.io.Flushable
        public final void flush() throws IOException {
            if (this.f42170OooO0o0) {
                return;
            }
            OooO.this.f42154OooO0o0.flush();
        }

        @Override // p662o0oooO0O.ooo0Oo0
        public final oO00000o timeout() {
            return this.f42168OooO0Oo;
        }

        @Override // p662o0oooO0O.ooo0Oo0
        public final void write(oo0OOoo oo0oooo, long j) throws IOException {
            if (this.f42170OooO0o0) {
                throw new IllegalStateException("closed");
            }
            long j2 = oo0oooo.f59828OooO0o0;
            byte[] bArr = o000OOo.f42529OooO00o;
            if ((j | 0) < 0 || 0 > j2 || j2 - 0 < j) {
                throw new ArrayIndexOutOfBoundsException();
            }
            if (j <= this.f42169OooO0o) {
                OooO.this.f42154OooO0o0.write(oo0oooo, j);
                this.f42169OooO0o -= j;
            } else {
                throw new ProtocolException("expected " + this.f42169OooO0o + " bytes but received " + j);
            }
        }
    }

    public class OooOO0 extends OooO00o {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f42172OooO0oO;

        public OooOO0() {
            super();
        }

        @Override // p662o0oooO0O.oO00000
        public final long OooOO0O(oo0OOoo oo0oooo, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException(androidx.compose.ui.input.key.OooO00o.OooO00o("byteCount < 0: ", j));
            }
            if (this.f42160OooO0o0) {
                throw new IllegalStateException("closed");
            }
            if (this.f42172OooO0oO) {
                return -1L;
            }
            long jOooOO0O = OooO.this.f42152OooO0Oo.OooOO0O(oo0oooo, j);
            if (jOooOO0O != -1) {
                return jOooOO0O;
            }
            this.f42172OooO0oO = true;
            OooO00o(false);
            return -1L;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f42160OooO0o0) {
                return;
            }
            if (!this.f42172OooO0oO) {
                OooO0OO();
            }
            this.f42160OooO0o0 = true;
        }
    }

    public OooO(com.squareup.okhttp.OooOOOO oooOOOO, com.squareup.okhttp.OooOOO oooOOO, Socket socket) throws IOException {
        this.f42149OooO00o = oooOOOO;
        this.f42150OooO0O0 = oooOOO;
        this.f42151OooO0OO = socket;
        this.f42152OooO0Oo = o0OO.OooO0O0(o0OO.OooO0o(socket));
        this.f42154OooO0o0 = o0OO.OooO00o(o0OO.OooO0Oo(socket));
    }

    public static void OooO00o(OooO oooO, o0OO00OO o0oo00oo2) {
        oooO.getClass();
        oO00000o oo00000o = o0oo00oo2.f59773OooO0o0;
        oO00000o.OooO00o delegate = oO00000o.f59811OooO0Oo;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        o0oo00oo2.f59773OooO0o0 = delegate;
        oo00000o.OooO00o();
        oo00000o.OooO0O0();
    }

    public final C0444OooO OooO0O0(long j) throws IOException {
        if (this.f42153OooO0o == 4) {
            this.f42153OooO0o = 5;
            return new C0444OooO(j);
        }
        throw new IllegalStateException("state: " + this.f42153OooO0o);
    }

    public final o00Ooo.OooO00o OooO0OO() throws IOException {
        int i;
        o00Ooo.OooO00o oooO00o;
        o0o0000 o0o0000Var = this.f42152OooO0Oo;
        int i2 = this.f42153OooO0o;
        if (i2 != 1 && i2 != 3) {
            throw new IllegalStateException("state: " + this.f42153OooO0o);
        }
        do {
            try {
                o000oOoO o000ooooOooO00o = o000oOoO.OooO00o(o0o0000Var.OoooO0O());
                i = o000ooooOooO00o.f42232OooO0O0;
                Protocol protocol = o000ooooOooO00o.f42231OooO00o;
                oooO00o = new o00Ooo.OooO00o();
                oooO00o.f21187OooO0O0 = protocol;
                oooO00o.f21188OooO0OO = i;
                oooO00o.f21189OooO0Oo = o000ooooOooO00o.f42233OooO0OO;
                com.squareup.okhttp.Oooo0.OooO00o oooO00o2 = new com.squareup.okhttp.Oooo0.OooO00o();
                while (true) {
                    String strOoooO0O = o0o0000Var.OoooO0O();
                    if (strOoooO0O.length() == 0) {
                        break;
                    }
                    oo000o.f42599OooO0O0.getClass();
                    oooO00o2.OooO0O0(strOoooO0O);
                }
                oooO00o2.OooO00o(OooOOOO.f42215OooO0Oo, protocol.toString());
                ArrayList arrayList = oooO00o2.f21114OooO00o;
                String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                com.squareup.okhttp.Oooo0.OooO00o oooO00o3 = new com.squareup.okhttp.Oooo0.OooO00o();
                Collections.addAll(oooO00o3.f21114OooO00o, strArr);
                oooO00o.f21190OooO0o = oooO00o3;
            } catch (EOFException e) {
                StringBuilder sb = new StringBuilder("unexpected end of stream on ");
                com.squareup.okhttp.OooOOO oooOOO = this.f42150OooO0O0;
                sb.append(oooOOO);
                sb.append(" (recycle count=");
                oo000o.f42599OooO0O0.getClass();
                IOException iOException = new IOException(p022Oooo00O.OooOO0.OooO00o(sb, oooOOO.f21090OooOO0, ")"));
                iOException.initCause(e);
                throw iOException;
            }
        } while (i == 100);
        this.f42153OooO0o = 4;
        return oooO00o;
    }

    public final void OooO0Oo(int i, int i2) {
        if (i != 0) {
            this.f42152OooO0Oo.timeout().OooO0oO(i, TimeUnit.MILLISECONDS);
        }
        if (i2 != 0) {
            this.f42154OooO0o0.timeout().OooO0oO(i2, TimeUnit.MILLISECONDS);
        }
    }

    public final void OooO0o0(com.squareup.okhttp.Oooo0 oooo0, String str) throws IOException {
        if (this.f42153OooO0o != 0) {
            throw new IllegalStateException("state: " + this.f42153OooO0o);
        }
        o0OOo000 o0ooo001 = this.f42154OooO0o0;
        o0ooo001.Oooo000(str);
        o0ooo001.Oooo000("\r\n");
        int length = oooo0.f21113OooO00o.length / 2;
        for (int i = 0; i < length; i++) {
            o0ooo001.Oooo000(oooo0.OooO0O0(i));
            o0ooo001.Oooo000(": ");
            o0ooo001.Oooo000(oooo0.OooO0Oo(i));
            o0ooo001.Oooo000("\r\n");
        }
        o0ooo001.Oooo000("\r\n");
        this.f42153OooO0o = 1;
    }
}
