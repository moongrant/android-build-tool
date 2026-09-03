package p654o0ooo0o;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p659o0oooO00.o00000O;
import p659o0oooO00.o0000O00;
import p659o0oooO00.o0000Ooo;
import p659o0oooO00.oo00o;

/* JADX INFO: loaded from: classes5.dex */
public final class o0000 implements Closeable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final long f60044OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f60045OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Random f60046OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o0000Ooo f60047OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f60048OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f60049OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final o00000O f60050OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final o00000O f60051OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f60052OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public final byte[] f60053OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public o0O0O00 f60054OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public final o00000O.OooO00o f60055OooOOOO;

    public o0000(boolean z, @NotNull o0000Ooo sink, @NotNull Random random, boolean z2, boolean z3, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(random, "random");
        this.f60045OooO0Oo = z;
        this.f60047OooO0o0 = sink;
        this.f60046OooO0o = random;
        this.f60048OooO0oO = z2;
        this.f60049OooO0oo = z3;
        this.f60044OooO = j;
        this.f60050OooOO0 = new o00000O();
        this.f60051OooOO0O = sink.OooO0O0();
        this.f60053OooOOO = z ? new byte[4] : null;
        this.f60055OooOOOO = z ? new o00000O.OooO00o() : null;
    }

    public final void OooO00o(int i, ByteString byteString) throws IOException {
        if (this.f60052OooOO0o) {
            throw new IOException("closed");
        }
        int iOooO0o0 = byteString.OooO0o0();
        if (!(((long) iOooO0o0) <= 125)) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        o00000O o00000o = this.f60051OooOO0O;
        o00000o.o00O0O(i | 128);
        if (this.f60045OooO0Oo) {
            o00000o.o00O0O(iOooO0o0 | 128);
            byte[] bArr = this.f60053OooOOO;
            Intrinsics.checkNotNull(bArr);
            this.f60046OooO0o.nextBytes(bArr);
            o00000o.ooOO(bArr);
            if (iOooO0o0 > 0) {
                long j = o00000o.f60177OooO0o0;
                o00000o.OoooooO(byteString);
                o00000O.OooO00o oooO00o = this.f60055OooOOOO;
                Intrinsics.checkNotNull(oooO00o);
                o00000o.Oooo0O0(oooO00o);
                oooO00o.OooO0OO(j);
                o00000OO.OooO0O0(oooO00o, bArr);
                oooO00o.close();
            }
        } else {
            o00000o.o00O0O(iOooO0o0);
            o00000o.OoooooO(byteString);
        }
        this.f60047OooO0o0.flush();
    }

    public final void OooO0OO(int i, @NotNull ByteString data) throws IOException {
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.f60052OooOO0o) {
            throw new IOException("closed");
        }
        o00000O buffer = this.f60050OooOO0;
        buffer.OoooooO(data);
        int i2 = i | 128;
        if (this.f60048OooO0oO && data.OooO0o0() >= this.f60044OooO) {
            o0O0O00 o0o0o00 = this.f60054OooOOO0;
            if (o0o0o00 == null) {
                o0o0o00 = new o0O0O00(this.f60049OooO0oo);
                this.f60054OooOOO0 = o0o0o00;
            }
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            o00000O o00000o = o0o0o00.f60123OooO0o0;
            if (!(o00000o.f60177OooO0o0 == 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (o0o0o00.f60121OooO0Oo) {
                o0o0o00.f60122OooO0o.reset();
            }
            long j = buffer.f60177OooO0o0;
            o0000O00 o0000o00 = o0o0o00.f60124OooO0oO;
            o0000o00.write(buffer, j);
            o0000o00.flush();
            ByteString byteString = o000OOo.f60120OooO00o;
            if (o00000o.Oooo00O(o00000o.f60177OooO0o0 - ((long) byteString.data.length), byteString)) {
                long j2 = o00000o.f60177OooO0o0 - ((long) 4);
                o00000O.OooO00o oooO00oOooo0O0 = o00000o.Oooo0O0(oo00o.f60256OooO00o);
                try {
                    oooO00oOooo0O0.OooO00o(j2);
                    CloseableKt.closeFinally(oooO00oOooo0O0, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(oooO00oOooo0O0, th);
                        throw th2;
                    }
                }
            } else {
                o00000o.o00O0O(0);
            }
            buffer.write(o00000o, o00000o.f60177OooO0o0);
            i2 |= 64;
        }
        long j3 = buffer.f60177OooO0o0;
        o00000O o00000o2 = this.f60051OooOO0O;
        o00000o2.o00O0O(i2);
        boolean z = this.f60045OooO0Oo;
        int i3 = z ? 128 : 0;
        if (j3 <= 125) {
            o00000o2.o00O0O(i3 | ((int) j3));
        } else if (j3 <= 65535) {
            o00000o2.o00O0O(i3 | 126);
            o00000o2.oo0o0Oo((int) j3);
        } else {
            o00000o2.o00O0O(i3 | 127);
            o00000o2.o0OOO0o(j3);
        }
        if (z) {
            byte[] bArr = this.f60053OooOOO;
            Intrinsics.checkNotNull(bArr);
            this.f60046OooO0o.nextBytes(bArr);
            o00000o2.ooOO(bArr);
            if (j3 > 0) {
                o00000O.OooO00o oooO00o = this.f60055OooOOOO;
                Intrinsics.checkNotNull(oooO00o);
                buffer.Oooo0O0(oooO00o);
                oooO00o.OooO0OO(0L);
                o00000OO.OooO0O0(oooO00o, bArr);
                oooO00o.close();
            }
        }
        o00000o2.write(buffer, j3);
        this.f60047OooO0o0.OooOO0o();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        o0O0O00 o0o0o00 = this.f60054OooOOO0;
        if (o0o0o00 == null) {
            return;
        }
        o0o0o00.close();
    }
}
