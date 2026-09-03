package com.qiniu.android.http.request.httpclient;

import java.io.IOException;
import java.util.Arrays;
import p634o0ooO0oO.o00OOO0;
import p634o0ooO0oO.oo00oO;
import p659o0oooO00.o0000Ooo;

/* JADX INFO: loaded from: classes4.dex */
public class ByteBody extends oo00oO {
    private static final int SEGMENT_SIZE = 102400;
    private final byte[] body;
    private final o00OOO0 mediaType;

    public ByteBody(o00OOO0 o00ooo1, byte[] bArr) {
        this.mediaType = o00ooo1;
        this.body = bArr;
    }

    private oo00oO getRequestBodyWithRange(int i, int i2) {
        return oo00oO.create(contentType(), Arrays.copyOfRange(this.body, i, i2 + i));
    }

    @Override // p634o0ooO0oO.oo00oO
    public long contentLength() throws IOException {
        return this.body.length;
    }

    @Override // p634o0ooO0oO.oo00oO
    public o00OOO0 contentType() {
        return this.mediaType;
    }

    @Override // p634o0ooO0oO.oo00oO
    public void writeTo(o0000Ooo o0000ooo) throws IOException {
        int i = 0;
        int iMin = SEGMENT_SIZE;
        while (true) {
            byte[] bArr = this.body;
            if (i >= bArr.length) {
                return;
            }
            iMin = Math.min(iMin, bArr.length - i);
            getRequestBodyWithRange(i, iMin).writeTo(o0000ooo);
            o0000ooo.flush();
            i += iMin;
        }
    }
}
