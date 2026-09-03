package p646o0ooOoo;

import java.net.Socket;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p635o0ooO0oo.o0O000o0;
import p639o0ooOO0o.oo0oOO0;

/* JADX INFO: loaded from: classes5.dex */
public final class oO000Oo extends oo0oOO0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ oO000o00 f59632OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000Oo(oO000o00 oo000o00, String str) {
        super(str, true);
        this.f59632OooO0o0 = oo000o00;
    }

    @Override // p639o0ooOO0o.oo0oOO0
    public final long OooO00o() {
        oO000o00 oo000o00 = this.f59632OooO0o0;
        long jNanoTime = System.nanoTime();
        int i = 0;
        long j = Long.MIN_VALUE;
        oO000OOo oo000ooo = null;
        int i2 = 0;
        for (oO000OOo connection : oo000o00.f59639OooO0o0) {
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (oo000o00.OooO0O0(connection, jNanoTime) > 0) {
                    i2++;
                } else {
                    i++;
                    long j2 = jNanoTime - connection.f59631OooOOo0;
                    if (j2 > j) {
                        oo000ooo = connection;
                        j = j2;
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
        long j3 = oo000o00.f59636OooO0O0;
        if (j < j3 && i <= oo000o00.f59635OooO00o) {
            if (i > 0) {
                return j3 - j;
            }
            if (i2 > 0) {
                return j3;
            }
            return -1L;
        }
        Intrinsics.checkNotNull(oo000ooo);
        synchronized (oo000ooo) {
            if (!(!oo000ooo.f59630OooOOOo.isEmpty()) && oo000ooo.f59631OooOOo0 + j == jNanoTime) {
                oo000ooo.f59624OooOO0 = true;
                oo000o00.f59639OooO0o0.remove(oo000ooo);
                Socket socket = oo000ooo.f59619OooO0Oo;
                Intrinsics.checkNotNull(socket);
                o0O000o0.OooO0Oo(socket);
                if (oo000o00.f59639OooO0o0.isEmpty()) {
                    oo000o00.f59637OooO0OO.OooO00o();
                }
            }
        }
        return 0L;
    }
}
