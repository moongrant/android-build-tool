package p271o00ooooo;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzej;
import com.google.android.gms.measurement.internal.zzjz;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzau f40503OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zzcf f40504OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f40505OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ zzjz f40506OooO0oO;

    public h(zzjz zzjzVar, zzau zzauVar, String str, zzcf zzcfVar) {
        this.f40506OooO0oO = zzjzVar;
        this.f40503OooO0Oo = zzauVar;
        this.f40505OooO0o0 = str;
        this.f40504OooO0o = zzcfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.measurement.internal.zzjz, o00ooooo.oOo00o00] */
    /* JADX WARN: Type inference failed for: r1v1, types: [o00ooooo.oOo00o00] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.measurement.internal.zzgd] */
    /* JADX WARN: Type inference failed for: r1v3, types: [o00ooooo.oOo00o00] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.google.android.gms.measurement.internal.zzgd] */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.google.android.gms.measurement.internal.zzlp] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // java.lang.Runnable
    public final void run() {
        zzcf zzcfVar = this.f40504OooO0o;
        ?? Zzv = this.f40506OooO0oO;
        byte[] bArrZzu = null;
        try {
            try {
                zzej zzejVar = Zzv.f15588OooO0Oo;
                if (zzejVar == null) {
                    Zzv.f40788OooO00o.zzaA().zzd().zza("Discarding data. Failed to send event to service to bundle");
                    Zzv = Zzv.f40788OooO00o;
                } else {
                    bArrZzu = zzejVar.zzu(this.f40503OooO0Oo, this.f40505OooO0o0);
                    Zzv.OooO();
                    Zzv = Zzv.f40788OooO00o;
                }
            } catch (RemoteException e) {
                Zzv.f40788OooO00o.zzaA().zzd().zzb("Failed to send event to the service to bundle", e);
                Zzv = Zzv.f40788OooO00o;
            }
            Zzv = Zzv.zzv();
        } finally {
            Zzv.f40788OooO00o.zzv().zzT(zzcfVar, bArrZzu);
        }
    }
}
