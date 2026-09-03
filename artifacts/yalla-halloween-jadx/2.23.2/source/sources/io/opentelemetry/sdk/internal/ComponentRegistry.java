package io.opentelemetry.sdk.internal;

import io.opentelemetry.compat.Function;
import io.opentelemetry.sdk.common.InstrumentationLibraryInfo;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class ComponentRegistry<V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ConcurrentHashMap f32670OooO00o = new ConcurrentHashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Function<InstrumentationLibraryInfo, V> f32671OooO0O0;

    public ComponentRegistry(Function<InstrumentationLibraryInfo, V> function) {
        this.f32671OooO0O0 = function;
    }

    public final V OooO00o(String str, @Nullable String str2, @Nullable String str3) {
        InstrumentationLibraryInfo instrumentationLibraryInfoOooO00o = InstrumentationLibraryInfo.OooO00o(str, str2, str3);
        ConcurrentHashMap concurrentHashMap = this.f32670OooO00o;
        V v = (V) concurrentHashMap.get(instrumentationLibraryInfoOooO00o);
        if (v != null) {
            return v;
        }
        V vApply = this.f32671OooO0O0.apply(instrumentationLibraryInfoOooO00o);
        V v2 = (V) concurrentHashMap.putIfAbsent(instrumentationLibraryInfoOooO00o, vApply);
        return v2 != null ? v2 : vApply;
    }
}
