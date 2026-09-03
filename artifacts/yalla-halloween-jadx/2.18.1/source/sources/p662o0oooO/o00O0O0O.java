package p662o0oooO;

import OooO00o.OooO00o;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.ErrorCode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p659o0ooo0o.o00OOO00;
import p674o0oooo0.o0oOO;
import p674o0oooo0.oo00oO;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O0O implements Closeable {

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final Logger f51642OoooO0O = Logger.getLogger(o0O0ooO.class.getName());

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final o00O0000.OooO0O0 f51643Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final o0oOO f51644Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f51645Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f51646Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final boolean f51647OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final oo00oO f51648OoooO00;

    public o00O0O0O(@NotNull oo00oO sink, boolean z) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f51648OoooO00 = sink;
        this.f51647OoooO0 = z;
        o0oOO o0ooo2 = new o0oOO();
        this.f51644Oooo0o = o0ooo2;
        this.f51645Oooo0oO = 16384;
        this.f51643Oooo = new o00O0000.OooO0O0(o0ooo2);
    }

    public final synchronized void OooO(boolean z, int i, int i2) throws IOException {
        if (this.f51646Oooo0oo) {
            throw new IOException("closed");
        }
        OooO0O0(0, 8, 6, z ? 1 : 0);
        this.f51648OoooO00.OooOo0o(i);
        this.f51648OoooO00.OooOo0o(i2);
        this.f51648OoooO00.flush();
    }

    public final synchronized void OooO00o(@NotNull o00O0OOO peerSettings) throws IOException {
        Intrinsics.checkNotNullParameter(peerSettings, "peerSettings");
        if (this.f51646Oooo0oo) {
            throw new IOException("closed");
        }
        int i = this.f51645Oooo0oO;
        int i2 = peerSettings.f51657OooO00o;
        if ((i2 & 32) != 0) {
            i = peerSettings.f51658OooO0O0[5];
        }
        this.f51645Oooo0oO = i;
        int i3 = i2 & 2;
        if ((i3 != 0 ? peerSettings.f51658OooO0O0[1] : -1) != -1) {
            o00O0000.OooO0O0 oooO0O0 = this.f51643Oooo;
            int i4 = i3 != 0 ? peerSettings.f51658OooO0O0[1] : -1;
            Objects.requireNonNull(oooO0O0);
            int iMin = Math.min(i4, 16384);
            int i5 = oooO0O0.f51586OooO0OO;
            if (i5 != iMin) {
                if (iMin < i5) {
                    oooO0O0.f51584OooO00o = Math.min(oooO0O0.f51584OooO00o, iMin);
                }
                oooO0O0.f51585OooO0O0 = true;
                oooO0O0.f51586OooO0OO = iMin;
                int i6 = oooO0O0.f51590OooO0oO;
                if (iMin < i6) {
                    if (iMin == 0) {
                        oooO0O0.OooO00o();
                    } else {
                        oooO0O0.OooO0O0(i6 - iMin);
                    }
                }
            }
        }
        OooO0O0(0, 0, 4, 1);
        this.f51648OoooO00.flush();
    }

    public final void OooO0O0(int i, int i2, int i3, int i4) throws IOException {
        Logger logger = f51642OoooO0O;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(o0O0ooO.f51715OooO0o0.OooO0O0(false, i, i2, i3, i4));
        }
        if (!(i2 <= this.f51645Oooo0oO)) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("FRAME_SIZE_ERROR length > ");
            sbOooO0o0.append(this.f51645Oooo0oO);
            sbOooO0o0.append(": ");
            sbOooO0o0.append(i2);
            throw new IllegalArgumentException(sbOooO0o0.toString().toString());
        }
        if (!((((int) 2147483648L) & i) == 0)) {
            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("reserved bit set: ", i).toString());
        }
        oo00oO writeMedium = this.f51648OoooO00;
        byte[] bArr = o00OOO00.f51183OooO00o;
        Intrinsics.checkNotNullParameter(writeMedium, "$this$writeMedium");
        writeMedium.Oooo000((i2 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        writeMedium.Oooo000((i2 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        writeMedium.Oooo000(i2 & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f51648OoooO00.Oooo000(i3 & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f51648OoooO00.Oooo000(i4 & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f51648OoooO00.OooOo0o(i & Integer.MAX_VALUE);
    }

    public final synchronized void OooO0Oo(int i, @NotNull ErrorCode errorCode, @NotNull byte[] debugData) throws IOException {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(debugData, "debugData");
        if (this.f51646Oooo0oo) {
            throw new IOException("closed");
        }
        if (!(errorCode.getHttpCode() != -1)) {
            throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
        }
        OooO0O0(0, debugData.length + 8, 7, 0);
        this.f51648OoooO00.OooOo0o(i);
        this.f51648OoooO00.OooOo0o(errorCode.getHttpCode());
        if (!(debugData.length == 0)) {
            this.f51648OoooO00.OooOO0(debugData);
        }
        this.f51648OoooO00.flush();
    }

    public final synchronized void OooO0o(boolean z, int i, @NotNull List<o00> headerBlock) throws IOException {
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        if (this.f51646Oooo0oo) {
            throw new IOException("closed");
        }
        this.f51643Oooo.OooO0o0(headerBlock);
        long j = this.f51644Oooo0o.f52099Oooo0oO;
        long jMin = Math.min(this.f51645Oooo0oO, j);
        int i2 = j == jMin ? 4 : 0;
        if (z) {
            i2 |= 1;
        }
        OooO0O0(i, (int) jMin, 1, i2);
        this.f51648OoooO00.write(this.f51644Oooo0o, jMin);
        if (j > jMin) {
            OooOOO(i, j - jMin);
        }
    }

    public final synchronized void OooO0oO(int i, long j) throws IOException {
        if (this.f51646Oooo0oo) {
            throw new IOException("closed");
        }
        if (!(j != 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        OooO0O0(i, 4, 8, 0);
        this.f51648OoooO00.OooOo0o((int) j);
        this.f51648OoooO00.flush();
    }

    public final synchronized void OooO0oo(int i, @NotNull ErrorCode errorCode) throws IOException {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f51646Oooo0oo) {
            throw new IOException("closed");
        }
        if (!(errorCode.getHttpCode() != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        OooO0O0(i, 4, 3, 0);
        this.f51648OoooO00.OooOo0o(errorCode.getHttpCode());
        this.f51648OoooO00.flush();
    }

    public final void OooOOO(int i, long j) throws IOException {
        while (j > 0) {
            long jMin = Math.min(this.f51645Oooo0oO, j);
            j -= jMin;
            OooO0O0(i, (int) jMin, 9, j == 0 ? 4 : 0);
            this.f51648OoooO00.write(this.f51644Oooo0o, jMin);
        }
    }

    public final synchronized void OoooO00(boolean z, int i, @Nullable o0oOO o0ooo2, int i2) throws IOException {
        if (this.f51646Oooo0oo) {
            throw new IOException("closed");
        }
        OooO0O0(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            oo00oO oo00oo = this.f51648OoooO00;
            Intrinsics.checkNotNull(o0ooo2);
            oo00oo.write(o0ooo2, i2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.f51646Oooo0oo = true;
        this.f51648OoooO00.close();
    }

    public final synchronized void flush() throws IOException {
        if (this.f51646Oooo0oo) {
            throw new IOException("closed");
        }
        this.f51648OoooO00.flush();
    }
}
