package p662o0oooO0O;

import java.io.RandomAccessFile;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o0OOooO0 extends o0O0oo00 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final RandomAccessFile f59798OooO0o;

    public o0OOooO0(@NotNull RandomAccessFile randomAccessFile) {
        Intrinsics.checkNotNullParameter(randomAccessFile, "randomAccessFile");
        this.f59798OooO0o = randomAccessFile;
    }

    @Override // p662o0oooO0O.o0O0oo00
    public final synchronized void OooO00o() {
        this.f59798OooO0o.close();
    }

    @Override // p662o0oooO0O.o0O0oo00
    public final synchronized int OooO0OO(long j, @NotNull byte[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f59798OooO0o.seek(j);
        int i3 = 0;
        while (i3 < i2) {
            int i4 = this.f59798OooO0o.read(array, i, i2 - i3);
            if (i4 == -1) {
                if (i3 != 0) {
                    break;
                }
                return -1;
            }
            i3 += i4;
        }
        return i3;
    }

    @Override // p662o0oooO0O.o0O0oo00
    public final synchronized long OooO0oO() {
        return this.f59798OooO0o.length();
    }
}
