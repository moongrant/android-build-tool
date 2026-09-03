package io.opentelemetry.context.propagation;

/* JADX INFO: loaded from: classes5.dex */
final class DefaultContextPropagators implements ContextPropagators {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final ContextPropagators f32577OooO0O0 = new DefaultContextPropagators(NoopTextMapPropagator.f32579OooO00o);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TextMapPropagator f32578OooO00o;

    public DefaultContextPropagators(TextMapPropagator textMapPropagator) {
        this.f32578OooO00o = textMapPropagator;
    }
}
