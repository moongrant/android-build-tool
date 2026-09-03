package o000O00;

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
import kotlin.text.StringsKt;
import p023Oooo00o.oO00Oo00;

/* JADX INFO: loaded from: classes.dex */
public final class oo0o0Oo extends Lambda implements Function0<Map<String, o00O0O.OooO0O0>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O0O f34418OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0Oo(o00O0O o00o0o2) {
        super(0);
        this.f34418OooO0Oo = o00o0o2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, o00O0O.OooO0O0> invoke() {
        o00O0O o00o0o2 = this.f34418OooO0Oo;
        o00o0o2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (((Boolean) o00o0o2.f34393OooO0oO.getValue()).booleanValue()) {
            String str = o00o0o2.f34387OooO00o;
            Uri uri = Uri.parse(str);
            for (String paramName : uri.getQueryParameterNames()) {
                StringBuilder sb = new StringBuilder();
                List<String> queryParams = uri.getQueryParameters(paramName);
                int iEnd = 0;
                if (!(queryParams.size() <= 1)) {
                    throw new IllegalArgumentException(oO00Oo00.OooO00o("Query parameter ", paramName, " must only be present once in ", str, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                }
                Intrinsics.checkNotNullExpressionValue(queryParams, "queryParams");
                String queryParam = (String) CollectionsKt.firstOrNull((List) queryParams);
                if (queryParam == null) {
                    o00o0o2.f34386OooO = true;
                    queryParam = paramName;
                }
                Matcher matcher = o00O0O.f34385OooOOo0.matcher(queryParam);
                o00O0O.OooO0O0 oooO0O0 = new o00O0O.OooO0O0();
                while (matcher.find()) {
                    String name = matcher.group(1);
                    Intrinsics.checkNotNull(name, "null cannot be cast to non-null type kotlin.String");
                    Intrinsics.checkNotNullParameter(name, "name");
                    oooO0O0.f34404OooO0O0.add(name);
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
                oooO0O0.f34403OooO00o = StringsKt.OooOoO(string, ".*", "\\E.*\\Q");
                Intrinsics.checkNotNullExpressionValue(paramName, "paramName");
                linkedHashMap.put(paramName, oooO0O0);
            }
        }
        return linkedHashMap;
    }
}
