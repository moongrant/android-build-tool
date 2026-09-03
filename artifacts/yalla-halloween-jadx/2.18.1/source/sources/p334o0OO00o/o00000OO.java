package p334o0OO00o;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000OO extends o000Oo0 {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Object f37250OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ String f37251OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ zzee f37252OoooO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000OO(zzee zzeeVar, String str, Object obj) {
        super(zzeeVar, false);
        this.f37252OoooO0O = zzeeVar;
        this.f37251OoooO00 = str;
        this.f37250OoooO0 = obj;
    }

    @Override // p334o0OO00o.o000Oo0
    public final void OooO00o() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f37252OoooO0O.f15923OooO0oo)).logHealthData(5, this.f37251OoooO00, ObjectWrapper.wrap(this.f37250OoooO0), ObjectWrapper.wrap(null), ObjectWrapper.wrap(null));
    }
}
