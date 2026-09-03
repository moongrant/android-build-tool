package p334o0OO00o;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O000 extends o000Oo0 {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ Bundle f37276OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ String f37277OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Long f37278OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ String f37279OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final /* synthetic */ boolean f37280OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final /* synthetic */ zzee f37281OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final /* synthetic */ boolean f37282o000oOoO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O000(zzee zzeeVar, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(zzeeVar, true);
        this.f37281OoooOOO = zzeeVar;
        this.f37278OoooO00 = l;
        this.f37277OoooO0 = str;
        this.f37279OoooO0O = str2;
        this.f37276OoooO = bundle;
        this.f37280OoooOO0 = z;
        this.f37282o000oOoO = z2;
    }

    @Override // p334o0OO00o.o000Oo0
    public final void OooO00o() throws RemoteException {
        Long l = this.f37278OoooO00;
        ((zzcc) Preconditions.checkNotNull(this.f37281OoooOOO.f15923OooO0oo)).logEvent(this.f37277OoooO0, this.f37279OoooO0O, this.f37276OoooO, this.f37280OoooOO0, this.f37282o000oOoO, l == null ? this.f37305Oooo0o : l.longValue());
    }
}
