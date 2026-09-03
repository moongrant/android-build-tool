package androidx.core.app;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.facebook.AuthenticationTokenClaims;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class JobIntentService extends Service {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static final HashMap<ComponentName, OooOO0> f7778OoooO0 = new HashMap<>();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f7779Oooo = false;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public OooO f7780Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public OooOO0 f7781Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public OooO00o f7782Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final ArrayList<OooO0OO> f7783OoooO00;

    @RequiresApi(26)
    public static final class OooO extends JobServiceEngine {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final JobIntentService f7784OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Object f7785OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public JobParameters f7786OooO0OO;

        public final class OooO00o implements OooO0o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final JobWorkItem f7787OooO00o;

            public OooO00o(JobWorkItem jobWorkItem) {
                this.f7787OooO00o = jobWorkItem;
            }

            @Override // androidx.core.app.JobIntentService.OooO0o
            public final void complete() {
                synchronized (OooO.this.f7785OooO0O0) {
                    JobParameters jobParameters = OooO.this.f7786OooO0OO;
                    if (jobParameters != null) {
                        jobParameters.completeWork(this.f7787OooO00o);
                    }
                }
            }

            @Override // androidx.core.app.JobIntentService.OooO0o
            public final Intent getIntent() {
                return this.f7787OooO00o.getIntent();
            }
        }

        public OooO(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f7785OooO0O0 = new Object();
            this.f7784OooO00o = jobIntentService;
        }

        public final OooO0o OooO00o() {
            synchronized (this.f7785OooO0O0) {
                JobParameters jobParameters = this.f7786OooO0OO;
                if (jobParameters == null) {
                    return null;
                }
                JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                if (jobWorkItemDequeueWork == null) {
                    return null;
                }
                jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.f7784OooO00o.getClassLoader());
                return new OooO00o(jobWorkItemDequeueWork);
            }
        }

        @Override // android.app.job.JobServiceEngine
        public final boolean onStartJob(JobParameters jobParameters) {
            this.f7786OooO0OO = jobParameters;
            this.f7784OooO00o.OooO00o(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public final boolean onStopJob(JobParameters jobParameters) {
            OooO00o oooO00o = this.f7784OooO00o.f7782Oooo0oo;
            if (oooO00o != null) {
                oooO00o.cancel(false);
            }
            synchronized (this.f7785OooO0O0) {
                this.f7786OooO0OO = null;
            }
            return true;
        }
    }

    public final class OooO00o extends AsyncTask<Void, Void, Void> {
        public OooO00o() {
        }

        @Override // android.os.AsyncTask
        public final Void doInBackground(Void[] voidArr) {
            OooO0OO oooO0OORemove;
            while (true) {
                JobIntentService jobIntentService = JobIntentService.this;
                OooO oooO = jobIntentService.f7780Oooo0o;
                if (oooO != null) {
                    oooO0OORemove = oooO.OooO00o();
                } else {
                    synchronized (jobIntentService.f7783OoooO00) {
                        oooO0OORemove = jobIntentService.f7783OoooO00.size() > 0 ? jobIntentService.f7783OoooO00.remove(0) : null;
                    }
                }
                if (oooO0OORemove == null) {
                    return null;
                }
                JobIntentService jobIntentService2 = JobIntentService.this;
                oooO0OORemove.getIntent();
                jobIntentService2.OooO0O0();
                oooO0OORemove.complete();
            }
        }

        @Override // android.os.AsyncTask
        public final void onCancelled(Void r1) {
            JobIntentService.this.OooO0OO();
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Void r1) {
            JobIntentService.this.OooO0OO();
        }
    }

    public static final class OooO0O0 extends OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final PowerManager.WakeLock f7790OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final PowerManager.WakeLock f7791OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f7792OooO0OO;

        public OooO0O0(Context context, ComponentName componentName) {
            super(componentName);
            context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f7790OooO00o = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f7791OooO0O0 = wakeLockNewWakeLock2;
            wakeLockNewWakeLock2.setReferenceCounted(false);
        }

        @Override // androidx.core.app.JobIntentService.OooOO0
        public final void OooO00o() {
            synchronized (this) {
                if (this.f7792OooO0OO) {
                    this.f7792OooO0OO = false;
                    this.f7791OooO0O0.release();
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.OooOO0
        public final void OooO0O0() {
            synchronized (this) {
                if (!this.f7792OooO0OO) {
                    this.f7792OooO0OO = true;
                    this.f7791OooO0O0.acquire(AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED);
                    this.f7790OooO00o.release();
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.OooOO0
        public final void OooO0OO() {
            synchronized (this) {
            }
        }
    }

    public final class OooO0OO implements OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Intent f7793OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f7794OooO0O0;

        public OooO0OO(Intent intent, int i) {
            this.f7793OooO00o = intent;
            this.f7794OooO0O0 = i;
        }

        @Override // androidx.core.app.JobIntentService.OooO0o
        public final void complete() {
            JobIntentService.this.stopSelf(this.f7794OooO0O0);
        }

        @Override // androidx.core.app.JobIntentService.OooO0o
        public final Intent getIntent() {
            return this.f7793OooO00o;
        }
    }

    public interface OooO0o {
        void complete();

        Intent getIntent();
    }

    public static abstract class OooOO0 {
        public OooOO0(ComponentName componentName) {
        }

        public void OooO00o() {
        }

        public void OooO0O0() {
        }

        public void OooO0OO() {
        }
    }

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f7783OoooO00 = null;
        } else {
            this.f7783OoooO00 = new ArrayList<>();
        }
    }

    public final void OooO00o(boolean z) {
        if (this.f7782Oooo0oo == null) {
            this.f7782Oooo0oo = new OooO00o();
            OooOO0 oooOO1 = this.f7781Oooo0oO;
            if (oooOO1 != null && z) {
                oooOO1.OooO0O0();
            }
            this.f7782Oooo0oo.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public abstract void OooO0O0();

    public final void OooO0OO() {
        ArrayList<OooO0OO> arrayList = this.f7783OoooO00;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f7782Oooo0oo = null;
                ArrayList<OooO0OO> arrayList2 = this.f7783OoooO00;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    OooO00o(false);
                } else if (!this.f7779Oooo) {
                    this.f7781Oooo0oO.OooO00o();
                }
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(@NonNull Intent intent) {
        OooO oooO = this.f7780Oooo0o;
        if (oooO != null) {
            return oooO.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f7780Oooo0o = new OooO(this);
            this.f7781Oooo0oO = null;
            return;
        }
        this.f7780Oooo0o = null;
        ComponentName componentName = new ComponentName(this, getClass());
        HashMap<ComponentName, OooOO0> map = f7778OoooO0;
        OooOO0 oooO0O0 = map.get(componentName);
        if (oooO0O0 == null) {
            if (i >= 26) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            oooO0O0 = new OooO0O0(this, componentName);
            map.put(componentName, oooO0O0);
        }
        this.f7781Oooo0oO = oooO0O0;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ArrayList<OooO0OO> arrayList = this.f7783OoooO00;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f7779Oooo = true;
                this.f7781Oooo0oO.OooO00o();
            }
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(@Nullable Intent intent, int i, int i2) {
        if (this.f7783OoooO00 == null) {
            return 2;
        }
        this.f7781Oooo0oO.OooO0OO();
        synchronized (this.f7783OoooO00) {
            ArrayList<OooO0OO> arrayList = this.f7783OoooO00;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new OooO0OO(intent, i2));
            OooO00o(true);
        }
        return 3;
    }
}
