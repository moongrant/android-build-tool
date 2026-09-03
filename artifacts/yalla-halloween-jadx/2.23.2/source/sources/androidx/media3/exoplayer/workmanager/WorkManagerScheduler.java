package androidx.media3.exoplayer.workmanager;

import android.content.Context;
import android.content.Intent;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.scheduler.Requirements;
import androidx.work.OooO0O0;
import androidx.work.OooO0OO;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import oo00o.o00000O0;
import p069o0000ooO.o0000;
import p073o000O0oo.o0000oo;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class WorkManagerScheduler implements o0000oo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int f8355OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00000O0 f8356OooO00o;

    public static final class SchedulerWorker extends Worker {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final WorkerParameters f8357OooO;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final Context f8358OooOO0;

        public SchedulerWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
            this.f8357OooO = workerParameters;
            this.f8358OooOO0 = context;
        }

        @Override // androidx.work.Worker
        public final OooO0OO.OooO00o OooO0oO() {
            OooO0O0 oooO0O0 = this.f8357OooO.f11488OooO0O0;
            oooO0O0.getClass();
            Object obj = oooO0O0.f11474OooO00o.get("requirements");
            Requirements requirements = new Requirements(obj instanceof Integer ? ((Integer) obj).intValue() : 0);
            Context context = this.f8358OooOO0;
            int iOooO00o = requirements.OooO00o(context);
            if (iOooO00o != 0) {
                Log.OooO0o("WorkManagerScheduler", "Requirements not met: " + iOooO00o);
                return new OooO0OO.OooO00o.OooO0O0();
            }
            String strOooO0O0 = oooO0O0.OooO0O0("service_action");
            strOooO0O0.getClass();
            String strOooO0O1 = oooO0O0.OooO0O0("service_package");
            strOooO0O1.getClass();
            Intent intent = new Intent(strOooO0O0).setPackage(strOooO0O1);
            if (o00.f34910OooO00o >= 26) {
                context.startForegroundService(intent);
            } else {
                context.startService(intent);
            }
            return new OooO0OO.OooO00o.C0186OooO0OO();
        }
    }

    static {
        o0000.OooO00o("media3.exoplayer.workmanager");
        f8355OooO0O0 = (o00.f34910OooO00o >= 23 ? 4 : 0) | 3 | 8 | 16;
    }

    public WorkManagerScheduler(Context context) {
        this.f8356OooO00o = o00000O0.OooO0Oo(context.getApplicationContext());
    }
}
