package okhttp3.logging;

import OooO0o.OooO0OO;
import com.efs.sdk.base.Constants;
import com.zego.zegoavkit2.ZegoConstants;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import p660o0ooo0o0.o00O;
import p660o0ooo0o0.o00O00O;
import p660o0ooo0o0.o00OO00O;
import p660o0ooo0o0.o00OO0O0;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o00OOOO0;
import p660o0ooo0o0.o00OOOOo;
import p660o0ooo0o0.o0o0Oo;
import p666o0oooO0o.oO00o00O;
import p666o0oooO0o.oOo00o0o;
import p674o0oooo0.o0O000;
import p674o0oooo0.o0oOO;
import p674o0oooo0.o0oOOo;
import p675o0oooo00.o00000;
import p708oo000o.Oooo0;

/* JADX INFO: loaded from: classes3.dex */
public final class HttpLoggingInterceptor implements o00OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile Set<String> f53043OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public volatile Level f53044OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f53045OooO0OO;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Level;", "", "NONE", "BASIC", "HEADERS", "BODY", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    public interface OooO00o {
        void OooO00o(@NotNull String str);
    }

    @JvmOverloads
    public HttpLoggingInterceptor(@NotNull OooO00o logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f53045OooO0OO = logger;
        this.f53043OooO00o = SetsKt.emptySet();
        this.f53044OooO0O0 = Level.NONE;
    }

    public final boolean OooO00o(o00O o00o2) {
        String strOooO00o = o00o2.OooO00o("Content-Encoding");
        return (strOooO00o == null || StringsKt.OooO(strOooO00o, "identity") || StringsKt.OooO(strOooO00o, Constants.CP_GZIP)) ? false : true;
    }

    public final void OooO0O0(o00O o00o2, int i) {
        String strOooO0o0 = this.f53043OooO00o.contains(o00o2.OooO0O0(i)) ? "██" : o00o2.OooO0o0(i);
        this.f53045OooO0OO.OooO00o(o00o2.OooO0O0(i) + ": " + strOooO0o0);
    }

    @Override // p660o0ooo0o0.o00OO00O
    @NotNull
    public final o00OOOO0 intercept(@NotNull o00OO00O.OooO00o chain) throws Exception {
        String string;
        Charset UTF_8;
        Charset UTF_9;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Level level = this.f53044OooO0O0;
        oOo00o0o ooo00o0o = (oOo00o0o) chain;
        o00OOO00 o00ooo01 = ooo00o0o.f51883OooO0o;
        if (level == Level.NONE) {
            return ooo00o0o.OooO0O0(o00ooo01);
        }
        boolean z = level == Level.BODY;
        boolean z2 = z || level == Level.HEADERS;
        o0o0Oo o0o0oo = o00ooo01.f51429OooO0o0;
        o00O00O o00o00oOooO0OO = ooo00o0o.OooO0OO();
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("--> ");
        sbOooO0o0.append(o00ooo01.f51426OooO0OO);
        sbOooO0o0.append(' ');
        sbOooO0o0.append(o00ooo01.f51425OooO0O0);
        if (o00o00oOooO0OO != null) {
            StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            Protocol protocol = ((p663o0oooO0.o00OO00O) o00o00oOooO0OO).f51784OooO0o0;
            Intrinsics.checkNotNull(protocol);
            sbOooO0o1.append(protocol);
            string = sbOooO0o1.toString();
        } else {
            string = "";
        }
        sbOooO0o0.append(string);
        String string2 = sbOooO0o0.toString();
        if (!z2 && o0o0oo != null) {
            StringBuilder sbOooO00o = Oooo0.OooO00o(string2, " (");
            sbOooO00o.append(o0o0oo.contentLength());
            sbOooO00o.append("-byte body)");
            string2 = sbOooO00o.toString();
        }
        this.f53045OooO0OO.OooO00o(string2);
        if (z2) {
            o00O o00o2 = o00ooo01.f51427OooO0Oo;
            if (o0o0oo != null) {
                o00OO0O0 o00oo0o0ContentType = o0o0oo.contentType();
                if (o00oo0o0ContentType != null && o00o2.OooO00o("Content-Type") == null) {
                    this.f53045OooO0OO.OooO00o("Content-Type: " + o00oo0o0ContentType);
                }
                if (o0o0oo.contentLength() != -1 && o00o2.OooO00o("Content-Length") == null) {
                    OooO00o oooO00o = this.f53045OooO0OO;
                    StringBuilder sbOooO0o2 = OooO00o.OooO00o.OooO0o0("Content-Length: ");
                    sbOooO0o2.append(o0o0oo.contentLength());
                    oooO00o.OooO00o(sbOooO0o2.toString());
                }
            }
            int length = o00o2.f51230Oooo0o.length / 2;
            for (int i = 0; i < length; i++) {
                OooO0O0(o00o2, i);
            }
            if (!z || o0o0oo == null) {
                OooO00o oooO00o2 = this.f53045OooO0OO;
                StringBuilder sbOooO0o3 = OooO00o.OooO00o.OooO0o0("--> END ");
                sbOooO0o3.append(o00ooo01.f51426OooO0OO);
                oooO00o2.OooO00o(sbOooO0o3.toString());
            } else if (OooO00o(o00ooo01.f51427OooO0Oo)) {
                OooO00o oooO00o3 = this.f53045OooO0OO;
                StringBuilder sbOooO0o4 = OooO00o.OooO00o.OooO0o0("--> END ");
                sbOooO0o4.append(o00ooo01.f51426OooO0OO);
                sbOooO0o4.append(" (encoded body omitted)");
                oooO00o3.OooO00o(sbOooO0o4.toString());
            } else if (o0o0oo.isDuplex()) {
                OooO00o oooO00o4 = this.f53045OooO0OO;
                StringBuilder sbOooO0o5 = OooO00o.OooO00o.OooO0o0("--> END ");
                sbOooO0o5.append(o00ooo01.f51426OooO0OO);
                sbOooO0o5.append(" (duplex request body omitted)");
                oooO00o4.OooO00o(sbOooO0o5.toString());
            } else if (o0o0oo.isOneShot()) {
                OooO00o oooO00o5 = this.f53045OooO0OO;
                StringBuilder sbOooO0o6 = OooO00o.OooO00o.OooO0o0("--> END ");
                sbOooO0o6.append(o00ooo01.f51426OooO0OO);
                sbOooO0o6.append(" (one-shot body omitted)");
                oooO00o5.OooO00o(sbOooO0o6.toString());
            } else {
                o0oOO o0ooo2 = new o0oOO();
                o0o0oo.writeTo(o0ooo2);
                o00OO0O0 o00oo0o0ContentType2 = o0o0oo.contentType();
                if (o00oo0o0ContentType2 == null || (UTF_9 = o00oo0o0ContentType2.OooO00o(StandardCharsets.UTF_8)) == null) {
                    UTF_9 = StandardCharsets.UTF_8;
                    Intrinsics.checkNotNullExpressionValue(UTF_9, "UTF_8");
                }
                this.f53045OooO0OO.OooO00o("");
                if (o00000.OooO00o(o0ooo2)) {
                    this.f53045OooO0OO.OooO00o(o0ooo2.OooooO0(UTF_9));
                    OooO00o oooO00o6 = this.f53045OooO0OO;
                    StringBuilder sbOooO0o7 = OooO00o.OooO00o.OooO0o0("--> END ");
                    sbOooO0o7.append(o00ooo01.f51426OooO0OO);
                    sbOooO0o7.append(" (");
                    sbOooO0o7.append(o0o0oo.contentLength());
                    sbOooO0o7.append("-byte body)");
                    oooO00o6.OooO00o(sbOooO0o7.toString());
                } else {
                    OooO00o oooO00o7 = this.f53045OooO0OO;
                    StringBuilder sbOooO0o8 = OooO00o.OooO00o.OooO0o0("--> END ");
                    sbOooO0o8.append(o00ooo01.f51426OooO0OO);
                    sbOooO0o8.append(" (binary ");
                    sbOooO0o8.append(o0o0oo.contentLength());
                    sbOooO0o8.append("-byte body omitted)");
                    oooO00o7.OooO00o(sbOooO0o8.toString());
                }
            }
        }
        long jNanoTime = System.nanoTime();
        try {
            o00OOOO0 o00oooo0OooO0O0 = ooo00o0o.OooO0O0(o00ooo01);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            o00OOOOo o00ooooo2 = o00oooo0OooO0O0.f51441OoooO;
            Intrinsics.checkNotNull(o00ooooo2);
            long jOooO0Oo = o00ooooo2.OooO0Oo();
            String str = jOooO0Oo != -1 ? jOooO0Oo + "-byte" : "unknown-length";
            OooO00o oooO00o8 = this.f53045OooO0OO;
            StringBuilder sbOooO0o9 = OooO00o.OooO00o.OooO0o0("<-- ");
            sbOooO0o9.append(o00oooo0OooO0O0.f51443OoooO00);
            sbOooO0o9.append(o00oooo0OooO0O0.f51437Oooo.length() == 0 ? "" : String.valueOf(' ') + o00oooo0OooO0O0.f51437Oooo);
            sbOooO0o9.append(' ');
            sbOooO0o9.append(o00oooo0OooO0O0.f51439Oooo0oO.f51425OooO0O0);
            sbOooO0o9.append(" (");
            sbOooO0o9.append(millis);
            sbOooO0o9.append("ms");
            sbOooO0o9.append(!z2 ? OooO0OO.OooO00o(", ", str, " body") : "");
            sbOooO0o9.append(')');
            oooO00o8.OooO00o(sbOooO0o9.toString());
            if (z2) {
                o00O o00o3 = o00oooo0OooO0O0.f51444OoooO0O;
                int length2 = o00o3.f51230Oooo0o.length / 2;
                for (int i2 = 0; i2 < length2; i2++) {
                    OooO0O0(o00o3, i2);
                }
                if (!z || !oO00o00O.OooO00o(o00oooo0OooO0O0)) {
                    this.f53045OooO0OO.OooO00o("<-- END HTTP");
                } else if (OooO00o(o00oooo0OooO0O0.f51444OoooO0O)) {
                    this.f53045OooO0OO.OooO00o("<-- END HTTP (encoded body omitted)");
                } else {
                    o0oOOo o0ooooOooO0oo = o00ooooo2.OooO0oo();
                    o0ooooOooO0oo.request(Long.MAX_VALUE);
                    o0oOO o0oooOooO0o0 = o0ooooOooO0oo.OooO0o0();
                    Long l = null;
                    if (StringsKt.OooO(Constants.CP_GZIP, o00o3.OooO00o("Content-Encoding"))) {
                        Long lValueOf = Long.valueOf(o0oooOooO0o0.f52099Oooo0oO);
                        o0O000 o0o001 = new o0O000(o0oooOooO0o0.clone());
                        try {
                            o0oooOooO0o0 = new o0oOO();
                            o0oooOooO0o0.o0ooOOo(o0o001);
                            CloseableKt.closeFinally(o0o001, null);
                            l = lValueOf;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                CloseableKt.closeFinally(o0o001, th);
                                throw th2;
                            }
                        }
                    }
                    o00OO0O0 o00oo0o0OooO0o = o00ooooo2.OooO0o();
                    if (o00oo0o0OooO0o == null || (UTF_8 = o00oo0o0OooO0o.OooO00o(StandardCharsets.UTF_8)) == null) {
                        UTF_8 = StandardCharsets.UTF_8;
                        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                    }
                    if (!o00000.OooO00o(o0oooOooO0o0)) {
                        this.f53045OooO0OO.OooO00o("");
                        OooO00o oooO00o9 = this.f53045OooO0OO;
                        StringBuilder sbOooO0o10 = OooO00o.OooO00o.OooO0o0("<-- END HTTP (binary ");
                        sbOooO0o10.append(o0oooOooO0o0.f52099Oooo0oO);
                        sbOooO0o10.append("-byte body omitted)");
                        oooO00o9.OooO00o(sbOooO0o10.toString());
                        return o00oooo0OooO0O0;
                    }
                    if (jOooO0Oo != 0) {
                        this.f53045OooO0OO.OooO00o("");
                        this.f53045OooO0OO.OooO00o(o0oooOooO0o0.clone().OooooO0(UTF_8));
                    }
                    if (l != null) {
                        OooO00o oooO00o10 = this.f53045OooO0OO;
                        StringBuilder sbOooO0o11 = OooO00o.OooO00o.OooO0o0("<-- END HTTP (");
                        sbOooO0o11.append(o0oooOooO0o0.f52099Oooo0oO);
                        sbOooO0o11.append("-byte, ");
                        sbOooO0o11.append(l);
                        sbOooO0o11.append("-gzipped-byte body)");
                        oooO00o10.OooO00o(sbOooO0o11.toString());
                    } else {
                        OooO00o oooO00o11 = this.f53045OooO0OO;
                        StringBuilder sbOooO0o12 = OooO00o.OooO00o.OooO0o0("<-- END HTTP (");
                        sbOooO0o12.append(o0oooOooO0o0.f52099Oooo0oO);
                        sbOooO0o12.append("-byte body)");
                        oooO00o11.OooO00o(sbOooO0o12.toString());
                    }
                }
            }
            return o00oooo0OooO0O0;
        } catch (Exception e) {
            this.f53045OooO0OO.OooO00o("<-- HTTP FAILED: " + e);
            throw e;
        }
    }
}
