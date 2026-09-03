package p334o0OO00o;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O00 extends o000Oo0 {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ zzee f37385OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ String f37386OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O00(zzee zzeeVar, String str) {
        super(zzeeVar, true);
        this.f37385OoooO0 = zzeeVar;
        this.f37386OoooO00 = str;
    }

    @Override // p334o0OO00o.o000Oo0
    public final void OooO00o() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f37385OoooO0.f15923OooO0oo)).endAdUnitExposure(this.f37386OoooO00, this.f37306Oooo0oO);
    }
}
