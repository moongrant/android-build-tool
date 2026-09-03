package com.common.support.apm.otlp.biz;

import com.common.support.apm.Sailfish;
import com.common.support.apm.otlp.YallaOtlpSdk;
import io.opentelemetry.api.trace.StatusCode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0OoOoOo;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/common/support/apm/otlp/biz/OtlpInterceptor;", "Lo0ooOO0o/o0OoOoOo;", "Lo0ooOO0o/o0OoOoOo$OooO00o;", "chain", "Lo0ooOO0o/o0O00o00;", "intercept", "<init>", "()V", "sailfish_release"}, k = 1, mv = {1, 7, 1})
public final class OtlpInterceptor implements o0OoOoOo {
    @Override // p641o0ooOO0o.o0OoOoOo
    @NotNull
    public o0O00o00 intercept(@NotNull o0OoOoOo.OooO00o chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        o0O00O0o o0o00o0oOooO00o = chain.OooO00o();
        if (!YallaOtlpSdk.INSTANCE.isInited() || o0o00o0oOooO00o.f57828OooO00o.f57793OooO0o.contains("trace")) {
            return chain.OooO0OO(o0o00o0oOooO00o);
        }
        HttpTracer httpTracerHttpTracerOrNull = Sailfish.INSTANCE.httpTracerOrNull(o0o00o0oOooO00o.f57828OooO00o.f57788OooO, o0o00o0oOooO00o.f57829OooO0O0);
        if (httpTracerHttpTracerOrNull != null) {
            httpTracerHttpTracerOrNull.start();
        }
        o0O00o00 o0o00o00OooO0OO = null;
        Map<String, String> mapSpanHeaders = httpTracerHttpTracerOrNull != null ? httpTracerHttpTracerOrNull.spanHeaders() : null;
        o0O00O0o.OooO00o oooO00o = new o0O00O0o.OooO00o(o0o00o0oOooO00o);
        if (mapSpanHeaders != null) {
            for (Map.Entry<String, String> entry : mapSpanHeaders.entrySet()) {
                oooO00o.OooO00o(entry.getKey(), entry.getValue());
            }
        }
        try {
            o0o00o00OooO0OO = chain.OooO0OO(oooO00o.OooO0O0());
            int i = o0o00o00OooO0OO.f57850OooO0oO;
            StatusCode statusCode = 100 <= i && i < 400 ? StatusCode.OK : StatusCode.ERROR;
            if (httpTracerHttpTracerOrNull != null) {
                httpTracerHttpTracerOrNull.setHttpResponseCode(i);
                httpTracerHttpTracerOrNull.setStatus(statusCode, o0o00o00OooO0OO.f57848OooO0o);
            }
            if (httpTracerHttpTracerOrNull != null) {
                httpTracerHttpTracerOrNull.end();
            }
            return o0o00o00OooO0OO;
        } catch (Throwable th) {
            if (httpTracerHttpTracerOrNull != null) {
                try {
                    httpTracerHttpTracerOrNull.setStatusAndHttpResponseCode(th);
                } catch (Throwable th2) {
                    if (httpTracerHttpTracerOrNull != null) {
                        httpTracerHttpTracerOrNull.end();
                    }
                    throw th2;
                }
            }
            if (o0o00o00OooO0OO != null) {
                o0o00o00OooO0OO.close();
            }
            throw th;
        }
    }
}
