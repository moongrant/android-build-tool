package com.squareup.okhttp;

import java.io.Closeable;
import java.io.IOException;
import p662o0oooO0O.o0O0o0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oo000o implements Closeable {
    public abstract long OooO00o() throws IOException;

    public abstract o0O0o0 OooO0OO() throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        OooO0OO().close();
    }
}
