package p107o000ooO0;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.common.util.concurrent.OooO0OO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import o00O000.OooO0O0;
import p102o000oo.OooOOO;
import p102o000oo.o0OoOo0;
import p236o00oOoo.o00OOOO0;
import p326o0O0ooO.o00O0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooOo implements OooOOOO, o00.OooO00o {

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public static final String f29940OoooOOo = o0OoOo0.OooO0o0("Processor");

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public o00O000.OooO00o f29941Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Context f29943Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public androidx.work.OooO00o f29944Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public List<Oooo000> f29945OoooO;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public WorkDatabase f29947OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public Map<String, o0Oo0oo> f29948OoooO0O = new HashMap();

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public Map<String, o0Oo0oo> f29946OoooO0 = new HashMap();

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public Set<String> f29949OoooOO0 = new HashSet();

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final List<OooOOOO> f29951o000oOoO = new ArrayList();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @Nullable
    public PowerManager.WakeLock f29942Oooo0o = null;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final Object f29950OoooOOO = new Object();

    public static class OooO00o implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @NonNull
        public OooOOOO f29952Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        @NonNull
        public String f29953Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        @NonNull
        public OooO0OO<Boolean> f29954Oooo0oo;

        public OooO00o(@NonNull OooOOOO oooOOOO, @NonNull String str, @NonNull OooO0OO<Boolean> oooO0OO) {
            this.f29952Oooo0o = oooOOOO;
            this.f29953Oooo0oO = str;
            this.f29954Oooo0oo = oooO0OO;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zBooleanValue;
            try {
                zBooleanValue = this.f29954Oooo0oo.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                zBooleanValue = true;
            }
            this.f29952Oooo0o.OooO0Oo(this.f29953Oooo0oO, zBooleanValue);
        }
    }

    public OooOo(@NonNull Context context, @NonNull androidx.work.OooO00o oooO00o, @NonNull o00O000.OooO00o oooO00o2, @NonNull WorkDatabase workDatabase, @NonNull List<Oooo000> list) {
        this.f29943Oooo0oO = context;
        this.f29944Oooo0oo = oooO00o;
        this.f29941Oooo = oooO00o2;
        this.f29947OoooO00 = workDatabase;
        this.f29945OoooO = list;
    }

    public static boolean OooO0O0(@NonNull String str, @Nullable o0Oo0oo o0oo0oo2) {
        boolean zIsDone;
        if (o0oo0oo2 == null) {
            o0OoOo0.OooO0OO().OooO00o(f29940OoooOOo, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
            return false;
        }
        o0oo0oo2.f30003OooooOO = true;
        o0oo0oo2.OooO();
        OooO0OO<ListenableWorker.OooO00o> oooO0OO = o0oo0oo2.f30002OooooO0;
        if (oooO0OO != null) {
            zIsDone = oooO0OO.isDone();
            o0oo0oo2.f30002OooooO0.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = o0oo0oo2.f29991OoooO0;
        if (listenableWorker == null || zIsDone) {
            o0OoOo0.OooO0OO().OooO00o(o0Oo0oo.f29985OooooOo, String.format("WorkSpec %s is already done. Not interrupting.", o0oo0oo2.f29992OoooO00), new Throwable[0]);
        } else {
            listenableWorker.f9729Oooo0oo = true;
            listenableWorker.OooO0Oo();
        }
        o0OoOo0.OooO0OO().OooO00o(f29940OoooOOo, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.HashMap, java.util.Map<java.lang.String, o000ooO0.o0Oo0oo>] */
    public final boolean OooO(@NonNull String str) {
        boolean zOooO0O0;
        synchronized (this.f29950OoooOOO) {
            o0OoOo0.OooO0OO().OooO00o(f29940OoooOOo, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            zOooO0O0 = OooO0O0(str, (o0Oo0oo) this.f29946OoooO0.remove(str));
        }
        return zOooO0O0;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<o000ooO0.OooOOOO>] */
    public final void OooO00o(@NonNull OooOOOO oooOOOO) {
        synchronized (this.f29950OoooOOO) {
            this.f29951o000oOoO.add(oooOOOO);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, o000ooO0.o0Oo0oo>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.HashMap, java.util.Map<java.lang.String, o000ooO0.o0Oo0oo>] */
    public final boolean OooO0OO(@NonNull String str) {
        boolean z;
        synchronized (this.f29950OoooOOO) {
            z = this.f29948OoooO0O.containsKey(str) || this.f29946OoooO0.containsKey(str);
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, o000ooO0.o0Oo0oo>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<o000ooO0.OooOOOO>] */
    @Override // p107o000ooO0.OooOOOO
    public final void OooO0Oo(@NonNull String str, boolean z) {
        synchronized (this.f29950OoooOOO) {
            this.f29948OoooO0O.remove(str);
            o0OoOo0.OooO0OO().OooO00o(f29940OoooOOo, String.format("%s %s executed; reschedule = %s", OooOo.class.getSimpleName(), str, Boolean.valueOf(z)), new Throwable[0]);
            Iterator it = this.f29951o000oOoO.iterator();
            while (it.hasNext()) {
                ((OooOOOO) it.next()).OooO0Oo(str, z);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.HashMap, java.util.Map<java.lang.String, o000ooO0.o0Oo0oo>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.HashMap, java.util.Map<java.lang.String, o000ooO0.o0Oo0oo>] */
    public final void OooO0o(@NonNull String str, @NonNull OooOOO oooOOO) {
        synchronized (this.f29950OoooOOO) {
            o0OoOo0.OooO0OO().OooO0Oo(f29940OoooOOo, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
            o0Oo0oo o0oo0oo2 = (o0Oo0oo) this.f29948OoooO0O.remove(str);
            if (o0oo0oo2 != null) {
                if (this.f29942Oooo0o == null) {
                    PowerManager.WakeLock wakeLockOooO00o = o00O0.OooO00o(this.f29943Oooo0oO, "ProcessorForegroundLck");
                    this.f29942Oooo0o = wakeLockOooO00o;
                    wakeLockOooO00o.acquire();
                }
                this.f29946OoooO0.put(str, o0oo0oo2);
                Intent intentOooO0OO = androidx.work.impl.foreground.OooO00o.OooO0OO(this.f29943Oooo0oO, str, oooOOO);
                Context context = this.f29943Oooo0oO;
                Object obj = o000O000.OooO00o.f28085OooO00o;
                if (Build.VERSION.SDK_INT >= 26) {
                    o000O000.OooO00o.OooOO0.OooO00o(context, intentOooO0OO);
                } else {
                    context.startService(intentOooO0OO);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<o000ooO0.OooOOOO>] */
    public final void OooO0o0(@NonNull OooOOOO oooOOOO) {
        synchronized (this.f29950OoooOOO) {
            this.f29951o000oOoO.remove(oooOOOO);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.HashMap, java.util.Map<java.lang.String, o000ooO0.o0Oo0oo>] */
    public final boolean OooO0oO(@NonNull String str, @Nullable WorkerParameters.OooO00o oooO00o) {
        synchronized (this.f29950OoooOOO) {
            if (OooO0OO(str)) {
                o0OoOo0.OooO0OO().OooO00o(f29940OoooOOo, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                return false;
            }
            o0Oo0oo.OooO00o oooO00o2 = new o0Oo0oo.OooO00o(this.f29943Oooo0oO, this.f29944Oooo0oo, this.f29941Oooo, this, this.f29947OoooO00, str);
            oooO00o2.f30011OooO0oO = this.f29945OoooO;
            if (oooO00o != null) {
                oooO00o2.f30012OooO0oo = oooO00o;
            }
            o0Oo0oo o0oo0oo2 = new o0Oo0oo(oooO00o2);
            o00OOOO0<Boolean> o00oooo1 = o0oo0oo2.f30001Ooooo0o;
            o00oooo1.OooO00o(new OooO00o(this, str, o00oooo1), ((OooO0O0) this.f29941Oooo).f30116OooO0OO);
            this.f29948OoooO0O.put(str, o0oo0oo2);
            ((OooO0O0) this.f29941Oooo).f30114OooO00o.execute(o0oo0oo2);
            o0OoOo0.OooO0OO().OooO00o(f29940OoooOOo, String.format("%s: processing %s", OooOo.class.getSimpleName(), str), new Throwable[0]);
            return true;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.HashMap, java.util.Map<java.lang.String, o000ooO0.o0Oo0oo>] */
    public final void OooO0oo() {
        synchronized (this.f29950OoooOOO) {
            if (!(!this.f29946OoooO0.isEmpty())) {
                Context context = this.f29943Oooo0oO;
                String str = androidx.work.impl.foreground.OooO00o.f9824OoooOOO;
                Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                try {
                    this.f29943Oooo0oO.startService(intent);
                } catch (Throwable th) {
                    o0OoOo0.OooO0OO().OooO0O0(f29940OoooOOo, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = this.f29942Oooo0o;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f29942Oooo0o = null;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.HashMap, java.util.Map<java.lang.String, o000ooO0.o0Oo0oo>] */
    public final boolean OooOO0(@NonNull String str) {
        boolean zOooO0O0;
        synchronized (this.f29950OoooOOO) {
            o0OoOo0.OooO0OO().OooO00o(f29940OoooOOo, String.format("Processor stopping background work %s", str), new Throwable[0]);
            zOooO0O0 = OooO0O0(str, (o0Oo0oo) this.f29948OoooO0O.remove(str));
        }
        return zOooO0O0;
    }
}
