package p254o00ooOO0;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.zzd;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O000o0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LifecycleCallback f40996OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zzd f40997OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f40998OooO0o0;

    public o0O000o0(zzd zzdVar, LifecycleCallback lifecycleCallback, String str) {
        this.f40997OooO0o = zzdVar;
        this.f40996OooO0Oo = lifecycleCallback;
        this.f40998OooO0o0 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzd zzdVar = this.f40997OooO0o;
        int i = zzdVar.f14941OooO0o0;
        LifecycleCallback lifecycleCallback = this.f40996OooO0Oo;
        if (i > 0) {
            Bundle bundle = zzdVar.f14940OooO0o;
            lifecycleCallback.onCreate(bundle != null ? bundle.getBundle(this.f40998OooO0o0) : null);
        }
        if (zzdVar.f14941OooO0o0 >= 2) {
            lifecycleCallback.onStart();
        }
        if (zzdVar.f14941OooO0o0 >= 3) {
            lifecycleCallback.onResume();
        }
        if (zzdVar.f14941OooO0o0 >= 4) {
            lifecycleCallback.onStop();
        }
        if (zzdVar.f14941OooO0o0 >= 5) {
            lifecycleCallback.onDestroy();
        }
    }
}
