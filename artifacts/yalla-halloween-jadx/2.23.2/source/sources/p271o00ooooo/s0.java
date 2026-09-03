package p271o00ooooo;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.measurement.internal.zzeg;
import com.google.android.gms.measurement.internal.zzlh;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public zzgd f40836OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ArrayList f40837OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public ArrayList f40838OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f40839OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzlh f40840OooO0o0;

    public /* synthetic */ s0(zzlh zzlhVar) {
        this.f40840OooO0o0 = zzlhVar;
    }

    public final boolean OooO00o(long j, zzft zzftVar) {
        Preconditions.checkNotNull(zzftVar);
        if (this.f40838OooO0OO == null) {
            this.f40838OooO0OO = new ArrayList();
        }
        if (this.f40837OooO0O0 == null) {
            this.f40837OooO0O0 = new ArrayList();
        }
        if (!this.f40838OooO0OO.isEmpty() && ((((zzft) this.f40838OooO0OO.get(0)).zzd() / 1000) / 60) / 60 != ((zzftVar.zzd() / 1000) / 60) / 60) {
            return false;
        }
        long jZzbz = this.f40839OooO0Oo + ((long) zzftVar.zzbz());
        zzlh zzlhVar = this.f40840OooO0o0;
        zzlhVar.zzg();
        if (jZzbz >= Math.max(0, ((Integer) zzeg.zzi.zza(null)).intValue())) {
            return false;
        }
        this.f40839OooO0Oo = jZzbz;
        this.f40838OooO0OO.add(zzftVar);
        this.f40837OooO0O0.add(Long.valueOf(j));
        int size = this.f40838OooO0OO.size();
        zzlhVar.zzg();
        return size < Math.max(1, ((Integer) zzeg.zzj.zza(null)).intValue());
    }
}
