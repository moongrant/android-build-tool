package p250o00ooO00;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
public final class o000O0Oo extends Thread {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final WeakReference<AdvertisingIdClient> f40894OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f40896OooO0o0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final CountDownLatch f40895OooO0o = new CountDownLatch(1);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f40897OooO0oO = false;

    public o000O0Oo(AdvertisingIdClient advertisingIdClient, long j) {
        this.f40894OooO0Oo = new WeakReference<>(advertisingIdClient);
        this.f40896OooO0o0 = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AdvertisingIdClient advertisingIdClient;
        WeakReference<AdvertisingIdClient> weakReference = this.f40894OooO0Oo;
        try {
            if (this.f40895OooO0o.await(this.f40896OooO0o0, TimeUnit.MILLISECONDS) || (advertisingIdClient = weakReference.get()) == null) {
                return;
            }
            advertisingIdClient.zza();
            this.f40897OooO0oO = true;
        } catch (InterruptedException unused) {
            AdvertisingIdClient advertisingIdClient2 = weakReference.get();
            if (advertisingIdClient2 != null) {
                advertisingIdClient2.zza();
                this.f40897OooO0oO = true;
            }
        }
    }
}
