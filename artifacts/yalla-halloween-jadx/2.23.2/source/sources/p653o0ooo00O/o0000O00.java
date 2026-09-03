package p653o0ooo00O;

import java.io.IOException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p641o0ooOO0o.o0;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0oO0Ooo;
import p654o0ooo00o.o000O0Oo;
import p662o0oooO0O.o0OOo000;
import p662o0oooO0O.o0o0000;
import p662o0oooO0O.oO00000;
import p662o0oooO0O.oo0OOoo;
import p662o0oooO0O.oo0oO0;
import p662o0oooO0O.oo0ooO;
import p662o0oooO0O.ooo0Oo0;

/* JADX INFO: loaded from: classes5.dex */
public final class o0000O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0000O0 f59327OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0 f59328OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o0000oo f59329OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f59330OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o0000O0O f59331OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f59332OooO0o0;

    public final class OooO00o extends oo0oO0 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final long f59333OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public long f59334OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f59335OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f59336OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ o0000O00 f59337OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(@NotNull o0000O00 this$0, ooo0Oo0 delegate, long j) {
            super(delegate);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f59337OooO0oo = this$0;
            this.f59333OooO0Oo = j;
        }

        public final <E extends IOException> E OooO00o(E e) {
            if (this.f59335OooO0o0) {
                return e;
            }
            this.f59335OooO0o0 = true;
            return (E) this.f59337OooO0oo.OooO00o(this.f59334OooO0o, false, true, e);
        }

        @Override // p662o0oooO0O.oo0oO0, p662o0oooO0O.ooo0Oo0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f59336OooO0oO) {
                return;
            }
            this.f59336OooO0oO = true;
            long j = this.f59333OooO0Oo;
            if (j != -1 && this.f59334OooO0o != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                OooO00o(null);
            } catch (IOException e) {
                throw OooO00o(e);
            }
        }

        @Override // p662o0oooO0O.oo0oO0, p662o0oooO0O.ooo0Oo0, java.io.Flushable
        public final void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                throw OooO00o(e);
            }
        }

        @Override // p662o0oooO0O.oo0oO0, p662o0oooO0O.ooo0Oo0
        public final void write(@NotNull oo0OOoo source, long j) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (!(!this.f59336OooO0oO)) {
                throw new IllegalStateException("closed".toString());
            }
            long j2 = this.f59333OooO0Oo;
            if (j2 == -1 || this.f59334OooO0o + j <= j2) {
                try {
                    super.write(source, j);
                    this.f59334OooO0o += j;
                    return;
                } catch (IOException e) {
                    throw OooO00o(e);
                }
            }
            throw new ProtocolException("expected " + j2 + " bytes but received " + (this.f59334OooO0o + j));
        }
    }

    public final class OooO0O0 extends oo0ooO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f59338OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public long f59339OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final long f59340OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f59341OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f59342OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ o0000O00 f59343OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(@NotNull o0000O00 this$0, oO00000 delegate, long j) {
            super(delegate);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f59343OooOO0 = this$0;
            this.f59340OooO0o0 = j;
            this.f59341OooO0oO = true;
            if (j == 0) {
                OooO00o(null);
            }
        }

        public final <E extends IOException> E OooO00o(E e) {
            if (this.f59342OooO0oo) {
                return e;
            }
            this.f59342OooO0oo = true;
            if (e == null && this.f59341OooO0oO) {
                this.f59341OooO0oO = false;
                o0000O00 o0000o00 = this.f59343OooOO0;
                o0000o00.f59328OooO0O0.responseBodyStart(o0000o00.f59327OooO00o);
            }
            return (E) this.f59343OooOO0.OooO00o(this.f59339OooO0o, true, false, e);
        }

        @Override // p662o0oooO0O.oo0ooO, p662o0oooO0O.oO00000
        public final long OooOO0O(@NotNull oo0OOoo sink, long j) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (!(!this.f59338OooO)) {
                throw new IllegalStateException("closed".toString());
            }
            try {
                long jOooOO0O = this.f59837OooO0Oo.OooOO0O(sink, j);
                if (this.f59341OooO0oO) {
                    this.f59341OooO0oO = false;
                    o0000O00 o0000o00 = this.f59343OooOO0;
                    o0000o00.f59328OooO0O0.responseBodyStart(o0000o00.f59327OooO00o);
                }
                if (jOooOO0O == -1) {
                    OooO00o(null);
                    return -1L;
                }
                long j2 = this.f59339OooO0o + jOooOO0O;
                long j3 = this.f59340OooO0o0;
                if (j3 == -1 || j2 <= j3) {
                    this.f59339OooO0o = j2;
                    if (j2 == j3) {
                        OooO00o(null);
                    }
                    return jOooOO0O;
                }
                throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
            } catch (IOException e) {
                throw OooO00o(e);
            }
        }

        @Override // p662o0oooO0O.oo0ooO, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f59338OooO) {
                return;
            }
            this.f59338OooO = true;
            try {
                super.close();
                OooO00o(null);
            } catch (IOException e) {
                throw OooO00o(e);
            }
        }
    }

    public o0000O00(@NotNull o0000O0 call, @NotNull o0 eventListener, @NotNull o0000oo finder, @NotNull o000O0Oo codec) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.f59327OooO00o = call;
        this.f59328OooO0O0 = eventListener;
        this.f59329OooO0OO = finder;
        this.f59330OooO0Oo = codec;
        this.f59331OooO0o = codec.getConnection();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final <E extends IOException> E OooO00o(long j, boolean z, boolean z2, E e) {
        if (e != null) {
            OooO0o0(e);
        }
        o0 o0Var = this.f59328OooO0O0;
        o0000O0 o0000o1 = this.f59327OooO00o;
        if (z2) {
            if (e != null) {
                o0Var.requestFailed(o0000o1, e);
            } else {
                o0Var.requestBodyEnd(o0000o1, j);
            }
        }
        if (z) {
            if (e != null) {
                o0Var.responseFailed(o0000o1, e);
            } else {
                o0Var.responseBodyEnd(o0000o1, j);
            }
        }
        return (E) o0000o1.OooO0oo(this, z2, z, e);
    }

    @NotNull
    public final OooO00o OooO0O0(boolean z, @NotNull o0O00O0o request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f59332OooO0o0 = z;
        o0oO0Ooo o0oo0ooo2 = request.f57831OooO0Oo;
        Intrinsics.checkNotNull(o0oo0ooo2);
        long jContentLength = o0oo0ooo2.contentLength();
        this.f59328OooO0O0.requestBodyStart(this.f59327OooO00o);
        return new OooO00o(this, this.f59330OooO0Oo.OooO0OO(request, jContentLength), jContentLength);
    }

    @NotNull
    public final o0000OO0 OooO0OO() throws SocketException {
        o0000O0 o0000o1 = this.f59327OooO00o;
        if (!(!o0000o1.f59313OooOOO)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        o0000o1.f59313OooOOO = true;
        o0000o1.f59304OooO.OooOO0();
        o0000O0O connection = this.f59330OooO0Oo.getConnection();
        connection.getClass();
        Intrinsics.checkNotNullParameter(this, "exchange");
        Socket socket = connection.f59347OooO0Oo;
        Intrinsics.checkNotNull(socket);
        o0o0000 o0o0000Var = connection.f59351OooO0oo;
        Intrinsics.checkNotNull(o0o0000Var);
        o0OOo000 o0ooo001 = connection.f59344OooO;
        Intrinsics.checkNotNull(o0ooo001);
        socket.setSoTimeout(0);
        connection.OooOO0o();
        return new o0000OO0(o0o0000Var, o0ooo001, this);
    }

    @Nullable
    public final o0O00o00.OooO00o OooO0Oo(boolean z) throws IOException {
        try {
            o0O00o00.OooO00o oooO00oOooO0o0 = this.f59330OooO0Oo.OooO0o0(z);
            if (oooO00oOooO0o0 != null) {
                Intrinsics.checkNotNullParameter(this, "deferredTrailers");
                oooO00oOooO0o0.f57872OooOOO0 = this;
            }
            return oooO00oOooO0o0;
        } catch (IOException e) {
            this.f59328OooO0O0.responseFailed(this.f59327OooO00o, e);
            OooO0o0(e);
            throw e;
        }
    }

    public final void OooO0o0(IOException iOException) {
        this.f59329OooO0OO.OooO0OO(iOException);
        o0000O0O connection = this.f59330OooO0Oo.getConnection();
        o0000O0 call = this.f59327OooO00o;
        synchronized (connection) {
            Intrinsics.checkNotNullParameter(call, "call");
            if (!(iOException instanceof StreamResetException)) {
                if (!(connection.f59350OooO0oO != null) || (iOException instanceof ConnectionShutdownException)) {
                    connection.f59352OooOO0 = true;
                    if (connection.f59356OooOOO0 == 0) {
                        o0000O0O.OooO0Oo(call.f59305OooO0Oo, connection.f59345OooO0O0, iOException);
                        connection.f59354OooOO0o++;
                    }
                }
            } else if (((StreamResetException) iOException).f60181OooO0Oo == ErrorCode.REFUSED_STREAM) {
                int i = connection.f59355OooOOO + 1;
                connection.f59355OooOOO = i;
                if (i > 1) {
                    connection.f59352OooOO0 = true;
                    connection.f59354OooOO0o++;
                }
            } else if (((StreamResetException) iOException).f60181OooO0Oo != ErrorCode.CANCEL || !call.f59319OooOOoo) {
                connection.f59352OooOO0 = true;
                connection.f59354OooOO0o++;
            }
        }
    }
}
