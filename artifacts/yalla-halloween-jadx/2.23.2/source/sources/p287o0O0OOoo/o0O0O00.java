package p287o0O0OOoo;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p286o0O0OOoO.o0OOO0o;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0O00 implements oo0o0Oo, o0OO00O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000000 f41447OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Object f41448OooO0o = new Object();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final TimeUnit f41449OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public CountDownLatch f41450OooO0oO;

    public o0O0O00(@NonNull o000000 o000000Var, TimeUnit timeUnit) {
        this.f41447OooO0Oo = o000000Var;
        this.f41449OooO0o0 = timeUnit;
    }

    @Override // p287o0O0OOoo.o0OO00O
    public final void OooO00o(@Nullable Bundle bundle) {
        synchronized (this.f41448OooO0o) {
            o0OOO0o o0ooo0o2 = o0OOO0o.f41436OooO00o;
            o0ooo0o2.OooO0OO("Logging event _ae to Firebase Analytics with params " + bundle);
            this.f41450OooO0oO = new CountDownLatch(1);
            this.f41447OooO0Oo.OooO00o(bundle);
            o0ooo0o2.OooO0OO("Awaiting app exception callback from Analytics...");
            try {
                if (this.f41450OooO0oO.await(500, this.f41449OooO0o0)) {
                    o0ooo0o2.OooO0OO("App exception callback received from Analytics listener.");
                } else {
                    o0ooo0o2.OooO0Oo("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                }
            } catch (InterruptedException unused) {
                Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
            }
            this.f41450OooO0oO = null;
        }
    }

    @Override // p287o0O0OOoo.oo0o0Oo
    public final void OooO0O0(@NonNull Bundle bundle, @NonNull String str) {
        CountDownLatch countDownLatch = this.f41450OooO0oO;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
