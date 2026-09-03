package p254o00ooOO0;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.zada;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OOOOo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Result f40986OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zada f40987OooO0o0;

    public o00OOOOo(zada zadaVar, Result result) {
        this.f40987OooO0o0 = zadaVar;
        this.f40986OooO0Oo = result;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    @WorkerThread
    public final void run() {
        Result result = this.f40986OooO0Oo;
        zada zadaVar = this.f40987OooO0o0;
        try {
            o0O00000 o0o00000 = BasePendingResult.f14713OooOOOO;
            o0o00000.set(Boolean.TRUE);
            PendingResult pendingResultOnSuccess = ((ResultTransform) Preconditions.checkNotNull(zadaVar.f14908OooO00o)).onSuccess(result);
            o00Oo00 o00oo00 = zadaVar.f14915OooO0oo;
            o00oo00.sendMessage(o00oo00.obtainMessage(0, pendingResultOnSuccess));
            o0o00000.set(Boolean.FALSE);
            zada.OooO0Oo(result);
            GoogleApiClient googleApiClient = zadaVar.f14914OooO0oO.get();
            result = googleApiClient;
            if (googleApiClient != null) {
            }
        } catch (RuntimeException e) {
            o00Oo00 o00oo01 = zadaVar.f14915OooO0oo;
            o00oo01.sendMessage(o00oo01.obtainMessage(1, e));
            BasePendingResult.f14713OooOOOO.set(Boolean.FALSE);
            zada.OooO0Oo(result);
            GoogleApiClient googleApiClient2 = zadaVar.f14914OooO0oO.get();
            result = googleApiClient2;
            if (googleApiClient2 != null) {
            }
        } finally {
            BasePendingResult.f14713OooOOOO.set(Boolean.FALSE);
            zada.OooO0Oo(result);
            GoogleApiClient googleApiClient3 = zadaVar.f14914OooO0oO.get();
            if (googleApiClient3 != null) {
                googleApiClient3.zap(zadaVar);
            }
        }
    }
}
