package p322o0O0oo;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
public final class OooO extends Thread {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final WeakReference<AdvertisingIdClient> f36887Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final long f36888Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final CountDownLatch f36889Oooo0oo = new CountDownLatch(1);

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f36886Oooo = false;

    public OooO(AdvertisingIdClient advertisingIdClient, long j) {
        this.f36887Oooo0o = new WeakReference<>(advertisingIdClient);
        this.f36888Oooo0oO = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AdvertisingIdClient advertisingIdClient;
        try {
            if (this.f36889Oooo0oo.await(this.f36888Oooo0oO, TimeUnit.MILLISECONDS) || (advertisingIdClient = this.f36887Oooo0o.get()) == null) {
                return;
            }
            advertisingIdClient.zza();
            this.f36886Oooo = true;
        } catch (InterruptedException unused) {
            AdvertisingIdClient advertisingIdClient2 = this.f36887Oooo0o.get();
            if (advertisingIdClient2 != null) {
                advertisingIdClient2.zza();
                this.f36886Oooo = true;
            }
        }
    }
}
