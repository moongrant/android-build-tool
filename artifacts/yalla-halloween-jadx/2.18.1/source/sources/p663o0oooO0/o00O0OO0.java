package p663o0oooO0;

import java.io.IOException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketException;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o00OOOO0;
import p660o0ooo0o0.o0o0Oo;
import p660o0ooo0o0.oo0o0O0;
import p666o0oooO0o.oO0OOO00;
import p672o0oooOoO.fk;
import p674o0oooo0.o0;
import p674o0oooo0.o0O00000;
import p674o0oooo0.o0O00O;
import p674o0oooo0.o0O00OO;
import p674o0oooo0.o0O00o00;
import p674o0oooo0.o0O0O0O;
import p674o0oooo0.o0oOO;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f51749OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00OO00O f51750OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o00O0OO f51751OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final oo0o0O0 f51752OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final oO0OOO00 f51753OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final oo0o0O0 f51754OooO0o0;

    public final class OooO00o extends o0 {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final long f51755Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public boolean f51756Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public long f51757Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public boolean f51758Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o00O0OO0 f51759OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(@NotNull o00O0OO0 o00o0oo1, o0O00o00 delegate, long j) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f51759OoooO00 = o00o0oo1;
            this.f51755Oooo = j;
        }

        public final <E extends IOException> E OooO00o(E e) {
            if (this.f51756Oooo0o) {
                return e;
            }
            this.f51756Oooo0o = true;
            return (E) this.f51759OoooO00.OooO00o(this.f51757Oooo0oO, false, true, e);
        }

        @Override // p674o0oooo0.o0, p674o0oooo0.o0O00o00, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f51758Oooo0oo) {
                return;
            }
            this.f51758Oooo0oo = true;
            long j = this.f51755Oooo;
            if (j != -1 && this.f51757Oooo0oO != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                OooO00o(null);
            } catch (IOException e) {
                throw OooO00o(e);
            }
        }

        @Override // p674o0oooo0.o0, p674o0oooo0.o0O00o00, java.io.Flushable
        public final void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                throw OooO00o(e);
            }
        }

        @Override // p674o0oooo0.o0, p674o0oooo0.o0O00o00
        public final void write(@NotNull o0oOO source, long j) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (!(!this.f51758Oooo0oo)) {
                throw new IllegalStateException("closed".toString());
            }
            long j2 = this.f51755Oooo;
            if (j2 == -1 || this.f51757Oooo0oO + j <= j2) {
                try {
                    super.write(source, j);
                    this.f51757Oooo0oO += j;
                    return;
                } catch (IOException e) {
                    throw OooO00o(e);
                }
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("expected ");
            sbOooO0o0.append(this.f51755Oooo);
            sbOooO0o0.append(" bytes but received ");
            sbOooO0o0.append(this.f51757Oooo0oO + j);
            throw new ProtocolException(sbOooO0o0.toString());
        }
    }

    public final class OooO0O0 extends o0O00000 {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public boolean f51760Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public long f51761Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public boolean f51762Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final long f51763OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public boolean f51764OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ o00O0OO0 f51765OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(@NotNull o00O0OO0 o00o0oo1, o0O0O0O delegate, long j) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f51765OoooO0O = o00o0oo1;
            this.f51763OoooO0 = j;
            this.f51762Oooo0oo = true;
            if (j == 0) {
                OooO00o(null);
            }
        }

        public final <E extends IOException> E OooO00o(E e) {
            if (this.f51760Oooo) {
                return e;
            }
            this.f51760Oooo = true;
            if (e == null && this.f51762Oooo0oo) {
                this.f51762Oooo0oo = false;
                o00O0OO0 o00o0oo1 = this.f51765OoooO0O;
                o00o0oo1.f51752OooO0Oo.responseBodyStart(o00o0oo1.f51751OooO0OO);
            }
            return (E) this.f51765OoooO0O.OooO00o(this.f51761Oooo0oO, true, false, e);
        }

        @Override // p674o0oooo0.o0O00000, p674o0oooo0.o0O0O0O
        public final long Oooo0O0(@NotNull o0oOO sink, long j) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (!(!this.f51764OoooO00)) {
                throw new IllegalStateException("closed".toString());
            }
            try {
                long jOooo0O0 = this.f52047Oooo0o.Oooo0O0(sink, j);
                if (this.f51762Oooo0oo) {
                    this.f51762Oooo0oo = false;
                    o00O0OO0 o00o0oo1 = this.f51765OoooO0O;
                    o00o0oo1.f51752OooO0Oo.responseBodyStart(o00o0oo1.f51751OooO0OO);
                }
                if (jOooo0O0 == -1) {
                    OooO00o(null);
                    return -1L;
                }
                long j2 = this.f51761Oooo0oO + jOooo0O0;
                long j3 = this.f51763OoooO0;
                if (j3 != -1 && j2 > j3) {
                    throw new ProtocolException("expected " + this.f51763OoooO0 + " bytes but received " + j2);
                }
                this.f51761Oooo0oO = j2;
                if (j2 == j3) {
                    OooO00o(null);
                }
                return jOooo0O0;
            } catch (IOException e) {
                throw OooO00o(e);
            }
        }

        @Override // p674o0oooo0.o0O00000, p674o0oooo0.o0O0O0O, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f51764OoooO00) {
                return;
            }
            this.f51764OoooO00 = true;
            try {
                super.close();
                OooO00o(null);
            } catch (IOException e) {
                throw OooO00o(e);
            }
        }
    }

    public o00O0OO0(@NotNull o00O0OO call, @NotNull oo0o0O0 eventListener, @NotNull oo0o0O0 finder, @NotNull oO0OOO00 codec) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.f51751OooO0OO = call;
        this.f51752OooO0Oo = eventListener;
        this.f51754OooO0o0 = finder;
        this.f51753OooO0o = codec;
        this.f51750OooO0O0 = codec.OooO0O0();
    }

    public final <E extends IOException> E OooO00o(long j, boolean z, boolean z2, E e) {
        if (e != null) {
            OooO0o(e);
        }
        if (z2) {
            if (e != null) {
                this.f51752OooO0Oo.requestFailed(this.f51751OooO0OO, e);
            } else {
                this.f51752OooO0Oo.requestBodyEnd(this.f51751OooO0OO, j);
            }
        }
        if (z) {
            if (e != null) {
                this.f51752OooO0Oo.responseFailed(this.f51751OooO0OO, e);
            } else {
                this.f51752OooO0Oo.responseBodyEnd(this.f51751OooO0OO, j);
            }
        }
        return (E) this.f51751OooO0OO.OooO(this, z2, z, e);
    }

    @NotNull
    public final o0O00o00 OooO0O0(@NotNull o00OOO00 request, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f51749OooO00o = z;
        o0o0Oo o0o0oo = request.f51429OooO0o0;
        Intrinsics.checkNotNull(o0o0oo);
        long jContentLength = o0o0oo.contentLength();
        this.f51752OooO0Oo.requestBodyStart(this.f51751OooO0OO);
        return new OooO00o(this, this.f51753OooO0o.OooO0o0(request, jContentLength), jContentLength);
    }

    @NotNull
    public final fk.OooO0OO OooO0OO() throws SocketException {
        this.f51751OooO0OO.OooOO0o();
        o00OO00O o00oo00oOooO0O0 = this.f51753OooO0o.OooO0O0();
        Objects.requireNonNull(o00oo00oOooO0O0);
        Intrinsics.checkNotNullParameter(this, "exchange");
        Socket socket = o00oo00oOooO0O0.f51781OooO0OO;
        Intrinsics.checkNotNull(socket);
        o0O00OO o0o00oo2 = o00oo00oOooO0O0.f51785OooO0oO;
        Intrinsics.checkNotNull(o0o00oo2);
        o0O00O o0o00o2 = o00oo00oOooO0O0.f51786OooO0oo;
        Intrinsics.checkNotNull(o0o00o2);
        socket.setSoTimeout(0);
        o00oo00oOooO0O0.OooOOO0();
        return new o00OO000(this, o0o00oo2, o0o00o2, o0o00oo2, o0o00o2);
    }

    @Nullable
    public final o00OOOO0.OooO00o OooO0Oo(boolean z) throws IOException {
        try {
            o00OOOO0.OooO00o oooO00oOooO0OO = this.f51753OooO0o.OooO0OO(z);
            if (oooO00oOooO0OO != null) {
                Intrinsics.checkNotNullParameter(this, "deferredTrailers");
                oooO00oOooO0OO.f51463OooOOO0 = this;
            }
            return oooO00oOooO0OO;
        } catch (IOException e) {
            this.f51752OooO0Oo.responseFailed(this.f51751OooO0OO, e);
            OooO0o(e);
            throw e;
        }
    }

    public final void OooO0o(IOException iOException) {
        this.f51754OooO0o0.OooO0OO(iOException);
        o00OO00O o00oo00oOooO0O0 = this.f51753OooO0o.OooO0O0();
        o00O0OO call = this.f51751OooO0OO;
        synchronized (o00oo00oOooO0O0) {
            Intrinsics.checkNotNullParameter(call, "call");
            if (iOException instanceof StreamResetException) {
                if (((StreamResetException) iOException).f53034Oooo0o == ErrorCode.REFUSED_STREAM) {
                    int i = o00oo00oOooO0O0.f51791OooOOO0 + 1;
                    o00oo00oOooO0O0.f51791OooOOO0 = i;
                    if (i > 1) {
                        o00oo00oOooO0O0.f51779OooO = true;
                        o00oo00oOooO0O0.f51788OooOO0O++;
                    }
                } else if (((StreamResetException) iOException).f53034Oooo0o != ErrorCode.CANCEL || !call.f51737OoooOo0) {
                    o00oo00oOooO0O0.f51779OooO = true;
                    o00oo00oOooO0O0.f51788OooOO0O++;
                }
            } else if (!o00oo00oOooO0O0.OooOO0O() || (iOException instanceof ConnectionShutdownException)) {
                o00oo00oOooO0O0.f51779OooO = true;
                if (o00oo00oOooO0O0.f51789OooOO0o == 0) {
                    o00oo00oOooO0O0.OooO0o0(call.f51740Ooooo00, o00oo00oOooO0O0.f51794OooOOo0, iOException);
                    o00oo00oOooO0O0.f51788OooOO0O++;
                }
            }
        }
    }

    public final void OooO0o0() {
        this.f51752OooO0Oo.responseHeadersStart(this.f51751OooO0OO);
    }
}
