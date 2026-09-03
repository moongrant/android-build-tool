package p254o00ooOO0;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.zzb;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O000Oo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LifecycleCallback f40993OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zzb f40994OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f40995OooO0o0;

    public o0O000Oo(zzb zzbVar, LifecycleCallback lifecycleCallback, String str) {
        this.f40994OooO0o = zzbVar;
        this.f40993OooO0Oo = lifecycleCallback;
        this.f40995OooO0o0 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzb zzbVar = this.f40994OooO0o;
        int i = zzbVar.f14937OooO0o0;
        LifecycleCallback lifecycleCallback = this.f40993OooO0Oo;
        if (i > 0) {
            Bundle bundle = zzbVar.f14936OooO0o;
            lifecycleCallback.onCreate(bundle != null ? bundle.getBundle(this.f40995OooO0o0) : null);
        }
        if (zzbVar.f14937OooO0o0 >= 2) {
            lifecycleCallback.onStart();
        }
        if (zzbVar.f14937OooO0o0 >= 3) {
            lifecycleCallback.onResume();
        }
        if (zzbVar.f14937OooO0o0 >= 4) {
            lifecycleCallback.onStop();
        }
        if (zzbVar.f14937OooO0o0 >= 5) {
            lifecycleCallback.onDestroy();
        }
    }
}
