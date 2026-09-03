package com.amazonaws.services.s3.model;

import com.amazonaws.internal.SdkFilterInputStream;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.metrics.AwsSdkMetrics;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class S3ObjectInputStream extends SdkFilterInputStream {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S3ObjectInputStream(InputStream inputStream) {
        super(inputStream);
        String str = AwsSdkMetrics.DEFAULT_METRIC_NAMESPACE;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream
    public final void OooO00o() {
        try {
            close();
        } catch (IOException e) {
            LogFactory.OooO00o(getClass()).OooO00o("FYI", e);
        }
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        int iAvailable = super.available();
        if (iAvailable == 0) {
            return 1;
        }
        return iAvailable;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        return super.read();
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        super.reset();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        return super.read(bArr, i, i2);
    }
}
