package o0OO0OoO;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzee;
import com.google.android.gms.measurement.internal.zzjs;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O000 implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ zzjs f37726Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ zzq f37727Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f37728Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ zzaw f37729Oooo0oo;

    public o0O000(zzjs zzjsVar, zzq zzqVar, boolean z, zzaw zzawVar) {
        this.f37726Oooo = zzjsVar;
        this.f37727Oooo0o = zzqVar;
        this.f37728Oooo0oO = z;
        this.f37729Oooo0oo = zzawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjs zzjsVar = this.f37726Oooo;
        zzee zzeeVar = zzjsVar.f16268OooO0Oo;
        if (zzeeVar == null) {
            p167o00Ooo.OooOO0.OooO0O0(zzjsVar.f37615OooO00o, "Discarding data. Failed to send event to service");
            return;
        }
        Preconditions.checkNotNull(this.f37727Oooo0o);
        this.f37726Oooo.OooO0OO(zzeeVar, this.f37728Oooo0oO ? null : this.f37729Oooo0oo, this.f37727Oooo0o);
        this.f37726Oooo.OooO();
    }
}
