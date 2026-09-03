package p269o00ooooo;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzd;
import p188o00o0O.OooOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0OOO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f41155OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zzd f41156OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f41157OooO0o0;

    public o0O0OOO0(zzd zzdVar, String str, long j) {
        this.f41156OooO0o = zzdVar;
        this.f41155OooO0Oo = str;
        this.f41157OooO0o0 = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        zzd zzdVar = this.f41156OooO0o;
        zzdVar.zzg();
        String str = this.f41155OooO0Oo;
        Preconditions.checkNotEmpty(str);
        OooOO0 oooOO1 = zzdVar.f15893OooO0OO;
        boolean zIsEmpty = oooOO1.isEmpty();
        long j = this.f41157OooO0o0;
        if (zIsEmpty) {
            zzdVar.f15894OooO0Oo = j;
        }
        Integer num = (Integer) oooOO1.getOrDefault(str, null);
        if (num != null) {
            oooOO1.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (oooOO1.f38816OooO0o >= 100) {
            zzdVar.f41276OooO00o.zzaA().zzk().zza("Too many ads visible");
        } else {
            oooOO1.put(str, 1);
            zzdVar.f15892OooO0O0.put(str, Long.valueOf(j));
        }
    }
}
