package com.amazonaws.event;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class ProgressReportingInputStream extends SdkFilterInputStream {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f10375Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f10376Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final ProgressListenerCallbackExecutor f10377Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f10378Oooo0oo;

    public ProgressReportingInputStream(InputStream inputStream, ProgressListenerCallbackExecutor progressListenerCallbackExecutor) {
        super(inputStream);
        this.f10376Oooo0o = 8192;
        this.f10377Oooo0oO = progressListenerCallbackExecutor;
    }

    public final void OooO0Oo(int i) {
        int i2 = this.f10378Oooo0oo + i;
        this.f10378Oooo0oo = i2;
        if (i2 >= this.f10376Oooo0o) {
            this.f10377Oooo0oO.OooO00o(new ProgressEvent(i2));
            this.f10378Oooo0oo = 0;
        }
    }

    public final void OooO0o() {
        if (this.f10375Oooo) {
            ProgressEvent progressEvent = new ProgressEvent(this.f10378Oooo0oo);
            progressEvent.f10370OooO0O0 = 4;
            this.f10378Oooo0oo = 0;
            this.f10377Oooo0oO.OooO00o(progressEvent);
        }
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.f10378Oooo0oo;
        if (i > 0) {
            this.f10377Oooo0oO.OooO00o(new ProgressEvent(i));
            this.f10378Oooo0oo = 0;
        }
        super.close();
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = super.read();
        if (i == -1) {
            OooO0o();
        } else {
            OooO0Oo(1);
        }
        return i;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        super.reset();
        ProgressEvent progressEvent = new ProgressEvent(this.f10378Oooo0oo);
        progressEvent.f10370OooO0O0 = 32;
        this.f10377Oooo0oO.OooO00o(progressEvent);
        this.f10378Oooo0oo = 0;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = super.read(bArr, i, i2);
        if (i3 == -1) {
            OooO0o();
        }
        if (i3 != -1) {
            OooO0Oo(i3);
        }
        return i3;
    }
}
