package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonClientException;
import com.amazonaws.internal.SdkDigestInputStream;
import com.amazonaws.internal.SdkFilterInputStream;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class DigestValidationInputStream extends SdkDigestInputStream {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final byte[] f12399OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f12400OooO0o0;

    public DigestValidationInputStream(SdkFilterInputStream sdkFilterInputStream, MessageDigest messageDigest, byte[] bArr) {
        super(sdkFilterInputStream, messageDigest);
        this.f12400OooO0o0 = false;
        this.f12399OooO0Oo = bArr;
    }

    public final void OooO00o() {
        byte[] bArr = this.f12399OooO0Oo;
        if (bArr == null || this.f12400OooO0o0) {
            return;
        }
        this.f12400OooO0o0 = true;
        if (!Arrays.equals(((DigestInputStream) this).digest.digest(), bArr)) {
            throw new AmazonClientException("Unable to verify integrity of data download.  Client calculated content hash didn't match hash calculated by Amazon S3.  The data may be corrupt.");
        }
    }

    @Override // java.security.DigestInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = super.read();
        if (i == -1) {
            OooO00o();
        }
        return i;
    }

    @Override // java.security.DigestInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = super.read(bArr, i, i2);
        if (i3 == -1) {
            OooO00o();
        }
        return i3;
    }
}
