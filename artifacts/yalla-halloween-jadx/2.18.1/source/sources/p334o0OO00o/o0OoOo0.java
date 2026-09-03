package p334o0OO00o;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOo0 extends o000Oo0 {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ zzee f37437OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ String f37438OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ String f37439OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ Bundle f37440OoooO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(zzee zzeeVar, String str, String str2, Bundle bundle) {
        super(zzeeVar, true);
        this.f37437OoooO = zzeeVar;
        this.f37439OoooO00 = str;
        this.f37438OoooO0 = str2;
        this.f37440OoooO0O = bundle;
    }

    @Override // p334o0OO00o.o000Oo0
    public final void OooO00o() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f37437OoooO.f15923OooO0oo)).clearConditionalUserProperty(this.f37439OoooO00, this.f37438OoooO0, this.f37440OoooO0O);
    }
}
