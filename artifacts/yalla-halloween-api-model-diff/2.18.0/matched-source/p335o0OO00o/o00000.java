package p335o0OO00o;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000 extends o000O00 {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ zzbz f37261OoooO;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final /* synthetic */ zzee f37262OoooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000(zzee zzeeVar, zzbz zzbzVar) {
        super(zzeeVar, true);
        this.f37262OoooOO0 = zzeeVar;
        this.f37261OoooO = zzbzVar;
    }

    @Override // p335o0OO00o.o000O00
    public final void OooO00o() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f37262OoooOO0.f15941OooO0oo)).generateEventId(this.f37261OoooO);
    }

    @Override // p335o0OO00o.o000O00
    public final void OooO0O0() {
        this.f37261OoooO.zzd(null);
    }
}
