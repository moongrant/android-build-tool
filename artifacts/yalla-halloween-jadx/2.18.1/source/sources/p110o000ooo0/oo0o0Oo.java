package p110o000ooo0;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.OooO00o;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import o00O0000.OooOO0O;
import o00O0000.OooOOO;
import o00O0000.o00Oo0;
import p102o000oo.o0OoOo0;
import p107o000ooO0.Oooo000;
import p107o000ooO0.o00oO0o;
import p326o0O0ooO.o00O000o;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class oo0o0Oo implements Oooo000 {

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final String f30031OoooO00 = o0OoOo0.OooO0o0("SystemJobScheduler");

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final o0OO00O f30032Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Context f30033Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final JobScheduler f30034Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final o00oO0o f30035Oooo0oo;

    public oo0o0Oo(@NonNull Context context, @NonNull o00oO0o o00oo0o2) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        o0OO00O o0oo00o2 = new o0OO00O(context);
        this.f30033Oooo0o = context;
        this.f30035Oooo0oo = o00oo0o2;
        this.f30034Oooo0oO = jobScheduler;
        this.f30032Oooo = o0oo00o2;
    }

    public static void OooO0O0(@NonNull JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            o0OoOo0.OooO0OO().OooO0O0(f30031OoooO00, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    @Nullable
    public static List<Integer> OooO0Oo(@NonNull Context context, @NonNull JobScheduler jobScheduler, @NonNull String str) {
        List<JobInfo> listOooO0o = OooO0o(context, jobScheduler);
        if (listOooO0o == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : (ArrayList) listOooO0o) {
            if (str.equals(OooO0oO(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    @Nullable
    public static List<JobInfo> OooO0o(@NonNull Context context, @NonNull JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            o0OoOo0.OooO0OO().OooO0O0(f30031OoooO00, "getAllPendingJobs() is not reliable on this device.", th);
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
    public static String OooO0oO(@NonNull JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // p107o000ooO0.Oooo000
    public final boolean OooO00o() {
        return true;
    }

    @Override // p107o000ooO0.Oooo000
    public final void OooO0OO(@NonNull o00O0000.o0OoOo0... o0oooo0Arr) {
        int iOooO0O0;
        List<Integer> listOooO0Oo;
        int iOooO0O1;
        WorkDatabase workDatabase = this.f30035Oooo0oo.f29976OooO0OO;
        o00O000o o00o000o2 = new o00O000o(workDatabase);
        for (o00O0000.o0OoOo0 o0oooo1 : o0oooo0Arr) {
            workDatabase.OooO0OO();
            try {
                o00O0000.o0OoOo0 o0oooo0OooO0oo = ((o00Oo0) workDatabase.OooOo0O()).OooO0oo(o0oooo1.f30152OooO00o);
                if (o0oooo0OooO0oo == null) {
                    o0OoOo0.OooO0OO().OooO0o(f30031OoooO00, "Skipping scheduling " + o0oooo1.f30152OooO00o + " because it's no longer in the DB", new Throwable[0]);
                    workDatabase.OooOOOO();
                } else if (o0oooo0OooO0oo.f30153OooO0O0 != WorkInfo$State.ENQUEUED) {
                    o0OoOo0.OooO0OO().OooO0o(f30031OoooO00, "Skipping scheduling " + o0oooo1.f30152OooO00o + " because it is no longer enqueued", new Throwable[0]);
                    workDatabase.OooOOOO();
                } else {
                    OooOO0O oooOO0OOooO00o = ((OooOOO) workDatabase.OooOOoo()).OooO00o(o0oooo1.f30152OooO00o);
                    if (oooOO0OOooO00o != null) {
                        iOooO0O0 = oooOO0OOooO00o.f30127OooO0O0;
                    } else {
                        Objects.requireNonNull(this.f30035Oooo0oo.f29975OooO0O0);
                        iOooO0O0 = o00o000o2.OooO0O0(this.f30035Oooo0oo.f29975OooO0O0.f9739OooO0oO);
                    }
                    if (oooOO0OOooO00o == null) {
                        ((OooOOO) this.f30035Oooo0oo.f29976OooO0OO.OooOOoo()).OooO0O0(new OooOO0O(o0oooo1.f30152OooO00o, iOooO0O0));
                    }
                    OooO0oo(o0oooo1, iOooO0O0);
                    if (Build.VERSION.SDK_INT == 23 && (listOooO0Oo = OooO0Oo(this.f30033Oooo0o, this.f30034Oooo0oO, o0oooo1.f30152OooO00o)) != null) {
                        ArrayList arrayList = (ArrayList) listOooO0Oo;
                        int iIndexOf = arrayList.indexOf(Integer.valueOf(iOooO0O0));
                        if (iIndexOf >= 0) {
                            arrayList.remove(iIndexOf);
                        }
                        if (arrayList.isEmpty()) {
                            Objects.requireNonNull(this.f30035Oooo0oo.f29975OooO0O0);
                            iOooO0O1 = o00o000o2.OooO0O0(this.f30035Oooo0oo.f29975OooO0O0.f9739OooO0oO);
                        } else {
                            iOooO0O1 = ((Integer) arrayList.get(0)).intValue();
                        }
                        OooO0oo(o0oooo1, iOooO0O1);
                    }
                    workDatabase.OooOOOO();
                }
                workDatabase.OooOO0O();
            } catch (Throwable th) {
                workDatabase.OooOO0O();
                throw th;
            }
        }
    }

    @Override // p107o000ooO0.Oooo000
    public final void OooO0o0(@NonNull String str) {
        List<Integer> listOooO0Oo = OooO0Oo(this.f30033Oooo0o, this.f30034Oooo0oO, str);
        if (listOooO0Oo != null) {
            ArrayList arrayList = (ArrayList) listOooO0Oo;
            if (arrayList.isEmpty()) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                OooO0O0(this.f30034Oooo0oO, ((Integer) it.next()).intValue());
            }
            ((OooOOO) this.f30035Oooo0oo.f29976OooO0OO.OooOOoo()).OooO0OO(str);
        }
    }

    @VisibleForTesting
    public final void OooO0oo(o00O0000.o0OoOo0 o0oooo1, int i) {
        JobInfo jobInfoOooO00o = this.f30032Oooo.OooO00o(o0oooo1, i);
        o0OoOo0 o0oooo0OooO0OO = o0OoOo0.OooO0OO();
        String str = f30031OoooO00;
        o0oooo0OooO0OO.OooO00o(str, String.format("Scheduling work ID %s Job ID %s", o0oooo1.f30152OooO00o, Integer.valueOf(i)), new Throwable[0]);
        try {
            if (this.f30034Oooo0oO.schedule(jobInfoOooO00o) == 0) {
                o0OoOo0.OooO0OO().OooO0o(str, String.format("Unable to schedule work ID %s", o0oooo1.f30152OooO00o), new Throwable[0]);
                if (o0oooo1.f30168OooOOo0 && o0oooo1.f30167OooOOo == OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    o0oooo1.f30168OooOOo0 = false;
                    o0OoOo0.OooO0OO().OooO00o(str, String.format("Scheduling a non-expedited job (work ID %s)", o0oooo1.f30152OooO00o), new Throwable[0]);
                    OooO0oo(o0oooo1, i);
                }
            }
        } catch (IllegalStateException e) {
            List<JobInfo> listOooO0o = OooO0o(this.f30033Oooo0o, this.f30034Oooo0oO);
            int size = listOooO0o != null ? ((ArrayList) listOooO0o).size() : 0;
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(size);
            objArr[1] = Integer.valueOf(((ArrayList) ((o00Oo0) this.f30035Oooo0oo.f29976OooO0OO.OooOo0O()).OooO0o0()).size());
            OooO00o oooO00o = this.f30035Oooo0oo.f29975OooO0O0;
            objArr[2] = Integer.valueOf(Build.VERSION.SDK_INT == 23 ? oooO00o.f9740OooO0oo / 2 : oooO00o.f9740OooO0oo);
            String str2 = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", objArr);
            o0OoOo0.OooO0OO().OooO0O0(f30031OoooO00, str2, new Throwable[0]);
            throw new IllegalStateException(str2, e);
        } catch (Throwable th) {
            o0OoOo0.OooO0OO().OooO0O0(f30031OoooO00, String.format("Unable to schedule %s", o0oooo1), th);
        }
    }
}
