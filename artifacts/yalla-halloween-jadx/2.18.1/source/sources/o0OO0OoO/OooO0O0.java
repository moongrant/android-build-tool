package o0OO0OoO;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzd;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ String f37478Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ long f37479Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ zzd f37480Oooo0oo;

    public OooO0O0(zzd zzdVar, String str, long j) {
        this.f37480Oooo0oo = zzdVar;
        this.f37478Oooo0o = str;
        this.f37479Oooo0oO = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        zzd zzdVar = this.f37480Oooo0oo;
        String str = this.f37478Oooo0o;
        long j = this.f37479Oooo0oO;
        zzdVar.zzg();
        Preconditions.checkNotEmpty(str);
        if (zzdVar.f16097OooO0OO.isEmpty()) {
            zzdVar.f16098OooO0Oo = j;
        }
        Integer num = (Integer) zzdVar.f16097OooO0OO.getOrDefault(str, null);
        if (num != null) {
            zzdVar.f16097OooO0OO.put(str, Integer.valueOf(num.intValue() + 1));
            return;
        }
        p021OooOooo.Oooo0 oooo0 = zzdVar.f16097OooO0OO;
        if (oooo0.f421Oooo0oo >= 100) {
            OooO00o.OooO0O0(zzdVar.f37615OooO00o, "Too many ads visible");
        } else {
            oooo0.put(str, 1);
            zzdVar.f16096OooO0O0.put(str, Long.valueOf(j));
        }
    }
}
