package p093o000o0OO;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.facebook.AuthenticationTokenClaims;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p084o000Ooo0.o000oOoO;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o00000OO {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final String f35325OooO0o0 = o000oOoO.OooO0o0("WorkTimer");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ScheduledExecutorService f35326OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap f35327OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f35328OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f35329OooO0Oo;

    public class OooO00o implements ThreadFactory {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f35330OooO00o = 0;

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(@NonNull Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("WorkManager-WorkTimer-thread-" + this.f35330OooO00o);
            this.f35330OooO00o = this.f35330OooO00o + 1;
            return threadNewThread;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface OooO0O0 {
        void OooO00o(@NonNull String str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class OooO0OO implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o00000OO f35331OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final String f35332OooO0o0;

        public OooO0OO(@NonNull o00000OO o00000oo2, @NonNull String str) {
            this.f35331OooO0Oo = o00000oo2;
            this.f35332OooO0o0 = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.f35331OooO0Oo.f35329OooO0Oo) {
                if (((OooO0OO) this.f35331OooO0Oo.f35327OooO0O0.remove(this.f35332OooO0o0)) != null) {
                    OooO0O0 oooO0O0 = (OooO0O0) this.f35331OooO0Oo.f35328OooO0OO.remove(this.f35332OooO0o0);
                    if (oooO0O0 != null) {
                        oooO0O0.OooO00o(this.f35332OooO0o0);
                    }
                } else {
                    o000oOoO.OooO0OO().OooO00o("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f35332OooO0o0), new Throwable[0]);
                }
            }
        }
    }

    public o00000OO() {
        OooO00o oooO00o = new OooO00o();
        this.f35327OooO0O0 = new HashMap();
        this.f35328OooO0OO = new HashMap();
        this.f35329OooO0Oo = new Object();
        this.f35326OooO00o = Executors.newSingleThreadScheduledExecutor(oooO00o);
    }

    public final void OooO00o(@NonNull String str, @NonNull OooO0O0 oooO0O0) {
        synchronized (this.f35329OooO0Oo) {
            o000oOoO.OooO0OO().OooO00o(f35325OooO0o0, String.format("Starting timer for %s", str), new Throwable[0]);
            OooO0O0(str);
            OooO0OO oooO0OO = new OooO0OO(this, str);
            this.f35327OooO0O0.put(str, oooO0OO);
            this.f35328OooO0OO.put(str, oooO0O0);
            this.f35326OooO00o.schedule(oooO0OO, AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED, TimeUnit.MILLISECONDS);
        }
    }

    public final void OooO0O0(@NonNull String str) {
        synchronized (this.f35329OooO0Oo) {
            if (((OooO0OO) this.f35327OooO0O0.remove(str)) != null) {
                o000oOoO.OooO0OO().OooO00o(f35325OooO0o0, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.f35328OooO0OO.remove(str);
            }
        }
    }
}
