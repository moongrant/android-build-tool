package p105o000oo0o;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import p023Oooo00o.oO00OOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00oOoo extends Lambda implements Function0<Map<String, o000O0Oo.OooO0O0>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O0Oo f35769OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oOoo(o000O0Oo o000o0oo2) {
        super(0);
        this.f35769OooO0Oo = o000o0oo2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, o000O0Oo.OooO0O0> invoke() {
        o000O0Oo o000o0oo2 = this.f35769OooO0Oo;
        o000o0oo2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (((Boolean) o000o0oo2.f35731OooO0oO.getValue()).booleanValue()) {
            String str = o000o0oo2.f35725OooO00o;
            Uri uri = Uri.parse(str);
            for (String paramName : uri.getQueryParameterNames()) {
                StringBuilder sb = new StringBuilder();
                List<String> queryParams = uri.getQueryParameters(paramName);
                int iEnd = 0;
                if (!(queryParams.size() <= 1)) {
                    throw new IllegalArgumentException(oO00OOOo.OooO00o("Query parameter ", paramName, " must only be present once in ", str, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                }
                Intrinsics.checkNotNullExpressionValue(queryParams, "queryParams");
                String queryParam = (String) CollectionsKt.firstOrNull((List) queryParams);
                if (queryParam == null) {
                    o000o0oo2.f35724OooO = true;
                    queryParam = paramName;
                }
                Matcher matcher = o000O0Oo.f35723OooOOo0.matcher(queryParam);
                o000O0Oo.OooO0O0 oooO0O0 = new o000O0Oo.OooO0O0();
                while (matcher.find()) {
                    String name = matcher.group(1);
                    Intrinsics.checkNotNull(name, "null cannot be cast to non-null type kotlin.String");
                    Intrinsics.checkNotNullParameter(name, "name");
                    oooO0O0.f35742OooO0O0.add(name);
                    Intrinsics.checkNotNullExpressionValue(queryParam, "queryParam");
                    String strSubstring = queryParam.substring(iEnd, matcher.start());
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb.append(Pattern.quote(strSubstring));
                    sb.append("(.+?)?");
                    iEnd = matcher.end();
                }
                if (iEnd < queryParam.length()) {
                    Intrinsics.checkNotNullExpressionValue(queryParam, "queryParam");
                    String strSubstring2 = queryParam.substring(iEnd);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                    sb.append(Pattern.quote(strSubstring2));
                }
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "argRegex.toString()");
                oooO0O0.f35741OooO00o = StringsKt__StringsJVMKt.replace$default(string, ".*", "\\E.*\\Q", false, 4, (Object) null);
                Intrinsics.checkNotNullExpressionValue(paramName, "paramName");
                linkedHashMap.put(paramName, oooO0O0);
            }
        }
        return linkedHashMap;
    }
}
