package o0OO0OoO;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzkz;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ zzq f37549Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ zzgq f37550Oooo0oO;

    public o0000O(zzgq zzgqVar, zzq zzqVar) {
        this.f37550Oooo0oO = zzgqVar;
        this.f37549Oooo0o = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37550Oooo0oO.f16225OooO00o.OooO00o();
        zzkz zzkzVar = this.f37550Oooo0oO.f16225OooO00o;
        zzq zzqVar = this.f37549Oooo0o;
        zzkzVar.zzaz().zzg();
        zzkzVar.OooO0O0();
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzkzVar.OooOooo(zzqVar);
    }
}
