package p331o0O0oooO;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O000Oo implements BaseGmsClient.ConnectionProgressReportCallbacks {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final WeakReference<zaaw> f37082OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Api<?> f37083OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f37084OooO0OO;

    public o0O000Oo(zaaw zaawVar, Api<?> api, boolean z) {
        this.f37082OooO00o = new WeakReference<>(zaawVar);
        this.f37083OooO0O0 = api;
        this.f37084OooO0OO = z;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void onReportServiceBinding(@NonNull ConnectionResult connectionResult) {
        zaaw zaawVar = this.f37082OooO00o.get();
        if (zaawVar == null) {
            return;
        }
        Preconditions.checkState(Looper.myLooper() == zaawVar.f15319OooO00o.f15378OooOOO.getLooper(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        zaawVar.f15320OooO0O0.lock();
        try {
            if (zaawVar.OooO0oO(0)) {
                if (!connectionResult.isSuccess()) {
                    zaawVar.OooO0o0(connectionResult, this.f37083OooO0O0, this.f37084OooO0OO);
                }
                if (zaawVar.OooO0oo()) {
                    zaawVar.OooO0o();
                }
            }
        } finally {
            zaawVar.f15320OooO0O0.unlock();
        }
    }
}
