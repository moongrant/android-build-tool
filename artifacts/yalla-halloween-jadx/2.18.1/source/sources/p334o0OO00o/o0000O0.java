package p334o0OO00o;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O0 extends o000Oo0 {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ int f37255OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ zzbz f37256OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ zzee f37257OoooO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0(zzee zzeeVar, zzbz zzbzVar, int i) {
        super(zzeeVar, true);
        this.f37257OoooO0O = zzeeVar;
        this.f37256OoooO00 = zzbzVar;
        this.f37255OoooO0 = i;
    }

    @Override // p334o0OO00o.o000Oo0
    public final void OooO00o() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f37257OoooO0O.f15923OooO0oo)).getTestFlag(this.f37256OoooO00, this.f37255OoooO0);
    }

    @Override // p334o0OO00o.o000Oo0
    public final void OooO0O0() {
        this.f37256OoooO00.zzd(null);
    }
}
