package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import p084o000Ooo0.o000oOoO;
import p085o000OooO.OooOOOO;
import p085o000OooO.OooOo;
import p085o000OooO.o0OOO0o;
import p093o000o0OO.o000000;
import p093o000o0OO.o00000OO;
import p093o000o0OO.oo0o0Oo;
import p096o000o0o0.o0000O0;
import p096o000o0o0.o0000O0O;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO0o implements OooOOOO {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final String f8444OooOOO = o000oOoO.OooO0o0("SystemAlarmDispatcher");

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final androidx.work.impl.background.systemalarm.OooO00o f8445OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f8446OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00000OO f8447OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0000O0 f8448OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooOo f8449OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o0OOO0o f8450OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Handler f8451OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final ArrayList f8452OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public Intent f8453OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public OooO0OO f8454OooOOO0;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            OooO0o oooO0o;
            RunnableC0168OooO0o runnableC0168OooO0o;
            synchronized (OooO0o.this.f8452OooOO0O) {
                OooO0o oooO0o2 = OooO0o.this;
                oooO0o2.f8453OooOO0o = (Intent) oooO0o2.f8452OooOO0O.get(0);
            }
            Intent intent = OooO0o.this.f8453OooOO0o;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = OooO0o.this.f8453OooOO0o.getIntExtra("KEY_START_ID", 0);
                o000oOoO o000ooooOooO0OO = o000oOoO.OooO0OO();
                String str = OooO0o.f8444OooOOO;
                o000ooooOooO0OO.OooO00o(str, String.format("Processing command %s, %s", OooO0o.this.f8453OooOO0o, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock wakeLockOooO00o = o000000.OooO00o(OooO0o.this.f8446OooO0Oo, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    o000oOoO.OooO0OO().OooO00o(str, String.format("Acquiring operation wake lock (%s) %s", action, wakeLockOooO00o), new Throwable[0]);
                    wakeLockOooO00o.acquire();
                    OooO0o oooO0o3 = OooO0o.this;
                    oooO0o3.f8445OooO.OooO0Oo(intExtra, oooO0o3.f8453OooOO0o, oooO0o3);
                    o000oOoO.OooO0OO().OooO00o(str, String.format("Releasing operation wake lock (%s) %s", action, wakeLockOooO00o), new Throwable[0]);
                    wakeLockOooO00o.release();
                    oooO0o = OooO0o.this;
                    runnableC0168OooO0o = new RunnableC0168OooO0o(oooO0o);
                } catch (Throwable th) {
                    try {
                        o000oOoO o000ooooOooO0OO2 = o000oOoO.OooO0OO();
                        String str2 = OooO0o.f8444OooOOO;
                        o000ooooOooO0OO2.OooO0O0(str2, "Unexpected error in onHandleIntent", th);
                        o000oOoO.OooO0OO().OooO00o(str2, String.format("Releasing operation wake lock (%s) %s", action, wakeLockOooO00o), new Throwable[0]);
                        wakeLockOooO00o.release();
                        oooO0o = OooO0o.this;
                        runnableC0168OooO0o = new RunnableC0168OooO0o(oooO0o);
                    } catch (Throwable th2) {
                        o000oOoO.OooO0OO().OooO00o(OooO0o.f8444OooOOO, String.format("Releasing operation wake lock (%s) %s", action, wakeLockOooO00o), new Throwable[0]);
                        wakeLockOooO00o.release();
                        OooO0o oooO0o4 = OooO0o.this;
                        oooO0o4.OooO0o(new RunnableC0168OooO0o(oooO0o4));
                        throw th2;
                    }
                }
                oooO0o.OooO0o(runnableC0168OooO0o);
            }
        }
    }

    public static class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO0o f8456OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f8457OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Intent f8458OooO0o0;

        public OooO0O0(int i, @NonNull Intent intent, @NonNull OooO0o oooO0o) {
            this.f8456OooO0Oo = oooO0o;
            this.f8458OooO0o0 = intent;
            this.f8457OooO0o = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f8456OooO0Oo.OooO00o(this.f8457OooO0o, this.f8458OooO0o0);
        }
    }

    public interface OooO0OO {
    }

    /* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.OooO0o$OooO0o, reason: collision with other inner class name */
    public static class RunnableC0168OooO0o implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO0o f8459OooO0Oo;

        public RunnableC0168OooO0o(@NonNull OooO0o oooO0o) {
            this.f8459OooO0Oo = oooO0o;
        }

        @Override // java.lang.Runnable
        public final void run() {
            OooO0o oooO0o = this.f8459OooO0Oo;
            oooO0o.getClass();
            o000oOoO o000ooooOooO0OO = o000oOoO.OooO0OO();
            String str = OooO0o.f8444OooOOO;
            o000ooooOooO0OO.OooO00o(str, "Checking if commands are complete.", new Throwable[0]);
            oooO0o.OooO0O0();
            synchronized (oooO0o.f8452OooOO0O) {
                if (oooO0o.f8453OooOO0o != null) {
                    o000oOoO.OooO0OO().OooO00o(str, String.format("Removing command %s", oooO0o.f8453OooOO0o), new Throwable[0]);
                    if (!((Intent) oooO0o.f8452OooOO0O.remove(0)).equals(oooO0o.f8453OooOO0o)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    oooO0o.f8453OooOO0o = null;
                }
                oo0o0Oo oo0o0oo = ((o0000O0O) oooO0o.f8448OooO0o0).f35389OooO00o;
                if (!oooO0o.f8445OooO.OooO0OO() && oooO0o.f8452OooOO0O.isEmpty() && !oo0o0oo.OooO0O0()) {
                    o000oOoO.OooO0OO().OooO00o(str, "No more commands & intents.", new Throwable[0]);
                    OooO0OO oooO0OO = oooO0o.f8454OooOOO0;
                    if (oooO0OO != null) {
                        ((SystemAlarmService) oooO0OO).OooO0O0();
                    }
                } else if (!oooO0o.f8452OooOO0O.isEmpty()) {
                    oooO0o.OooO0oO();
                }
            }
        }
    }

    public OooO0o(@NonNull Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f8446OooO0Oo = applicationContext;
        this.f8445OooO = new androidx.work.impl.background.systemalarm.OooO00o(applicationContext);
        this.f8447OooO0o = new o00000OO();
        o0OOO0o o0ooo0oOooO0OO = o0OOO0o.OooO0OO(context);
        this.f8450OooO0oo = o0ooo0oOooO0OO;
        OooOo oooOo = o0ooo0oOooO0OO.f35162OooO0o;
        this.f8449OooO0oO = oooOo;
        this.f8448OooO0o0 = o0ooo0oOooO0OO.f35161OooO0Oo;
        oooOo.OooO00o(this);
        this.f8452OooOO0O = new ArrayList();
        this.f8453OooOO0o = null;
        this.f8451OooOO0 = new Handler(Looper.getMainLooper());
    }

    @MainThread
    public final void OooO00o(int i, @NonNull Intent intent) {
        o000oOoO o000ooooOooO0OO = o000oOoO.OooO0OO();
        String str = f8444OooOOO;
        o000ooooOooO0OO.OooO00o(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i)), new Throwable[0]);
        OooO0O0();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            o000oOoO.OooO0OO().OooO0o(str, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && OooO0OO()) {
            return;
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.f8452OooOO0O) {
            boolean z = !this.f8452OooOO0O.isEmpty();
            this.f8452OooOO0O.add(intent);
            if (!z) {
                OooO0oO();
            }
        }
    }

    public final void OooO0O0() {
        if (this.f8451OooOO0.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @MainThread
    public final boolean OooO0OO() {
        OooO0O0();
        synchronized (this.f8452OooOO0O) {
            Iterator it = this.f8452OooOO0O.iterator();
            while (it.hasNext()) {
                if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void OooO0Oo() {
        o000oOoO.OooO0OO().OooO00o(f8444OooOOO, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f8449OooO0oO.OooO0o(this);
        ScheduledExecutorService scheduledExecutorService = this.f8447OooO0o.f35326OooO00o;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.f8454OooOOO0 = null;
    }

    public final void OooO0o(@NonNull Runnable runnable) {
        this.f8451OooOO0.post(runnable);
    }

    @Override // p085o000OooO.OooOOOO
    public final void OooO0o0(@NonNull String str, boolean z) {
        String str2 = androidx.work.impl.background.systemalarm.OooO00o.f8426OooO0oO;
        Intent intent = new Intent(this.f8446OooO0Oo, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        OooO0o(new OooO0O0(0, intent, this));
    }

    @MainThread
    public final void OooO0oO() {
        OooO0O0();
        PowerManager.WakeLock wakeLockOooO00o = o000000.OooO00o(this.f8446OooO0Oo, "ProcessCommand");
        try {
            wakeLockOooO00o.acquire();
            ((o0000O0O) this.f8450OooO0oo.f35161OooO0Oo).OooO00o(new OooO00o());
        } finally {
            wakeLockOooO00o.release();
        }
    }
}
