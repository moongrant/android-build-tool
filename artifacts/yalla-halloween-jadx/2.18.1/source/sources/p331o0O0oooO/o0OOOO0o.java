package p331o0O0oooO;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.zzd;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOOO0o implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ LifecycleCallback f37138Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f37139Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ zzd f37140Oooo0oo;

    public o0OOOO0o(zzd zzdVar, LifecycleCallback lifecycleCallback, String str) {
        this.f37140Oooo0oo = zzdVar;
        this.f37138Oooo0o = lifecycleCallback;
        this.f37139Oooo0oO = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzd zzdVar = this.f37140Oooo0oo;
        if (zzdVar.f15442Oooo0oO > 0) {
            LifecycleCallback lifecycleCallback = this.f37138Oooo0o;
            Bundle bundle = zzdVar.f15443Oooo0oo;
            lifecycleCallback.onCreate(bundle != null ? bundle.getBundle(this.f37139Oooo0oO) : null);
        }
        if (this.f37140Oooo0oo.f15442Oooo0oO >= 2) {
            this.f37138Oooo0o.onStart();
        }
        if (this.f37140Oooo0oo.f15442Oooo0oO >= 3) {
            this.f37138Oooo0o.onResume();
        }
        if (this.f37140Oooo0oo.f15442Oooo0oO >= 4) {
            this.f37138Oooo0o.onStop();
        }
        if (this.f37140Oooo0oo.f15442Oooo0oO >= 5) {
            this.f37138Oooo0o.onDestroy();
        }
    }
}
