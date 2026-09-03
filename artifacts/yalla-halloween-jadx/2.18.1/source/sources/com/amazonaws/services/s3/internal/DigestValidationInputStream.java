package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonClientException;
import com.amazonaws.internal.SdkDigestInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class DigestValidationInputStream extends SdkDigestInputStream {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public byte[] f10642Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f10643Oooo0oO;

    public DigestValidationInputStream(InputStream inputStream, MessageDigest messageDigest, byte[] bArr) {
        super(inputStream, messageDigest);
        this.f10643Oooo0oO = false;
        this.f10642Oooo0o = bArr;
    }

    public final void OooO00o() {
        if (this.f10642Oooo0o == null || this.f10643Oooo0oO) {
            return;
        }
        this.f10643Oooo0oO = true;
        if (!Arrays.equals(((DigestInputStream) this).digest.digest(), this.f10642Oooo0o)) {
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
