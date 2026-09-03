package p660o0oooO0;

import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import p652o0ooo000.o00000O;

/* JADX INFO: loaded from: classes5.dex */
public final class o00 extends o00000O {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ long f59658OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o000OO00 f59659OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00(String str, o000OO00 o000oo01, long j) {
        super(str, true);
        this.f59659OooO0o0 = o000oo01;
        this.f59658OooO0o = j;
    }

    @Override // p652o0ooo000.o00000O
    public final long OooO00o() {
        o00O000 o00o001;
        o000OO00 o000oo01 = this.f59659OooO0o0;
        synchronized (o000oo01) {
            if (!o000oo01.f59685OooOo0 && (o00o001 = o000oo01.f59676OooOO0O) != null) {
                int i = o000oo01.f59688OooOo0o ? o000oo01.f59687OooOo0O : -1;
                o000oo01.f59687OooOo0O++;
                o000oo01.f59688OooOo0o = true;
                Unit unit = Unit.INSTANCE;
                if (i != -1) {
                    o000oo01.OooO0oo(new SocketTimeoutException("sent ping but didn't receive pong within " + o000oo01.f59670OooO0Oo + "ms (after " + (i - 1) + " successful ping/pongs)"), null);
                } else {
                    try {
                        ByteString payload = ByteString.f60193OooO0oO;
                        Intrinsics.checkNotNullParameter(payload, "payload");
                        o00o001.OooO00o(9, payload);
                    } catch (IOException e) {
                        o000oo01.OooO0oo(e, null);
                    }
                }
            }
        }
        return this.f59658OooO0o;
    }
}
