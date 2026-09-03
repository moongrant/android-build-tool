package p361o0OOOoOo;

import android.app.ActivityManager;
import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.model.OooOo;
import com.google.firebase.crashlytics.internal.model.OooOo00;
import com.google.firebase.crashlytics.internal.model.Oooo000;
import com.google.firebase.crashlytics.internal.model.o000oOoO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p366o0OOo00O.OooOO0O;
import p366o0OOo00O.OooOOOO;
import p367o0OOo00o.o00O0O;
import p367o0OOo00o.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00oO0o implements Callable<Task<Void>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ long f38486OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Throwable f38487OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Thread f38488OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOOOO f38489OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0OO00O f38490OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f38491OooO0o0 = false;

    public o00oO0o(o0OO00O o0oo00o2, long j, Throwable th, Thread thread, OooOOOO oooOOOO) {
        this.f38490OooO0o = o0oo00o2;
        this.f38486OooO00o = j;
        this.f38487OooO0O0 = th;
        this.f38488OooO0OO = thread;
        this.f38489OooO0Oo = oooOOOO;
    }

    @Override // java.util.concurrent.Callable
    public final Task<Void> call() throws Exception {
        ActivityManager.RunningAppProcessInfo next;
        long j = this.f38486OooO00o / 1000;
        String strOooO0o = this.f38490OooO0o.OooO0o();
        if (strOooO0o == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        this.f38490OooO0o.f38497OooO0OO.OooO00o();
        o000O000 o000o001 = this.f38490OooO0o.f38504OooOO0O;
        Throwable th = this.f38487OooO0O0;
        Thread thread = this.f38488OooO0OO;
        Objects.requireNonNull(o000o001);
        String str = "Persisting fatal event for session " + strOooO0o;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        o00000OO o00000oo2 = o000o001.f38460OooO00o;
        int i = o00000oo2.f38441OooO00o.getResources().getConfiguration().orientation;
        o0OoOo0 o0oooo1 = o00000oo2.f38444OooO0Oo;
        String localizedMessage = th.getLocalizedMessage();
        String name = th.getClass().getName();
        StackTraceElement[] stackTraceElementArrOooO00o = o0oooo1.OooO00o(th.getStackTrace());
        Throwable cause = th.getCause();
        o00O0O o00o0o2 = cause != null ? new o00O0O(cause, o0oooo1) : null;
        OooOo00.OooO00o oooO00o = new OooOo00.OooO00o();
        oooO00o.f19016OooO0O0 = AppMeasurement.CRASH_ORIGIN;
        oooO00o.OooO0O0(j);
        String str2 = o00000oo2.f38443OooO0OO.f38399OooO0Oo;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) o00000oo2.f38441OooO00o.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            next = null;
            break;
        }
        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!next.processName.equals(str2));
        Boolean boolValueOf = next != null ? Boolean.valueOf(next.importance != 100) : null;
        OooOo.OooO0O0 oooO0O0 = new OooOo.OooO0O0();
        oooO0O0.f19008OooO0Oo = boolValueOf;
        oooO0O0.OooO0O0(i);
        ArrayList arrayList = new ArrayList();
        arrayList.add(o00000oo2.OooO0o(thread, stackTraceElementArrOooO00o, 4));
        for (Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator(); it2.hasNext(); it2 = it2) {
            Map.Entry<Thread, StackTraceElement[]> next2 = it2.next();
            Thread key = next2.getKey();
            if (!key.equals(thread)) {
                arrayList.add(o00000oo2.OooO0o(key, o00000oo2.f38444OooO0Oo.OooO00o(next2.getValue()), 0));
            }
        }
        p362o0OOOoo.o00oO0o o00oo0o2 = new p362o0OOOoo.o00oO0o(arrayList);
        if (stackTraceElementArrOooO00o == null) {
            stackTraceElementArrOooO00o = new StackTraceElement[0];
        }
        o000oOoO.OooO0O0 oooO0O1 = new o000oOoO.OooO0O0();
        oooO0O1.f19038OooO00o = name;
        oooO0O1.f19039OooO0O0 = localizedMessage;
        oooO0O1.f19040OooO0OO = new p362o0OOOoo.o00oO0o<>(o00000oo2.OooO0Oo(stackTraceElementArrOooO00o, 4));
        oooO0O1.f19042OooO0o0 = 0;
        if (o00o0o2 != null) {
            oooO0O1.f19041OooO0Oo = o00000oo2.OooO0OO(o00o0o2, 1);
        }
        oooO0O0.f19005OooO00o = new Oooo000(o00oo0o2, oooO0O1.OooO00o(), null, o00000oo2.OooO0o0(), o00000oo2.OooO00o(), null);
        oooO00o.f19017OooO0OO = oooO0O0.OooO00o();
        oooO00o.f19018OooO0Oo = o00000oo2.OooO0O0(i);
        o000o001.f38461OooO0O0.OooO0Oo(o000o001.OooO00o(oooO00o.OooO00o(), o000o001.f38463OooO0Oo, o000o001.f38464OooO0o0), strOooO0o, true);
        this.f38490OooO0o.OooO0Oo(this.f38486OooO00o);
        this.f38490OooO0o.OooO0OO(false, this.f38489OooO0Oo);
        o0OO00O o0oo00o2 = this.f38490OooO0o;
        new Oooo000(this.f38490OooO0o.f38500OooO0o0);
        o0OO00O.OooO00o(o0oo00o2, Oooo000.f38409OooO0O0);
        if (!this.f38490OooO0o.f38496OooO0O0.OooO00o()) {
            return Tasks.forResult(null);
        }
        Executor executor = this.f38490OooO0o.f38498OooO0Oo.f38479OooO00o;
        return ((OooOO0O) this.f38489OooO0Oo).f38635OooO.get().getTask().onSuccessTask(executor, new oo000o(this, executor, strOooO0o));
    }
}
