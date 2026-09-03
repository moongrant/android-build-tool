package p289o0O0Oo0;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.model.Oooo0;
import com.google.firebase.crashlytics.internal.model.Oooo000;
import com.google.firebase.crashlytics.internal.model.o00oO0o;
import com.google.firebase.crashlytics.internal.model.o0OoOo0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import oo0OOoo.OooO00o;
import oo0OOoo.OooO0OO;
import oo0OOoo.OooO0OO.OooO00o;
import p233o00oOoOO.o0OoOoOo;
import p234o00oOoOo.o0O00O;
import p238o00oOooo.o0OOooO0;
import p286o0O0OOoO.o0OOO0o;
import p288o0O0Oo.OooO0O0;
import p290o0O0Oo0O.OooO;
import p290o0O0Oo0O.OooOo;
import p291o0O0Oo0o.o00O0O;
import p292o0O0OoO.o00Ooo;
import p293o0O0OoO0.OooOOOO;
import p293o0O0OoO0.OooOo00;
import p294o0O0OoOo.o00000;
import p294o0O0OoOo.o00000OO;
import p294o0O0OoOo.o0000Ooo;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000000 f41518OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOOO f41519OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f41520OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO f41521OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOo f41522OooO0o0;

    public o000O00(o000000 o000000Var, OooOOOO oooOOOO, OooO00o oooO00o, OooO oooO, OooOo oooOo) {
        this.f41518OooO00o = o000000Var;
        this.f41519OooO0O0 = oooOOOO;
        this.f41520OooO0OO = oooO00o;
        this.f41521OooO0Oo = oooO;
        this.f41522OooO0o0 = oooOo;
    }

    public static com.google.firebase.crashlytics.internal.model.OooOo OooO00o(com.google.firebase.crashlytics.internal.model.OooOo oooOo, OooO oooO, OooOo oooOo2) {
        com.google.firebase.crashlytics.internal.model.OooOo.OooO00o oooO00o = new com.google.firebase.crashlytics.internal.model.OooOo.OooO00o(oooOo);
        String strOooO0O0 = oooO.f41594OooO0O0.OooO0O0();
        if (strOooO0O0 != null) {
            oooO00o.f19595OooO0o0 = new o00oO0o(strOooO0O0);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        ArrayList arrayListOooO0OO = OooO0OO(oooOo2.f41623OooO0Oo.f41626OooO00o.getReference().OooO00o());
        ArrayList arrayListOooO0OO2 = OooO0OO(oooOo2.f41625OooO0o0.f41626OooO00o.getReference().OooO00o());
        if (!arrayListOooO0OO.isEmpty() || !arrayListOooO0OO2.isEmpty()) {
            Oooo000.OooO00o oooO00oOooO0o = oooOo.f19588OooO0OO.OooO0o();
            oooO00oOooO0o.f19625OooO0O0 = new o00O0O<>(arrayListOooO0OO);
            oooO00oOooO0o.f19626OooO0OO = new o00O0O<>(arrayListOooO0OO2);
            oooO00o.f19593OooO0OO = oooO00oOooO0o.OooO00o();
        }
        return oooO00o.OooO00o();
    }

    public static o000O00 OooO0O0(Context context, o0000 o0000Var, OooOo00 oooOo00, OooO0O0 oooO0O0, OooO oooO, OooOo oooOo, o00000 o00000Var, o00Ooo o00ooo2, o0000oo o0000ooVar) {
        o000000 o000000Var = new o000000(context, o0000Var, oooO0O0, o00000Var, o00ooo2);
        OooOOOO oooOOOO = new OooOOOO(oooOo00, o00ooo2);
        OooO0O0 oooO0O1 = OooO00o.f60310OooO0O0;
        o0OOooO0.OooO0O0(context);
        return new o000O00(o000000Var, oooOOOO, new OooO00o(new OooO0OO(o0OOooO0.OooO00o().OooO0OO(new o0O00O(OooO00o.f60311OooO0OO, OooO00o.f60312OooO0Oo)).OooO00o("FIREBASE_CRASHLYTICS_REPORT", new o0OoOoOo("json"), OooO00o.f60313OooO0o0), o00ooo2.OooO0O0(), o0000ooVar)), oooO, oooOo);
    }

    @NonNull
    public static ArrayList OooO0OO(@NonNull Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                throw new NullPointerException("Null value");
            }
            arrayList.add(new com.google.firebase.crashlytics.internal.model.OooO(str, str2));
        }
        Collections.sort(arrayList, new o000O0o());
        return arrayList;
    }

    public final void OooO0Oo(@NonNull Throwable th, @NonNull Thread thread, @NonNull String str, @NonNull String str2, long j, boolean z) {
        ActivityManager.RunningAppProcessInfo next;
        Thread thread2 = thread;
        boolean zEquals = str2.equals(AppMeasurement.CRASH_ORIGIN);
        o000000 o000000Var = this.f41518OooO00o;
        Context context = o000000Var.f41496OooO00o;
        int i = context.getResources().getConfiguration().orientation;
        String localizedMessage = th.getLocalizedMessage();
        String name = th.getClass().getName();
        StackTraceElement[] stackTrace = th.getStackTrace();
        o00000OO o00000oo2 = o000000Var.f41499OooO0Oo;
        StackTraceElement[] stackTraceElementArrOooO00o = o00000oo2.OooO00o(stackTrace);
        Throwable cause = th.getCause();
        o0000Ooo o0000ooo = cause != null ? new o0000Ooo(cause, o00000oo2) : null;
        com.google.firebase.crashlytics.internal.model.OooOo.OooO00o oooO00o = new com.google.firebase.crashlytics.internal.model.OooOo.OooO00o();
        oooO00o.f19592OooO0O0 = str2;
        oooO00o.f19591OooO00o = Long.valueOf(j);
        String str3 = o000000Var.f41498OooO0OO.f41460OooO0o0;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
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
        } while (!next.processName.equals(str3));
        Boolean boolValueOf = next != null ? Boolean.valueOf(next.importance != 100) : null;
        Integer numValueOf = Integer.valueOf(i);
        ArrayList arrayList = new ArrayList();
        arrayList.add(o000000.OooO0o0(thread2, stackTraceElementArrOooO00o, 4));
        if (z) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread2)) {
                    arrayList.add(o000000.OooO0o0(key, o00000oo2.OooO00o(entry.getValue()), 0));
                }
                thread2 = thread;
            }
        }
        o00O0O o00o0o2 = new o00O0O(arrayList);
        if (stackTraceElementArrOooO00o == null) {
            stackTraceElementArrOooO00o = new StackTraceElement[0];
        }
        o00O0O o00o0o3 = new o00O0O(o000000.OooO0Oo(stackTraceElementArrOooO00o, 4));
        Integer num = 0;
        o0OoOo0 o0oooo0OooO0OO = o0000ooo != null ? o000000.OooO0OO(o0000ooo, 1) : null;
        String strOooO00o = num == null ? androidx.camera.core.impl.OooOOOO.OooO00o("", " overflowCount") : "";
        if (!strOooO00o.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
        }
        o0OoOo0 o0oooo1 = new o0OoOo0(name, localizedMessage, o00o0o3, o0oooo0OooO0OO, num.intValue());
        Long l = 0L;
        String str4 = l == null ? " address" : "";
        if (!str4.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(str4));
        }
        Oooo0 oooo0 = new Oooo0(o00o0o2, o0oooo1, null, new com.google.firebase.crashlytics.internal.model.o00O0O(AppEventsConstants.EVENT_PARAM_VALUE_NO, AppEventsConstants.EVENT_PARAM_VALUE_NO, l.longValue()), o000000Var.OooO00o());
        String strConcat = numValueOf == null ? "".concat(" uiOrientation") : "";
        if (!strConcat.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }
        oooO00o.f19593OooO0OO = new Oooo000(oooo0, null, null, boolValueOf, numValueOf.intValue());
        oooO00o.f19594OooO0Oo = o000000Var.OooO0O0(i);
        this.f41519OooO0O0.OooO0OO(OooO00o(oooO00o.OooO00o(), this.f41521OooO0Oo, this.f41522OooO0o0), str, zEquals);
    }

    public final Task OooO0o0(@Nullable String str, @NonNull Executor executor) {
        TaskCompletionSource<o000000O> taskCompletionSource;
        ArrayList<File> arrayListOooO0O0 = this.f41519OooO0O0.OooO0O0();
        ArrayList<o000000O> arrayList = new ArrayList();
        for (File file : arrayListOooO0O0) {
            try {
                OooO0O0 oooO0O0 = OooOOOO.f41687OooO0o;
                String strOooO0Oo = OooOOOO.OooO0Oo(file);
                oooO0O0.getClass();
                arrayList.add(new OooO0OO(OooO0O0.OooO0oo(strOooO0Oo), file.getName(), file));
            } catch (IOException e) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (o000000O o000000o2 : arrayList) {
            if (str == null || str.equals(o000000o2.OooO0OO())) {
                OooO00o oooO00o = this.f41520OooO0OO;
                boolean z = true;
                boolean z2 = str != null;
                OooO0OO oooO0OO = oooO00o.f60314OooO00o;
                synchronized (oooO0OO.f60324OooO0o) {
                    taskCompletionSource = new TaskCompletionSource<>();
                    if (z2) {
                        oooO0OO.f60319OooO.f41514OooO00o.getAndIncrement();
                        if (oooO0OO.f60324OooO0o.size() >= oooO0OO.f60325OooO0o0) {
                            z = false;
                        }
                        if (z) {
                            o0OOO0o o0ooo0o2 = o0OOO0o.f41436OooO00o;
                            o0ooo0o2.OooO0O0("Enqueueing report: " + o000000o2.OooO0OO());
                            o0ooo0o2.OooO0O0("Queue size: " + oooO0OO.f60324OooO0o.size());
                            oooO0OO.f60326OooO0oO.execute(oooO0OO.new OooO00o(o000000o2, taskCompletionSource));
                            o0ooo0o2.OooO0O0("Closing task for report: " + o000000o2.OooO0OO());
                            taskCompletionSource.trySetResult(o000000o2);
                        } else {
                            oooO0OO.OooO00o();
                            String str2 = "Dropping report due to queue being full: " + o000000o2.OooO0OO();
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str2, null);
                            }
                            oooO0OO.f60319OooO.f41515OooO0O0.getAndIncrement();
                            taskCompletionSource.trySetResult(o000000o2);
                        }
                    } else {
                        oooO0OO.OooO0O0(o000000o2, taskCompletionSource);
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new o000Oo0(this)));
            }
        }
        return Tasks.whenAll(arrayList2);
    }
}
