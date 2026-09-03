package o0OO0OoO;

import com.google.android.gms.measurement.internal.zzjs;

/* JADX INFO: loaded from: classes2.dex */
public final class o0oOOo extends OooOOO {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzjs f37877OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOOo(zzjs zzjsVar, o000O0O0 o000o0o1) {
        super(o000o0o1);
        this.f37877OooO0o0 = zzjsVar;
    }

    @Override // o0OO0OoO.OooOOO
    public final void OooO0O0() {
        zzjs zzjsVar = this.f37877OooO0o0;
        zzjsVar.zzg();
        if (zzjsVar.zzL()) {
            zzjsVar.f37615OooO00o.zzay().zzj().zza("Inactivity, disconnecting from the service");
            zzjsVar.zzs();
        }
    }
}
