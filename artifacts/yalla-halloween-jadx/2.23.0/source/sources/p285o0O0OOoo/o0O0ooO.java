package p285o0O0OOoo;

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
import com.google.firebase.crashlytics.internal.model.OooOo;
import com.google.firebase.crashlytics.internal.model.Oooo0;
import com.google.firebase.crashlytics.internal.model.Oooo000;
import com.google.firebase.crashlytics.internal.model.o00O0O;
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
import o0O0Oooo.o00O0OO0.OooO00o;
import oo0OOoo.OooO00o;
import oo0OOoo.OooO0o;
import p190o00o0O00.OooO;
import p191o00o0O0O.o000000;
import p286o0O0Oo.OooOOOO;
import p286o0O0Oo.OooOo00;
import p287o0O0Oo0.OooOO0;
import p288o0O0Oo0O.OooOOO;
import p291o0O0OoO0.o00000O0;
import p296o0O0Oooo.o00O0O0;
import p296o0O0Oooo.o00O0OO0;
import p461o0OooO0.o00000;
import p461o0OooO0.o0000oo;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0ooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000oo f42210OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOOO f42211OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00O0O0 f42212OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00000 f42213OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0000oo f42214OooO0o0;

    public o0O0ooO(o0000oo o0000ooVar, OooOOOO oooOOOO, o00O0O0 o00o0o0, o00000 o00000Var, o0000oo o0000ooVar2) {
        this.f42210OooO00o = o0000ooVar;
        this.f42211OooO0O0 = oooOOOO;
        this.f42212OooO0OO = o00o0o0;
        this.f42213OooO0Oo = o00000Var;
        this.f42214OooO0o0 = o0000ooVar2;
    }

    public static OooOo OooO00o(OooOo oooOo, o00000 o00000Var, o0000oo o0000ooVar) {
        OooOo.OooO00o oooO00o = new OooOo.OooO00o(oooOo);
        String strOooO0O0 = o00000Var.f46624OooO0O0.OooO0O0();
        if (strOooO0O0 != null) {
            oooO00o.f20067OooO0o0 = new o00oO0o(strOooO0O0);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        ArrayList arrayListOooO0OO = OooO0OO(o0000ooVar.f46653OooO0Oo.f46656OooO00o.getReference().OooO00o());
        ArrayList arrayListOooO0OO2 = OooO0OO(o0000ooVar.f46655OooO0o0.f46656OooO00o.getReference().OooO00o());
        if (!arrayListOooO0OO.isEmpty() || !arrayListOooO0OO2.isEmpty()) {
            Oooo000.OooO00o oooO00oOooO0o = oooOo.f20060OooO0OO.OooO0o();
            oooO00oOooO0o.f20097OooO0O0 = new OooOO0<>(arrayListOooO0OO);
            oooO00oOooO0o.f20098OooO0OO = new OooOO0<>(arrayListOooO0OO2);
            oooO00o.f20065OooO0OO = oooO00oOooO0o.OooO00o();
        }
        return oooO00o.OooO00o();
    }

    public static o0O0ooO OooO0O0(Context context, o000O000 o000o001, OooOo00 oooOo00, OooOOOO oooOOOO, o00000 o00000Var, o0000oo o0000ooVar, OooO00o oooO00o, o00000O0 o00000o1, o000O00 o000o01) {
        o0000oo o0000ooVar2 = new o0000oo(context, o000o001, oooOOOO, oooO00o, o00000o1);
        OooOOOO oooOOOO2 = new OooOOOO(oooOo00, o00000o1);
        OooOOO oooOOO = o00O0O0.f42326OooO0O0;
        o000000.OooO0O0(context);
        return new o0O0ooO(o0000ooVar2, oooOOOO2, new o00O0O0(new o00O0OO0(o000000.OooO00o().OooO0OO(new OooO(o00O0O0.f42327OooO0OO, o00O0O0.f42328OooO0Oo)).OooO00o("FIREBASE_CRASHLYTICS_REPORT", new p176o00o0.OooOo("json"), o00O0O0.f42329OooO0o0), o00000o1.OooO0O0(), o000o01)), o00000Var, o0000ooVar);
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
        Collections.sort(arrayList, new o00());
        return arrayList;
    }

    public final void OooO0Oo(@NonNull Throwable th, @NonNull Thread thread, @NonNull String str, @NonNull String str2, long j, boolean z) {
        ActivityManager.RunningAppProcessInfo next;
        Thread thread2 = thread;
        boolean zEquals = str2.equals(AppMeasurement.CRASH_ORIGIN);
        o0000oo o0000ooVar = this.f42210OooO00o;
        Context context = o0000ooVar.f42154OooO00o;
        int i = context.getResources().getConfiguration().orientation;
        String localizedMessage = th.getLocalizedMessage();
        String name = th.getClass().getName();
        StackTraceElement[] stackTrace = th.getStackTrace();
        OooO0o oooO0o = o0000ooVar.f42157OooO0Oo;
        StackTraceElement[] stackTraceElementArrOooO00o = oooO0o.OooO00o(stackTrace);
        Throwable cause = th.getCause();
        oo0OOoo.OooO oooO = cause != null ? new oo0OOoo.OooO(cause, oooO0o) : null;
        OooOo.OooO00o oooO00o = new OooOo.OooO00o();
        oooO00o.f20064OooO0O0 = str2;
        oooO00o.f20063OooO00o = Long.valueOf(j);
        String str3 = o0000ooVar.f42156OooO0OO.f42098OooO0o0;
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
        arrayList.add(o0000oo.OooO0o0(thread2, stackTraceElementArrOooO00o, 4));
        if (z) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread2)) {
                    arrayList.add(o0000oo.OooO0o0(key, oooO0o.OooO00o(entry.getValue()), 0));
                }
                thread2 = thread;
            }
        }
        OooOO0 oooOO1 = new OooOO0(arrayList);
        if (stackTraceElementArrOooO00o == null) {
            stackTraceElementArrOooO00o = new StackTraceElement[0];
        }
        OooOO0 oooOO2 = new OooOO0(o0000oo.OooO0Oo(stackTraceElementArrOooO00o, 4));
        Integer num = 0;
        o0OoOo0 o0oooo0OooO0OO = oooO != null ? o0000oo.OooO0OO(oooO, 1) : null;
        String strOooO00o = num == null ? androidx.camera.core.impl.OooOOOO.OooO00o("", " overflowCount") : "";
        if (!strOooO00o.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
        }
        o0OoOo0 o0oooo0 = new o0OoOo0(name, localizedMessage, oooOO2, o0oooo0OooO0OO, num.intValue());
        Long l = 0L;
        String str4 = l == null ? " address" : "";
        if (!str4.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(str4));
        }
        Oooo0 oooo0 = new Oooo0(oooOO1, o0oooo0, null, new o00O0O(AppEventsConstants.EVENT_PARAM_VALUE_NO, AppEventsConstants.EVENT_PARAM_VALUE_NO, l.longValue()), o0000ooVar.OooO00o());
        String strConcat = numValueOf == null ? "".concat(" uiOrientation") : "";
        if (!strConcat.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }
        oooO00o.f20065OooO0OO = new Oooo000(oooo0, null, null, boolValueOf, numValueOf.intValue());
        oooO00o.f20066OooO0Oo = o0000ooVar.OooO0O0(i);
        this.f42211OooO0O0.OooO0OO(OooO00o(oooO00o.OooO00o(), this.f42213OooO0Oo, this.f42214OooO0o0), str, zEquals);
    }

    public final Task OooO0o0(@Nullable String str, @NonNull Executor executor) {
        TaskCompletionSource<o0000O0> taskCompletionSource;
        ArrayList<File> arrayListOooO0O0 = this.f42211OooO0O0.OooO0O0();
        ArrayList<o0000O0> arrayList = new ArrayList();
        for (File file : arrayListOooO0O0) {
            try {
                OooOOO oooOOO = OooOOOO.f42234OooO0o;
                String strOooO0Oo = OooOOOO.OooO0Oo(file);
                oooOOO.getClass();
                arrayList.add(new OooOo00(OooOOO.OooO0oo(strOooO0Oo), file.getName(), file));
            } catch (IOException e) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (o0000O0 o0000o1 : arrayList) {
            if (str == null || str.equals(o0000o1.OooO0OO())) {
                o00O0O0 o00o0o0 = this.f42212OooO0OO;
                boolean z = true;
                boolean z2 = str != null;
                o00O0OO0 o00o0oo1 = o00o0o0.f42330OooO00o;
                synchronized (o00o0oo1.f42340OooO0o) {
                    taskCompletionSource = new TaskCompletionSource<>();
                    if (z2) {
                        o00o0oo1.f42335OooO.f42159OooO00o.getAndIncrement();
                        if (o00o0oo1.f42340OooO0o.size() >= o00o0oo1.f42341OooO0o0) {
                            z = false;
                        }
                        if (z) {
                            o0O0OOOo.OooO oooO = o0O0OOOo.OooO.f42075OooO00o;
                            oooO.OooO0O0("Enqueueing report: " + o0000o1.OooO0OO());
                            oooO.OooO0O0("Queue size: " + o00o0oo1.f42340OooO0o.size());
                            o00o0oo1.f42342OooO0oO.execute(o00o0oo1.new OooO00o(o0000o1, taskCompletionSource));
                            oooO.OooO0O0("Closing task for report: " + o0000o1.OooO0OO());
                            taskCompletionSource.trySetResult(o0000o1);
                        } else {
                            o00o0oo1.OooO00o();
                            String str2 = "Dropping report due to queue being full: " + o0000o1.OooO0OO();
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str2, null);
                            }
                            o00o0oo1.f42335OooO.f42160OooO0O0.getAndIncrement();
                            taskCompletionSource.trySetResult(o0000o1);
                        }
                    } else {
                        o00o0oo1.OooO0O0(o0000o1, taskCompletionSource);
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new o00O0000(this)));
            }
        }
        return Tasks.whenAll(arrayList2);
    }
}
