package io.opentelemetry.exporter.otlp.internal;

/* JADX INFO: loaded from: classes5.dex */
final class NoopMarshaler extends MarshalerWithSize {
    static {
        new NoopMarshaler();
    }

    private NoopMarshaler() {
        super(0);
    }
}
