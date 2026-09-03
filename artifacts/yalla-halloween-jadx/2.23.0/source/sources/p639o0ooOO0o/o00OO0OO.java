package p639o0ooOO0o;

import java.util.logging.Level;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o00OO0OO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00OO0O0 f57450OooO0Oo;

    public o00OO0OO(o00OO0O0 o00oo0o1) {
        this.f57450OooO0Oo = o00oo0o1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oo0oOO0 oo0ooo0OooO0OO;
        long jNanoTime;
        while (true) {
            o00OO0O0 o00oo0o1 = this.f57450OooO0Oo;
            synchronized (o00oo0o1) {
                oo0ooo0OooO0OO = o00oo0o1.OooO0OO();
            }
            if (oo0ooo0OooO0OO == null) {
                return;
            }
            o00OO00O o00oo00o = oo0ooo0OooO0OO.f57453OooO0OO;
            Intrinsics.checkNotNull(o00oo00o);
            o00OO0O0 o00oo0o2 = this.f57450OooO0Oo;
            o00OO0O0 o00oo0o3 = o00OO0O0.f57441OooO0oo;
            boolean zIsLoggable = o00OO0O0.f57440OooO.isLoggable(Level.FINE);
            if (zIsLoggable) {
                jNanoTime = o00oo00o.f57434OooO00o.f57442OooO00o.nanoTime();
                o00O.OooO00o(oo0ooo0OooO0OO, o00oo00o, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                o00OO0O0.OooO00o(o00oo0o2, oo0ooo0OooO0OO);
                try {
                    Unit unit = Unit.INSTANCE;
                    if (zIsLoggable) {
                        o00O.OooO00o(oo0ooo0OooO0OO, o00oo00o, Intrinsics.stringPlus("finished run in ", o00O.OooO0O0(o00oo00o.f57434OooO00o.f57442OooO00o.nanoTime() - jNanoTime)));
                    }
                } catch (Throwable th) {
                    if (zIsLoggable) {
                        o00O.OooO00o(oo0ooo0OooO0OO, o00oo00o, Intrinsics.stringPlus("failed a run in ", o00O.OooO0O0(o00oo00o.f57434OooO00o.f57442OooO00o.nanoTime() - jNanoTime)));
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                o00oo0o2.f57442OooO00o.execute(this);
                throw th2;
            }
        }
    }
}
