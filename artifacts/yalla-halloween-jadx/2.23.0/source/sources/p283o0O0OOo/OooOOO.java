package p283o0O0OOo;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import o0O0OOOo.OooO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO implements OooOOO0, OooOO0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOo00 f42087OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Object f42088OooO0o = new Object();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final TimeUnit f42089OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public CountDownLatch f42090OooO0oO;

    public OooOOO(@NonNull OooOo00 oooOo00, TimeUnit timeUnit) {
        this.f42087OooO0Oo = oooOo00;
        this.f42089OooO0o0 = timeUnit;
    }

    @Override // p283o0O0OOo.OooOOO0
    public final void OooO0O0(@NonNull Bundle bundle, @NonNull String str) {
        CountDownLatch countDownLatch = this.f42090OooO0oO;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    @Override // p283o0O0OOo.OooOO0O
    public final void OooO0OO(@Nullable Bundle bundle) {
        synchronized (this.f42088OooO0o) {
            OooO oooO = OooO.f42075OooO00o;
            oooO.OooO0OO("Logging event _ae to Firebase Analytics with params " + bundle);
            this.f42090OooO0oO = new CountDownLatch(1);
            this.f42087OooO0Oo.OooO0OO(bundle);
            oooO.OooO0OO("Awaiting app exception callback from Analytics...");
            try {
                if (this.f42090OooO0oO.await(500, this.f42089OooO0o0)) {
                    oooO.OooO0OO("App exception callback received from Analytics listener.");
                } else {
                    oooO.OooO0Oo("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                }
            } catch (InterruptedException unused) {
                Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
            }
            this.f42090OooO0oO = null;
        }
    }
}
