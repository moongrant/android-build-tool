package com.amazonaws.event;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ProgressReportingInputStream extends SdkFilterInputStream {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f12160OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f12161OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ProgressListenerCallbackExecutor f12162OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f12163OooO0oO;

    public ProgressReportingInputStream(InputStream inputStream, ProgressListenerCallbackExecutor progressListenerCallbackExecutor) {
        super(inputStream);
        this.f12160OooO0Oo = 8192;
        this.f12162OooO0o0 = progressListenerCallbackExecutor;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.f12161OooO0o;
        if (i > 0) {
            this.f12162OooO0o0.OooO00o(new ProgressEvent(i));
            this.f12161OooO0o = 0;
        }
        super.close();
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = super.read();
        ProgressListenerCallbackExecutor progressListenerCallbackExecutor = this.f12162OooO0o0;
        if (i != -1) {
            int i2 = this.f12161OooO0o + 1;
            this.f12161OooO0o = i2;
            if (i2 >= this.f12160OooO0Oo) {
                progressListenerCallbackExecutor.OooO00o(new ProgressEvent(i2));
                this.f12161OooO0o = 0;
            }
        } else if (this.f12163OooO0oO) {
            ProgressEvent progressEvent = new ProgressEvent(this.f12161OooO0o);
            progressEvent.f12155OooO0O0 = 4;
            this.f12161OooO0o = 0;
            progressListenerCallbackExecutor.OooO00o(progressEvent);
        }
        return i;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        super.reset();
        ProgressEvent progressEvent = new ProgressEvent(this.f12161OooO0o);
        progressEvent.f12155OooO0O0 = 32;
        this.f12162OooO0o0.OooO00o(progressEvent);
        this.f12161OooO0o = 0;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = super.read(bArr, i, i2);
        ProgressListenerCallbackExecutor progressListenerCallbackExecutor = this.f12162OooO0o0;
        if (i3 == -1 && this.f12163OooO0oO) {
            ProgressEvent progressEvent = new ProgressEvent(this.f12161OooO0o);
            progressEvent.f12155OooO0O0 = 4;
            this.f12161OooO0o = 0;
            progressListenerCallbackExecutor.OooO00o(progressEvent);
        }
        if (i3 != -1) {
            int i4 = this.f12161OooO0o + i3;
            this.f12161OooO0o = i4;
            if (i4 >= this.f12160OooO0Oo) {
                progressListenerCallbackExecutor.OooO00o(new ProgressEvent(i4));
                this.f12161OooO0o = 0;
            }
        }
        return i3;
    }
}
