package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.OooO00o;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import o00O0O0.OooOo;
import o00O0OO.OooO0o;
import o00O0OO.o00O0O;
import o00O0OO.o00Ooo;
import o00O0OO.oo000o;
import o00O0OOO.OooOO0O;
import o00O0OOO.o00Oo0;
import oo00o.o00000O0;
import oo00o.o00oO0o;
import oo00o.o0O0O00;
import p115o00O00oO.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ForceStopRunnable implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f11576OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00Oo0 f11577OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00000O0 f11578OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f11579OooO0oO = 0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String f11575OooO0oo = o0Oo0oo.OooO0o("ForceStopRunnable");

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final long f11574OooO = TimeUnit.DAYS.toMillis(3650);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final String f11580OooO00o = o0Oo0oo.OooO0o("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public final void onReceive(@NonNull Context context, @Nullable Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            if (((o0Oo0oo.OooO00o) o0Oo0oo.OooO0Oo()).f36159OooO0OO <= 2) {
                Log.v(f11580OooO00o, "Rescheduling alarm that keeps track of force-stops.");
            }
            ForceStopRunnable.OooO0OO(context);
        }
    }

    public ForceStopRunnable(@NonNull Context context, @NonNull o00000O0 o00000o1) {
        this.f11576OooO0Oo = context.getApplicationContext();
        this.f11578OooO0o0 = o00000o1;
        this.f11577OooO0o = o00000o1.f60225OooO0oO;
    }

    @SuppressLint({"ClassVerificationFailure"})
    public static void OooO0OO(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + f11574OooO;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    @VisibleForTesting
    public final void OooO00o() {
        boolean z;
        boolean z2;
        o00Oo0 o00oo1 = this.f11577OooO0o;
        String str = OooOo.f36166OooO0oo;
        Context context = this.f11576OooO0Oo;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList<JobInfo> arrayListOooO0o = OooOo.OooO0o(context, jobScheduler);
        o00000O0 o00000o1 = this.f11578OooO0o0;
        ArrayList arrayListOooO0O0 = o00000o1.f60221OooO0OO.OooOOo().OooO0O0();
        HashSet hashSet = new HashSet(arrayListOooO0o != null ? arrayListOooO0o.size() : 0);
        if (arrayListOooO0o != null && !arrayListOooO0o.isEmpty()) {
            for (JobInfo jobInfo : arrayListOooO0o) {
                o00O0OO.OooOo oooOoOooO0oO = OooOo.OooO0oO(jobInfo);
                if (oooOoOooO0oO != null) {
                    hashSet.add(oooOoOooO0oO.f36202OooO00o);
                } else {
                    OooOo.OooO0OO(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator it = arrayListOooO0O0.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains((String) it.next())) {
                    o0Oo0oo.OooO0Oo().OooO00o(OooOo.f36166OooO0oo, "Reconciling jobs");
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            WorkDatabase workDatabase = o00000o1.f60221OooO0OO;
            workDatabase.OooO0OO();
            try {
                oo000o oo000oVarOooOo0 = workDatabase.OooOo0();
                Iterator it2 = arrayListOooO0O0.iterator();
                while (it2.hasNext()) {
                    oo000oVarOooOo0.OooO0OO(-1L, (String) it2.next());
                }
                workDatabase.OooOOO();
                workDatabase.OooOO0();
            } catch (Throwable th) {
                workDatabase.OooOO0();
                throw th;
            }
        }
        WorkDatabase workDatabase2 = o00000o1.f60221OooO0OO;
        oo000o oo000oVarOooOo1 = workDatabase2.OooOo0();
        o00O0O o00o0oOooOo00 = workDatabase2.OooOo00();
        workDatabase2.OooO0OO();
        try {
            ArrayList<o00Ooo> arrayListOooOOo0 = oo000oVarOooOo1.OooOOo0();
            boolean z3 = (arrayListOooOOo0 == null || arrayListOooOOo0.isEmpty()) ? false : true;
            if (z3) {
                for (o00Ooo o00ooo2 : arrayListOooOOo0) {
                    oo000oVarOooOo1.OooOOO(WorkInfo$State.ENQUEUED, o00ooo2.f36216OooO00o);
                    oo000oVarOooOo1.OooO0OO(-1L, o00ooo2.f36216OooO00o);
                }
            }
            o00o0oOooOo00.OooO0O0();
            workDatabase2.OooOOO();
            workDatabase2.OooOO0();
            boolean z4 = z3 || z;
            Long lOooO0O0 = o00000o1.f60225OooO0oO.f36298OooO00o.OooOOo0().OooO0O0("reschedule_needed");
            boolean z5 = lOooO0O0 != null && lOooO0O0.longValue() == 1;
            String str2 = f11575OooO0oo;
            if (z5) {
                o0Oo0oo.OooO0Oo().OooO00o(str2, "Rescheduling Workers.");
                o00000o1.OooO0oO();
                o00Oo0 o00oo2 = o00000o1.f60225OooO0oO;
                o00oo2.getClass();
                Intrinsics.checkNotNullParameter("reschedule_needed", "key");
                o00oo2.f36298OooO00o.OooOOo0().OooO00o(new OooO0o("reschedule_needed", 0L));
                return;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                int i2 = i >= 31 ? 570425344 : 536870912;
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i2);
                if (i >= 30) {
                    if (broadcast != null) {
                        broadcast.cancel();
                    }
                    List historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                    if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                        Long lOooO0O1 = o00oo1.f36298OooO00o.OooOOo0().OooO0O0("last_force_stop_ms");
                        long jLongValue = lOooO0O1 != null ? lOooO0O1.longValue() : 0L;
                        int i3 = 0;
                        while (true) {
                            if (i3 < historicalProcessExitReasons.size()) {
                                ApplicationExitInfo applicationExitInfoOooO00o = OooOO0O.OooO00o(historicalProcessExitReasons.get(i3));
                                if (applicationExitInfoOooO00o.getReason() != 10 || applicationExitInfoOooO00o.getTimestamp() < jLongValue) {
                                    i3++;
                                } else {
                                    z2 = true;
                                }
                            }
                        }
                    }
                    z2 = false;
                } else if (broadcast == null) {
                    OooO0OO(context);
                    z2 = true;
                } else {
                    z2 = false;
                }
            } catch (IllegalArgumentException | SecurityException e) {
                if (((o0Oo0oo.OooO00o) o0Oo0oo.OooO0Oo()).f36159OooO0OO <= 5) {
                    Log.w(str2, "Ignoring exception", e);
                }
            }
            if (!z2) {
                if (z4) {
                    o0Oo0oo.OooO0Oo().OooO00o(str2, "Found unfinished work, scheduling it.");
                    o00oO0o.OooO00o(o00000o1.f60220OooO0O0, o00000o1.f60221OooO0OO, o00000o1.f60224OooO0o0);
                    return;
                }
                return;
            }
            o0Oo0oo.OooO0Oo().OooO00o(str2, "Application was force-stopped, rescheduling.");
            o00000o1.OooO0oO();
            long jCurrentTimeMillis = System.currentTimeMillis();
            o00oo1.getClass();
            o00oo1.f36298OooO00o.OooOOo0().OooO00o(new OooO0o("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis)));
        } catch (Throwable th2) {
            workDatabase2.OooOO0();
            throw th2;
        }
    }

    @VisibleForTesting
    public final boolean OooO0O0() {
        OooO00o oooO00o = this.f11578OooO0o0.f60220OooO0O0;
        oooO00o.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = f11575OooO0oo;
        if (zIsEmpty) {
            o0Oo0oo.OooO0Oo().OooO00o(str, "The default process name was not specified.");
            return true;
        }
        boolean zOooO00o = o00O0OOO.o00Ooo.OooO00o(this.f11576OooO0Oo, oooO00o);
        o0Oo0oo.OooO0Oo().OooO00o(str, "Is default app process = " + zOooO00o);
        return zOooO00o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = f11575OooO0oo;
        o00000O0 o00000o1 = this.f11578OooO0o0;
        try {
            if (!OooO0O0()) {
                o00000o1.OooO0o();
                return;
            }
            while (true) {
                try {
                    o0O0O00.OooO00o(this.f11576OooO0Oo);
                    o0Oo0oo.OooO0Oo().OooO00o(str, "Performing cleanup operations.");
                    try {
                        OooO00o();
                        o00000o1.OooO0o();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e) {
                        int i = this.f11579OooO0oO + 1;
                        this.f11579OooO0oO = i;
                        if (i >= 3) {
                            o0Oo0oo.OooO0Oo().OooO0OO(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                            o00000o1.f60220OooO0O0.getClass();
                            throw illegalStateException;
                        }
                        long j = ((long) i) * 300;
                        String str2 = "Retrying after " + j;
                        if (((o0Oo0oo.OooO00o) o0Oo0oo.OooO0Oo()).f36159OooO0OO <= 3) {
                            Log.d(str, str2, e);
                        }
                        try {
                            Thread.sleep(((long) this.f11579OooO0oO) * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e2) {
                    o0Oo0oo.OooO0Oo().OooO0O0(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e2);
                    o00000o1.f60220OooO0O0.getClass();
                    throw illegalStateException2;
                }
            }
        } catch (Throwable th) {
            o00000o1.OooO0o();
            throw th;
        }
    }
}
