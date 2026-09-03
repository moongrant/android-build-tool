package p256o00ooOO0;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O00 implements BaseGmsClient.ConnectionProgressReportCallbacks {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final WeakReference<zaaw> f40265OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Api<?> f40266OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f40267OooO0OO;

    public o00O00(zaaw zaawVar, Api<?> api, boolean z) {
        this.f40265OooO00o = new WeakReference<>(zaawVar);
        this.f40266OooO0O0 = api;
        this.f40267OooO0OO = z;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void onReportServiceBinding(@NonNull ConnectionResult connectionResult) {
        zaaw zaawVar = this.f40265OooO00o.get();
        if (zaawVar == null) {
            return;
        }
        Preconditions.checkState(Looper.myLooper() == zaawVar.f14342OooO00o.f14402OooOOo0.getLooper(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        Lock lock = zaawVar.f14343OooO0O0;
        lock.lock();
        try {
            if (zaawVar.OooO0oO(0)) {
                if (!connectionResult.isSuccess()) {
                    zaawVar.OooO0o0(connectionResult, this.f40266OooO0O0, this.f40267OooO0OO);
                }
                if (zaawVar.OooO0oo()) {
                    zaawVar.OooO0o();
                }
            }
        } finally {
            lock.unlock();
        }
    }
}
