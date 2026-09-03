package p659o0oooO;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p028Oooo0oO.o00O0000;
import p662o0oooO0O.oO00000;
import p662o0oooO0O.oo0OOoo;
import p662o0oooO0O.oo0ooO;

/* JADX INFO: loaded from: classes5.dex */
public final class o000O00 extends oo0ooO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f59633OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f59634OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f59635OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00(@NotNull oO00000 delegate, long j, boolean z) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f59634OooO0o0 = j;
        this.f59633OooO0o = z;
    }

    @Override // p662o0oooO0O.oo0ooO, p662o0oooO0O.oO00000
    public final long OooOO0O(@NotNull oo0OOoo sink, long j) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j2 = this.f59635OooO0oO;
        long j3 = this.f59634OooO0o0;
        if (j2 > j3) {
            j = 0;
        } else if (this.f59633OooO0o) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long jOooOO0O = super.OooOO0O(sink, j);
        if (jOooOO0O != -1) {
            this.f59635OooO0oO += jOooOO0O;
        }
        long j5 = this.f59635OooO0oO;
        if ((j5 >= j3 || jOooOO0O != -1) && j5 <= j3) {
            return jOooOO0O;
        }
        if (jOooOO0O > 0 && j5 > j3) {
            long j6 = sink.f59828OooO0o0 - (j5 - j3);
            oo0OOoo oo0oooo = new oo0OOoo();
            oo0oooo.o00Oo0(sink);
            sink.write(oo0oooo, j6);
            oo0oooo.OooO0oO();
        }
        StringBuilder sbOooO00o = o00O0000.OooO00o("expected ", j3, " bytes but got ");
        sbOooO00o.append(this.f59635OooO0oO);
        throw new IOException(sbOooO00o.toString());
    }
}
