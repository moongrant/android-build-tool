package p256o00ooOO0;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.zada;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public final class o0oOO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Result f40340OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zada f40341OooO0o0;

    public o0oOO(zada zadaVar, Result result) {
        this.f40341OooO0o0 = zadaVar;
        this.f40340OooO0Oo = result;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    @WorkerThread
    public final void run() {
        Result result = this.f40340OooO0Oo;
        zada zadaVar = this.f40341OooO0o0;
        try {
            o0O000 o0o001 = BasePendingResult.f14237OooOOOO;
            o0o001.set(Boolean.TRUE);
            PendingResult pendingResultOnSuccess = ((ResultTransform) Preconditions.checkNotNull(zadaVar.f14432OooO00o)).onSuccess(result);
            o0O00o0 o0o00o1 = zadaVar.f14439OooO0oo;
            o0o00o1.sendMessage(o0o00o1.obtainMessage(0, pendingResultOnSuccess));
            o0o001.set(Boolean.FALSE);
            zada.OooO0Oo(result);
            GoogleApiClient googleApiClient = zadaVar.f14438OooO0oO.get();
            result = googleApiClient;
            if (googleApiClient != null) {
            }
        } catch (RuntimeException e) {
            o0O00o0 o0o00o2 = zadaVar.f14439OooO0oo;
            o0o00o2.sendMessage(o0o00o2.obtainMessage(1, e));
            BasePendingResult.f14237OooOOOO.set(Boolean.FALSE);
            zada.OooO0Oo(result);
            GoogleApiClient googleApiClient2 = zadaVar.f14438OooO0oO.get();
            result = googleApiClient2;
            if (googleApiClient2 != null) {
            }
        } finally {
            BasePendingResult.f14237OooOOOO.set(Boolean.FALSE);
            zada.OooO0Oo(result);
            GoogleApiClient googleApiClient3 = zadaVar.f14438OooO0oO.get();
            if (googleApiClient3 != null) {
                googleApiClient3.zap(zadaVar);
            }
        }
    }
}
