package com.amazonaws.event;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ProgressReportingInputStream extends SdkFilterInputStream {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f9070OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f9071OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ProgressListenerCallbackExecutor f9072OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f9073OooO0oO;

    public ProgressReportingInputStream(InputStream inputStream, ProgressListenerCallbackExecutor progressListenerCallbackExecutor) {
        super(inputStream);
        this.f9070OooO0Oo = 8192;
        this.f9072OooO0o0 = progressListenerCallbackExecutor;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.f9071OooO0o;
        if (i > 0) {
            this.f9072OooO0o0.OooO00o(new ProgressEvent(i));
            this.f9071OooO0o = 0;
        }
        super.close();
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = super.read();
        ProgressListenerCallbackExecutor progressListenerCallbackExecutor = this.f9072OooO0o0;
        if (i != -1) {
            int i2 = this.f9071OooO0o + 1;
            this.f9071OooO0o = i2;
            if (i2 >= this.f9070OooO0Oo) {
                progressListenerCallbackExecutor.OooO00o(new ProgressEvent(i2));
                this.f9071OooO0o = 0;
            }
        } else if (this.f9073OooO0oO) {
            ProgressEvent progressEvent = new ProgressEvent(this.f9071OooO0o);
            progressEvent.f9065OooO0O0 = 4;
            this.f9071OooO0o = 0;
            progressListenerCallbackExecutor.OooO00o(progressEvent);
        }
        return i;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        super.reset();
        ProgressEvent progressEvent = new ProgressEvent(this.f9071OooO0o);
        progressEvent.f9065OooO0O0 = 32;
        this.f9072OooO0o0.OooO00o(progressEvent);
        this.f9071OooO0o = 0;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = super.read(bArr, i, i2);
        ProgressListenerCallbackExecutor progressListenerCallbackExecutor = this.f9072OooO0o0;
        if (i3 == -1 && this.f9073OooO0oO) {
            ProgressEvent progressEvent = new ProgressEvent(this.f9071OooO0o);
            progressEvent.f9065OooO0O0 = 4;
            this.f9071OooO0o = 0;
            progressListenerCallbackExecutor.OooO00o(progressEvent);
        }
        if (i3 != -1) {
            int i4 = this.f9071OooO0o + i3;
            this.f9071OooO0o = i4;
            if (i4 >= this.f9070OooO0Oo) {
                progressListenerCallbackExecutor.OooO00o(new ProgressEvent(i4));
                this.f9071OooO0o = 0;
            }
        }
        return i3;
    }
}
