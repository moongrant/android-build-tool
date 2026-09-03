package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO extends OutputStream {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final OutputStream f13038OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final p156o00OoO00.OooO0o f13039OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public byte[] f13040OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f13041OooO0oO;

    public OooO0OO(@NonNull FileOutputStream fileOutputStream, @NonNull p156o00OoO00.OooO0o oooO0o) {
        this.f13038OooO0Oo = fileOutputStream;
        this.f13039OooO0o = oooO0o;
        this.f13040OooO0o0 = (byte[]) oooO0o.OooO0OO(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        OutputStream outputStream = this.f13038OooO0Oo;
        try {
            flush();
            outputStream.close();
            byte[] bArr = this.f13040OooO0o0;
            if (bArr != null) {
                this.f13039OooO0o.put(bArr);
                this.f13040OooO0o0 = null;
            }
        } catch (Throwable th) {
            outputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.f13041OooO0oO;
        OutputStream outputStream = this.f13038OooO0Oo;
        if (i > 0) {
            outputStream.write(this.f13040OooO0o0, 0, i);
            this.f13041OooO0oO = 0;
        }
        outputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f13040OooO0o0;
        int i2 = this.f13041OooO0oO;
        int i3 = i2 + 1;
        this.f13041OooO0oO = i3;
        bArr[i2] = (byte) i;
        if (i3 != bArr.length || i3 <= 0) {
            return;
        }
        this.f13038OooO0Oo.write(bArr, 0, i3);
        this.f13041OooO0oO = 0;
    }

    @Override // java.io.OutputStream
    public final void write(@NonNull byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f13041OooO0oO;
            OutputStream outputStream = this.f13038OooO0Oo;
            if (i6 == 0 && i4 >= this.f13040OooO0o0.length) {
                outputStream.write(bArr, i5, i4);
                return;
            }
            int iMin = Math.min(i4, this.f13040OooO0o0.length - i6);
            System.arraycopy(bArr, i5, this.f13040OooO0o0, this.f13041OooO0oO, iMin);
            int i7 = this.f13041OooO0oO + iMin;
            this.f13041OooO0oO = i7;
            i3 += iMin;
            byte[] bArr2 = this.f13040OooO0o0;
            if (i7 == bArr2.length && i7 > 0) {
                outputStream.write(bArr2, 0, i7);
                this.f13041OooO0oO = 0;
            }
        } while (i3 < i2);
    }
}
