package com.qiniu.android.http.request.httpclient;

import java.io.IOException;
import java.util.Arrays;
import p660o0ooo0o0.o00OO0O0;
import p660o0ooo0o0.o0o0Oo;
import p674o0oooo0.oo00oO;

/* JADX INFO: loaded from: classes2.dex */
public class ByteBody extends o0o0Oo {
    private static final int SEGMENT_SIZE = 102400;
    private final byte[] body;
    private final o00OO0O0 mediaType;

    public ByteBody(o00OO0O0 o00oo0o1, byte[] bArr) {
        this.mediaType = o00oo0o1;
        this.body = bArr;
    }

    private o0o0Oo getRequestBodyWithRange(int i, int i2) {
        return o0o0Oo.create(contentType(), Arrays.copyOfRange(this.body, i, i2 + i));
    }

    @Override // p660o0ooo0o0.o0o0Oo
    public long contentLength() throws IOException {
        return this.body.length;
    }

    @Override // p660o0ooo0o0.o0o0Oo
    public o00OO0O0 contentType() {
        return this.mediaType;
    }

    @Override // p660o0ooo0o0.o0o0Oo
    public void writeTo(oo00oO oo00oo) throws IOException {
        int i = 0;
        int iMin = SEGMENT_SIZE;
        while (true) {
            byte[] bArr = this.body;
            if (i >= bArr.length) {
                return;
            }
            iMin = Math.min(iMin, bArr.length - i);
            getRequestBodyWithRange(i, iMin).writeTo(oo00oo);
            oo00oo.flush();
            i += iMin;
        }
    }
}
