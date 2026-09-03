package com.common.support.okhttpforsdk;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import okhttp3.internal.connection.RouteException;
import org.jetbrains.annotations.NotNull;
import p634o0ooO0oO.o00OO;
import p634o0ooO0oO.o00OOO00;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0oOOo;
import p634o0ooO0oO.oo00oO;
import p634o0ooO0oO.oo0O;
import p635o0ooO0oo.o0O000o0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B6\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012#\u0010\u0011\u001a\u001f\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\f¢\u0006\u0002\b\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR1\u0010\u0011\u001a\u001f\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\f¢\u0006\u0002\b\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/common/support/okhttpforsdk/RetryInterceptor;", "Lo0ooO0oO/o00OOO00;", "Lo0ooO0oO/o00OOOOo;", "request", "createNewRequest", "Lo0ooO0oO/o00OOO00$OooO00o;", "chain", "Lo0ooO0oO/o0oOOo;", "intercept", "", "maxRetryTimes", "I", "Lkotlin/Function1;", "", "", "", "Lkotlin/ExtensionFunctionType;", "paramsFunc", "Lkotlin/jvm/functions/Function1;", "<init>", "(ILkotlin/jvm/functions/Function1;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class RetryInterceptor implements o00OOO00 {
    private final int maxRetryTimes;

    @NotNull
    private final Function1<o00OOOOo, Map<String, Object>> paramsFunc;

    /* JADX WARN: Multi-variable type inference failed */
    public RetryInterceptor(int i, @NotNull Function1<? super o00OOOOo, ? extends Map<String, ? extends Object>> paramsFunc) {
        Intrinsics.checkNotNullParameter(paramsFunc, "paramsFunc");
        this.maxRetryTimes = i;
        this.paramsFunc = paramsFunc;
    }

    private final o00OOOOo createNewRequest(o00OOOOo request) {
        Map mapUnmodifiableMap;
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
                oooO00oOooO0o.OooO(str2);
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
        return new o00OOOOo(url, str, oo0oOooO0OO, oo00oo, mapUnmodifiableMap);
    }

    @Override // p634o0ooO0oO.o00OOO00
    @NotNull
    public o0oOOo intercept(@NotNull o00OOO00.OooO00o chain) throws IOException {
        int i;
        final o0oOOo o0ooooOooO0O0;
        Intrinsics.checkNotNullParameter(chain, "chain");
        o00OOOOo o00oooooOooO00o = chain.OooO00o();
        final Ref.IntRef intRef = new Ref.IntRef();
        while (true) {
            try {
                o0ooooOooO0O0 = chain.OooO0O0(intRef.element == 0 ? o00oooooOooO00o : createNewRequest(o00oooooOooO00o));
                int i2 = o0ooooOooO0O0.f57345OooO0oO;
                boolean z = false;
                if (500 <= i2 && i2 <= 600) {
                    z = true;
                }
                if (!z || intRef.element >= this.maxRetryTimes) {
                    break;
                }
                o0ooooOooO0O0.close();
                intRef.element++;
                HttpServiceKt.logD$default(null, new Function0<String>() { // from class: com.common.support.okhttpforsdk.RetryInterceptor.intercept.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return "RetryInterceptor responseCode: " + o0ooooOooO0O0.f57345OooO0oO + ", retryCount: " + intRef.element;
                    }
                }, 1, null);
            } catch (Throwable th) {
                if ((!(th instanceof SocketTimeoutException) && !(th instanceof RouteException)) || (i = intRef.element) >= this.maxRetryTimes) {
                    HttpServiceKt.logD$default(null, new Function0<String>() { // from class: com.common.support.okhttpforsdk.RetryInterceptor.intercept.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final String invoke() {
                            return Intrinsics.stringPlus("RetryInterceptor throwable: ", th.getMessage());
                        }
                    }, 1, null);
                    throw th;
                }
                intRef.element = i + 1;
                HttpServiceKt.logD$default(null, new Function0<String>() { // from class: com.common.support.okhttpforsdk.RetryInterceptor.intercept.2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return Intrinsics.stringPlus("RetryInterceptor happen SocketTimeoutException or RouteException, retryCount: ", Integer.valueOf(intRef.element));
                    }
                }, 1, null);
            }
        }
        return o0ooooOooO0O0;
    }

    public /* synthetic */ RetryInterceptor(int i, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, function1);
    }
}
