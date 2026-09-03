package p651o0ooo0;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.Typography;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p641o0ooOO0o.o0O000;
import p641o0ooOO0o.o0O000O;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o0;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0OoO00O;
import p641o0ooOO0o.o0oO0Ooo;
import p648o0ooOoo.oO000o00;
import p653o0ooo00O.o0000O0O;
import p654o0ooo00o.o00;
import p654o0ooo00o.o000O0Oo;
import p654o0ooo00o.o000OO0O;
import p662o0oooO0O.o0O0o0;
import p662o0oooO0O.o0O0o00O;
import p662o0oooO0O.o0OO00OO;
import p662o0oooO0O.oO00000;
import p662o0oooO0O.oO00000o;
import p662o0oooO0O.oo0OOoo;
import p662o0oooO0O.ooo0Oo0;

/* JADX INFO: loaded from: classes5.dex */
public final class o000oOoO implements o000O0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final o0OoO00O f59253OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0000O0O f59254OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o0O0o0 f59255OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0O0o00O f59256OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Oooo0 f59257OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f59258OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public o0O000 f59259OooO0oO;

    public final class OooO implements ooo0Oo0 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final o0OO00OO f59260OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o000oOoO f59261OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f59262OooO0o0;

        public OooO(o000oOoO this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f59261OooO0o = this$0;
            this.f59260OooO0Oo = new o0OO00OO(this$0.f59256OooO0Oo.timeout());
        }

        @Override // p662o0oooO0O.ooo0Oo0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f59262OooO0o0) {
                return;
            }
            this.f59262OooO0o0 = true;
            o0OO00OO o0oo00oo2 = this.f59260OooO0Oo;
            o000oOoO o000oooo2 = this.f59261OooO0o;
            o000oOoO.OooO0oo(o000oooo2, o0oo00oo2);
            o000oooo2.f59258OooO0o0 = 3;
        }

        @Override // p662o0oooO0O.ooo0Oo0, java.io.Flushable
        public final void flush() throws IOException {
            if (this.f59262OooO0o0) {
                return;
            }
            this.f59261OooO0o.f59256OooO0Oo.flush();
        }

        @Override // p662o0oooO0O.ooo0Oo0
        @NotNull
        public final oO00000o timeout() {
            return this.f59260OooO0Oo;
        }

        @Override // p662o0oooO0O.ooo0Oo0
        public final void write(@NotNull oo0OOoo source, long j) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (!(!this.f59262OooO0o0)) {
                throw new IllegalStateException("closed".toString());
            }
            long j2 = source.f59828OooO0o0;
            byte[] bArr = oO000o00.f58124OooO00o;
            if ((0 | j) < 0 || 0 > j2 || j2 - 0 < j) {
                throw new ArrayIndexOutOfBoundsException();
            }
            this.f59261OooO0o.f59256OooO0Oo.write(source, j);
        }
    }

    public abstract class OooO00o implements oO00000 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final o0OO00OO f59263OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o000oOoO f59264OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f59265OooO0o0;

        public OooO00o(o000oOoO this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f59264OooO0o = this$0;
            this.f59263OooO0Oo = new o0OO00OO(this$0.f59255OooO0OO.timeout());
        }

        public final void OooO00o() {
            o000oOoO o000oooo2 = this.f59264OooO0o;
            int i = o000oooo2.f59258OooO0o0;
            if (i == 6) {
                return;
            }
            if (i != 5) {
                throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(o000oooo2.f59258OooO0o0)));
            }
            o000oOoO.OooO0oo(o000oooo2, this.f59263OooO0Oo);
            o000oooo2.f59258OooO0o0 = 6;
        }

        @Override // p662o0oooO0O.oO00000
        public long OooOO0O(@NotNull oo0OOoo sink, long j) throws IOException {
            o000oOoO o000oooo2 = this.f59264OooO0o;
            Intrinsics.checkNotNullParameter(sink, "sink");
            try {
                return o000oooo2.f59255OooO0OO.OooOO0O(sink, j);
            } catch (IOException e) {
                o000oooo2.f59254OooO0O0.OooOO0o();
                OooO00o();
                throw e;
            }
        }

        @Override // p662o0oooO0O.oO00000
        @NotNull
        public final oO00000o timeout() {
            return this.f59263OooO0Oo;
        }
    }

    public final class OooO0O0 implements ooo0Oo0 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final o0OO00OO f59266OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o000oOoO f59267OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f59268OooO0o0;

        public OooO0O0(o000oOoO this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f59267OooO0o = this$0;
            this.f59266OooO0Oo = new o0OO00OO(this$0.f59256OooO0Oo.timeout());
        }

        @Override // p662o0oooO0O.ooo0Oo0, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.f59268OooO0o0) {
                return;
            }
            this.f59268OooO0o0 = true;
            this.f59267OooO0o.f59256OooO0Oo.Oooo000("0\r\n\r\n");
            o000oOoO.OooO0oo(this.f59267OooO0o, this.f59266OooO0Oo);
            this.f59267OooO0o.f59258OooO0o0 = 3;
        }

        @Override // p662o0oooO0O.ooo0Oo0, java.io.Flushable
        public final synchronized void flush() {
            if (this.f59268OooO0o0) {
                return;
            }
            this.f59267OooO0o.f59256OooO0Oo.flush();
        }

        @Override // p662o0oooO0O.ooo0Oo0
        @NotNull
        public final oO00000o timeout() {
            return this.f59266OooO0Oo;
        }

        @Override // p662o0oooO0O.ooo0Oo0
        public final void write(@NotNull oo0OOoo source, long j) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (!(!this.f59268OooO0o0)) {
                throw new IllegalStateException("closed".toString());
            }
            if (j == 0) {
                return;
            }
            o000oOoO o000oooo2 = this.f59267OooO0o;
            o000oooo2.f59256OooO0Oo.o00000O(j);
            o0O0o00O o0o0o00o = o000oooo2.f59256OooO0Oo;
            o0o0o00o.Oooo000("\r\n");
            o0o0o00o.write(source, j);
            o0o0o00o.Oooo000("\r\n");
        }
    }

    public final class OooO0OO extends OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f59269OooO;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @NotNull
        public final o0O000O f59270OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public long f59271OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ o000oOoO f59272OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(@NotNull o000oOoO this$0, o0O000O url) {
            super(this$0);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(url, "url");
            this.f59272OooOO0 = this$0;
            this.f59270OooO0oO = url;
            this.f59271OooO0oo = -1L;
            this.f59269OooO = true;
        }

        @Override // o0ooo0.o000oOoO.OooO00o, p662o0oooO0O.oO00000
        public final long OooOO0O(@NotNull oo0OOoo sink, long j) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            boolean z = true;
            if (!(j >= 0)) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(j)).toString());
            }
            if (!(!this.f59265OooO0o0)) {
                throw new IllegalStateException("closed".toString());
            }
            if (!this.f59269OooO) {
                return -1L;
            }
            long j2 = this.f59271OooO0oo;
            o000oOoO o000oooo2 = this.f59272OooOO0;
            if (j2 == 0 || j2 == -1) {
                if (j2 != -1) {
                    o000oooo2.f59255OooO0OO.OoooO0O();
                }
                try {
                    this.f59271OooO0oo = o000oooo2.f59255OooO0OO.o0000Oo0();
                    String string = StringsKt.trim((CharSequence) o000oooo2.f59255OooO0OO.OoooO0O()).toString();
                    if (this.f59271OooO0oo >= 0) {
                        if (string.length() <= 0) {
                            z = false;
                        }
                        if (!z || StringsKt__StringsJVMKt.startsWith$default(string, ";", false, 2, null)) {
                            if (this.f59271OooO0oo == 0) {
                                this.f59269OooO = false;
                                o000oooo2.f59259OooO0oO = o000oooo2.f59257OooO0o.OooO00o();
                                o0OoO00O o0ooo00o2 = o000oooo2.f59253OooO00o;
                                Intrinsics.checkNotNull(o0ooo00o2);
                                o0O00o0 o0o00o1 = o0ooo00o2.f57894OooOOO0;
                                o0O000 o0o001 = o000oooo2.f59259OooO0oO;
                                Intrinsics.checkNotNull(o0o001);
                                o000OO0O.OooO0O0(o0o00o1, this.f59270OooO0oO, o0o001);
                                OooO00o();
                            }
                            if (!this.f59269OooO) {
                                return -1L;
                            }
                        }
                    }
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f59271OooO0oo + string + Typography.quote);
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long jOooOO0O = super.OooOO0O(sink, Math.min(j, this.f59271OooO0oo));
            if (jOooOO0O != -1) {
                this.f59271OooO0oo -= jOooOO0O;
                return jOooOO0O;
            }
            o000oooo2.f59254OooO0O0.OooOO0o();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            OooO00o();
            throw protocolException;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f59265OooO0o0) {
                return;
            }
            if (this.f59269OooO && !oO000o00.OooO0oo(this, TimeUnit.MILLISECONDS)) {
                this.f59272OooOO0.f59254OooO0O0.OooOO0o();
                OooO00o();
            }
            this.f59265OooO0o0 = true;
        }
    }

    public final class OooO0o extends OooO00o {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public long f59273OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ o000oOoO f59274OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(o000oOoO this$0, long j) {
            super(this$0);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f59274OooO0oo = this$0;
            this.f59273OooO0oO = j;
            if (j == 0) {
                OooO00o();
            }
        }

        @Override // o0ooo0.o000oOoO.OooO00o, p662o0oooO0O.oO00000
        public final long OooOO0O(@NotNull oo0OOoo sink, long j) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(j)).toString());
            }
            if (!(!this.f59265OooO0o0)) {
                throw new IllegalStateException("closed".toString());
            }
            long j2 = this.f59273OooO0oO;
            if (j2 == 0) {
                return -1L;
            }
            long jOooOO0O = super.OooOO0O(sink, Math.min(j2, j));
            if (jOooOO0O == -1) {
                this.f59274OooO0oo.f59254OooO0O0.OooOO0o();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                OooO00o();
                throw protocolException;
            }
            long j3 = this.f59273OooO0oO - jOooOO0O;
            this.f59273OooO0oO = j3;
            if (j3 == 0) {
                OooO00o();
            }
            return jOooOO0O;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f59265OooO0o0) {
                return;
            }
            if (this.f59273OooO0oO != 0 && !oO000o00.OooO0oo(this, TimeUnit.MILLISECONDS)) {
                this.f59274OooO0oo.f59254OooO0O0.OooOO0o();
                OooO00o();
            }
            this.f59265OooO0o0 = true;
        }
    }

    public final class OooOO0 extends OooO00o {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f59275OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(o000oOoO this$0) {
            super(this$0);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
        }

        @Override // o0ooo0.o000oOoO.OooO00o, p662o0oooO0O.oO00000
        public final long OooOO0O(@NotNull oo0OOoo sink, long j) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(j)).toString());
            }
            if (!(!this.f59265OooO0o0)) {
                throw new IllegalStateException("closed".toString());
            }
            if (this.f59275OooO0oO) {
                return -1L;
            }
            long jOooOO0O = super.OooOO0O(sink, j);
            if (jOooOO0O != -1) {
                return jOooOO0O;
            }
            this.f59275OooO0oO = true;
            OooO00o();
            return -1L;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f59265OooO0o0) {
                return;
            }
            if (!this.f59275OooO0oO) {
                OooO00o();
            }
            this.f59265OooO0o0 = true;
        }
    }

    public o000oOoO(@Nullable o0OoO00O o0ooo00o2, @NotNull o0000O0O connection, @NotNull o0O0o0 source, @NotNull o0O0o00O sink) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f59253OooO00o = o0ooo00o2;
        this.f59254OooO0O0 = connection;
        this.f59255OooO0OO = source;
        this.f59256OooO0Oo = sink;
        this.f59257OooO0o = new Oooo0(source);
    }

    public static final void OooO0oo(o000oOoO o000oooo2, o0OO00OO o0oo00oo2) {
        o000oooo2.getClass();
        oO00000o oo00000o = o0oo00oo2.f59773OooO0o0;
        oO00000o.OooO00o delegate = oO00000o.f59811OooO0Oo;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        o0oo00oo2.f59773OooO0o0 = delegate;
        oo00000o.OooO00o();
        oo00000o.OooO0O0();
    }

    public final OooO0o OooO(long j) {
        int i = this.f59258OooO0o0;
        if (!(i == 4)) {
            throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i)).toString());
        }
        this.f59258OooO0o0 = 5;
        return new OooO0o(this, j);
    }

    @Override // p654o0ooo00o.o000O0Oo
    public final void OooO00o() {
        this.f59256OooO0Oo.flush();
    }

    @Override // p654o0ooo00o.o000O0Oo
    @NotNull
    public final oO00000 OooO0O0(@NotNull o0O00o00 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!o000OO0O.OooO00o(response)) {
            return OooO(0L);
        }
        if (StringsKt__StringsJVMKt.equals("chunked", response.OooO0OO("Transfer-Encoding", null), true)) {
            o0O000O o0o000o = response.f57847OooO0Oo.f57828OooO00o;
            int i = this.f59258OooO0o0;
            if (!(i == 4)) {
                throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i)).toString());
            }
            this.f59258OooO0o0 = 5;
            return new OooO0OO(this, o0o000o);
        }
        long jOooOO0O = oO000o00.OooOO0O(response);
        if (jOooOO0O != -1) {
            return OooO(jOooOO0O);
        }
        int i2 = this.f59258OooO0o0;
        if (!(i2 == 4)) {
            throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i2)).toString());
        }
        this.f59258OooO0o0 = 5;
        this.f59254OooO0O0.OooOO0o();
        return new OooOO0(this);
    }

    @Override // p654o0ooo00o.o000O0Oo
    @NotNull
    public final ooo0Oo0 OooO0OO(@NotNull o0O00O0o request, long j) throws ProtocolException {
        Intrinsics.checkNotNullParameter(request, "request");
        o0oO0Ooo o0oo0ooo2 = request.f57831OooO0Oo;
        if (o0oo0ooo2 != null && o0oo0ooo2.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (StringsKt__StringsJVMKt.equals("chunked", request.OooO0O0("Transfer-Encoding"), true)) {
            int i = this.f59258OooO0o0;
            if (!(i == 1)) {
                throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i)).toString());
            }
            this.f59258OooO0o0 = 2;
            return new OooO0O0(this);
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        int i2 = this.f59258OooO0o0;
        if (!(i2 == 1)) {
            throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i2)).toString());
        }
        this.f59258OooO0o0 = 2;
        return new OooO(this);
    }

    @Override // p654o0ooo00o.o000O0Oo
    public final void OooO0Oo(@NotNull o0O00O0o request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Proxy.Type proxyType = this.f59254OooO0O0.f59345OooO0O0.f57963OooO0O0.type();
        Intrinsics.checkNotNullExpressionValue(proxyType, "connection.route().proxy.type()");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proxyType, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(request.f57829OooO0O0);
        sb.append(' ');
        o0O000O url = request.f57828OooO00o;
        if (!url.f57797OooOO0 && proxyType == Proxy.Type.HTTP) {
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
        OooOO0(request.f57830OooO0OO, string);
    }

    @Override // p654o0ooo00o.o000O0Oo
    public final long OooO0o(@NotNull o0O00o00 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!o000OO0O.OooO00o(response)) {
            return 0L;
        }
        if (StringsKt__StringsJVMKt.equals("chunked", response.OooO0OO("Transfer-Encoding", null), true)) {
            return -1L;
        }
        return oO000o00.OooOO0O(response);
    }

    @Override // p654o0ooo00o.o000O0Oo
    @Nullable
    public final o0O00o00.OooO00o OooO0o0(boolean z) {
        Oooo0 oooo0 = this.f59257OooO0o;
        int i = this.f59258OooO0o0;
        boolean z2 = true;
        if (i != 1 && i != 3) {
            z2 = false;
        }
        if (!z2) {
            throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i)).toString());
        }
        try {
            String strOooOooO = oooo0.f59251OooO00o.OooOooO(oooo0.f59252OooO0O0);
            oooo0.f59252OooO0O0 -= (long) strOooOooO.length();
            o00 o00VarOooO00o = o00.OooO00o.OooO00o(strOooOooO);
            int i2 = o00VarOooO00o.f59393OooO0O0;
            o0O00o00.OooO00o oooO00o = new o0O00o00.OooO00o();
            Protocol protocol = o00VarOooO00o.f59392OooO00o;
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            oooO00o.f57862OooO0O0 = protocol;
            oooO00o.f57863OooO0OO = i2;
            String message = o00VarOooO00o.f59394OooO0OO;
            Intrinsics.checkNotNullParameter(message, "message");
            oooO00o.f57864OooO0Oo = message;
            oooO00o.OooO0OO(oooo0.OooO00o());
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.f59258OooO0o0 = 3;
                return oooO00o;
            }
            this.f59258OooO0o0 = 4;
            return oooO00o;
        } catch (EOFException e) {
            throw new IOException(Intrinsics.stringPlus("unexpected end of stream on ", this.f59254OooO0O0.f59345OooO0O0.f57962OooO00o.f57743OooO.OooO()), e);
        }
    }

    @Override // p654o0ooo00o.o000O0Oo
    public final void OooO0oO() throws IOException {
        this.f59256OooO0Oo.flush();
    }

    public final void OooOO0(@NotNull o0O000 headers, @NotNull String requestLine) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(requestLine, "requestLine");
        int i = this.f59258OooO0o0;
        if (!(i == 0)) {
            throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i)).toString());
        }
        o0O0o00O o0o0o00o = this.f59256OooO0Oo;
        o0o0o00o.Oooo000(requestLine).Oooo000("\r\n");
        int length = headers.f57773OooO0Oo.length / 2;
        for (int i2 = 0; i2 < length; i2++) {
            o0o0o00o.Oooo000(headers.OooO0OO(i2)).Oooo000(": ").Oooo000(headers.OooO0o0(i2)).Oooo000("\r\n");
        }
        o0o0o00o.Oooo000("\r\n");
        this.f59258OooO0o0 = 1;
    }

    @Override // p654o0ooo00o.o000O0Oo
    public final void cancel() {
        Socket socket = this.f59254OooO0O0.f59346OooO0OO;
        if (socket == null) {
            return;
        }
        oO000o00.OooO0Oo(socket);
    }

    @Override // p654o0ooo00o.o000O0Oo
    @NotNull
    public final o0000O0O getConnection() {
        return this.f59254OooO0O0;
    }
}
