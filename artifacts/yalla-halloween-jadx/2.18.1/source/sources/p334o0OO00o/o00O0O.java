package p334o0OO00o;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O extends o000Oo0 {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ zzee f37316OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ String f37317OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ String f37318OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ zzbz f37319OoooO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(zzee zzeeVar, String str, String str2, zzbz zzbzVar) {
        super(zzeeVar, true);
        this.f37316OoooO = zzeeVar;
        this.f37318OoooO00 = str;
        this.f37317OoooO0 = str2;
        this.f37319OoooO0O = zzbzVar;
    }

    @Override // p334o0OO00o.o000Oo0
    public final void OooO00o() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f37316OoooO.f15923OooO0oo)).getConditionalUserProperties(this.f37318OoooO00, this.f37317OoooO0, this.f37319OoooO0O);
    }

    @Override // p334o0OO00o.o000Oo0
    public final void OooO0O0() {
        this.f37319OoooO0O.zzd(null);
    }
}
