package o0OoO;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p004OooO0oO.o000oOoO;
import p386o0OOooO.oo0o0Oo;
import p598o0oo00Oo.o0000O00;
import p641o0ooOO0o.o0O000;
import p641o0ooOO0o.o0O000O;
import p641o0ooOO0o.o0O000Oo;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0O00oO0;
import p641o0ooOO0o.o0OoOoOo;
import p641o0ooOO0o.o0oO0Ooo;
import p648o0ooOoo.oO000o00;
import p654o0ooo00o.o000O;
import p662o0oooO0O.o0O0o0;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nApiLogInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiLogInterceptor.kt\ncom/yalla/yalla/http/interceptor/ApiLogInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,145:1\n1855#2,2:146\n*S KotlinDebug\n*F\n+ 1 ApiLogInterceptor.kt\ncom/yalla/yalla/http/interceptor/ApiLogInterceptor\n*L\n67#1:146,2\n*E\n"})
public final class OooOO0O implements o0OoOoOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Charset f46608OooO00o = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f46609OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public String f46610OooO0OO;

    public OooOO0O() {
        String property = System.getProperty("line.separator");
        this.f46609OooO0O0 = property == null ? "\n" : property;
        this.f46610OooO0OO = "WebAPI ";
    }

    public static String OooO00o(String str) {
        String string;
        if (StringsKt.isBlank(str)) {
            return "";
        }
        try {
            if (StringsKt__StringsJVMKt.startsWith$default(str, "{", false, 2, null)) {
                string = new JSONObject(str).toString(3);
                Intrinsics.checkNotNull(string);
            } else if (StringsKt__StringsJVMKt.startsWith$default(str, "[", false, 2, null)) {
                string = new JSONArray(str).toString(3);
                Intrinsics.checkNotNull(string);
            } else {
                string = str;
            }
            return StringsKt__StringsJVMKt.replace$default(string, "\\/", "/", false, 4, (Object) null);
        } catch (JSONException unused) {
            return str;
        }
    }

    public final String OooO0O0(o0O00oO0 o0o00oo1) throws IOException {
        if (o0o00oo1 == null) {
            return "";
        }
        Intrinsics.checkNotNull(o0o00oo1);
        o0O0o0 o0o0o0OooOOo = o0o00oo1.OooOOo();
        o0o0o0OooOOo.request(LongCompanionObject.MAX_VALUE);
        oo0OOoo oo0ooooClone = o0o0o0OooOOo.OooO0O0().clone();
        Charset charset = this.f46608OooO00o;
        Intrinsics.checkNotNullExpressionValue(charset, "charset");
        return oo0ooooClone.o000000o(charset);
    }

    @Override // p641o0ooOO0o.o0OoOoOo
    @NotNull
    public final o0O00o00 intercept(@NotNull o0OoOoOo.OooO00o chain) throws IOException {
        String strOooO0O0;
        Map tags;
        o0O000Oo o0o000ooOooO0oO;
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (oo0o0Oo.OooO0o0()) {
            o000O o000o = (o000O) chain;
            return o000o.OooO0OO(o000o.f59401OooO0o0);
        }
        o000O o000o2 = (o000O) chain;
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(" WebAPI ->\n╔═发起请求════════════════════════════════════════════════════════════════════════════\n");
        o0O00O0o request = o000o2.f59401OooO0o0;
        sb.append("  URL: " + request.f57828OooO00o + "\n");
        StringBuilder sb2 = new StringBuilder("  Method: ");
        String method = request.f57829OooO0O0;
        sb2.append(method);
        sb2.append("\n");
        sb.append(sb2.toString());
        o0O000O url = request.f57828OooO00o;
        o0oO0Ooo o0oo0ooo2 = request.f57831OooO0Oo;
        if (o0oo0ooo2 != null) {
            try {
                Intrinsics.checkNotNullParameter(request, "request");
                new LinkedHashMap();
                Map<Class<?>, Object> map = request.f57833OooO0o0;
                Map linkedHashMap = map.isEmpty() ? new LinkedHashMap() : MapsKt.toMutableMap(map);
                o0O000.OooO00o oooO00oOooO0Oo = request.f57830OooO0OO.OooO0Oo();
                if (url == null) {
                    throw new IllegalStateException("url == null".toString());
                }
                o0O000 headers = oooO00oOooO0Oo.OooO0OO();
                byte[] bArr = oO000o00.f58124OooO00o;
                Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
                if (linkedHashMap.isEmpty()) {
                    tags = MapsKt.emptyMap();
                } else {
                    tags = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
                    Intrinsics.checkNotNullExpressionValue(tags, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
                }
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(method, "method");
                Intrinsics.checkNotNullParameter(headers, "headers");
                Intrinsics.checkNotNullParameter(tags, "tags");
                oo0OOoo oo0oooo = new oo0OOoo();
                o0oo0ooo2.writeTo(oo0oooo);
                strOooO0O0 = OooO00o(oo0oooo.OoooOO0());
                sb.append("  RequestBody: " + strOooO0O0 + "\n");
            } catch (IOException e) {
                strOooO0O0 = o000oOoO.OooO0O0("{\"err\": \"", e.getMessage(), "\"}");
            }
        }
        sb.append("╚═══════════════════════════════════════════════════════════════════════════════════");
        o0000O00.OooO0OO(this.f46610OooO0OO, sb.toString());
        o0O00o00 o0o00o00OooO0OO = o000o2.OooO0OO(request);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        StringBuilder sb3 = new StringBuilder(" WebAPI ->\n╔═接收响应═══════════════════════════════════════════════════════════════════════════\n");
        sb3.append("  URL: " + url + "\n");
        sb3.append("  is success : " + o0o00o00OooO0OO.OooO0oO() + " - Received in: " + jCurrentTimeMillis2 + "ms\n");
        StringBuilder sb4 = new StringBuilder("  Status Code: ");
        sb4.append(o0o00o00OooO0OO.f57850OooO0oO);
        sb4.append("\n");
        sb3.append(sb4.toString());
        boolean zOooO0oO = o0o00o00OooO0OO.OooO0oO();
        o0O00oO0 o0o00oo1 = o0o00o00OooO0OO.f57852OooOO0;
        if (zOooO0oO) {
            sb3.append("  Body:\n");
            String str = (o0o00oo1 == null || (o0o000ooOooO0oO = o0o00oo1.OooO0oO()) == null) ? null : o0o000ooOooO0oO.f57810OooO0OO;
            if (str != null && (StringsKt__StringsKt.contains$default(str, "json", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(str, "xml", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(str, "plain", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(str, "html", false, 2, (Object) null))) {
                Iterator<T> it = new Regex(this.f46609OooO0O0).split(OooO00o(OooO0O0(o0o00oo1)), 0).iterator();
                while (it.hasNext()) {
                    sb3.append("  " + ((String) it.next()) + "\n");
                }
            } else {
                sb3.append("  body is file");
            }
        } else {
            sb3.append("  error:" + OooO0O0(o0o00oo1) + "\n");
        }
        sb3.append("╚═══════════════════════════════════════════════════════════════════════════════════");
        o0000O00.OooO0OO(this.f46610OooO0OO, sb3.toString());
        return o0o00o00OooO0OO;
    }
}
