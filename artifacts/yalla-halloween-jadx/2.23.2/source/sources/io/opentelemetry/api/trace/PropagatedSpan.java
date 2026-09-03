package io.opentelemetry.api.trace;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.internal.ImmutableSpanContext;
import io.opentelemetry.api.internal.InternalAttributeKeyImpl;
import io.opentelemetry.context.Context;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@Immutable
final class PropagatedSpan implements Span {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final PropagatedSpan f32534OooO0o0 = new PropagatedSpan(ImmutableSpanContext.f32504OooO00o);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final SpanContext f32535OooO0Oo;

    public PropagatedSpan(SpanContext spanContext) {
        this.f32535OooO0Oo = spanContext;
    }

    @Override // io.opentelemetry.api.trace.Span
    public final Span OooO(StatusCode statusCode) {
        return this;
    }

    @Override // io.opentelemetry.api.trace.Span
    public final SpanContext OooO0O0() {
        return this.f32535OooO0Oo;
    }

    @Override // io.opentelemetry.api.trace.Span
    public final Span OooO0OO(Attributes attributes, String str) {
        return this;
    }

    @Override // io.opentelemetry.api.trace.Span
    public final Span OooO0o0(InternalAttributeKeyImpl internalAttributeKeyImpl, int i) {
        return this;
    }

    @Override // io.opentelemetry.context.ImplicitContextKeyed
    public final /* synthetic */ Context OooO0oO(Context context) {
        return OooO00o.OooO00o(this, context);
    }

    @Override // io.opentelemetry.api.trace.Span
    public final void OooO0oo() {
    }

    @Override // io.opentelemetry.api.trace.Span
    public final <T> Span OooOO0(AttributeKey<T> attributeKey, T t) {
        return this;
    }

    @Override // io.opentelemetry.api.trace.Span
    public final Span OooOO0O(StatusCode statusCode, String str) {
        return this;
    }

    public final String toString() {
        return "PropagatedSpan{" + this.f32535OooO0Oo + '}';
    }
}
