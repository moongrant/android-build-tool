package p661o0ooo0oo;

import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.qiniu.android.http.request.Request;
import java.io.IOException;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p660o0ooo0o0.o00;
import p660o0ooo0o0.o00O;
import p660o0ooo0o0.o00O0000;
import p660o0ooo0o0.o00OO000;
import p660o0ooo0o0.o00OO00O;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o00OOOO0;
import p660o0ooo0o0.o00OOOOo;
import p660o0ooo0o0.oo0o0O0;
import p663o0oooO0.o00O0OO;
import p666o0oooO0o.oO00o00;
import p666o0oooO0o.oO00o00O;
import p666o0oooO0o.oOo00o0o;
import p666o0oooO0o.oOo00ooO;
import p674o0oooo0.o0O000Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OO00 implements o00OO00O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO00o f51489OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final o00 f51490OooO00o;

    public static final class OooO00o {
        public static final o00OOOO0 OooO00o(o00OOOO0 o00oooo1) {
            if ((o00oooo1 != null ? o00oooo1.f51441OoooO : null) == null) {
                return o00oooo1;
            }
            o00OOOO0.OooO00o oooO00o = new o00OOOO0.OooO00o(o00oooo1);
            oooO00o.f51458OooO0oO = null;
            return oooO00o.OooO00o();
        }

        public final boolean OooO0O0(String str) {
            return StringsKt.OooO("Content-Length", str) || StringsKt.OooO("Content-Encoding", str) || StringsKt.OooO("Content-Type", str);
        }

        public final boolean OooO0OO(String str) {
            return (StringsKt.OooO("Connection", str) || StringsKt.OooO("Keep-Alive", str) || StringsKt.OooO("Proxy-Authenticate", str) || StringsKt.OooO("Proxy-Authorization", str) || StringsKt.OooO("TE", str) || StringsKt.OooO("Trailers", str) || StringsKt.OooO("Transfer-Encoding", str) || StringsKt.OooO("Upgrade", str)) ? false : true;
        }
    }

    public o000OO00(@Nullable o00 o00Var) {
        this.f51490OooO00o = o00Var;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x029b  */
    /* JADX WARN: Code duplicated, block: B:113:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:114:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:117:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:122:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:124:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:126:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:129:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:131:0x02fd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:133:0x0301  */
    /* JADX WARN: Code duplicated, block: B:135:0x0304  */
    /* JADX WARN: Code duplicated, block: B:137:0x031d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x031f  */
    /* JADX WARN: Code duplicated, block: B:139:0x0323 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:140:0x0325  */
    /* JADX WARN: Code duplicated, block: B:141:0x0328 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:142:0x032a  */
    /* JADX WARN: Code duplicated, block: B:145:0x0353  */
    /* JADX WARN: Code duplicated, block: B:146:0x035a  */
    /* JADX WARN: Code duplicated, block: B:154:0x037f  */
    /* JADX WARN: Code duplicated, block: B:157:0x0389  */
    /* JADX WARN: Code duplicated, block: B:158:0x038a A[Catch: all -> 0x038e, TRY_LEAVE, TryCatch #10 {, blocks: (B:155:0x0380, B:158:0x038a), top: B:326:0x0380 }] */
    /* JADX WARN: Code duplicated, block: B:166:0x0397  */
    /* JADX WARN: Code duplicated, block: B:167:0x0399  */
    /* JADX WARN: Code duplicated, block: B:172:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:184:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:186:0x03ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:187:0x0401  */
    /* JADX WARN: Code duplicated, block: B:188:0x0405  */
    /* JADX WARN: Code duplicated, block: B:190:0x0409  */
    /* JADX WARN: Code duplicated, block: B:193:0x0416  */
    /* JADX WARN: Code duplicated, block: B:195:0x041c  */
    /* JADX WARN: Code duplicated, block: B:197:0x0434  */
    /* JADX WARN: Code duplicated, block: B:212:0x046d  */
    /* JADX WARN: Code duplicated, block: B:220:0x04ba A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:232:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:234:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:237:0x0522  */
    /* JADX WARN: Code duplicated, block: B:26:0x0107  */
    /* JADX WARN: Code duplicated, block: B:272:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:275:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:277:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:291:0x0635  */
    /* JADX WARN: Code duplicated, block: B:316:0x0638 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x04e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:0x0380 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0115  */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v32, types: [o0ooo0o0.o00OOO00, o0ooo0o0.o00OOOO0] */
    /* JADX WARN: Type inference failed for: r0v47 */
    @Override // p660o0ooo0o0.o00OO00O
    @NotNull
    public final o00OOOO0 intercept(@NotNull o00OO00O.OooO00o chain) throws IOException {
        o00OOOO0 cachedResponse;
        long time;
        int i;
        long time2;
        Date dateOooO00o;
        Date dateOooO00o2;
        Date dateOooO00o3;
        String str;
        String str2;
        String str3;
        ?? r0;
        o00O0000 cacheStrategy;
        int i2;
        long jMax;
        String string;
        long millis;
        long jMin;
        long millis2;
        int i3;
        int i4;
        long millis3;
        String str4;
        String str5;
        String str6;
        long j;
        o00OOOO0.OooO00o oooO00o;
        boolean z;
        int i5;
        o00OOO00 o00ooo01;
        o00OOOO0 cached;
        o00 o00Var;
        o00O0OO o00o0oo2;
        o00O0OO o00o0oo3;
        oo0o0O0 oo0o0o0;
        o00OOOOo o00ooooo2;
        o00OOOO0 o00oooo0OooO0O0;
        o00OOOO0 hasVaryAll;
        String method;
        boolean z2;
        o00.OooO0o oooO0o;
        o0O0ooO.OooO00o oooO00oOooO0Oo;
        o00OOOOo o00ooooo3;
        OooO00o oooO00o2;
        o00O o00o2;
        o00O o00o3;
        o00O.OooO00o oooO00o3;
        int length;
        int i6;
        int length2;
        int i7;
        o00 o00Var2;
        o00.OooO0OO oooO0OO;
        o0O0ooO.OooO00o oooO00oOooO0Oo2;
        String strOooO0O0;
        String strOooO0O1;
        String strOooO0o0;
        o00OOOOo o00ooooo4;
        boolean z3;
        boolean z4;
        Intrinsics.checkNotNullParameter(chain, "chain");
        oOo00o0o ooo00o0o = (oOo00o0o) chain;
        o00O0OO o00o0oo4 = ooo00o0o.f51880OooO0O0;
        o00 o00Var3 = this.f51490OooO00o;
        if (o00Var3 != null) {
            o00OOO00 newRequest = ooo00o0o.f51883OooO0o;
            Intrinsics.checkNotNullParameter(newRequest, "request");
            o00.OooO0O0 oooO0O0 = o00.f51191Oooo0oO;
            try {
                o0O0ooO.OooO0OO snapshot = o00Var3.f51192Oooo0o.OooO0o(oooO0O0.OooO00o(newRequest.f51425OooO0O0));
                if (snapshot != null) {
                    try {
                        o00.OooO0OO oooO0OO2 = new o00.OooO0OO(snapshot.f51548Oooo0oo.get(0));
                        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
                        String strOooO00o = oooO0OO2.f51208OooO0oO.OooO00o("Content-Type");
                        String strOooO00o2 = oooO0OO2.f51208OooO0oO.OooO00o("Content-Length");
                        o00OOO00.OooO00o oooO00o4 = new o00OOO00.OooO00o();
                        oooO00o4.OooOO0o(oooO0OO2.f51202OooO00o);
                        oooO00o4.OooO0oO(oooO0OO2.f51204OooO0OO, null);
                        oooO00o4.OooO0o(oooO0OO2.f51203OooO0O0);
                        o00OOO00 request = oooO00o4.OooO0O0();
                        o00OOOO0.OooO00o oooO00o5 = new o00OOOO0.OooO00o();
                        Intrinsics.checkNotNullParameter(request, "request");
                        oooO00o5.f51452OooO00o = request;
                        oooO00o5.OooO0o(oooO0OO2.f51205OooO0Oo);
                        oooO00o5.f51454OooO0OO = oooO0OO2.f51207OooO0o0;
                        oooO00o5.OooO0o0(oooO0OO2.f51206OooO0o);
                        oooO00o5.OooO0Oo(oooO0OO2.f51208OooO0oO);
                        oooO00o5.f51458OooO0oO = new o00.OooO00o(snapshot, strOooO00o, strOooO00o2);
                        oooO00o5.f51457OooO0o0 = oooO0OO2.f51209OooO0oo;
                        oooO00o5.f51461OooOO0O = oooO0OO2.f51201OooO;
                        oooO00o5.f51462OooOO0o = oooO0OO2.f51210OooOO0;
                        cachedResponse = oooO00o5.OooO00o();
                        Intrinsics.checkNotNullParameter(newRequest, "request");
                        Intrinsics.checkNotNullParameter(cachedResponse, "response");
                        if (Intrinsics.areEqual(oooO0OO2.f51202OooO00o, newRequest.f51425OooO0O0.f51390OooOO0) && Intrinsics.areEqual(oooO0OO2.f51204OooO0OO, newRequest.f51426OooO0OO)) {
                            o00O cachedRequest = oooO0OO2.f51203OooO0O0;
                            Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
                            Intrinsics.checkNotNullParameter(cachedRequest, "cachedRequest");
                            Intrinsics.checkNotNullParameter(newRequest, "newRequest");
                            Set<String> setOooO0OO = oooO0O0.OooO0OO(cachedResponse.f51444OoooO0O);
                            if (!(setOooO0OO instanceof Collection) || !setOooO0OO.isEmpty()) {
                                Iterator<T> it = setOooO0OO.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z4 = true;
                                        break;
                                    }
                                    String name = (String) it.next();
                                    List<String> listOooO0oO = cachedRequest.OooO0oO(name);
                                    Intrinsics.checkNotNullParameter(name, "name");
                                    if (!Intrinsics.areEqual(listOooO0oO, newRequest.f51427OooO0Oo.OooO0oO(name))) {
                                        z4 = false;
                                        break;
                                    }
                                }
                            } else {
                                z4 = true;
                                break;
                            }
                            if (z4) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } else {
                            z3 = false;
                        }
                        if (!z3) {
                            o00OOOOo o00ooooo5 = cachedResponse.f51441OoooO;
                            if (o00ooooo5 != null) {
                                p659o0ooo0o.o00OOO00.OooO0Oo(o00ooooo5);
                            }
                            cachedResponse = null;
                        }
                    } catch (IOException unused) {
                        p659o0ooo0o.o00OOO00.OooO0Oo(snapshot);
                    }
                } else {
                    cachedResponse = null;
                }
            } catch (IOException unused2) {
            }
        } else {
            cachedResponse = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        o00OOO00 request2 = ooo00o0o.f51883OooO0o;
        Intrinsics.checkNotNullParameter(request2, "request");
        if (cachedResponse != null) {
            time2 = cachedResponse.f51447OoooOOo;
            time = cachedResponse.f51448OoooOo0;
            o00O o00o4 = cachedResponse.f51444OoooO0O;
            int length3 = o00o4.f51230Oooo0o.length / 2;
            dateOooO00o = null;
            dateOooO00o2 = null;
            dateOooO00o3 = null;
            str = null;
            str2 = null;
            str3 = null;
            int i8 = 0;
            int iOooOoOO = -1;
            while (i8 < length3) {
                String strOooO0O2 = o00o4.OooO0O0(i8);
                long j2 = time;
                String strOooO0o1 = o00o4.OooO0o0(i8);
                if (StringsKt.OooO(strOooO0O2, "Date")) {
                    dateOooO00o = oO00o00.OooO00o(strOooO0o1);
                    str3 = strOooO0o1;
                } else if (StringsKt.OooO(strOooO0O2, "Expires")) {
                    dateOooO00o2 = oO00o00.OooO00o(strOooO0o1);
                } else if (StringsKt.OooO(strOooO0O2, "Last-Modified")) {
                    dateOooO00o3 = oO00o00.OooO00o(strOooO0o1);
                    str2 = strOooO0o1;
                } else if (StringsKt.OooO(strOooO0O2, "ETag")) {
                    str = strOooO0o1;
                } else if (StringsKt.OooO(strOooO0O2, "Age")) {
                    iOooOoOO = p659o0ooo0o.o00OOO00.OooOoOO(strOooO0o1, -1);
                }
                i8++;
                time = j2;
            }
            i = iOooOoOO;
        } else {
            time = 0;
            i = -1;
            time2 = 0;
            dateOooO00o = null;
            dateOooO00o2 = null;
            dateOooO00o3 = null;
            str = null;
            str2 = null;
            str3 = null;
        }
        if (cachedResponse != null) {
            if (!(request2.f51425OooO0O0.f51382OooO00o && cachedResponse.f51442OoooO0 == null) && o00O0000.f51496OooO0OO.OooO00o(cachedResponse, request2)) {
                o00O0000 o00o0000OooO00o = request2.OooO00o();
                if (o00o0000OooO00o.f51265OooO00o) {
                    ooo00o0o = ooo00o0o;
                    o00o0oo4 = o00o0oo4;
                    r0 = 0;
                    cacheStrategy = new o00O0000(request2, null);
                } else if ((request2.OooO0O0("If-Modified-Since") == null && request2.OooO0O0("If-None-Match") == null) ? false : true) {
                    ooo00o0o = ooo00o0o;
                    o00o0oo4 = o00o0oo4;
                    r0 = 0;
                    cacheStrategy = new o00O0000(request2, null);
                } else {
                    o00O0000 o00o0000OooO00o2 = cachedResponse.OooO00o();
                    if (dateOooO00o != null) {
                        jMax = Math.max(0L, time - dateOooO00o.getTime());
                        i2 = -1;
                    } else {
                        i2 = -1;
                        jMax = 0;
                    }
                    if (i != i2) {
                        jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i));
                    }
                    long j3 = jMax + (time - time2) + (jCurrentTimeMillis - time);
                    Intrinsics.checkNotNull(cachedResponse);
                    int i9 = cachedResponse.OooO00o().f51267OooO0OO;
                    if (i9 != -1) {
                        millis2 = TimeUnit.SECONDS.toMillis(i9);
                    } else {
                        if (dateOooO00o2 != null) {
                            if (dateOooO00o != null) {
                                time = dateOooO00o.getTime();
                            }
                            long time3 = dateOooO00o2.getTime() - time;
                            if (time3 > 0) {
                                millis2 = time3;
                            }
                        } else {
                            if (dateOooO00o3 != null) {
                                o00OO000 o00oo001 = cachedResponse.f51439Oooo0oO.f51425OooO0O0;
                                if (o00oo001.f51389OooO0oo == null) {
                                    string = null;
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    o00OO000.f51380OooOO0o.OooO0o(o00oo001.f51389OooO0oo, sb);
                                    string = sb.toString();
                                }
                                if (string == null) {
                                    if (dateOooO00o != null) {
                                        time2 = dateOooO00o.getTime();
                                    }
                                    Intrinsics.checkNotNull(dateOooO00o3);
                                    long time4 = time2 - dateOooO00o3.getTime();
                                    millis = 0;
                                    if (time4 > 0) {
                                        jMin = time4 / ((long) 10);
                                    }
                                }
                                jMin = millis;
                            }
                            i3 = o00o0000OooO00o.f51267OooO0OO;
                            if (i3 != -1) {
                                jMin = Math.min(jMin, TimeUnit.SECONDS.toMillis(i3));
                            }
                            i4 = o00o0000OooO00o.f51264OooO;
                            if (i4 != -1) {
                                millis3 = TimeUnit.SECONDS.toMillis(i4);
                            } else {
                                millis3 = millis;
                            }
                            if (!o00o0000OooO00o2.f51271OooO0oO && (i5 = o00o0000OooO00o.f51272OooO0oo) != -1) {
                                millis = TimeUnit.SECONDS.toMillis(i5);
                            }
                            if (o00o0000OooO00o2.f51265OooO00o) {
                                if (str != null) {
                                    str6 = "If-None-Match";
                                    str5 = str;
                                } else {
                                    if (dateOooO00o3 != null) {
                                        str4 = str2;
                                    } else if (dateOooO00o != null) {
                                        str4 = str3;
                                    } else {
                                        r0 = 0;
                                        cacheStrategy = new o00O0000(request2, null);
                                    }
                                    str5 = str4;
                                    str6 = "If-Modified-Since";
                                }
                                o00O.OooO00o oooO00oOooO0OO = request2.f51427OooO0Oo.OooO0OO();
                                Intrinsics.checkNotNull(str5);
                                oooO00oOooO0OO.OooO0OO(str6, str5);
                                o00OOO00.OooO00o oooO00o6 = new o00OOO00.OooO00o(request2);
                                oooO00o6.OooO0o(oooO00oOooO0OO.OooO0Oo());
                                cacheStrategy = new o00O0000(oooO00o6.OooO0O0(), cachedResponse);
                                r0 = 0;
                            } else {
                                j = millis3 + j3;
                                if (j < millis + jMin) {
                                    oooO00o = new o00OOOO0.OooO00o(cachedResponse);
                                    if (j >= jMin) {
                                        Intrinsics.checkNotNullParameter("Warning", "name");
                                        Intrinsics.checkNotNullParameter("110 HttpURLConnection \"Response is stale\"", AppMeasurementSdk.ConditionalUserProperty.VALUE);
                                        oooO00o.f51456OooO0o.OooO00o("Warning", "110 HttpURLConnection \"Response is stale\"");
                                    }
                                    if (j3 > 86400000) {
                                        Intrinsics.checkNotNull(cachedResponse);
                                        if (cachedResponse.OooO00o().f51267OooO0OO == -1 || dateOooO00o2 != null) {
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                        if (z) {
                                            Intrinsics.checkNotNullParameter("Warning", "name");
                                            Intrinsics.checkNotNullParameter("113 HttpURLConnection \"Heuristic expiration\"", AppMeasurementSdk.ConditionalUserProperty.VALUE);
                                            oooO00o.f51456OooO0o.OooO00o("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                        }
                                    }
                                    cacheStrategy = new o00O0000(null, oooO00o.OooO00o());
                                    r0 = 0;
                                } else {
                                    if (str != null) {
                                        str6 = "If-None-Match";
                                        str5 = str;
                                    } else {
                                        if (dateOooO00o3 != null) {
                                            str4 = str2;
                                        } else if (dateOooO00o != null) {
                                            str4 = str3;
                                        } else {
                                            r0 = 0;
                                            cacheStrategy = new o00O0000(request2, null);
                                        }
                                        str5 = str4;
                                        str6 = "If-Modified-Since";
                                    }
                                    o00O.OooO00o oooO00oOooO0OO2 = request2.f51427OooO0Oo.OooO0OO();
                                    Intrinsics.checkNotNull(str5);
                                    oooO00oOooO0OO2.OooO0OO(str6, str5);
                                    o00OOO00.OooO00o oooO00o7 = new o00OOO00.OooO00o(request2);
                                    oooO00o7.OooO0o(oooO00oOooO0OO2.OooO0Oo());
                                    cacheStrategy = new o00O0000(oooO00o7.OooO0O0(), cachedResponse);
                                    r0 = 0;
                                }
                            }
                        }
                        millis = 0;
                        jMin = millis;
                        i3 = o00o0000OooO00o.f51267OooO0OO;
                        if (i3 != -1) {
                            jMin = Math.min(jMin, TimeUnit.SECONDS.toMillis(i3));
                        }
                        i4 = o00o0000OooO00o.f51264OooO;
                        if (i4 != -1) {
                            millis3 = TimeUnit.SECONDS.toMillis(i4);
                        } else {
                            millis3 = millis;
                        }
                        if (!o00o0000OooO00o2.f51271OooO0oO) {
                            millis = TimeUnit.SECONDS.toMillis(i5);
                        }
                        if (o00o0000OooO00o2.f51265OooO00o) {
                            j = millis3 + j3;
                            if (j < millis + jMin) {
                                oooO00o = new o00OOOO0.OooO00o(cachedResponse);
                                if (j >= jMin) {
                                    Intrinsics.checkNotNullParameter("Warning", "name");
                                    Intrinsics.checkNotNullParameter("110 HttpURLConnection \"Response is stale\"", AppMeasurementSdk.ConditionalUserProperty.VALUE);
                                    oooO00o.f51456OooO0o.OooO00o("Warning", "110 HttpURLConnection \"Response is stale\"");
                                }
                                if (j3 > 86400000) {
                                    Intrinsics.checkNotNull(cachedResponse);
                                    if (cachedResponse.OooO00o().f51267OooO0OO == -1) {
                                        z = false;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        Intrinsics.checkNotNullParameter("Warning", "name");
                                        Intrinsics.checkNotNullParameter("113 HttpURLConnection \"Heuristic expiration\"", AppMeasurementSdk.ConditionalUserProperty.VALUE);
                                        oooO00o.f51456OooO0o.OooO00o("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                    }
                                }
                                cacheStrategy = new o00O0000(null, oooO00o.OooO00o());
                                r0 = 0;
                            } else {
                                if (str != null) {
                                    str6 = "If-None-Match";
                                    str5 = str;
                                } else {
                                    if (dateOooO00o3 != null) {
                                        str4 = str2;
                                    } else if (dateOooO00o != null) {
                                        str4 = str3;
                                    } else {
                                        r0 = 0;
                                        cacheStrategy = new o00O0000(request2, null);
                                    }
                                    str5 = str4;
                                    str6 = "If-Modified-Since";
                                }
                                o00O.OooO00o oooO00oOooO0OO3 = request2.f51427OooO0Oo.OooO0OO();
                                Intrinsics.checkNotNull(str5);
                                oooO00oOooO0OO3.OooO0OO(str6, str5);
                                o00OOO00.OooO00o oooO00o8 = new o00OOO00.OooO00o(request2);
                                oooO00o8.OooO0o(oooO00oOooO0OO3.OooO0Oo());
                                cacheStrategy = new o00O0000(oooO00o8.OooO0O0(), cachedResponse);
                                r0 = 0;
                            }
                        } else {
                            if (str != null) {
                                str6 = "If-None-Match";
                                str5 = str;
                            } else {
                                if (dateOooO00o3 != null) {
                                    str4 = str2;
                                } else if (dateOooO00o != null) {
                                    str4 = str3;
                                } else {
                                    r0 = 0;
                                    cacheStrategy = new o00O0000(request2, null);
                                }
                                str5 = str4;
                                str6 = "If-Modified-Since";
                            }
                            o00O.OooO00o oooO00oOooO0OO4 = request2.f51427OooO0Oo.OooO0OO();
                            Intrinsics.checkNotNull(str5);
                            oooO00oOooO0OO4.OooO0OO(str6, str5);
                            o00OOO00.OooO00o oooO00o9 = new o00OOO00.OooO00o(request2);
                            oooO00o9.OooO0o(oooO00oOooO0OO4.OooO0Oo());
                            cacheStrategy = new o00O0000(oooO00o9.OooO0O0(), cachedResponse);
                            r0 = 0;
                        }
                    }
                    jMin = millis2;
                    millis = 0;
                    i3 = o00o0000OooO00o.f51267OooO0OO;
                    if (i3 != -1) {
                        jMin = Math.min(jMin, TimeUnit.SECONDS.toMillis(i3));
                    }
                    i4 = o00o0000OooO00o.f51264OooO;
                    if (i4 != -1) {
                        millis3 = TimeUnit.SECONDS.toMillis(i4);
                    } else {
                        millis3 = millis;
                    }
                    if (!o00o0000OooO00o2.f51271OooO0oO) {
                        millis = TimeUnit.SECONDS.toMillis(i5);
                    }
                    if (o00o0000OooO00o2.f51265OooO00o) {
                        j = millis3 + j3;
                        if (j < millis + jMin) {
                            oooO00o = new o00OOOO0.OooO00o(cachedResponse);
                            if (j >= jMin) {
                                Intrinsics.checkNotNullParameter("Warning", "name");
                                Intrinsics.checkNotNullParameter("110 HttpURLConnection \"Response is stale\"", AppMeasurementSdk.ConditionalUserProperty.VALUE);
                                oooO00o.f51456OooO0o.OooO00o("Warning", "110 HttpURLConnection \"Response is stale\"");
                            }
                            if (j3 > 86400000) {
                                Intrinsics.checkNotNull(cachedResponse);
                                if (cachedResponse.OooO00o().f51267OooO0OO == -1) {
                                    z = false;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    Intrinsics.checkNotNullParameter("Warning", "name");
                                    Intrinsics.checkNotNullParameter("113 HttpURLConnection \"Heuristic expiration\"", AppMeasurementSdk.ConditionalUserProperty.VALUE);
                                    oooO00o.f51456OooO0o.OooO00o("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                }
                            }
                            cacheStrategy = new o00O0000(null, oooO00o.OooO00o());
                            r0 = 0;
                        } else {
                            if (str != null) {
                                str6 = "If-None-Match";
                                str5 = str;
                            } else {
                                if (dateOooO00o3 != null) {
                                    str4 = str2;
                                } else if (dateOooO00o != null) {
                                    str4 = str3;
                                } else {
                                    r0 = 0;
                                    cacheStrategy = new o00O0000(request2, null);
                                }
                                str5 = str4;
                                str6 = "If-Modified-Since";
                            }
                            o00O.OooO00o oooO00oOooO0OO5 = request2.f51427OooO0Oo.OooO0OO();
                            Intrinsics.checkNotNull(str5);
                            oooO00oOooO0OO5.OooO0OO(str6, str5);
                            o00OOO00.OooO00o oooO00o10 = new o00OOO00.OooO00o(request2);
                            oooO00o10.OooO0o(oooO00oOooO0OO5.OooO0Oo());
                            cacheStrategy = new o00O0000(oooO00o10.OooO0O0(), cachedResponse);
                            r0 = 0;
                        }
                    } else {
                        if (str != null) {
                            str6 = "If-None-Match";
                            str5 = str;
                        } else {
                            if (dateOooO00o3 != null) {
                                str4 = str2;
                            } else if (dateOooO00o != null) {
                                str4 = str3;
                            } else {
                                r0 = 0;
                                cacheStrategy = new o00O0000(request2, null);
                            }
                            str5 = str4;
                            str6 = "If-Modified-Since";
                        }
                        o00O.OooO00o oooO00oOooO0OO6 = request2.f51427OooO0Oo.OooO0OO();
                        Intrinsics.checkNotNull(str5);
                        oooO00oOooO0OO6.OooO0OO(str6, str5);
                        o00OOO00.OooO00o oooO00o11 = new o00OOO00.OooO00o(request2);
                        oooO00o11.OooO0o(oooO00oOooO0OO6.OooO0Oo());
                        cacheStrategy = new o00O0000(oooO00o11.OooO0O0(), cachedResponse);
                        r0 = 0;
                    }
                }
            } else {
                cacheStrategy = new o00O0000(request2, null);
            }
            if (cacheStrategy.f51497OooO00o != null && request2.OooO00o().f51273OooOO0) {
                cacheStrategy = new o00O0000(r0, r0);
            }
            o00ooo01 = cacheStrategy.f51497OooO00o;
            cached = cacheStrategy.f51498OooO0O0;
            o00Var = this.f51490OooO00o;
            if (o00Var != null) {
                synchronized (o00Var) {
                    Intrinsics.checkNotNullParameter(cacheStrategy, "cacheStrategy");
                    if (cacheStrategy.f51497OooO00o != null) {
                        o00OOOO0 o00oooo1 = cacheStrategy.f51498OooO0O0;
                    }
                }
            }
            o00o0oo2 = o00o0oo4;
            if (o00o0oo2 instanceof o00O0OO) {
                o00o0oo3 = o00o0oo2;
            } else {
                o00o0oo3 = null;
            }
            if (o00o0oo3 != null || (oo0o0o0 = o00o0oo3.f51728Oooo0oO) == null) {
                oo0o0o0 = oo0o0O0.NONE;
            }
            if (cachedResponse != null && cached == null && (o00ooooo4 = cachedResponse.f51441OoooO) != null) {
                p659o0ooo0o.o00OOO00.OooO0Oo(o00ooooo4);
            }
            if (o00ooo01 != null && cached == null) {
                o00OOOO0.OooO00o oooO00o12 = new o00OOOO0.OooO00o();
                oooO00o12.OooO0oO(ooo00o0o.f51883OooO0o);
                oooO00o12.OooO0o(Protocol.HTTP_1_1);
                oooO00o12.f51454OooO0OO = 504;
                Intrinsics.checkNotNullParameter("Unsatisfiable Request (only-if-cached)", ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
                oooO00o12.f51455OooO0Oo = "Unsatisfiable Request (only-if-cached)";
                oooO00o12.f51458OooO0oO = p659o0ooo0o.o00OOO00.f51185OooO0OO;
                oooO00o12.f51461OooOO0O = -1L;
                oooO00o12.f51462OooOO0o = System.currentTimeMillis();
                o00OOOO0 o00oooo0OooO00o = oooO00o12.OooO00o();
                oo0o0o0.satisfactionFailure(o00o0oo2, o00oooo0OooO00o);
                return o00oooo0OooO00o;
            }
            if (o00ooo01 == null) {
                Intrinsics.checkNotNull(cached);
                o00OOOO0.OooO00o oooO00o13 = new o00OOOO0.OooO00o(cached);
                oooO00o13.OooO0O0(OooO00o.OooO00o(cached));
                o00OOOO0 o00oooo0OooO00o2 = oooO00o13.OooO00o();
                oo0o0o0.cacheHit(o00o0oo2, o00oooo0OooO00o2);
                return o00oooo0OooO00o2;
            }
            if (cached != null) {
                oo0o0o0.cacheConditionalHit(o00o0oo2, cached);
            } else if (this.f51490OooO00o != null) {
                oo0o0o0.cacheMiss(o00o0oo2);
            }
            try {
                o00oooo0OooO0O0 = ((oOo00o0o) chain).OooO0O0(o00ooo01);
                if (cached != null) {
                    if (o00oooo0OooO0O0.f51443OoooO00 == 304) {
                        o00OOOO0.OooO00o oooO00o14 = new o00OOOO0.OooO00o(cached);
                        oooO00o2 = f51489OooO0O0;
                        o00o2 = cached.f51444OoooO0O;
                        o00o3 = o00oooo0OooO0O0.f51444OoooO0O;
                        oooO00o3 = new o00O.OooO00o();
                        length = o00o2.f51230Oooo0o.length / 2;
                        for (i6 = 0; i6 < length; i6++) {
                            strOooO0O1 = o00o2.OooO0O0(i6);
                            strOooO0o0 = o00o2.OooO0o0(i6);
                            if ((StringsKt.OooO("Warning", strOooO0O1) || !StringsKt.OooOoOO(strOooO0o0, "1")) && (oooO00o2.OooO0O0(strOooO0O1) || !oooO00o2.OooO0OO(strOooO0O1) || o00o3.OooO00o(strOooO0O1) == null)) {
                                oooO00o3.OooO0OO(strOooO0O1, strOooO0o0);
                            }
                        }
                        length2 = o00o3.f51230Oooo0o.length / 2;
                        for (i7 = 0; i7 < length2; i7++) {
                            strOooO0O0 = o00o3.OooO0O0(i7);
                            if (oooO00o2.OooO0O0(strOooO0O0) && oooO00o2.OooO0OO(strOooO0O0)) {
                                oooO00o3.OooO0OO(strOooO0O0, o00o3.OooO0o0(i7));
                            }
                        }
                        oooO00o14.OooO0Oo(oooO00o3.OooO0Oo());
                        oooO00o14.f51461OooOO0O = o00oooo0OooO0O0.f51447OoooOOo;
                        oooO00o14.f51462OooOO0o = o00oooo0OooO0O0.f51448OoooOo0;
                        oooO00o14.OooO0O0(OooO00o.OooO00o(cached));
                        o00OOOO0 o00oooo0OooO00o3 = OooO00o.OooO00o(o00oooo0OooO0O0);
                        oooO00o14.OooO0OO("networkResponse", o00oooo0OooO00o3);
                        oooO00o14.f51459OooO0oo = o00oooo0OooO00o3;
                        o00OOOO0 network = oooO00o14.OooO00o();
                        o00OOOOo o00ooooo6 = o00oooo0OooO0O0.f51441OoooO;
                        Intrinsics.checkNotNull(o00ooooo6);
                        o00ooooo6.close();
                        o00Var2 = this.f51490OooO00o;
                        Intrinsics.checkNotNull(o00Var2);
                        synchronized (o00Var2) {
                        }
                        Objects.requireNonNull(this.f51490OooO00o);
                        Intrinsics.checkNotNullParameter(cached, "cached");
                        Intrinsics.checkNotNullParameter(network, "network");
                        oooO0OO = new o00.OooO0OO(network);
                        o00OOOOo o00ooooo7 = cached.f51441OoooO;
                        Objects.requireNonNull(o00ooooo7, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
                        o0O0ooO.OooO0OO oooO0OO3 = ((o00.OooO00o) o00ooooo7).f51193Oooo;
                        try {
                            oooO00oOooO0Oo2 = oooO0OO3.f51545Oooo.OooO0Oo(oooO0OO3.f51546Oooo0o, oooO0OO3.f51547Oooo0oO);
                            if (oooO00oOooO0Oo2 != null) {
                                try {
                                    oooO0OO.OooO0OO(oooO00oOooO0Oo2);
                                    oooO00oOooO0Oo2.OooO0O0();
                                } catch (IOException unused3) {
                                    if (oooO00oOooO0Oo2 != null) {
                                        try {
                                            oooO00oOooO0Oo2.OooO00o();
                                        } catch (IOException unused4) {
                                        }
                                    }
                                }
                            }
                        } catch (IOException unused5) {
                            oooO00oOooO0Oo2 = null;
                        }
                        oo0o0o0.cacheHit(o00o0oo2, network);
                        return network;
                    }
                    o00ooooo3 = cached.f51441OoooO;
                    if (o00ooooo3 != null) {
                        p659o0ooo0o.o00OOO00.OooO0Oo(o00ooooo3);
                    }
                }
                Intrinsics.checkNotNull(o00oooo0OooO0O0);
                o00OOOO0.OooO00o oooO00o15 = new o00OOOO0.OooO00o(o00oooo0OooO0O0);
                oooO00o15.OooO0O0(OooO00o.OooO00o(cached));
                o00OOOO0 o00oooo0OooO00o4 = OooO00o.OooO00o(o00oooo0OooO0O0);
                oooO00o15.OooO0OO("networkResponse", o00oooo0OooO00o4);
                oooO00o15.f51459OooO0oo = o00oooo0OooO00o4;
                hasVaryAll = oooO00o15.OooO00o();
                if (this.f51490OooO00o != null) {
                    if (!oO00o00O.OooO00o(hasVaryAll) && o00O0000.f51496OooO0OO.OooO00o(hasVaryAll, o00ooo01)) {
                        o00 o00Var4 = this.f51490OooO00o;
                        Objects.requireNonNull(o00Var4);
                        Intrinsics.checkNotNullParameter(hasVaryAll, "response");
                        String method2 = hasVaryAll.f51439Oooo0oO.f51426OooO0OO;
                        Intrinsics.checkNotNullParameter(method2, "method");
                        try {
                            if (!(Intrinsics.areEqual(method2, Request.HttpMethodPOST) || Intrinsics.areEqual(method2, "PATCH") || Intrinsics.areEqual(method2, Request.HttpMethodPUT) || Intrinsics.areEqual(method2, "DELETE") || Intrinsics.areEqual(method2, "MOVE"))) {
                                if (!Intrinsics.areEqual(method2, Request.HttpMethodGet)) {
                                    oooO0o = null;
                                } else {
                                    o00.OooO0O0 oooO0O1 = o00.f51191Oooo0oO;
                                    Intrinsics.checkNotNullParameter(hasVaryAll, "$this$hasVaryAll");
                                    if (oooO0O1.OooO0OO(hasVaryAll.f51444OoooO0O).contains("*")) {
                                        oooO0o = null;
                                    } else {
                                        o00.OooO0OO oooO0OO4 = new o00.OooO0OO(hasVaryAll);
                                        try {
                                            o0O0ooO o0o0ooo = o00Var4.f51192Oooo0o;
                                            String strOooO00o3 = oooO0O1.OooO00o(hasVaryAll.f51439Oooo0oO.f51425OooO0O0);
                                            Regex regex = o0O0ooO.f51504Oooooo;
                                            oooO00oOooO0Oo = o0o0ooo.OooO0Oo(strOooO00o3, -1L);
                                            if (oooO00oOooO0Oo != null) {
                                                try {
                                                    oooO0OO4.OooO0OO(oooO00oOooO0Oo);
                                                    oooO0o = new o00.OooO0o(o00Var4, oooO00oOooO0Oo);
                                                } catch (IOException unused6) {
                                                    if (oooO00oOooO0Oo != null) {
                                                        oooO00oOooO0Oo.OooO00o();
                                                    }
                                                    oooO0o = null;
                                                }
                                            } else {
                                                oooO0o = null;
                                            }
                                        } catch (IOException unused7) {
                                            oooO00oOooO0Oo = null;
                                        }
                                    }
                                }
                                if (oooO0o != null) {
                                    o00.OooO0o.OooO00o oooO00o16 = oooO0o.f51212OooO0O0;
                                    o00OOOOo o00ooooo8 = hasVaryAll.f51441OoooO;
                                    Intrinsics.checkNotNull(o00ooooo8);
                                    o000OOo0 o000ooo1 = new o000OOo0(o00ooooo8.OooO0oo(), oooO0o, o0O000Oo.OooO0O0(oooO00o16));
                                    String strOooO0O3 = hasVaryAll.OooO0O0("Content-Type", null);
                                    long jOooO0Oo = hasVaryAll.f51441OoooO.OooO0Oo();
                                    o00OOOO0.OooO00o oooO00o17 = new o00OOOO0.OooO00o(hasVaryAll);
                                    oooO00o17.f51458OooO0oO = new oOo00ooO(strOooO0O3, jOooO0Oo, o0O000Oo.OooO0OO(o000ooo1));
                                    hasVaryAll = oooO00o17.OooO00o();
                                }
                                if (cached != null) {
                                    oo0o0o0.cacheMiss(o00o0oo2);
                                }
                                return hasVaryAll;
                            }
                            o00Var4.OooO00o(hasVaryAll.f51439Oooo0oO);
                        } catch (IOException unused8) {
                        }
                        oooO0o = null;
                        if (oooO0o != null) {
                            o00.OooO0o.OooO00o oooO00o18 = oooO0o.f51212OooO0O0;
                            o00OOOOo o00ooooo9 = hasVaryAll.f51441OoooO;
                            Intrinsics.checkNotNull(o00ooooo9);
                            o000OOo0 o000ooo2 = new o000OOo0(o00ooooo9.OooO0oo(), oooO0o, o0O000Oo.OooO0O0(oooO00o18));
                            String strOooO0O4 = hasVaryAll.OooO0O0("Content-Type", null);
                            long jOooO0Oo2 = hasVaryAll.f51441OoooO.OooO0Oo();
                            o00OOOO0.OooO00o oooO00o19 = new o00OOOO0.OooO00o(hasVaryAll);
                            oooO00o19.f51458OooO0oO = new oOo00ooO(strOooO0O4, jOooO0Oo2, o0O000Oo.OooO0OO(o000ooo2));
                            hasVaryAll = oooO00o19.OooO00o();
                        }
                        if (cached != null) {
                            oo0o0o0.cacheMiss(o00o0oo2);
                        }
                        return hasVaryAll;
                    }
                    method = o00ooo01.f51426OooO0OO;
                    Intrinsics.checkNotNullParameter(method, "method");
                    if (!Intrinsics.areEqual(method, Request.HttpMethodPOST) || Intrinsics.areEqual(method, "PATCH") || Intrinsics.areEqual(method, Request.HttpMethodPUT) || Intrinsics.areEqual(method, "DELETE") || Intrinsics.areEqual(method, "MOVE")) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        try {
                            this.f51490OooO00o.OooO00o(o00ooo01);
                        } catch (IOException unused9) {
                        }
                    }
                }
                return hasVaryAll;
            } catch (Throwable th) {
                if (cachedResponse != null && (o00ooooo2 = cachedResponse.f51441OoooO) != null) {
                    p659o0ooo0o.o00OOO00.OooO0Oo(o00ooooo2);
                }
                throw th;
            }
        }
        cacheStrategy = new o00O0000(request2, null);
        ooo00o0o = ooo00o0o;
        o00o0oo4 = o00o0oo4;
        r0 = 0;
        if (cacheStrategy.f51497OooO00o != null) {
            cacheStrategy = new o00O0000(r0, r0);
        }
        o00ooo01 = cacheStrategy.f51497OooO00o;
        cached = cacheStrategy.f51498OooO0O0;
        o00Var = this.f51490OooO00o;
        if (o00Var != null) {
            synchronized (o00Var) {
                Intrinsics.checkNotNullParameter(cacheStrategy, "cacheStrategy");
                if (cacheStrategy.f51497OooO00o != null) {
                    o00OOOO0 o00oooo2 = cacheStrategy.f51498OooO0O0;
                }
            }
        }
        o00o0oo2 = o00o0oo4;
        if (o00o0oo2 instanceof o00O0OO) {
            o00o0oo3 = null;
        } else {
            o00o0oo3 = o00o0oo2;
        }
        if (o00o0oo3 != null) {
            oo0o0o0 = oo0o0O0.NONE;
        } else {
            oo0o0o0 = oo0o0O0.NONE;
        }
        if (cachedResponse != null) {
            p659o0ooo0o.o00OOO00.OooO0Oo(o00ooooo4);
        }
        if (o00ooo01 != null) {
        }
        if (o00ooo01 == null) {
            Intrinsics.checkNotNull(cached);
            o00OOOO0.OooO00o oooO00o110 = new o00OOOO0.OooO00o(cached);
            oooO00o110.OooO0O0(OooO00o.OooO00o(cached));
            o00OOOO0 o00oooo0OooO00o5 = oooO00o110.OooO00o();
            oo0o0o0.cacheHit(o00o0oo2, o00oooo0OooO00o5);
            return o00oooo0OooO00o5;
        }
        if (cached != null) {
            oo0o0o0.cacheConditionalHit(o00o0oo2, cached);
        } else if (this.f51490OooO00o != null) {
            oo0o0o0.cacheMiss(o00o0oo2);
        }
        o00oooo0OooO0O0 = ((oOo00o0o) chain).OooO0O0(o00ooo01);
        if (cached != null) {
            if (o00oooo0OooO0O0.f51443OoooO00 == 304) {
                o00OOOO0.OooO00o oooO00o111 = new o00OOOO0.OooO00o(cached);
                oooO00o2 = f51489OooO0O0;
                o00o2 = cached.f51444OoooO0O;
                o00o3 = o00oooo0OooO0O0.f51444OoooO0O;
                oooO00o3 = new o00O.OooO00o();
                length = o00o2.f51230Oooo0o.length / 2;
                while (i6 < length) {
                    strOooO0O1 = o00o2.OooO0O0(i6);
                    strOooO0o0 = o00o2.OooO0o0(i6);
                    if (StringsKt.OooO("Warning", strOooO0O1)) {
                        oooO00o3.OooO0OO(strOooO0O1, strOooO0o0);
                    } else {
                        oooO00o3.OooO0OO(strOooO0O1, strOooO0o0);
                    }
                }
                length2 = o00o3.f51230Oooo0o.length / 2;
                while (i7 < length2) {
                    strOooO0O0 = o00o3.OooO0O0(i7);
                    if (oooO00o2.OooO0O0(strOooO0O0)) {
                    }
                }
                oooO00o111.OooO0Oo(oooO00o3.OooO0Oo());
                oooO00o111.f51461OooOO0O = o00oooo0OooO0O0.f51447OoooOOo;
                oooO00o111.f51462OooOO0o = o00oooo0OooO0O0.f51448OoooOo0;
                oooO00o111.OooO0O0(OooO00o.OooO00o(cached));
                o00OOOO0 o00oooo0OooO00o6 = OooO00o.OooO00o(o00oooo0OooO0O0);
                oooO00o111.OooO0OO("networkResponse", o00oooo0OooO00o6);
                oooO00o111.f51459OooO0oo = o00oooo0OooO00o6;
                o00OOOO0 network2 = oooO00o111.OooO00o();
                o00OOOOo o00ooooo10 = o00oooo0OooO0O0.f51441OoooO;
                Intrinsics.checkNotNull(o00ooooo10);
                o00ooooo10.close();
                o00Var2 = this.f51490OooO00o;
                Intrinsics.checkNotNull(o00Var2);
                synchronized (o00Var2) {
                    Objects.requireNonNull(this.f51490OooO00o);
                    Intrinsics.checkNotNullParameter(cached, "cached");
                    Intrinsics.checkNotNullParameter(network2, "network");
                    oooO0OO = new o00.OooO0OO(network2);
                    o00OOOOo o00ooooo11 = cached.f51441OoooO;
                    Objects.requireNonNull(o00ooooo11, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
                    o0O0ooO.OooO0OO oooO0OO5 = ((o00.OooO00o) o00ooooo11).f51193Oooo;
                    oooO00oOooO0Oo2 = oooO0OO5.f51545Oooo.OooO0Oo(oooO0OO5.f51546Oooo0o, oooO0OO5.f51547Oooo0oO);
                    if (oooO00oOooO0Oo2 != null) {
                        oooO0OO.OooO0OO(oooO00oOooO0Oo2);
                        oooO00oOooO0Oo2.OooO0O0();
                    }
                    oo0o0o0.cacheHit(o00o0oo2, network2);
                    return network2;
                }
            }
            o00ooooo3 = cached.f51441OoooO;
            if (o00ooooo3 != null) {
                p659o0ooo0o.o00OOO00.OooO0Oo(o00ooooo3);
            }
        }
        Intrinsics.checkNotNull(o00oooo0OooO0O0);
        o00OOOO0.OooO00o oooO00o112 = new o00OOOO0.OooO00o(o00oooo0OooO0O0);
        oooO00o112.OooO0O0(OooO00o.OooO00o(cached));
        o00OOOO0 o00oooo0OooO00o7 = OooO00o.OooO00o(o00oooo0OooO0O0);
        oooO00o112.OooO0OO("networkResponse", o00oooo0OooO00o7);
        oooO00o112.f51459OooO0oo = o00oooo0OooO00o7;
        hasVaryAll = oooO00o112.OooO00o();
        if (this.f51490OooO00o != null) {
            if (!oO00o00O.OooO00o(hasVaryAll)) {
            }
            method = o00ooo01.f51426OooO0OO;
            Intrinsics.checkNotNullParameter(method, "method");
            if (Intrinsics.areEqual(method, Request.HttpMethodPOST)) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (z2) {
                this.f51490OooO00o.OooO00o(o00ooo01);
            }
        }
        return hasVaryAll;
    }
}
