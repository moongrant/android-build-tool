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
import kotlin.text.StringsKt;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import p004OooO0oO.o000oOoO;
import p037OoooOo0.o000Oo0;
import p634o0ooO0oO.o00OOO0;
import p634o0ooO0oO.o00OOO00;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0O0o;
import p634o0ooO0oO.o0oOOo;
import p634o0ooO0oO.oo00oO;
import p634o0ooO0oO.oo0O;
import p646o0ooOoo.oO000OOo;
import p647o0ooOooo.lc;
import p647o0ooOooo.nc;
import p656o0ooo0oo.o0O00;
import p659o0oooO00.o0000;
import p659o0oooO00.o00000O;
import p659o0oooO00.o000O000;

/* JADX INFO: loaded from: classes5.dex */
public final class HttpLoggingInterceptor implements o00OOO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile Set<String> f60862OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public volatile Level f60863OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f60864OooO0OO;

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
        public static final okhttp3.logging.OooO00o f60865OooO00o = new okhttp3.logging.OooO00o();

        void log(@NotNull String str);
    }

    @JvmOverloads
    public HttpLoggingInterceptor() {
        this(0);
    }

    public final void OooO00o(oo0O oo0o, int i) {
        String strOooO0o0 = this.f60862OooO00o.contains(oo0o.OooO0OO(i)) ? "██" : oo0o.OooO0o0(i);
        this.f60864OooO0OO.log(oo0o.OooO0OO(i) + ": " + strOooO0o0);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0103 A[LOOP:0: B:45:0x0101->B:46:0x0103, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x01fc  */
    /* JADX WARN: Instruction removed from duplicated block: B:79:0x01fc, please report this as an issue */
    @Override // p634o0ooO0oO.o00OOO00
    @NotNull
    public final o0oOOo intercept(@NotNull o00OOO00.OooO00o chain) throws Exception {
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
        Level level = this.f60863OooO0O0;
        nc ncVar = (nc) chain;
        o00OOOOo o00ooooo2 = ncVar.f59720OooO0o0;
        if (level == Level.NONE) {
            return ncVar.OooO0O0(o00ooooo2);
        }
        boolean z2 = level == Level.BODY;
        boolean z3 = z2 || level == Level.HEADERS;
        oo00oO oo00oo = o00ooooo2.f57316OooO0Oo;
        oO000OOo oo000oooOooO0OO = ncVar.OooO0OO();
        StringBuilder sb = new StringBuilder("--> ");
        sb.append(o00ooooo2.f57314OooO0O0);
        sb.append(' ');
        sb.append(o00ooooo2.f57313OooO00o);
        String str5 = "";
        if (oo000oooOooO0OO != null) {
            StringBuilder sb2 = new StringBuilder(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            Protocol protocol = oo000oooOooO0OO.f59620OooO0o;
            Intrinsics.checkNotNull(protocol);
            sb2.append(protocol);
            string = sb2.toString();
        } else {
            string = "";
        }
        sb.append(string);
        String string2 = sb.toString();
        String str6 = "-byte body)";
        if (!z3 && oo00oo != null) {
            StringBuilder sbOooO0O0 = o000Oo0.OooO0O0(string2, " (");
            sbOooO0O0.append(oo00oo.contentLength());
            sbOooO0O0.append("-byte body)");
            string2 = sbOooO0O0.toString();
        }
        this.f60864OooO0OO.log(string2);
        String str7 = "-byte body omitted)";
        if (z3) {
            oo0O oo0o = o00ooooo2.f57315OooO0OO;
            if (oo00oo != null) {
                o00OOO0 o00ooo0ContentType = oo00oo.contentType();
                if (o00ooo0ContentType != null) {
                    z = z3;
                    if (oo0o.OooO00o("Content-Type") == null) {
                        ncVar = ncVar;
                        this.f60864OooO0OO.log("Content-Type: " + o00ooo0ContentType);
                    }
                    if (oo00oo.contentLength() == -1 && oo0o.OooO00o("Content-Length") == null) {
                        OooO00o oooO00o = this.f60864OooO0OO;
                        StringBuilder sb3 = new StringBuilder("Content-Length: ");
                        str6 = "-byte body)";
                        sb3.append(oo00oo.contentLength());
                        oooO00o.log(sb3.toString());
                    }
                    length = oo0o.f57369OooO0Oo.length / 2;
                    for (i = 0; i < length; i++) {
                        OooO00o(oo0o, i);
                    }
                    if (z2 || oo00oo == null) {
                        str2 = str6;
                        str = str7;
                        this.f60864OooO0OO.log("--> END " + o00ooooo2.f57314OooO0O0);
                    } else {
                        String strOooO00o = o00ooooo2.f57315OooO0OO.OooO00o("Content-Encoding");
                        if ((strOooO00o == null || StringsKt.OooOO0o(strOooO00o, "identity") || StringsKt.OooOO0o(strOooO00o, "gzip")) ? false : true) {
                            this.f60864OooO0OO.log("--> END " + o00ooooo2.f57314OooO0O0 + " (encoded body omitted)");
                        } else if (oo00oo.isDuplex()) {
                            this.f60864OooO0OO.log("--> END " + o00ooooo2.f57314OooO0O0 + " (duplex request body omitted)");
                        } else if (oo00oo.isOneShot()) {
                            this.f60864OooO0OO.log("--> END " + o00ooooo2.f57314OooO0O0 + " (one-shot body omitted)");
                        } else {
                            o00000O o00000o = new o00000O();
                            oo00oo.writeTo(o00000o);
                            o00OOO0 o00ooo0ContentType2 = oo00oo.contentType();
                            if (o00ooo0ContentType2 == null || (UTF_9 = o00ooo0ContentType2.OooO00o(StandardCharsets.UTF_8)) == null) {
                                UTF_9 = StandardCharsets.UTF_8;
                                Intrinsics.checkNotNullExpressionValue(UTF_9, "UTF_8");
                            }
                            this.f60864OooO0OO.log(str5);
                            if (o0O00.OooO00o(o00000o)) {
                                this.f60864OooO0OO.log(o00000o.o000000(UTF_9));
                                OooO00o oooO00o2 = this.f60864OooO0OO;
                                StringBuilder sb4 = new StringBuilder("--> END ");
                                sb4.append(o00ooooo2.f57314OooO0O0);
                                sb4.append(" (");
                                str2 = str6;
                                sb4.append(oo00oo.contentLength());
                                sb4.append(str2);
                                oooO00o2.log(sb4.toString());
                                str = str7;
                            } else {
                                str2 = str6;
                                OooO00o oooO00o3 = this.f60864OooO0OO;
                                StringBuilder sb5 = new StringBuilder("--> END ");
                                sb5.append(o00ooooo2.f57314OooO0O0);
                                sb5.append(" (binary ");
                                sb5.append(oo00oo.contentLength());
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
                if (oo00oo.contentLength() == -1) {
                }
            } else {
                ncVar = ncVar;
                z = z3;
                str7 = "-byte body omitted)";
            }
            length = oo0o.f57369OooO0Oo.length / 2;
            while (i < length) {
                OooO00o(oo0o, i);
            }
            if (z2) {
                str2 = str6;
                str = str7;
                this.f60864OooO0OO.log("--> END " + o00ooooo2.f57314OooO0O0);
            } else {
                str2 = str6;
                str = str7;
                this.f60864OooO0OO.log("--> END " + o00ooooo2.f57314OooO0O0);
            }
        } else {
            ncVar = ncVar;
            z = z3;
            str = "-byte body omitted)";
            str5 = "";
            str2 = "-byte body)";
        }
        long jNanoTime = System.nanoTime();
        try {
            o0oOOo o0ooooOooO0O0 = ncVar.OooO0O0(o00ooooo2);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            o0O0o o0o0o = o0ooooOooO0O0.f57347OooOO0;
            Intrinsics.checkNotNull(o0o0o);
            long jOooO0OO = o0o0o.OooO0OO();
            String str8 = jOooO0OO != -1 ? jOooO0OO + "-byte" : "unknown-length";
            OooO00o oooO00o4 = this.f60864OooO0OO;
            String str9 = str;
            StringBuilder sb6 = new StringBuilder("<-- ");
            sb6.append(o0ooooOooO0O0.f57345OooO0oO);
            if (o0ooooOooO0O0.f57343OooO0o.length() == 0) {
                str3 = str5;
                c = ' ';
                str4 = str3;
            } else {
                str3 = str5;
                str4 = String.valueOf(' ') + o0ooooOooO0O0.f57343OooO0o;
                c = ' ';
            }
            sb6.append(str4);
            sb6.append(c);
            sb6.append(o0ooooOooO0O0.f57342OooO0Oo.f57313OooO00o);
            sb6.append(" (");
            sb6.append(millis);
            sb6.append("ms");
            sb6.append(!z ? o000oOoO.OooO00o(", ", str8, " body") : str3);
            sb6.append(')');
            oooO00o4.log(sb6.toString());
            if (z) {
                oo0O oo0o2 = o0ooooOooO0O0.f57341OooO;
                int length2 = oo0o2.f57369OooO0Oo.length / 2;
                for (int i2 = 0; i2 < length2; i2++) {
                    OooO00o(oo0o2, i2);
                }
                if (z2 && lc.OooO00o(o0ooooOooO0O0)) {
                    String strOooO00o2 = o0ooooOooO0O0.f57341OooO.OooO00o("Content-Encoding");
                    if ((strOooO00o2 == null || StringsKt.OooOO0o(strOooO00o2, "identity") || StringsKt.OooOO0o(strOooO00o2, "gzip")) ? false : true) {
                        this.f60864OooO0OO.log("<-- END HTTP (encoded body omitted)");
                    } else {
                        o0000 o0000VarOooOOo0 = o0o0o.OooOOo0();
                        o0000VarOooOOo0.request(LongCompanionObject.MAX_VALUE);
                        o00000O o00000oOooO0O0 = o0000VarOooOOo0.OooO0O0();
                        Long l = null;
                        if (StringsKt.OooOO0o("gzip", oo0o2.OooO00o("Content-Encoding"))) {
                            Long lValueOf = Long.valueOf(o00000oOooO0O0.f60177OooO0o0);
                            o000O000 o000o001 = new o000O000(o00000oOooO0O0.clone());
                            try {
                                o00000oOooO0O0 = new o00000O();
                                o00000oOooO0O0.Oooo000(o000o001);
                                CloseableKt.closeFinally(o000o001, null);
                                l = lValueOf;
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    CloseableKt.closeFinally(o000o001, th);
                                    throw th2;
                                }
                            }
                        }
                        o00OOO0 o00ooo0OooO0oO = o0o0o.OooO0oO();
                        if (o00ooo0OooO0oO == null || (UTF_8 = o00ooo0OooO0oO.OooO00o(StandardCharsets.UTF_8)) == null) {
                            UTF_8 = StandardCharsets.UTF_8;
                            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                        }
                        if (!o0O00.OooO00o(o00000oOooO0O0)) {
                            this.f60864OooO0OO.log(str3);
                            this.f60864OooO0OO.log("<-- END HTTP (binary " + o00000oOooO0O0.f60177OooO0o0 + str9);
                            return o0ooooOooO0O0;
                        }
                        String str10 = str3;
                        if (jOooO0OO != 0) {
                            this.f60864OooO0OO.log(str10);
                            this.f60864OooO0OO.log(o00000oOooO0O0.clone().o000000(UTF_8));
                        }
                        if (l != null) {
                            this.f60864OooO0OO.log("<-- END HTTP (" + o00000oOooO0O0.f60177OooO0o0 + "-byte, " + l + "-gzipped-byte body)");
                        } else {
                            this.f60864OooO0OO.log("<-- END HTTP (" + o00000oOooO0O0.f60177OooO0o0 + str2);
                        }
                    }
                } else {
                    this.f60864OooO0OO.log("<-- END HTTP");
                }
            }
            return o0ooooOooO0O0;
        } catch (Exception e) {
            this.f60864OooO0OO.log("<-- HTTP FAILED: " + e);
            throw e;
        }
    }

    @JvmOverloads
    public HttpLoggingInterceptor(@NotNull OooO00o logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f60864OooO0OO = logger;
        this.f60862OooO00o = SetsKt.emptySet();
        this.f60863OooO0O0 = Level.NONE;
    }

    public /* synthetic */ HttpLoggingInterceptor(int i) {
        this(OooO00o.f60865OooO00o);
    }
}
