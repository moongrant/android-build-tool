package p334o0OO00o;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OO extends o000Oo0 {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ zzee f37293OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Bundle f37294OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO(zzee zzeeVar, Bundle bundle) {
        super(zzeeVar, true);
        this.f37293OoooO0 = zzeeVar;
        this.f37294OoooO00 = bundle;
    }

    @Override // p334o0OO00o.o000Oo0
    public final void OooO00o() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f37293OoooO0.f15923OooO0oo)).setDefaultEventParameters(this.f37294OoooO00);
    }
}
