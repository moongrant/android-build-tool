package p107o000ooO0;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.OooO0o;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.OooO00o;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import o00O000.OooO0O0;
import o00O0000.o00Oo0;
import p102o000oo.o00Ooo;
import p102o000oo.o0OoOo0;
import p102o000oo.o0ooOOo;
import p106o000ooO.o00000;
import p108o000ooOO.oO00o0;
import p110o000ooo0.oo0o0Oo;
import p326o0O0ooO.o00O00;
import p326o0O0ooO.o00O00O;
import p326o0O0ooO.o00O00OO;
import p326o0O0ooO.oo00o;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o00oO0o extends o0ooOOo {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static o00oO0o f29970OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static o00oO0o f29971OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final Object f29972OooOO0o;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f29973OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Context f29974OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO00o f29975OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public WorkDatabase f29976OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o00O000.OooO00o f29977OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooOo f29978OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public List<Oooo000> f29979OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public o00O00O f29980OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f29981OooO0oo;

    static {
        o0OoOo0.OooO0o0("WorkManagerImpl");
        f29970OooOO0 = null;
        f29971OooOO0O = null;
        f29972OooOO0o = new Object();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public o00oO0o(@NonNull Context context, @NonNull OooO00o oooO00o, @NonNull o00O000.OooO00o oooO00o2) {
        RoomDatabase.OooO00o OooO00o2;
        Oooo000 oo00o0;
        boolean z = context.getResources().getBoolean(o00Ooo.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        o00O00OO o00o00oo2 = ((OooO0O0) oooO00o2).f30114OooO00o;
        int i = WorkDatabase.f9766OooOOOO;
        Oooo000 oooo000 = null;
        if (z) {
            OooO00o2 = new RoomDatabase.OooO00o(applicationContext, WorkDatabase.class, null);
            OooO00o2.f9310OooO0oo = true;
        } else {
            String str = o00Oo0.f29968OooO00o;
            OooO00o2 = OooO0o.OooO00o(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            OooO00o2.f9309OooO0oO = new o0OoOo0(applicationContext);
        }
        OooO00o2.f9308OooO0o0 = o00o00oo2;
        o00O0O o00o0o2 = new o00O0O();
        if (OooO00o2.f9306OooO0Oo == null) {
            OooO00o2.f9306OooO0Oo = new ArrayList<>();
        }
        OooO00o2.f9306OooO0Oo.add(o00o0o2);
        OooO00o2.OooO00o(androidx.work.impl.OooO00o.f9756OooO00o);
        OooO00o2.OooO00o(new androidx.work.impl.OooO00o.OooOOO0(applicationContext, 2, 3));
        OooO00o2.OooO00o(androidx.work.impl.OooO00o.f9757OooO0O0);
        OooO00o2.OooO00o(androidx.work.impl.OooO00o.f9758OooO0OO);
        OooO00o2.OooO00o(new androidx.work.impl.OooO00o.OooOOO0(applicationContext, 5, 6));
        OooO00o2.OooO00o(androidx.work.impl.OooO00o.f9759OooO0Oo);
        OooO00o2.OooO00o(androidx.work.impl.OooO00o.f9761OooO0o0);
        OooO00o2.OooO00o(androidx.work.impl.OooO00o.f9760OooO0o);
        OooO00o2.OooO00o(new androidx.work.impl.OooO00o.OooOOO(applicationContext));
        OooO00o2.OooO00o(new androidx.work.impl.OooO00o.OooOOO0(applicationContext, 10, 11));
        OooO00o2.OooO00o(androidx.work.impl.OooO00o.f9762OooO0oO);
        OooO00o2.f9311OooOO0 = false;
        OooO00o2.f9312OooOO0O = true;
        WorkDatabase workDatabase = (WorkDatabase) OooO00o2.OooO0O0();
        Context applicationContext2 = context.getApplicationContext();
        o0OoOo0.OooO00o oooO00o3 = new o0OoOo0.OooO00o(oooO00o.f9737OooO0o);
        synchronized (o0OoOo0.class) {
            o0OoOo0.f29821OooO00o = oooO00o3;
        }
        Oooo000[] oooo000Arr = new Oooo000[2];
        String str2 = Oooo0.f29957OooO00o;
        if (Build.VERSION.SDK_INT >= 23) {
            oo00o0 = new oo0o0Oo(applicationContext2, this);
            o00O00.OooO00o(applicationContext2, SystemJobService.class, true);
            o0OoOo0.OooO0OO().OooO00o(Oooo0.f29957OooO00o, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        } else {
            try {
                Oooo000 oooo001 = (Oooo000) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(applicationContext2);
                o0OoOo0.OooO0OO().OooO00o(Oooo0.f29957OooO00o, String.format("Created %s", "androidx.work.impl.background.gcm.GcmScheduler"), new Throwable[0]);
                oooo000 = oooo001;
            } catch (Throwable th) {
                o0OoOo0.OooO0OO().OooO00o(Oooo0.f29957OooO00o, "Unable to create GCM Scheduler", th);
            }
            if (oooo000 == null) {
                oo00o0 = new oO00o0(applicationContext2);
                o00O00.OooO00o(applicationContext2, SystemAlarmService.class, true);
                o0OoOo0.OooO0OO().OooO00o(Oooo0.f29957OooO00o, "Created SystemAlarmScheduler", new Throwable[0]);
            } else {
                oo00o0 = oooo000;
            }
        }
        oooo000Arr[0] = oo00o0;
        oooo000Arr[1] = new o00000(applicationContext2, oooO00o, oooO00o2, this);
        List<Oooo000> listAsList = Arrays.asList(oooo000Arr);
        OooOo oooOo = new OooOo(context, oooO00o, oooO00o2, workDatabase, listAsList);
        Context applicationContext3 = context.getApplicationContext();
        this.f29974OooO00o = applicationContext3;
        this.f29975OooO0O0 = oooO00o;
        this.f29977OooO0Oo = oooO00o2;
        this.f29976OooO0OO = workDatabase;
        this.f29979OooO0o0 = listAsList;
        this.f29978OooO0o = oooOo;
        this.f29980OooO0oO = new o00O00O(workDatabase);
        this.f29981OooO0oo = false;
        if (Build.VERSION.SDK_INT >= 24 && applicationContext3.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        ((OooO0O0) this.f29977OooO0Oo).OooO00o(new ForceStopRunnable(applicationContext3, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static o00oO0o OooO0O0(@NonNull Context context) {
        o00oO0o o00oo0oOooO0O0;
        Object obj = f29972OooOO0o;
        synchronized (obj) {
            synchronized (obj) {
                o00oo0oOooO0O0 = f29970OooOO0;
                if (o00oo0oOooO0O0 == null) {
                    o00oo0oOooO0O0 = f29971OooOO0O;
                }
            }
            return o00oo0oOooO0O0;
        }
        if (o00oo0oOooO0O0 == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof OooO00o.OooO0O0)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            OooO0OO(applicationContext, ((OooO00o.OooO0O0) applicationContext).OooO00o());
            o00oo0oOooO0O0 = OooO0O0(applicationContext);
        }
        return o00oo0oOooO0O0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void OooO0OO(@NonNull Context context, @NonNull OooO00o oooO00o) {
        synchronized (f29972OooOO0o) {
            o00oO0o o00oo0o2 = f29970OooOO0;
            if (o00oo0o2 != null && f29971OooOO0O != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
            if (o00oo0o2 == null) {
                Context applicationContext = context.getApplicationContext();
                if (f29971OooOO0O == null) {
                    f29971OooOO0O = new o00oO0o(applicationContext, oooO00o, new OooO0O0(oooO00o.f9734OooO0O0));
                }
                f29970OooOO0 = f29971OooOO0O;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooO0Oo() {
        synchronized (f29972OooOO0o) {
            this.f29981OooO0oo = true;
            BroadcastReceiver.PendingResult pendingResult = this.f29973OooO;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f29973OooO = null;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooO0o(@NonNull String str) {
        ((OooO0O0) this.f29977OooO0Oo).OooO00o(new oo00o(this, str, false));
    }

    public final void OooO0o0() {
        List<JobInfo> listOooO0o;
        if (Build.VERSION.SDK_INT >= 23) {
            Context context = this.f29974OooO00o;
            String str = oo0o0Oo.f30031OoooO00;
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            if (jobScheduler != null && (listOooO0o = oo0o0Oo.OooO0o(context, jobScheduler)) != null) {
                ArrayList arrayList = (ArrayList) listOooO0o;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        oo0o0Oo.OooO0O0(jobScheduler, ((JobInfo) it.next()).getId());
                    }
                }
            }
        }
        o00Oo0 o00oo1 = (o00Oo0) this.f29976OooO0OO.OooOo0O();
        o00oo1.f30139OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o00oo1.f30138OooO.OooO00o();
        o00oo1.f30139OooO00o.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            o00oo1.f30139OooO00o.OooOOOO();
            o00oo1.f30139OooO00o.OooOO0O();
            o00oo1.f30138OooO.OooO0Oo(supportSQLiteStatementOooO00o);
            Oooo0.OooO00o(this.f29975OooO0O0, this.f29976OooO0OO, this.f29979OooO0o0);
        } catch (Throwable th) {
            o00oo1.f30139OooO00o.OooOO0O();
            o00oo1.f30138OooO.OooO0Oo(supportSQLiteStatementOooO00o);
            throw th;
        }
    }
}
