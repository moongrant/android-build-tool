package p334o0OO00o;

import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzap;
import com.google.android.gms.internal.measurement.zzau;
import com.google.android.gms.internal.measurement.zzg;
import com.google.android.gms.internal.measurement.zzh;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO implements Comparator {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ zzai f37221Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ zzg f37222Oooo0oO;

    public OooOOO(zzai zzaiVar, zzg zzgVar) {
        this.f37221Oooo0o = zzaiVar;
        this.f37222Oooo0oO = zzgVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzap zzapVar = (zzap) obj;
        zzap zzapVar2 = (zzap) obj2;
        zzai zzaiVar = this.f37221Oooo0o;
        zzg zzgVar = this.f37222Oooo0oO;
        if (zzapVar instanceof zzau) {
            return !(zzapVar2 instanceof zzau) ? 1 : 0;
        }
        if (zzapVar2 instanceof zzau) {
            return -1;
        }
        return zzaiVar == null ? zzapVar.zzi().compareTo(zzapVar2.zzi()) : (int) zzh.zza(zzaiVar.zza(zzgVar, Arrays.asList(zzapVar, zzapVar2)).zzh().doubleValue());
    }
}
