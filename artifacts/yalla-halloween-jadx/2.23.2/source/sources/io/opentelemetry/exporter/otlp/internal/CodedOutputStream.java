package io.opentelemetry.exporter.otlp.internal;

import java.io.IOException;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
abstract class CodedOutputStream {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f32584OooO00o = 0;

    public static abstract class AbstractBufferedEncoder extends CodedOutputStream {
    }

    public static class OutOfSpaceException extends IOException {
        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    public static final class OutputStreamEncoder extends AbstractBufferedEncoder {
    }

    static {
        Logger.getLogger(CodedOutputStream.class.getName());
        try {
            Integer.parseInt(System.getProperty("otel.experimental.otlp.buffer-size"));
        } catch (Throwable unused) {
        }
        new ThreadLocal();
    }

    private CodedOutputStream() {
    }

    public static int OooO00o(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }
}
