package io.opentelemetry.api.trace;

import io.opentelemetry.api.internal.InternalAttributeKeyImpl;
import io.opentelemetry.context.Context;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

/* JADX INFO: loaded from: classes5.dex */
@ThreadSafe
final class DefaultTracer implements Tracer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Tracer f33060OooO00o = new DefaultTracer();

    public static final class NoopSpanBuilder implements SpanBuilder {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public SpanContext f33061OooO00o;

        private NoopSpanBuilder() {
        }

        public static NoopSpanBuilder OooO0oo() {
            return new NoopSpanBuilder();
        }

        @Override // io.opentelemetry.api.trace.SpanBuilder
        public final Span OooO00o() {
            if (this.f33061OooO00o == null) {
                Span span = (Span) io.opentelemetry.context.OooO0O0.OooO00o().OooO0OO(SpanContextKey.f33069OooO00o);
                if (span == null) {
                    span = PropagatedSpan.f33067OooO0o0;
                }
                this.f33061OooO00o = span.OooO0O0();
            }
            return OooO00o.OooO0OO(this.f33061OooO00o);
        }

        @Override // io.opentelemetry.api.trace.SpanBuilder
        public final SpanBuilder OooO0O0() {
            return this;
        }

        @Override // io.opentelemetry.api.trace.SpanBuilder
        public final SpanBuilder OooO0OO(Context context) {
            if (context != null) {
                this.f33061OooO00o = OooO00o.OooO0O0(context).OooO0O0();
            }
            return this;
        }

        @Override // io.opentelemetry.api.trace.SpanBuilder
        public final SpanBuilder OooO0Oo(InternalAttributeKeyImpl internalAttributeKeyImpl, Object obj) {
            return this;
        }

        @Override // io.opentelemetry.api.trace.SpanBuilder
        public final SpanBuilder OooO0o(long j, TimeUnit timeUnit) {
            return this;
        }

        @Override // io.opentelemetry.api.trace.SpanBuilder
        public final SpanBuilder OooO0o0(SpanKind spanKind) {
            return this;
        }

        @Override // io.opentelemetry.api.trace.SpanBuilder
        public final SpanBuilder OooO0oO(String str) {
            return this;
        }
    }

    private DefaultTracer() {
    }

    @Override // io.opentelemetry.api.trace.Tracer
    public final SpanBuilder OooO00o(String str) {
        return NoopSpanBuilder.OooO0oo();
    }
}
