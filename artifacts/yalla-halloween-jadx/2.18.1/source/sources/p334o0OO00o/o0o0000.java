package p334o0OO00o;

import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzap;
import com.google.android.gms.internal.measurement.zzg;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.internal.measurement.zzt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o0o0000 extends zzai {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final boolean f37441Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final boolean f37442Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ zzt f37443OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0o0000(zzt zztVar, boolean z, boolean z2) {
        super("log");
        this.f37443OoooO00 = zztVar;
        this.f37442Oooo0oo = z;
        this.f37441Oooo = z2;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        int i;
        zzh.zzi("log", 1, list);
        if (list.size() == 1) {
            this.f37443OoooO00.f16036Oooo0oo.zza(3, zzgVar.zzb((zzap) list.get(0)).zzi(), Collections.emptyList(), this.f37442Oooo0oo, this.f37441Oooo);
            return zzap.zzf;
        }
        int iZzb = zzh.zzb(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue());
        if (iZzb == 2) {
            i = 4;
        } else if (iZzb == 3) {
            i = 1;
        } else if (iZzb != 5) {
            i = iZzb != 6 ? 3 : 2;
        } else {
            i = 5;
        }
        String strZzi = zzgVar.zzb((zzap) list.get(1)).zzi();
        if (list.size() == 2) {
            this.f37443OoooO00.f16036Oooo0oo.zza(i, strZzi, Collections.emptyList(), this.f37442Oooo0oo, this.f37441Oooo);
            return zzap.zzf;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 2; i2 < Math.min(list.size(), 5); i2++) {
            arrayList.add(zzgVar.zzb((zzap) list.get(i2)).zzi());
        }
        this.f37443OoooO00.f16036Oooo0oo.zza(i, strZzi, arrayList, this.f37442Oooo0oo, this.f37441Oooo);
        return zzap.zzf;
    }
}
