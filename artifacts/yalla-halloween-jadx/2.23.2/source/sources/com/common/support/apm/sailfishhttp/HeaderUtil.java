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
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import p641o0ooOO0o.o0O000;
import p641o0ooOO0o.o0O00000;
import p641o0ooOO0o.o0O000O;
import p641o0ooOO0o.o0O000Oo;
import p641o0ooOO0o.o0O000o0;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0oO0Ooo;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\"\u0010\u0006\u001a\u00020\u00042\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0002J.\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007H\u0002J\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001c\u0010\u0010\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007H\u0002J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¨\u0006\u001a"}, d2 = {"Lcom/common/support/apm/sailfishhttp/HeaderUtil;", "", "", "", "", "paramEntries", "convertParamsToStr", "", "map", "sortParams", "Lo0ooOO0o/o0O00O0o;", "request", "", "queryAllParams", "getParamsFromRequestBody", "paramMap", "convertParamMapToStr", "", "isProtoRequestBody", "createHeaderStr", "Lcom/common/support/apm/sailfishhttp/requestbody/ProtoRequestBody;", "body", "", "createProtoBodyByteArray", "<init>", "()V", "sailfish_release"}, k = 1, mv = {1, 7, 1})
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
        int size = paramEntries.size();
        for (int i = 0; i < size; i++) {
            Map.Entry<String, String> entry = paramEntries.get(i);
            String key = entry.getKey();
            String value = entry.getValue();
            sb.append(key);
            sb.append("=");
            sb.append(value);
            if (i != paramEntries.size() - 1) {
                sb.append("&");
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    private final Map<String, String> getParamsFromRequestBody(o0O00O0o request) throws IOException {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        o0oO0Ooo o0oo0ooo2 = request.f57831OooO0Oo;
        if (o0oo0ooo2 instanceof o0O000o0) {
            Intrinsics.checkNotNull(o0oo0ooo2, "null cannot be cast to non-null type okhttp3.MultipartBody");
            for (o0O000o0.OooO0OO oooO0OO : ((o0O000o0) o0oo0ooo2).f57818OooO0O0) {
                o0O000Oo o0o000ooContentType = oooO0OO.f57825OooO0O0.contentType();
                boolean z = true;
                if ((o0o000ooContentType == null || (str = o0o000ooContentType.f57808OooO00o) == null || !StringsKt__StringsKt.contains$default(str, "text/plain", false, 2, (Object) null)) ? false : true) {
                    o0O000 o0o001 = oooO0OO.f57824OooO00o;
                    String strOooO00o = o0o001 != null ? o0o001.OooO00o("Content-Disposition") : null;
                    if (strOooO00o != null && strOooO00o.length() != 0) {
                        z = false;
                    }
                    if (!z) {
                        String strReplace$default = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(strOooO00o, "form-data; name=", "", false, 4, (Object) null), "\"", "", false, 4, (Object) null);
                        oo0OOoo oo0oooo = new oo0OOoo();
                        oooO0OO.f57825OooO0O0.writeTo(oo0oooo);
                        Charset charsetForName = Charset.forName("UTF-8");
                        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charsetName)");
                        linkedHashMap.put(strReplace$default, oo0oooo.o000000o(charsetForName));
                    }
                }
            }
        } else if (o0oo0ooo2 instanceof o0O00000) {
            Intrinsics.checkNotNull(o0oo0ooo2, "null cannot be cast to non-null type okhttp3.FormBody");
            o0O00000 o0o00000 = (o0O00000) o0oo0ooo2;
            int size = o0o00000.f57776OooO00o.size();
            for (int i = 0; i < size; i++) {
                linkedHashMap.put(o0o00000.f57776OooO00o.get(i), o0o00000.OooO00o(i));
            }
        }
        return linkedHashMap;
    }

    private final Map<String, String> queryAllParams(o0O00O0o request) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (Intrinsics.areEqual(request.f57829OooO0O0, "POST")) {
            HeaderUtil headerUtil = INSTANCE;
            String strConvertParamMapToStr = headerUtil.convertParamMapToStr(headerUtil.getParamsFromRequestBody(request));
            if (strConvertParamMapToStr.length() > 0) {
                linkedHashMap.put("biz_content", strConvertParamMapToStr);
            }
        }
        o0O000O o0o000o = request.f57828OooO00o;
        String strOooO0O0 = o0o000o.OooO0O0();
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = strOooO0O0.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        linkedHashMap.put("request_path", lowerCase);
        List<String> list = o0o000o.f57795OooO0oO;
        int size = list != null ? list.size() / 2 : 0;
        for (int i = 0; i < size; i++) {
            if (list == null) {
                throw new IndexOutOfBoundsException();
            }
            int i2 = i * 2;
            String str = list.get(i2);
            Intrinsics.checkNotNull(str);
            String str2 = str;
            if (list == null) {
                throw new IndexOutOfBoundsException();
            }
            String str3 = list.get(i2 + 1);
            if (str3 == null) {
                str3 = "";
            }
            linkedHashMap.put(str2, str3);
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
    public static final int m4026sortParams$lambda1$lambda0(Map.Entry entry, Map.Entry entry2) {
        return ((String) entry.getKey()).compareTo((String) entry2.getKey());
    }

    @NotNull
    public final String createHeaderStr(@NotNull o0O00O0o request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Map<String, String> mapQueryAllParams = queryAllParams(request);
        return mapQueryAllParams.isEmpty() ? "" : convertParamsToStr(sortParams(mapQueryAllParams));
    }

    @NotNull
    public final byte[] createProtoBodyByteArray(@NotNull ProtoRequestBody body) throws IOException {
        Intrinsics.checkNotNullParameter(body, "body");
        oo0OOoo oo0oooo = new oo0OOoo();
        body.writeTo(oo0oooo);
        return oo0oooo.o00ooo();
    }

    public final boolean isProtoRequestBody(@NotNull o0O00O0o request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return request.f57831OooO0Oo instanceof ProtoRequestBody;
    }
}
