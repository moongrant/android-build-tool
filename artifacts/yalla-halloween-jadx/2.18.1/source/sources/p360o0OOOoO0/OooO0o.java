package p360o0OOOoO0;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p228o00oOo.o0000OO0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o implements OooO0OO, OooO0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOO0 f38392OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public CountDownLatch f38393OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Object f38394OooO0o0;

    public OooO0o(@NonNull OooOO0 oooOO1) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f38394OooO0o0 = new Object();
        this.f38392OooO0Oo = oooOO1;
    }

    @Override // p360o0OOOoO0.OooO0O0
    public final void OooO0O0(@Nullable Bundle bundle) {
        synchronized (this.f38394OooO0o0) {
            o0000OO0 o0000oo1 = o0000OO0.f33887OooO00o;
            o0000oo1.OooOO0o("Logging event _ae to Firebase Analytics with params " + bundle);
            this.f38393OooO0o = new CountDownLatch(1);
            this.f38392OooO0Oo.OooO0O0(bundle);
            o0000oo1.OooOO0o("Awaiting app exception callback from Analytics...");
            try {
                if (this.f38393OooO0o.await(500, TimeUnit.MILLISECONDS)) {
                    o0000oo1.OooOO0o("App exception callback received from Analytics listener.");
                } else {
                    o0000oo1.OooOOO0("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                }
            } catch (InterruptedException unused) {
                Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
            }
            this.f38393OooO0o = null;
        }
    }

    @Override // p360o0OOOoO0.OooO0OO
    public final void OooO0OO(@NonNull String str, @NonNull Bundle bundle) {
        CountDownLatch countDownLatch = this.f38393OooO0o;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
