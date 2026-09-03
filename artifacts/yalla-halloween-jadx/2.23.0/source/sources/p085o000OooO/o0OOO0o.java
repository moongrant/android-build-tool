package p085o000OooO;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.OooO00o;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p084o000Ooo0.o000oOoO;
import p084o000Ooo0.o00Oo0;
import p084o000Ooo0.o00oO0o;
import p086o000Oooo.o000000;
import p087o000o00.o000O0o;
import p093o000o0OO.o000OOo;
import p093o000o0OO.o0O0O00;
import p093o000o0OO.o0ooOOo;
import p093o000o0OO.oo0o0Oo;
import p096o000o0o0.o0000O0;
import p096o000o0o0.o0000O0O;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o0OOO0o extends o00oO0o {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static o0OOO0o f35154OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static o0OOO0o f35155OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final Object f35156OooOO0o;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f35157OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Context f35158OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO00o f35159OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public WorkDatabase f35160OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o0000O0 f35161OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooOo f35162OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public List<Oooo000> f35163OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public p093o000o0OO.o0OOO0o f35164OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f35165OooO0oo;

    static {
        o000oOoO.OooO0o0("WorkManagerImpl");
        f35154OooOO0 = null;
        f35155OooOO0O = null;
        f35156OooOO0o = new Object();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public o0OOO0o(@NonNull Context context, @NonNull OooO00o oooO00o, @NonNull o0000O0O o0000o0o2) {
        RoomDatabase.OooO00o OooO00o2;
        boolean z = context.getResources().getBoolean(o00Oo0.workmanager_test_configuration);
        Context context2 = context.getApplicationContext();
        oo0o0Oo executor = o0000o0o2.f35389OooO00o;
        int i = WorkDatabase.f8410OooOOO;
        if (z) {
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter(WorkDatabase.class, "klass");
            OooO00o2 = new RoomDatabase.OooO00o(context2, WorkDatabase.class, null);
            OooO00o2.f7904OooOO0 = true;
        } else {
            String str = o00Ooo.f35149OooO00o;
            OooO00o2 = o000O0O0.o00oO0o.OooO00o(context2, WorkDatabase.class, "androidx.work.workdb");
            OooO00o2.f7895OooO = new o0OoOo0(context2);
        }
        Intrinsics.checkNotNullParameter(executor, "executor");
        OooO00o2.f7902OooO0oO = executor;
        o00O0O callback = new o00O0O();
        Intrinsics.checkNotNullParameter(callback, "callback");
        OooO00o2.f7899OooO0Oo.add(callback);
        OooO00o2.OooO00o(androidx.work.impl.OooO00o.f8401OooO00o);
        OooO00o2.OooO00o(new androidx.work.impl.OooO00o.OooOOO0(context2, 2, 3));
        OooO00o2.OooO00o(androidx.work.impl.OooO00o.f8402OooO0O0);
        OooO00o2.OooO00o(androidx.work.impl.OooO00o.f8403OooO0OO);
        OooO00o2.OooO00o(new androidx.work.impl.OooO00o.OooOOO0(context2, 5, 6));
        OooO00o2.OooO00o(androidx.work.impl.OooO00o.f8404OooO0Oo);
        OooO00o2.OooO00o(androidx.work.impl.OooO00o.f8406OooO0o0);
        OooO00o2.OooO00o(androidx.work.impl.OooO00o.f8405OooO0o);
        OooO00o2.OooO00o(new androidx.work.impl.OooO00o.OooOOO(context2));
        OooO00o2.OooO00o(new androidx.work.impl.OooO00o.OooOOO0(context2, 10, 11));
        OooO00o2.OooO00o(androidx.work.impl.OooO00o.f8407OooO0oO);
        OooO00o2.f7906OooOO0o = false;
        OooO00o2.f7908OooOOO0 = true;
        WorkDatabase workDatabase = (WorkDatabase) OooO00o2.OooO0O0();
        Context applicationContext = context.getApplicationContext();
        o000oOoO.OooO00o oooO00o2 = new o000oOoO.OooO00o(oooO00o.f8382OooO0o);
        synchronized (o000oOoO.class) {
            o000oOoO.f35109OooO00o = oooO00o2;
        }
        String str2 = Oooo0.f35139OooO00o;
        o000O0o o000o0o2 = new o000O0o(applicationContext, this);
        o0ooOOo.OooO00o(applicationContext, SystemJobService.class, true);
        o000oOoO.OooO0OO().OooO00o(Oooo0.f35139OooO00o, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        List<Oooo000> listAsList = Arrays.asList(o000o0o2, new o000000(applicationContext, oooO00o, o0000o0o2, this));
        OooOo oooOo = new OooOo(context, oooO00o, o0000o0o2, workDatabase, listAsList);
        Context applicationContext2 = context.getApplicationContext();
        this.f35158OooO00o = applicationContext2;
        this.f35159OooO0O0 = oooO00o;
        this.f35161OooO0Oo = o0000o0o2;
        this.f35160OooO0OO = workDatabase;
        this.f35163OooO0o0 = listAsList;
        this.f35162OooO0o = oooOo;
        this.f35164OooO0oO = new p093o000o0OO.o0OOO0o(workDatabase);
        this.f35165OooO0oo = false;
        if (Build.VERSION.SDK_INT >= 24 && applicationContext2.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        ((o0000O0O) this.f35161OooO0Oo).OooO00o(new ForceStopRunnable(applicationContext2, this));
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Deprecated
    public static o0OOO0o OooO0O0() {
        synchronized (f35156OooOO0o) {
            o0OOO0o o0ooo0o2 = f35154OooOO0;
            if (o0ooo0o2 != null) {
                return o0ooo0o2;
            }
            return f35155OooOO0O;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static o0OOO0o OooO0OO(@NonNull Context context) {
        o0OOO0o o0ooo0oOooO0O0;
        synchronized (f35156OooOO0o) {
            o0ooo0oOooO0O0 = OooO0O0();
            if (o0ooo0oOooO0O0 == null) {
                Context applicationContext = context.getApplicationContext();
                if (!(applicationContext instanceof OooO00o.OooO0O0)) {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
                OooO0Oo(applicationContext, ((OooO00o.OooO0O0) applicationContext).OooO00o());
                o0ooo0oOooO0O0 = OooO0OO(applicationContext);
            }
        }
        return o0ooo0oOooO0O0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void OooO0Oo(@NonNull Context context, @NonNull OooO00o oooO00o) {
        synchronized (f35156OooOO0o) {
            o0OOO0o o0ooo0o2 = f35154OooOO0;
            if (o0ooo0o2 != null && f35155OooOO0O != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
            if (o0ooo0o2 == null) {
                Context applicationContext = context.getApplicationContext();
                if (f35155OooOO0O == null) {
                    f35155OooOO0O = new o0OOO0o(applicationContext, oooO00o, new o0000O0O(oooO00o.f8379OooO0O0));
                }
                f35154OooOO0 = f35155OooOO0O;
            }
        }
    }

    public final void OooO0o() {
        ArrayList arrayListOooO0o;
        Context context = this.f35158OooO00o;
        String str = o000O0o.f35215OooO0oo;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (arrayListOooO0o = o000O0o.OooO0o(context, jobScheduler)) != null && !arrayListOooO0o.isEmpty()) {
            Iterator it = arrayListOooO0o.iterator();
            while (it.hasNext()) {
                o000O0o.OooO0O0(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        p091o000o0O.oo0o0Oo oo0o0oo = (p091o000o0O.oo0o0Oo) this.f35160OooO0OO.OooOo00();
        RoomDatabase roomDatabase = oo0o0oo.f35284OooO00o;
        roomDatabase.OooO0O0();
        o000o0O.oo0o0Oo.OooOOO0 oooOOO0 = oo0o0oo.f35283OooO;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = oooOOO0.OooO00o();
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO0();
            roomDatabase.OooOO0();
            oooOOO0.OooO0OO(supportSQLiteStatementOooO00o);
            Oooo0.OooO00o(this.f35159OooO0O0, this.f35160OooO0OO, this.f35163OooO0o0);
        } catch (Throwable th) {
            roomDatabase.OooOO0();
            oooOOO0.OooO0OO(supportSQLiteStatementOooO00o);
            throw th;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooO0o0() {
        synchronized (f35156OooOO0o) {
            this.f35165OooO0oo = true;
            BroadcastReceiver.PendingResult pendingResult = this.f35157OooO;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f35157OooO = null;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooO0oO(@NonNull String str, @Nullable WorkerParameters.OooO00o oooO00o) {
        ((o0000O0O) this.f35161OooO0Oo).OooO00o(new o0O0O00(this, str, oooO00o));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooO0oo(@NonNull String str) {
        ((o0000O0O) this.f35161OooO0Oo).OooO00o(new o000OOo(this, str, false));
    }
}
