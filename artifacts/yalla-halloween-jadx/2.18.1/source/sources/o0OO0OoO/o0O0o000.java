package o0OO0OoO;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzfg;
import com.google.android.gms.measurement.internal.zzju;
import com.google.android.gms.measurement.internal.zzkl;
import com.google.android.gms.measurement.internal.zzkz;
import com.google.android.gms.measurement.internal.zzla;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0o000 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ zzkz f37800Oooo0o;

    public o0O0o000(zzkz zzkzVar, zzla zzlaVar) {
        this.f37800Oooo0o = zzkzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkz zzkzVar = this.f37800Oooo0o;
        zzkzVar.zzaz().zzg();
        zzkzVar.f16293OooOO0O = new zzfg(zzkzVar);
        OooOO0O oooOO0O = new OooOO0O(zzkzVar);
        oooOO0O.zzX();
        zzkzVar.f16286OooO0OO = oooOO0O;
        zzkzVar.zzg().f16076OooO0OO = (OooO0o) Preconditions.checkNotNull(zzkzVar.f16284OooO00o);
        zzju zzjuVar = new zzju(zzkzVar);
        zzjuVar.zzX();
        zzkzVar.f16283OooO = zzjuVar;
        OooO0OO oooO0OO = new OooO0OO(zzkzVar);
        oooO0OO.zzX();
        zzkzVar.f16288OooO0o = oooO0OO;
        o00OO000 o00oo001 = new o00OO000(zzkzVar);
        o00oo001.zzX();
        zzkzVar.f16291OooO0oo = o00oo001;
        zzkl zzklVar = new zzkl(zzkzVar);
        zzklVar.zzX();
        zzkzVar.f16289OooO0o0 = zzklVar;
        zzkzVar.f16287OooO0Oo = new o0OO00O(zzkzVar);
        if (zzkzVar.f16300OooOOo0 != zzkzVar.f16299OooOOo) {
            zzkzVar.zzay().zzd().zzc("Not all upload components initialized", Integer.valueOf(zzkzVar.f16300OooOOo0), Integer.valueOf(zzkzVar.f16299OooOOo));
        }
        zzkzVar.f16296OooOOO0 = true;
        zzkz zzkzVar2 = this.f37800Oooo0o;
        zzkzVar2.zzaz().zzg();
        OooOO0O oooOO0O2 = zzkzVar2.f16286OooO0OO;
        zzkz.OooOooO(oooOO0O2);
        oooOO0O2.zzz();
        if (zzkzVar2.f16283OooO.zzc.zza() == 0) {
            zzkzVar2.f16283OooO.zzc.zzb(zzkzVar2.zzav().currentTimeMillis());
        }
        zzkzVar2.OooOoO0();
    }
}
