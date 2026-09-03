package com.common.support.okhttpforsdk;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p634o0ooO0oO.o00OO;
import p634o0ooO0oO.o00OOO00;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0oOOo;
import p634o0ooO0oO.oo00oO;
import p634o0ooO0oO.oo0O;
import p635o0ooO0oo.o0O000o0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B,\u0012#\u0010\f\u001a\u001f\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0006¢\u0006\u0002\b\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R1\u0010\f\u001a\u001f\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0006¢\u0006\u0002\b\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/common/support/okhttpforsdk/CommonQueryParamsInterceptor;", "Lo0ooO0oO/o00OOO00;", "Lo0ooO0oO/o00OOO00$OooO00o;", "chain", "Lo0ooO0oO/o0oOOo;", "intercept", "Lkotlin/Function1;", "Lo0ooO0oO/o00OOOOo;", "", "", "", "Lkotlin/ExtensionFunctionType;", "paramsFunc", "Lkotlin/jvm/functions/Function1;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class CommonQueryParamsInterceptor implements o00OOO00 {

    @NotNull
    private final Function1<o00OOOOo, Map<String, Object>> paramsFunc;

    /* JADX WARN: Multi-variable type inference failed */
    public CommonQueryParamsInterceptor(@NotNull Function1<? super o00OOOOo, ? extends Map<String, ? extends Object>> paramsFunc) {
        Intrinsics.checkNotNullParameter(paramsFunc, "paramsFunc");
        this.paramsFunc = paramsFunc;
    }

    @Override // p634o0ooO0oO.o00OOO00
    @NotNull
    public o0oOOo intercept(@NotNull o00OOO00.OooO00o chain) {
        Map mapUnmodifiableMap;
        Intrinsics.checkNotNullParameter(chain, "chain");
        o00OOOOo request = chain.OooO00o();
        request.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        new LinkedHashMap();
        String str = request.f57314OooO0O0;
        oo00oO oo00oo = request.f57316OooO0Oo;
        Map<Class<?>, Object> map = request.f57318OooO0o0;
        Map linkedHashMap = map.isEmpty() ? new LinkedHashMap() : MapsKt.toMutableMap(map);
        oo0O.OooO00o oooO00oOooO0Oo = request.f57315OooO0OO.OooO0Oo();
        o00OO.OooO00o oooO00oOooO0o = request.f57313OooO00o.OooO0o();
        Map<String, Object> mapInvoke = this.paramsFunc.invoke(request);
        for (String str2 : mapInvoke.keySet()) {
            Object obj = mapInvoke.get(str2);
            if (obj != null) {
                oooO00oOooO0o.OooO0O0(str2, obj.toString());
            }
        }
        o00OO url = oooO00oOooO0o.OooO0OO();
        Intrinsics.checkNotNullParameter(url, "url");
        oo0O oo0oOooO0OO = oooO00oOooO0Oo.OooO0OO();
        byte[] bArr = o0O000o0.f57386OooO00o;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            mapUnmodifiableMap = MapsKt.emptyMap();
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return chain.OooO0O0(new o00OOOOo(url, str, oo0oOooO0OO, oo00oo, mapUnmodifiableMap));
    }
}
