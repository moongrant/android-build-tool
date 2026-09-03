package p269o00ooooo;

import com.google.android.gms.internal.measurement.zzr;
import com.google.android.gms.measurement.internal.zzer;
import com.google.android.gms.measurement.internal.zzfu;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOOO0o implements zzr {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ zzfu f41235OooO00o;

    public o0OOOO0o(zzfu zzfuVar) {
        this.f41235OooO00o = zzfuVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i, String str, List list, boolean z, boolean z2) {
        zzer zzerVarZzc;
        int i2 = i - 1;
        zzfu zzfuVar = this.f41235OooO00o;
        if (i2 == 0) {
            zzerVarZzc = zzfuVar.f41276OooO00o.zzaA().zzc();
        } else if (i2 != 1) {
            if (i2 == 3) {
                zzerVarZzc = zzfuVar.f41276OooO00o.zzaA().zzj();
            } else if (i2 != 4) {
                zzerVarZzc = zzfuVar.f41276OooO00o.zzaA().zzi();
            } else if (z) {
                zzerVarZzc = zzfuVar.f41276OooO00o.zzaA().zzm();
            } else {
                zzerVarZzc = !z2 ? zzfuVar.f41276OooO00o.zzaA().zzl() : zzfuVar.f41276OooO00o.zzaA().zzk();
            }
        } else if (z) {
            zzerVarZzc = zzfuVar.f41276OooO00o.zzaA().zzh();
        } else {
            zzerVarZzc = !z2 ? zzfuVar.f41276OooO00o.zzaA().zze() : zzfuVar.f41276OooO00o.zzaA().zzd();
        }
        int size = list.size();
        if (size == 1) {
            zzerVarZzc.zzb(str, list.get(0));
            return;
        }
        if (size == 2) {
            zzerVarZzc.zzc(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzerVarZzc.zza(str);
        } else {
            zzerVarZzc.zzd(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
