package com.amazonaws.util;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: classes2.dex */
public class CRC32ChecksumCalculatingInputStream extends SdkFilterInputStream {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final CRC32 f9577OooO0Oo;

    public CRC32ChecksumCalculatingInputStream(InputStream inputStream) {
        super(inputStream);
        this.f9577OooO0Oo = new CRC32();
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        OooO0OO();
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            this.f9577OooO0Oo.update(i);
        }
        return i;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        OooO0OO();
        this.f9577OooO0Oo.reset();
        ((FilterInputStream) this).in.reset();
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        OooO0OO();
        int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (i3 != -1) {
            this.f9577OooO0Oo.update(bArr, i, i3);
        }
        return i3;
    }
}
