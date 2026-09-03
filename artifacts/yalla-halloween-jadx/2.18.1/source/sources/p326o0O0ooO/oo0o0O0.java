package p326o0O0ooO;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.facebook.AuthenticationTokenClaims;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p102o000oo.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class oo0o0O0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final String f37023OooO0o = o0OoOo0.OooO0o0("WorkTimer");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f37024OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ScheduledExecutorService f37025OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Map<String, OooO0OO> f37026OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Map<String, OooO0O0> f37027OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Object f37028OooO0o0;

    public class OooO00o implements ThreadFactory {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f37029OooO00o = 0;

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(@NonNull Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("WorkManager-WorkTimer-thread-");
            sbOooO0o0.append(this.f37029OooO00o);
            threadNewThread.setName(sbOooO0o0.toString());
            this.f37029OooO00o++;
            return threadNewThread;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface OooO0O0 {
        void OooO00o(@NonNull String str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class OooO0OO implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final oo0o0O0 f37030Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final String f37031Oooo0oO;

        public OooO0OO(@NonNull oo0o0O0 oo0o0o0, @NonNull String str) {
            this.f37030Oooo0o = oo0o0o0;
            this.f37031Oooo0oO = str;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [java.util.HashMap, java.util.Map<java.lang.String, o0O0ooO.oo0o0O0$OooO0OO>] */
        /* JADX WARN: Type inference failed for: r1v7, types: [java.util.HashMap, java.util.Map<java.lang.String, o0O0ooO.oo0o0O0$OooO0O0>] */
        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.f37030Oooo0o.f37028OooO0o0) {
                if (((OooO0OO) this.f37030Oooo0o.f37026OooO0OO.remove(this.f37031Oooo0oO)) != null) {
                    OooO0O0 oooO0O0 = (OooO0O0) this.f37030Oooo0o.f37027OooO0Oo.remove(this.f37031Oooo0oO);
                    if (oooO0O0 != null) {
                        oooO0O0.OooO00o(this.f37031Oooo0oO);
                    }
                } else {
                    o0OoOo0.OooO0OO().OooO00o("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f37031Oooo0oO), new Throwable[0]);
                }
            }
        }
    }

    public oo0o0O0() {
        OooO00o oooO00o = new OooO00o();
        this.f37024OooO00o = oooO00o;
        this.f37026OooO0OO = new HashMap();
        this.f37027OooO0Oo = new HashMap();
        this.f37028OooO0o0 = new Object();
        this.f37025OooO0O0 = Executors.newSingleThreadScheduledExecutor(oooO00o);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<java.lang.String, o0O0ooO.oo0o0O0$OooO0OO>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.HashMap, java.util.Map<java.lang.String, o0O0ooO.oo0o0O0$OooO0O0>] */
    public final void OooO00o(@NonNull String str, @NonNull OooO0O0 oooO0O0) {
        synchronized (this.f37028OooO0o0) {
            o0OoOo0.OooO0OO().OooO00o(f37023OooO0o, String.format("Starting timer for %s", str), new Throwable[0]);
            OooO0O0(str);
            OooO0OO oooO0OO = new OooO0OO(this, str);
            this.f37026OooO0OO.put(str, oooO0OO);
            this.f37027OooO0Oo.put(str, oooO0O0);
            this.f37025OooO0O0.schedule(oooO0OO, AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, o0O0ooO.oo0o0O0$OooO0OO>] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.HashMap, java.util.Map<java.lang.String, o0O0ooO.oo0o0O0$OooO0O0>] */
    public final void OooO0O0(@NonNull String str) {
        synchronized (this.f37028OooO0o0) {
            if (((OooO0OO) this.f37026OooO0OO.remove(str)) != null) {
                o0OoOo0.OooO0OO().OooO00o(f37023OooO0o, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.f37027OooO0Oo.remove(str);
            }
        }
    }
}
