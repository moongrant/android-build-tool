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
import android.database.Cursor;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.os.BuildCompat;
import androidx.work.OooO00o;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import o00O0000.OooO0o;
import o00O0000.OooOO0;
import o00O0000.OooOOO;
import o00O0000.Oooo0;
import o00O0000.o000oOoO;
import o00O0000.o00O0O;
import o00O0000.o00Oo0;
import p091o000o00o.o0000O0;
import p102o000oo.o0OoOo0;
import p107o000ooO0.o00oO0o;
import p110o000ooo0.oo0o0Oo;
import p326o0O0ooO.o00O00O;
import p326o0O0ooO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ForceStopRunnable implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final String f9844Oooo = o0OoOo0.OooO0o0("ForceStopRunnable");

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final long f9845OoooO00 = TimeUnit.DAYS.toMillis(3650);

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Context f9846Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final o00oO0o f9847Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f9848Oooo0oo = 0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final String f9849OooO00o = o0OoOo0.OooO0o0("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public final void onReceive(@NonNull Context context, @Nullable Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            o0OoOo0 o0oooo0OooO0OO = o0OoOo0.OooO0OO();
            String str = f9849OooO00o;
            if (((o0OoOo0.OooO00o) o0oooo0OooO0OO).f29822OooO0O0 <= 2) {
                Log.v(str, "Rescheduling alarm that keeps track of force-stops.");
            }
            ForceStopRunnable.OooO0Oo(context);
        }
    }

    public ForceStopRunnable(@NonNull Context context, @NonNull o00oO0o o00oo0o2) {
        this.f9846Oooo0o = context.getApplicationContext();
        this.f9847Oooo0oO = o00oo0o2;
    }

    public static PendingIntent OooO0O0(Context context, int i) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return PendingIntent.getBroadcast(context, -1, intent, i);
    }

    @SuppressLint({"ClassVerificationFailure"})
    public static void OooO0Oo(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent pendingIntentOooO0O0 = OooO0O0(context, BuildCompat.OooO0O0() ? 167772160 : 134217728);
        long jCurrentTimeMillis = System.currentTimeMillis() + f9845OoooO00;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentOooO0O0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:91:0x01e8 A[EDGE_INSN: B:91:0x01e8->B:96:0x01fc BREAK  A[LOOP:5: B:82:0x01c8->B:87:0x01dd]] */
    @VisibleForTesting
    public final void OooO00o() {
        boolean z;
        boolean z2 = true;
        if (Build.VERSION.SDK_INT >= 23) {
            Context context = this.f9846Oooo0o;
            o00oO0o o00oo0o2 = this.f9847Oooo0oO;
            String str = oo0o0Oo.f30031OoooO00;
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            List<JobInfo> listOooO0o = oo0o0Oo.OooO0o(context, jobScheduler);
            OooOOO oooOOO = (OooOOO) o00oo0o2.f29976OooO0OO.OooOOoo();
            Objects.requireNonNull(oooOOO);
            o0000O0 o0000o0OooO0o = o0000O0.OooO0o("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
            oooOOO.f30128OooO00o.OooO0O0();
            Cursor cursorOooOOO = oooOOO.f30128OooO00o.OooOOO(o0000o0OooO0o);
            try {
                ArrayList arrayList = new ArrayList(cursorOooOOO.getCount());
                while (cursorOooOOO.moveToNext()) {
                    arrayList.add(cursorOooOOO.getString(0));
                }
                cursorOooOOO.close();
                o0000o0OooO0o.release();
                HashSet hashSet = new HashSet(listOooO0o != null ? ((ArrayList) listOooO0o).size() : 0);
                if (listOooO0o != null) {
                    ArrayList<JobInfo> arrayList2 = (ArrayList) listOooO0o;
                    if (!arrayList2.isEmpty()) {
                        for (JobInfo jobInfo : arrayList2) {
                            String strOooO0oO = oo0o0Oo.OooO0oO(jobInfo);
                            if (TextUtils.isEmpty(strOooO0oO)) {
                                oo0o0Oo.OooO0O0(jobScheduler, jobInfo.getId());
                            } else {
                                hashSet.add(strOooO0oO);
                            }
                        }
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!hashSet.contains((String) it.next())) {
                            o0OoOo0.OooO0OO().OooO00o(oo0o0Oo.f30031OoooO00, "Reconciling jobs", new Throwable[0]);
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    WorkDatabase workDatabase = o00oo0o2.f29976OooO0OO;
                    workDatabase.OooO0OO();
                    try {
                        o00O0O o00o0oOooOo0O = workDatabase.OooOo0O();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((o00Oo0) o00o0oOooOo0O).OooOO0O((String) it2.next(), -1L);
                        }
                        workDatabase.OooOOOO();
                        workDatabase.OooOO0O();
                    } catch (Throwable th) {
                        workDatabase.OooOO0O();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                cursorOooOOO.close();
                o0000o0OooO0o.release();
                throw th2;
            }
        } else {
            z = false;
        }
        WorkDatabase workDatabase2 = this.f9847Oooo0oO.f29976OooO0OO;
        o00O0O o00o0oOooOo0O2 = workDatabase2.OooOo0O();
        Oooo0 oooo0OooOo0 = workDatabase2.OooOo0();
        workDatabase2.OooO0OO();
        try {
            o00Oo0 o00oo1 = (o00Oo0) o00o0oOooOo0O2;
            List<o00O0000.o0OoOo0> listOooO0Oo = o00oo1.OooO0Oo();
            boolean z3 = !((ArrayList) listOooO0Oo).isEmpty();
            if (z3) {
                for (o00O0000.o0OoOo0 o0oooo1 : (ArrayList) listOooO0Oo) {
                    o00oo1.OooOOOO(WorkInfo$State.ENQUEUED, o0oooo1.f30152OooO00o);
                    o00oo1.OooOO0O(o0oooo1.f30152OooO00o, -1L);
                }
            }
            ((o000oOoO) oooo0OooOo0).OooO0O0();
            workDatabase2.OooOOOO();
            workDatabase2.OooOO0O();
            boolean z4 = z3 || z;
            Long lOooO00o = ((OooOO0) this.f9847Oooo0oO.f29980OooO0oO.f36985OooO00o.OooOOo()).OooO00o("reschedule_needed");
            if (lOooO00o != null && lOooO00o.longValue() == 1) {
                o0OoOo0.OooO0OO().OooO00o(f9844Oooo, "Rescheduling Workers.", new Throwable[0]);
                this.f9847Oooo0oO.OooO0o0();
                o00O00O o00o00o2 = this.f9847Oooo0oO.f29980OooO0oO;
                Objects.requireNonNull(o00o00o2);
                ((OooOO0) o00o00o2.f36985OooO00o.OooOOo()).OooO0O0(new OooO0o());
                return;
            }
            try {
                PendingIntent pendingIntentOooO0O0 = OooO0O0(this.f9846Oooo0o, BuildCompat.OooO0O0() ? 570425344 : 536870912);
                if (Build.VERSION.SDK_INT >= 30) {
                    if (pendingIntentOooO0O0 != null) {
                        pendingIntentOooO0O0.cancel();
                    }
                    List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f9846Oooo0o.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                    if (historicalProcessExitReasons == null || historicalProcessExitReasons.isEmpty()) {
                        z2 = false;
                        break;
                    }
                    int i = 0;
                    while (true) {
                        if (i >= historicalProcessExitReasons.size()) {
                            z2 = false;
                            break;
                        } else if (historicalProcessExitReasons.get(i).getReason() == 10) {
                            break;
                        } else {
                            i++;
                        }
                    }
                } else {
                    if (pendingIntentOooO0O0 != null) {
                        z2 = false;
                        break;
                    }
                    OooO0Oo(this.f9846Oooo0o);
                }
            } catch (IllegalArgumentException | SecurityException e) {
                o0OoOo0.OooO0OO().OooO0o(f9844Oooo, "Ignoring exception", e);
            }
            if (z2) {
                o0OoOo0.OooO0OO().OooO00o(f9844Oooo, "Application was force-stopped, rescheduling.", new Throwable[0]);
                this.f9847Oooo0oO.OooO0o0();
            } else if (z4) {
                o0OoOo0.OooO0OO().OooO00o(f9844Oooo, "Found unfinished work, scheduling it.", new Throwable[0]);
                o00oO0o o00oo0o3 = this.f9847Oooo0oO;
                p107o000ooO0.Oooo0.OooO00o(o00oo0o3.f29975OooO0O0, o00oo0o3.f29976OooO0OO, o00oo0o3.f29979OooO0o0);
            }
        } catch (Throwable th3) {
            workDatabase2.OooOO0O();
            throw th3;
        }
    }

    @VisibleForTesting
    public final boolean OooO0OO() {
        OooO00o oooO00o = this.f9847Oooo0oO.f29975OooO0O0;
        Objects.requireNonNull(oooO00o);
        if (TextUtils.isEmpty(null)) {
            o0OoOo0.OooO0OO().OooO00o(f9844Oooo, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean zOooO00o = oOO00O.OooO00o(this.f9846Oooo0o, oooO00o);
        o0OoOo0.OooO0OO().OooO00o(f9844Oooo, String.format("Is default app process = %s", Boolean.valueOf(zOooO00o)), new Throwable[0]);
        return zOooO00o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!OooO0OO()) {
                this.f9847Oooo0oO.OooO0Oo();
                return;
            }
            while (true) {
                p107o000ooO0.o00Oo0.OooO00o(this.f9846Oooo0o);
                o0OoOo0.OooO0OO().OooO00o(f9844Oooo, "Performing cleanup operations.", new Throwable[0]);
                try {
                    OooO00o();
                    this.f9847Oooo0oO.OooO0Oo();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e) {
                    int i = this.f9848Oooo0oo + 1;
                    this.f9848Oooo0oo = i;
                    if (i >= 3) {
                        o0OoOo0.OooO0OO().OooO0O0(f9844Oooo, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                        Objects.requireNonNull(this.f9847Oooo0oO.f29975OooO0O0);
                        throw illegalStateException;
                    }
                    o0OoOo0.OooO0OO().OooO00o(f9844Oooo, String.format("Retrying after %s", Long.valueOf(((long) i) * 300)), e);
                    try {
                        Thread.sleep(((long) this.f9848Oooo0oo) * 300);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } catch (Throwable th) {
            this.f9847Oooo0oO.OooO0Oo();
            throw th;
        }
    }
}
