package o0OO0OoO;

import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzgq;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O000 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ zzaw f37609Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f37610Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ zzgq f37611Oooo0oo;

    public o000O000(zzgq zzgqVar, zzaw zzawVar, String str) {
        this.f37611Oooo0oo = zzgqVar;
        this.f37609Oooo0o = zzawVar;
        this.f37610Oooo0oO = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37611Oooo0oo.f16225OooO00o.OooO00o();
        this.f37611Oooo0oo.f16225OooO00o.OooO0o(this.f37609Oooo0o, this.f37610Oooo0oO);
    }
}
