package p269o00ooooo;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzd;
import com.google.android.gms.measurement.internal.zzgd;
import com.google.android.gms.measurement.internal.zzir;
import p188o00o0O.OooOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO000o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f41189OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zzd f41190OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f41191OooO0o0;

    public o0OO000o(zzd zzdVar, String str, long j) {
        this.f41190OooO0o = zzdVar;
        this.f41189OooO0Oo = str;
        this.f41191OooO0o0 = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        zzd zzdVar = this.f41190OooO0o;
        zzdVar.zzg();
        String str = this.f41189OooO0Oo;
        Preconditions.checkNotEmpty(str);
        OooOO0 oooOO1 = zzdVar.f15893OooO0OO;
        Integer num = (Integer) oooOO1.getOrDefault(str, null);
        zzgd zzgdVar = zzdVar.f41276OooO00o;
        if (num == null) {
            zzgdVar.zzaA().zzd().zzb("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        zzir zzirVarZzj = zzgdVar.zzs().zzj(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            oooOO1.put(str, Integer.valueOf(iIntValue));
            return;
        }
        oooOO1.remove(str);
        OooOO0 oooOO2 = zzdVar.f15892OooO0O0;
        Long l = (Long) oooOO2.getOrDefault(str, null);
        long j = this.f41191OooO0o0;
        if (l == null) {
            o0O0OO0.OooO00o(zzgdVar, "First ad unit exposure time was never set");
        } else {
            long jLongValue = j - l.longValue();
            oooOO2.remove(str);
            zzdVar.OooO0O0(str, jLongValue, zzirVarZzj);
        }
        if (oooOO1.isEmpty()) {
            long j2 = zzdVar.f15894OooO0Oo;
            if (j2 == 0) {
                o0O0OO0.OooO00o(zzgdVar, "First ad exposure time was never set");
            } else {
                zzdVar.OooO00o(j - j2, zzirVarZzj);
                zzdVar.f15894OooO0Oo = 0L;
            }
        }
    }
}
