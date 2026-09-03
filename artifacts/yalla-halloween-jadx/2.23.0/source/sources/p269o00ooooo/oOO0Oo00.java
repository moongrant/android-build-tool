package p269o00ooooo;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzqo;
import kotlinx.coroutines.DebugKt;
import p269o00ooooo.oOO;
import p269o00ooooo.oOO0Oo00;
import p269o00ooooo.oOO0OoO0;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO0Oo00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f41468OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ oOO0OoO0 f41469OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f41470OooO0o0;

    public oOO0Oo00(oOO0OoO0 ooo0ooo0, long j, long j2) {
        this.f41469OooO0o = ooo0ooo0;
        this.f41468OooO0Oo = j;
        this.f41470OooO0o0 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41469OooO0o.f41472OooO0O0.f41276OooO00o.zzaB().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzkj
            @Override // java.lang.Runnable
            public final void run() {
                oOO0Oo00 ooo0oo00 = this.zza;
                oOO0OoO0 ooo0ooo0 = ooo0oo00.f41469OooO0o;
                long j = ooo0oo00.f41468OooO0Oo;
                ooo0ooo0.f41472OooO0O0.zzg();
                zzkp zzkpVar = ooo0ooo0.f41472OooO0O0;
                zzkpVar.f41276OooO00o.zzaA().zzc().zza("Application going to the background");
                zzgd zzgdVar = zzkpVar.f41276OooO00o;
                zzgdVar.zzm().f41223OooOOo0.zza(true);
                zzkpVar.zzg();
                zzkpVar.f16072OooO0Oo = true;
                if (!zzgdVar.zzf().zzu()) {
                    oOO ooo = zzkpVar.f16073OooO0o;
                    ooo.f41418OooO0OO.OooO00o();
                    ooo.OooO00o(ooo0oo00.f41470OooO0o0, false, false);
                }
                zzqo.zzc();
                if (zzgdVar.zzf().zzs(null, zzeg.zzaB)) {
                    zzgdVar.zzaA().zzi().zzb("Application backgrounded at: timestamp_millis", Long.valueOf(j));
                } else {
                    zzgdVar.zzq().OooO0Oo(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ab", new Bundle(), j);
                }
            }
        });
    }
}
