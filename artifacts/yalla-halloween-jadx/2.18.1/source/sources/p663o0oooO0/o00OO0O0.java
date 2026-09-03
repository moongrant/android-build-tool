package p663o0oooO0;

import java.net.Socket;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p659o0ooo0o.o00OOO00;
import p664o0oooO00.oo0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OO0O0 extends oo0o0Oo {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00OO0OO f51795OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO0O0(o00OO0OO o00oo0oo, String str) {
        super(str, true);
        this.f51795OooO0o0 = o00oo0oo;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList, java.util.List<java.lang.ref.Reference<o0oooO0.o00O0OO>>] */
    @Override // p664o0oooO00.oo0o0Oo
    public final long OooO00o() {
        o00OO0OO o00oo0oo = this.f51795OooO0o0;
        long jNanoTime = System.nanoTime();
        int i = 0;
        long j = Long.MIN_VALUE;
        o00OO00O o00oo00o = null;
        int i2 = 0;
        for (o00OO00O connection : o00oo0oo.f51799OooO0Oo) {
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (o00oo0oo.OooO0O0(connection, jNanoTime) > 0) {
                    i2++;
                } else {
                    i++;
                    long j2 = jNanoTime - connection.f51793OooOOOo;
                    if (j2 > j) {
                        Unit unit = Unit.INSTANCE;
                        o00oo00o = connection;
                        j = j2;
                    } else {
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
            }
        }
        long j3 = o00oo0oo.f51796OooO00o;
        if (j < j3 && i <= o00oo0oo.f51800OooO0o0) {
            if (i > 0) {
                return j3 - j;
            }
            if (i2 > 0) {
                return j3;
            }
            return -1L;
        }
        Intrinsics.checkNotNull(o00oo00o);
        synchronized (o00oo00o) {
            if (!o00oo00o.f51792OooOOOO.isEmpty()) {
                return 0L;
            }
            if (o00oo00o.f51793OooOOOo + j != jNanoTime) {
                return 0L;
            }
            o00oo00o.f51779OooO = true;
            o00oo0oo.f51799OooO0Oo.remove(o00oo00o);
            Socket socket = o00oo00o.f51781OooO0OO;
            Intrinsics.checkNotNull(socket);
            o00OOO00.OooO0o0(socket);
            if (!o00oo0oo.f51799OooO0Oo.isEmpty()) {
                return 0L;
            }
            o00oo0oo.f51797OooO0O0.OooO00o();
            return 0L;
        }
    }
}
