package io.opentelemetry.context.propagation;

/* JADX INFO: loaded from: classes5.dex */
final class DefaultContextPropagators implements ContextPropagators {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final ContextPropagators f33110OooO0O0 = new DefaultContextPropagators(NoopTextMapPropagator.f33112OooO00o);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TextMapPropagator f33111OooO00o;

    public DefaultContextPropagators(TextMapPropagator textMapPropagator) {
        this.f33111OooO00o = textMapPropagator;
    }
}
