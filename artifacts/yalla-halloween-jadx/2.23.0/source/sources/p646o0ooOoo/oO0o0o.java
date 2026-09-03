package p646o0ooOoo;

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
import p634o0ooO0oO.o00OO00O;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0oOOo;
import p634o0ooO0oO.oo00oO;
import p647o0ooOooo.kc;
import p659o0oooO00.o00;
import p659o0oooO00.o00000O;
import p659o0oooO00.o0000O;
import p659o0oooO00.o0000OO0;
import p659o0oooO00.o00O00;
import p659o0oooO00.o00O000;
import p659o0oooO00.o00O0000;

/* JADX INFO: loaded from: classes5.dex */
public final class oO0o0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final oO0Oo0oo f59689OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00OO00O f59690OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final oO0OoOO0 f59691OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final kc f59692OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final oO000OOo f59693OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f59694OooO0o0;

    public final class OooO00o extends o0000O {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final long f59695OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public long f59696OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f59697OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f59698OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ oO0o0o f59699OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(@NotNull oO0o0o this$0, o00O000 delegate, long j) {
            super(delegate);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f59699OooO0oo = this$0;
            this.f59695OooO0Oo = j;
        }

        public final <E extends IOException> E OooO00o(E e) {
            if (this.f59697OooO0o0) {
                return e;
            }
            this.f59697OooO0o0 = true;
            return (E) this.f59699OooO0oo.OooO00o(this.f59696OooO0o, false, true, e);
        }

        @Override // p659o0oooO00.o0000O, p659o0oooO00.o00O000, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f59698OooO0oO) {
                return;
            }
            this.f59698OooO0oO = true;
            long j = this.f59695OooO0Oo;
            if (j != -1 && this.f59696OooO0o != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                OooO00o(null);
            } catch (IOException e) {
                throw OooO00o(e);
            }
        }

        @Override // p659o0oooO00.o0000O, p659o0oooO00.o00O000, java.io.Flushable
        public final void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                throw OooO00o(e);
            }
        }

        @Override // p659o0oooO00.o0000O, p659o0oooO00.o00O000
        public final void write(@NotNull o00000O source, long j) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (!(!this.f59698OooO0oO)) {
                throw new IllegalStateException("closed".toString());
            }
            long j2 = this.f59695OooO0Oo;
            if (j2 == -1 || this.f59696OooO0o + j <= j2) {
                try {
                    super.write(source, j);
                    this.f59696OooO0o += j;
                    return;
                } catch (IOException e) {
                    throw OooO00o(e);
                }
            }
            throw new ProtocolException("expected " + j2 + " bytes but received " + (this.f59696OooO0o + j));
        }
    }

    public final class OooO0O0 extends o0000OO0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f59700OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public long f59701OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final long f59702OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f59703OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f59704OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ oO0o0o f59705OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(@NotNull oO0o0o this$0, o00O00 delegate, long j) {
            super(delegate);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f59705OooOO0 = this$0;
            this.f59702OooO0o0 = j;
            this.f59703OooO0oO = true;
            if (j == 0) {
                OooO00o(null);
            }
        }

        public final <E extends IOException> E OooO00o(E e) {
            if (this.f59704OooO0oo) {
                return e;
            }
            this.f59704OooO0oo = true;
            if (e == null && this.f59703OooO0oO) {
                this.f59703OooO0oO = false;
                oO0o0o oo0o0o = this.f59705OooOO0;
                oo0o0o.f59690OooO0O0.responseBodyStart(oo0o0o.f59689OooO00o);
            }
            return (E) this.f59705OooOO0.OooO00o(this.f59701OooO0o, true, false, e);
        }

        @Override // p659o0oooO00.o0000OO0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f59700OooO) {
                return;
            }
            this.f59700OooO = true;
            try {
                super.close();
                OooO00o(null);
            } catch (IOException e) {
                throw OooO00o(e);
            }
        }

        @Override // p659o0oooO00.o0000OO0, p659o0oooO00.o00O00
        public final long o0000OO0(@NotNull o00000O sink, long j) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (!(!this.f59700OooO)) {
                throw new IllegalStateException("closed".toString());
            }
            try {
                long jO0000OO0 = this.f60199OooO0Oo.o0000OO0(sink, j);
                if (this.f59703OooO0oO) {
                    this.f59703OooO0oO = false;
                    oO0o0o oo0o0o = this.f59705OooOO0;
                    oo0o0o.f59690OooO0O0.responseBodyStart(oo0o0o.f59689OooO00o);
                }
                if (jO0000OO0 == -1) {
                    OooO00o(null);
                    return -1L;
                }
                long j2 = this.f59701OooO0o + jO0000OO0;
                long j3 = this.f59702OooO0o0;
                if (j3 == -1 || j2 <= j3) {
                    this.f59701OooO0o = j2;
                    if (j2 == j3) {
                        OooO00o(null);
                    }
                    return jO0000OO0;
                }
                throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
            } catch (IOException e) {
                throw OooO00o(e);
            }
        }
    }

    public oO0o0o(@NotNull oO0Oo0oo call, @NotNull o00OO00O eventListener, @NotNull oO0OoOO0 finder, @NotNull kc codec) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.f59689OooO00o = call;
        this.f59690OooO0O0 = eventListener;
        this.f59691OooO0OO = finder;
        this.f59692OooO0Oo = codec;
        this.f59693OooO0o = codec.getConnection();
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
        o00OO00O o00oo00o = this.f59690OooO0O0;
        oO0Oo0oo oo0oo0oo = this.f59689OooO00o;
        if (z2) {
            if (e != null) {
                o00oo00o.requestFailed(oo0oo0oo, e);
            } else {
                o00oo00o.requestBodyEnd(oo0oo0oo, j);
            }
        }
        if (z) {
            if (e != null) {
                o00oo00o.responseFailed(oo0oo0oo, e);
            } else {
                o00oo00o.responseBodyEnd(oo0oo0oo, j);
            }
        }
        return (E) oo0oo0oo.OooO0oo(this, z2, z, e);
    }

    @NotNull
    public final OooO00o OooO0O0(boolean z, @NotNull o00OOOOo request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f59694OooO0o0 = z;
        oo00oO oo00oo = request.f57316OooO0Oo;
        Intrinsics.checkNotNull(oo00oo);
        long jContentLength = oo00oo.contentLength();
        this.f59690OooO0O0.requestBodyStart(this.f59689OooO00o);
        return new OooO00o(this, this.f59692OooO0Oo.OooO0O0(request, jContentLength), jContentLength);
    }

    @NotNull
    public final oO000Oo0 OooO0OO() throws SocketException {
        oO0Oo0oo oo0oo0oo = this.f59689OooO00o;
        if (!(!oo0oo0oo.f59661OooOOO)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        oo0oo0oo.f59661OooOOO = true;
        oo0oo0oo.f59652OooO.OooOO0();
        oO000OOo connection = this.f59692OooO0Oo.getConnection();
        connection.getClass();
        Intrinsics.checkNotNullParameter(this, "exchange");
        Socket socket = connection.f59619OooO0Oo;
        Intrinsics.checkNotNull(socket);
        o00O0000 o00o0001 = connection.f59623OooO0oo;
        Intrinsics.checkNotNull(o00o0001);
        o00 o00Var = connection.f59616OooO;
        Intrinsics.checkNotNull(o00Var);
        socket.setSoTimeout(0);
        connection.OooOO0o();
        return new oO000Oo0(o00o0001, o00Var, this);
    }

    @Nullable
    public final o0oOOo.OooO00o OooO0Oo(boolean z) throws IOException {
        try {
            o0oOOo.OooO00o oooO00oOooO0o0 = this.f59692OooO0Oo.OooO0o0(z);
            if (oooO00oOooO0o0 != null) {
                Intrinsics.checkNotNullParameter(this, "deferredTrailers");
                oooO00oOooO0o0.f57367OooOOO0 = this;
            }
            return oooO00oOooO0o0;
        } catch (IOException e) {
            this.f59690OooO0O0.responseFailed(this.f59689OooO00o, e);
            OooO0o0(e);
            throw e;
        }
    }

    public final void OooO0o0(IOException iOException) {
        this.f59691OooO0OO.OooO0OO(iOException);
        oO000OOo connection = this.f59692OooO0Oo.getConnection();
        oO0Oo0oo call = this.f59689OooO00o;
        synchronized (connection) {
            Intrinsics.checkNotNullParameter(call, "call");
            if (!(iOException instanceof StreamResetException)) {
                if (!(connection.f59622OooO0oO != null) || (iOException instanceof ConnectionShutdownException)) {
                    connection.f59624OooOO0 = true;
                    if (connection.f59628OooOOO0 == 0) {
                        oO000OOo.OooO0Oo(call.f59653OooO0Oo, connection.f59617OooO0O0, iOException);
                        connection.f59626OooOO0o++;
                    }
                }
            } else if (((StreamResetException) iOException).f60854OooO0Oo == ErrorCode.REFUSED_STREAM) {
                int i = connection.f59627OooOOO + 1;
                connection.f59627OooOOO = i;
                if (i > 1) {
                    connection.f59624OooOO0 = true;
                    connection.f59626OooOO0o++;
                }
            } else if (((StreamResetException) iOException).f60854OooO0Oo != ErrorCode.CANCEL || !call.f59667OooOOoo) {
                connection.f59624OooOO0 = true;
                connection.f59626OooOO0o++;
            }
        }
    }
}
