package p332o0O0oooO;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.zzb;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0OO implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f37155Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Object f37156OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f37157OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ Object f37158OoooO0O;

    public /* synthetic */ o0OOO0OO(Object obj, Object obj2, Object obj3, int i) {
        this.f37155Oooo = i;
        this.f37158OoooO0O = obj;
        this.f37157OoooO00 = obj2;
        this.f37156OoooO0 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37155Oooo) {
            case 0:
                zzb zzbVar = (zzb) this.f37158OoooO0O;
                if (zzbVar.f15457OoooO00 > 0) {
                    LifecycleCallback lifecycleCallback = (LifecycleCallback) this.f37157OoooO00;
                    Bundle bundle = zzbVar.f15456OoooO0;
                    lifecycleCallback.onCreate(bundle != null ? bundle.getBundle((String) this.f37156OoooO0) : null);
                }
                if (((zzb) this.f37158OoooO0O).f15457OoooO00 >= 2) {
                    ((LifecycleCallback) this.f37157OoooO00).onStart();
                }
                if (((zzb) this.f37158OoooO0O).f15457OoooO00 >= 3) {
                    ((LifecycleCallback) this.f37157OoooO00).onResume();
                }
                if (((zzb) this.f37158OoooO0O).f15457OoooO00 >= 4) {
                    ((LifecycleCallback) this.f37157OoooO00).onStop();
                }
                if (((zzb) this.f37158OoooO0O).f15457OoooO00 >= 5) {
                    ((LifecycleCallback) this.f37157OoooO00).onDestroy();
                }
                break;
            default:
                ((zzgq) this.f37158OoooO0O).f16243OooO00o.OooO00o();
                if (((zzac) this.f37157OoooO00).zzc.zza() != null) {
                    ((zzgq) this.f37158OoooO0O).f16243OooO00o.OooOOO0((zzac) this.f37157OoooO00, (zzq) this.f37156OoooO0);
                } else {
                    ((zzgq) this.f37158OoooO0O).f16243OooO00o.OooOO0((zzac) this.f37157OoooO00, (zzq) this.f37156OoooO0);
                }
                break;
        }
    }
}
