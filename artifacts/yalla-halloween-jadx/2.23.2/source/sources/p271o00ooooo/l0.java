package p271o00ooooo;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzfl;
import com.google.android.gms.measurement.internal.zzkb;
import com.google.android.gms.measurement.internal.zzks;
import com.google.android.gms.measurement.internal.zzlh;
import com.google.android.gms.measurement.internal.zzli;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzlh f40521OooO0Oo;

    public l0(zzlh zzlhVar, zzli zzliVar) {
        this.f40521OooO0Oo = zzlhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlh zzlhVar = this.f40521OooO0Oo;
        zzlhVar.zzaB().zzg();
        zzlhVar.f15614OooOO0O = new zzfl(zzlhVar);
        oO00O0o oo00o0o = new oO00O0o(zzlhVar);
        oo00o0o.zzX();
        zzlhVar.f15607OooO0OO = oo00o0o;
        zzlhVar.zzg().f15397OooO0OO = (oO000o00) Preconditions.checkNotNull(zzlhVar.f15605OooO00o);
        zzkb zzkbVar = new zzkb(zzlhVar);
        zzkbVar.zzX();
        zzlhVar.f15604OooO = zzkbVar;
        oO000Oo oo000oo = new oO000Oo(zzlhVar);
        oo000oo.zzX();
        zzlhVar.f15609OooO0o = oo000oo;
        oOOOoo00 oooooo00 = new oOOOoo00(zzlhVar);
        oooooo00.zzX();
        zzlhVar.f15612OooO0oo = oooooo00;
        zzks zzksVar = new zzks(zzlhVar);
        zzksVar.zzX();
        zzlhVar.f15610OooO0o0 = zzksVar;
        zzlhVar.f15608OooO0Oo = new oO0OO00o(zzlhVar);
        if (zzlhVar.f15621OooOOo0 != zzlhVar.f15620OooOOo) {
            zzlhVar.zzaA().zzd().zzc("Not all upload components initialized", Integer.valueOf(zzlhVar.f15621OooOOo0), Integer.valueOf(zzlhVar.f15620OooOOo));
        }
        zzlhVar.f15617OooOOO0 = true;
        zzlhVar.zzaB().zzg();
        oO00O0o oo00o0o2 = zzlhVar.f15607OooO0OO;
        zzlh.OooOoo(oo00o0o2);
        oo00o0o2.zzz();
        if (zzlhVar.f15604OooO.zzc.zza() == 0) {
            zzlhVar.f15604OooO.zzc.zzb(zzlhVar.zzax().currentTimeMillis());
        }
        zzlhVar.OooOo();
    }
}
