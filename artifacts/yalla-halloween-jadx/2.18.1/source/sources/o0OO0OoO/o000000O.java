package o0OO0OoO;

import com.google.android.gms.internal.measurement.zzr;
import com.google.android.gms.measurement.internal.zzem;
import com.google.android.gms.measurement.internal.zzfp;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000O implements zzr {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ zzfp f37538OooO00o;

    public o000000O(zzfp zzfpVar) {
        this.f37538OooO00o = zzfpVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i, String str, List list, boolean z, boolean z2) {
        zzem zzemVarZzc;
        int i2 = i - 1;
        if (i2 == 0) {
            zzemVarZzc = this.f37538OooO00o.f37615OooO00o.zzay().zzc();
        } else if (i2 != 1) {
            if (i2 == 3) {
                zzemVarZzc = this.f37538OooO00o.f37615OooO00o.zzay().zzj();
            } else if (i2 != 4) {
                zzemVarZzc = this.f37538OooO00o.f37615OooO00o.zzay().zzi();
            } else if (z) {
                zzemVarZzc = this.f37538OooO00o.f37615OooO00o.zzay().zzm();
            } else {
                zzemVarZzc = !z2 ? this.f37538OooO00o.f37615OooO00o.zzay().zzl() : this.f37538OooO00o.f37615OooO00o.zzay().zzk();
            }
        } else if (z) {
            zzemVarZzc = this.f37538OooO00o.f37615OooO00o.zzay().zzh();
        } else {
            zzemVarZzc = !z2 ? this.f37538OooO00o.f37615OooO00o.zzay().zze() : this.f37538OooO00o.f37615OooO00o.zzay().zzd();
        }
        int size = list.size();
        if (size == 1) {
            zzemVarZzc.zzb(str, list.get(0));
            return;
        }
        if (size == 2) {
            zzemVarZzc.zzc(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzemVarZzc.zza(str);
        } else {
            zzemVarZzc.zzd(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
