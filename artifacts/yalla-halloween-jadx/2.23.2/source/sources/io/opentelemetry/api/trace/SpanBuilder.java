package io.opentelemetry.api.trace;

import io.opentelemetry.api.internal.InternalAttributeKeyImpl;
import io.opentelemetry.context.Context;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public interface SpanBuilder {
    Span OooO00o();

    SpanBuilder OooO0O0();

    SpanBuilder OooO0OO();

    SpanBuilder OooO0Oo(Context context);

    SpanBuilder OooO0o(SpanKind spanKind);

    SpanBuilder OooO0o0(InternalAttributeKeyImpl internalAttributeKeyImpl, Object obj);

    SpanBuilder OooO0oO(long j, TimeUnit timeUnit);

    SpanBuilder OooO0oo(String str);
}
