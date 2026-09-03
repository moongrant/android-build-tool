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
import java.util.List;
import java.util.Objects;
import p102o000oo.o0OoOo0;
import p107o000ooO0.OooOOOO;
import p107o000ooO0.OooOo;
import p107o000ooO0.o00oO0o;
import p326o0O0ooO.o00O0;
import p326o0O0ooO.o00O00OO;
import p326o0O0ooO.oo0o0O0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO0o implements OooOOOO {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public static final String f9800OoooOOO = o0OoOo0.OooO0o0("SystemAlarmDispatcher");

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final OooOo f9801Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Context f9802Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final o00O000.OooO00o f9803Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final oo0o0O0 f9804Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final List<Intent> f9805OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final androidx.work.impl.background.systemalarm.OooO00o f9806OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final o00oO0o f9807OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final Handler f9808OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public Intent f9809OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @Nullable
    public OooO0OO f9810o000oOoO;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<android.content.Intent>] */
        @Override // java.lang.Runnable
        public final void run() {
            OooO0o oooO0o;
            RunnableC0070OooO0o runnableC0070OooO0o;
            synchronized (OooO0o.this.f9805OoooO) {
                OooO0o oooO0o2 = OooO0o.this;
                oooO0o2.f9809OoooOO0 = (Intent) oooO0o2.f9805OoooO.get(0);
            }
            Intent intent = OooO0o.this.f9809OoooOO0;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = OooO0o.this.f9809OoooOO0.getIntExtra("KEY_START_ID", 0);
                o0OoOo0 o0oooo0OooO0OO = o0OoOo0.OooO0OO();
                String str = OooO0o.f9800OoooOOO;
                o0oooo0OooO0OO.OooO00o(str, String.format("Processing command %s, %s", OooO0o.this.f9809OoooOO0, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock wakeLockOooO00o = o00O0.OooO00o(OooO0o.this.f9802Oooo0o, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    o0OoOo0.OooO0OO().OooO00o(str, String.format("Acquiring operation wake lock (%s) %s", action, wakeLockOooO00o), new Throwable[0]);
                    wakeLockOooO00o.acquire();
                    OooO0o oooO0o3 = OooO0o.this;
                    oooO0o3.f9806OoooO0.OooO0o0(oooO0o3.f9809OoooOO0, intExtra, oooO0o3);
                    o0OoOo0.OooO0OO().OooO00o(str, String.format("Releasing operation wake lock (%s) %s", action, wakeLockOooO00o), new Throwable[0]);
                    wakeLockOooO00o.release();
                    oooO0o = OooO0o.this;
                    runnableC0070OooO0o = new RunnableC0070OooO0o(oooO0o);
                } catch (Throwable th) {
                    try {
                        o0OoOo0 o0oooo0OooO0OO2 = o0OoOo0.OooO0OO();
                        String str2 = OooO0o.f9800OoooOOO;
                        o0oooo0OooO0OO2.OooO0O0(str2, "Unexpected error in onHandleIntent", th);
                        o0OoOo0.OooO0OO().OooO00o(str2, String.format("Releasing operation wake lock (%s) %s", action, wakeLockOooO00o), new Throwable[0]);
                        wakeLockOooO00o.release();
                        oooO0o = OooO0o.this;
                        runnableC0070OooO0o = new RunnableC0070OooO0o(oooO0o);
                    } catch (Throwable th2) {
                        o0OoOo0.OooO0OO().OooO00o(OooO0o.f9800OoooOOO, String.format("Releasing operation wake lock (%s) %s", action, wakeLockOooO00o), new Throwable[0]);
                        wakeLockOooO00o.release();
                        OooO0o oooO0o4 = OooO0o.this;
                        oooO0o4.OooO0o0(new RunnableC0070OooO0o(oooO0o4));
                        throw th2;
                    }
                }
                oooO0o.OooO0o0(runnableC0070OooO0o);
            }
        }
    }

    public static class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final OooO0o f9812Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final Intent f9813Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final int f9814Oooo0oo;

        public OooO0O0(@NonNull OooO0o oooO0o, @NonNull Intent intent, int i) {
            this.f9812Oooo0o = oooO0o;
            this.f9813Oooo0oO = intent;
            this.f9814Oooo0oo = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f9812Oooo0o.OooO00o(this.f9813Oooo0oO, this.f9814Oooo0oo);
        }
    }

    public interface OooO0OO {
    }

    /* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.OooO0o$OooO0o, reason: collision with other inner class name */
    public static class RunnableC0070OooO0o implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final OooO0o f9815Oooo0o;

        public RunnableC0070OooO0o(@NonNull OooO0o oooO0o) {
            this.f9815Oooo0o = oooO0o;
        }

        /* JADX WARN: Code duplicated, block: B:36:0x0098 A[Catch: all -> 0x00a8, TryCatch #2 {, blocks: (B:4:0x0019, B:6:0x001e, B:8:0x0043, B:9:0x0047, B:10:0x004e, B:11:0x004f, B:12:0x0059, B:19:0x0068, B:21:0x0070, B:22:0x0072, B:29:0x0080, B:31:0x008f, B:39:0x00a3, B:35:0x0097, B:36:0x0098, B:38:0x00a0, B:43:0x00a7, B:23:0x0073, B:27:0x007d, B:13:0x005a, B:17:0x0065), top: B:51:0x0019, inners: #0, #1 }] */
        /* JADX WARN: Code duplicated, block: B:38:0x00a0 A[Catch: all -> 0x00a8, TryCatch #2 {, blocks: (B:4:0x0019, B:6:0x001e, B:8:0x0043, B:9:0x0047, B:10:0x004e, B:11:0x004f, B:12:0x0059, B:19:0x0068, B:21:0x0070, B:22:0x0072, B:29:0x0080, B:31:0x008f, B:39:0x00a3, B:35:0x0097, B:36:0x0098, B:38:0x00a0, B:43:0x00a7, B:23:0x0073, B:27:0x007d, B:13:0x005a, B:17:0x0065), top: B:51:0x0019, inners: #0, #1 }] */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<android.content.Intent>] */
        /* JADX WARN: Type inference failed for: r3v9, types: [java.util.ArrayList, java.util.List<android.content.Intent>] */
        /* JADX WARN: Type inference failed for: r6v1, types: [java.util.HashMap, java.util.Map<java.lang.String, o000ooO0.OooOOOO>] */
        /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList, java.util.List<android.content.Intent>] */
        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            OooO0o oooO0o = this.f9815Oooo0o;
            Objects.requireNonNull(oooO0o);
            o0OoOo0 o0oooo0OooO0OO = o0OoOo0.OooO0OO();
            String str = OooO0o.f9800OoooOOO;
            o0oooo0OooO0OO.OooO00o(str, "Checking if commands are complete.", new Throwable[0]);
            oooO0o.OooO0O0();
            synchronized (oooO0o.f9805OoooO) {
                boolean z2 = true;
                if (oooO0o.f9809OoooOO0 != null) {
                    o0OoOo0.OooO0OO().OooO00o(str, String.format("Removing command %s", oooO0o.f9809OoooOO0), new Throwable[0]);
                    if (!((Intent) oooO0o.f9805OoooO.remove(0)).equals(oooO0o.f9809OoooOO0)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    oooO0o.f9809OoooOO0 = null;
                }
                o00O00OO o00o00oo2 = ((o00O000.OooO0O0) oooO0o.f9803Oooo0oO).f30114OooO00o;
                androidx.work.impl.background.systemalarm.OooO00o oooO00o = oooO0o.f9806OoooO0;
                synchronized (oooO00o.f9784Oooo0oo) {
                    z = !oooO00o.f9783Oooo0oO.isEmpty();
                }
                if (!z && oooO0o.f9805OoooO.isEmpty()) {
                    synchronized (o00o00oo2.f36989Oooo0oo) {
                        if (o00o00oo2.f36987Oooo0o.isEmpty()) {
                            z2 = false;
                        }
                    }
                    if (!z2) {
                        o0OoOo0.OooO0OO().OooO00o(str, "No more commands & intents.", new Throwable[0]);
                        OooO0OO oooO0OO = oooO0o.f9810o000oOoO;
                        if (oooO0OO != null) {
                            ((SystemAlarmService) oooO0OO).OooO0O0();
                        }
                    } else if (!oooO0o.f9805OoooO.isEmpty()) {
                        oooO0o.OooO0o();
                    }
                } else if (!oooO0o.f9805OoooO.isEmpty()) {
                    oooO0o.OooO0o();
                }
            }
        }
    }

    public OooO0o(@NonNull Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f9802Oooo0o = applicationContext;
        this.f9806OoooO0 = new androidx.work.impl.background.systemalarm.OooO00o(applicationContext);
        this.f9804Oooo0oo = new oo0o0O0();
        o00oO0o o00oo0oOooO0O0 = o00oO0o.OooO0O0(context);
        this.f9807OoooO00 = o00oo0oOooO0O0;
        OooOo oooOo = o00oo0oOooO0O0.f29978OooO0o;
        this.f9801Oooo = oooOo;
        this.f9803Oooo0oO = o00oo0oOooO0O0.f29977OooO0Oo;
        oooOo.OooO00o(this);
        this.f9805OoooO = new ArrayList();
        this.f9809OoooOO0 = null;
        this.f9808OoooO0O = new Handler(Looper.getMainLooper());
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<android.content.Intent>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<android.content.Intent>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<android.content.Intent>] */
    @MainThread
    public final boolean OooO00o(@NonNull Intent intent, int i) {
        boolean z;
        o0OoOo0 o0oooo0OooO0OO = o0OoOo0.OooO0OO();
        String str = f9800OoooOOO;
        o0oooo0OooO0OO.OooO00o(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i)), new Throwable[0]);
        OooO0O0();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            o0OoOo0.OooO0OO().OooO0o(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            OooO0O0();
            synchronized (this.f9805OoooO) {
                Iterator it = this.f9805OoooO.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                        z = true;
                        break;
                    }
                }
            }
            if (z) {
                return false;
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.f9805OoooO) {
            boolean z2 = !this.f9805OoooO.isEmpty();
            this.f9805OoooO.add(intent);
            if (!z2) {
                OooO0o();
            }
        }
        return true;
    }

    public final void OooO0O0() {
        if (this.f9808OoooO0O.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void OooO0OO() {
        o0OoOo0.OooO0OO().OooO00o(f9800OoooOOO, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f9801Oooo.OooO0o0(this);
        oo0o0O0 oo0o0o0 = this.f9804Oooo0oo;
        if (!oo0o0o0.f37025OooO0O0.isShutdown()) {
            oo0o0o0.f37025OooO0O0.shutdownNow();
        }
        this.f9810o000oOoO = null;
    }

    @Override // p107o000ooO0.OooOOOO
    public final void OooO0Oo(@NonNull String str, boolean z) {
        Context context = this.f9802Oooo0o;
        String str2 = androidx.work.impl.background.systemalarm.OooO00o.f9781Oooo;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        OooO0o0(new OooO0O0(this, intent, 0));
    }

    @MainThread
    public final void OooO0o() {
        OooO0O0();
        PowerManager.WakeLock wakeLockOooO00o = o00O0.OooO00o(this.f9802Oooo0o, "ProcessCommand");
        try {
            wakeLockOooO00o.acquire();
            ((o00O000.OooO0O0) this.f9807OoooO00.f29977OooO0Oo).OooO00o(new OooO00o());
        } finally {
            wakeLockOooO00o.release();
        }
    }

    public final void OooO0o0(@NonNull Runnable runnable) {
        this.f9808OoooO0O.post(runnable);
    }
}
