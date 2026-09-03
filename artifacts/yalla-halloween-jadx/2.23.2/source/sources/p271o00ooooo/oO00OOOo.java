package p271o00ooooo;

import androidx.media3.session.o00O00;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzd;
import com.google.android.gms.measurement.internal.zzgd;
import com.google.android.gms.measurement.internal.zzir;
import p190o00o0O.OooO;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00OOOo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f40571OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zzd f40572OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f40573OooO0o0;

    public oO00OOOo(zzd zzdVar, String str, long j) {
        this.f40572OooO0o = zzdVar;
        this.f40571OooO0Oo = str;
        this.f40573OooO0o0 = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        zzd zzdVar = this.f40572OooO0o;
        zzdVar.zzg();
        String str = this.f40571OooO0Oo;
        Preconditions.checkNotEmpty(str);
        OooO oooO = zzdVar.f15417OooO0OO;
        Integer num = (Integer) oooO.getOrDefault(str, null);
        zzgd zzgdVar = zzdVar.f40788OooO00o;
        if (num == null) {
            zzgdVar.zzaA().zzd().zzb("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        zzir zzirVarZzj = zzgdVar.zzs().zzj(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            oooO.put(str, Integer.valueOf(iIntValue));
            return;
        }
        oooO.remove(str);
        OooO oooO2 = zzdVar.f15416OooO0O0;
        Long l = (Long) oooO2.getOrDefault(str, null);
        long j = this.f40573OooO0o0;
        if (l == null) {
            o00O00.OooO00o(zzgdVar, "First ad unit exposure time was never set");
        } else {
            long jLongValue = j - l.longValue();
            oooO2.remove(str);
            zzdVar.OooO0O0(str, jLongValue, zzirVarZzj);
        }
        if (oooO.isEmpty()) {
            long j2 = zzdVar.f15418OooO0Oo;
            if (j2 == 0) {
                o00O00.OooO00o(zzgdVar, "First ad exposure time was never set");
            } else {
                zzdVar.OooO00o(j - j2, zzirVarZzj);
                zzdVar.f15418OooO0Oo = 0L;
            }
        }
    }
}
