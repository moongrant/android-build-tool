package io.opentelemetry.api.trace;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.internal.InternalAttributeKeyImpl;
import io.opentelemetry.context.ImplicitContextKeyed;
import javax.annotation.concurrent.ThreadSafe;

/* JADX INFO: loaded from: classes5.dex */
@ThreadSafe
public interface Span extends ImplicitContextKeyed {
    Span OooO(StatusCode statusCode, String str);

    SpanContext OooO0O0();

    Span OooO0OO(InternalAttributeKeyImpl internalAttributeKeyImpl, int i);

    void OooO0o();

    Span OooO0oO(StatusCode statusCode);

    <T> Span OooO0oo(AttributeKey<T> attributeKey, T t);
}
