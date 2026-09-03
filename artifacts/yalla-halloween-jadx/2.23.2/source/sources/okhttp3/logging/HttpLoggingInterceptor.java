package okhttp3.logging;

import com.zego.zegoavkit2.ZegoConstants;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import p004OooO0oO.o000oOoO;
import p037OoooOo0.o000O0o;
import p641o0ooOO0o.o0O000;
import p641o0ooOO0o.o0O000Oo;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0O00oO0;
import p641o0ooOO0o.o0OoOoOo;
import p641o0ooOO0o.o0oO0Ooo;
import p653o0ooo00O.o0000O0O;
import p654o0ooo00o.o000O;
import p654o0ooo00o.o000OO0O;
import p662o0oooO0O.o0O0o0;
import p662o0oooO0O.o0OO00o0;
import p662o0oooO0O.oo0OOoo;
import p663o0oooO0o.oO000O0;

/* JADX INFO: loaded from: classes5.dex */
public final class HttpLoggingInterceptor implements o0OoOoOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile Set<String> f60189OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public volatile Level f60190OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f60191OooO0OO;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Level;", "", "NONE", "BASIC", "HEADERS", "BODY", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    public interface OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @JvmField
        @NotNull
        public static final okhttp3.logging.OooO00o f60192OooO00o = new okhttp3.logging.OooO00o();

        void log(@NotNull String str);
    }

    @JvmOverloads
    public HttpLoggingInterceptor() {
        this(0);
    }

    public final void OooO00o(o0O000 o0o001, int i) {
        String strOooO0o0 = this.f60189OooO00o.contains(o0o001.OooO0OO(i)) ? "██" : o0o001.OooO0o0(i);
        this.f60191OooO0OO.log(o0o001.OooO0OO(i) + ": " + strOooO0o0);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0103 A[LOOP:0: B:45:0x0101->B:46:0x0103, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x01fc  */
    /* JADX WARN: Instruction removed from duplicated block: B:79:0x01fc, please report this as an issue */
    @Override // p641o0ooOO0o.o0OoOoOo
    @NotNull
    public final o0O00o00 intercept(@NotNull o0OoOoOo.OooO00o chain) throws Exception {
        String string;
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        char c;
        Charset UTF_8;
        int length;
        int i;
        Charset UTF_9;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Level level = this.f60190OooO0O0;
        o000O o000o = (o000O) chain;
        o0O00O0o o0o00o0o = o000o.f59401OooO0o0;
        if (level == Level.NONE) {
            return o000o.OooO0OO(o0o00o0o);
        }
        boolean z2 = level == Level.BODY;
        boolean z3 = z2 || level == Level.HEADERS;
        o0oO0Ooo o0oo0ooo2 = o0o00o0o.f57831OooO0Oo;
        o0000O0O o0000o0oOooO0O0 = o000o.OooO0O0();
        StringBuilder sb = new StringBuilder("--> ");
        sb.append(o0o00o0o.f57829OooO0O0);
        sb.append(' ');
        sb.append(o0o00o0o.f57828OooO00o);
        String str5 = "";
        if (o0000o0oOooO0O0 != null) {
            StringBuilder sb2 = new StringBuilder(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            Protocol protocol = o0000o0oOooO0O0.f59348OooO0o;
            Intrinsics.checkNotNull(protocol);
            sb2.append(protocol);
            string = sb2.toString();
        } else {
            string = "";
        }
        sb.append(string);
        String string2 = sb.toString();
        String str6 = "-byte body)";
        if (!z3 && o0oo0ooo2 != null) {
            StringBuilder sbOooO0O0 = o000O0o.OooO0O0(string2, " (");
            sbOooO0O0.append(o0oo0ooo2.contentLength());
            sbOooO0O0.append("-byte body)");
            string2 = sbOooO0O0.toString();
        }
        this.f60191OooO0OO.log(string2);
        String str7 = "-byte body omitted)";
        if (z3) {
            o0O000 o0o001 = o0o00o0o.f57830OooO0OO;
            if (o0oo0ooo2 != null) {
                o0O000Oo o0o000ooContentType = o0oo0ooo2.contentType();
                if (o0o000ooContentType != null) {
                    z = z3;
                    if (o0o001.OooO00o("Content-Type") == null) {
                        o000o = o000o;
                        this.f60191OooO0OO.log("Content-Type: " + o0o000ooContentType);
                    }
                    if (o0oo0ooo2.contentLength() == -1 && o0o001.OooO00o("Content-Length") == null) {
                        OooO00o oooO00o = this.f60191OooO0OO;
                        StringBuilder sb3 = new StringBuilder("Content-Length: ");
                        str6 = "-byte body)";
                        sb3.append(o0oo0ooo2.contentLength());
                        oooO00o.log(sb3.toString());
                    }
                    length = o0o001.f57773OooO0Oo.length / 2;
                    for (i = 0; i < length; i++) {
                        OooO00o(o0o001, i);
                    }
                    if (z2 || o0oo0ooo2 == null) {
                        str2 = str6;
                        str = str7;
                        this.f60191OooO0OO.log("--> END " + o0o00o0o.f57829OooO0O0);
                    } else {
                        String strOooO00o = o0o00o0o.f57830OooO0OO.OooO00o("Content-Encoding");
                        if ((strOooO00o == null || StringsKt__StringsJVMKt.equals(strOooO00o, "identity", true) || StringsKt__StringsJVMKt.equals(strOooO00o, "gzip", true)) ? false : true) {
                            this.f60191OooO0OO.log("--> END " + o0o00o0o.f57829OooO0O0 + " (encoded body omitted)");
                        } else if (o0oo0ooo2.isDuplex()) {
                            this.f60191OooO0OO.log("--> END " + o0o00o0o.f57829OooO0O0 + " (duplex request body omitted)");
                        } else if (o0oo0ooo2.isOneShot()) {
                            this.f60191OooO0OO.log("--> END " + o0o00o0o.f57829OooO0O0 + " (one-shot body omitted)");
                        } else {
                            oo0OOoo oo0oooo = new oo0OOoo();
                            o0oo0ooo2.writeTo(oo0oooo);
                            o0O000Oo o0o000ooContentType2 = o0oo0ooo2.contentType();
                            if (o0o000ooContentType2 == null || (UTF_9 = o0o000ooContentType2.OooO00o(StandardCharsets.UTF_8)) == null) {
                                UTF_9 = StandardCharsets.UTF_8;
                                Intrinsics.checkNotNullExpressionValue(UTF_9, "UTF_8");
                            }
                            this.f60191OooO0OO.log(str5);
                            if (oO000O0.OooO00o(oo0oooo)) {
                                this.f60191OooO0OO.log(oo0oooo.o000000o(UTF_9));
                                OooO00o oooO00o2 = this.f60191OooO0OO;
                                StringBuilder sb4 = new StringBuilder("--> END ");
                                sb4.append(o0o00o0o.f57829OooO0O0);
                                sb4.append(" (");
                                str2 = str6;
                                sb4.append(o0oo0ooo2.contentLength());
                                sb4.append(str2);
                                oooO00o2.log(sb4.toString());
                                str = str7;
                            } else {
                                str2 = str6;
                                OooO00o oooO00o3 = this.f60191OooO0OO;
                                StringBuilder sb5 = new StringBuilder("--> END ");
                                sb5.append(o0o00o0o.f57829OooO0O0);
                                sb5.append(" (binary ");
                                sb5.append(o0oo0ooo2.contentLength());
                                str = str7;
                                sb5.append(str);
                                oooO00o3.log(sb5.toString());
                            }
                        }
                        str2 = str6;
                        str = str7;
                    }
                } else {
                    z = z3;
                }
                if (o0oo0ooo2.contentLength() == -1) {
                }
            } else {
                o000o = o000o;
                z = z3;
                str7 = "-byte body omitted)";
            }
            length = o0o001.f57773OooO0Oo.length / 2;
            while (i < length) {
                OooO00o(o0o001, i);
            }
            if (z2) {
                str2 = str6;
                str = str7;
                this.f60191OooO0OO.log("--> END " + o0o00o0o.f57829OooO0O0);
            } else {
                str2 = str6;
                str = str7;
                this.f60191OooO0OO.log("--> END " + o0o00o0o.f57829OooO0O0);
            }
        } else {
            o000o = o000o;
            z = z3;
            str = "-byte body omitted)";
            str5 = "";
            str2 = "-byte body)";
        }
        long jNanoTime = System.nanoTime();
        try {
            o0O00o00 o0o00o00OooO0OO = o000o.OooO0OO(o0o00o0o);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            o0O00oO0 o0o00oo1 = o0o00o00OooO0OO.f57852OooOO0;
            Intrinsics.checkNotNull(o0o00oo1);
            long jOooO0OO = o0o00oo1.OooO0OO();
            String str8 = jOooO0OO != -1 ? jOooO0OO + "-byte" : "unknown-length";
            OooO00o oooO00o4 = this.f60191OooO0OO;
            String str9 = str;
            StringBuilder sb6 = new StringBuilder("<-- ");
            sb6.append(o0o00o00OooO0OO.f57850OooO0oO);
            if (o0o00o00OooO0OO.f57848OooO0o.length() == 0) {
                str3 = str5;
                c = ' ';
                str4 = str3;
            } else {
                str3 = str5;
                str4 = String.valueOf(' ') + o0o00o00OooO0OO.f57848OooO0o;
                c = ' ';
            }
            sb6.append(str4);
            sb6.append(c);
            sb6.append(o0o00o00OooO0OO.f57847OooO0Oo.f57828OooO00o);
            sb6.append(" (");
            sb6.append(millis);
            sb6.append("ms");
            sb6.append(!z ? o000oOoO.OooO0O0(", ", str8, " body") : str3);
            sb6.append(')');
            oooO00o4.log(sb6.toString());
            if (z) {
                o0O000 o0o002 = o0o00o00OooO0OO.f57846OooO;
                int length2 = o0o002.f57773OooO0Oo.length / 2;
                for (int i2 = 0; i2 < length2; i2++) {
                    OooO00o(o0o002, i2);
                }
                if (z2 && o000OO0O.OooO00o(o0o00o00OooO0OO)) {
                    String strOooO00o2 = o0o00o00OooO0OO.f57846OooO.OooO00o("Content-Encoding");
                    if ((strOooO00o2 == null || StringsKt__StringsJVMKt.equals(strOooO00o2, "identity", true) || StringsKt__StringsJVMKt.equals(strOooO00o2, "gzip", true)) ? false : true) {
                        this.f60191OooO0OO.log("<-- END HTTP (encoded body omitted)");
                    } else {
                        o0O0o0 o0o0o0OooOOo = o0o00oo1.OooOOo();
                        o0o0o0OooOOo.request(LongCompanionObject.MAX_VALUE);
                        oo0OOoo oo0ooooOooO0O0 = o0o0o0OooOOo.OooO0O0();
                        Long l = null;
                        if (StringsKt__StringsJVMKt.equals("gzip", o0o002.OooO00o("Content-Encoding"), true)) {
                            Long lValueOf = Long.valueOf(oo0ooooOooO0O0.f59828OooO0o0);
                            o0OO00o0 o0oo00o1 = new o0OO00o0(oo0ooooOooO0O0.clone());
                            try {
                                oo0ooooOooO0O0 = new oo0OOoo();
                                oo0ooooOooO0O0.o00Oo0(o0oo00o1);
                                CloseableKt.closeFinally(o0oo00o1, null);
                                l = lValueOf;
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    CloseableKt.closeFinally(o0oo00o1, th);
                                    throw th2;
                                }
                            }
                        }
                        o0O000Oo o0o000ooOooO0oO = o0o00oo1.OooO0oO();
                        if (o0o000ooOooO0oO == null || (UTF_8 = o0o000ooOooO0oO.OooO00o(StandardCharsets.UTF_8)) == null) {
                            UTF_8 = StandardCharsets.UTF_8;
                            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                        }
                        if (!oO000O0.OooO00o(oo0ooooOooO0O0)) {
                            this.f60191OooO0OO.log(str3);
                            this.f60191OooO0OO.log("<-- END HTTP (binary " + oo0ooooOooO0O0.f59828OooO0o0 + str9);
                            return o0o00o00OooO0OO;
                        }
                        String str10 = str3;
                        if (jOooO0OO != 0) {
                            this.f60191OooO0OO.log(str10);
                            this.f60191OooO0OO.log(oo0ooooOooO0O0.clone().o000000o(UTF_8));
                        }
                        if (l != null) {
                            this.f60191OooO0OO.log("<-- END HTTP (" + oo0ooooOooO0O0.f59828OooO0o0 + "-byte, " + l + "-gzipped-byte body)");
                        } else {
                            this.f60191OooO0OO.log("<-- END HTTP (" + oo0ooooOooO0O0.f59828OooO0o0 + str2);
                        }
                    }
                } else {
                    this.f60191OooO0OO.log("<-- END HTTP");
                }
            }
            return o0o00o00OooO0OO;
        } catch (Exception e) {
            this.f60191OooO0OO.log("<-- HTTP FAILED: " + e);
            throw e;
        }
    }

    @JvmOverloads
    public HttpLoggingInterceptor(@NotNull OooO00o logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f60191OooO0OO = logger;
        this.f60189OooO00o = SetsKt.emptySet();
        this.f60190OooO0O0 = Level.NONE;
    }

    public /* synthetic */ HttpLoggingInterceptor(int i) {
        this(OooO00o.f60192OooO00o);
    }
}
