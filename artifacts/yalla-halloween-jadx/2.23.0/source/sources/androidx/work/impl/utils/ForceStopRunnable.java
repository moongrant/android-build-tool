package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.os.BuildCompat;
import androidx.core.view.o0O0000O;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.OooO00o;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import o000O.OooO0O0;
import p084o000Ooo0.o000oOoO;
import p085o000OooO.o00Ooo;
import p085o000OooO.o0OOO0o;
import p087o000o00.o000O0o;
import p091o000o0O.OooOo;
import p091o000o0O.Oooo0;
import p091o000o0O.o00O0O;
import p091o000o0O.o0OO00O;
import p091o000o0O.o0Oo0oo;
import p091o000o0O.o0ooOOo;
import p091o000o0O.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ForceStopRunnable implements Runnable {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final String f8483OooO0oO = o000oOoO.OooO0o0("ForceStopRunnable");

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final long f8484OooO0oo = TimeUnit.DAYS.toMillis(3650);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f8485OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f8486OooO0o = 0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0OOO0o f8487OooO0o0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final String f8488OooO00o = o000oOoO.OooO0o0("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public final void onReceive(@NonNull Context context, @Nullable Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            if (((o000oOoO.OooO00o) o000oOoO.OooO0OO()).f35110OooO0O0 <= 2) {
                Log.v(f8488OooO00o, "Rescheduling alarm that keeps track of force-stops.");
            }
            ForceStopRunnable.OooO0OO(context);
        }
    }

    public ForceStopRunnable(@NonNull Context context, @NonNull o0OOO0o o0ooo0o2) {
        this.f8485OooO0Oo = context.getApplicationContext();
        this.f8487OooO0o0 = o0ooo0o2;
    }

    @SuppressLint({"ClassVerificationFailure"})
    public static void OooO0OO(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = BuildCompat.OooO0O0() ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + f8484OooO0oo;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0086  */
    @VisibleForTesting
    public final void OooO00o() {
        int i;
        boolean z;
        boolean z2;
        String string;
        String str = o000O0o.f35215OooO0oo;
        Context context = this.f8485OooO0Oo;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList<JobInfo> arrayListOooO0o = o000O0o.OooO0o(context, jobScheduler);
        o0OOO0o o0ooo0o2 = this.f8487OooO0o0;
        o00O0O o00o0o2 = (o00O0O) o0ooo0o2.f35160OooO0OO.OooOOo0();
        o00o0o2.getClass();
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        RoomDatabase roomDatabase = o00o0o2.f35251OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            ArrayList arrayList = new ArrayList(cursorOooO0O0.getCount());
            while (cursorOooO0O0.moveToNext()) {
                arrayList.add(cursorOooO0O0.getString(0));
            }
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
            HashSet hashSet = new HashSet(arrayListOooO0o != null ? arrayListOooO0o.size() : 0);
            if (arrayListOooO0o != null && !arrayListOooO0o.isEmpty()) {
                for (JobInfo jobInfo : arrayListOooO0o) {
                    PersistableBundle extras = jobInfo.getExtras();
                    if (extras != null) {
                        try {
                            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                                string = extras.getString("EXTRA_WORK_SPEC_ID");
                            } else {
                                string = null;
                            }
                        } catch (NullPointerException unused) {
                        }
                    } else {
                        string = null;
                    }
                    if (TextUtils.isEmpty(string)) {
                        o000O0o.OooO0O0(jobScheduler, jobInfo.getId());
                    } else {
                        hashSet.add(string);
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                i = 1;
                if (it.hasNext()) {
                    if (!hashSet.contains((String) it.next())) {
                        o000oOoO.OooO0OO().OooO00o(o000O0o.f35215OooO0oo, "Reconciling jobs", new Throwable[0]);
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                WorkDatabase workDatabase = o0ooo0o2.f35160OooO0OO;
                workDatabase.OooO0OO();
                try {
                    o0OO00O o0oo00oOooOo00 = workDatabase.OooOo00();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((oo0o0Oo) o0oo00oOooOo00).OooOO0(-1L, (String) it2.next());
                    }
                    workDatabase.OooOOO0();
                    workDatabase.OooOO0();
                } catch (Throwable th) {
                    workDatabase.OooOO0();
                    throw th;
                }
            }
            WorkDatabase workDatabase2 = o0ooo0o2.f35160OooO0OO;
            o0OO00O o0oo00oOooOo01 = workDatabase2.OooOo00();
            o0ooOOo o0oooooOooOOoo = workDatabase2.OooOOoo();
            workDatabase2.OooO0OO();
            try {
                oo0o0Oo oo0o0oo = (oo0o0Oo) o0oo00oOooOo01;
                ArrayList<o0Oo0oo> arrayListOooO0Oo = oo0o0oo.OooO0Oo();
                boolean z3 = !arrayListOooO0Oo.isEmpty();
                if (z3) {
                    for (o0Oo0oo o0oo0oo2 : arrayListOooO0Oo) {
                        WorkInfo$State workInfo$State = WorkInfo$State.ENQUEUED;
                        String[] strArr = new String[i];
                        strArr[0] = o0oo0oo2.f35262OooO00o;
                        oo0o0oo.OooOOO0(workInfo$State, strArr);
                        oo0o0oo.OooOO0(-1L, o0oo0oo2.f35262OooO00o);
                        i = 1;
                    }
                }
                p091o000o0O.o0OOO0o o0ooo0o3 = (p091o000o0O.o0OOO0o) o0oooooOooOOoo;
                RoomDatabase roomDatabase2 = o0ooo0o3.f35258OooO00o;
                roomDatabase2.OooO0O0();
                o000o0O.o0OOO0o.OooO0OO oooO0OO = o0ooo0o3.f35260OooO0OO;
                SupportSQLiteStatement supportSQLiteStatementOooO00o = oooO0OO.OooO00o();
                roomDatabase2.OooO0OO();
                try {
                    supportSQLiteStatementOooO00o.executeUpdateDelete();
                    roomDatabase2.OooOOO0();
                    roomDatabase2.OooOO0();
                    oooO0OO.OooO0OO(supportSQLiteStatementOooO00o);
                    workDatabase2.OooOOO0();
                    workDatabase2.OooOO0();
                    boolean z4 = z3 || z;
                    Long lOooO00o = ((Oooo0) o0ooo0o2.f35164OooO0oO.f35348OooO00o.OooOOOo()).OooO00o("reschedule_needed");
                    boolean z5 = lOooO00o != null && lOooO00o.longValue() == 1;
                    String str2 = f8483OooO0oO;
                    if (z5) {
                        o000oOoO.OooO0OO().OooO00o(str2, "Rescheduling Workers.", new Throwable[0]);
                        o0ooo0o2.OooO0o();
                        p093o000o0OO.o0OOO0o o0ooo0o4 = o0ooo0o2.f35164OooO0oO;
                        o0ooo0o4.getClass();
                        ((Oooo0) o0ooo0o4.f35348OooO00o.OooOOOo()).OooO0O0(new OooOo("reschedule_needed", 0L));
                        return;
                    }
                    try {
                        int i2 = BuildCompat.OooO0O0() ? 570425344 : 536870912;
                        Intent intent = new Intent();
                        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
                        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i2);
                        if (Build.VERSION.SDK_INT >= 30) {
                            if (broadcast != null) {
                                broadcast.cancel();
                            }
                            List historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                            if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                                int i3 = 0;
                                while (true) {
                                    if (i3 < historicalProcessExitReasons.size()) {
                                        if (o0O0000O.OooO00o(historicalProcessExitReasons.get(i3)).getReason() == 10) {
                                            z2 = true;
                                        } else {
                                            i3++;
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
                        z2 = true;
                        o000oOoO.OooO0OO().OooO0o(str2, "Ignoring exception", e);
                    }
                    if (z2) {
                        o000oOoO.OooO0OO().OooO00o(str2, "Application was force-stopped, rescheduling.", new Throwable[0]);
                        o0ooo0o2.OooO0o();
                    } else if (z4) {
                        o000oOoO.OooO0OO().OooO00o(str2, "Found unfinished work, scheduling it.", new Throwable[0]);
                        p085o000OooO.Oooo0.OooO00o(o0ooo0o2.f35159OooO0O0, o0ooo0o2.f35160OooO0OO, o0ooo0o2.f35163OooO0o0);
                    }
                } catch (Throwable th2) {
                    roomDatabase2.OooOO0();
                    oooO0OO.OooO0OO(supportSQLiteStatementOooO00o);
                    throw th2;
                }
            } catch (Throwable th3) {
                workDatabase2.OooOO0();
                throw th3;
            }
        } catch (Throwable th4) {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
            throw th4;
        }
    }

    @VisibleForTesting
    public final boolean OooO0O0() {
        OooO00o oooO00o = this.f8487OooO0o0.f35159OooO0O0;
        oooO00o.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = f8483OooO0oO;
        if (zIsEmpty) {
            o000oOoO.OooO0OO().OooO00o(str, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean zOooO00o = p093o000o0OO.o0OO00O.OooO00o(this.f8485OooO0Oo, oooO00o);
        o000oOoO.OooO0OO().OooO00o(str, String.format("Is default app process = %s", Boolean.valueOf(zOooO00o)), new Throwable[0]);
        return zOooO00o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = f8483OooO0oO;
        o0OOO0o o0ooo0o2 = this.f8487OooO0o0;
        try {
            if (!OooO0O0()) {
                o0ooo0o2.OooO0o0();
                return;
            }
            while (true) {
                o00Ooo.OooO00o(this.f8485OooO0Oo);
                o000oOoO.OooO0OO().OooO00o(str, "Performing cleanup operations.", new Throwable[0]);
                try {
                    OooO00o();
                    o0ooo0o2.OooO0o0();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e) {
                    int i = this.f8486OooO0o + 1;
                    this.f8486OooO0o = i;
                    if (i >= 3) {
                        o000oOoO.OooO0OO().OooO0O0(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                        o0ooo0o2.f35159OooO0O0.getClass();
                        throw illegalStateException;
                    }
                    o000oOoO.OooO0OO().OooO00o(str, String.format("Retrying after %s", Long.valueOf(((long) i) * 300)), e);
                    try {
                        Thread.sleep(((long) this.f8486OooO0o) * 300);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } catch (Throwable th) {
            o0ooo0o2.OooO0o0();
            throw th;
        }
    }
}
