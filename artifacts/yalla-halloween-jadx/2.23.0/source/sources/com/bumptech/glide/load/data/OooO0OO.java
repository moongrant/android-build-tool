package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p129o00O0ooo.o0000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO extends OutputStream {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final OutputStream f9947OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0000 f9948OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public byte[] f9949OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f9950OooO0oO;

    public OooO0OO(@NonNull FileOutputStream fileOutputStream, @NonNull o0000 o0000Var) {
        this.f9947OooO0Oo = fileOutputStream;
        this.f9948OooO0o = o0000Var;
        this.f9949OooO0o0 = (byte[]) o0000Var.OooO0OO(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        OutputStream outputStream = this.f9947OooO0Oo;
        try {
            flush();
            outputStream.close();
            byte[] bArr = this.f9949OooO0o0;
            if (bArr != null) {
                this.f9948OooO0o.put(bArr);
                this.f9949OooO0o0 = null;
            }
        } catch (Throwable th) {
            outputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.f9950OooO0oO;
        OutputStream outputStream = this.f9947OooO0Oo;
        if (i > 0) {
            outputStream.write(this.f9949OooO0o0, 0, i);
            this.f9950OooO0oO = 0;
        }
        outputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f9949OooO0o0;
        int i2 = this.f9950OooO0oO;
        int i3 = i2 + 1;
        this.f9950OooO0oO = i3;
        bArr[i2] = (byte) i;
        if (i3 != bArr.length || i3 <= 0) {
            return;
        }
        this.f9947OooO0Oo.write(bArr, 0, i3);
        this.f9950OooO0oO = 0;
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
            int i6 = this.f9950OooO0oO;
            OutputStream outputStream = this.f9947OooO0Oo;
            if (i6 == 0 && i4 >= this.f9949OooO0o0.length) {
                outputStream.write(bArr, i5, i4);
                return;
            }
            int iMin = Math.min(i4, this.f9949OooO0o0.length - i6);
            System.arraycopy(bArr, i5, this.f9949OooO0o0, this.f9950OooO0oO, iMin);
            int i7 = this.f9950OooO0oO + iMin;
            this.f9950OooO0oO = i7;
            i3 += iMin;
            byte[] bArr2 = this.f9949OooO0o0;
            if (i7 == bArr2.length && i7 > 0) {
                outputStream.write(bArr2, 0, i7);
                this.f9950OooO0oO = 0;
            }
        } while (i3 < i2);
    }
}
