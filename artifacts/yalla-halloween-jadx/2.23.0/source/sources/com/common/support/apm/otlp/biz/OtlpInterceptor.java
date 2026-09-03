package com.common.support.apm.otlp.biz;

import com.common.support.apm.Sailfish;
import com.common.support.apm.otlp.YallaOtlpSdk;
import io.opentelemetry.api.trace.StatusCode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p634o0ooO0oO.o00OOO00;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0oOOo;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/common/support/apm/otlp/biz/OtlpInterceptor;", "Lo0ooO0oO/o00OOO00;", "Lo0ooO0oO/o00OOO00$OooO00o;", "chain", "Lo0ooO0oO/o0oOOo;", "intercept", "<init>", "()V", "sailfish_release"}, k = 1, mv = {1, 5, 1})
public final class OtlpInterceptor implements o00OOO00 {
    @Override // p634o0ooO0oO.o00OOO00
    @NotNull
    public o0oOOo intercept(@NotNull o00OOO00.OooO00o chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        o00OOOOo o00oooooOooO00o = chain.OooO00o();
        if (!YallaOtlpSdk.INSTANCE.isInited() || o00oooooOooO00o.f57313OooO00o.f57207OooO0o.contains("trace")) {
            return chain.OooO0O0(o00oooooOooO00o);
        }
        HttpTracer httpTracerHttpTracerOrNull = Sailfish.INSTANCE.httpTracerOrNull(o00oooooOooO00o.f57313OooO00o.f57202OooO, o00oooooOooO00o.f57314OooO0O0);
        if (httpTracerHttpTracerOrNull != null) {
            httpTracerHttpTracerOrNull.start();
        }
        o0oOOo o0ooooOooO0O0 = null;
        Map<String, String> mapSpanHeaders = httpTracerHttpTracerOrNull == null ? null : httpTracerHttpTracerOrNull.spanHeaders();
        o00OOOOo.OooO00o oooO00o = new o00OOOOo.OooO00o(o00oooooOooO00o);
        if (mapSpanHeaders != null) {
            for (Map.Entry<String, String> entry : mapSpanHeaders.entrySet()) {
                oooO00o.OooO00o(entry.getKey(), entry.getValue());
            }
        }
        try {
            o0ooooOooO0O0 = chain.OooO0O0(oooO00o.OooO0O0());
            int i = o0ooooOooO0O0.f57345OooO0oO;
            StatusCode statusCode = 100 <= i && i <= 399 ? StatusCode.OK : StatusCode.ERROR;
            if (httpTracerHttpTracerOrNull != null) {
                httpTracerHttpTracerOrNull.setHttpResponseCode(i);
                httpTracerHttpTracerOrNull.setStatus(statusCode, o0ooooOooO0O0.f57343OooO0o);
            }
            if (httpTracerHttpTracerOrNull != null) {
                httpTracerHttpTracerOrNull.end();
            }
            return o0ooooOooO0O0;
        } catch (Throwable th) {
            if (httpTracerHttpTracerOrNull != null) {
                try {
                    httpTracerHttpTracerOrNull.setHttpResponseCode(-1);
                    StatusCode statusCode2 = StatusCode.ERROR;
                    String message = th.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    httpTracerHttpTracerOrNull.setStatus(statusCode2, message);
                } catch (Throwable th2) {
                    if (httpTracerHttpTracerOrNull != null) {
                        httpTracerHttpTracerOrNull.end();
                    }
                    throw th2;
                }
            }
            if (o0ooooOooO0O0 != null) {
                o0ooooOooO0O0.close();
            }
            throw th;
        }
    }
}
