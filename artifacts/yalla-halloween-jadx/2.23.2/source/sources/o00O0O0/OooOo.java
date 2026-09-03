package o00O0O0;

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
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import o00O0OO.o00Ooo;
import o00O0OO.o0ooOOo;
import oo00o.o00000O0;
import oo00o.oo000o;
import p115o00O00oO.Oooo0;
import p115o00O00oO.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(23)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooOo implements oo000o {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String f36166OooO0oo = o0Oo0oo.OooO0o("SystemJobScheduler");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f36167OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00000O0 f36168OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final JobScheduler f36169OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooOo00 f36170OooO0oO;

    public OooOo(@NonNull Context context, @NonNull o00000O0 o00000o1) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        OooOo00 oooOo00 = new OooOo00(context);
        this.f36167OooO0Oo = context;
        this.f36168OooO0o = o00000o1;
        this.f36169OooO0o0 = jobScheduler;
        this.f36170OooO0oO = oooOo00;
    }

    public static void OooO0OO(@NonNull JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            o0Oo0oo.OooO0Oo().OooO0OO(f36166OooO0oo, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    @Nullable
    public static ArrayList OooO0Oo(@NonNull Context context, @NonNull JobScheduler jobScheduler, @NonNull String str) {
        ArrayList<JobInfo> arrayListOooO0o = OooO0o(context, jobScheduler);
        if (arrayListOooO0o == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : arrayListOooO0o) {
            o00O0OO.OooOo oooOoOooO0oO = OooO0oO(jobInfo);
            if (oooOoOooO0oO != null && str.equals(oooOoOooO0oO.f36202OooO00o)) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    @Nullable
    public static ArrayList OooO0o(@NonNull Context context, @NonNull JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            o0Oo0oo.OooO0Oo().OooO0OO(f36166OooO0oo, "getAllPendingJobs() is not reliable on this device.", th);
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

    @Nullable
    public static o00O0OO.OooOo OooO0oO(@NonNull JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new o00O0OO.OooOo(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // oo00o.oo000o
    public final void OooO00o(@NonNull o00Ooo... o00oooArr) {
        int iIntValue;
        ArrayList arrayListOooO0Oo;
        int iIntValue2;
        o00000O0 o00000o1 = this.f36168OooO0o;
        WorkDatabase workDatabase = o00000o1.f60221OooO0OO;
        final o00O0OOO.OooOo oooOo = new o00O0OOO.OooOo(workDatabase);
        for (o00Ooo o00ooo2 : o00oooArr) {
            workDatabase.OooO0OO();
            try {
                o00Ooo o00oooOooO0oo = workDatabase.OooOo0().OooO0oo(o00ooo2.f36216OooO00o);
                String str = f36166OooO0oo;
                String str2 = o00ooo2.f36216OooO00o;
                if (o00oooOooO0oo == null) {
                    o0Oo0oo.OooO0Oo().OooO0oO(str, "Skipping scheduling " + str2 + " because it's no longer in the DB");
                    workDatabase.OooOOO();
                } else if (o00oooOooO0oo.f36217OooO0O0 != WorkInfo$State.ENQUEUED) {
                    o0Oo0oo.OooO0Oo().OooO0oO(str, "Skipping scheduling " + str2 + " because it is no longer enqueued");
                    workDatabase.OooOOO();
                } else {
                    o00O0OO.OooOo generationalId = o0ooOOo.OooO00o(o00ooo2);
                    o00O0OO.OooOOO oooOOOOooO0OO = workDatabase.OooOOo().OooO0OO(generationalId);
                    WorkDatabase workDatabase2 = oooOo.f36283OooO00o;
                    if (oooOOOOooO0OO != null) {
                        iIntValue = oooOOOOooO0OO.f36201OooO0OO;
                    } else {
                        o00000o1.f60220OooO0O0.getClass();
                        final int i = o00000o1.f60220OooO0O0.f11470OooO0oO;
                        Object objOooOOO0 = workDatabase2.OooOOO0(new Callable() { // from class: o00O0OOO.OooOo00

                            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
                            public final /* synthetic */ int f36285OooO0O0 = 0;

                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                OooOo this$0 = oooOo;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                int iOooO0O0 = Oooo000.OooO0O0(this$0.f36283OooO00o, "next_job_scheduler_id");
                                int i2 = this.f36285OooO0O0;
                                if (!(i2 <= iOooO0O0 && iOooO0O0 <= i)) {
                                    this$0.f36283OooO00o.OooOOo0().OooO00o(new o00O0OO.OooO0o("next_job_scheduler_id", Long.valueOf(i2 + 1)));
                                    iOooO0O0 = i2;
                                }
                                return Integer.valueOf(iOooO0O0);
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(objOooOOO0, "workDatabase.runInTransa…            id\n        })");
                        iIntValue = ((Number) objOooOOO0).intValue();
                    }
                    if (oooOOOOooO0OO == null) {
                        Intrinsics.checkNotNullParameter(generationalId, "generationalId");
                        o00000o1.f60221OooO0OO.OooOOo().OooO0o0(new o00O0OO.OooOOO(generationalId.f36202OooO00o, generationalId.f36203OooO0O0, iIntValue));
                    }
                    OooO0oo(o00ooo2, iIntValue);
                    if (Build.VERSION.SDK_INT == 23 && (arrayListOooO0Oo = OooO0Oo(this.f36167OooO0Oo, this.f36169OooO0o0, str2)) != null) {
                        int iIndexOf = arrayListOooO0Oo.indexOf(Integer.valueOf(iIntValue));
                        if (iIndexOf >= 0) {
                            arrayListOooO0Oo.remove(iIndexOf);
                        }
                        if (arrayListOooO0Oo.isEmpty()) {
                            o00000o1.f60220OooO0O0.getClass();
                            final int i2 = o00000o1.f60220OooO0O0.f11470OooO0oO;
                            Object objOooOOO1 = workDatabase2.OooOOO0(new Callable() { // from class: o00O0OOO.OooOo00

                                /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
                                public final /* synthetic */ int f36285OooO0O0 = 0;

                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    OooOo this$0 = oooOo;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    int iOooO0O0 = Oooo000.OooO0O0(this$0.f36283OooO00o, "next_job_scheduler_id");
                                    int i3 = this.f36285OooO0O0;
                                    if (!(i3 <= iOooO0O0 && iOooO0O0 <= i2)) {
                                        this$0.f36283OooO00o.OooOOo0().OooO00o(new o00O0OO.OooO0o("next_job_scheduler_id", Long.valueOf(i3 + 1)));
                                        iOooO0O0 = i3;
                                    }
                                    return Integer.valueOf(iOooO0O0);
                                }
                            });
                            Intrinsics.checkNotNullExpressionValue(objOooOOO1, "workDatabase.runInTransa…            id\n        })");
                            iIntValue2 = ((Number) objOooOOO1).intValue();
                        } else {
                            iIntValue2 = ((Integer) arrayListOooO0Oo.get(0)).intValue();
                        }
                        OooO0oo(o00ooo2, iIntValue2);
                    }
                    workDatabase.OooOOO();
                }
                workDatabase.OooOO0();
            } catch (Throwable th) {
                workDatabase.OooOO0();
                throw th;
            }
        }
    }

    @Override // oo00o.oo000o
    public final void OooO0O0(@NonNull String str) {
        Context context = this.f36167OooO0Oo;
        JobScheduler jobScheduler = this.f36169OooO0o0;
        ArrayList arrayListOooO0Oo = OooO0Oo(context, jobScheduler, str);
        if (arrayListOooO0Oo == null || arrayListOooO0Oo.isEmpty()) {
            return;
        }
        Iterator it = arrayListOooO0Oo.iterator();
        while (it.hasNext()) {
            OooO0OO(jobScheduler, ((Integer) it.next()).intValue());
        }
        this.f36168OooO0o.f60221OooO0OO.OooOOo().OooO0Oo(str);
    }

    @Override // oo00o.oo000o
    public final boolean OooO0o0() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0115  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
    
        if (r6 >= 24) goto L24;
     */
    @VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0oo(@NonNull o00Ooo o00ooo2, int i) {
        JobScheduler jobScheduler = this.f36169OooO0o0;
        OooOo00 oooOo00 = this.f36170OooO0oO;
        oooOo00.getClass();
        Oooo0 oooo0 = o00ooo2.f36224OooOO0;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str = o00ooo2.f36216OooO00o;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", o00ooo2.f36234OooOo00);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", o00ooo2.OooO0OO());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i, oooOo00.f36172OooO00o).setRequiresCharging(oooo0.f36132OooO0O0);
        boolean z = oooo0.f36133OooO0OO;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z).setExtras(persistableBundle);
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 3;
        NetworkType networkType = oooo0.f36131OooO00o;
        if (i2 < 30 || networkType != NetworkType.TEMPORARILY_UNMETERED) {
            int i4 = OooOo00.OooO00o.f36173OooO00o[networkType.ordinal()];
            if (i4 == 1) {
                i3 = 0;
            } else if (i4 == 2) {
                i3 = 1;
            } else if (i4 == 3) {
                i3 = 2;
            } else if (i4 != 4) {
                if (i4 == 5 && i2 >= 26) {
                    i3 = 4;
                } else {
                    o0Oo0oo.OooO0Oo().OooO00o(OooOo00.f36171OooO0O0, "API version too low. Cannot convert network type value " + networkType);
                    i3 = 1;
                }
            }
            extras.setRequiredNetworkType(i3);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!z) {
            extras.setBackoffCriteria(o00ooo2.f36228OooOOO0, o00ooo2.f36226OooOO0o == BackoffPolicy.LINEAR ? 0 : 1);
        }
        long jMax = Math.max(o00ooo2.OooO00o() - System.currentTimeMillis(), 0L);
        if (i2 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!o00ooo2.f36232OooOOo0) {
            extras.setImportantWhileForeground(true);
        }
        if (i2 >= 24) {
            Set<Oooo0.OooO00o> set = oooo0.f36138OooO0oo;
            if (!set.isEmpty()) {
                for (Oooo0.OooO00o oooO00o : set) {
                    boolean z2 = oooO00o.f36140OooO0O0;
                    OooOOO.OooO00o();
                    extras.addTriggerContentUri(OooOOO0.OooO00o(oooO00o.f36139OooO00o, z2 ? 1 : 0));
                }
                extras.setTriggerContentUpdateDelay(oooo0.f36135OooO0o);
                extras.setTriggerContentMaxDelay(oooo0.f36137OooO0oO);
            }
        }
        extras.setPersisted(false);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            extras.setRequiresBatteryNotLow(oooo0.f36134OooO0Oo);
            extras.setRequiresStorageNotLow(oooo0.f36136OooO0o0);
        }
        boolean z3 = o00ooo2.f36225OooOO0O > 0;
        boolean z4 = jMax > 0;
        if (i5 >= 31 && o00ooo2.f36232OooOOo0 && !z3 && !z4) {
            extras.setExpedited(true);
        }
        JobInfo jobInfoBuild = extras.build();
        o0Oo0oo o0oo0ooOooO0Oo = o0Oo0oo.OooO0Oo();
        String str2 = "Scheduling work ID " + str + "Job ID " + i;
        String str3 = f36166OooO0oo;
        o0oo0ooOooO0Oo.OooO00o(str3, str2);
        try {
            if (jobScheduler.schedule(jobInfoBuild) == 0) {
                o0Oo0oo.OooO0Oo().OooO0oO(str3, "Unable to schedule work ID " + str);
                if (o00ooo2.f36232OooOOo0 && o00ooo2.f36231OooOOo == OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    o00ooo2.f36232OooOOo0 = false;
                    o0Oo0oo.OooO0Oo().OooO00o(str3, String.format("Scheduling a non-expedited job (work ID %s)", str));
                    OooO0oo(o00ooo2, i);
                }
            }
        } catch (IllegalStateException e) {
            ArrayList arrayListOooO0o = OooO0o(this.f36167OooO0Oo, jobScheduler);
            int size = arrayListOooO0o != null ? arrayListOooO0o.size() : 0;
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(size);
            o00000O0 o00000o1 = this.f36168OooO0o;
            objArr[1] = Integer.valueOf(o00000o1.f60221OooO0OO.OooOo0().OooO0o0().size());
            androidx.work.OooO00o oooO00o2 = o00000o1.f60220OooO0O0;
            int i6 = Build.VERSION.SDK_INT;
            int i7 = oooO00o2.f11471OooO0oo;
            if (i6 == 23) {
                i7 /= 2;
            }
            objArr[2] = Integer.valueOf(i7);
            String str4 = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", objArr);
            o0Oo0oo.OooO0Oo().OooO0O0(str3, str4);
            IllegalStateException illegalStateException = new IllegalStateException(str4, e);
            o00000o1.f60220OooO0O0.getClass();
            throw illegalStateException;
        } catch (Throwable th) {
            o0Oo0oo.OooO0Oo().OooO0OO(str3, "Unable to schedule " + o00ooo2, th);
        }
    }
}
