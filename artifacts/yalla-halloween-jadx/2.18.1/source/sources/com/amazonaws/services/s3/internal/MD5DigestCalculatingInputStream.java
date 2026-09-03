package com.amazonaws.services.s3.internal;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.conscrypt.EvpMdRef;

/* JADX INFO: loaded from: classes.dex */
public class MD5DigestCalculatingInputStream extends SdkFilterInputStream {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public MessageDigest f10649Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public MessageDigest f10650Oooo0oO;

    public MD5DigestCalculatingInputStream(InputStream inputStream) {
        super(inputStream);
        try {
            this.f10649Oooo0o = MessageDigest.getInstance(EvpMdRef.MD5.JCA_NAME);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("unexpected", e);
        }
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        if (markSupported()) {
            super.mark(i);
            try {
                this.f10650Oooo0oO = (MessageDigest) this.f10649Oooo0o.clone();
            } catch (CloneNotSupportedException e) {
                throw new IllegalStateException("unexpected", e);
            }
        }
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = super.read();
        if (i != -1) {
            this.f10649Oooo0o.update((byte) i);
        }
        return i;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        MessageDigest messageDigest;
        if (!markSupported()) {
            throw new IOException("mark/reset not supported");
        }
        super.reset();
        MessageDigest messageDigest2 = this.f10650Oooo0oO;
        if (messageDigest2 == null) {
            try {
                messageDigest = MessageDigest.getInstance(EvpMdRef.MD5.JCA_NAME);
            } catch (NoSuchAlgorithmException e) {
                throw new IllegalStateException("unexpected", e);
            }
        } else {
            try {
                messageDigest = (MessageDigest) messageDigest2.clone();
            } catch (CloneNotSupportedException e2) {
                throw new IllegalStateException("unexpected", e2);
            }
        }
        this.f10649Oooo0o = messageDigest;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = super.read(bArr, i, i2);
        if (i3 != -1) {
            this.f10649Oooo0o.update(bArr, i, i3);
        }
        return i3;
    }
}
