package p662o0oooO;

import com.qiniu.android.collect.ReportItem;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Protocol;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p659o0ooo0o.o00OOO00;
import p660o0ooo0o0.o00O;
import p660o0ooo0o0.o00OO;
import p660o0ooo0o0.o00OO000;
import p660o0ooo0o0.o00OOOO0;
import p663o0oooO0.o00OO00O;
import p666o0oooO0o.oO00o00O;
import p666o0oooO0o.oO0OOO00;
import p666o0oooO0o.oOo000Oo;
import p666o0oooO0o.oOo00o0o;
import p674o0oooo0.o0O00o00;
import p674o0oooo0.o0O0O0O;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0 implements oO0OOO00 {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final List<String> f51559OooO0oO = o00OOO00.OooOOO0("connection", ReportItem.RequestKeyHost, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final List<String> f51560OooO0oo = o00OOO00.OooOOO0("connection", ReportItem.RequestKeyHost, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile o00O0O0 f51561OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Protocol f51562OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public volatile boolean f51563OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o00OO00O f51564OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00oOoo f51565OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final oOo00o0o f51566OooO0o0;

    public o00O0(@NotNull o00OO client, @NotNull o00OO00O connection, @NotNull oOo00o0o chain, @NotNull o00oOoo http2Connection) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(http2Connection, "http2Connection");
        this.f51564OooO0Oo = connection;
        this.f51566OooO0o0 = chain;
        this.f51565OooO0o = http2Connection;
        List<Protocol> list = client.f51337OooooOo;
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f51562OooO0O0 = list.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // p666o0oooO0o.oO0OOO00
    public final void OooO00o() throws IOException {
        o00O0O0 o00o0o0 = this.f51561OooO00o;
        Intrinsics.checkNotNull(o00o0o0);
        ((o00O0O0.OooO00o) o00o0o0.OooO0oO()).close();
    }

    @Override // p666o0oooO0o.oO0OOO00
    @NotNull
    public final o00OO00O OooO0O0() {
        return this.f51564OooO0Oo;
    }

    @Override // p666o0oooO0o.oO0OOO00
    @Nullable
    public final o00OOOO0.OooO00o OooO0OO(boolean z) throws IOException {
        o00O headerBlock;
        o00O0O0 o00o0o0 = this.f51561OooO00o;
        Intrinsics.checkNotNull(o00o0o0);
        synchronized (o00o0o0) {
            o00o0o0.f51605OooO.OooO();
            while (o00o0o0.f51611OooO0o0.isEmpty() && o00o0o0.f51615OooOO0O == null) {
                try {
                    o00o0o0.OooOO0O();
                } catch (Throwable th) {
                    o00o0o0.f51605OooO.OooOOO0();
                    throw th;
                }
            }
            o00o0o0.f51605OooO.OooOOO0();
            if (!(!o00o0o0.f51611OooO0o0.isEmpty())) {
                IOException iOException = o00o0o0.f51616OooOO0o;
                if (iOException != null) {
                    throw iOException;
                }
                ErrorCode errorCode = o00o0o0.f51615OooOO0O;
                Intrinsics.checkNotNull(errorCode);
                throw new StreamResetException(errorCode);
            }
            o00O o00oRemoveFirst = o00o0o0.f51611OooO0o0.removeFirst();
            Intrinsics.checkNotNullExpressionValue(o00oRemoveFirst, "headersQueue.removeFirst()");
            headerBlock = o00oRemoveFirst;
        }
        Protocol protocol = this.f51562OooO0O0;
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int length = headerBlock.f51230Oooo0o.length / 2;
        oOo000Oo ooo000ooOooO00o = null;
        for (int i = 0; i < length; i++) {
            String name = headerBlock.OooO0O0(i);
            String value = headerBlock.OooO0o0(i);
            if (Intrinsics.areEqual(name, ":status")) {
                ooo000ooOooO00o = oOo000Oo.f51874OooO0Oo.OooO00o("HTTP/1.1 " + value);
            } else if (!f51560OooO0oo.contains(name)) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(value, "value");
                arrayList.add(name);
                arrayList.add(StringsKt.trim((CharSequence) value).toString());
            }
        }
        if (ooo000ooOooO00o == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        o00OOOO0.OooO00o oooO00o = new o00OOOO0.OooO00o();
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        oooO00o.f51453OooO0O0 = protocol;
        oooO00o.f51454OooO0OO = ooo000ooOooO00o.f51876OooO0O0;
        oooO00o.OooO0o0(ooo000ooOooO00o.f51877OooO0OO);
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        oooO00o.OooO0Oo(new o00O((String[]) array));
        if (z && oooO00o.f51454OooO0OO == 100) {
            return null;
        }
        return oooO00o;
    }

    @Override // p666o0oooO0o.oO0OOO00
    public final void OooO0Oo() throws IOException {
        this.f51565OooO0o.flush();
    }

    @Override // p666o0oooO0o.oO0OOO00
    public final long OooO0o(@NotNull o00OOOO0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (oO00o00O.OooO00o(response)) {
            return o00OOO00.OooOO0o(response);
        }
        return 0L;
    }

    @Override // p666o0oooO0o.oO0OOO00
    @NotNull
    public final o0O00o00 OooO0o0(@NotNull p660o0ooo0o0.o00OOO00 request, long j) {
        Intrinsics.checkNotNullParameter(request, "request");
        o00O0O0 o00o0o0 = this.f51561OooO00o;
        Intrinsics.checkNotNull(o00o0o0);
        return o00o0o0.OooO0oO();
    }

    @Override // p666o0oooO0o.oO0OOO00
    public final void OooO0oO(@NotNull p660o0ooo0o0.o00OOO00 request) throws IOException {
        int i;
        o00O0O0 o00o0o0;
        boolean z;
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f51561OooO00o != null) {
            return;
        }
        boolean z2 = request.f51429OooO0o0 != null;
        Intrinsics.checkNotNullParameter(request, "request");
        o00O o00o2 = request.f51427OooO0Oo;
        ArrayList requestHeaders = new ArrayList((o00o2.f51230Oooo0o.length / 2) + 4);
        requestHeaders.add(new o00(o00.f51552OooO0o, request.f51426OooO0OO));
        ByteString byteString = o00.f51554OooO0oO;
        o00OO000 url = request.f51425OooO0O0;
        Intrinsics.checkNotNullParameter(url, "url");
        String strOooO0O0 = url.OooO0O0();
        String strOooO0Oo = url.OooO0Oo();
        if (strOooO0Oo != null) {
            strOooO0O0 = strOooO0O0 + '?' + strOooO0Oo;
        }
        requestHeaders.add(new o00(byteString, strOooO0O0));
        String strOooO0O1 = request.OooO0O0("Host");
        if (strOooO0O1 != null) {
            requestHeaders.add(new o00(o00.f51550OooO, strOooO0O1));
        }
        requestHeaders.add(new o00(o00.f51555OooO0oo, request.f51425OooO0O0.f51383OooO0O0));
        int length = o00o2.f51230Oooo0o.length / 2;
        for (int i2 = 0; i2 < length; i2++) {
            String strOooO0O2 = o00o2.OooO0O0(i2);
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
            Objects.requireNonNull(strOooO0O2, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = strOooO0O2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            if (!f51559OooO0oO.contains(lowerCase) || (Intrinsics.areEqual(lowerCase, "te") && Intrinsics.areEqual(o00o2.OooO0o0(i2), "trailers"))) {
                requestHeaders.add(new o00(lowerCase, o00o2.OooO0o0(i2)));
            }
        }
        o00oOoo o00oooo2 = this.f51565OooO0o;
        Objects.requireNonNull(o00oooo2);
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        boolean z3 = !z2;
        synchronized (o00oooo2.f51686o0OoOo0) {
            synchronized (o00oooo2) {
                if (o00oooo2.f51666OoooO0 > 1073741823) {
                    o00oooo2.OooOOO(ErrorCode.REFUSED_STREAM);
                }
                if (o00oooo2.f51668OoooO0O) {
                    throw new ConnectionShutdownException();
                }
                i = o00oooo2.f51666OoooO0;
                o00oooo2.f51666OoooO0 = i + 2;
                o00o0o0 = new o00O0O0(i, o00oooo2, z3, false, null);
                z = !z2 || o00oooo2.f51680Oooooo >= o00oooo2.f51682OoooooO || o00o0o0.f51608OooO0OO >= o00o0o0.f51609OooO0Oo;
                if (o00o0o0.OooO()) {
                    o00oooo2.f51664Oooo0oo.put(Integer.valueOf(i), o00o0o0);
                }
                Unit unit = Unit.INSTANCE;
            }
            o00oooo2.f51686o0OoOo0.OooO0o(z3, i, requestHeaders);
        }
        if (z) {
            o00oooo2.f51686o0OoOo0.flush();
        }
        this.f51561OooO00o = o00o0o0;
        if (this.f51563OooO0OO) {
            o00O0O0 o00o0o1 = this.f51561OooO00o;
            Intrinsics.checkNotNull(o00o0o1);
            o00o0o1.OooO0o0(ErrorCode.CANCEL);
            throw new IOException("Canceled");
        }
        o00O0O0 o00o0o2 = this.f51561OooO00o;
        Intrinsics.checkNotNull(o00o0o2);
        o00O0O0.OooO0OO oooO0OO = o00o0o2.f51605OooO;
        long j = this.f51566OooO0o0.f51886OooO0oo;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        oooO0OO.OooO0oO(j, timeUnit);
        o00O0O0 o00o0o3 = this.f51561OooO00o;
        Intrinsics.checkNotNull(o00o0o3);
        o00o0o3.f51614OooOO0.OooO0oO(this.f51566OooO0o0.f51878OooO, timeUnit);
    }

    @Override // p666o0oooO0o.oO0OOO00
    @NotNull
    public final o0O0O0O OooO0oo(@NotNull o00OOOO0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        o00O0O0 o00o0o0 = this.f51561OooO00o;
        Intrinsics.checkNotNull(o00o0o0);
        return o00o0o0.f51612OooO0oO;
    }

    @Override // p666o0oooO0o.oO0OOO00
    public final void cancel() {
        this.f51563OooO0OO = true;
        o00O0O0 o00o0o0 = this.f51561OooO00o;
        if (o00o0o0 != null) {
            o00o0o0.OooO0o0(ErrorCode.CANCEL);
        }
    }
}
