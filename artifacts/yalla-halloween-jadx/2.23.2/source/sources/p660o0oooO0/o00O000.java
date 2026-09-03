package p660o0oooO0;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p662o0oooO0O.o0O0o00O;
import p662o0oooO0O.o0oOo0O0;
import p662o0oooO0O.oO000;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes5.dex */
public final class o00O000 implements Closeable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final long f59705OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f59706OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Random f59707OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o0O0o00O f59708OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f59709OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f59710OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final oo0OOoo f59711OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final oo0OOoo f59712OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f59713OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public final byte[] f59714OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public o000OO0O f59715OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public final oo0OOoo.OooO00o f59716OooOOOO;

    public o00O000(boolean z, @NotNull o0O0o00O sink, @NotNull Random random, boolean z2, boolean z3, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(random, "random");
        this.f59706OooO0Oo = z;
        this.f59708OooO0o0 = sink;
        this.f59707OooO0o = random;
        this.f59709OooO0oO = z2;
        this.f59710OooO0oo = z3;
        this.f59705OooO = j;
        this.f59711OooOO0 = new oo0OOoo();
        this.f59712OooOO0O = sink.OooO0O0();
        this.f59714OooOOO = z ? new byte[4] : null;
        this.f59716OooOOOO = z ? new oo0OOoo.OooO00o() : null;
    }

    public final void OooO00o(int i, ByteString byteString) throws IOException {
        if (this.f59713OooOO0o) {
            throw new IOException("closed");
        }
        int iOooO0o0 = byteString.OooO0o0();
        if (!(((long) iOooO0o0) <= 125)) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        oo0OOoo oo0oooo = this.f59712OooOO0O;
        oo0oooo.o00o0O(i | 128);
        if (this.f59706OooO0Oo) {
            oo0oooo.o00o0O(iOooO0o0 | 128);
            byte[] bArr = this.f59714OooOOO;
            Intrinsics.checkNotNull(bArr);
            this.f59707OooO0o.nextBytes(bArr);
            oo0oooo.o00Ooo(bArr);
            if (iOooO0o0 > 0) {
                long j = oo0oooo.f59828OooO0o0;
                oo0oooo.o00O0O(byteString);
                oo0OOoo.OooO00o oooO00o = this.f59716OooOOOO;
                Intrinsics.checkNotNull(oooO00o);
                oo0oooo.Oooo0O0(oooO00o);
                oooO00o.OooO0OO(j);
                o0O0ooO.OooO0O0(oooO00o, bArr);
                oooO00o.close();
            }
        } else {
            oo0oooo.o00o0O(iOooO0o0);
            oo0oooo.o00O0O(byteString);
        }
        this.f59708OooO0o0.flush();
    }

    public final void OooO0OO(int i, @NotNull ByteString data) throws IOException {
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.f59713OooOO0o) {
            throw new IOException("closed");
        }
        oo0OOoo buffer = this.f59711OooOO0;
        buffer.o00O0O(data);
        int i2 = i | 128;
        if (this.f59709OooO0oO && data.OooO0o0() >= this.f59705OooO) {
            o000OO0O o000oo0o2 = this.f59715OooOOO0;
            if (o000oo0o2 == null) {
                o000oo0o2 = new o000OO0O(this.f59710OooO0oo);
                this.f59715OooOOO0 = o000oo0o2;
            }
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            oo0OOoo oo0oooo = o000oo0o2.f59701OooO0o0;
            if (!(oo0oooo.f59828OooO0o0 == 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (o000oo0o2.f59699OooO0Oo) {
                o000oo0o2.f59700OooO0o.reset();
            }
            long j = buffer.f59828OooO0o0;
            o0oOo0O0 o0ooo0o1 = o000oo0o2.f59702OooO0oO;
            o0ooo0o1.write(buffer, j);
            o0ooo0o1.flush();
            ByteString byteString = o000O0O0.f59664OooO00o;
            if (oo0oooo.Oooo00O(oo0oooo.f59828OooO0o0 - ((long) byteString.data.length), byteString)) {
                long j2 = oo0oooo.f59828OooO0o0 - ((long) 4);
                oo0OOoo.OooO00o oooO00oOooo0O0 = oo0oooo.Oooo0O0(oO000.f59809OooO00o);
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
                oo0oooo.o00o0O(0);
            }
            buffer.write(oo0oooo, oo0oooo.f59828OooO0o0);
            i2 |= 64;
        }
        long j3 = buffer.f59828OooO0o0;
        oo0OOoo oo0oooo2 = this.f59712OooOO0O;
        oo0oooo2.o00o0O(i2);
        boolean z = this.f59706OooO0Oo;
        int i3 = z ? 128 : 0;
        if (j3 <= 125) {
            oo0oooo2.o00o0O(i3 | ((int) j3));
        } else if (j3 <= 65535) {
            oo0oooo2.o00o0O(i3 | 126);
            oo0oooo2.o000OOo((int) j3);
        } else {
            oo0oooo2.o00o0O(i3 | 127);
            oo0oooo2.o0O0O00(j3);
        }
        if (z) {
            byte[] bArr = this.f59714OooOOO;
            Intrinsics.checkNotNull(bArr);
            this.f59707OooO0o.nextBytes(bArr);
            oo0oooo2.o00Ooo(bArr);
            if (j3 > 0) {
                oo0OOoo.OooO00o oooO00o = this.f59716OooOOOO;
                Intrinsics.checkNotNull(oooO00o);
                buffer.Oooo0O0(oooO00o);
                oooO00o.OooO0OO(0L);
                o0O0ooO.OooO0O0(oooO00o, bArr);
                oooO00o.close();
            }
        }
        oo0oooo2.write(buffer, j3);
        this.f59708OooO0o0.OooOOO0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        o000OO0O o000oo0o2 = this.f59715OooOOO0;
        if (o000oo0o2 == null) {
            return;
        }
        o000oo0o2.close();
    }
}
