package o0OO0OoO;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzd;
import com.google.android.gms.measurement.internal.zzik;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ String f37514Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ long f37515Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ zzd f37516Oooo0oo;

    public OooOo(zzd zzdVar, String str, long j) {
        this.f37516Oooo0oo = zzdVar;
        this.f37514Oooo0o = str;
        this.f37515Oooo0oO = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        zzd zzdVar = this.f37516Oooo0oo;
        String str = this.f37514Oooo0o;
        long j = this.f37515Oooo0oO;
        zzdVar.zzg();
        Preconditions.checkNotEmpty(str);
        Integer num = (Integer) zzdVar.f16097OooO0OO.getOrDefault(str, null);
        if (num == null) {
            zzdVar.f37615OooO00o.zzay().zzd().zzb("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        zzik zzikVarZzj = zzdVar.f37615OooO00o.zzs().zzj(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            zzdVar.f16097OooO0OO.put(str, Integer.valueOf(iIntValue));
            return;
        }
        zzdVar.f16097OooO0OO.remove(str);
        Long l = (Long) zzdVar.f16096OooO0O0.getOrDefault(str, null);
        if (l == null) {
            p167o00Ooo.OooOO0.OooO0O0(zzdVar.f37615OooO00o, "First ad unit exposure time was never set");
        } else {
            long jLongValue = l.longValue();
            zzdVar.f16096OooO0O0.remove(str);
            zzdVar.OooO0O0(str, j - jLongValue, zzikVarZzj);
        }
        if (zzdVar.f16097OooO0OO.isEmpty()) {
            long j2 = zzdVar.f16098OooO0Oo;
            if (j2 == 0) {
                p167o00Ooo.OooOO0.OooO0O0(zzdVar.f37615OooO00o, "First ad exposure time was never set");
            } else {
                zzdVar.OooO00o(j - j2, zzikVarZzj);
                zzdVar.f16098OooO0Oo = 0L;
            }
        }
    }
}
