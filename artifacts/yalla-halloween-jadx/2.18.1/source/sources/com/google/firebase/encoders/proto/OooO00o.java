package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends OutputStream {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public long f19090Oooo0o = 0;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f19090Oooo0o++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f19090Oooo0o += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(@NonNull byte[] bArr, int i, int i2) {
        int i3;
        if (i >= 0 && i <= bArr.length && i2 >= 0 && (i3 = i + i2) <= bArr.length && i3 >= 0) {
            this.f19090Oooo0o += (long) i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
