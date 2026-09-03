package p655o0ooo0O;

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
import p648o0ooOoo.oO000o00;
import p662o0oooO0O.o0O0o00O;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes5.dex */
public final class oO000O0O implements Closeable {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final Logger f59557OooOO0 = Logger.getLogger(o0OOOO0o.class.getName());

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final o0OOOO00.OooO0O0 f59558OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0O0o00O f59559OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final oo0OOoo f59560OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f59561OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f59562OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f59563OooO0oo;

    public oO000O0O(@NotNull o0O0o00O sink, boolean z) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f59559OooO0Oo = sink;
        this.f59561OooO0o0 = z;
        oo0OOoo oo0oooo = new oo0OOoo();
        this.f59560OooO0o = oo0oooo;
        this.f59562OooO0oO = 16384;
        this.f59558OooO = new o0OOOO00.OooO0O0(oo0oooo);
    }

    public final synchronized void OooO00o(@NotNull oO0Oo0oo peerSettings) throws IOException {
        Intrinsics.checkNotNullParameter(peerSettings, "peerSettings");
        if (this.f59563OooO0oo) {
            throw new IOException("closed");
        }
        int i = this.f59562OooO0oO;
        int i2 = peerSettings.f59566OooO00o;
        if ((i2 & 32) != 0) {
            i = peerSettings.f59567OooO0O0[5];
        }
        this.f59562OooO0oO = i;
        if (((i2 & 2) != 0 ? peerSettings.f59567OooO0O0[1] : -1) != -1) {
            o0OOOO00.OooO0O0 oooO0O0 = this.f59558OooO;
            int i3 = (i2 & 2) != 0 ? peerSettings.f59567OooO0O0[1] : -1;
            oooO0O0.getClass();
            int iMin = Math.min(i3, 16384);
            int i4 = oooO0O0.f59442OooO0o0;
            if (i4 != iMin) {
                if (iMin < i4) {
                    oooO0O0.f59439OooO0OO = Math.min(oooO0O0.f59439OooO0OO, iMin);
                }
                oooO0O0.f59440OooO0Oo = true;
                oooO0O0.f59442OooO0o0 = iMin;
                int i5 = oooO0O0.f59436OooO;
                if (iMin < i5) {
                    if (iMin == 0) {
                        ArraysKt___ArraysJvmKt.fill$default(oooO0O0.f59441OooO0o, (Object) null, 0, 0, 6, (Object) null);
                        oooO0O0.f59443OooO0oO = oooO0O0.f59441OooO0o.length - 1;
                        oooO0O0.f59444OooO0oo = 0;
                        oooO0O0.f59436OooO = 0;
                    } else {
                        oooO0O0.OooO00o(i5 - iMin);
                    }
                }
            }
        }
        OooO0OO(0, 0, 4, 1);
        this.f59559OooO0Oo.flush();
    }

    public final void OooO0OO(int i, int i2, int i3, int i4) throws IOException {
        Level level = Level.FINE;
        Logger logger = f59557OooOO0;
        if (logger.isLoggable(level)) {
            o0OOOO0o.f59445OooO00o.getClass();
            logger.fine(o0OOOO0o.OooO00o(i, i2, i3, i4, false));
        }
        if (!(i2 <= this.f59562OooO0oO)) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f59562OooO0oO + ": " + i2).toString());
        }
        if (!((Integer.MIN_VALUE & i) == 0)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("reserved bit set: ", Integer.valueOf(i)).toString());
        }
        byte[] bArr = oO000o00.f58124OooO00o;
        o0O0o00O o0o0o00o = this.f59559OooO0Oo;
        Intrinsics.checkNotNullParameter(o0o0o00o, "<this>");
        o0o0o00o.o0ooOO0((i2 >>> 16) & 255);
        o0o0o00o.o0ooOO0((i2 >>> 8) & 255);
        o0o0o00o.o0ooOO0(i2 & 255);
        o0o0o00o.o0ooOO0(i3 & 255);
        o0o0o00o.o0ooOO0(i4 & 255);
        o0o0o00o.OooOOOO(i & Integer.MAX_VALUE);
    }

    public final synchronized void OooO0o0(int i, long j) throws IOException {
        if (this.f59563OooO0oo) {
            throw new IOException("closed");
        }
        if (!(j != 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ", Long.valueOf(j)).toString());
        }
        OooO0OO(i, 4, 8, 0);
        this.f59559OooO0Oo.OooOOOO((int) j);
        this.f59559OooO0Oo.flush();
    }

    public final synchronized void OooO0oO(int i, @NotNull ErrorCode errorCode, @NotNull byte[] debugData) throws IOException {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(debugData, "debugData");
        if (this.f59563OooO0oo) {
            throw new IOException("closed");
        }
        if (!(errorCode.getHttpCode() != -1)) {
            throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
        }
        OooO0OO(0, debugData.length + 8, 7, 0);
        this.f59559OooO0Oo.OooOOOO(i);
        this.f59559OooO0Oo.OooOOOO(errorCode.getHttpCode());
        if (!(debugData.length == 0)) {
            this.f59559OooO0Oo.write(debugData);
        }
        this.f59559OooO0Oo.flush();
    }

    public final synchronized void OooO0oo(int i, int i2, boolean z) throws IOException {
        if (this.f59563OooO0oo) {
            throw new IOException("closed");
        }
        OooO0OO(0, 8, 6, z ? 1 : 0);
        this.f59559OooO0Oo.OooOOOO(i);
        this.f59559OooO0Oo.OooOOOO(i2);
        this.f59559OooO0Oo.flush();
    }

    public final synchronized void OooOOo(int i, @NotNull ArrayList headerBlock, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        if (this.f59563OooO0oo) {
            throw new IOException("closed");
        }
        this.f59558OooO.OooO0Oo(headerBlock);
        long j = this.f59560OooO0o.f59828OooO0o0;
        long jMin = Math.min(this.f59562OooO0oO, j);
        int i2 = j == jMin ? 4 : 0;
        if (z) {
            i2 |= 1;
        }
        OooO0OO(i, (int) jMin, 1, i2);
        this.f59559OooO0Oo.write(this.f59560OooO0o, jMin);
        if (j > jMin) {
            OooOo(i, j - jMin);
        }
    }

    public final void OooOo(int i, long j) throws IOException {
        while (j > 0) {
            long jMin = Math.min(this.f59562OooO0oO, j);
            j -= jMin;
            OooO0OO(i, (int) jMin, 9, j == 0 ? 4 : 0);
            this.f59559OooO0Oo.write(this.f59560OooO0o, jMin);
        }
    }

    public final synchronized void OooOo0(@NotNull oO0Oo0oo settings) throws IOException {
        int i;
        Intrinsics.checkNotNullParameter(settings, "settings");
        if (this.f59563OooO0oo) {
            throw new IOException("closed");
        }
        OooO0OO(0, Integer.bitCount(settings.f59566OooO00o) * 6, 4, 0);
        int i2 = 0;
        while (i2 < 10) {
            int i3 = i2 + 1;
            boolean z = true;
            if (((1 << i2) & settings.f59566OooO00o) == 0) {
                z = false;
            }
            if (z) {
                if (i2 != 4) {
                    i = i2 != 7 ? i2 : 4;
                } else {
                    i = 3;
                }
                this.f59559OooO0Oo.o0OoOo0(i);
                this.f59559OooO0Oo.OooOOOO(settings.f59567OooO0O0[i2]);
            }
            i2 = i3;
        }
        this.f59559OooO0Oo.flush();
    }

    public final synchronized void OooOo00(int i, @NotNull ErrorCode errorCode) throws IOException {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f59563OooO0oo) {
            throw new IOException("closed");
        }
        if (!(errorCode.getHttpCode() != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        OooO0OO(i, 4, 3, 0);
        this.f59559OooO0Oo.OooOOOO(errorCode.getHttpCode());
        this.f59559OooO0Oo.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.f59563OooO0oo = true;
        this.f59559OooO0Oo.close();
    }

    public final synchronized void flush() throws IOException {
        if (this.f59563OooO0oo) {
            throw new IOException("closed");
        }
        this.f59559OooO0Oo.flush();
    }

    public final synchronized void o00000oO(boolean z, int i, @Nullable oo0OOoo oo0oooo, int i2) throws IOException {
        if (this.f59563OooO0oo) {
            throw new IOException("closed");
        }
        OooO0OO(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            Intrinsics.checkNotNull(oo0oooo);
            this.f59559OooO0Oo.write(oo0oooo, i2);
        }
    }
}
