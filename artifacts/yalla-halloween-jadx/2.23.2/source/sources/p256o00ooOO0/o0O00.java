package p256o00ooOO0;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.zzb;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LifecycleCallback f40314OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zzb f40315OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f40316OooO0o0;

    public o0O00(zzb zzbVar, LifecycleCallback lifecycleCallback, String str) {
        this.f40315OooO0o = zzbVar;
        this.f40314OooO0Oo = lifecycleCallback;
        this.f40316OooO0o0 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzb zzbVar = this.f40315OooO0o;
        int i = zzbVar.f14461OooO0o0;
        LifecycleCallback lifecycleCallback = this.f40314OooO0Oo;
        if (i > 0) {
            Bundle bundle = zzbVar.f14460OooO0o;
            lifecycleCallback.onCreate(bundle != null ? bundle.getBundle(this.f40316OooO0o0) : null);
        }
        if (zzbVar.f14461OooO0o0 >= 2) {
            lifecycleCallback.onStart();
        }
        if (zzbVar.f14461OooO0o0 >= 3) {
            lifecycleCallback.onResume();
        }
        if (zzbVar.f14461OooO0o0 >= 4) {
            lifecycleCallback.onStop();
        }
        if (zzbVar.f14461OooO0o0 >= 5) {
            lifecycleCallback.onDestroy();
        }
    }
}
