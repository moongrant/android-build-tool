package io.opentelemetry.api.trace;

import io.opentelemetry.context.Context;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class OooO00o {
    public static Context OooO00o(Span span, Context context) {
        return context.OooO0Oo(SpanContextKey.f33069OooO00o, span);
    }

    public static Span OooO0O0(Context context) {
        if (context == null) {
            return PropagatedSpan.f33067OooO0o0;
        }
        Span span = (Span) context.OooO0OO(SpanContextKey.f33069OooO00o);
        return span == null ? PropagatedSpan.f33067OooO0o0 : span;
    }

    public static Span OooO0OO(SpanContext spanContext) {
        return (spanContext == null || !spanContext.isValid()) ? PropagatedSpan.f33067OooO0o0 : new PropagatedSpan(spanContext);
    }
}
