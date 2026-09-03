package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.OutputStream;
import p219o00oO0O0.o0O00o0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO extends OutputStream {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f12467Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NonNull
    public final OutputStream f12468Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public byte[] f12469Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public o0O00o0 f12470Oooo0oo;

    public OooO0OO(@NonNull OutputStream outputStream, @NonNull o0O00o0 o0o00o1) {
        this.f12468Oooo0o = outputStream;
        this.f12470Oooo0oo = o0o00o1;
        this.f12469Oooo0oO = (byte[]) o0o00o1.OooO0oO(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            flush();
            this.f12468Oooo0o.close();
            byte[] bArr = this.f12469Oooo0oO;
            if (bArr != null) {
                this.f12470Oooo0oo.OooO0o(bArr);
                this.f12469Oooo0oO = null;
            }
        } catch (Throwable th) {
            this.f12468Oooo0o.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.f12467Oooo;
        if (i > 0) {
            this.f12468Oooo0o.write(this.f12469Oooo0oO, 0, i);
            this.f12467Oooo = 0;
        }
        this.f12468Oooo0o.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f12469Oooo0oO;
        int i2 = this.f12467Oooo;
        int i3 = i2 + 1;
        this.f12467Oooo = i3;
        bArr[i2] = (byte) i;
        if (i3 != bArr.length || i3 <= 0) {
            return;
        }
        this.f12468Oooo0o.write(bArr, 0, i3);
        this.f12467Oooo = 0;
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
            int i6 = this.f12467Oooo;
            if (i6 == 0 && i4 >= this.f12469Oooo0oO.length) {
                this.f12468Oooo0o.write(bArr, i5, i4);
                return;
            }
            int iMin = Math.min(i4, this.f12469Oooo0oO.length - i6);
            System.arraycopy(bArr, i5, this.f12469Oooo0oO, this.f12467Oooo, iMin);
            int i7 = this.f12467Oooo + iMin;
            this.f12467Oooo = i7;
            i3 += iMin;
            byte[] bArr2 = this.f12469Oooo0oO;
            if (i7 == bArr2.length && i7 > 0) {
                this.f12468Oooo0o.write(bArr2, 0, i7);
                this.f12467Oooo = 0;
            }
        } while (i3 < i2);
    }
}
