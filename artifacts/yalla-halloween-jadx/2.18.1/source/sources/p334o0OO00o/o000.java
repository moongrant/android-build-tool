package p334o0OO00o;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* JADX INFO: loaded from: classes2.dex */
public final class o000 extends o000Oo0 {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ zzee f37234OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o000O00O f37235OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000(zzee zzeeVar, o000O00O o000o00o2) {
        super(zzeeVar, true);
        this.f37234OoooO0 = zzeeVar;
        this.f37235OoooO00 = o000o00o2;
    }

    @Override // p334o0OO00o.o000Oo0
    public final void OooO00o() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f37234OoooO0.f15923OooO0oo)).unregisterOnMeasurementEventListener(this.f37235OoooO00);
    }
}
