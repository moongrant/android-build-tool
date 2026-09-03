package p653o0ooo00O;

import java.net.Socket;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p648o0ooOoo.oO000o00;
import p652o0ooo000.o00000O;

/* JADX INFO: loaded from: classes5.dex */
public final class o000 extends o00000O {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o000O000 f59298OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000(o000O000 o000o001, String str) {
        super(str, true);
        this.f59298OooO0o0 = o000o001;
    }

    @Override // p652o0ooo000.o00000O
    public final long OooO00o() {
        o000O000 o000o001 = this.f59298OooO0o0;
        long jNanoTime = System.nanoTime();
        int i = 0;
        long j = Long.MIN_VALUE;
        o0000O0O o0000o0o2 = null;
        int i2 = 0;
        for (o0000O0O connection : o000o001.f59377OooO0o0) {
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (o000o001.OooO0O0(connection, jNanoTime) > 0) {
                    i2++;
                } else {
                    i++;
                    long j2 = jNanoTime - connection.f59359OooOOo0;
                    if (j2 > j) {
                        o0000o0o2 = connection;
                        j = j2;
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
        long j3 = o000o001.f59374OooO0O0;
        if (j < j3 && i <= o000o001.f59373OooO00o) {
            if (i > 0) {
                return j3 - j;
            }
            if (i2 > 0) {
                return j3;
            }
            return -1L;
        }
        Intrinsics.checkNotNull(o0000o0o2);
        synchronized (o0000o0o2) {
            if (!(!o0000o0o2.f59358OooOOOo.isEmpty()) && o0000o0o2.f59359OooOOo0 + j == jNanoTime) {
                o0000o0o2.f59352OooOO0 = true;
                o000o001.f59377OooO0o0.remove(o0000o0o2);
                Socket socket = o0000o0o2.f59347OooO0Oo;
                Intrinsics.checkNotNull(socket);
                oO000o00.OooO0Oo(socket);
                if (o000o001.f59377OooO0o0.isEmpty()) {
                    o000o001.f59375OooO0OO.OooO00o();
                }
            }
        }
        return 0L;
    }
}
