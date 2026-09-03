package p269o00ooooo;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzha;
import com.google.android.gms.measurement.internal.zzhb;
import com.google.android.gms.measurement.internal.zzlh;
import com.google.android.gms.measurement.internal.zzq;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class oOOo0O00 implements Callable {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ zzq f41486OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ zzlh f41487OooO0O0;

    public oOOo0O00(zzlh zzlhVar, zzq zzqVar) {
        this.f41487OooO0O0 = zzlhVar;
        this.f41486OooO00o = zzqVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzq zzqVar = this.f41486OooO00o;
        String str = (String) Preconditions.checkNotNull(zzqVar.zza);
        zzlh zzlhVar = this.f41487OooO0O0;
        zzhb zzhbVarOooOooo = zzlhVar.OooOooo(str);
        zzha zzhaVar = zzha.ANALYTICS_STORAGE;
        if (zzhbVarOooOooo.zzj(zzhaVar) && zzhb.zzc(zzqVar.zzv, 100).zzj(zzhaVar)) {
            return zzlhVar.OooOooO(zzqVar).OooOo();
        }
        zzlhVar.zzaA().zzj().zza("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
