package com.qiniu.android.http.request.httpclient;

import com.qiniu.android.http.CancellationHandler;
import com.qiniu.android.http.ProgressHandler;
import com.qiniu.android.utils.AsyncRun;
import java.io.IOException;
import p660o0ooo0o0.o00OO0O0;
import p660o0ooo0o0.o0o0Oo;
import p674o0oooo0.o0;
import p674o0oooo0.o0O000Oo;
import p674o0oooo0.o0O00O;
import p674o0oooo0.o0O00o00;
import p674o0oooo0.o0oOO;
import p674o0oooo0.oo00oO;

/* JADX INFO: loaded from: classes2.dex */
public final class CountingRequestBody extends o0o0Oo {
    private static final int SEGMENT_SIZE = 2048;
    private final o0o0Oo body;
    private final CancellationHandler cancellationHandler;
    private final ProgressHandler progress;
    private final long totalSize;

    public final class CountingSink extends o0 {
        private int bytesWritten;

        public CountingSink(o0O00o00 o0o00o01) {
            super(o0o00o01);
            this.bytesWritten = 0;
        }

        @Override // p674o0oooo0.o0, p674o0oooo0.o0O00o00
        public void write(o0oOO o0ooo2, long j) throws IOException {
            if (CountingRequestBody.this.cancellationHandler == null && CountingRequestBody.this.progress == null) {
                super.write(o0ooo2, j);
                return;
            }
            if (CountingRequestBody.this.cancellationHandler != null && CountingRequestBody.this.cancellationHandler.isCancelled()) {
                throw new CancellationHandler.CancellationException();
            }
            super.write(o0ooo2, j);
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

    public CountingRequestBody(o0o0Oo o0o0oo, ProgressHandler progressHandler, long j, CancellationHandler cancellationHandler) {
        this.body = o0o0oo;
        this.progress = progressHandler;
        this.totalSize = j;
        this.cancellationHandler = cancellationHandler;
    }

    @Override // p660o0ooo0o0.o0o0Oo
    public long contentLength() throws IOException {
        return this.body.contentLength();
    }

    @Override // p660o0ooo0o0.o0o0Oo
    public o00OO0O0 contentType() {
        return this.body.contentType();
    }

    @Override // p660o0ooo0o0.o0o0Oo
    public void writeTo(oo00oO oo00oo) throws IOException {
        oo00oO oo00ooOooO0O0 = o0O000Oo.OooO0O0(new CountingSink(oo00oo));
        this.body.writeTo(oo00ooOooO0O0);
        ((o0O00O) oo00ooOooO0O0).flush();
    }
}
