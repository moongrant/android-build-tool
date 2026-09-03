package p650o0ooo000;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p634o0ooO0oO.o00O0OOO;
import p634o0ooO0oO.o00OO;
import p634o0ooO0oO.o00OOOO0;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0oOOo;
import p634o0ooO0oO.oo00oO;
import p634o0ooO0oO.oo0O;
import p635o0ooO0oo.o0O000o0;
import p646o0ooOoo.oO000OOo;
import p647o0ooOooo.kc;
import p647o0ooOooo.lc;
import p647o0ooOooo.qc;
import p659o0oooO00.o000;
import p659o0oooO00.o0000;
import p659o0oooO00.o00000O;
import p659o0oooO00.o0000Ooo;
import p659o0oooO00.o00O00;
import p659o0oooO00.o00O000;
import p659o0oooO00.o00O00O;

/* JADX INFO: loaded from: classes5.dex */
public final class o000O0o implements kc {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final o00OOOO0 f59830OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final oO000OOo f59831OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o0000 f59832OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0000Ooo f59833OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o000O000 f59834OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f59835OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public oo0O f59836OooO0oO;

    public final class OooO implements o00O000 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final o000 f59837OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o000O0o f59838OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f59839OooO0o0;

        public OooO(o000O0o this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f59838OooO0o = this$0;
            this.f59837OooO0Oo = new o000(this$0.f59833OooO0Oo.timeout());
        }

