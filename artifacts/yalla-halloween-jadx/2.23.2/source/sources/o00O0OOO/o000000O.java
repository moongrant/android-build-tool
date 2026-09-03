package o00O0OOO;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o000000O {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final String f36287OooO0o0 = p115o00O00oO.o0Oo0oo.OooO0o("WorkTimer");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final p115o00O00oO.o000OOo f36288OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap f36289OooO0O0 = new HashMap();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f36290OooO0OO = new HashMap();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f36291OooO0Oo = new Object();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface OooO00o {
        void OooO00o(@NonNull o00O0OO.OooOo oooOo);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o000000O f36292OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final o00O0OO.OooOo f36293OooO0o0;

        public OooO0O0(@NonNull o000000O o000000o2, @NonNull o00O0OO.OooOo oooOo) {
            this.f36292OooO0Oo = o000000o2;
            this.f36293OooO0o0 = oooOo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.f36292OooO0Oo.f36291OooO0Oo) {
                if (((OooO0O0) this.f36292OooO0Oo.f36289OooO0O0.remove(this.f36293OooO0o0)) != null) {
                    OooO00o oooO00o = (OooO00o) this.f36292OooO0Oo.f36290OooO0OO.remove(this.f36293OooO0o0);
                    if (oooO00o != null) {
                        oooO00o.OooO00o(this.f36293OooO0o0);
                    }
                } else {
                    p115o00O00oO.o0Oo0oo.OooO0Oo().OooO00o("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f36293OooO0o0));
                }
            }
        }
    }

    public o000000O(@NonNull oo00o.OooO0o oooO0o) {
        this.f36288OooO00o = oooO0o;
    }

    public final void OooO00o(@NonNull o00O0OO.OooOo oooOo) {
        synchronized (this.f36291OooO0Oo) {
            if (((OooO0O0) this.f36289OooO0O0.remove(oooOo)) != null) {
                p115o00O00oO.o0Oo0oo.OooO0Oo().OooO00o(f36287OooO0o0, "Stopping timer for " + oooOo);
                this.f36290OooO0OO.remove(oooOo);
            }
        }
    }
}
