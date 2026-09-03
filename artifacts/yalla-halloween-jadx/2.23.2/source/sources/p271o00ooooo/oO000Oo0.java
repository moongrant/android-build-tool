package p271o00ooooo;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzd;
import p190o00o0O.OooO;

/* JADX INFO: loaded from: classes3.dex */
public final class oO000Oo0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f40541OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zzd f40542OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f40543OooO0o0;

    public oO000Oo0(zzd zzdVar, String str, long j) {
        this.f40542OooO0o = zzdVar;
        this.f40541OooO0Oo = str;
        this.f40543OooO0o0 = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        zzd zzdVar = this.f40542OooO0o;
        zzdVar.zzg();
        String str = this.f40541OooO0Oo;
        Preconditions.checkNotEmpty(str);
        OooO oooO = zzdVar.f15417OooO0OO;
        boolean zIsEmpty = oooO.isEmpty();
        long j = this.f40543OooO0o0;
        if (zIsEmpty) {
            zzdVar.f15418OooO0Oo = j;
        }
        Integer num = (Integer) oooO.getOrDefault(str, null);
        if (num != null) {
            oooO.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (oooO.f38568OooO0o >= 100) {
            zzdVar.f40788OooO00o.zzaA().zzk().zza("Too many ads visible");
        } else {
            oooO.put(str, 1);
            zzdVar.f15416OooO0O0.put(str, Long.valueOf(j));
        }
    }
}
