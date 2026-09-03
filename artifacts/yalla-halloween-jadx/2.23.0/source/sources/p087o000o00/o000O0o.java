package p087o000o00;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.os.BuildCompat;
import androidx.room.RoomDatabase;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OooO00o;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p084o000Ooo0.OooO;
import p084o000Ooo0.OooOO0;
import p084o000Ooo0.o000oOoO;
import p085o000OooO.Oooo000;
import p085o000OooO.o0OOO0o;
import p091o000o0O.OooOo;
import p091o000o0O.Oooo0;
import p091o000o0O.o00O0O;
import p091o000o0O.o0Oo0oo;
import p091o000o0O.oo0o0Oo;
import p093o000o0OO.o00oO0o;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(23)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o000O0o implements Oooo000 {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String f35215OooO0oo = o000oOoO.OooO0o0("SystemJobScheduler");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f35216OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0OOO0o f35217OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final JobScheduler f35218OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o000O000 f35219OooO0oO;

    public o000O0o(@NonNull Context context, @NonNull o0OOO0o o0ooo0o2) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        o000O000 o000o001 = new o000O000(context);
        this.f35216OooO0Oo = context;
        this.f35217OooO0o = o0ooo0o2;
        this.f35218OooO0o0 = jobScheduler;
        this.f35219OooO0oO = o000o001;
    }

    public static void OooO0O0(@NonNull JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            o000oOoO.OooO0OO().OooO0O0(f35215OooO0oo, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    @Nullable
    public static ArrayList OooO0o(@NonNull Context context, @NonNull JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            o000oOoO.OooO0OO().OooO0O0(f35215OooO0oo, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    @Nullable
    public static ArrayList OooO0o0(@NonNull Context context, @NonNull JobScheduler jobScheduler, @NonNull String str) {
        String string;
        ArrayList<JobInfo> arrayListOooO0o = OooO0o(context, jobScheduler);
        if (arrayListOooO0o == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
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
            if (str.equals(string)) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    @Override // p085o000OooO.Oooo000
    public final void OooO00o(@NonNull String str) {
        Context context = this.f35216OooO0Oo;
        JobScheduler jobScheduler = this.f35218OooO0o0;
        ArrayList arrayListOooO0o0 = OooO0o0(context, jobScheduler, str);
        if (arrayListOooO0o0 == null || arrayListOooO0o0.isEmpty()) {
            return;
        }
        Iterator it = arrayListOooO0o0.iterator();
        while (it.hasNext()) {
            OooO0O0(jobScheduler, ((Integer) it.next()).intValue());
        }
        ((o00O0O) this.f35217OooO0o.f35160OooO0OO.OooOOo0()).OooO0O0(str);
    }

    @Override // p085o000OooO.Oooo000
    public final void OooO0OO(@NonNull o0Oo0oo... o0oo0ooArr) throws Throwable {
        int i;
        ArrayList arrayListOooO0o0;
        int iOooO00o;
        o0Oo0oo[] o0oo0ooArr2 = o0oo0ooArr;
        o0OOO0o o0ooo0o2 = this.f35217OooO0o;
        WorkDatabase workDatabase = o0ooo0o2.f35160OooO0OO;
        o00oO0o o00oo0o2 = new o00oO0o(workDatabase);
        int length = o0oo0ooArr2.length;
        int i2 = 0;
        int i3 = 0;
        while (i3 < length) {
            o0Oo0oo o0oo0oo2 = o0oo0ooArr2[i3];
            workDatabase.OooO0OO();
            try {
                o0Oo0oo o0oo0ooOooO0oo = ((oo0o0Oo) workDatabase.OooOo00()).OooO0oo(o0oo0oo2.f35262OooO00o);
                String str = f35215OooO0oo;
                if (o0oo0ooOooO0oo == null) {
                    o000oOoO.OooO0OO().OooO0o(str, "Skipping scheduling " + o0oo0oo2.f35262OooO00o + " because it's no longer in the DB", new Throwable[i2]);
                    workDatabase.OooOOO0();
                } else if (o0oo0ooOooO0oo.f35263OooO0O0 != WorkInfo$State.ENQUEUED) {
                    o000oOoO.OooO0OO().OooO0o(str, "Skipping scheduling " + o0oo0oo2.f35262OooO00o + " because it is no longer enqueued", new Throwable[i2]);
                    workDatabase.OooOOO0();
                } else {
                    p091o000o0O.o000oOoO o000ooooOooO00o = ((o00O0O) workDatabase.OooOOo0()).OooO00o(o0oo0oo2.f35262OooO00o);
                    if (o000ooooOooO00o == null) {
                        o0ooo0o2.f35159OooO0O0.getClass();
                        int i4 = o0ooo0o2.f35159OooO0O0.f8384OooO0oO;
                        synchronized (o00oO0o.class) {
                            try {
                                WorkDatabase workDatabase2 = o00oo0o2.f35343OooO00o;
                                workDatabase2.OooO0OO();
                                try {
                                    Long lOooO00o = ((Oooo0) workDatabase2.OooOOOo()).OooO00o("next_job_scheduler_id");
                                    int iIntValue = lOooO00o != null ? lOooO00o.intValue() : i2;
                                    try {
                                        ((Oooo0) workDatabase2.OooOOOo()).OooO0O0(new OooOo("next_job_scheduler_id", iIntValue == Integer.MAX_VALUE ? i2 : iIntValue + 1));
                                        workDatabase2.OooOOO0();
                                        try {
                                            workDatabase2.OooOO0();
                                            if (iIntValue < 0 || iIntValue > i4) {
                                                ((Oooo0) o00oo0o2.f35343OooO00o.OooOOOo()).OooO0O0(new OooOo("next_job_scheduler_id", 1));
                                                i = 0;
                                            } else {
                                                i = iIntValue;
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        workDatabase2.OooOO0();
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                        throw th;
                    }
                    i = o000ooooOooO00o.f35250OooO0O0;
                    if (o000ooooOooO00o == null) {
                        try {
                            p091o000o0O.o000oOoO o000oooo2 = new p091o000o0O.o000oOoO(o0oo0oo2.f35262OooO00o, i);
                            o00O0O o00o0o2 = (o00O0O) o0ooo0o2.f35160OooO0OO.OooOOo0();
                            RoomDatabase roomDatabase = o00o0o2.f35251OooO00o;
                            roomDatabase.OooO0O0();
                            roomDatabase.OooO0OO();
                            try {
                                o00o0o2.f35252OooO0O0.OooO0o(o000oooo2);
                                roomDatabase.OooOOO0();
                                roomDatabase.OooOO0();
                            } catch (Throwable th5) {
                                roomDatabase.OooOO0();
                                throw th5;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            workDatabase.OooOO0();
                            throw th;
                        }
                    }
                    OooO0oO(o0oo0oo2, i);
                    if (Build.VERSION.SDK_INT != 23 || (arrayListOooO0o0 = OooO0o0(this.f35216OooO0Oo, this.f35218OooO0o0, o0oo0oo2.f35262OooO00o)) == null) {
                        i2 = 0;
                    } else {
                        int iIndexOf = arrayListOooO0o0.indexOf(Integer.valueOf(i));
                        if (iIndexOf >= 0) {
                            arrayListOooO0o0.remove(iIndexOf);
                        }
                        if (arrayListOooO0o0.isEmpty()) {
                            i2 = 0;
                            o0ooo0o2.f35159OooO0O0.getClass();
                            iOooO00o = o00oo0o2.OooO00o(o0ooo0o2.f35159OooO0O0.f8384OooO0oO);
                        } else {
                            i2 = 0;
                            iOooO00o = ((Integer) arrayListOooO0o0.get(0)).intValue();
                        }
                        OooO0oO(o0oo0oo2, iOooO00o);
                    }
                    workDatabase.OooOOO0();
                }
                workDatabase.OooOO0();
                i3++;
                o0oo0ooArr2 = o0oo0ooArr;
            } catch (Throwable th7) {
                th = th7;
            }
        }
    }

    @Override // p085o000OooO.Oooo000
    public final boolean OooO0Oo() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007f  */
    @VisibleForTesting
    public final void OooO0oO(o0Oo0oo o0oo0oo2, int i) {
        int i2;
        JobScheduler jobScheduler = this.f35218OooO0o0;
        o000O000 o000o001 = this.f35219OooO0oO;
        o000o001.getClass();
        OooO oooO = o0oo0oo2.f35270OooOO0;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", o0oo0oo2.f35262OooO00o);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", o0oo0oo2.OooO0OO());
        JobInfo.Builder extras = new JobInfo.Builder(i, o000o001.f35213OooO00o).setRequiresCharging(oooO.f35084OooO0O0).setRequiresDeviceIdle(oooO.f35085OooO0OO).setExtras(persistableBundle);
        NetworkType networkType = oooO.f35083OooO00o;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30 || networkType != NetworkType.TEMPORARILY_UNMETERED) {
            int i4 = o000O000.OooO00o.f35214OooO00o[networkType.ordinal()];
            if (i4 == 1) {
                i2 = 0;
            } else if (i4 == 2) {
                i2 = 1;
            } else if (i4 == 3) {
                i2 = 2;
            } else if (i4 != 4) {
                if (i4 == 5 && i3 >= 26) {
                    i2 = 4;
                } else {
                    o000oOoO.OooO0OO().OooO00o(o000O000.f35212OooO0O0, String.format("API version too low. Cannot convert network type value %s", networkType), new Throwable[0]);
                    i2 = 1;
                }
            } else if (i3 >= 24) {
                i2 = 3;
            } else {
                o000oOoO.OooO0OO().OooO00o(o000O000.f35212OooO0O0, String.format("API version too low. Cannot convert network type value %s", networkType), new Throwable[0]);
                i2 = 1;
            }
            extras.setRequiredNetworkType(i2);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!oooO.f35085OooO0OO) {
            extras.setBackoffCriteria(o0oo0oo2.f35274OooOOO0, o0oo0oo2.f35272OooOO0o == BackoffPolicy.LINEAR ? 0 : 1);
        }
        long jMax = Math.max(o0oo0oo2.OooO00o() - System.currentTimeMillis(), 0L);
        if (i3 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!o0oo0oo2.f35278OooOOo0) {
            extras.setImportantWhileForeground(true);
        }
        if (i3 >= 24) {
            if (oooO.f35090OooO0oo.f35097OooO00o.size() > 0) {
                for (OooOO0.OooO00o oooO00o : oooO.f35090OooO0oo.f35097OooO00o) {
                    boolean z = oooO00o.f35099OooO0O0;
                    o0000OO0.OooO00o();
                    extras.addTriggerContentUri(o0000O.OooO00o(oooO00o.f35098OooO00o, z ? 1 : 0));
                }
                extras.setTriggerContentUpdateDelay(oooO.f35087OooO0o);
                extras.setTriggerContentMaxDelay(oooO.f35089OooO0oO);
            }
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(oooO.f35086OooO0Oo);
            extras.setRequiresStorageNotLow(oooO.f35088OooO0o0);
        }
        boolean z2 = o0oo0oo2.f35271OooOO0O > 0;
        boolean z3 = jMax > 0;
        if (BuildCompat.OooO0O0() && o0oo0oo2.f35278OooOOo0 && !z2 && !z3) {
            extras.setExpedited(true);
        }
        JobInfo jobInfoBuild = extras.build();
        o000oOoO o000ooooOooO0OO = o000oOoO.OooO0OO();
        Object[] objArr = {o0oo0oo2.f35262OooO00o, Integer.valueOf(i)};
        String str = f35215OooO0oo;
        o000ooooOooO0OO.OooO00o(str, String.format("Scheduling work ID %s Job ID %s", objArr), new Throwable[0]);
        try {
            if (jobScheduler.schedule(jobInfoBuild) == 0) {
                o000oOoO.OooO0OO().OooO0o(str, String.format("Unable to schedule work ID %s", o0oo0oo2.f35262OooO00o), new Throwable[0]);
                if (o0oo0oo2.f35278OooOOo0 && o0oo0oo2.f35277OooOOo == OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    o0oo0oo2.f35278OooOOo0 = false;
                    o000oOoO.OooO0OO().OooO00o(str, String.format("Scheduling a non-expedited job (work ID %s)", o0oo0oo2.f35262OooO00o), new Throwable[0]);
                    OooO0oO(o0oo0oo2, i);
                }
            }
        } catch (IllegalStateException e) {
            ArrayList arrayListOooO0o = OooO0o(this.f35216OooO0Oo, jobScheduler);
            int size = arrayListOooO0o != null ? arrayListOooO0o.size() : 0;
            Locale locale = Locale.getDefault();
            Object[] objArr2 = new Object[3];
            objArr2[0] = Integer.valueOf(size);
            o0OOO0o o0ooo0o2 = this.f35217OooO0o;
            objArr2[1] = Integer.valueOf(((oo0o0Oo) o0ooo0o2.f35160OooO0OO.OooOo00()).OooO0o0().size());
            OooO00o oooO00o2 = o0ooo0o2.f35159OooO0O0;
            int i5 = Build.VERSION.SDK_INT;
            int i6 = oooO00o2.f8385OooO0oo;
            if (i5 == 23) {
                i6 /= 2;
            }
            objArr2[2] = Integer.valueOf(i6);
            String str2 = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", objArr2);
            o000oOoO.OooO0OO().OooO0O0(str, str2, new Throwable[0]);
            throw new IllegalStateException(str2, e);
        } catch (Throwable th) {
            o000oOoO.OooO0OO().OooO0O0(str, String.format("Unable to schedule %s", o0oo0oo2), th);
        }
    }
}
