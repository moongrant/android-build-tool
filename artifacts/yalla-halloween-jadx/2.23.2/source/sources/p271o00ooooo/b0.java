package p271o00ooooo;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzqo;
import kotlinx.coroutines.DebugKt;
import p271o00ooooo.b0;
import p271o00ooooo.c0;
import p271o00ooooo.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f40465OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ c0 f40466OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f40467OooO0o0;

    public b0(c0 c0Var, long j, long j2) {
        this.f40466OooO0o = c0Var;
        this.f40465OooO0Oo = j;
        this.f40467OooO0o0 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40466OooO0o.f40476OooO0O0.f40788OooO00o.zzaB().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzkj
            @Override // java.lang.Runnable
            public final void run() {
                b0 b0Var = this.zza;
                c0 c0Var = b0Var.f40466OooO0o;
                long j = b0Var.f40465OooO0Oo;
                c0Var.f40476OooO0O0.zzg();
                zzkp zzkpVar = c0Var.f40476OooO0O0;
                zzkpVar.f40788OooO00o.zzaA().zzc().zza("Application going to the background");
                zzgd zzgdVar = zzkpVar.f40788OooO00o;
                zzgdVar.zzm().f40779OooOOo0.zza(true);
                zzkpVar.zzg();
                zzkpVar.f15596OooO0Oo = true;
                if (!zzgdVar.zzf().zzu()) {
                    e0 e0Var = zzkpVar.f15597OooO0o;
                    e0Var.f40492OooO0OO.OooO00o();
                    e0Var.OooO00o(b0Var.f40467OooO0o0, false, false);
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
