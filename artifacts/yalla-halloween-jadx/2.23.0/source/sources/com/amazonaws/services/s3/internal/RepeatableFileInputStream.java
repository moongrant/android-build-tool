package com.amazonaws.services.s3.internal;

import com.amazonaws.internal.SdkInputStream;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class RepeatableFileInputStream extends SdkInputStream {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final Log f9324OooO0oo = LogFactory.OooO0O0("RepeatableFIS");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final File f9325OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public FileInputStream f9327OooO0o0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f9326OooO0o = 0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f9328OooO0oO = 0;

    public RepeatableFileInputStream(File file) throws FileNotFoundException {
        this.f9327OooO0o0 = null;
        if (file == null) {
            throw new IllegalArgumentException("File cannot be null");
        }
        this.f9327OooO0o0 = new FileInputStream(file);
        this.f9325OooO0Oo = file;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        OooO00o();
        return this.f9327OooO0o0.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f9327OooO0o0.close();
        OooO00o();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        OooO00o();
        this.f9328OooO0oO += this.f9326OooO0o;
        this.f9326OooO0o = 0L;
        Log log = f9324OooO0oo;
        if (log.OooO0O0()) {
            log.OooO0oO("Input stream marked at " + this.f9328OooO0oO + " bytes");
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        OooO00o();
        int i = this.f9327OooO0o0.read();
        if (i == -1) {
            return -1;
        }
        this.f9326OooO0o++;
        return i;
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        this.f9327OooO0o0.close();
        OooO00o();
        this.f9327OooO0o0 = new FileInputStream(this.f9325OooO0Oo);
        long jSkip = this.f9328OooO0oO;
        while (jSkip > 0) {
            jSkip -= this.f9327OooO0o0.skip(jSkip);
        }
        Log log = f9324OooO0oo;
        if (log.OooO0O0()) {
            log.OooO0oO("Reset to mark point " + this.f9328OooO0oO + " after returning " + this.f9326OooO0o + " bytes");
        }
        this.f9326OooO0o = 0L;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        OooO00o();
        long jSkip = this.f9327OooO0o0.skip(j);
        this.f9326OooO0o += jSkip;
        return jSkip;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        OooO00o();
        int i3 = this.f9327OooO0o0.read(bArr, i, i2);
        this.f9326OooO0o += (long) i3;
        return i3;
    }
}
