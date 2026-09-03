package p655o0ooo0O;

import com.qiniu.android.collect.ReportItem;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p641o0ooOO0o.o0O000;
import p641o0ooOO0o.o0O000O;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0OoO00O;
import p648o0ooOoo.oO000o00;
import p653o0ooo00O.o0000O0O;
import p654o0ooo00o.o00;
import p654o0ooo00o.o000O;
import p654o0ooo00o.o000O0Oo;
import p654o0ooo00o.o000OO0O;
import p662o0oooO0O.oO00000;
import p662o0oooO0O.ooo0Oo0;

/* JADX INFO: loaded from: classes5.dex */
public final class oO0000o0 implements o000O0Oo {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final List<String> f59524OooO0oO = oO000o00.OooOO0o("connection", ReportItem.RequestKeyHost, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static final List<String> f59525OooO0oo = oO000o00.OooOO0o("connection", ReportItem.RequestKeyHost, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0000O0O f59526OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o000O f59527OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o0OOo000 f59528OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public volatile oO000O0 f59529OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile boolean f59530OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Protocol f59531OooO0o0;

    public oO0000o0(@NotNull o0OoO00O client, @NotNull o0000O0O connection, @NotNull o000O chain, @NotNull o0OOo000 http2Connection) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(http2Connection, "http2Connection");
        this.f59526OooO00o = connection;
        this.f59527OooO0O0 = chain;
        this.f59528OooO0OO = http2Connection;
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f59531OooO0o0 = client.f57903OooOo0O.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // p654o0ooo00o.o000O0Oo
    public final void OooO00o() throws IOException {
        oO000O0 oo000o0 = this.f59529OooO0Oo;
        Intrinsics.checkNotNull(oo000o0);
        oo000o0.OooO0oO().close();
    }

    @Override // p654o0ooo00o.o000O0Oo
    @NotNull
    public final oO00000 OooO0O0(@NotNull o0O00o00 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        oO000O0 oo000o0 = this.f59529OooO0Oo;
        Intrinsics.checkNotNull(oo000o0);
        return oo000o0.f59532OooO;
    }

    @Override // p654o0ooo00o.o000O0Oo
    @NotNull
    public final ooo0Oo0 OooO0OO(@NotNull o0O00O0o request, long j) {
        Intrinsics.checkNotNullParameter(request, "request");
        oO000O0 oo000o0 = this.f59529OooO0Oo;
        Intrinsics.checkNotNull(oo000o0);
        return oo000o0.OooO0oO();
    }

    @Override // p654o0ooo00o.o000O0Oo
    public final void OooO0Oo(@NotNull o0O00O0o request) throws IOException {
        int i;
        oO000O0 oo000o0;
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f59529OooO0Oo != null) {
            return;
        }
        boolean z = true;
        boolean z2 = request.f57831OooO0Oo != null;
        Intrinsics.checkNotNullParameter(request, "request");
        o0O000 o0o001 = request.f57830OooO0OO;
        ArrayList requestHeaders = new ArrayList((o0o001.f57773OooO0Oo.length / 2) + 4);
        requestHeaders.add(new o0OOO0OO(request.f57829OooO0O0, o0OOO0OO.f59419OooO0o));
        ByteString byteString = o0OOO0OO.f59421OooO0oO;
        o0O000O url = request.f57828OooO00o;
        Intrinsics.checkNotNullParameter(url, "url");
        String strOooO0O0 = url.OooO0O0();
        String strOooO0Oo = url.OooO0Oo();
        if (strOooO0Oo != null) {
            strOooO0O0 = strOooO0O0 + '?' + ((Object) strOooO0Oo);
        }
        requestHeaders.add(new o0OOO0OO(strOooO0O0, byteString));
        String strOooO0O1 = request.OooO0O0("Host");
        if (strOooO0O1 != null) {
            requestHeaders.add(new o0OOO0OO(strOooO0O1, o0OOO0OO.f59417OooO));
        }
        requestHeaders.add(new o0OOO0OO(url.f57789OooO00o, o0OOO0OO.f59422OooO0oo));
        int length = o0o001.f57773OooO0Oo.length / 2;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            String strOooO0OO = o0o001.OooO0OO(i2);
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = strOooO0OO.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f59524OooO0oO.contains(lowerCase) || (Intrinsics.areEqual(lowerCase, "te") && Intrinsics.areEqual(o0o001.OooO0o0(i2), "trailers"))) {
                requestHeaders.add(new o0OOO0OO(lowerCase, o0o001.OooO0o0(i2)));
            }
            i2 = i3;
        }
        o0OOo000 o0ooo001 = this.f59528OooO0OO;
        o0ooo001.getClass();
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        boolean z3 = !z2;
        synchronized (o0ooo001.f59476OooOoo0) {
            synchronized (o0ooo001) {
                if (o0ooo001.f59451OooO > 1073741823) {
                    o0ooo001.OooOo0(ErrorCode.REFUSED_STREAM);
                }
                if (o0ooo001.f59457OooOO0) {
                    throw new ConnectionShutdownException();
                }
                i = o0ooo001.f59451OooO;
                o0ooo001.f59451OooO = i + 2;
                oo000o0 = new oO000O0(i, o0ooo001, z3, false, null);
                if (z2 && o0ooo001.f59473OooOoO0 < o0ooo001.f59472OooOoO && oo000o0.f59538OooO0o0 < oo000o0.f59537OooO0o) {
                    z = false;
                }
                if (oo000o0.OooO()) {
                    o0ooo001.f59453OooO0o.put(Integer.valueOf(i), oo000o0);
                }
                Unit unit = Unit.INSTANCE;
            }
            o0ooo001.f59476OooOoo0.OooOOo(i, requestHeaders, z3);
        }
        if (z) {
            o0ooo001.f59476OooOoo0.flush();
        }
        this.f59529OooO0Oo = oo000o0;
        if (this.f59530OooO0o) {
            oO000O0 oo000o1 = this.f59529OooO0Oo;
            Intrinsics.checkNotNull(oo000o1);
            oo000o1.OooO0o0(ErrorCode.CANCEL);
            throw new IOException("Canceled");
        }
        oO000O0 oo000o2 = this.f59529OooO0Oo;
        Intrinsics.checkNotNull(oo000o2);
        oO000O0.OooO0OO oooO0OO = oo000o2.f59542OooOO0O;
        long j = this.f59527OooO0O0.f59402OooO0oO;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        oooO0OO.OooO0oO(j, timeUnit);
        oO000O0 oo000o3 = this.f59529OooO0Oo;
        Intrinsics.checkNotNull(oo000o3);
        oo000o3.f59543OooOO0o.OooO0oO(this.f59527OooO0O0.f59403OooO0oo, timeUnit);
    }

    @Override // p654o0ooo00o.o000O0Oo
    public final long OooO0o(@NotNull o0O00o00 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (o000OO0O.OooO00o(response)) {
            return oO000o00.OooOO0O(response);
        }
        return 0L;
    }

    @Override // p654o0ooo00o.o000O0Oo
    @Nullable
    public final o0O00o00.OooO00o OooO0o0(boolean z) throws IOException {
        o0O000 headerBlock;
        oO000O0 oo000o0 = this.f59529OooO0Oo;
        Intrinsics.checkNotNull(oo000o0);
        synchronized (oo000o0) {
            oo000o0.f59542OooOO0O.OooO();
            while (oo000o0.f59539OooO0oO.isEmpty() && oo000o0.f59545OooOOO0 == null) {
                try {
                    oo000o0.OooOO0o();
                } catch (Throwable th) {
                    oo000o0.f59542OooOO0O.OooOOO0();
                    throw th;
                }
            }
            oo000o0.f59542OooOO0O.OooOOO0();
            if (!(!oo000o0.f59539OooO0oO.isEmpty())) {
                IOException iOException = oo000o0.f59544OooOOO;
                if (iOException != null) {
                    throw iOException;
                }
                ErrorCode errorCode = oo000o0.f59545OooOOO0;
                Intrinsics.checkNotNull(errorCode);
                throw new StreamResetException(errorCode);
            }
            o0O000 o0o000RemoveFirst = oo000o0.f59539OooO0oO.removeFirst();
            Intrinsics.checkNotNullExpressionValue(o0o000RemoveFirst, "headersQueue.removeFirst()");
            headerBlock = o0o000RemoveFirst;
        }
        Protocol protocol = this.f59531OooO0o0;
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        o0O000.OooO00o oooO00o = new o0O000.OooO00o();
        int length = headerBlock.f57773OooO0Oo.length / 2;
        int i = 0;
        o00 o00VarOooO00o = null;
        while (i < length) {
            int i2 = i + 1;
            String strOooO0OO = headerBlock.OooO0OO(i);
            String strOooO0o0 = headerBlock.OooO0o0(i);
            if (Intrinsics.areEqual(strOooO0OO, ":status")) {
                o00VarOooO00o = o00.OooO00o.OooO00o(Intrinsics.stringPlus("HTTP/1.1 ", strOooO0o0));
            } else if (!f59525OooO0oo.contains(strOooO0OO)) {
                oooO00o.OooO0O0(strOooO0OO, strOooO0o0);
            }
            i = i2;
        }
        if (o00VarOooO00o == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        o0O00o00.OooO00o oooO00o2 = new o0O00o00.OooO00o();
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        oooO00o2.f57862OooO0O0 = protocol;
        oooO00o2.f57863OooO0OO = o00VarOooO00o.f59393OooO0O0;
        String message = o00VarOooO00o.f59394OooO0OO;
        Intrinsics.checkNotNullParameter(message, "message");
        oooO00o2.f57864OooO0Oo = message;
        oooO00o2.OooO0OO(oooO00o.OooO0OO());
        if (z && oooO00o2.f57863OooO0OO == 100) {
            return null;
        }
        return oooO00o2;
    }

    @Override // p654o0ooo00o.o000O0Oo
    public final void OooO0oO() throws IOException {
        this.f59528OooO0OO.f59476OooOoo0.flush();
    }

    @Override // p654o0ooo00o.o000O0Oo
    public final void cancel() {
        this.f59530OooO0o = true;
        oO000O0 oo000o0 = this.f59529OooO0Oo;
        if (oo000o0 == null) {
            return;
        }
        oo000o0.OooO0o0(ErrorCode.CANCEL);
    }

    @Override // p654o0ooo00o.o000O0Oo
    @NotNull
    public final o0000O0O getConnection() {
        return this.f59526OooO00o;
    }
}
