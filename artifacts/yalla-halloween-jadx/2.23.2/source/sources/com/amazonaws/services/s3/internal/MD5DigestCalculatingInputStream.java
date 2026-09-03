package com.amazonaws.services.s3.internal;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes2.dex */
public class MD5DigestCalculatingInputStream extends SdkFilterInputStream {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public MessageDigest f12406OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public MessageDigest f12407OooO0o0;

    public MD5DigestCalculatingInputStream(InputStream inputStream) {
        super(inputStream);
        try {
            this.f12406OooO0Oo = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("unexpected", e);
        }
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        if (markSupported()) {
            super.mark(i);
            try {
                this.f12407OooO0o0 = (MessageDigest) this.f12406OooO0Oo.clone();
            } catch (CloneNotSupportedException e) {
                throw new IllegalStateException("unexpected", e);
            }
        }
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = super.read();
        if (i != -1) {
            this.f12406OooO0Oo.update((byte) i);
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
        MessageDigest messageDigest2 = this.f12407OooO0o0;
        if (messageDigest2 == null) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
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
        this.f12406OooO0Oo = messageDigest;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = super.read(bArr, i, i2);
        if (i3 != -1) {
            this.f12406OooO0Oo.update(bArr, i, i3);
        }
        return i3;
    }
}
