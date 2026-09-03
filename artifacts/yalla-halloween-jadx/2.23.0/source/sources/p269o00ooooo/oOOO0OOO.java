package p269o00ooooo;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzfl;
import com.google.android.gms.measurement.internal.zzkb;
import com.google.android.gms.measurement.internal.zzks;
import com.google.android.gms.measurement.internal.zzlh;
import com.google.android.gms.measurement.internal.zzli;

/* JADX INFO: loaded from: classes3.dex */
public final class oOOO0OOO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzlh f41481OooO0Oo;

    public oOOO0OOO(zzlh zzlhVar, zzli zzliVar) {
        this.f41481OooO0Oo = zzlhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlh zzlhVar = this.f41481OooO0Oo;
        zzlhVar.zzaB().zzg();
        zzlhVar.f16090OooOO0O = new zzfl(zzlhVar);
        o0O0o0 o0o0o0 = new o0O0o0(zzlhVar);
        o0o0o0.zzX();
        zzlhVar.f16083OooO0OO = o0o0o0;
        zzlhVar.zzg().f15873OooO0OO = (oo0OOoo) Preconditions.checkNotNull(zzlhVar.f16081OooO00o);
        zzkb zzkbVar = new zzkb(zzlhVar);
        zzkbVar.zzX();
        zzlhVar.f16080OooO = zzkbVar;
        o0O0OOOo o0o0oooo = new o0O0OOOo(zzlhVar);
        o0o0oooo.zzX();
        zzlhVar.f16085OooO0o = o0o0oooo;
        oO0O00O oo0o00o = new oO0O00O(zzlhVar);
        oo0o00o.zzX();
        zzlhVar.f16088OooO0oo = oo0o00o;
        zzks zzksVar = new zzks(zzlhVar);
        zzksVar.zzX();
        zzlhVar.f16086OooO0o0 = zzksVar;
        zzlhVar.f16084OooO0Oo = new o0OOO00(zzlhVar);
        if (zzlhVar.f16097OooOOo0 != zzlhVar.f16096OooOOo) {
            zzlhVar.zzaA().zzd().zzc("Not all upload components initialized", Integer.valueOf(zzlhVar.f16097OooOOo0), Integer.valueOf(zzlhVar.f16096OooOOo));
        }
        zzlhVar.f16093OooOOO0 = true;
        zzlhVar.zzaB().zzg();
        o0O0o0 o0o0o1 = zzlhVar.f16083OooO0OO;
        zzlh.OooOoo(o0o0o1);
        o0o0o1.zzz();
        if (zzlhVar.f16080OooO.zzc.zza() == 0) {
            zzlhVar.f16080OooO.zzc.zzb(zzlhVar.zzax().currentTimeMillis());
        }
        zzlhVar.OooOo();
    }
}
