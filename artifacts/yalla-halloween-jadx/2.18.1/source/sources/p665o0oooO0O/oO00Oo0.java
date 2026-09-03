package p665o0oooO0O;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016OooOoO0.OooOo00;
import p659o0ooo0o.o00OOO00;
import p660o0ooo0o0.o00O;
import p660o0ooo0o0.o00O0;
import p660o0ooo0o0.o00OO;
import p660o0ooo0o0.o00OO000;
import p660o0ooo0o0.o00OOOO0;
import p660o0ooo0o0.o0o0Oo;
import p663o0oooO0.o00OO00O;
import p666o0oooO0o.oO00o00O;
import p666o0oooO0o.oO0OOO00;
import p666o0oooO0o.oOo000Oo;
import p674o0oooo0.o0O0000O;
import p674o0oooo0.o0O00o00;
import p674o0oooo0.o0O0O0O;
import p674o0oooo0.o0oO0O0o;
import p674o0oooo0.o0oOO;
import p674o0oooo0.o0oOOo;
import p674o0oooo0.oo00oO;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00Oo0 implements oO0OOO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f51841OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oO00Oo00 f51842OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o00O f51843OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00OO f51844OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0oOOo f51845OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o00OO00O f51846OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final oo00oO f51847OooO0oO;

    public final class OooO implements o0O00o00 {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final o0O0000O f51848Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public boolean f51849Oooo0oO;

        public OooO() {
            this.f51848Oooo0o = new o0O0000O(oO00Oo0.this.f51847OooO0oO.timeout());
        }

        @Override // p674o0oooo0.o0O00o00, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f51849Oooo0oO) {
                return;
            }
            this.f51849Oooo0oO = true;
            oO00Oo0.OooO(oO00Oo0.this, this.f51848Oooo0o);
            oO00Oo0.this.f51841OooO00o = 3;
        }

        @Override // p674o0oooo0.o0O00o00, java.io.Flushable
        public final void flush() throws IOException {
            if (this.f51849Oooo0oO) {
                return;
            }
            oO00Oo0.this.f51847OooO0oO.flush();
        }

        @Override // p674o0oooo0.o0O00o00
        @NotNull
        public final o0oO0O0o timeout() {
            return this.f51848Oooo0o;
        }

        @Override // p674o0oooo0.o0O00o00
        public final void write(@NotNull o0oOO source, long j) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (!(!this.f51849Oooo0oO)) {
                throw new IllegalStateException("closed".toString());
            }
            o00OOO00.OooO0OO(source.f52099Oooo0oO, 0L, j);
            oO00Oo0.this.f51847OooO0oO.write(source, j);
        }
    }

    public abstract class OooO00o implements o0O0O0O {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @NotNull
        public final o0O0000O f51851Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public boolean f51852Oooo0oO;

        public OooO00o() {
            this.f51851Oooo0o = new o0O0000O(oO00Oo0.this.f51845OooO0o.timeout());
        }

        public final void OooO00o() {
            oO00Oo0 oo00oo0 = oO00Oo0.this;
            int i = oo00oo0.f51841OooO00o;
            if (i == 6) {
                return;
            }
            if (i == 5) {
                oO00Oo0.OooO(oo00oo0, this.f51851Oooo0o);
                oO00Oo0.this.f51841OooO00o = 6;
            } else {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("state: ");
                sbOooO0o0.append(oO00Oo0.this.f51841OooO00o);
                throw new IllegalStateException(sbOooO0o0.toString());
            }
        }

        @Override // p674o0oooo0.o0O0O0O
        public long Oooo0O0(@NotNull o0oOO sink, long j) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            try {
                return oO00Oo0.this.f51845OooO0o.Oooo0O0(sink, j);
            } catch (IOException e) {
                oO00Oo0.this.f51846OooO0o0.OooOOO0();
                OooO00o();
                throw e;
            }
        }

        @Override // p674o0oooo0.o0O0O0O
        @NotNull
        public final o0oO0O0o timeout() {
            return this.f51851Oooo0o;
        }
    }

    public final class OooO0O0 implements o0O00o00 {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final o0O0000O f51854Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public boolean f51855Oooo0oO;

        public OooO0O0() {
            this.f51854Oooo0o = new o0O0000O(oO00Oo0.this.f51847OooO0oO.timeout());
        }

        @Override // p674o0oooo0.o0O00o00, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.f51855Oooo0oO) {
                return;
            }
            this.f51855Oooo0oO = true;
            oO00Oo0.this.f51847OooO0oO.OoooOoo("0\r\n\r\n");
            oO00Oo0.OooO(oO00Oo0.this, this.f51854Oooo0o);
            oO00Oo0.this.f51841OooO00o = 3;
        }

        @Override // p674o0oooo0.o0O00o00, java.io.Flushable
        public final synchronized void flush() {
            if (this.f51855Oooo0oO) {
                return;
            }
            oO00Oo0.this.f51847OooO0oO.flush();
        }

        @Override // p674o0oooo0.o0O00o00
        @NotNull
        public final o0oO0O0o timeout() {
            return this.f51854Oooo0o;
        }

        @Override // p674o0oooo0.o0O00o00
        public final void write(@NotNull o0oOO source, long j) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (!(!this.f51855Oooo0oO)) {
                throw new IllegalStateException("closed".toString());
            }
            if (j == 0) {
                return;
            }
            oO00Oo0.this.f51847OooO0oO.Ooooooo(j);
            oO00Oo0.this.f51847OooO0oO.OoooOoo("\r\n");
            oO00Oo0.this.f51847OooO0oO.write(source, j);
            oO00Oo0.this.f51847OooO0oO.OoooOoo("\r\n");
        }
    }

    public final class OooO0OO extends OooO00o {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public long f51857Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final o00OO000 f51858OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public boolean f51859OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ oO00Oo0 f51860OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(@NotNull oO00Oo0 oo00oo0, o00OO000 url) {
            super();
            Intrinsics.checkNotNullParameter(url, "url");
            this.f51860OoooO0O = oo00oo0;
            this.f51858OoooO0 = url;
            this.f51857Oooo = -1L;
            this.f51859OoooO00 = true;
        }

        @Override // o0oooO0O.oO00Oo0.OooO00o, p674o0oooo0.o0O0O0O
        public final long Oooo0O0(@NotNull o0oOO sink, long j) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            boolean z = true;
            if (!(j >= 0)) {
                throw new IllegalArgumentException(androidx.viewpager2.adapter.OooO00o.OooO00o("byteCount < 0: ", j).toString());
            }
            if (!(!this.f51852Oooo0oO)) {
                throw new IllegalStateException("closed".toString());
            }
            if (!this.f51859OoooO00) {
                return -1L;
            }
            long j2 = this.f51857Oooo;
            if (j2 == 0 || j2 == -1) {
                if (j2 != -1) {
                    this.f51860OoooO0O.f51845OooO0o.o0ooOO0();
                }
                try {
                    this.f51857Oooo = this.f51860OoooO0O.f51845OooO0o.o000OO();
                    String strO0ooOO0 = this.f51860OoooO0O.f51845OooO0o.o0ooOO0();
                    if (strO0ooOO0 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                    String string = StringsKt.trim((CharSequence) strO0ooOO0).toString();
                    if (this.f51857Oooo >= 0) {
                        if (string.length() <= 0) {
                            z = false;
                        }
                        if (!z || StringsKt.OooOoOO(string, ";")) {
                            if (this.f51857Oooo == 0) {
                                this.f51859OoooO00 = false;
                                oO00Oo0 oo00oo0 = this.f51860OoooO0O;
                                oo00oo0.f51843OooO0OO = oo00oo0.f51842OooO0O0.OooO00o();
                                o00OO o00oo2 = this.f51860OoooO0O.f51844OooO0Oo;
                                Intrinsics.checkNotNull(o00oo2);
                                o00O0 o00o1 = o00oo2.f51342o000oOoO;
                                o00OO000 o00oo001 = this.f51858OoooO0;
                                o00O o00o2 = this.f51860OoooO0O.f51843OooO0OO;
                                Intrinsics.checkNotNull(o00o2);
                                oO00o00O.OooO0O0(o00o1, o00oo001, o00o2);
                                OooO00o();
                            }
                            if (!this.f51859OoooO00) {
                                return -1L;
                            }
                        }
                    }
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f51857Oooo + string + Typography.quote);
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long jOooo0O0 = super.Oooo0O0(sink, Math.min(j, this.f51857Oooo));
            if (jOooo0O0 != -1) {
                this.f51857Oooo -= jOooo0O0;
                return jOooo0O0;
            }
            this.f51860OoooO0O.f51846OooO0o0.OooOOO0();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            OooO00o();
            throw protocolException;
        }

        @Override // p674o0oooo0.o0O0O0O, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f51852Oooo0oO) {
                return;
            }
            if (this.f51859OoooO00) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (!o00OOO00.OooO(this)) {
                    this.f51860OoooO0O.f51846OooO0o0.OooOOO0();
                    OooO00o();
                }
            }
            this.f51852Oooo0oO = true;
        }
    }

    public final class OooO0o extends OooO00o {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public long f51861Oooo;

        public OooO0o(long j) {
            super();
            this.f51861Oooo = j;
            if (j == 0) {
                OooO00o();
            }
        }

        @Override // o0oooO0O.oO00Oo0.OooO00o, p674o0oooo0.o0O0O0O
        public final long Oooo0O0(@NotNull o0oOO sink, long j) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(androidx.viewpager2.adapter.OooO00o.OooO00o("byteCount < 0: ", j).toString());
            }
            if (!(!this.f51852Oooo0oO)) {
                throw new IllegalStateException("closed".toString());
            }
            long j2 = this.f51861Oooo;
            if (j2 == 0) {
                return -1L;
            }
            long jOooo0O0 = super.Oooo0O0(sink, Math.min(j2, j));
            if (jOooo0O0 == -1) {
                oO00Oo0.this.f51846OooO0o0.OooOOO0();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                OooO00o();
                throw protocolException;
            }
            long j3 = this.f51861Oooo - jOooo0O0;
            this.f51861Oooo = j3;
            if (j3 == 0) {
                OooO00o();
            }
            return jOooo0O0;
        }

        @Override // p674o0oooo0.o0O0O0O, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f51852Oooo0oO) {
                return;
            }
            if (this.f51861Oooo != 0) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (!o00OOO00.OooO(this)) {
                    oO00Oo0.this.f51846OooO0o0.OooOOO0();
                    OooO00o();
                }
            }
            this.f51852Oooo0oO = true;
        }
    }

    public final class OooOO0 extends OooO00o {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public boolean f51863Oooo;

        public OooOO0(oO00Oo0 oo00oo0) {
            super();
        }

        @Override // o0oooO0O.oO00Oo0.OooO00o, p674o0oooo0.o0O0O0O
        public final long Oooo0O0(@NotNull o0oOO sink, long j) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(androidx.viewpager2.adapter.OooO00o.OooO00o("byteCount < 0: ", j).toString());
            }
            if (!(!this.f51852Oooo0oO)) {
                throw new IllegalStateException("closed".toString());
            }
            if (this.f51863Oooo) {
                return -1L;
            }
            long jOooo0O0 = super.Oooo0O0(sink, j);
            if (jOooo0O0 != -1) {
                return jOooo0O0;
            }
            this.f51863Oooo = true;
            OooO00o();
            return -1L;
        }

        @Override // p674o0oooo0.o0O0O0O, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f51852Oooo0oO) {
                return;
            }
            if (!this.f51863Oooo) {
                OooO00o();
            }
            this.f51852Oooo0oO = true;
        }
    }

    public oO00Oo0(@Nullable o00OO o00oo2, @NotNull o00OO00O connection, @NotNull o0oOOo source, @NotNull oo00oO sink) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f51844OooO0Oo = o00oo2;
        this.f51846OooO0o0 = connection;
        this.f51845OooO0o = source;
        this.f51847OooO0oO = sink;
        this.f51842OooO0O0 = new oO00Oo00(source);
    }

    public static final void OooO(oO00Oo0 oo00oo0, o0O0000O o0o0000o2) {
        Objects.requireNonNull(oo00oo0);
        o0oO0O0o o0oo0o0o2 = o0o0000o2.f52048OooO0o0;
        o0oO0O0o.OooO00o delegate = o0oO0O0o.f52090OooO0Oo;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        o0o0000o2.f52048OooO0o0 = delegate;
        o0oo0o0o2.OooO00o();
        o0oo0o0o2.OooO0O0();
    }

    @Override // p666o0oooO0o.oO0OOO00
    public final void OooO00o() throws IOException {
        this.f51847OooO0oO.flush();
    }

    @Override // p666o0oooO0o.oO0OOO00
    @NotNull
    public final o00OO00O OooO0O0() {
        return this.f51846OooO0o0;
    }

    @Override // p666o0oooO0o.oO0OOO00
    @Nullable
    public final o00OOOO0.OooO00o OooO0OO(boolean z) {
        int i = this.f51841OooO00o;
        boolean z2 = true;
        if (i != 1 && i != 3) {
            z2 = false;
        }
        if (!z2) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("state: ");
            sbOooO0o0.append(this.f51841OooO00o);
            throw new IllegalStateException(sbOooO0o0.toString().toString());
        }
        try {
            oOo000Oo.OooO00o oooO00o = oOo000Oo.f51874OooO0Oo;
            oO00Oo00 oo00oo00 = this.f51842OooO0O0;
            String strOoooO = oo00oo00.f51865OooO0O0.OoooO(oo00oo00.f51864OooO00o);
            oo00oo00.f51864OooO00o -= (long) strOoooO.length();
            oOo000Oo ooo000ooOooO00o = oooO00o.OooO00o(strOoooO);
            o00OOOO0.OooO00o oooO00o2 = new o00OOOO0.OooO00o();
            oooO00o2.OooO0o(ooo000ooOooO00o.f51875OooO00o);
            oooO00o2.f51454OooO0OO = ooo000ooOooO00o.f51876OooO0O0;
            oooO00o2.OooO0o0(ooo000ooOooO00o.f51877OooO0OO);
            oooO00o2.OooO0Oo(this.f51842OooO0O0.OooO00o());
            if (z && ooo000ooOooO00o.f51876OooO0O0 == 100) {
                return null;
            }
            if (ooo000ooOooO00o.f51876OooO0O0 == 100) {
                this.f51841OooO00o = 3;
                return oooO00o2;
            }
            this.f51841OooO00o = 4;
            return oooO00o2;
        } catch (EOFException e) {
            throw new IOException(OooOo00.OooO0Oo("unexpected end of stream on ", this.f51846OooO0o0.f51794OooOOo0.f51473OooO00o.f51218OooO00o.OooOO0O()), e);
        }
    }

    @Override // p666o0oooO0o.oO0OOO00
    public final void OooO0Oo() throws IOException {
        this.f51847OooO0oO.flush();
    }

    @Override // p666o0oooO0o.oO0OOO00
    public final long OooO0o(@NotNull o00OOOO0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!oO00o00O.OooO00o(response)) {
            return 0L;
        }
        if (StringsKt.OooO("chunked", response.OooO0O0("Transfer-Encoding", null))) {
            return -1L;
        }
        return o00OOO00.OooOO0o(response);
    }

    @Override // p666o0oooO0o.oO0OOO00
    @NotNull
    public final o0O00o00 OooO0o0(@NotNull p660o0ooo0o0.o00OOO00 request, long j) throws ProtocolException {
        Intrinsics.checkNotNullParameter(request, "request");
        o0o0Oo o0o0oo = request.f51429OooO0o0;
        if (o0o0oo != null && o0o0oo.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (StringsKt.OooO("chunked", request.OooO0O0("Transfer-Encoding"))) {
            if (this.f51841OooO00o == 1) {
                this.f51841OooO00o = 2;
                return new OooO0O0();
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("state: ");
            sbOooO0o0.append(this.f51841OooO00o);
            throw new IllegalStateException(sbOooO0o0.toString().toString());
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f51841OooO00o == 1) {
            this.f51841OooO00o = 2;
            return new OooO();
        }
        StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("state: ");
        sbOooO0o1.append(this.f51841OooO00o);
        throw new IllegalStateException(sbOooO0o1.toString().toString());
    }

    @Override // p666o0oooO0o.oO0OOO00
    public final void OooO0oO(@NotNull p660o0ooo0o0.o00OOO00 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Proxy.Type proxyType = this.f51846OooO0o0.f51794OooOOo0.f51474OooO0O0.type();
        Intrinsics.checkNotNullExpressionValue(proxyType, "connection.route().proxy.type()");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proxyType, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(request.f51426OooO0OO);
        sb.append(' ');
        o00OO000 url = request.f51425OooO0O0;
        if (!url.f51382OooO00o && proxyType == Proxy.Type.HTTP) {
            sb.append(url);
        } else {
            Intrinsics.checkNotNullParameter(url, "url");
            String strOooO0O0 = url.OooO0O0();
            String strOooO0Oo = url.OooO0Oo();
            if (strOooO0Oo != null) {
                strOooO0O0 = strOooO0O0 + '?' + strOooO0Oo;
            }
            sb.append(strOooO0O0);
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        OooOO0O(request.f51427OooO0Oo, string);
    }

    @Override // p666o0oooO0o.oO0OOO00
    @NotNull
    public final o0O0O0O OooO0oo(@NotNull o00OOOO0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!oO00o00O.OooO00o(response)) {
            return OooOO0(0L);
        }
        if (StringsKt.OooO("chunked", response.OooO0O0("Transfer-Encoding", null))) {
            o00OO000 o00oo001 = response.f51439Oooo0oO.f51425OooO0O0;
            if (this.f51841OooO00o == 4) {
                this.f51841OooO00o = 5;
                return new OooO0OO(this, o00oo001);
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("state: ");
            sbOooO0o0.append(this.f51841OooO00o);
            throw new IllegalStateException(sbOooO0o0.toString().toString());
        }
        long jOooOO0o = o00OOO00.OooOO0o(response);
        if (jOooOO0o != -1) {
            return OooOO0(jOooOO0o);
        }
        if (this.f51841OooO00o == 4) {
            this.f51841OooO00o = 5;
            this.f51846OooO0o0.OooOOO0();
            return new OooOO0(this);
        }
        StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("state: ");
        sbOooO0o1.append(this.f51841OooO00o);
        throw new IllegalStateException(sbOooO0o1.toString().toString());
    }

    public final o0O0O0O OooOO0(long j) {
        if (this.f51841OooO00o == 4) {
            this.f51841OooO00o = 5;
            return new OooO0o(j);
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("state: ");
        sbOooO0o0.append(this.f51841OooO00o);
        throw new IllegalStateException(sbOooO0o0.toString().toString());
    }

    public final void OooOO0O(@NotNull o00O headers, @NotNull String requestLine) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(requestLine, "requestLine");
        if (!(this.f51841OooO00o == 0)) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("state: ");
            sbOooO0o0.append(this.f51841OooO00o);
            throw new IllegalStateException(sbOooO0o0.toString().toString());
        }
        this.f51847OooO0oO.OoooOoo(requestLine).OoooOoo("\r\n");
        int length = headers.f51230Oooo0o.length / 2;
        for (int i = 0; i < length; i++) {
            this.f51847OooO0oO.OoooOoo(headers.OooO0O0(i)).OoooOoo(": ").OoooOoo(headers.OooO0o0(i)).OoooOoo("\r\n");
        }
        this.f51847OooO0oO.OoooOoo("\r\n");
        this.f51841OooO00o = 1;
    }

    @Override // p666o0oooO0o.oO0OOO00
    public final void cancel() {
        Socket socket = this.f51846OooO0o0.f51780OooO0O0;
        if (socket != null) {
            o00OOO00.OooO0o0(socket);
        }
    }
}
