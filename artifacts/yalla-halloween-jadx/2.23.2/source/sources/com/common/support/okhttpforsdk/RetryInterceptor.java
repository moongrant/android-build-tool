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
import p641o0ooOO0o.o0O000;
import p641o0ooOO0o.o0O000O;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0OoOoOo;
import p641o0ooOO0o.o0oO0Ooo;
import p648o0ooOoo.oO000o00;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B6\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012#\u0010\u0011\u001a\u001f\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\f¢\u0006\u0002\b\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR1\u0010\u0011\u001a\u001f\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\f¢\u0006\u0002\b\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/common/support/okhttpforsdk/RetryInterceptor;", "Lo0ooOO0o/o0OoOoOo;", "Lo0ooOO0o/o0O00O0o;", "request", "createNewRequest", "Lo0ooOO0o/o0OoOoOo$OooO00o;", "chain", "Lo0ooOO0o/o0O00o00;", "intercept", "", "maxRetryTimes", "I", "Lkotlin/Function1;", "", "", "", "Lkotlin/ExtensionFunctionType;", "paramsFunc", "Lkotlin/jvm/functions/Function1;", "<init>", "(ILkotlin/jvm/functions/Function1;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class RetryInterceptor implements o0OoOoOo {
    private final int maxRetryTimes;

    @NotNull
    private final Function1<o0O00O0o, Map<String, Object>> paramsFunc;

    /* JADX WARN: Multi-variable type inference failed */
    public RetryInterceptor(int i, @NotNull Function1<? super o0O00O0o, ? extends Map<String, ? extends Object>> paramsFunc) {
        Intrinsics.checkNotNullParameter(paramsFunc, "paramsFunc");
        this.maxRetryTimes = i;
        this.paramsFunc = paramsFunc;
    }

    private final o0O00O0o createNewRequest(o0O00O0o request) {
        Map mapUnmodifiableMap;
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
                oooO00oOooO0o.OooO(str2);
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
        return new o0O00O0o(url, str, o0o000OooO0OO, o0oo0ooo2, mapUnmodifiableMap);
    }

    @Override // p641o0ooOO0o.o0OoOoOo
    @NotNull
    public o0O00o00 intercept(@NotNull o0OoOoOo.OooO00o chain) throws IOException {
        int i;
        final o0O00o00 o0o00o00OooO0OO;
        Intrinsics.checkNotNullParameter(chain, "chain");
        o0O00O0o o0o00o0oOooO00o = chain.OooO00o();
        final Ref.IntRef intRef = new Ref.IntRef();
        while (true) {
            try {
                o0o00o00OooO0OO = chain.OooO0OO(intRef.element == 0 ? o0o00o0oOooO00o : createNewRequest(o0o00o0oOooO00o));
                int i2 = o0o00o00OooO0OO.f57850OooO0oO;
                boolean z = false;
                if (500 <= i2 && i2 <= 600) {
                    z = true;
                }
                if (!z || intRef.element >= this.maxRetryTimes) {
                    break;
                }
                o0o00o00OooO0OO.close();
                intRef.element++;
                HttpServiceKt.logD$default(null, new Function0<String>() { // from class: com.common.support.okhttpforsdk.RetryInterceptor.intercept.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return "RetryInterceptor responseCode: " + o0o00o00OooO0OO.f57850OooO0oO + ", retryCount: " + intRef.element;
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
        return o0o00o00OooO0OO;
    }

    public /* synthetic */ RetryInterceptor(int i, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, function1);
    }
}
