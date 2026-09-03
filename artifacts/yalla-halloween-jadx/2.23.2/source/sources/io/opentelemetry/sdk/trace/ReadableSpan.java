package io.opentelemetry.sdk.trace;

import io.opentelemetry.api.internal.InternalAttributeKeyImpl;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.sdk.trace.data.SpanData;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public interface ReadableSpan {
    @Nullable
    Object OooO00o(InternalAttributeKeyImpl internalAttributeKeyImpl);

    SpanContext OooO0O0();

    SpanData OooO0Oo();
}
