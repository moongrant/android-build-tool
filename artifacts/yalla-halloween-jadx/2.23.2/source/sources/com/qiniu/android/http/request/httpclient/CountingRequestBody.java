package com.qiniu.android.http.request.httpclient;

import com.qiniu.android.http.CancellationHandler;
import com.qiniu.android.http.ProgressHandler;
import com.qiniu.android.utils.AsyncRun;
import java.io.IOException;
import p641o0ooOO0o.o0O000Oo;
import p641o0ooOO0o.o0oO0Ooo;
import p662o0oooO0O.o0O0o00O;
import p662o0oooO0O.o0OO;
import p662o0oooO0O.o0OOo000;
import p662o0oooO0O.oo0OOoo;
import p662o0oooO0O.oo0oO0;
import p662o0oooO0O.ooo0Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class CountingRequestBody extends o0oO0Ooo {
    private static final int SEGMENT_SIZE = 2048;
    private final o0oO0Ooo body;
    private final CancellationHandler cancellationHandler;
    private final ProgressHandler progress;
    private final long totalSize;

    public final class CountingSink extends oo0oO0 {
        private int bytesWritten;

        public CountingSink(ooo0Oo0 ooo0oo0) {
            super(ooo0oo0);
            this.bytesWritten = 0;
        }

        @Override // p662o0oooO0O.oo0oO0, p662o0oooO0O.ooo0Oo0
        public void write(oo0OOoo oo0oooo, long j) throws IOException {
            if (CountingRequestBody.this.cancellationHandler == null && CountingRequestBody.this.progress == null) {
                super.write(oo0oooo, j);
                return;
            }
            if (CountingRequestBody.this.cancellationHandler != null && CountingRequestBody.this.cancellationHandler.isCancelled()) {
                throw new CancellationHandler.CancellationException();
            }
            super.write(oo0oooo, j);
            this.bytesWritten = (int) (((long) this.bytesWritten) + j);
            if (CountingRequestBody.this.progress != null) {
                AsyncRun.runInMain(new Runnable() { // from class: com.qiniu.android.http.request.httpclient.CountingRequestBody.CountingSink.1
                    @Override // java.lang.Runnable
                    public void run() {
                        CountingRequestBody.this.progress.onProgress(CountingSink.this.bytesWritten, CountingRequestBody.this.totalSize);
                    }
                });
            }
        }
    }

    public CountingRequestBody(o0oO0Ooo o0oo0ooo2, ProgressHandler progressHandler, long j, CancellationHandler cancellationHandler) {
        this.body = o0oo0ooo2;
        this.progress = progressHandler;
        this.totalSize = j;
        this.cancellationHandler = cancellationHandler;
    }

    @Override // p641o0ooOO0o.o0oO0Ooo
    public long contentLength() throws IOException {
        return this.body.contentLength();
    }

    @Override // p641o0ooOO0o.o0oO0Ooo
    public o0O000Oo contentType() {
        return this.body.contentType();
    }

    @Override // p641o0ooOO0o.o0oO0Ooo
    public void writeTo(o0O0o00O o0o0o00o) throws IOException {
        o0OOo000 o0ooo000OooO00o = o0OO.OooO00o(new CountingSink(o0o0o00o));
        this.body.writeTo(o0ooo000OooO00o);
        o0ooo000OooO00o.flush();
    }
}
