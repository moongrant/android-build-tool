package p334o0OO00o;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0o extends o000Oo0 {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ boolean f37288OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ String f37289OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ String f37290OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ Object f37291OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final /* synthetic */ zzee f37292OoooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0o(zzee zzeeVar, String str, String str2, Object obj, boolean z) {
        super(zzeeVar, true);
        this.f37292OoooOO0 = zzeeVar;
        this.f37290OoooO00 = str;
        this.f37289OoooO0 = str2;
        this.f37291OoooO0O = obj;
        this.f37288OoooO = z;
    }

    @Override // p334o0OO00o.o000Oo0
    public final void OooO00o() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f37292OoooOO0.f15923OooO0oo)).setUserProperty(this.f37290OoooO00, this.f37289OoooO0, ObjectWrapper.wrap(this.f37291OoooO0O), this.f37288OoooO, this.f37305Oooo0o);
    }
}
