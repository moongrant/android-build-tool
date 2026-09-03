package io.opentelemetry.api.trace;

import io.opentelemetry.context.ContextKey;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@Immutable
final class SpanContextKey {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ContextKey<Span> f32536OooO00o = io.opentelemetry.context.OooO0OO.OooO00o("opentelemetry-trace-span-key");

    private SpanContextKey() {
    }
}
