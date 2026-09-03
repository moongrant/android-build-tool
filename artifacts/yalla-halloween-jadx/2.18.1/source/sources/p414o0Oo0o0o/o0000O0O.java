package p414o0Oo0o0o;

import com.squareup.okhttp.internal.framed.ErrorCode;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.Objects;
import p674o0oooo0.o0O00o00;
import p674o0oooo0.o0O0O0O;
import p674o0oooo0.o0o0Oo;
import p674o0oooo0.o0oO0O0o;
import p674o0oooo0.o0oOO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O0O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f39485OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f39486OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00000O0 f39487OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public List<o000OO> f39488OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List<o000OO> f39489OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO0O0 f39490OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooO00o f39491OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public long f39484OooO00o = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooO0OO f39483OooO = new OooO0OO();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooO0OO f39492OooOO0 = new OooO0OO();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public ErrorCode f39493OooOO0O = null;

    public final class OooO00o implements o0O00o00 {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final o0oOO f39495Oooo0o = new o0oOO();

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public boolean f39496Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public boolean f39497Oooo0oo;

        public OooO00o() {
        }

        public final void OooO00o(boolean z) throws IOException {
            o0000O0O o0000o0o2;
            long jMin;
            o0000O0O o0000o0o3;
            synchronized (o0000O0O.this) {
                o0000O0O.this.f39492OooOO0.OooO();
                while (true) {
                    try {
                        o0000o0o2 = o0000O0O.this;
                        if (o0000o0o2.f39485OooO0O0 > 0 || this.f39497Oooo0oo || this.f39496Oooo0oO || o0000o0o2.f39493OooOO0O != null) {
                            break;
                        }
                        Objects.requireNonNull(o0000o0o2);
                        try {
                            o0000o0o2.wait();
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        o0000O0O.this.f39492OooOO0.OooOOO0();
                        throw th;
                    }
                }
                o0000o0o2.f39492OooOO0.OooOOO0();
                o0000O0O.OooO0O0(o0000O0O.this);
                jMin = Math.min(o0000O0O.this.f39485OooO0O0, this.f39495Oooo0o.f52099Oooo0oO);
                o0000o0o3 = o0000O0O.this;
                o0000o0o3.f39485OooO0O0 -= jMin;
            }
            o0000o0o3.f39492OooOO0.OooO();
            try {
                o0000O0O o0000o0o4 = o0000O0O.this;
                o0000o0o4.f39487OooO0Oo.OooOOo(o0000o0o4.f39486OooO0OO, z && jMin == this.f39495Oooo0o.f52099Oooo0oO, this.f39495Oooo0o, jMin);
            } finally {
                o0000O0O.this.f39492OooOO0.OooOOO0();
            }
        }

        @Override // p674o0oooo0.o0O00o00, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            synchronized (o0000O0O.this) {
                if (this.f39496Oooo0oO) {
                    return;
                }
                o0000O0O o0000o0o2 = o0000O0O.this;
                if (!o0000o0o2.f39491OooO0oo.f39497Oooo0oo) {
                    if (this.f39495Oooo0o.f52099Oooo0oO > 0) {
                        while (this.f39495Oooo0o.f52099Oooo0oO > 0) {
                            OooO00o(true);
                        }
                    } else {
                        o0000o0o2.f39487OooO0Oo.OooOOo(o0000o0o2.f39486OooO0OO, true, null, 0L);
                    }
                }
                synchronized (o0000O0O.this) {
                    this.f39496Oooo0oO = true;
                }
                o0000O0O.this.f39487OooO0Oo.f39451OooooOO.flush();
                o0000O0O.OooO00o(o0000O0O.this);
            }
        }

        @Override // p674o0oooo0.o0O00o00, java.io.Flushable
        public final void flush() throws IOException {
            synchronized (o0000O0O.this) {
                o0000O0O.OooO0O0(o0000O0O.this);
            }
            while (this.f39495Oooo0o.f52099Oooo0oO > 0) {
                OooO00o(false);
                o0000O0O.this.f39487OooO0Oo.flush();
            }
        }

        @Override // p674o0oooo0.o0O00o00
        public final o0oO0O0o timeout() {
            return o0000O0O.this.f39492OooOO0;
        }

        @Override // p674o0oooo0.o0O00o00
        public final void write(o0oOO o0ooo2, long j) throws IOException {
            this.f39495Oooo0o.write(o0ooo2, j);
            while (this.f39495Oooo0o.f52099Oooo0oO >= 16384) {
                OooO00o(false);
            }
        }
    }

    public final class OooO0O0 implements o0O0O0O {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public boolean f39498Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final o0oOO f39499Oooo0o = new o0oOO();

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final o0oOO f39500Oooo0oO = new o0oOO();

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final long f39501Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public boolean f39503OoooO00;

        public OooO0O0(long j) {
            this.f39501Oooo0oo = j;
        }

        public final void OooO00o() throws IOException {
            if (this.f39498Oooo) {
                throw new IOException("stream closed");
            }
            if (o0000O0O.this.f39493OooOO0O == null) {
                return;
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("stream was reset: ");
            sbOooO0o0.append(o0000O0O.this.f39493OooOO0O);
            throw new IOException(sbOooO0o0.toString());
        }

        public final void OooO0O0() throws IOException {
            o0000O0O.this.f39483OooO.OooO();
            while (this.f39500Oooo0oO.f52099Oooo0oO == 0 && !this.f39503OoooO00 && !this.f39498Oooo) {
                try {
                    o0000O0O o0000o0o2 = o0000O0O.this;
                    if (o0000o0o2.f39493OooOO0O != null) {
                        break;
                    }
                    Objects.requireNonNull(o0000o0o2);
                    try {
                        o0000o0o2.wait();
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    o0000O0O.this.f39483OooO.OooOOO0();
                    throw th;
                }
            }
            o0000O0O.this.f39483OooO.OooOOO0();
        }

        @Override // p674o0oooo0.o0O0O0O
        public final long Oooo0O0(o0oOO o0ooo2, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException(androidx.viewpager2.adapter.OooO00o.OooO00o("byteCount < 0: ", j));
            }
            synchronized (o0000O0O.this) {
                OooO0O0();
                OooO00o();
                o0oOO o0ooo3 = this.f39500Oooo0oO;
                long j2 = o0ooo3.f52099Oooo0oO;
                if (j2 == 0) {
                    return -1L;
                }
                long jOooo0O0 = o0ooo3.Oooo0O0(o0ooo2, Math.min(j, j2));
                o0000O0O o0000o0o2 = o0000O0O.this;
                long j3 = o0000o0o2.f39484OooO00o + jOooo0O0;
                o0000o0o2.f39484OooO00o = j3;
                if (j3 >= o0000o0o2.f39487OooO0Oo.f39446OoooOoO.OooO0O0() / 2) {
                    o0000O0O o0000o0o3 = o0000O0O.this;
                    o0000o0o3.f39487OooO0Oo.OooOo0O(o0000o0o3.f39486OooO0OO, o0000o0o3.f39484OooO00o);
                    o0000O0O.this.f39484OooO00o = 0L;
                }
                synchronized (o0000O0O.this.f39487OooO0Oo) {
                    o00000O0 o00000o1 = o0000O0O.this.f39487OooO0Oo;
                    long j4 = o00000o1.f39444OoooOOo + jOooo0O0;
                    o00000o1.f39444OoooOOo = j4;
                    if (j4 >= o00000o1.f39446OoooOoO.OooO0O0() / 2) {
                        o00000O0 o00000o2 = o0000O0O.this.f39487OooO0Oo;
                        o00000o2.OooOo0O(0, o00000o2.f39444OoooOOo);
                        o0000O0O.this.f39487OooO0Oo.f39444OoooOOo = 0L;
                    }
                }
                return jOooo0O0;
            }
        }

        @Override // p674o0oooo0.o0O0O0O, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            synchronized (o0000O0O.this) {
                this.f39498Oooo = true;
                this.f39500Oooo0oO.OooO0Oo();
                o0000O0O.this.notifyAll();
            }
            o0000O0O.OooO00o(o0000O0O.this);
        }

        @Override // p674o0oooo0.o0O0O0O
        public final o0oO0O0o timeout() {
            return o0000O0O.this.f39483OooO;
        }
    }

    public class OooO0OO extends o0o0Oo {
        public OooO0OO() {
        }

        @Override // p674o0oooo0.o0o0Oo
        public final IOException OooOO0O(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // p674o0oooo0.o0o0Oo
        public final void OooOO0o() {
            o0000O0O.this.OooO0o0(ErrorCode.CANCEL);
        }

        public final void OooOOO0() throws IOException {
            if (OooOO0()) {
                throw new SocketTimeoutException("timeout");
            }
        }
    }

    public o0000O0O(int i, o00000O0 o00000o1, boolean z, boolean z2, List<o000OO> list) {
        Objects.requireNonNull(o00000o1, "connection == null");
        this.f39486OooO0OO = i;
        this.f39487OooO0Oo = o00000o1;
        this.f39485OooO0O0 = o00000o1.f39447OoooOoo.OooO0O0();
        OooO0O0 oooO0O0 = new OooO0O0(o00000o1.f39446OoooOoO.OooO0O0());
        this.f39490OooO0oO = oooO0O0;
        OooO00o oooO00o = new OooO00o();
        this.f39491OooO0oo = oooO00o;
        oooO0O0.f39503OoooO00 = z2;
        oooO00o.f39497Oooo0oo = z;
        this.f39489OooO0o0 = list;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0017  */
    public static void OooO00o(o0000O0O o0000o0o2) throws IOException {
        boolean z;
        boolean zOooO0oO;
        synchronized (o0000o0o2) {
            OooO0O0 oooO0O0 = o0000o0o2.f39490OooO0oO;
            if (oooO0O0.f39503OoooO00 || !oooO0O0.f39498Oooo) {
                z = false;
            } else {
                OooO00o oooO00o = o0000o0o2.f39491OooO0oo;
                if (oooO00o.f39497Oooo0oo || oooO00o.f39496Oooo0oO) {
                    z = true;
                } else {
                    z = false;
                }
            }
            zOooO0oO = o0000o0o2.OooO0oO();
        }
        if (z) {
            o0000o0o2.OooO0OO(ErrorCode.CANCEL);
        } else {
            if (zOooO0oO) {
                return;
            }
            o0000o0o2.f39487OooO0Oo.OooO0o(o0000o0o2.f39486OooO0OO);
        }
    }

    public static void OooO0O0(o0000O0O o0000o0o2) throws IOException {
        OooO00o oooO00o = o0000o0o2.f39491OooO0oo;
        if (oooO00o.f39496Oooo0oO) {
            throw new IOException("stream closed");
        }
        if (oooO00o.f39497Oooo0oo) {
            throw new IOException("stream finished");
        }
        if (o0000o0o2.f39493OooOO0O == null) {
            return;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("stream was reset: ");
        sbOooO0o0.append(o0000o0o2.f39493OooOO0O);
        throw new IOException(sbOooO0o0.toString());
    }

    public final void OooO0OO(ErrorCode errorCode) throws IOException {
        if (OooO0Oo(errorCode)) {
            o00000O0 o00000o1 = this.f39487OooO0Oo;
            o00000o1.f39451OooooOO.o00Ooo(this.f39486OooO0OO, errorCode);
        }
    }

    public final boolean OooO0Oo(ErrorCode errorCode) {
        synchronized (this) {
            if (this.f39493OooOO0O != null) {
                return false;
            }
            if (this.f39490OooO0oO.f39503OoooO00 && this.f39491OooO0oo.f39497Oooo0oo) {
                return false;
            }
            this.f39493OooOO0O = errorCode;
            notifyAll();
            this.f39487OooO0Oo.OooO0o(this.f39486OooO0OO);
            return true;
        }
    }

    public final o0O00o00 OooO0o() {
        synchronized (this) {
            if (this.f39488OooO0o == null) {
                boolean z = true;
                if (this.f39487OooO0Oo.f39436Oooo0oO != ((this.f39486OooO0OO & 1) == 1)) {
                    z = false;
                }
                if (!z) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.f39491OooO0oo;
    }

    public final void OooO0o0(ErrorCode errorCode) {
        if (OooO0Oo(errorCode)) {
            this.f39487OooO0Oo.OooOOoo(this.f39486OooO0OO, errorCode);
        }
    }

    public final synchronized boolean OooO0oO() {
        if (this.f39493OooOO0O != null) {
            return false;
        }
        OooO0O0 oooO0O0 = this.f39490OooO0oO;
        if (oooO0O0.f39503OoooO00 || oooO0O0.f39498Oooo) {
            OooO00o oooO00o = this.f39491OooO0oo;
            if ((oooO00o.f39497Oooo0oo || oooO00o.f39496Oooo0oO) && this.f39488OooO0o != null) {
                return false;
            }
        }
        return true;
    }

    public final void OooO0oo() {
        boolean zOooO0oO;
        synchronized (this) {
            this.f39490OooO0oO.f39503OoooO00 = true;
            zOooO0oO = OooO0oO();
            notifyAll();
        }
        if (zOooO0oO) {
            return;
        }
        this.f39487OooO0Oo.OooO0o(this.f39486OooO0OO);
    }
}
