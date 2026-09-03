package o0OO0OoO;

import com.google.android.gms.internal.measurement.zzoz;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzeb;
import com.google.android.gms.measurement.internal.zzid;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O0O implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ long f37658Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ zzai f37659Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ long f37660Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f37661Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ zzai f37662OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ boolean f37663OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ zzid f37664OoooO0O;

    public o00O0O0O(zzid zzidVar, zzai zzaiVar, long j, int i, long j2, boolean z, zzai zzaiVar2) {
        this.f37664OoooO0O = zzidVar;
        this.f37659Oooo0o = zzaiVar;
        this.f37660Oooo0oO = j;
        this.f37661Oooo0oo = i;
        this.f37658Oooo = j2;
        this.f37663OoooO00 = z;
        this.f37662OoooO0 = zzaiVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37664OoooO0O.OooOO0(this.f37659Oooo0o);
        this.f37664OoooO0O.OooO0o(this.f37660Oooo0oO, false);
        zzid.OooOOOO(this.f37664OoooO0O, this.f37659Oooo0o, this.f37661Oooo0oo, this.f37658Oooo, true, this.f37663OoooO00);
        zzoz.zzc();
        if (this.f37664OoooO0O.f37615OooO00o.zzf().zzs(null, zzeb.zzas)) {
            zzid.OooOOO(this.f37664OoooO0O, this.f37659Oooo0o, this.f37662OoooO0);
        }
    }
}
