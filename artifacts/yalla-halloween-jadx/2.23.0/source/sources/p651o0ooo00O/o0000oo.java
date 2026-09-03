package p651o0ooo00O;

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
import p634o0ooO0oO.o00OO;
import p634o0ooO0oO.o00OOOO0;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0oOOo;
import p634o0ooO0oO.oo0O;
import p635o0ooO0oo.o0O000o0;
import p646o0ooOoo.oO000OOo;
import p647o0ooOooo.kc;
import p647o0ooOooo.lc;
import p647o0ooOooo.nc;
import p647o0ooOooo.qc;
import p659o0oooO00.o00O00;
import p659o0oooO00.o00O000;

/* JADX INFO: loaded from: classes5.dex */
public final class o0000oo implements kc {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final List<String> f59922OooO0oO = o0O000o0.OooOO0o("connection", ReportItem.RequestKeyHost, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static final List<String> f59923OooO0oo = o0O000o0.OooOO0o("connection", ReportItem.RequestKeyHost, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final oO000OOo f59924OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final nc f59925OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o000OOo f59926OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public volatile o0000O0O f59927OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile boolean f59928OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Protocol f59929OooO0o0;

    public o0000oo(@NotNull o00OOOO0 client, @NotNull oO000OOo connection, @NotNull nc chain, @NotNull o000OOo http2Connection) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(http2Connection, "http2Connection");
        this.f59924OooO00o = connection;
        this.f59925OooO0O0 = chain;
        this.f59926OooO0OO = http2Connection;
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f59929OooO0o0 = client.f57274OooOo0O.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // p647o0ooOooo.kc
    public final void OooO00o() throws IOException {
        o0000O0O o0000o0o2 = this.f59927OooO0Oo;
        Intrinsics.checkNotNull(o0000o0o2);
        o0000o0o2.OooO0oO().close();
    }

    @Override // p647o0ooOooo.kc
    @NotNull
    public final o00O000 OooO0O0(@NotNull o00OOOOo request, long j) {
        Intrinsics.checkNotNullParameter(request, "request");
        o0000O0O o0000o0o2 = this.f59927OooO0Oo;
        Intrinsics.checkNotNull(o0000o0o2);
        return o0000o0o2.OooO0oO();
    }

    @Override // p647o0ooOooo.kc
    public final long OooO0OO(@NotNull o0oOOo response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (lc.OooO00o(response)) {
            return o0O000o0.OooOO0O(response);
        }
        return 0L;
    }

    @Override // p647o0ooOooo.kc
    public final void OooO0Oo(@NotNull o00OOOOo request) throws IOException {
        int i;
        o0000O0O o0000o0o2;
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f59927OooO0Oo != null) {
            return;
        }
        boolean z = true;
        boolean z2 = request.f57316OooO0Oo != null;
        Intrinsics.checkNotNullParameter(request, "request");
        oo0O oo0o = request.f57315OooO0OO;
        ArrayList requestHeaders = new ArrayList((oo0o.f57369OooO0Oo.length / 2) + 4);
        requestHeaders.add(new o0OO00O(request.f57314OooO0O0, o0OO00O.f59992OooO0o));
        ByteString byteString = o0OO00O.f59994OooO0oO;
        o00OO url = request.f57313OooO00o;
        Intrinsics.checkNotNullParameter(url, "url");
        String strOooO0O0 = url.OooO0O0();
        String strOooO0Oo = url.OooO0Oo();
        if (strOooO0Oo != null) {
            strOooO0O0 = strOooO0O0 + '?' + ((Object) strOooO0Oo);
        }
        requestHeaders.add(new o0OO00O(strOooO0O0, byteString));
        String strOooO0O1 = request.OooO0O0("Host");
        if (strOooO0O1 != null) {
            requestHeaders.add(new o0OO00O(strOooO0O1, o0OO00O.f59990OooO));
        }
        requestHeaders.add(new o0OO00O(url.f57203OooO00o, o0OO00O.f59995OooO0oo));
        int length = oo0o.f57369OooO0Oo.length / 2;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            String strOooO0OO = oo0o.OooO0OO(i2);
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = strOooO0OO.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f59922OooO0oO.contains(lowerCase) || (Intrinsics.areEqual(lowerCase, "te") && Intrinsics.areEqual(oo0o.OooO0o0(i2), "trailers"))) {
                requestHeaders.add(new o0OO00O(lowerCase, oo0o.OooO0o0(i2)));
            }
            i2 = i3;
        }
        o000OOo o000ooo2 = this.f59926OooO0OO;
        o000ooo2.getClass();
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        boolean z3 = !z2;
        synchronized (o000ooo2.f59963OooOoo0) {
            synchronized (o000ooo2) {
                if (o000ooo2.f59938OooO > 1073741823) {
                    o000ooo2.OooOo00(ErrorCode.REFUSED_STREAM);
                }
                if (o000ooo2.f59944OooOO0) {
                    throw new ConnectionShutdownException();
                }
                i = o000ooo2.f59938OooO;
                o000ooo2.f59938OooO = i + 2;
                o0000o0o2 = new o0000O0O(i, o000ooo2, z3, false, null);
                if (z2 && o000ooo2.f59960OooOoO0 < o000ooo2.f59959OooOoO && o0000o0o2.f59899OooO0o0 < o0000o0o2.f59898OooO0o) {
                    z = false;
                }
                if (o0000o0o2.OooO()) {
                    o000ooo2.f59940OooO0o.put(Integer.valueOf(i), o0000o0o2);
                }
                Unit unit = Unit.INSTANCE;
            }
            o000ooo2.f59963OooOoo0.OooOOo0(i, requestHeaders, z3);
        }
        if (z) {
            o000ooo2.f59963OooOoo0.flush();
        }
        this.f59927OooO0Oo = o0000o0o2;
        if (this.f59928OooO0o) {
            o0000O0O o0000o0o3 = this.f59927OooO0Oo;
            Intrinsics.checkNotNull(o0000o0o3);
            o0000o0o3.OooO0o0(ErrorCode.CANCEL);
            throw new IOException("Canceled");
        }
        o0000O0O o0000o0o4 = this.f59927OooO0Oo;
        Intrinsics.checkNotNull(o0000o0o4);
        o0000O0O.OooO0OO oooO0OO = o0000o0o4.f59903OooOO0O;
        long j = this.f59925OooO0O0.f59721OooO0oO;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        oooO0OO.OooO0oO(j, timeUnit);
        o0000O0O o0000o0o5 = this.f59927OooO0Oo;
        Intrinsics.checkNotNull(o0000o0o5);
        o0000o0o5.f59904OooOO0o.OooO0oO(this.f59925OooO0O0.f59722OooO0oo, timeUnit);
    }

    @Override // p647o0ooOooo.kc
    @NotNull
    public final o00O00 OooO0o(@NotNull o0oOOo response) {
        Intrinsics.checkNotNullParameter(response, "response");
        o0000O0O o0000o0o2 = this.f59927OooO0Oo;
        Intrinsics.checkNotNull(o0000o0o2);
        return o0000o0o2.f59893OooO;
    }

    @Override // p647o0ooOooo.kc
    @Nullable
    public final o0oOOo.OooO00o OooO0o0(boolean z) throws IOException {
        oo0O headerBlock;
        o0000O0O o0000o0o2 = this.f59927OooO0Oo;
        Intrinsics.checkNotNull(o0000o0o2);
        synchronized (o0000o0o2) {
            o0000o0o2.f59903OooOO0O.OooO();
            while (o0000o0o2.f59900OooO0oO.isEmpty() && o0000o0o2.f59906OooOOO0 == null) {
                try {
                    o0000o0o2.OooOO0o();
                } catch (Throwable th) {
                    o0000o0o2.f59903OooOO0O.OooOOO0();
                    throw th;
                }
            }
            o0000o0o2.f59903OooOO0O.OooOOO0();
            if (!(!o0000o0o2.f59900OooO0oO.isEmpty())) {
                IOException iOException = o0000o0o2.f59905OooOOO;
                if (iOException != null) {
                    throw iOException;
                }
                ErrorCode errorCode = o0000o0o2.f59906OooOOO0;
                Intrinsics.checkNotNull(errorCode);
                throw new StreamResetException(errorCode);
            }
            oo0O oo0oRemoveFirst = o0000o0o2.f59900OooO0oO.removeFirst();
            Intrinsics.checkNotNullExpressionValue(oo0oRemoveFirst, "headersQueue.removeFirst()");
            headerBlock = oo0oRemoveFirst;
        }
        Protocol protocol = this.f59929OooO0o0;
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        oo0O.OooO00o oooO00o = new oo0O.OooO00o();
        int length = headerBlock.f57369OooO0Oo.length / 2;
        int i = 0;
        qc qcVarOooO00o = null;
        while (i < length) {
            int i2 = i + 1;
            String strOooO0OO = headerBlock.OooO0OO(i);
            String strOooO0o0 = headerBlock.OooO0o0(i);
            if (Intrinsics.areEqual(strOooO0OO, ":status")) {
                qcVarOooO00o = qc.OooO00o.OooO00o(Intrinsics.stringPlus("HTTP/1.1 ", strOooO0o0));
            } else if (!f59923OooO0oo.contains(strOooO0OO)) {
                oooO00o.OooO0O0(strOooO0OO, strOooO0o0);
            }
            i = i2;
        }
        if (qcVarOooO00o == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        o0oOOo.OooO00o oooO00o2 = new o0oOOo.OooO00o();
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        oooO00o2.f57357OooO0O0 = protocol;
        oooO00o2.f57358OooO0OO = qcVarOooO00o.f59728OooO0O0;
        String message = qcVarOooO00o.f59729OooO0OO;
        Intrinsics.checkNotNullParameter(message, "message");
        oooO00o2.f57359OooO0Oo = message;
        oooO00o2.OooO0OO(oooO00o.OooO0OO());
        if (z && oooO00o2.f57358OooO0OO == 100) {
            return null;
        }
        return oooO00o2;
    }

    @Override // p647o0ooOooo.kc
    public final void OooO0oO() throws IOException {
        this.f59926OooO0OO.f59963OooOoo0.flush();
    }

    @Override // p647o0ooOooo.kc
    public final void cancel() {
        this.f59928OooO0o = true;
        o0000O0O o0000o0o2 = this.f59927OooO0Oo;
        if (o0000o0o2 == null) {
            return;
        }
        o0000o0o2.OooO0o0(ErrorCode.CANCEL);
    }

    @Override // p647o0ooOooo.kc
    @NotNull
    public final oO000OOo getConnection() {
        return this.f59924OooO00o;
    }
}
