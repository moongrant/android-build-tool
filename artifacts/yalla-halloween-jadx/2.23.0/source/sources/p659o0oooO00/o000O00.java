package p659o0oooO00;

import java.io.RandomAccessFile;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o000O00 extends o0000oo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final RandomAccessFile f60207OooO0o;

    public o000O00(@NotNull RandomAccessFile randomAccessFile) {
        Intrinsics.checkNotNullParameter(randomAccessFile, "randomAccessFile");
        this.f60207OooO0o = randomAccessFile;
    }

    @Override // p659o0oooO00.o0000oo
    public final synchronized void OooO00o() {
        this.f60207OooO0o.close();
    }

    @Override // p659o0oooO00.o0000oo
    public final synchronized int OooO0OO(long j, @NotNull byte[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f60207OooO0o.seek(j);
        int i3 = 0;
        while (i3 < i2) {
            int i4 = this.f60207OooO0o.read(array, i, i2 - i3);
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

    @Override // p659o0oooO00.o0000oo
    public final synchronized long OooO0oO() {
        return this.f60207OooO0o.length();
    }
}
