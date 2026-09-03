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

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final HashMap<ComponentName, OooOO0> f5242OooO = new HashMap<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO f5243OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooO00o f5244OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooOO0 f5245OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f5246OooO0oO = false;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final ArrayList<OooO0OO> f5247OooO0oo;

    @RequiresApi(26)
    public static final class OooO extends JobServiceEngine {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final JobIntentService f5248OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Object f5249OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public JobParameters f5250OooO0OO;

        public final class OooO00o implements OooO0o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final JobWorkItem f5251OooO00o;

            public OooO00o(JobWorkItem jobWorkItem) {
                this.f5251OooO00o = jobWorkItem;
            }

            @Override // androidx.core.app.JobIntentService.OooO0o
            public final void complete() {
                synchronized (OooO.this.f5249OooO0O0) {
                    JobParameters jobParameters = OooO.this.f5250OooO0OO;
                    if (jobParameters != null) {
                        jobParameters.completeWork(this.f5251OooO00o);
                    }
                }
            }

            @Override // androidx.core.app.JobIntentService.OooO0o
            public final Intent getIntent() {
                return this.f5251OooO00o.getIntent();
            }
        }

        public OooO(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f5249OooO0O0 = new Object();
            this.f5248OooO00o = jobIntentService;
        }

        public final OooO00o OooO00o() {
            synchronized (this.f5249OooO0O0) {
                JobParameters jobParameters = this.f5250OooO0OO;
                if (jobParameters == null) {
                    return null;
                }
                JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                if (jobWorkItemDequeueWork == null) {
                    return null;
                }
                jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.f5248OooO00o.getClassLoader());
                return new OooO00o(jobWorkItemDequeueWork);
            }
        }

        public final boolean onStartJob(JobParameters jobParameters) {
            this.f5250OooO0OO = jobParameters;
            this.f5248OooO00o.OooO00o(false);
            return true;
        }

        public final boolean onStopJob(JobParameters jobParameters) {
            OooO00o oooO00o = this.f5248OooO00o.f5244OooO0o;
            if (oooO00o != null) {
                oooO00o.cancel(false);
            }
            synchronized (this.f5249OooO0O0) {
                this.f5250OooO0OO = null;
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
                OooO oooO = jobIntentService.f5243OooO0Oo;
                if (oooO != null) {
                    oooO0OORemove = oooO.OooO00o();
                } else {
                    synchronized (jobIntentService.f5247OooO0oo) {
                        oooO0OORemove = jobIntentService.f5247OooO0oo.size() > 0 ? jobIntentService.f5247OooO0oo.remove(0) : null;
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
        public final PowerManager.WakeLock f5254OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final PowerManager.WakeLock f5255OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f5256OooO0OO;

        public OooO0O0(Context context, ComponentName componentName) {
            super(componentName);
            context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f5254OooO00o = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f5255OooO0O0 = wakeLockNewWakeLock2;
            wakeLockNewWakeLock2.setReferenceCounted(false);
        }

        @Override // androidx.core.app.JobIntentService.OooOO0
        public final void OooO00o() {
            synchronized (this) {
                if (this.f5256OooO0OO) {
                    this.f5256OooO0OO = false;
                    this.f5255OooO0O0.release();
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.OooOO0
        public final void OooO0O0() {
            synchronized (this) {
                if (!this.f5256OooO0OO) {
                    this.f5256OooO0OO = true;
                    this.f5255OooO0O0.acquire(AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED);
                    this.f5254OooO00o.release();
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
        public final Intent f5257OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f5258OooO0O0;

        public OooO0OO(Intent intent, int i) {
            this.f5257OooO00o = intent;
            this.f5258OooO0O0 = i;
        }

        @Override // androidx.core.app.JobIntentService.OooO0o
        public final void complete() {
            JobIntentService.this.stopSelf(this.f5258OooO0O0);
        }

        @Override // androidx.core.app.JobIntentService.OooO0o
        public final Intent getIntent() {
            return this.f5257OooO00o;
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
            this.f5247OooO0oo = null;
        } else {
            this.f5247OooO0oo = new ArrayList<>();
        }
    }

    public final void OooO00o(boolean z) {
        if (this.f5244OooO0o == null) {
            this.f5244OooO0o = new OooO00o();
            OooOO0 oooOO1 = this.f5245OooO0o0;
            if (oooOO1 != null && z) {
                oooOO1.OooO0O0();
            }
            this.f5244OooO0o.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public abstract void OooO0O0();

    public final void OooO0OO() {
        ArrayList<OooO0OO> arrayList = this.f5247OooO0oo;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f5244OooO0o = null;
                ArrayList<OooO0OO> arrayList2 = this.f5247OooO0oo;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    OooO00o(false);
                } else if (!this.f5246OooO0oO) {
                    this.f5245OooO0o0.OooO00o();
                }
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(@NonNull Intent intent) {
        OooO oooO = this.f5243OooO0Oo;
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
            this.f5243OooO0Oo = new OooO(this);
            this.f5245OooO0o0 = null;
            return;
        }
        this.f5243OooO0Oo = null;
        ComponentName componentName = new ComponentName(this, getClass());
        HashMap<ComponentName, OooOO0> map = f5242OooO;
        OooOO0 oooO0O0 = map.get(componentName);
        if (oooO0O0 == null) {
            if (i >= 26) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            oooO0O0 = new OooO0O0(this, componentName);
            map.put(componentName, oooO0O0);
        }
        this.f5245OooO0o0 = oooO0O0;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ArrayList<OooO0OO> arrayList = this.f5247OooO0oo;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f5246OooO0oO = true;
                this.f5245OooO0o0.OooO00o();
            }
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(@Nullable Intent intent, int i, int i2) {
        if (this.f5247OooO0oo == null) {
            return 2;
        }
        this.f5245OooO0o0.OooO0OO();
        synchronized (this.f5247OooO0oo) {
            ArrayList<OooO0OO> arrayList = this.f5247OooO0oo;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new OooO0OO(intent, i2));
            OooO00o(true);
        }
        return 3;
    }
}
