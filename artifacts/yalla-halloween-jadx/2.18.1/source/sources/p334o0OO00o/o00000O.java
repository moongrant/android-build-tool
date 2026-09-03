package p334o0OO00o;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000O extends o000Oo0 {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ zzbz f37243OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ String f37244OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ String f37245OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ boolean f37246OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final /* synthetic */ zzee f37247OoooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O(zzee zzeeVar, String str, String str2, boolean z, zzbz zzbzVar) {
        super(zzeeVar, true);
        this.f37247OoooOO0 = zzeeVar;
        this.f37245OoooO00 = str;
        this.f37244OoooO0 = str2;
        this.f37246OoooO0O = z;
        this.f37243OoooO = zzbzVar;
    }

    @Override // p334o0OO00o.o000Oo0
    public final void OooO00o() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f37247OoooOO0.f15923OooO0oo)).getUserProperties(this.f37245OoooO00, this.f37244OoooO0, this.f37246OoooO0O, this.f37243OoooO);
    }

    @Override // p334o0OO00o.o000Oo0
    public final void OooO0O0() {
        this.f37243OoooO.zzd(null);
    }
}
