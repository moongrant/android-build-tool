package p651o0ooo00O;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.ErrorCode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p635o0ooO0oo.o0O000o0;
import p659o0oooO00.o00000O;
import p659o0oooO00.o0000Ooo;

/* JADX INFO: loaded from: classes5.dex */
public final class o000OO implements Closeable {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final Logger f59930OooOO0 = Logger.getLogger(o0O0O00.class.getName());

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final oo0o0Oo.OooO0O0 f59931OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0000Ooo f59932OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o00000O f59933OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f59934OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f59935OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f59936OooO0oo;

    public o000OO(@NotNull o0000Ooo sink, boolean z) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f59932OooO0Oo = sink;
        this.f59934OooO0o0 = z;
        o00000O o00000o = new o00000O();
        this.f59933OooO0o = o00000o;
        this.f59935OooO0oO = 16384;
        this.f59931OooO = new oo0o0Oo.OooO0O0(o00000o);
    }

    public final synchronized void OooO00o(@NotNull o000 peerSettings) throws IOException {
        Intrinsics.checkNotNullParameter(peerSettings, "peerSettings");
        if (this.f59936OooO0oo) {
            throw new IOException("closed");
        }
        int i = this.f59935OooO0oO;
        int i2 = peerSettings.f59853OooO00o;
        if ((i2 & 32) != 0) {
            i = peerSettings.f59854OooO0O0[5];
        }
        this.f59935OooO0oO = i;
        if (((i2 & 2) != 0 ? peerSettings.f59854OooO0O0[1] : -1) != -1) {
            oo0o0Oo.OooO0O0 oooO0O0 = this.f59931OooO;
            int i3 = (i2 & 2) != 0 ? peerSettings.f59854OooO0O0[1] : -1;
            oooO0O0.getClass();
            int iMin = Math.min(i3, 16384);
            int i4 = oooO0O0.f60015OooO0o0;
            if (i4 != iMin) {
                if (iMin < i4) {
                    oooO0O0.f60012OooO0OO = Math.min(oooO0O0.f60012OooO0OO, iMin);
                }
                oooO0O0.f60013OooO0Oo = true;
                oooO0O0.f60015OooO0o0 = iMin;
                int i5 = oooO0O0.f60009OooO;
                if (iMin < i5) {
                    if (iMin == 0) {
                        ArraysKt___ArraysJvmKt.fill$default(oooO0O0.f60014OooO0o, (Object) null, 0, 0, 6, (Object) null);
                        oooO0O0.f60016OooO0oO = oooO0O0.f60014OooO0o.length - 1;
                        oooO0O0.f60017OooO0oo = 0;
                        oooO0O0.f60009OooO = 0;
                    } else {
                        oooO0O0.OooO00o(i5 - iMin);
                    }
                }
            }
        }
        OooO0OO(0, 0, 4, 1);
        this.f59932OooO0Oo.flush();
    }

    public final void OooO0OO(int i, int i2, int i3, int i4) throws IOException {
        Level level = Level.FINE;
        Logger logger = f59930OooOO0;
        if (logger.isLoggable(level)) {
            o0O0O00.f59985OooO00o.getClass();
            logger.fine(o0O0O00.OooO00o(i, i2, i3, i4, false));
        }
        if (!(i2 <= this.f59935OooO0oO)) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f59935OooO0oO + ": " + i2).toString());
        }
        if (!((Integer.MIN_VALUE & i) == 0)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("reserved bit set: ", Integer.valueOf(i)).toString());
        }
        byte[] bArr = o0O000o0.f57386OooO00o;
        o0000Ooo o0000ooo = this.f59932OooO0Oo;
        Intrinsics.checkNotNullParameter(o0000ooo, "<this>");
        o0000ooo.o00oO0o((i2 >>> 16) & 255);
        o0000ooo.o00oO0o((i2 >>> 8) & 255);
        o0000ooo.o00oO0o(i2 & 255);
        o0000ooo.o00oO0o(i3 & 255);
        o0000ooo.o00oO0o(i4 & 255);
        o0000ooo.OooOOO(i & Integer.MAX_VALUE);
    }

    public final synchronized void OooO0o0(int i, long j) throws IOException {
        if (this.f59936OooO0oo) {
            throw new IOException("closed");
        }
        if (!(j != 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ", Long.valueOf(j)).toString());
        }
        OooO0OO(i, 4, 8, 0);
        this.f59932OooO0Oo.OooOOO((int) j);
        this.f59932OooO0Oo.flush();
    }

    public final synchronized void OooO0oO(int i, @NotNull ErrorCode errorCode, @NotNull byte[] debugData) throws IOException {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(debugData, "debugData");
        if (this.f59936OooO0oo) {
            throw new IOException("closed");
        }
        if (!(errorCode.getHttpCode() != -1)) {
            throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
        }
        OooO0OO(0, debugData.length + 8, 7, 0);
        this.f59932OooO0Oo.OooOOO(i);
        this.f59932OooO0Oo.OooOOO(errorCode.getHttpCode());
        if (!(debugData.length == 0)) {
            this.f59932OooO0Oo.write(debugData);
        }
        this.f59932OooO0Oo.flush();
    }

    public final synchronized void OooO0oo(int i, int i2, boolean z) throws IOException {
        if (this.f59936OooO0oo) {
            throw new IOException("closed");
        }
        OooO0OO(0, 8, 6, z ? 1 : 0);
        this.f59932OooO0Oo.OooOOO(i);
        this.f59932OooO0Oo.OooOOO(i2);
        this.f59932OooO0Oo.flush();
    }

    public final synchronized void OooOOo(int i, @NotNull ErrorCode errorCode) throws IOException {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f59936OooO0oo) {
            throw new IOException("closed");
        }
        if (!(errorCode.getHttpCode() != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        OooO0OO(i, 4, 3, 0);
        this.f59932OooO0Oo.OooOOO(errorCode.getHttpCode());
        this.f59932OooO0Oo.flush();
    }

    public final synchronized void OooOOo0(int i, @NotNull ArrayList headerBlock, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        if (this.f59936OooO0oo) {
            throw new IOException("closed");
        }
        this.f59931OooO.OooO0Oo(headerBlock);
        long j = this.f59933OooO0o.f60177OooO0o0;
        long jMin = Math.min(this.f59935OooO0oO, j);
        int i2 = j == jMin ? 4 : 0;
        if (z) {
            i2 |= 1;
        }
        OooO0OO(i, (int) jMin, 1, i2);
        this.f59932OooO0Oo.write(this.f59933OooO0o, jMin);
        if (j > jMin) {
            OooOo0(i, j - jMin);
        }
    }

    public final void OooOo0(int i, long j) throws IOException {
        while (j > 0) {
            long jMin = Math.min(this.f59935OooO0oO, j);
            j -= jMin;
            OooO0OO(i, (int) jMin, 9, j == 0 ? 4 : 0);
            this.f59932OooO0Oo.write(this.f59933OooO0o, jMin);
        }
    }

    public final synchronized void OooOo00(@NotNull o000 settings) throws IOException {
        int i;
        Intrinsics.checkNotNullParameter(settings, "settings");
        if (this.f59936OooO0oo) {
            throw new IOException("closed");
        }
        OooO0OO(0, Integer.bitCount(settings.f59853OooO00o) * 6, 4, 0);
        int i2 = 0;
        while (i2 < 10) {
            int i3 = i2 + 1;
            boolean z = true;
            if (((1 << i2) & settings.f59853OooO00o) == 0) {
                z = false;
            }
            if (z) {
                if (i2 != 4) {
                    i = i2 != 7 ? i2 : 4;
                } else {
                    i = 3;
                }
                this.f59932OooO0Oo.o0OoOo0(i);
                this.f59932OooO0Oo.OooOOO(settings.f59854OooO0O0[i2]);
            }
            i2 = i3;
        }
        this.f59932OooO0Oo.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.f59936OooO0oo = true;
        this.f59932OooO0Oo.close();
    }

    public final synchronized void flush() throws IOException {
        if (this.f59936OooO0oo) {
            throw new IOException("closed");
        }
        this.f59932OooO0Oo.flush();
    }

    public final synchronized void o0Oo0oo(boolean z, int i, @Nullable o00000O o00000o, int i2) throws IOException {
        if (this.f59936OooO0oo) {
            throw new IOException("closed");
        }
        OooO0OO(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            Intrinsics.checkNotNull(o00000o);
            this.f59932OooO0Oo.write(o00000o, i2);
        }
    }
}
