package com.amazonaws.util;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: classes.dex */
public class CRC32ChecksumCalculatingInputStream extends SdkFilterInputStream {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public CRC32 f11174Oooo0o;

    public CRC32ChecksumCalculatingInputStream(InputStream inputStream) {
        super(inputStream);
        this.f11174Oooo0o = new CRC32();
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        OooO0O0();
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            this.f11174Oooo0o.update(i);
        }
        return i;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        OooO0O0();
        this.f11174Oooo0o.reset();
        ((FilterInputStream) this).in.reset();
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        OooO0O0();
        int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (i3 != -1) {
            this.f11174Oooo0o.update(bArr, i, i3);
        }
        return i3;
    }
}
