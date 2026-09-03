package io.opentelemetry.api.trace;

import io.opentelemetry.api.internal.InternalAttributeKeyImpl;
import io.opentelemetry.context.Context;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public interface SpanBuilder {
    Span OooO00o();

    SpanBuilder OooO0O0();

    SpanBuilder OooO0OO(Context context);

    SpanBuilder OooO0Oo(InternalAttributeKeyImpl internalAttributeKeyImpl, Object obj);

    SpanBuilder OooO0o(long j, TimeUnit timeUnit);

    SpanBuilder OooO0o0(SpanKind spanKind);

    SpanBuilder OooO0oO(String str);
}
