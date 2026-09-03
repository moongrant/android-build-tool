package o00O000o;

import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.common.util.concurrent.OooO0OO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f30175Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f30176Oooo0oO;

    public OooO00o(ConstraintTrackingWorker constraintTrackingWorker, OooO0OO oooO0OO) {
        this.f30176Oooo0oO = constraintTrackingWorker;
        this.f30175Oooo0o = oooO0OO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f30176Oooo0oO.f9853OoooO0O) {
            if (this.f30176Oooo0oO.f9851OoooO) {
                this.f30176Oooo0oO.OooO();
            } else {
                this.f30176Oooo0oO.f9854OoooOO0.OooOO0o(this.f30175Oooo0o);
            }
        }
    }
}
