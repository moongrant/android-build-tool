package io.opentelemetry.api.trace;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.internal.InternalAttributeKeyImpl;
import io.opentelemetry.context.ImplicitContextKeyed;
import javax.annotation.concurrent.ThreadSafe;

/* JADX INFO: loaded from: classes5.dex */
@ThreadSafe
public interface Span extends ImplicitContextKeyed {
    Span OooO(StatusCode statusCode);

    SpanContext OooO0O0();

    Span OooO0OO(Attributes attributes, String str);

    Span OooO0o0(InternalAttributeKeyImpl internalAttributeKeyImpl, int i);

    void OooO0oo();

    <T> Span OooOO0(AttributeKey<T> attributeKey, T t);

    Span OooOO0O(StatusCode statusCode, String str);
}
