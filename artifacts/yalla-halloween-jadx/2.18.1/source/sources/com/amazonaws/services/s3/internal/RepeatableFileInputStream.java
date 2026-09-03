package com.amazonaws.services.s3.internal;

import OooO00o.OooO00o;
import com.amazonaws.internal.SdkInputStream;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class RepeatableFileInputStream extends SdkInputStream {

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final Log f10657OoooO00 = LogFactory.OooO0O0("RepeatableFIS");

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final File f10659Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public FileInputStream f10660Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public long f10661Oooo0oo = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public long f10658Oooo = 0;

    public RepeatableFileInputStream(File file) throws FileNotFoundException {
        this.f10660Oooo0oO = null;
        if (file == null) {
            throw new IllegalArgumentException("File cannot be null");
        }
        this.f10660Oooo0oO = new FileInputStream(file);
        this.f10659Oooo0o = file;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        OooO00o();
        return this.f10660Oooo0oO.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f10660Oooo0oO.close();
        OooO00o();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        OooO00o();
        this.f10658Oooo += this.f10661Oooo0oo;
        this.f10661Oooo0oo = 0L;
        Log log = f10657OoooO00;
        if (log.OooO0OO()) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Input stream marked at ");
            sbOooO0o0.append(this.f10658Oooo);
            sbOooO0o0.append(" bytes");
            log.OooO00o(sbOooO0o0.toString());
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        OooO00o();
        int i = this.f10660Oooo0oO.read();
        if (i == -1) {
            return -1;
        }
        this.f10661Oooo0oo++;
        return i;
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        this.f10660Oooo0oO.close();
        OooO00o();
        this.f10660Oooo0oO = new FileInputStream(this.f10659Oooo0o);
        long jSkip = this.f10658Oooo;
        while (jSkip > 0) {
            jSkip -= this.f10660Oooo0oO.skip(jSkip);
        }
        Log log = f10657OoooO00;
        if (log.OooO0OO()) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Reset to mark point ");
            sbOooO0o0.append(this.f10658Oooo);
            sbOooO0o0.append(" after returning ");
            sbOooO0o0.append(this.f10661Oooo0oo);
            sbOooO0o0.append(" bytes");
            log.OooO00o(sbOooO0o0.toString());
        }
        this.f10661Oooo0oo = 0L;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        OooO00o();
        long jSkip = this.f10660Oooo0oO.skip(j);
        this.f10661Oooo0oo += jSkip;
        return jSkip;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        OooO00o();
        int i3 = this.f10660Oooo0oO.read(bArr, i, i2);
        this.f10661Oooo0oo += (long) i3;
        return i3;
    }
}
