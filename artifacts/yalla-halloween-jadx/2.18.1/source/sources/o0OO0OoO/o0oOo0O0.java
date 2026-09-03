package o0OO0OoO;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzkz;
import com.google.android.gms.measurement.internal.zzq;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0oOo0O0 implements Callable {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ zzq f37878OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ zzkz f37879OooO0O0;

    public o0oOo0O0(zzkz zzkzVar, zzq zzqVar) {
        this.f37879OooO0O0 = zzkzVar;
        this.f37878OooO00o = zzqVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzai zzaiVarOooo000 = this.f37879OooO0O0.Oooo000((String) Preconditions.checkNotNull(this.f37878OooO00o.zza));
        zzah zzahVar = zzah.ANALYTICS_STORAGE;
        if (zzaiVarOooo000.zzi(zzahVar) && zzai.zzb(this.f37878OooO00o.zzv).zzi(zzahVar)) {
            return this.f37879OooO0O0.OooOooo(this.f37878OooO00o).Oooo0o();
        }
        this.f37879OooO0O0.zzay().zzj().zza("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
