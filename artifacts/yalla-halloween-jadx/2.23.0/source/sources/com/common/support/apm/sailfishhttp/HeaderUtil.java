package com.common.support.apm.sailfishhttp;

import com.common.support.apm.sailfishhttp.requestbody.ProtoRequestBody;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p634o0ooO0oO.o00OO;
import p634o0ooO0oO.o00OO0O0;
import p634o0ooO0oO.o00OOO0;
import p634o0ooO0oO.o00OOO0O;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.oo00oO;
import p634o0ooO0oO.oo0O;
import p659o0oooO00.o00000O;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\"\u0010\u0006\u001a\u00020\u00042\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0002J.\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007H\u0002J\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001c\u0010\u0010\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007H\u0002J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¨\u0006\u001a"}, d2 = {"Lcom/common/support/apm/sailfishhttp/HeaderUtil;", "", "", "", "", "paramEntries", "convertParamsToStr", "", "map", "sortParams", "Lo0ooO0oO/o00OOOOo;", "request", "", "queryAllParams", "getParamsFromRequestBody", "paramMap", "convertParamMapToStr", "", "isProtoRequestBody", "createHeaderStr", "Lcom/common/support/apm/sailfishhttp/requestbody/ProtoRequestBody;", "body", "", "createProtoBodyByteArray", "<init>", "()V", "sailfish_release"}, k = 1, mv = {1, 5, 1})
public final class HeaderUtil {

    @NotNull
    public static final HeaderUtil INSTANCE = new HeaderUtil();

    private HeaderUtil() {
    }

    private final String convertParamMapToStr(Map<String, String> paramMap) {
        return paramMap.isEmpty() ? "" : CollectionsKt___CollectionsKt.joinToString$default(sortParams(paramMap), "&", "{", "}", 0, null, new Function1<Map.Entry<? extends String, ? extends String>, CharSequence>() { // from class: com.common.support.apm.sailfishhttp.HeaderUtil.convertParamMapToStr.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ CharSequence invoke(Map.Entry<? extends String, ? extends String> entry) {
                return invoke2((Map.Entry<String, String>) entry);
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final CharSequence invoke2(@NotNull Map.Entry<String, String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                StringBuilder sb = new StringBuilder();
                String key = it.getKey();
                Locale ROOT = Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                String lowerCase = key.toLowerCase(ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                sb.append(lowerCase);
                sb.append('=');
                sb.append(it.getValue());
                return sb.toString();
            }
        }, 24, null);
    }

    private final String convertParamsToStr(List<Map.Entry<String, String>> paramEntries) {
        StringBuilder sb = new StringBuilder();
        int size = paramEntries.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                Map.Entry<String, String> entry = paramEntries.get(i);
                String key = entry.getKey();
                String value = entry.getValue();
                sb.append(key);
                sb.append("=");
                sb.append(value);
                if (i != paramEntries.size() - 1) {
                    sb.append("&");
                }
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    private final Map<String, String> getParamsFromRequestBody(o00OOOOo request) throws IOException {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        oo00oO oo00oo = request.f57316OooO0Oo;
        int i = 0;
        if (oo00oo instanceof o00OOO0O) {
            if (oo00oo == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.MultipartBody");
            }
            for (o00OOO0O.OooO0OO oooO0OO : ((o00OOO0O) oo00oo).f57245OooO0O0) {
                o00OOO0 o00ooo0ContentType = oooO0OO.f57252OooO0O0.contentType();
                boolean z = true;
                if ((o00ooo0ContentType == null || (str = o00ooo0ContentType.f57235OooO00o) == null || !StringsKt.OooO0o(str, "text/plain")) ? false : true) {
                    oo0O oo0o = oooO0OO.f57251OooO00o;
                    String strOooO00o = oo0o == null ? null : oo0o.OooO00o("Content-Disposition");
                    if (strOooO00o != null && strOooO00o.length() != 0) {
                        z = false;
                    }
                    if (!z) {
                        String strOooOoO = StringsKt.OooOoO(StringsKt.OooOoO(strOooO00o, "form-data; name=", ""), "\"", "");
                        o00000O o00000o = new o00000O();
                        oooO0OO.f57252OooO0O0.writeTo(o00000o);
                        Charset charsetForName = Charset.forName("UTF-8");
                        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charsetName)");
                        linkedHashMap.put(strOooOoO, o00000o.o000000(charsetForName));
                    }
                }
            }
        } else if (oo00oo instanceof o00OO0O0) {
            if (oo00oo == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.FormBody");
            }
            o00OO0O0 o00oo0o1 = (o00OO0O0) oo00oo;
            int size = o00oo0o1.f57222OooO00o.size();
            if (size > 0) {
                while (true) {
                    int i2 = i + 1;
                    linkedHashMap.put(o00oo0o1.f57222OooO00o.get(i), o00oo0o1.OooO00o(i));
                    if (i2 >= size) {
                        break;
                    }
                    i = i2;
                }
            }
        }
        return linkedHashMap;
    }

    private final Map<String, String> queryAllParams(o00OOOOo request) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        if (Intrinsics.areEqual(request.f57314OooO0O0, "POST")) {
            HeaderUtil headerUtil = INSTANCE;
            String strConvertParamMapToStr = headerUtil.convertParamMapToStr(headerUtil.getParamsFromRequestBody(request));
            if (strConvertParamMapToStr.length() > 0) {
                linkedHashMap.put("biz_content", strConvertParamMapToStr);
            }
        }
        o00OO o00oo2 = request.f57313OooO00o;
        String strOooO0O0 = o00oo2.OooO0O0();
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = strOooO0O0.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        linkedHashMap.put("request_path", lowerCase);
        List<String> list = o00oo2.f57209OooO0oO;
        int size = list != null ? list.size() / 2 : 0;
        if (size > 0) {
            while (true) {
                int i2 = i + 1;
                if (list == null) {
                    throw new IndexOutOfBoundsException();
                }
                int i3 = i * 2;
                String str = list.get(i3);
                Intrinsics.checkNotNull(str);
                String str2 = str;
                if (list == null) {
                    throw new IndexOutOfBoundsException();
                }
                String str3 = list.get(i3 + 1);
                if (str3 == null) {
                    str3 = "";
                }
                linkedHashMap.put(str2, str3);
                if (i2 < size) {
                    i = i2;
                }
            }
        }
        return linkedHashMap;
    }

    private final List<Map.Entry<String, String>> sortParams(Map<String, String> map) {
        List<Map.Entry<String, String>> mutableList = CollectionsKt.toMutableList((Collection) map.entrySet());
        CollectionsKt.sortWith(mutableList, new OooO00o());
        return mutableList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sortParams$lambda-1$lambda-0, reason: not valid java name */
    public static final int m4016sortParams$lambda1$lambda0(Map.Entry entry, Map.Entry entry2) {
        return ((String) entry.getKey()).compareTo((String) entry2.getKey());
    }

    @NotNull
    public final String createHeaderStr(@NotNull o00OOOOo request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Map<String, String> mapQueryAllParams = queryAllParams(request);
        return mapQueryAllParams.isEmpty() ? "" : convertParamsToStr(sortParams(mapQueryAllParams));
    }

    @NotNull
    public final byte[] createProtoBodyByteArray(@NotNull ProtoRequestBody body) throws IOException {
        Intrinsics.checkNotNullParameter(body, "body");
        o00000O o00000o = new o00000O();
        body.writeTo(o00000o);
        return o00000o.o00Ooo();
    }

    public final boolean isProtoRequestBody(@NotNull o00OOOOo request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return request.f57316OooO0Oo instanceof ProtoRequestBody;
    }
}
