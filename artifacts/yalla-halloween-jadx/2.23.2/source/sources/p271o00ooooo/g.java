package p271o00ooooo;

import com.google.android.gms.measurement.internal.zzjz;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends oO00O0oO {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzjz f40500OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(zzjz zzjzVar, oOO00000 ooo00000) {
        super(ooo00000);
        this.f40500OooO0o0 = zzjzVar;
    }

    @Override // p271o00ooooo.oO00O0oO
    public final void OooO0O0() {
        zzjz zzjzVar = this.f40500OooO0o0;
        zzjzVar.zzg();
        if (zzjzVar.zzL()) {
            zzjzVar.f40788OooO00o.zzaA().zzj().zza("Inactivity, disconnecting from the service");
            zzjzVar.zzs();
        }
    }
}
