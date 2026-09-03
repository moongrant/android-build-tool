package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o extends OutputStream {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f19682OooO0Oo = 0;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f19682OooO0Oo++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f19682OooO0Oo += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(@NonNull byte[] bArr, int i, int i2) {
        int i3;
        if (i >= 0 && i <= bArr.length && i2 >= 0 && (i3 = i + i2) <= bArr.length && i3 >= 0) {
            this.f19682OooO0Oo += (long) i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
