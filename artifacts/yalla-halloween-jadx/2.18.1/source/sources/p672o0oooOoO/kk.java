package p672o0oooOoO;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import p674o0oooo0.o0oOO;
import p674o0oooo0.oo00oO;

/* JADX INFO: loaded from: classes3.dex */
public final class kk implements Closeable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public ck f52018Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final o0oOO f52019Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final o0oOO f52020Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f52021Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final oo00oO f52022OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final o0oOO.OooO00o f52023OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final byte[] f52024OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final boolean f52025OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public final Random f52026OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final boolean f52027OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final long f52028OoooOOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final boolean f52029o000oOoO;

    public kk(boolean z, @NotNull oo00oO sink, @NotNull Random random, boolean z2, boolean z3, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(random, "random");
        this.f52025OoooO0O = z;
        this.f52022OoooO = sink;
        this.f52026OoooOO0 = random;
        this.f52029o000oOoO = z2;
        this.f52027OoooOOO = z3;
        this.f52028OoooOOo = j;
        this.f52019Oooo0o = new o0oOO();
        this.f52020Oooo0oO = sink.OooO0o0();
        this.f52024OoooO00 = z ? new byte[4] : null;
        this.f52023OoooO0 = z ? new o0oOO.OooO00o() : null;
    }

    public final void OooO00o(int i, ByteString byteString) throws IOException {
        if (this.f52021Oooo0oo) {
            throw new IOException("closed");
        }
        int iOooO0o0 = byteString.OooO0o0();
        if (!(((long) iOooO0o0) <= 125)) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        this.f52020Oooo0oO.Ooooo0o(i | 128);
        if (this.f52025OoooO0O) {
            this.f52020Oooo0oO.Ooooo0o(iOooO0o0 | 128);
            Random random = this.f52026OoooOO0;
            byte[] bArr = this.f52024OoooO00;
            Intrinsics.checkNotNull(bArr);
            random.nextBytes(bArr);
            this.f52020Oooo0oO.OoooOOo(this.f52024OoooO00);
            if (iOooO0o0 > 0) {
                o0oOO o0ooo2 = this.f52020Oooo0oO;
                long j = o0ooo2.f52099Oooo0oO;
                o0ooo2.OoooOOO(byteString);
                o0oOO o0ooo3 = this.f52020Oooo0oO;
                o0oOO.OooO00o oooO00o = this.f52023OoooO0;
                Intrinsics.checkNotNull(oooO00o);
                o0ooo3.OooOoOO(oooO00o);
                this.f52023OoooO0.OooO0O0(j);
                ik.OooO0O0(this.f52023OoooO0, this.f52024OoooO00);
                this.f52023OoooO0.close();
            }
        } else {
            this.f52020Oooo0oO.Ooooo0o(iOooO0o0);
            this.f52020Oooo0oO.OoooOOO(byteString);
        }
        this.f52022OoooO.flush();
    }

    public final void OooO0O0(int i, @NotNull ByteString data) throws IOException {
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.f52021Oooo0oo) {
            throw new IOException("closed");
        }
        this.f52019Oooo0o.OoooOOO(data);
        int i2 = i | 128;
        if (this.f52029o000oOoO && data.OooO0o0() >= this.f52028OoooOOo) {
            ck ckVar = this.f52018Oooo;
            if (ckVar == null) {
                ckVar = new ck(this.f52027OoooOOO);
                this.f52018Oooo = ckVar;
            }
            o0oOO buffer = this.f52019Oooo0o;
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            if (!(ckVar.f51950Oooo0o.f52099Oooo0oO == 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (ckVar.f51949Oooo) {
                ckVar.f51951Oooo0oO.reset();
            }
            ckVar.f51952Oooo0oo.write(buffer, buffer.f52099Oooo0oO);
            ckVar.f51952Oooo0oo.flush();
            o0oOO o0ooo2 = ckVar.f51950Oooo0o;
            ByteString byteString = dk.f51953OooO00o;
            if (o0ooo2.Ooooo00(o0ooo2.f52099Oooo0oO - ((long) byteString.OooO0o0()), byteString)) {
                o0oOO o0ooo3 = ckVar.f51950Oooo0o;
                long j = o0ooo3.f52099Oooo0oO - ((long) 4);
                o0oOO.OooO00o oooO00o = new o0oOO.OooO00o();
                o0ooo3.OooOoOO(oooO00o);
                try {
                    oooO00o.OooO00o(j);
                    CloseableKt.closeFinally(oooO00o, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(oooO00o, th);
                        throw th2;
                    }
                }
            } else {
                ckVar.f51950Oooo0o.Ooooo0o(0);
            }
            o0oOO o0ooo4 = ckVar.f51950Oooo0o;
            buffer.write(o0ooo4, o0ooo4.f52099Oooo0oO);
            i2 |= 64;
        }
        long j2 = this.f52019Oooo0o.f52099Oooo0oO;
        this.f52020Oooo0oO.Ooooo0o(i2);
        int i3 = this.f52025OoooO0O ? 128 : 0;
        if (j2 <= 125) {
            this.f52020Oooo0oO.Ooooo0o(((int) j2) | i3);
        } else if (j2 <= 65535) {
            this.f52020Oooo0oO.Ooooo0o(i3 | 126);
            this.f52020Oooo0oO.o00Oo0((int) j2);
        } else {
            this.f52020Oooo0oO.Ooooo0o(i3 | 127);
            this.f52020Oooo0oO.ooOO(j2);
        }
        if (this.f52025OoooO0O) {
            Random random = this.f52026OoooOO0;
            byte[] bArr = this.f52024OoooO00;
            Intrinsics.checkNotNull(bArr);
            random.nextBytes(bArr);
            this.f52020Oooo0oO.OoooOOo(this.f52024OoooO00);
            if (j2 > 0) {
                o0oOO o0ooo5 = this.f52019Oooo0o;
                o0oOO.OooO00o oooO00o2 = this.f52023OoooO0;
                Intrinsics.checkNotNull(oooO00o2);
                o0ooo5.OooOoOO(oooO00o2);
                this.f52023OoooO0.OooO0O0(0L);
                ik.OooO0O0(this.f52023OoooO0, this.f52024OoooO00);
                this.f52023OoooO0.close();
            }
        }
        this.f52020Oooo0oO.write(this.f52019Oooo0o, j2);
        this.f52022OoooO.OooOo00();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        ck ckVar = this.f52018Oooo;
        if (ckVar != null) {
            ckVar.close();
        }
    }
}
