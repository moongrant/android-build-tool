package p424o0OoO0oO;

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
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p004OooO0oO.o000oOoO;
import p382o0OOoo0o.o00Ooo;
import p592o0oo00O.OooOOO0;
import p634o0ooO0oO.o00OO;
import p634o0ooO0oO.o00OOO0;
import p634o0ooO0oO.o00OOO00;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0O0o;
import p634o0ooO0oO.o0oOOo;
import p634o0ooO0oO.oo00oO;
import p634o0ooO0oO.oo0O;
import p635o0ooO0oo.o0O000o0;
import p647o0ooOooo.nc;
import p659o0oooO00.o0000;
import p659o0oooO00.o00000O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nApiLogInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiLogInterceptor.kt\ncom/yalla/yalla/http/interceptor/ApiLogInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,145:1\n1855#2,2:146\n*S KotlinDebug\n*F\n+ 1 ApiLogInterceptor.kt\ncom/yalla/yalla/http/interceptor/ApiLogInterceptor\n*L\n67#1:146,2\n*E\n"})
public final class o0000O0 implements o00OOO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Charset f45572OooO00o = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f45573OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public String f45574OooO0OO;

    public o0000O0() {
        String property = System.getProperty("line.separator");
        this.f45573OooO0O0 = property == null ? "\n" : property;
        this.f45574OooO0OO = "WebAPI ";
    }

    public static String OooO00o(String str) {
        String string;
        if (StringsKt.isBlank(str)) {
            return "";
        }
        try {
            if (StringsKt.Oooo00o(str, "{")) {
                string = new JSONObject(str).toString(3);
                Intrinsics.checkNotNullExpressionValue(string, "{\n                    va…ring(3)\n                }");
            } else if (StringsKt.Oooo00o(str, "[")) {
                string = new JSONArray(str).toString(3);
                Intrinsics.checkNotNullExpressionValue(string, "{\n                    va…ring(3)\n                }");
            } else {
                string = str;
            }
            return StringsKt.OooOoO(string, "\\/", "/");
        } catch (JSONException unused) {
            return str;
        }
    }

    public final String OooO0O0(o0O0o o0o0o) throws IOException {
        if (o0o0o == null) {
            return "";
        }
        Intrinsics.checkNotNull(o0o0o);
        o0000 o0000VarOooOOo0 = o0o0o.OooOOo0();
        o0000VarOooOOo0.request(LongCompanionObject.MAX_VALUE);
        o00000O o00000oClone = o0000VarOooOOo0.OooO0O0().clone();
        Charset charset = this.f45572OooO00o;
        Intrinsics.checkNotNullExpressionValue(charset, "charset");
        return o00000oClone.o000000(charset);
    }

    @Override // p634o0ooO0oO.o00OOO00
    @NotNull
    public final o0oOOo intercept(@NotNull o00OOO00.OooO00o chain) throws IOException {
        String strOooO00o;
        Map tags;
        o00OOO0 o00ooo0OooO0oO;
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (o00Ooo.OooO0o0()) {
            nc ncVar = (nc) chain;
            return ncVar.OooO0O0(ncVar.f59720OooO0o0);
        }
        nc ncVar2 = (nc) chain;
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(" WebAPI ->\n╔═发起请求════════════════════════════════════════════════════════════════════════════\n");
        o00OOOOo request = ncVar2.f59720OooO0o0;
        sb.append("  URL: " + request.f57313OooO00o + "\n");
        StringBuilder sb2 = new StringBuilder("  Method: ");
        String method = request.f57314OooO0O0;
        sb2.append(method);
        sb2.append("\n");
        sb.append(sb2.toString());
        o00OO url = request.f57313OooO00o;
        oo00oO oo00oo = request.f57316OooO0Oo;
        if (oo00oo != null) {
            try {
                Intrinsics.checkNotNullParameter(request, "request");
                new LinkedHashMap();
                Map<Class<?>, Object> map = request.f57318OooO0o0;
                Map linkedHashMap = map.isEmpty() ? new LinkedHashMap() : MapsKt.toMutableMap(map);
                oo0O.OooO00o oooO00oOooO0Oo = request.f57315OooO0OO.OooO0Oo();
                if (url == null) {
                    throw new IllegalStateException("url == null".toString());
                }
                oo0O headers = oooO00oOooO0Oo.OooO0OO();
                byte[] bArr = o0O000o0.f57386OooO00o;
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
                o00000O o00000o = new o00000O();
                oo00oo.writeTo(o00000o);
                strOooO00o = OooO00o(o00000o.OoooOO0());
                sb.append("  RequestBody: " + strOooO00o + "\n");
            } catch (IOException e) {
                strOooO00o = o000oOoO.OooO00o("{\"err\": \"", e.getMessage(), "\"}");
            }
        }
        sb.append("╚═══════════════════════════════════════════════════════════════════════════════════");
        OooOOO0.OooO0OO(this.f45574OooO0OO, sb.toString());
        o0oOOo o0ooooOooO0O0 = ncVar2.OooO0O0(request);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        StringBuilder sb3 = new StringBuilder(" WebAPI ->\n╔═接收响应═══════════════════════════════════════════════════════════════════════════\n");
        sb3.append("  URL: " + url + "\n");
        sb3.append("  is success : " + o0ooooOooO0O0.OooO0oO() + " - Received in: " + jCurrentTimeMillis2 + "ms\n");
        StringBuilder sb4 = new StringBuilder("  Status Code: ");
        sb4.append(o0ooooOooO0O0.f57345OooO0oO);
        sb4.append("\n");
        sb3.append(sb4.toString());
        boolean zOooO0oO = o0ooooOooO0O0.OooO0oO();
        o0O0o o0o0o = o0ooooOooO0O0.f57347OooOO0;
        if (zOooO0oO) {
            sb3.append("  Body:\n");
            String str = (o0o0o == null || (o00ooo0OooO0oO = o0o0o.OooO0oO()) == null) ? null : o00ooo0OooO0oO.f57237OooO0OO;
            if (str != null && (StringsKt.OooO0o(str, "json") || StringsKt.OooO0o(str, "xml") || StringsKt.OooO0o(str, "plain") || StringsKt.OooO0o(str, "html"))) {
                Iterator<T> it = new Regex(this.f45573OooO0O0).split(OooO00o(OooO0O0(o0o0o)), 0).iterator();
                while (it.hasNext()) {
                    sb3.append("  " + ((String) it.next()) + "\n");
                }
            } else {
                sb3.append("  body is file");
            }
        } else {
            sb3.append("  error:" + OooO0O0(o0o0o) + "\n");
        }
        sb3.append("╚═══════════════════════════════════════════════════════════════════════════════════");
        OooOOO0.OooO0OO(this.f45574OooO0OO, sb3.toString());
        return o0ooooOooO0O0;
    }
}
