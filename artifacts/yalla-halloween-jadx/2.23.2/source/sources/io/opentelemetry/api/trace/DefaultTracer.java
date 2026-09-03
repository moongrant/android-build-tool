package io.opentelemetry.api.trace;

import io.opentelemetry.api.internal.ImmutableSpanContext;
import io.opentelemetry.api.internal.InternalAttributeKeyImpl;
import io.opentelemetry.context.Context;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

/* JADX INFO: loaded from: classes5.dex */
@ThreadSafe
final class DefaultTracer implements Tracer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Tracer f32527OooO00o = new DefaultTracer();

    public static final class NoopSpanBuilder implements SpanBuilder {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public SpanContext f32528OooO00o;

        private NoopSpanBuilder() {
        }

        public static NoopSpanBuilder OooO() {
            return new NoopSpanBuilder();
        }

        @Override // io.opentelemetry.api.trace.SpanBuilder
        public final Span OooO00o() {
            if (this.f32528OooO00o == null) {
                Span span = (Span) io.opentelemetry.context.OooO0O0.OooO00o().OooO0OO(SpanContextKey.f32536OooO00o);
                if (span == null) {
                    span = PropagatedSpan.f32534OooO0o0;
                }
                this.f32528OooO00o = span.OooO0O0();
            }
            return OooO00o.OooO0OO(this.f32528OooO00o);
        }

        @Override // io.opentelemetry.api.trace.SpanBuilder
        public final SpanBuilder OooO0O0() {
            return this;
        }

        @Override // io.opentelemetry.api.trace.SpanBuilder
        public final SpanBuilder OooO0OO() {
            this.f32528OooO00o = ImmutableSpanContext.f32504OooO00o;
            return this;
        }

        @Override // io.opentelemetry.api.trace.SpanBuilder
        public final SpanBuilder OooO0Oo(Context context) {
            if (context != null) {
                this.f32528OooO00o = OooO00o.OooO0O0(context).OooO0O0();
            }
            return this;
        }

        @Override // io.opentelemetry.api.trace.SpanBuilder
        public final SpanBuilder OooO0o(SpanKind spanKind) {
            return this;
        }

        @Override // io.opentelemetry.api.trace.SpanBuilder
        public final SpanBuilder OooO0o0(InternalAttributeKeyImpl internalAttributeKeyImpl, Object obj) {
            return this;
        }

        @Override // io.opentelemetry.api.trace.SpanBuilder
        public final SpanBuilder OooO0oO(long j, TimeUnit timeUnit) {
            return this;
        }

        @Override // io.opentelemetry.api.trace.SpanBuilder
        public final SpanBuilder OooO0oo(String str) {
            return this;
        }
    }

    private DefaultTracer() {
    }

    @Override // io.opentelemetry.api.trace.Tracer
    public final SpanBuilder OooO00o(String str) {
        return NoopSpanBuilder.OooO();
    }
}
