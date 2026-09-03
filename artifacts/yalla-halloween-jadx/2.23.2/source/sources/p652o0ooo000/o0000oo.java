package p652o0ooo000;

import java.util.logging.Level;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o0000oo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0000O00 f59297OooO0Oo;

    public o0000oo(o0000O00 o0000o00) {
        this.f59297OooO0Oo = o0000o00;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o00000O o00000oOooO0OO;
        long jNanoTime;
        while (true) {
            o0000O00 o0000o00 = this.f59297OooO0Oo;
            synchronized (o0000o00) {
                o00000oOooO0OO = o0000o00.OooO0OO();
            }
            if (o00000oOooO0OO == null) {
                return;
            }
            o0000 o0000Var = o00000oOooO0OO.f59284OooO0OO;
            Intrinsics.checkNotNull(o0000Var);
            o0000O00 o0000o01 = this.f59297OooO0Oo;
            o0000O00 o0000o02 = o0000O00.f59287OooO0oo;
            boolean zIsLoggable = o0000O00.f59286OooO.isLoggable(Level.FINE);
            if (zIsLoggable) {
                jNanoTime = o0000Var.f59276OooO00o.f59288OooO00o.nanoTime();
                o00000OO.OooO00o(o00000oOooO0OO, o0000Var, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                o0000O00.OooO00o(o0000o01, o00000oOooO0OO);
                try {
                    Unit unit = Unit.INSTANCE;
                    if (zIsLoggable) {
                        o00000OO.OooO00o(o00000oOooO0OO, o0000Var, Intrinsics.stringPlus("finished run in ", o00000OO.OooO0O0(o0000Var.f59276OooO00o.f59288OooO00o.nanoTime() - jNanoTime)));
                    }
                } catch (Throwable th) {
                    if (zIsLoggable) {
                        o00000OO.OooO00o(o00000oOooO0OO, o0000Var, Intrinsics.stringPlus("failed a run in ", o00000OO.OooO0O0(o0000Var.f59276OooO00o.f59288OooO00o.nanoTime() - jNanoTime)));
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                o0000o01.f59288OooO00o.execute(this);
                throw th2;
            }
        }
    }
}
