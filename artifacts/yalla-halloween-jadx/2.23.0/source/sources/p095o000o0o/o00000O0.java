package p095o000o0o;

import androidx.work.ListenableWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.common.util.concurrent.OooO00o;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO00o f35387OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f35388OooO0o0;

    public o00000O0(ConstraintTrackingWorker constraintTrackingWorker, OooO00o oooO00o) {
        this.f35388OooO0o0 = constraintTrackingWorker;
        this.f35387OooO0Oo = oooO00o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f35388OooO0o0.f8491OooOO0) {
            if (this.f35388OooO0o0.f8492OooOO0O) {
                ConstraintTrackingWorker constraintTrackingWorker = this.f35388OooO0o0;
                constraintTrackingWorker.getClass();
                constraintTrackingWorker.f8493OooOO0o.OooO0oo(new ListenableWorker.OooO00o.OooO0O0());
            } else {
                this.f35388OooO0o0.f8493OooOO0o.OooOO0O(this.f35387OooO0Oo);
            }
        }
    }
}
