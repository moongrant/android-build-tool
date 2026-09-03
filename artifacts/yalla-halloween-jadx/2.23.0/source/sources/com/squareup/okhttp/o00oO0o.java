package com.squareup.okhttp;

import java.io.Closeable;
import java.io.IOException;
import p659o0oooO00.o0000;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o00oO0o implements Closeable {
    public abstract long OooO00o() throws IOException;

    public abstract o0000 OooO0OO() throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        OooO0OO().close();
    }
}
