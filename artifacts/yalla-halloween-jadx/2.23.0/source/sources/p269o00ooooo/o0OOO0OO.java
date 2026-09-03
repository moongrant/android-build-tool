package p269o00ooooo;

import android.content.ServiceConnection;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzbr;
import com.google.android.gms.measurement.internal.zzfk;
import com.google.android.gms.measurement.internal.zzfl;
import com.google.android.gms.measurement.internal.zzgd;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOO0OO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzbr f41232OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzfk f41233OooO0o0;

    public o0OOO0OO(zzfk zzfkVar, zzbr zzbrVar, ServiceConnection serviceConnection) {
        this.f41233OooO0o0 = zzfkVar;
        this.f41232OooO0Oo = zzbrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfk zzfkVar = this.f41233OooO0o0;
        zzfl zzflVar = zzfkVar.f15964OooO0O0;
        zzbr zzbrVar = this.f41232OooO0Oo;
        zzgd zzgdVar = zzflVar.f15965OooO00o;
        zzgdVar.zzaB().zzg();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", zzfkVar.f15963OooO00o);
        try {
            if (zzbrVar.zzd(bundle) == null) {
                zzgdVar.zzaA().zzd().zza("Install Referrer Service returned a null response");
            }
        } catch (Exception e) {
            zzgdVar.zzaA().zzd().zzb("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        zzgdVar.zzaB().zzg();
        throw new IllegalStateException("Unexpected call on client side");
    }
}
