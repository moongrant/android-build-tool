package com.common.support.okhttpforsdk;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p641o0ooOO0o.o0O000;
import p641o0ooOO0o.o0O000O;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0OoOoOo;
import p641o0ooOO0o.o0oO0Ooo;
import p648o0ooOoo.oO000o00;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B,\u0012#\u0010\f\u001a\u001f\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0006¢\u0006\u0002\b\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R1\u0010\f\u001a\u001f\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0006¢\u0006\u0002\b\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/common/support/okhttpforsdk/CommonQueryParamsInterceptor;", "Lo0ooOO0o/o0OoOoOo;", "Lo0ooOO0o/o0OoOoOo$OooO00o;", "chain", "Lo0ooOO0o/o0O00o00;", "intercept", "Lkotlin/Function1;", "Lo0ooOO0o/o0O00O0o;", "", "", "", "Lkotlin/ExtensionFunctionType;", "paramsFunc", "Lkotlin/jvm/functions/Function1;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class CommonQueryParamsInterceptor implements o0OoOoOo {

    @NotNull
    private final Function1<o0O00O0o, Map<String, Object>> paramsFunc;

    /* JADX WARN: Multi-variable type inference failed */
    public CommonQueryParamsInterceptor(@NotNull Function1<? super o0O00O0o, ? extends Map<String, ? extends Object>> paramsFunc) {
        Intrinsics.checkNotNullParameter(paramsFunc, "paramsFunc");
        this.paramsFunc = paramsFunc;
    }

    @Override // p641o0ooOO0o.o0OoOoOo
    @NotNull
    public o0O00o00 intercept(@NotNull o0OoOoOo.OooO00o chain) {
        Map mapUnmodifiableMap;
        Intrinsics.checkNotNullParameter(chain, "chain");
        o0O00O0o request = chain.OooO00o();
        request.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        new LinkedHashMap();
        String str = request.f57829OooO0O0;
        o0oO0Ooo o0oo0ooo2 = request.f57831OooO0Oo;
        Map<Class<?>, Object> map = request.f57833OooO0o0;
        Map linkedHashMap = map.isEmpty() ? new LinkedHashMap() : MapsKt.toMutableMap(map);
        o0O000.OooO00o oooO00oOooO0Oo = request.f57830OooO0OO.OooO0Oo();
        o0O000O.OooO00o oooO00oOooO0o = request.f57828OooO00o.OooO0o();
        Map<String, Object> mapInvoke = this.paramsFunc.invoke(request);
        for (String str2 : mapInvoke.keySet()) {
            Object obj = mapInvoke.get(str2);
            if (obj != null) {
                oooO00oOooO0o.OooO0O0(str2, obj.toString());
            }
        }
        o0O000O url = oooO00oOooO0o.OooO0OO();
        Intrinsics.checkNotNullParameter(url, "url");
        o0O000 o0o000OooO0OO = oooO00oOooO0Oo.OooO0OO();
        byte[] bArr = oO000o00.f58124OooO00o;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            mapUnmodifiableMap = MapsKt.emptyMap();
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return chain.OooO0OO(new o0O00O0o(url, str, o0o000OooO0OO, o0oo0ooo2, mapUnmodifiableMap));
    }
}
