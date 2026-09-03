package org.mp4parser.aj.lang;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes5.dex */
public class SoftException extends RuntimeException {
    static {
        try {
            Class.forName("java.nio.Buffer");
        } catch (Throwable unused) {
        }
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return null;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
    }
}
