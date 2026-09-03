package p331o0O0oooO;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.zzb;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOOO00 implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Object f37134Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f37135Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f37136Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f37137Oooo0oo;

    public /* synthetic */ o0OOOO00(Object obj, Object obj2, Object obj3, int i) {
        this.f37135Oooo0o = i;
        this.f37134Oooo = obj;
        this.f37136Oooo0oO = obj2;
        this.f37137Oooo0oo = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37135Oooo0o) {
            case 0:
                zzb zzbVar = (zzb) this.f37134Oooo;
                if (zzbVar.f15438Oooo0oO > 0) {
                    LifecycleCallback lifecycleCallback = (LifecycleCallback) this.f37136Oooo0oO;
                    Bundle bundle = zzbVar.f15439Oooo0oo;
                    lifecycleCallback.onCreate(bundle != null ? bundle.getBundle((String) this.f37137Oooo0oo) : null);
                }
                if (((zzb) this.f37134Oooo).f15438Oooo0oO >= 2) {
                    ((LifecycleCallback) this.f37136Oooo0oO).onStart();
                }
                if (((zzb) this.f37134Oooo).f15438Oooo0oO >= 3) {
                    ((LifecycleCallback) this.f37136Oooo0oO).onResume();
                }
                if (((zzb) this.f37134Oooo).f15438Oooo0oO >= 4) {
                    ((LifecycleCallback) this.f37136Oooo0oO).onStop();
                }
                if (((zzb) this.f37134Oooo).f15438Oooo0oO >= 5) {
                    ((LifecycleCallback) this.f37136Oooo0oO).onDestroy();
                }
                break;
            default:
                ((zzgq) this.f37134Oooo).f16225OooO00o.OooO00o();
                if (((zzac) this.f37136Oooo0oO).zzc.zza() != null) {
                    ((zzgq) this.f37134Oooo).f16225OooO00o.OooOOO0((zzac) this.f37136Oooo0oO, (zzq) this.f37137Oooo0oo);
                } else {
                    ((zzgq) this.f37134Oooo).f16225OooO00o.OooOO0((zzac) this.f37136Oooo0oO, (zzq) this.f37137Oooo0oo);
                }
                break;
        }
    }
}
