package com.qiniu.android.http.request.httpclient;

import java.io.IOException;
import java.util.Arrays;
import p641o0ooOO0o.o0O000Oo;
import p641o0ooOO0o.o0oO0Ooo;
import p662o0oooO0O.o0O0o00O;

/* JADX INFO: loaded from: classes3.dex */
public class ByteBody extends o0oO0Ooo {
    private static final int SEGMENT_SIZE = 102400;
    private final byte[] body;
    private final o0O000Oo mediaType;

    public ByteBody(o0O000Oo o0o000oo2, byte[] bArr) {
        this.mediaType = o0o000oo2;
        this.body = bArr;
    }

    private o0oO0Ooo getRequestBodyWithRange(int i, int i2) {
        return o0oO0Ooo.create(contentType(), Arrays.copyOfRange(this.body, i, i2 + i));
    }

    @Override // p641o0ooOO0o.o0oO0Ooo
    public long contentLength() throws IOException {
        return this.body.length;
    }

    @Override // p641o0ooOO0o.o0oO0Ooo
    public o0O000Oo contentType() {
        return this.mediaType;
    }

    @Override // p641o0ooOO0o.o0oO0Ooo
    public void writeTo(o0O0o00O o0o0o00o) throws IOException {
        int i = 0;
        int iMin = SEGMENT_SIZE;
        while (true) {
            byte[] bArr = this.body;
            if (i >= bArr.length) {
                return;
            }
            iMin = Math.min(iMin, bArr.length - i);
            getRequestBodyWithRange(i, iMin).writeTo(o0o0o00o);
            o0o0o00o.flush();
            i += iMin;
        }
    }
}
