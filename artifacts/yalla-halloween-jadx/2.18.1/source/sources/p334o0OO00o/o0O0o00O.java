package p334o0OO00o;

import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzap;
import com.google.android.gms.internal.measurement.zzat;
import com.google.android.gms.internal.measurement.zzg;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.internal.measurement.zzo;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0o00O extends zzai {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ zzo f37404Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o00O(zzo zzoVar) {
        super("getValue");
        this.f37404Oooo0oo = zzoVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        zzh.zzh("getValue", 2, list);
        zzap zzapVarZzb = zzgVar.zzb((zzap) list.get(0));
        zzap zzapVarZzb2 = zzgVar.zzb((zzap) list.get(1));
        String strZza = this.f37404Oooo0oo.zza(zzapVarZzb.zzi());
        return strZza != null ? new zzat(strZza) : zzapVarZzb2;
    }
}
