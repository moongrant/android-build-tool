package oo00o;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p110o000ooo0.o0000O0O;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o00000O0 extends WorkManager {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static o00000O0 f60215OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static o00000O0 f60216OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final Object f60217OooOOO0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f60218OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Context f60219OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public androidx.work.OooO00o f60220OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public WorkDatabase f60221OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public p119o00O0Oo0.o0OoOo0 f60222OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o00Oo0 f60223OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public List<oo000o> f60224OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public o00O0OOO.o00Oo0 f60225OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f60226OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o00O0OO0.o000oOoO f60227OooOO0;

    @RequiresApi(24)
    public static class OooO00o {
        @DoNotInline
        public static boolean OooO00o(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    static {
        p115o00O00oO.o0Oo0oo.OooO0o("WorkManagerImpl");
        f60215OooOO0O = null;
        f60216OooOO0o = null;
        f60217OooOOO0 = new Object();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public o00000O0(@NonNull Context context, @NonNull androidx.work.OooO00o oooO00o, @NonNull p119o00O0Oo0.o00O0O o00o0o2) {
        RoomDatabase.OooO00o OooO00o2;
        boolean z = context.getResources().getBoolean(p115o00O00oO.o0O0O00.workmanager_test_configuration);
        final Context context2 = context.getApplicationContext();
        o00O0OOO.oo000o executor = o00o0o2.f36414OooO00o;
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(executor, "queryExecutor");
        if (z) {
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter(WorkDatabase.class, "klass");
            OooO00o2 = new RoomDatabase.OooO00o(context2, WorkDatabase.class, null);
            OooO00o2.f10998OooOO0 = true;
        } else {
            OooO00o2 = o0000O0O.OooO00o(context2, WorkDatabase.class, "androidx.work.workdb");
            OooO00o2.f10989OooO = new SupportSQLiteOpenHelper.OooO0O0() { // from class: oo00o.o0OO00O
                @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.OooO0O0
                public final SupportSQLiteOpenHelper create(SupportSQLiteOpenHelper.Configuration configuration) {
                    Context context3 = context2;
                    Intrinsics.checkNotNullParameter(context3, "$context");
                    Intrinsics.checkNotNullParameter(configuration, "configuration");
                    Intrinsics.checkNotNullParameter(context3, "context");
                    Intrinsics.checkNotNullParameter(context3, "context");
                    String str = configuration.f11079OooO0O0;
                    SupportSQLiteOpenHelper.OooO00o callback = configuration.f11080OooO0OO;
                    Intrinsics.checkNotNullParameter(callback, "callback");
                    if (callback == null) {
                        throw new IllegalArgumentException("Must set a callback to create the configuration.".toString());
                    }
                    if (!(true ^ (str == null || str.length() == 0))) {
                        throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
                    }
                    SupportSQLiteOpenHelper.Configuration configuration2 = new SupportSQLiteOpenHelper.Configuration(context3, str, callback, true, true);
                    Intrinsics.checkNotNullParameter(configuration2, "configuration");
                    return new FrameworkSQLiteOpenHelper(configuration2.f11078OooO00o, configuration2.f11079OooO0O0, configuration2.f11080OooO0OO, configuration2.f11081OooO0Oo, configuration2.f11082OooO0o0);
                }
            };
        }
        Intrinsics.checkNotNullParameter(executor, "executor");
        OooO00o2.f10996OooO0oO = executor;
        OooO0OO callback = OooO0OO.f60200OooO00o;
        Intrinsics.checkNotNullParameter(callback, "callback");
        OooO00o2.f10993OooO0Oo.add(callback);
        OooO00o2.OooO00o(OooOOO.f60204OooO0OO);
        OooO00o2.OooO00o(new o00Ooo(context2, 2, 3));
        OooO00o2.OooO00o(OooOOOO.f60206OooO0OO);
        OooO00o2.OooO00o(OooOo00.f60208OooO0OO);
        OooO00o2.OooO00o(new o00Ooo(context2, 5, 6));
        OooO00o2.OooO00o(OooOo.f60207OooO0OO);
        OooO00o2.OooO00o(Oooo000.f60210OooO0OO);
        OooO00o2.OooO00o(Oooo0.f60209OooO0OO);
        OooO00o2.OooO00o(new o00000O(context2));
        OooO00o2.OooO00o(new o00Ooo(context2, 10, 11));
        OooO00o2.OooO00o(OooOO0.f60202OooO0OO);
        OooO00o2.OooO00o(OooOO0O.f60203OooO0OO);
        OooO00o2.OooO00o(OooOOO0.f60205OooO0OO);
        OooO00o2.f11000OooOO0o = false;
        OooO00o2.f11002OooOOO0 = true;
        WorkDatabase workDatabase = (WorkDatabase) OooO00o2.OooO0O0();
        Context applicationContext = context.getApplicationContext();
        o00O00oO.o0Oo0oo.OooO00o oooO00o2 = new o00O00oO.o0Oo0oo.OooO00o(oooO00o.f11468OooO0o);
        synchronized (p115o00O00oO.o0Oo0oo.f36157OooO00o) {
            p115o00O00oO.o0Oo0oo.f36158OooO0O0 = oooO00o2;
        }
        o00O0OO0.o000oOoO o000oooo2 = new o00O0OO0.o000oOoO(applicationContext, o00o0o2);
        this.f60227OooOO0 = o000oooo2;
        String str = o00oO0o.f60283OooO00o;
        o00O0O0.OooOo oooOo = new o00O0O0.OooOo(applicationContext, this);
        o00O0OOO.o00O0O.OooO00o(applicationContext, SystemJobService.class, true);
        p115o00O00oO.o0Oo0oo.OooO0Oo().OooO00o(o00oO0o.f60283OooO00o, "Created SystemJobScheduler and enabled SystemJobService");
        List<oo000o> listAsList = Arrays.asList(oooOo, new o00O0.OooO0OO(applicationContext, oooO00o, o000oooo2, this));
        o00Oo0 o00oo1 = new o00Oo0(context, oooO00o, o00o0o2, workDatabase, listAsList);
        Context applicationContext2 = context.getApplicationContext();
        this.f60219OooO00o = applicationContext2;
        this.f60220OooO0O0 = oooO00o;
        this.f60222OooO0Oo = o00o0o2;
        this.f60221OooO0OO = workDatabase;
        this.f60224OooO0o0 = listAsList;
        this.f60223OooO0o = o00oo1;
        this.f60225OooO0oO = new o00O0OOO.o00Oo0(workDatabase);
        this.f60226OooO0oo = false;
        if (Build.VERSION.SDK_INT >= 24 && OooO00o.OooO00o(applicationContext2)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        ((p119o00O0Oo0.o00O0O) this.f60222OooO0Oo).OooO00o(new ForceStopRunnable(applicationContext2, this));
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Deprecated
    public static o00000O0 OooO0OO() {
        synchronized (f60217OooOOO0) {
            o00000O0 o00000o1 = f60215OooOO0O;
            if (o00000o1 != null) {
                return o00000o1;
            }
            return f60216OooOO0o;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static o00000O0 OooO0Oo(@NonNull Context context) {
        o00000O0 o00000o0OooO0OO;
        synchronized (f60217OooOOO0) {
            o00000o0OooO0OO = OooO0OO();
            if (o00000o0OooO0OO == null) {
                Context applicationContext = context.getApplicationContext();
                if (!(applicationContext instanceof androidx.work.OooO00o.OooO0O0)) {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
                OooO0o0(applicationContext, ((androidx.work.OooO00o.OooO0O0) applicationContext).OooO00o());
                o00000o0OooO0OO = OooO0Oo(applicationContext);
            }
        }
        return o00000o0OooO0OO;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void OooO0o0(@NonNull Context context, @NonNull androidx.work.OooO00o oooO00o) {
        synchronized (f60217OooOOO0) {
            o00000O0 o00000o1 = f60215OooOO0O;
            if (o00000o1 != null && f60216OooOO0o != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
            if (o00000o1 == null) {
                Context applicationContext = context.getApplicationContext();
                if (f60216OooOO0o == null) {
                    f60216OooOO0o = new o00000O0(applicationContext, oooO00o, new p119o00O0Oo0.o00O0O(oooO00o.f11465OooO0O0));
                }
                f60215OooOO0O = f60216OooOO0o;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooO(@NonNull o0ooOOo o0ooooo) {
        ((p119o00O0Oo0.o00O0O) this.f60222OooO0Oo).OooO00o(new o00O0OOO.o0ooOOo(this, o0ooooo, false));
    }

    @NonNull
    public final p115o00O00oO.oo0o0Oo OooO00o(@NonNull List<? extends p115o00O00oO.o000000O> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new o0Oo0oo(this, null, ExistingWorkPolicy.KEEP, list).OooO00o();
    }

    @NonNull
    public final p115o00O00oO.oo0o0Oo OooO0O0(@NonNull String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull List<p115o00O00oO.o0OO00O> list) {
        return new o0Oo0oo(this, str, existingWorkPolicy, list).OooO00o();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooO0o() {
        synchronized (f60217OooOOO0) {
            this.f60226OooO0oo = true;
            BroadcastReceiver.PendingResult pendingResult = this.f60218OooO;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f60218OooO = null;
            }
        }
    }

    public final void OooO0oO() {
        ArrayList arrayListOooO0o;
        Context context = this.f60219OooO00o;
        String str = o00O0O0.OooOo.f36166OooO0oo;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (arrayListOooO0o = o00O0O0.OooOo.OooO0o(context, jobScheduler)) != null && !arrayListOooO0o.isEmpty()) {
            Iterator it = arrayListOooO0o.iterator();
            while (it.hasNext()) {
                o00O0O0.OooOo.OooO0OO(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        this.f60221OooO0OO.OooOo0().OooOO0();
        o00oO0o.OooO00o(this.f60220OooO0O0, this.f60221OooO0OO, this.f60224OooO0o0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooO0oo(@NonNull o0ooOOo o0ooooo, @Nullable WorkerParameters.OooO00o oooO00o) {
        ((p119o00O0Oo0.o00O0O) this.f60222OooO0Oo).OooO00o(new o00O0OOO.o00oO0o(this, o0ooooo, oooO00o));
    }
}
