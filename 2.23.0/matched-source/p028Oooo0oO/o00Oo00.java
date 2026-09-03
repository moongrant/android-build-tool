package p028Oooo0oO;

import android.app.job.JobParameters;
import android.os.Parcelable;
import android.view.Surface;
import androidx.camera.core.OooO;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import o000OO.OooO00o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00Oo00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1174OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Parcelable f1175OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1176OooO0o0;

    public /* synthetic */ o00Oo00(Object obj, Parcelable parcelable, int i) {
        this.f1174OooO0Oo = i;
        this.f1176OooO0o0 = obj;
        this.f1175OooO0o = parcelable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1174OooO0Oo;
        Parcelable parcelable = this.f1175OooO0o;
        Object obj = this.f1176OooO0o0;
        switch (i) {
            case 0:
                ((OooO00o) obj).accept(new OooO(3, (Surface) parcelable));
                break;
            default:
                int i2 = JobInfoSchedulerService.f10877OooO0Oo;
                ((JobInfoSchedulerService) obj).jobFinished((JobParameters) parcelable, false);
                break;
        }
    }
}
