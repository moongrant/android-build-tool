package o0OO0OoO;

import android.os.Bundle;
import kotlinx.coroutines.DebugKt;
import o0OO0OoO.o0O0O0O;
import o0OO0OoO.o0oO0O0o;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O0O implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final long f37783Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final long f37784Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0oO0O0o f37785Oooo0oo;

    public o0O0O0O(o0oO0O0o o0oo0o0o2, long j, long j2) {
        this.f37785Oooo0oo = o0oo0o0o2;
        this.f37783Oooo0o = j;
        this.f37784Oooo0oO = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37785Oooo0oo.f37867OooO0O0.f37615OooO00o.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzkc
            @Override // java.lang.Runnable
            public final void run() {
                o0O0O0O o0o0o0o = this.zza;
                o0oO0O0o o0oo0o0o2 = o0o0o0o.f37785Oooo0oo;
                long j = o0o0o0o.f37783Oooo0o;
                long j2 = o0o0o0o.f37784Oooo0oO;
                o0oo0o0o2.f37867OooO0O0.zzg();
                o0oo0o0o2.f37867OooO0O0.f37615OooO00o.zzay().zzc().zza("Application going to the background");
                o0oo0o0o2.f37867OooO0O0.f37615OooO00o.zzm().f37776OooOOOo.zza(true);
                Bundle bundle = new Bundle();
                if (!o0oo0o0o2.f37867OooO0O0.f37615OooO00o.zzf().zzu()) {
                    o0oo0o0o2.f37867OooO0O0.f16278OooO0o0.f37788OooO0OO.OooO00o();
                    o0oo0o0o2.f37867OooO0O0.f16278OooO0o0.OooO00o(false, false, j2);
                }
                o0oo0o0o2.f37867OooO0O0.f37615OooO00o.zzq().OooO0Oo(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ab", j, bundle);
            }
        });
    }
}
