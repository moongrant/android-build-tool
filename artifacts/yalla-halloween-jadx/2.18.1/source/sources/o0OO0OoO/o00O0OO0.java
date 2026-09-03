package o0OO0OoO;

import com.google.android.gms.internal.measurement.zzoz;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzeb;
import com.google.android.gms.measurement.internal.zzid;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0OO0 implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ boolean f37667Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ zzai f37668Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f37669Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ long f37670Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ zzid f37671OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ zzai f37672OoooO00;

    public o00O0OO0(zzid zzidVar, zzai zzaiVar, int i, long j, boolean z, zzai zzaiVar2) {
        this.f37671OoooO0 = zzidVar;
        this.f37668Oooo0o = zzaiVar;
        this.f37669Oooo0oO = i;
        this.f37670Oooo0oo = j;
        this.f37667Oooo = z;
        this.f37672OoooO00 = zzaiVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37671OoooO0.OooOO0(this.f37668Oooo0o);
        zzid.OooOOOO(this.f37671OoooO0, this.f37668Oooo0o, this.f37669Oooo0oO, this.f37670Oooo0oo, false, this.f37667Oooo);
        zzoz.zzc();
        if (this.f37671OoooO0.f37615OooO00o.zzf().zzs(null, zzeb.zzas)) {
            zzid.OooOOO(this.f37671OoooO0, this.f37668Oooo0o, this.f37672OoooO00);
        }
    }
}
