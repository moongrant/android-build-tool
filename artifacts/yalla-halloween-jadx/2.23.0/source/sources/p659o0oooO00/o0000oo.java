package p659o0oooO00;

import java.io.Closeable;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class o0000oo implements Closeable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f60200OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f60201OooO0o0;

    public static final class OooO00o implements o00O00 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final o0000oo f60202OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f60203OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f60204OooO0o0;

        public OooO00o(@NotNull o0000oo fileHandle, long j) {
            Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
            this.f60202OooO0Oo = fileHandle;
            this.f60204OooO0o0 = j;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f60203OooO0o) {
                return;
            }
            this.f60203OooO0o = true;
            synchronized (this.f60202OooO0Oo) {
                o0000oo o0000ooVar = this.f60202OooO0Oo;
                int i = o0000ooVar.f60201OooO0o0 - 1;
                o0000ooVar.f60201OooO0o0 = i;
                if (i == 0 && o0000ooVar.f60200OooO0Oo) {
                    Unit unit = Unit.INSTANCE;
                    o0000ooVar.OooO00o();
                }
            }
        }

        @Override // p659o0oooO00.o00O00
        public final long o0000OO0(@NotNull o00000O sink, long j) throws IOException {
            long j2;
            Intrinsics.checkNotNullParameter(sink, "sink");
            int i = 1;
            if (!(!this.f60203OooO0o)) {
                throw new IllegalStateException("closed".toString());
            }
            long j3 = this.f60204OooO0o0;
            o0000oo o0000ooVar = this.f60202OooO0Oo;
            o0000ooVar.getClass();
            if (!(j >= 0)) {
                throw new IllegalArgumentException(androidx.compose.ui.input.key.OooO00o.OooO00o("byteCount < 0: ", j).toString());
            }
            long j4 = j + j3;
            long j5 = j3;
            while (true) {
                if (j5 < j4) {
                    o0O0ooO o0o0oooOooooOo = sink.OooooOo(i);
                    byte[] bArr = o0o0oooOooooOo.f60249OooO00o;
                    int i2 = o0o0oooOooooOo.f60251OooO0OO;
                    long j6 = j4;
                    int iOooO0OO = o0000ooVar.OooO0OO(j5, bArr, i2, (int) Math.min(j4 - j5, 8192 - i2));
                    if (iOooO0OO == -1) {
                        if (o0o0oooOooooOo.f60250OooO0O0 == o0o0oooOooooOo.f60251OooO0OO) {
                            sink.f60176OooO0Oo = o0o0oooOooooOo.OooO00o();
                            o00oOoo.OooO00o(o0o0oooOooooOo);
                        }
                        if (j3 == j5) {
                            j2 = -1;
                            break;
                        }
                    } else {
                        o0o0oooOooooOo.f60251OooO0OO += iOooO0OO;
                        long j7 = iOooO0OO;
                        j5 += j7;
                        sink.f60177OooO0o0 += j7;
                        i = 1;
                        j4 = j6;
                    }
                }
                j2 = j5 - j3;
                break;
            }
            if (j2 != -1) {
                this.f60204OooO0o0 += j2;
            }
            return j2;
        }

        @Override // p659o0oooO00.o00O00
        @NotNull
        public final o00O00O timeout() {
            return o00O00O.f60237OooO0Oo;
        }
    }

    public abstract void OooO00o() throws IOException;

    public abstract int OooO0OO(long j, @NotNull byte[] bArr, int i, int i2) throws IOException;

    public abstract long OooO0oO() throws IOException;

    @NotNull
    public final OooO00o OooOOo0(long j) throws IOException {
        synchronized (this) {
            if (!(!this.f60200OooO0Oo)) {
                throw new IllegalStateException("closed".toString());
            }
            this.f60201OooO0o0++;
        }
        return new OooO00o(this, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this) {
            if (this.f60200OooO0Oo) {
                return;
            }
            this.f60200OooO0Oo = true;
            if (this.f60201OooO0o0 != 0) {
                return;
            }
            Unit unit = Unit.INSTANCE;
            OooO00o();
        }
    }

    public final long size() throws IOException {
        synchronized (this) {
            if (!(!this.f60200OooO0Oo)) {
                throw new IllegalStateException("closed".toString());
            }
            Unit unit = Unit.INSTANCE;
        }
        return OooO0oO();
    }
}
