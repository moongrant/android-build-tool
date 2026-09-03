package com.common.support.apm.sailfishhttp;

import com.common.support.apm.otlp.biz.HttpTracer;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0002\b\u000bJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u000fJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0011R\u001c\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/common/support/apm/sailfishhttp/HttpTracerCache;", "", "()V", "cacheHttpTracer", "", "", "Lcom/common/support/apm/otlp/biz/HttpTracer;", "add", "", "key", "httpTracer", "add$sailfish_release", "get", "get$sailfish_release", "getAndRemove", "getAndRemove$sailfish_release", "remove", "remove$sailfish_release", "sailfish_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class HttpTracerCache {

    @NotNull
    public static final HttpTracerCache INSTANCE = new HttpTracerCache();

    @NotNull
    private static final Map<Integer, HttpTracer> cacheHttpTracer = new LinkedHashMap();

    private HttpTracerCache() {
    }

    public final synchronized void add$sailfish_release(int key, @Nullable HttpTracer httpTracer) {
        cacheHttpTracer.put(Integer.valueOf(key), httpTracer);
    }

    @Nullable
    public final synchronized HttpTracer get$sailfish_release(int key) {
        return cacheHttpTracer.get(Integer.valueOf(key));
    }

    @Nullable
    public final synchronized HttpTracer getAndRemove$sailfish_release(int key) {
        HttpTracer httpTracer;
        Map<Integer, HttpTracer> map = cacheHttpTracer;
        httpTracer = map.get(Integer.valueOf(key));
        map.remove(Integer.valueOf(key));
        return httpTracer;
    }

    public final synchronized void remove$sailfish_release(int key) {
        cacheHttpTracer.remove(Integer.valueOf(key));
    }
}
