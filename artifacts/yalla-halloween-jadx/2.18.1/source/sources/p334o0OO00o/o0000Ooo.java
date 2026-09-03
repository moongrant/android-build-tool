package p334o0OO00o;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000Ooo extends o000Oo0 {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ zzbz f37265OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Bundle f37266OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ zzee f37267OoooO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000Ooo(zzee zzeeVar, Bundle bundle, zzbz zzbzVar) {
        super(zzeeVar, true);
        this.f37267OoooO0O = zzeeVar;
        this.f37266OoooO00 = bundle;
        this.f37265OoooO0 = zzbzVar;
    }

    @Override // p334o0OO00o.o000Oo0
    public final void OooO00o() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f37267OoooO0O.f15923OooO0oo)).performAction(this.f37266OoooO00, this.f37265OoooO0, this.f37305Oooo0o);
    }

    @Override // p334o0OO00o.o000Oo0
    public final void OooO0O0() {
        this.f37265OoooO0.zzd(null);
    }
}
