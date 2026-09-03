package p085o000OooO;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import p084o000Ooo0.OooOOO0;
import p084o000Ooo0.o000oOoO;
import p092o000o0O0.o00000O;
import p093o000o0OO.o000000;
import p094o000o0Oo.o0000O00;
import p096o000o0o0.o0000O0;
import p096o000o0o0.o0000O0O;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooOo implements OooOOOO, o00000O {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final String f35122OooOOOO = o000oOoO.OooO0o0("Processor");

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final androidx.work.OooO00o f35125OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Context f35126OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0000O0 f35127OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final WorkDatabase f35128OooO0oo;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final List<Oooo000> f35130OooOO0O;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final HashMap f35129OooOO0 = new HashMap();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final HashMap f35123OooO = new HashMap();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final HashSet f35131OooOO0o = new HashSet();

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final ArrayList f35133OooOOO0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public PowerManager.WakeLock f35124OooO0Oo = null;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final Object f35132OooOOO = new Object();

    public static class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NonNull
        public final OooOOOO f35134OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NonNull
        public final com.google.common.util.concurrent.OooO00o<Boolean> f35135OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NonNull
        public final String f35136OooO0o0;

        public OooO00o(@NonNull OooOOOO oooOOOO, @NonNull String str, @NonNull o0000O00 o0000o00) {
            this.f35134OooO0Oo = oooOOOO;
            this.f35136OooO0o0 = str;
            this.f35135OooO0o = o0000o00;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zBooleanValue;
            try {
                zBooleanValue = this.f35135OooO0o.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                zBooleanValue = true;
            }
            this.f35134OooO0Oo.OooO0o0(this.f35136OooO0o0, zBooleanValue);
        }
    }

    public OooOo(@NonNull Context context, @NonNull androidx.work.OooO00o oooO00o, @NonNull o0000O0O o0000o0o2, @NonNull WorkDatabase workDatabase, @NonNull List list) {
        this.f35126OooO0o0 = context;
        this.f35125OooO0o = oooO00o;
        this.f35127OooO0oO = o0000o0o2;
        this.f35128OooO0oo = workDatabase;
        this.f35130OooOO0O = list;
    }

    public static boolean OooO0O0(@NonNull String str, @Nullable oo0o0Oo oo0o0oo) {
        boolean zIsDone;
        if (oo0o0oo == null) {
            o000oOoO.OooO0OO().OooO00o(f35122OooOOOO, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
            return false;
        }
        oo0o0oo.f35187OooOo0 = true;
        oo0o0oo.OooO();
        com.google.common.util.concurrent.OooO00o<ListenableWorker.OooO00o> oooO00o = oo0o0oo.f35188OooOo00;
        if (oooO00o != null) {
            zIsDone = oooO00o.isDone();
            oo0o0oo.f35188OooOo00.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = oo0o0oo.f35176OooO0oo;
        if (listenableWorker == null || zIsDone) {
            o000oOoO.OooO0OO().OooO00o(oo0o0Oo.f35170OooOo0O, String.format("WorkSpec %s is already done. Not interrupting.", oo0o0oo.f35175OooO0oO), new Throwable[0]);
        } else {
            listenableWorker.OooO0oO();
        }
        o000oOoO.OooO0OO().OooO00o(f35122OooOOOO, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
        return true;
    }

    public final void OooO() {
        synchronized (this.f35132OooOOO) {
            if (!(!this.f35123OooO.isEmpty())) {
                Context context = this.f35126OooO0o0;
                String str = androidx.work.impl.foreground.OooO00o.f8468OooOOO0;
                Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                try {
                    this.f35126OooO0o0.startService(intent);
                } catch (Throwable th) {
                    o000oOoO.OooO0OO().OooO0O0(f35122OooOOOO, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = this.f35124OooO0Oo;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f35124OooO0Oo = null;
                }
            }
        }
    }

    public final void OooO00o(@NonNull OooOOOO oooOOOO) {
        synchronized (this.f35132OooOOO) {
            this.f35133OooOOO0.add(oooOOOO);
        }
    }

    public final boolean OooO0OO(@NonNull String str) {
        boolean zContains;
        synchronized (this.f35132OooOOO) {
            zContains = this.f35131OooOO0o.contains(str);
        }
        return zContains;
    }

    public final boolean OooO0Oo(@NonNull String str) {
        boolean z;
        synchronized (this.f35132OooOOO) {
            z = this.f35129OooOO0.containsKey(str) || this.f35123OooO.containsKey(str);
        }
        return z;
    }

    public final void OooO0o(@NonNull OooOOOO oooOOOO) {
        synchronized (this.f35132OooOOO) {
            this.f35133OooOOO0.remove(oooOOOO);
        }
    }

    @Override // p085o000OooO.OooOOOO
    public final void OooO0o0(@NonNull String str, boolean z) {
        synchronized (this.f35132OooOOO) {
            this.f35129OooOO0.remove(str);
            o000oOoO.OooO0OO().OooO00o(f35122OooOOOO, String.format("%s %s executed; reschedule = %s", OooOo.class.getSimpleName(), str, Boolean.valueOf(z)), new Throwable[0]);
            Iterator it = this.f35133OooOOO0.iterator();
            while (it.hasNext()) {
                ((OooOOOO) it.next()).OooO0o0(str, z);
            }
        }
    }

    public final void OooO0oO(@NonNull String str, @NonNull OooOOO0 oooOOO0) {
        synchronized (this.f35132OooOOO) {
            o000oOoO.OooO0OO().OooO0Oo(f35122OooOOOO, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
            oo0o0Oo oo0o0oo = (oo0o0Oo) this.f35129OooOO0.remove(str);
            if (oo0o0oo != null) {
                if (this.f35124OooO0Oo == null) {
                    PowerManager.WakeLock wakeLockOooO00o = o000000.OooO00o(this.f35126OooO0o0, "ProcessorForegroundLck");
                    this.f35124OooO0Oo = wakeLockOooO00o;
                    wakeLockOooO00o.acquire();
                }
                this.f35123OooO.put(str, oo0o0oo);
                Intent intentOooO0OO = androidx.work.impl.foreground.OooO00o.OooO0OO(this.f35126OooO0o0, str, oooOOO0);
                Context context = this.f35126OooO0o0;
                Object obj = ContextCompat.f5271OooO00o;
                if (Build.VERSION.SDK_INT >= 26) {
                    ContextCompat.OooOO0.OooO0O0(context, intentOooO0OO);
                } else {
                    context.startService(intentOooO0OO);
                }
            }
        }
    }

    public final boolean OooO0oo(@NonNull String str, @Nullable WorkerParameters.OooO00o oooO00o) {
        synchronized (this.f35132OooOOO) {
            if (OooO0Oo(str)) {
                o000oOoO.OooO0OO().OooO00o(f35122OooOOOO, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                return false;
            }
            oo0o0Oo.OooO00o oooO00o2 = new oo0o0Oo.OooO00o(this.f35126OooO0o0, this.f35125OooO0o, this.f35127OooO0oO, this, this.f35128OooO0oo, str);
            oooO00o2.f35195OooO0oO = this.f35130OooOO0O;
            if (oooO00o != null) {
                oooO00o2.f35196OooO0oo = oooO00o;
            }
            oo0o0Oo oo0o0oo = new oo0o0Oo(oooO00o2);
            o0000O00<Boolean> o0000o00 = oo0o0oo.f35186OooOOoo;
            o0000o00.OooO(new OooO00o(this, str, o0000o00), ((o0000O0O) this.f35127OooO0oO).f35391OooO0OO);
            this.f35129OooOO0.put(str, oo0o0oo);
            ((o0000O0O) this.f35127OooO0oO).f35389OooO00o.execute(oo0o0oo);
            o000oOoO.OooO0OO().OooO00o(f35122OooOOOO, String.format("%s: processing %s", OooOo.class.getSimpleName(), str), new Throwable[0]);
            return true;
        }
    }

    public final boolean OooOO0(@NonNull String str) {
        boolean zOooO0O0;
        synchronized (this.f35132OooOOO) {
            o000oOoO.OooO0OO().OooO00o(f35122OooOOOO, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            zOooO0O0 = OooO0O0(str, (oo0o0Oo) this.f35123OooO.remove(str));
        }
        return zOooO0O0;
    }

    public final boolean OooOO0O(@NonNull String str) {
        boolean zOooO0O0;
        synchronized (this.f35132OooOOO) {
            o000oOoO.OooO0OO().OooO00o(f35122OooOOOO, String.format("Processor stopping background work %s", str), new Throwable[0]);
            zOooO0O0 = OooO0O0(str, (oo0o0Oo) this.f35129OooOO0.remove(str));
        }
        return zOooO0O0;
    }
}