        @Override // p659o0oooO00.o00O000, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f59839OooO0o0) {
                return;
            }
            this.f59839OooO0o0 = true;
            o000 o000Var = this.f59837OooO0Oo;
            o000O0o o000o0o2 = this.f59838OooO0o;
            o000O0o.OooO0oo(o000o0o2, o000Var);
            o000o0o2.f59835OooO0o0 = 3;
        }

        @Override // p659o0oooO00.o00O000, java.io.Flushable
        public final void flush() throws IOException {
            if (this.f59839OooO0o0) {
                return;
            }
            this.f59838OooO0o.f59833OooO0Oo.flush();
        }

        @Override // p659o0oooO00.o00O000
        @NotNull
        public final o00O00O timeout() {
            return this.f59837OooO0Oo;
        }

        @Override // p659o0oooO00.o00O000
        public final void write(@NotNull o00000O source, long j) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (!(!this.f59839OooO0o0)) {
                throw new IllegalStateException("closed".toString());
            }
            long j2 = source.f60177OooO0o0;
            byte[] bArr = o0O000o0.f57386OooO00o;
            if ((0 | j) < 0 || 0 > j2 || j2 - 0 < j) {
                throw new ArrayIndexOutOfBoundsException();
            }
            this.f59838OooO0o.f59833OooO0Oo.write(source, j);
        }
    }

    public abstract class OooO00o implements o00O00 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final o000 f59840OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o000O0o f59841OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f59842OooO0o0;

        public OooO00o(o000O0o this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f59841OooO0o = this$0;
            this.f59840OooO0Oo = new o000(this$0.f59832OooO0OO.timeout());
        }

        public final void OooO00o() {
            o000O0o o000o0o2 = this.f59841OooO0o;
            int i = o000o0o2.f59835OooO0o0;
            if (i == 6) {
                return;
            }
            if (i != 5) {
                throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(o000o0o2.f59835OooO0o0)));
            }
            o000O0o.OooO0oo(o000o0o2, this.f59840OooO0Oo);
            o000o0o2.f59835OooO0o0 = 6;
        }

        @Override // p659o0oooO00.o00O00
        public long o0000OO0(@NotNull o00000O sink, long j) throws IOException {
            o000O0o o000o0o2 = this.f59841OooO0o;
            Intrinsics.checkNotNullParameter(sink, "sink");
            try {
                return o000o0o2.f59832OooO0OO.o0000OO0(sink, j);
            } catch (IOException e) {
                o000o0o2.f59831OooO0O0.OooOO0o();
                OooO00o();
                throw e;
            }
        }

        @Override // p659o0oooO00.o00O00
        @NotNull
        public final o00O00O timeout() {
            return this.f59840OooO0Oo;
        }
    }

    public final class OooO0O0 implements o00O000 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final o000 f59843OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o000O0o f59844OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f59845OooO0o0;

        public OooO0O0(o000O0o this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f59844OooO0o = this$0;
            this.f59843OooO0Oo = new o000(this$0.f59833OooO0Oo.timeout());
        }

        @Override // p659o0oooO00.o00O000, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.f59845OooO0o0) {
                return;
            }
            this.f59845OooO0o0 = true;
            this.f59844OooO0o.f59833OooO0Oo.OooOooo("0\r\n\r\n");
            o000O0o.OooO0oo(this.f59844OooO0o, this.f59843OooO0Oo);
            this.f59844OooO0o.f59835OooO0o0 = 3;
        }

        @Override // p659o0oooO00.o00O000, java.io.Flushable
        public final synchronized void flush() {
            if (this.f59845OooO0o0) {
                return;
            }
            this.f59844OooO0o.f59833OooO0Oo.flush();
        }

        @Override // p659o0oooO00.o00O000
        @NotNull
        public final o00O00O timeout() {
            return this.f59843OooO0Oo;
        }

        @Override // p659o0oooO00.o00O000
        public final void write(@NotNull o00000O source, long j) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (!(!this.f59845OooO0o0)) {
                throw new IllegalStateException("closed".toString());
            }
            if (j == 0) {
                return;
            }
            o000O0o o000o0o2 = this.f59844OooO0o;
            o000o0o2.f59833OooO0Oo.o00000O0(j);
            o0000Ooo o0000ooo = o000o0o2.f59833OooO0Oo;
            o0000ooo.OooOooo("\r\n");
            o0000ooo.write(source, j);
            o0000ooo.OooOooo("\r\n");
        }
    }

    public final class OooO0OO extends OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f59846OooO;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @NotNull
        public final o00OO f59847OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public long f59848OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ o000O0o f59849OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(@NotNull o000O0o this$0, o00OO url) {
            super(this$0);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(url, "url");
            this.f59849OooOO0 = this$0;
            this.f59847OooO0oO = url;
            this.f59848OooO0oo = -1L;
            this.f59846OooO = true;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f59842OooO0o0) {
                return;
            }
            if (this.f59846OooO && !o0O000o0.OooO0oo(this, TimeUnit.MILLISECONDS)) {
                this.f59849OooOO0.f59831OooO0O0.OooOO0o();
                OooO00o();
            }
            this.f59842OooO0o0 = true;
        }

        @Override // o0ooo000.o000O0o.OooO00o, p659o0oooO00.o00O00
        public final long o0000OO0(@NotNull o00000O sink, long j) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            boolean z = true;
            if (!(j >= 0)) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(j)).toString());
            }
            if (!(!this.f59842OooO0o0)) {
                throw new IllegalStateException("closed".toString());
            }
            if (!this.f59846OooO) {
                return -1L;
            }
            long j2 = this.f59848OooO0oo;
            o000O0o o000o0o2 = this.f59849OooOO0;
            if (j2 == 0 || j2 == -1) {
                if (j2 != -1) {
                    o000o0o2.f59832OooO0OO.OoooO0();
                }
                try {
                    this.f59848OooO0oo = o000o0o2.f59832OooO0OO.o0000Oo0();
                    String string = StringsKt.trim((CharSequence) o000o0o2.f59832OooO0OO.OoooO0()).toString();
                    if (this.f59848OooO0oo >= 0) {
                        if (string.length() <= 0) {
                            z = false;
                        }
                        if (!z || StringsKt.Oooo00o(string, ";")) {
                            if (this.f59848OooO0oo == 0) {
                                this.f59846OooO = false;
                                o000o0o2.f59836OooO0oO = o000o0o2.f59834OooO0o.OooO00o();
                                o00OOOO0 o00oooo1 = o000o0o2.f59830OooO00o;
                                Intrinsics.checkNotNull(o00oooo1);
                                o00O0OOO o00o0ooo2 = o00oooo1.f57265OooOOO0;
                                oo0O oo0o = o000o0o2.f59836OooO0oO;
                                Intrinsics.checkNotNull(oo0o);
                                lc.OooO0O0(o00o0ooo2, this.f59847OooO0oO, oo0o);
                                OooO00o();
                            }
                            if (!this.f59846OooO) {
                                return -1L;
                            }
                        }
                    }
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f59848OooO0oo + string + Typography.quote);
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long jO0000OO0 = super.o0000OO0(sink, Math.min(j, this.f59848OooO0oo));
            if (jO0000OO0 != -1) {
                this.f59848OooO0oo -= jO0000OO0;
                return jO0000OO0;
            }
            o000o0o2.f59831OooO0O0.OooOO0o();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            OooO00o();
            throw protocolException;
        }
    }

    public final class OooO0o extends OooO00o {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public long f59850OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ o000O0o f59851OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(o000O0o this$0, long j) {
            super(this$0);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f59851OooO0oo = this$0;
            this.f59850OooO0oO = j;
            if (j == 0) {
                OooO00o();
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f59842OooO0o0) {
                return;
            }
            if (this.f59850OooO0oO != 0 && !o0O000o0.OooO0oo(this, TimeUnit.MILLISECONDS)) {
                this.f59851OooO0oo.f59831OooO0O0.OooOO0o();
                OooO00o();
            }
            this.f59842OooO0o0 = true;
        }

        @Override // o0ooo000.o000O0o.OooO00o, p659o0oooO00.o00O00
        public final long o0000OO0(@NotNull o00000O sink, long j) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(j)).toString());
            }
            if (!(!this.f59842OooO0o0)) {
                throw new IllegalStateException("closed".toString());
            }
            long j2 = this.f59850OooO0oO;
            if (j2 == 0) {
                return -1L;
            }
            long jO0000OO0 = super.o0000OO0(sink, Math.min(j2, j));
            if (jO0000OO0 == -1) {
                this.f59851OooO0oo.f59831OooO0O0.OooOO0o();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                OooO00o();
                throw protocolException;
            }
            long j3 = this.f59850OooO0oO - jO0000OO0;
            this.f59850OooO0oO = j3;
            if (j3 == 0) {
                OooO00o();
            }
            return jO0000OO0;
        }
    }

    public final class OooOO0 extends OooO00o {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f59852OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(o000O0o this$0) {
            super(this$0);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f59842OooO0o0) {
                return;
            }
            if (!this.f59852OooO0oO) {
                OooO00o();
            }
            this.f59842OooO0o0 = true;
        }

        @Override // o0ooo000.o000O0o.OooO00o, p659o0oooO00.o00O00
        public final long o0000OO0(@NotNull o00000O sink, long j) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(j)).toString());
            }
            if (!(!this.f59842OooO0o0)) {
                throw new IllegalStateException("closed".toString());
            }
            if (this.f59852OooO0oO) {
                return -1L;
            }
            long jO0000OO0 = super.o0000OO0(sink, j);
            if (jO0000OO0 != -1) {
                return jO0000OO0;
            }
            this.f59852OooO0oO = true;
            OooO00o();
            return -1L;
        }
    }

    public o000O0o(@Nullable o00OOOO0 o00oooo1, @NotNull oO000OOo connection, @NotNull o0000 source, @NotNull o0000Ooo sink) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f59830OooO00o = o00oooo1;
        this.f59831OooO0O0 = connection;
        this.f59832OooO0OO = source;
        this.f59833OooO0Oo = sink;
        this.f59834OooO0o = new o000O000(source);
    }

    public static final void OooO0oo(o000O0o o000o0o2, o000 o000Var) {
        o000o0o2.getClass();
        o00O00O o00o00o2 = o000Var.f60165OooO0o0;
        o00O00O.OooO00o delegate = o00O00O.f60237OooO0Oo;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        o000Var.f60165OooO0o0 = delegate;
        o00o00o2.OooO00o();
        o00o00o2.OooO0O0();
    }

    public final OooO0o OooO(long j) {
        int i = this.f59835OooO0o0;
        if (!(i == 4)) {
            throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i)).toString());
        }
        this.f59835OooO0o0 = 5;
        return new OooO0o(this, j);
    }

    @Override // p647o0ooOooo.kc
    public final void OooO00o() {
        this.f59833OooO0Oo.flush();
    }

    @Override // p647o0ooOooo.kc
    @NotNull
    public final o00O000 OooO0O0(@NotNull o00OOOOo request, long j) throws ProtocolException {
        Intrinsics.checkNotNullParameter(request, "request");
        oo00oO oo00oo = request.f57316OooO0Oo;
        if (oo00oo != null && oo00oo.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (StringsKt.OooOO0o("chunked", request.OooO0O0("Transfer-Encoding"))) {
            int i = this.f59835OooO0o0;
            if (!(i == 1)) {
                throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i)).toString());
            }
            this.f59835OooO0o0 = 2;
            return new OooO0O0(this);
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        int i2 = this.f59835OooO0o0;
        if (!(i2 == 1)) {
            throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i2)).toString());
        }
        this.f59835OooO0o0 = 2;
        return new OooO(this);
    }

    @Override // p647o0ooOooo.kc
    public final long OooO0OO(@NotNull o0oOOo response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!lc.OooO00o(response)) {
            return 0L;
        }
        if (StringsKt.OooOO0o("chunked", response.OooO0OO("Transfer-Encoding", null))) {
            return -1L;
        }
        return o0O000o0.OooOO0O(response);
    }

    @Override // p647o0ooOooo.kc
    public final void OooO0Oo(@NotNull o00OOOOo request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Proxy.Type proxyType = this.f59831OooO0O0.f59617OooO0O0.f57327OooO0O0.type();
        Intrinsics.checkNotNullExpressionValue(proxyType, "connection.route().proxy.type()");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proxyType, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(request.f57314OooO0O0);
        sb.append(' ');
        o00OO url = request.f57313OooO00o;
        if (!url.f57211OooOO0 && proxyType == Proxy.Type.HTTP) {
            sb.append(url);
        } else {
            Intrinsics.checkNotNullParameter(url, "url");
            String strOooO0O0 = url.OooO0O0();
            String strOooO0Oo = url.OooO0Oo();
            if (strOooO0Oo != null) {
                strOooO0O0 = strOooO0O0 + '?' + ((Object) strOooO0Oo);
            }
            sb.append(strOooO0O0);
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        OooOO0(request.f57315OooO0OO, string);
    }

    @Override // p647o0ooOooo.kc
    @NotNull
    public final o00O00 OooO0o(@NotNull o0oOOo response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!lc.OooO00o(response)) {
            return OooO(0L);
        }
        if (StringsKt.OooOO0o("chunked", response.OooO0OO("Transfer-Encoding", null))) {
            o00OO o00oo2 = response.f57342OooO0Oo.f57313OooO00o;
            int i = this.f59835OooO0o0;
            if (!(i == 4)) {
                throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i)).toString());
            }
            this.f59835OooO0o0 = 5;
            return new OooO0OO(this, o00oo2);
        }
        long jOooOO0O = o0O000o0.OooOO0O(response);
        if (jOooOO0O != -1) {
            return OooO(jOooOO0O);
        }
        int i2 = this.f59835OooO0o0;
        if (!(i2 == 4)) {
            throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i2)).toString());
        }
        this.f59835OooO0o0 = 5;
        this.f59831OooO0O0.OooOO0o();
        return new OooOO0(this);
    }

    @Override // p647o0ooOooo.kc
    @Nullable
    public final o0oOOo.OooO00o OooO0o0(boolean z) {
        o000O000 o000o001 = this.f59834OooO0o;
        int i = this.f59835OooO0o0;
        boolean z2 = true;
        if (i != 1 && i != 3) {
            z2 = false;
        }
        if (!z2) {
            throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i)).toString());
        }
        try {
            String strOooOoo0 = o000o001.f59828OooO00o.OooOoo0(o000o001.f59829OooO0O0);
            o000o001.f59829OooO0O0 -= (long) strOooOoo0.length();
            qc qcVarOooO00o = qc.OooO00o.OooO00o(strOooOoo0);
            int i2 = qcVarOooO00o.f59728OooO0O0;
            o0oOOo.OooO00o oooO00o = new o0oOOo.OooO00o();
            Protocol protocol = qcVarOooO00o.f59727OooO00o;
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            oooO00o.f57357OooO0O0 = protocol;
            oooO00o.f57358OooO0OO = i2;
            String message = qcVarOooO00o.f59729OooO0OO;
            Intrinsics.checkNotNullParameter(message, "message");
            oooO00o.f57359OooO0Oo = message;
            oooO00o.OooO0OO(o000o001.OooO00o());
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.f59835OooO0o0 = 3;
                return oooO00o;
            }
            this.f59835OooO0o0 = 4;
            return oooO00o;
        } catch (EOFException e) {
            throw new IOException(Intrinsics.stringPlus("unexpected end of stream on ", this.f59831OooO0O0.f59617OooO0O0.f57326OooO00o.f57144OooO.OooO()), e);
        }
    }

    @Override // p647o0ooOooo.kc
    public final void OooO0oO() throws IOException {
        this.f59833OooO0Oo.flush();
    }

    public final void OooOO0(@NotNull oo0O headers, @NotNull String requestLine) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(requestLine, "requestLine");
        int i = this.f59835OooO0o0;
        if (!(i == 0)) {
            throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i)).toString());
        }
        o0000Ooo o0000ooo = this.f59833OooO0Oo;
        o0000ooo.OooOooo(requestLine).OooOooo("\r\n");
        int length = headers.f57369OooO0Oo.length / 2;
        for (int i2 = 0; i2 < length; i2++) {
            o0000ooo.OooOooo(headers.OooO0OO(i2)).OooOooo(": ").OooOooo(headers.OooO0o0(i2)).OooOooo("\r\n");
        }
        o0000ooo.OooOooo("\r\n");
        this.f59835OooO0o0 = 1;
    }

    @Override // p647o0ooOooo.kc
    public final void cancel() {
        Socket socket = this.f59831OooO0O0.f59618OooO0OO;
        if (socket == null) {
            return;
        }
        o0O000o0.OooO0Oo(socket);
    }

    @Override // p647o0ooOooo.kc
    @NotNull
    public final oO000OOo getConnection() {
        return this.f59831OooO0O0;
    }
}
