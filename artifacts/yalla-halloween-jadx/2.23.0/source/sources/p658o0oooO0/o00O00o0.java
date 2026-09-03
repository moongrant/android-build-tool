package p658o0oooO0;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p028Oooo0oO.o00O0000;
import p659o0oooO00.o00000O;
import p659o0oooO00.o0000OO0;
import p659o0oooO00.o00O00;

/* JADX INFO: loaded from: classes5.dex */
public final class o00O00o0 extends o0000OO0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f60137OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f60138OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f60139OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00o0(@NotNull o00O00 delegate, long j, boolean z) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f60138OooO0o0 = j;
        this.f60137OooO0o = z;
    }

    @Override // p659o0oooO00.o0000OO0, p659o0oooO00.o00O00
    public final long o0000OO0(@NotNull o00000O sink, long j) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j2 = this.f60139OooO0oO;
        long j3 = this.f60138OooO0o0;
        if (j2 > j3) {
            j = 0;
        } else if (this.f60137OooO0o) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long jO0000OO0 = super.o0000OO0(sink, j);
        if (jO0000OO0 != -1) {
            this.f60139OooO0oO += jO0000OO0;
        }
        long j5 = this.f60139OooO0oO;
        if ((j5 >= j3 || jO0000OO0 != -1) && j5 <= j3) {
            return jO0000OO0;
        }
        if (jO0000OO0 > 0 && j5 > j3) {
            long j6 = sink.f60177OooO0o0 - (j5 - j3);
            o00000O o00000o = new o00000O();
            o00000o.Oooo000(sink);
            sink.write(o00000o, j6);
            o00000o.OooO0oO();
        }
        StringBuilder sbOooO00o = o00O0000.OooO00o("expected ", j3, " bytes but got ");
        sbOooO00o.append(this.f60139OooO0oO);
        throw new IOException(sbOooO00o.toString());
    }
}
