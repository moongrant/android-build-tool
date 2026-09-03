package o0OO0OoO;

import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzlc;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: loaded from: classes2.dex */
public final class o000Oo0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ zzlc f37625Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ zzq f37626Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ zzgq f37627Oooo0oo;

    public o000Oo0(zzgq zzgqVar, zzlc zzlcVar, zzq zzqVar) {
        this.f37627Oooo0oo = zzgqVar;
        this.f37625Oooo0o = zzlcVar;
        this.f37626Oooo0oO = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37627Oooo0oo.f16225OooO00o.OooO00o();
        if (this.f37625Oooo0o.zza() == null) {
            this.f37627Oooo0oo.f16225OooO00o.OooOO0O(this.f37625Oooo0o, this.f37626Oooo0oO);
        } else {
            this.f37627Oooo0oo.f16225OooO00o.OooOOOO(this.f37625Oooo0o, this.f37626Oooo0oO);
        }
    }
}
