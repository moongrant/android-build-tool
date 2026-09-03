package p341o0OO0ooo;

import com.squareup.okhttp.internal.framed.ErrorCode;
import com.squareup.okhttp.internal.framed.HeadersMode;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import p662o0oooO0O.o0O0O0o0;
import p662o0oooO0O.oO00000;
import p662o0oooO0O.oO00000o;
import p662o0oooO0O.oo0OOoo;
import p662o0oooO0O.ooo0Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f42669OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f42670OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00000 f42671OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public List<o0000O0O> f42672OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List<o0000O0O> f42673OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO0O0 f42674OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooO00o f42675OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public long f42668OooO00o = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooO0OO f42667OooO = new OooO0OO();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooO0OO f42676OooOO0 = new OooO0OO();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public ErrorCode f42677OooOO0O = null;

    public final class OooO00o implements ooo0Oo0 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final oo0OOoo f42678OooO0Oo = new oo0OOoo();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f42679OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f42680OooO0o0;

        public OooO00o() {
        }

        public final void OooO00o(boolean z) throws IOException {
            o0000O0 o0000o1;
            long jMin;
            o0000O0 o0000o2;
            synchronized (o0000O0.this) {
                o0000O0.this.f42676OooOO0.OooO();
                while (true) {
                    try {
                        o0000o1 = o0000O0.this;
                        if (o0000o1.f42669OooO0O0 > 0 || this.f42679OooO0o || this.f42680OooO0o0 || o0000o1.f42677OooOO0O != null) {
                            break;
                        }
                        try {
                            o0000o1.wait();
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        o0000O0.this.f42676OooOO0.OooOOO0();
                        throw th;
                    }
                }
                o0000o1.f42676OooOO0.OooOOO0();
                o0000O0.OooO0O0(o0000O0.this);
                jMin = Math.min(o0000O0.this.f42669OooO0O0, this.f42678OooO0Oo.f59828OooO0o0);
                o0000o2 = o0000O0.this;
                o0000o2.f42669OooO0O0 -= jMin;
            }
            o0000o2.f42676OooOO0.OooO();
            try {
                o0000O0 o0000o3 = o0000O0.this;
                o0000o3.f42671OooO0Oo.OooOo0(o0000o3.f42670OooO0OO, z && jMin == this.f42678OooO0Oo.f59828OooO0o0, this.f42678OooO0Oo, jMin);
            } finally {
                o0000O0.this.f42676OooOO0.OooOOO0();
            }
        }

        @Override // p662o0oooO0O.ooo0Oo0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            synchronized (o0000O0.this) {
                if (this.f42680OooO0o0) {
                    return;
                }
                o0000O0 o0000o1 = o0000O0.this;
                if (!o0000o1.f42675OooO0oo.f42679OooO0o) {
                    if (this.f42678OooO0Oo.f59828OooO0o0 > 0) {
                        while (this.f42678OooO0Oo.f59828OooO0o0 > 0) {
                            OooO00o(true);
                        }
                    } else {
                        o0000o1.f42671OooO0Oo.OooOo0(o0000o1.f42670OooO0OO, true, null, 0L);
                    }
                }
                synchronized (o0000O0.this) {
                    this.f42680OooO0o0 = true;
                }
                o0000O0.this.f42671OooO0Oo.flush();
                o0000O0.OooO00o(o0000O0.this);
            }
        }

        @Override // p662o0oooO0O.ooo0Oo0, java.io.Flushable
        public final void flush() throws IOException {
            synchronized (o0000O0.this) {
                o0000O0.OooO0O0(o0000O0.this);
            }
            while (this.f42678OooO0Oo.f59828OooO0o0 > 0) {
                OooO00o(false);
                o0000O0.this.f42671OooO0Oo.flush();
            }
        }

        @Override // p662o0oooO0O.ooo0Oo0
        public final oO00000o timeout() {
            return o0000O0.this.f42676OooOO0;
        }

        @Override // p662o0oooO0O.ooo0Oo0
        public final void write(oo0OOoo oo0oooo, long j) throws IOException {
            oo0OOoo oo0oooo2 = this.f42678OooO0Oo;
            oo0oooo2.write(oo0oooo, j);
            while (oo0oooo2.f59828OooO0o0 >= 16384) {
                OooO00o(false);
            }
        }
    }

    public final class OooO0O0 implements oO00000 {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final long f42684OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f42686OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f42687OooO0oo;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final oo0OOoo f42683OooO0Oo = new oo0OOoo();

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final oo0OOoo f42685OooO0o0 = new oo0OOoo();

        public OooO0O0(long j) {
            this.f42684OooO0o = j;
        }

        public final void OooO00o() throws IOException {
            if (this.f42686OooO0oO) {
                throw new IOException("stream closed");
            }
            o0000O0 o0000o1 = o0000O0.this;
            if (o0000o1.f42677OooOO0O == null) {
                return;
            }
            throw new IOException("stream was reset: " + o0000o1.f42677OooOO0O);
        }

        @Override // p662o0oooO0O.oO00000
        public final long OooOO0O(oo0OOoo oo0oooo, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException(androidx.compose.ui.input.key.OooO00o.OooO00o("byteCount < 0: ", j));
            }
            synchronized (o0000O0.this) {
                o0000O0 o0000o1 = o0000O0.this;
                o0000o1.f42667OooO.OooO();
                while (this.f42685OooO0o0.f59828OooO0o0 == 0 && !this.f42687OooO0oo && !this.f42686OooO0oO && o0000o1.f42677OooOO0O == null) {
                    try {
                        try {
                            o0000o1.wait();
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        o0000o1.f42667OooO.OooOOO0();
                        throw th;
                    }
                }
                o0000o1.f42667OooO.OooOOO0();
                OooO00o();
                oo0OOoo oo0oooo2 = this.f42685OooO0o0;
                long j2 = oo0oooo2.f59828OooO0o0;
                if (j2 == 0) {
                    return -1L;
                }
                long jOooOO0O = oo0oooo2.OooOO0O(oo0oooo, Math.min(j, j2));
                o0000O0 o0000o2 = o0000O0.this;
                long j3 = o0000o2.f42668OooO00o + jOooOO0O;
                o0000o2.f42668OooO00o = j3;
                if (j3 >= o0000o2.f42671OooO0Oo.f42619OooOOo0.OooO0O0() / 2) {
                    o0000O0 o0000o3 = o0000O0.this;
                    o0000o3.f42671OooO0Oo.OooOooo(o0000o3.f42670OooO0OO, o0000o3.f42668OooO00o);
                    o0000O0.this.f42668OooO00o = 0L;
                }
                synchronized (o0000O0.this.f42671OooO0Oo) {
                    o00000 o00000Var = o0000O0.this.f42671OooO0Oo;
                    long j4 = o00000Var.f42616OooOOOO + jOooOO0O;
                    o00000Var.f42616OooOOOO = j4;
                    if (j4 >= o00000Var.f42619OooOOo0.OooO0O0() / 2) {
                        o00000 o00000Var2 = o0000O0.this.f42671OooO0Oo;
                        o00000Var2.OooOooo(0, o00000Var2.f42616OooOOOO);
                        o0000O0.this.f42671OooO0Oo.f42616OooOOOO = 0L;
                    }
                }
                return jOooOO0O;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            synchronized (o0000O0.this) {
                this.f42686OooO0oO = true;
                this.f42685OooO0o0.OooO0oO();
                o0000O0.this.notifyAll();
            }
            o0000O0.OooO00o(o0000O0.this);
        }

        @Override // p662o0oooO0O.oO00000
        public final oO00000o timeout() {
            return o0000O0.this.f42667OooO;
        }
    }

    public class OooO0OO extends o0O0O0o0 {
        public OooO0OO() {
        }

        @Override // p662o0oooO0O.o0O0O0o0
        public final IOException OooOO0O(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // p662o0oooO0O.o0O0O0o0
        public final void OooOO0o() {
            o0000O0.this.OooO0o0(ErrorCode.CANCEL);
        }

        public final void OooOOO0() throws IOException {
            if (OooOO0()) {
                throw OooOO0O(null);
            }
        }
    }

    public o0000O0(int i, o00000 o00000Var, boolean z, boolean z2, ArrayList arrayList) {
        if (o00000Var == null) {
            throw new NullPointerException("connection == null");
        }
        this.f42670OooO0OO = i;
        this.f42671OooO0Oo = o00000Var;
        this.f42669OooO0O0 = o00000Var.f42618OooOOo.OooO0O0();
        OooO0O0 oooO0O0 = new OooO0O0(o00000Var.f42619OooOOo0.OooO0O0());
        this.f42674OooO0oO = oooO0O0;
        OooO00o oooO00o = new OooO00o();
        this.f42675OooO0oo = oooO00o;
        oooO0O0.f42687OooO0oo = z2;
        oooO00o.f42679OooO0o = z;
        this.f42673OooO0o0 = arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0017  */
    public static void OooO00o(o0000O0 o0000o1) throws IOException {
        boolean z;
        boolean zOooO0oO;
        synchronized (o0000o1) {
            OooO0O0 oooO0O0 = o0000o1.f42674OooO0oO;
            if (oooO0O0.f42687OooO0oo || !oooO0O0.f42686OooO0oO) {
                z = false;
            } else {
                OooO00o oooO00o = o0000o1.f42675OooO0oo;
                if (oooO00o.f42679OooO0o || oooO00o.f42680OooO0o0) {
                    z = true;
                } else {
                    z = false;
                }
            }
            zOooO0oO = o0000o1.OooO0oO();
        }
        if (z) {
            o0000o1.OooO0OO(ErrorCode.CANCEL);
        } else {
            if (zOooO0oO) {
                return;
            }
            o0000o1.f42671OooO0Oo.OooO0oO(o0000o1.f42670OooO0OO);
        }
    }

    public static void OooO0O0(o0000O0 o0000o1) throws IOException {
        OooO00o oooO00o = o0000o1.f42675OooO0oo;
        if (oooO00o.f42680OooO0o0) {
            throw new IOException("stream closed");
        }
        if (oooO00o.f42679OooO0o) {
            throw new IOException("stream finished");
        }
        if (o0000o1.f42677OooOO0O == null) {
            return;
        }
        throw new IOException("stream was reset: " + o0000o1.f42677OooOO0O);
    }

    public final void OooO(ArrayList arrayList, HeadersMode headersMode) {
        boolean zOooO0oO;
        ErrorCode errorCode;
        synchronized (this) {
            zOooO0oO = true;
            errorCode = null;
            if (this.f42672OooO0o == null) {
                headersMode.getClass();
                if (headersMode == HeadersMode.SPDY_HEADERS) {
                    errorCode = ErrorCode.PROTOCOL_ERROR;
                } else {
                    this.f42672OooO0o = arrayList;
                    zOooO0oO = OooO0oO();
                    notifyAll();
                }
            } else {
                headersMode.getClass();
                if (headersMode == HeadersMode.SPDY_REPLY) {
                    errorCode = ErrorCode.STREAM_IN_USE;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(this.f42672OooO0o);
                    arrayList2.addAll(arrayList);
                    this.f42672OooO0o = arrayList2;
                }
            }
        }
        if (errorCode != null) {
            OooO0o0(errorCode);
        } else {
            if (zOooO0oO) {
                return;
            }
            this.f42671OooO0Oo.OooO0oO(this.f42670OooO0OO);
        }
    }

    public final void OooO0OO(ErrorCode errorCode) throws IOException {
        if (OooO0Oo(errorCode)) {
            this.f42671OooO0Oo.f42623OooOo0O.Oooo0oo(this.f42670OooO0OO, errorCode);
        }
    }

    public final boolean OooO0Oo(ErrorCode errorCode) {
        synchronized (this) {
            if (this.f42677OooOO0O != null) {
                return false;
            }
            if (this.f42674OooO0oO.f42687OooO0oo && this.f42675OooO0oo.f42679OooO0o) {
                return false;
            }
            this.f42677OooOO0O = errorCode;
            notifyAll();
            this.f42671OooO0Oo.OooO0oO(this.f42670OooO0OO);
            return true;
        }
    }

    public final OooO00o OooO0o() {
        synchronized (this) {
            try {
                if (this.f42672OooO0o == null) {
                    boolean z = true;
                    if (this.f42671OooO0Oo.f42608OooO0o0 != ((this.f42670OooO0OO & 1) == 1)) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException("reply before requesting the sink");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f42675OooO0oo;
    }

    public final void OooO0o0(ErrorCode errorCode) {
        if (OooO0Oo(errorCode)) {
            this.f42671OooO0Oo.OooOo(this.f42670OooO0OO, errorCode);
        }
    }

    public final synchronized boolean OooO0oO() {
        if (this.f42677OooOO0O != null) {
            return false;
        }
        OooO0O0 oooO0O0 = this.f42674OooO0oO;
        if (oooO0O0.f42687OooO0oo || oooO0O0.f42686OooO0oO) {
            OooO00o oooO00o = this.f42675OooO0oo;
            if ((oooO00o.f42679OooO0o || oooO00o.f42680OooO0o0) && this.f42672OooO0o != null) {
                return false;
            }
        }
        return true;
    }

    public final void OooO0oo() {
        boolean zOooO0oO;
        synchronized (this) {
            this.f42674OooO0oO.f42687OooO0oo = true;
            zOooO0oO = OooO0oO();
            notifyAll();
        }
        if (zOooO0oO) {
            return;
        }
        this.f42671OooO0Oo.OooO0oO(this.f42670OooO0OO);
    }

    public final synchronized void OooOO0(ErrorCode errorCode) {
        if (this.f42677OooOO0O == null) {
            this.f42677OooOO0O = errorCode;
            notifyAll();
        }
    }
}
