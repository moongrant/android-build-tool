package p654o0ooo0o;

import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import p639o0ooOO0o.oo0oOO0;

/* JADX INFO: loaded from: classes5.dex */
public final class o00000O0 extends oo0oOO0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ long f60102OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o000000O f60103OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O0(String str, o000000O o000000o2, long j) {
        super(str, true);
        this.f60103OooO0o0 = o000000o2;
        this.f60102OooO0o = j;
    }

    @Override // p639o0ooOO0o.oo0oOO0
    public final long OooO00o() {
        o0000 o0000Var;
        o000000O o000000o2 = this.f60103OooO0o0;
        synchronized (o000000o2) {
            if (!o000000o2.f60082OooOo0 && (o0000Var = o000000o2.f60073OooOO0O) != null) {
                int i = o000000o2.f60085OooOo0o ? o000000o2.f60084OooOo0O : -1;
                o000000o2.f60084OooOo0O++;
                o000000o2.f60085OooOo0o = true;
                Unit unit = Unit.INSTANCE;
                if (i != -1) {
                    o000000o2.OooO0oo(new SocketTimeoutException("sent ping but didn't receive pong within " + o000000o2.f60067OooO0Oo + "ms (after " + (i - 1) + " successful ping/pongs)"), null);
                } else {
                    try {
                        ByteString payload = ByteString.f60866OooO0oO;
                        Intrinsics.checkNotNullParameter(payload, "payload");
                        o0000Var.OooO00o(9, payload);
                    } catch (IOException e) {
                        o000000o2.OooO0oo(e, null);
                    }
                }
            }
        }
        return this.f60102OooO0o;
    }
}
