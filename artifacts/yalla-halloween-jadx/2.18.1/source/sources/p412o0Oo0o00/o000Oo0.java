package p412o0Oo0o00;

import java.io.Closeable;
import java.io.IOException;
import p674o0oooo0.o0oOOo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o000Oo0 implements Closeable {
    public abstract long OooO00o() throws IOException;

    public abstract o0oOOo OooO0O0() throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        OooO0O0().close();
    }
}
