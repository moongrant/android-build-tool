package io.opentelemetry.exporter.otlp.internal;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.compat.BiConsumer;
import io.opentelemetry.context.internal.shaded.WeakConcurrentMap;
import io.opentelemetry.proto.resource.v1.Resource;

/* JADX INFO: loaded from: classes5.dex */
final class ResourceAdapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final WeakConcurrentMap.WithInlinedExpunction f33127OooO00o = new WeakConcurrentMap.WithInlinedExpunction();

    private ResourceAdapter() {
    }

    public static Resource OooO00o(io.opentelemetry.sdk.resources.Resource resource) {
        WeakConcurrentMap.WithInlinedExpunction withInlinedExpunction = f33127OooO00o;
        Resource resource2 = (Resource) withInlinedExpunction.OooO0O0(resource);
        if (resource2 != null) {
            return resource2;
        }
        final Resource.Builder builderNewBuilder = Resource.newBuilder();
        resource.OooO0O0().OooO0Oo(new BiConsumer() { // from class: io.opentelemetry.exporter.otlp.internal.OooO00o
            @Override // io.opentelemetry.compat.BiConsumer
            public final void accept(Object obj, Object obj2) {
                WeakConcurrentMap.WithInlinedExpunction withInlinedExpunction2 = ResourceAdapter.f33127OooO00o;
                builderNewBuilder.OooO0O0(CommonAdapter.OooO00o((AttributeKey) obj, obj2));
            }
        });
        Resource resourceBuild = builderNewBuilder.build();
        withInlinedExpunction.OooO0Oo(resource, resourceBuild);
        return resourceBuild;
    }
}
