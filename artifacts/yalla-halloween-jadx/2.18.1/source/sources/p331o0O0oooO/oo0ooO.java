package p331o0O0oooO;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.zada;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0ooO implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Result f37158Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ zada f37159Oooo0oO;

    public oo0ooO(zada zadaVar, Result result) {
        this.f37159Oooo0oO = zadaVar;
        this.f37158Oooo0o = result;
    }

    @Override // java.lang.Runnable
    @WorkerThread
    public final void run() {
        GoogleApiClient googleApiClient;
        try {
            try {
                ThreadLocal<Boolean> threadLocal = BasePendingResult.f15214OooOOOO;
                threadLocal.set(Boolean.TRUE);
                PendingResult pendingResultOnSuccess = ((ResultTransform) Preconditions.checkNotNull(this.f37159Oooo0oO.f15410OooO00o)).onSuccess(this.f37158Oooo0o);
                o0OO00OO o0oo00oo2 = this.f37159Oooo0oO.f15417OooO0oo;
                o0oo00oo2.sendMessage(o0oo00oo2.obtainMessage(0, pendingResultOnSuccess));
                threadLocal.set(Boolean.FALSE);
                zada.OooO0Oo(this.f37158Oooo0o);
                googleApiClient = this.f37159Oooo0oO.f15416OooO0oO.get();
                if (googleApiClient != null) {
                    googleApiClient.zap(this.f37159Oooo0oO);
                }
            } catch (RuntimeException e) {
                o0OO00OO o0oo00oo3 = this.f37159Oooo0oO.f15417OooO0oo;
                o0oo00oo3.sendMessage(o0oo00oo3.obtainMessage(1, e));
                BasePendingResult.f15214OooOOOO.set(Boolean.FALSE);
                zada.OooO0Oo(this.f37158Oooo0o);
                googleApiClient = this.f37159Oooo0oO.f15416OooO0oO.get();
                if (googleApiClient != null) {
                }
            }
        } catch (Throwable th) {
            BasePendingResult.f15214OooOOOO.set(Boolean.FALSE);
            zada.OooO0Oo(this.f37158Oooo0o);
            GoogleApiClient googleApiClient2 = this.f37159Oooo0oO.f15416OooO0oO.get();
            if (googleApiClient2 != null) {
                googleApiClient2.zap(this.f37159Oooo0oO);
            }
            throw th;
        }
    }
}
