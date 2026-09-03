package p334o0OO00o;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000 extends o000Oo0 {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ zzee f37239OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ zzbz f37240OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000(zzee zzeeVar, zzbz zzbzVar) {
        super(zzeeVar, true);
        this.f37239OoooO0 = zzeeVar;
        this.f37240OoooO00 = zzbzVar;
    }

    @Override // p334o0OO00o.o000Oo0
    public final void OooO00o() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f37239OoooO0.f15923OooO0oo)).getCachedAppInstanceId(this.f37240OoooO00);
    }

    @Override // p334o0OO00o.o000Oo0
    public final void OooO0O0() {
        this.f37240OoooO00.zzd(null);
    }
}
