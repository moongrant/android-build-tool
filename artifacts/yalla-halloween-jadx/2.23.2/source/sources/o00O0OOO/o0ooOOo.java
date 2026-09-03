package o00O0OOO;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Set;
import oo00o.o00000O0;
import oo00o.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o0ooOOo implements Runnable {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final String f36311OooO0oO = p115o00O00oO.o0Oo0oo.OooO0o("StopWorkRunnable");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00000O0 f36312OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f36313OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final oo00o.o0ooOOo f36314OooO0o0;

    public o0ooOOo(@NonNull o00000O0 o00000o1, @NonNull oo00o.o0ooOOo o0ooooo, boolean z) {
        this.f36312OooO0Oo = o00000o1;
        this.f36314OooO0o0 = o0ooooo;
        this.f36313OooO0o = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zOooO0OO;
        if (this.f36313OooO0o) {
            zOooO0OO = this.f36312OooO0Oo.f60223OooO0o.OooOOO0(this.f36314OooO0o0);
        } else {
            oo00o.o00Oo0 o00oo1 = this.f36312OooO0Oo.f60223OooO0o;
            oo00o.o0ooOOo o0ooooo = this.f36314OooO0o0;
            o00oo1.getClass();
            String str = o0ooooo.f60300OooO00o.f36202OooO00o;
            synchronized (o00oo1.f60278OooOOOO) {
                o0000O00 o0000o00 = (o0000O00) o00oo1.f60273OooOO0.remove(str);
                if (o0000o00 == null) {
                    p115o00O00oO.o0Oo0oo.OooO0Oo().OooO00o(oo00o.o00Oo0.f60266OooOOOo, "WorkerWrapper could not be found for " + str);
                } else {
                    Set set = (Set) o00oo1.f60274OooOO0O.get(str);
                    if (set != null && set.contains(o0ooooo)) {
                        p115o00O00oO.o0Oo0oo.OooO0Oo().OooO00o(oo00o.o00Oo0.f60266OooOOOo, "Processor stopping background work " + str);
                        o00oo1.f60274OooOO0O.remove(str);
                        zOooO0OO = oo00o.o00Oo0.OooO0OO(o0000o00, str);
                    }
                }
                zOooO0OO = false;
            }
        }
        p115o00O00oO.o0Oo0oo.OooO0Oo().OooO00o(f36311OooO0oO, "StopWorkRunnable for " + this.f36314OooO0o0.f60300OooO00o.f36202OooO00o + "; Processor.stopWork = " + zOooO0OO);
    }
}
