package o0OO0OoO;

import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzik;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0 implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ long f37602Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ String f37603Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f37604Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ String f37605Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ zzgq f37606OoooO00;

    public o000O0(zzgq zzgqVar, String str, String str2, String str3, long j) {
        this.f37606OoooO00 = zzgqVar;
        this.f37603Oooo0o = str;
        this.f37604Oooo0oO = str2;
        this.f37605Oooo0oo = str3;
        this.f37602Oooo = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f37603Oooo0o;
        if (str == null) {
            this.f37606OoooO00.f16225OooO00o.zzR(this.f37604Oooo0oO, null);
        } else {
            this.f37606OoooO00.f16225OooO00o.zzR(this.f37604Oooo0oO, new zzik(this.f37605Oooo0oo, str, this.f37602Oooo));
        }
    }
}
