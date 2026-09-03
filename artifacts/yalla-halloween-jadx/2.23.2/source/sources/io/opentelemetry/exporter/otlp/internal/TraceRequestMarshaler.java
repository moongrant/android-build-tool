package io.opentelemetry.exporter.otlp.internal;

import io.opentelemetry.api.trace.SpanKind;

/* JADX INFO: loaded from: classes5.dex */
public final class TraceRequestMarshaler extends MarshalerWithSize {

    /* JADX INFO: renamed from: io.opentelemetry.exporter.otlp.internal.TraceRequestMarshaler$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f32604OooO00o;

        static {
            int[] iArr = new int[SpanKind.values().length];
            f32604OooO00o = iArr;
            try {
                iArr[SpanKind.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32604OooO00o[SpanKind.SERVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32604OooO00o[SpanKind.CLIENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32604OooO00o[SpanKind.PRODUCER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32604OooO00o[SpanKind.CONSUMER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final class InstrumentationLibrarySpansMarshaler extends MarshalerWithSize {
    }

    public static final class ResourceSpansMarshaler extends MarshalerWithSize {
    }

    public static final class SpanEventMarshaler extends MarshalerWithSize {
    }

    public static final class SpanLinkMarshaler extends MarshalerWithSize {
    }

    public static final class SpanMarshaler extends MarshalerWithSize {
    }

    public static final class SpanStatusMarshaler extends MarshalerWithSize {
    }
}
