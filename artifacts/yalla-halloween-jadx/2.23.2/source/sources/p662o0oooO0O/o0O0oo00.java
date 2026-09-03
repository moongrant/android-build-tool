package p662o0oooO0O;

import java.io.Closeable;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class o0O0oo00 implements Closeable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f59762OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f59763OooO0o0;

    public static final class OooO00o implements oO00000 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final o0O0oo00 f59764OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f59765OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f59766OooO0o0;

        public OooO00o(@NotNull o0O0oo00 fileHandle, long j) {
            Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
            this.f59764OooO0Oo = fileHandle;
            this.f59766OooO0o0 = j;
        }

        @Override // p662o0oooO0O.oO00000
        public final long OooOO0O(@NotNull oo0OOoo sink, long j) throws IOException {
            long j2;
            Intrinsics.checkNotNullParameter(sink, "sink");
            int i = 1;
            if (!(!this.f59765OooO0o)) {
                throw new IllegalStateException("closed".toString());
            }
            long j3 = this.f59766OooO0o0;
            o0O0oo00 o0o0oo00 = this.f59764OooO0Oo;
            o0o0oo00.getClass();
            if (!(j >= 0)) {
                throw new IllegalArgumentException(androidx.compose.ui.input.key.OooO00o.OooO00o("byteCount < 0: ", j).toString());
            }
            long j4 = j + j3;
            long j5 = j3;
            while (true) {
                if (j5 < j4) {
                    oO0Oo oo0ooOooooo = sink.Oooooo(i);
                    byte[] bArr = oo0ooOooooo.f59820OooO00o;
                    int i2 = oo0ooOooooo.f59822OooO0OO;
                    long j6 = j4;
                    int iOooO0OO = o0o0oo00.OooO0OO(j5, bArr, i2, (int) Math.min(j4 - j5, 8192 - i2));
                    if (iOooO0OO == -1) {
                        if (oo0ooOooooo.f59821OooO0O0 == oo0ooOooooo.f59822OooO0OO) {
                            sink.f59827OooO0Oo = oo0ooOooooo.OooO00o();
                            o0oo0000.OooO00o(oo0ooOooooo);
                        }
                        if (j3 == j5) {
                            j2 = -1;
                            break;
                        }
                    } else {
                        oo0ooOooooo.f59822OooO0OO += iOooO0OO;
                        long j7 = iOooO0OO;
                        j5 += j7;
                        sink.f59828OooO0o0 += j7;
                        i = 1;
                        j4 = j6;
                    }
                }
                j2 = j5 - j3;
                break;
            }
            if (j2 != -1) {
                this.f59766OooO0o0 += j2;
            }
            return j2;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f59765OooO0o) {
                return;
            }
            this.f59765OooO0o = true;
            synchronized (this.f59764OooO0Oo) {
                o0O0oo00 o0o0oo00 = this.f59764OooO0Oo;
                int i = o0o0oo00.f59763OooO0o0 - 1;
                o0o0oo00.f59763OooO0o0 = i;
                if (i == 0 && o0o0oo00.f59762OooO0Oo) {
                    Unit unit = Unit.INSTANCE;
                    o0o0oo00.OooO00o();
                }
            }
        }

        @Override // p662o0oooO0O.oO00000
        @NotNull
        public final oO00000o timeout() {
            return oO00000o.f59811OooO0Oo;
        }
    }

    public abstract void OooO00o() throws IOException;

    public abstract int OooO0OO(long j, @NotNull byte[] bArr, int i, int i2) throws IOException;

    public abstract long OooO0oO() throws IOException;

    @NotNull
    public final OooO00o OooOOo(long j) throws IOException {
        synchronized (this) {
            if (!(!this.f59762OooO0Oo)) {
                throw new IllegalStateException("closed".toString());
            }
            this.f59763OooO0o0++;
        }
        return new OooO00o(this, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this) {
            if (this.f59762OooO0Oo) {
                return;
            }
            this.f59762OooO0Oo = true;
            if (this.f59763OooO0o0 != 0) {
                return;
            }
            Unit unit = Unit.INSTANCE;
            OooO00o();
        }
    }

    public final long size() throws IOException {
        synchronized (this) {
            if (!(!this.f59762OooO0Oo)) {
                throw new IllegalStateException("closed".toString());
            }
            Unit unit = Unit.INSTANCE;
        }
        return OooO0oO();
    }
}
