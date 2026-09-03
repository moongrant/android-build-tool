package com.qiniu.android.http.request.httpclient;

import com.qiniu.android.http.CancellationHandler;
import com.qiniu.android.http.ProgressHandler;
import com.qiniu.android.utils.AsyncRun;
import java.io.IOException;
import p634o0ooO0oO.o00OOO0;
import p634o0ooO0oO.oo00oO;
import p659o0oooO00.o00;
import p659o0oooO00.o00000O;
import p659o0oooO00.o0000O;
import p659o0oooO00.o0000Ooo;
import p659o0oooO00.o000O0Oo;
import p659o0oooO00.o00O000;

/* JADX INFO: loaded from: classes4.dex */
public final class CountingRequestBody extends oo00oO {
    private static final int SEGMENT_SIZE = 2048;
    private final oo00oO body;
    private final CancellationHandler cancellationHandler;
    private final ProgressHandler progress;
    private final long totalSize;

    public final class CountingSink extends o0000O {
        private int bytesWritten;

        public CountingSink(o00O000 o00o001) {
            super(o00o001);
            this.bytesWritten = 0;
        }

        @Override // p659o0oooO00.o0000O, p659o0oooO00.o00O000
        public void write(o00000O o00000o, long j) throws IOException {
            if (CountingRequestBody.this.cancellationHandler == null && CountingRequestBody.this.progress == null) {
                super.write(o00000o, j);
                return;
            }
            if (CountingRequestBody.this.cancellationHandler != null && CountingRequestBody.this.cancellationHandler.isCancelled()) {
                throw new CancellationHandler.CancellationException();
            }
            super.write(o00000o, j);
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

    public CountingRequestBody(oo00oO oo00oo, ProgressHandler progressHandler, long j, CancellationHandler cancellationHandler) {
        this.body = oo00oo;
        this.progress = progressHandler;
        this.totalSize = j;
        this.cancellationHandler = cancellationHandler;
    }

    @Override // p634o0ooO0oO.oo00oO
    public long contentLength() throws IOException {
        return this.body.contentLength();
    }

    @Override // p634o0ooO0oO.oo00oO
    public o00OOO0 contentType() {
        return this.body.contentType();
    }

    @Override // p634o0ooO0oO.oo00oO
    public void writeTo(o0000Ooo o0000ooo) throws IOException {
        o00 o00VarOooO00o = o000O0Oo.OooO00o(new CountingSink(o0000ooo));
        this.body.writeTo(o00VarOooO00o);
        o00VarOooO00o.flush();
    }
}
