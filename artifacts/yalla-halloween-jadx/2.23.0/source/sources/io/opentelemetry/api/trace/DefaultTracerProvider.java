package io.opentelemetry.api.trace;

import javax.annotation.concurrent.ThreadSafe;

/* JADX INFO: loaded from: classes5.dex */
@ThreadSafe
class DefaultTracerProvider implements TracerProvider {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final TracerProvider f33062OooO0Oo = new DefaultTracerProvider();

    private DefaultTracerProvider() {
    }

    @Override // io.opentelemetry.api.trace.TracerProvider
    public final Tracer get() {
        return DefaultTracer.f33060OooO00o;
    }
}
