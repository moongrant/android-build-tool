package p334o0OO00o;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o extends o000Oo0 {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ zzee f37453OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Boolean f37454OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000o(zzee zzeeVar, Boolean bool) {
        super(zzeeVar, true);
        this.f37453OoooO0 = zzeeVar;
        this.f37454OoooO00 = bool;
    }

    @Override // p334o0OO00o.o000Oo0
    public final void OooO00o() throws RemoteException {
        if (this.f37454OoooO00 != null) {
            ((zzcc) Preconditions.checkNotNull(this.f37453OoooO0.f15923OooO0oo)).setMeasurementEnabled(this.f37454OoooO00.booleanValue(), this.f37305Oooo0o);
        } else {
            ((zzcc) Preconditions.checkNotNull(this.f37453OoooO0.f15923OooO0oo)).clearMeasurementEnabled(this.f37305Oooo0o);
        }
    }
}
