package com.squareup.okhttp;

import java.io.IOException;
import p659o0oooO00.o0000OO0;
import p659o0oooO00.o00O00;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0o extends o0000OO0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0OO0oo0.OooO0o.OooO f21546OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(o00O00 o00o01, o0OO0oo0.OooO0o.OooO oooO) {
        super(o00o01);
        this.f21546OooO0o0 = oooO;
    }

    @Override // p659o0oooO00.o0000OO0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f21546OooO0o0.close();
        super.close();
    }
}
