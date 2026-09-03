package io.opentelemetry.exporter.otlp.internal;

/* JADX INFO: loaded from: classes5.dex */
final class Utf8 {

    public static abstract class Processor {
    }

    public static final class SafeProcessor extends Processor {
    }

    public static class UnpairedSurrogateException extends IllegalArgumentException {
    }

    static {
        new SafeProcessor();
    }

    private Utf8() {
    }
}
