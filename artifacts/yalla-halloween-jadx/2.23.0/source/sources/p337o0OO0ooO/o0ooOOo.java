package p337o0OO0ooO;

import com.squareup.okhttp.internal.framed.ErrorCode;
import com.squareup.okhttp.internal.framed.HeadersMode;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import p659o0oooO00.o000000;
import p659o0oooO00.o00000O;
import p659o0oooO00.o00O00;
import p659o0oooO00.o00O000;
import p659o0oooO00.o00O00O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f43445OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f43446OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Oooo0 f43447OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public List<o0OOO0o> f43448OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List<o0OOO0o> f43449OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO0O0 f43450OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooO00o f43451OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public long f43444OooO00o = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooO0OO f43443OooO = new OooO0OO();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooO0OO f43452OooOO0 = new OooO0OO();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public ErrorCode f43453OooOO0O = null;

    public final class OooO00o implements o00O000 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o00000O f43454OooO0Oo = new o00000O();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f43455OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f43456OooO0o0;

        public OooO00o() {
        }

        public final void OooO00o(boolean z) throws IOException {
            o0ooOOo o0ooooo;
            long jMin;
            o0ooOOo o0ooooo2;
            synchronized (o0ooOOo.this) {
                o0ooOOo.this.f43452OooOO0.OooO();
                while (true) {
                    try {
                        o0ooooo = o0ooOOo.this;
                        if (o0ooooo.f43445OooO0O0 > 0 || this.f43455OooO0o || this.f43456OooO0o0 || o0ooooo.f43453OooOO0O != null) {
                            break;
                        }
                        try {
                            o0ooooo.wait();
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        o0ooOOo.this.f43452OooOO0.OooOOO0();
                        throw th;
                    }
                }
                o0ooooo.f43452OooOO0.OooOOO0();
                o0ooOOo.OooO0O0(o0ooOOo.this);
                jMin = Math.min(o0ooOOo.this.f43445OooO0O0, this.f43454OooO0Oo.f60177OooO0o0);
                o0ooooo2 = o0ooOOo.this;
                o0ooooo2.f43445OooO0O0 -= jMin;
            }
            o0ooooo2.f43452OooOO0.OooO();
            try {
                o0ooOOo o0ooooo3 = o0ooOOo.this;
                o0ooooo3.f43447OooO0Oo.OooOo00(o0ooooo3.f43446OooO0OO, z && jMin == this.f43454OooO0Oo.f60177OooO0o0, this.f43454OooO0Oo, jMin);
            } finally {
                o0ooOOo.this.f43452OooOO0.OooOOO0();
            }
        }

        @Override // p659o0oooO00.o00O000, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            synchronized (o0ooOOo.this) {
                if (this.f43456OooO0o0) {
                    return;
                }
                o0ooOOo o0ooooo = o0ooOOo.this;
                if (!o0ooooo.f43451OooO0oo.f43455OooO0o) {
                    if (this.f43454OooO0Oo.f60177OooO0o0 > 0) {
                        while (this.f43454OooO0Oo.f60177OooO0o0 > 0) {
                            OooO00o(true);
                        }
                    } else {
                        o0ooooo.f43447OooO0Oo.OooOo00(o0ooooo.f43446OooO0OO, true, null, 0L);
                    }
                }
                synchronized (o0ooOOo.this) {
                    this.f43456OooO0o0 = true;
                }
                o0ooOOo.this.f43447OooO0Oo.flush();
                o0ooOOo.OooO00o(o0ooOOo.this);
            }
        }

        @Override // p659o0oooO00.o00O000, java.io.Flushable
        public final void flush() throws IOException {
            synchronized (o0ooOOo.this) {
                o0ooOOo.OooO0O0(o0ooOOo.this);
            }
            while (this.f43454OooO0Oo.f60177OooO0o0 > 0) {
                OooO00o(false);
                o0ooOOo.this.f43447OooO0Oo.flush();
            }
        }

        @Override // p659o0oooO00.o00O000
        public final o00O00O timeout() {
            return o0ooOOo.this.f43452OooOO0;
        }

        @Override // p659o0oooO00.o00O000
        public final void write(o00000O o00000o, long j) throws IOException {
            o00000O o00000o2 = this.f43454OooO0Oo;
            o00000o2.write(o00000o, j);
            while (o00000o2.f60177OooO0o0 >= 16384) {
                OooO00o(false);
            }
        }
    }

    public final class OooO0O0 implements o00O00 {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final long f43460OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f43462OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f43463OooO0oo;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o00000O f43459OooO0Oo = new o00000O();

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final o00000O f43461OooO0o0 = new o00000O();

        public OooO0O0(long j) {
            this.f43460OooO0o = j;
        }

        public final void OooO00o() throws IOException {
            if (this.f43462OooO0oO) {
                throw new IOException("stream closed");
            }
            o0ooOOo o0ooooo = o0ooOOo.this;
            if (o0ooooo.f43453OooOO0O == null) {
                return;
            }
            throw new IOException("stream was reset: " + o0ooooo.f43453OooOO0O);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            synchronized (o0ooOOo.this) {
                this.f43462OooO0oO = true;
                this.f43461OooO0o0.OooO0oO();
                o0ooOOo.this.notifyAll();
            }
            o0ooOOo.OooO00o(o0ooOOo.this);
        }

        @Override // p659o0oooO00.o00O00
        public final long o0000OO0(o00000O o00000o, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException(androidx.compose.ui.input.key.OooO00o.OooO00o("byteCount < 0: ", j));
            }
            synchronized (o0ooOOo.this) {
                o0ooOOo o0ooooo = o0ooOOo.this;
                o0ooooo.f43443OooO.OooO();
                while (this.f43461OooO0o0.f60177OooO0o0 == 0 && !this.f43463OooO0oo && !this.f43462OooO0oO && o0ooooo.f43453OooOO0O == null) {
                    try {
                        try {
                            o0ooooo.wait();
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        o0ooooo.f43443OooO.OooOOO0();
                        throw th;
                    }
                }
                o0ooooo.f43443OooO.OooOOO0();
                OooO00o();
                o00000O o00000o2 = this.f43461OooO0o0;
                long j2 = o00000o2.f60177OooO0o0;
                if (j2 == 0) {
                    return -1L;
                }
                long jO0000OO0 = o00000o2.o0000OO0(o00000o, Math.min(j, j2));
                o0ooOOo o0ooooo2 = o0ooOOo.this;
                long j3 = o0ooooo2.f43444OooO00o + jO0000OO0;
                o0ooooo2.f43444OooO00o = j3;
                if (j3 >= o0ooooo2.f43447OooO0Oo.f43346OooOOo0.OooO0O0() / 2) {
                    o0ooOOo o0ooooo3 = o0ooOOo.this;
                    o0ooooo3.f43447OooO0Oo.OooOo(o0ooooo3.f43446OooO0OO, o0ooooo3.f43444OooO00o);
                    o0ooOOo.this.f43444OooO00o = 0L;
                }
                synchronized (o0ooOOo.this.f43447OooO0Oo) {
                    Oooo0 oooo0 = o0ooOOo.this.f43447OooO0Oo;
                    long j4 = oooo0.f43343OooOOOO + jO0000OO0;
                    oooo0.f43343OooOOOO = j4;
                    if (j4 >= oooo0.f43346OooOOo0.OooO0O0() / 2) {
                        Oooo0 oooo1 = o0ooOOo.this.f43447OooO0Oo;
                        oooo1.OooOo(0, oooo1.f43343OooOOOO);
                        o0ooOOo.this.f43447OooO0Oo.f43343OooOOOO = 0L;
                    }
                }
                return jO0000OO0;
            }
        }

        @Override // p659o0oooO00.o00O00
        public final o00O00O timeout() {
            return o0ooOOo.this.f43443OooO;
        }
    }

    public class OooO0OO extends o000000 {
        public OooO0OO() {
        }

        @Override // p659o0oooO00.o000000
        public final IOException OooOO0O(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // p659o0oooO00.o000000
        public final void OooOO0o() {
            o0ooOOo.this.OooO0o0(ErrorCode.CANCEL);
        }

        public final void OooOOO0() throws IOException {
            if (OooOO0()) {
                throw OooOO0O(null);
            }
        }
    }

    public o0ooOOo(int i, Oooo0 oooo0, boolean z, boolean z2, ArrayList arrayList) {
        if (oooo0 == null) {
            throw new NullPointerException("connection == null");
        }
        this.f43446OooO0OO = i;
        this.f43447OooO0Oo = oooo0;
        this.f43445OooO0O0 = oooo0.f43345OooOOo.OooO0O0();
        OooO0O0 oooO0O0 = new OooO0O0(oooo0.f43346OooOOo0.OooO0O0());
        this.f43450OooO0oO = oooO0O0;
        OooO00o oooO00o = new OooO00o();
        this.f43451OooO0oo = oooO00o;
        oooO0O0.f43463OooO0oo = z2;
        oooO00o.f43455OooO0o = z;
        this.f43449OooO0o0 = arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0017  */
    public static void OooO00o(o0ooOOo o0ooooo) throws IOException {
        boolean z;
        boolean zOooO0oO;
        synchronized (o0ooooo) {
            OooO0O0 oooO0O0 = o0ooooo.f43450OooO0oO;
            if (oooO0O0.f43463OooO0oo || !oooO0O0.f43462OooO0oO) {
                z = false;
            } else {
                OooO00o oooO00o = o0ooooo.f43451OooO0oo;
                if (oooO00o.f43455OooO0o || oooO00o.f43456OooO0o0) {
                    z = true;
                } else {
                    z = false;
                }
            }
            zOooO0oO = o0ooooo.OooO0oO();
        }
        if (z) {
            o0ooooo.OooO0OO(ErrorCode.CANCEL);
        } else {
            if (zOooO0oO) {
                return;
            }
            o0ooooo.f43447OooO0Oo.OooO0oO(o0ooooo.f43446OooO0OO);
        }
    }

    public static void OooO0O0(o0ooOOo o0ooooo) throws IOException {
        OooO00o oooO00o = o0ooooo.f43451OooO0oo;
        if (oooO00o.f43456OooO0o0) {
            throw new IOException("stream closed");
        }
        if (oooO00o.f43455OooO0o) {
            throw new IOException("stream finished");
        }
        if (o0ooooo.f43453OooOO0O == null) {
            return;
        }
        throw new IOException("stream was reset: " + o0ooooo.f43453OooOO0O);
    }

    public final void OooO(ArrayList arrayList, HeadersMode headersMode) {
        boolean zOooO0oO;
        ErrorCode errorCode;
        synchronized (this) {
            zOooO0oO = true;
            errorCode = null;
            if (this.f43448OooO0o == null) {
                headersMode.getClass();
                if (headersMode == HeadersMode.SPDY_HEADERS) {
                    errorCode = ErrorCode.PROTOCOL_ERROR;
                } else {
                    this.f43448OooO0o = arrayList;
                    zOooO0oO = OooO0oO();
                    notifyAll();
                }
            } else {
                headersMode.getClass();
                if (headersMode == HeadersMode.SPDY_REPLY) {
                    errorCode = ErrorCode.STREAM_IN_USE;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(this.f43448OooO0o);
                    arrayList2.addAll(arrayList);
                    this.f43448OooO0o = arrayList2;
                }
            }
        }
        if (errorCode != null) {
            OooO0o0(errorCode);
        } else {
            if (zOooO0oO) {
                return;
            }
            this.f43447OooO0Oo.OooO0oO(this.f43446OooO0OO);
        }
    }

    public final void OooO0OO(ErrorCode errorCode) throws IOException {
        if (OooO0Oo(errorCode)) {
            this.f43447OooO0Oo.f43350OooOo0O.Oooo0oO(this.f43446OooO0OO, errorCode);
        }
    }

    public final boolean OooO0Oo(ErrorCode errorCode) {
        synchronized (this) {
            if (this.f43453OooOO0O != null) {
                return false;
            }
            if (this.f43450OooO0oO.f43463OooO0oo && this.f43451OooO0oo.f43455OooO0o) {
                return false;
            }
            this.f43453OooOO0O = errorCode;
            notifyAll();
            this.f43447OooO0Oo.OooO0oO(this.f43446OooO0OO);
            return true;
        }
    }

    public final OooO00o OooO0o() {
        synchronized (this) {
            try {
                if (this.f43448OooO0o == null) {
                    boolean z = true;
                    if (this.f43447OooO0Oo.f43335OooO0o0 != ((this.f43446OooO0OO & 1) == 1)) {
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
        return this.f43451OooO0oo;
    }

    public final void OooO0o0(ErrorCode errorCode) {
        if (OooO0Oo(errorCode)) {
            this.f43447OooO0Oo.OooOo0(this.f43446OooO0OO, errorCode);
        }
    }

    public final synchronized boolean OooO0oO() {
        if (this.f43453OooOO0O != null) {
            return false;
        }
        OooO0O0 oooO0O0 = this.f43450OooO0oO;
        if (oooO0O0.f43463OooO0oo || oooO0O0.f43462OooO0oO) {
            OooO00o oooO00o = this.f43451OooO0oo;
            if ((oooO00o.f43455OooO0o || oooO00o.f43456OooO0o0) && this.f43448OooO0o != null) {
                return false;
            }
        }
        return true;
    }

    public final void OooO0oo() {
        boolean zOooO0oO;
        synchronized (this) {
            this.f43450OooO0oO.f43463OooO0oo = true;
            zOooO0oO = OooO0oO();
            notifyAll();
        }
        if (zOooO0oO) {
            return;
        }
        this.f43447OooO0Oo.OooO0oO(this.f43446OooO0OO);
    }

    public final synchronized void OooOO0(ErrorCode errorCode) {
        if (this.f43453OooOO0O == null) {
            this.f43453OooOO0O = errorCode;
            notifyAll();
        }
    }
}
