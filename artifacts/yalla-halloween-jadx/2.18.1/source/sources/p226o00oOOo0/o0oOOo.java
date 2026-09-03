package p226o00oOOo0;

import androidx.annotation.NonNull;
import java.util.Objects;
import p214o00oO0.o00OOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o0oOOo implements o00OOOO0<byte[]> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final byte[] f33875Oooo0o;

    public o0oOOo(byte[] bArr) {
        Objects.requireNonNull(bArr, "Argument must not be null");
        this.f33875Oooo0o = bArr;
    }

    @Override // p214o00oO0.o00OOOO0
    public final void OooO00o() {
    }

    @Override // p214o00oO0.o00OOOO0
    @NonNull
    public final Class<byte[]> OooO0OO() {
        return byte[].class;
    }

    @Override // p214o00oO0.o00OOOO0
    @NonNull
    public final byte[] get() {
        return this.f33875Oooo0o;
    }

    @Override // p214o00oO0.o00OOOO0
    public final int getSize() {
        return this.f33875Oooo0o.length;
    }
}
