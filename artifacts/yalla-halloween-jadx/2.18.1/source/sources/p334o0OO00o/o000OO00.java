package p334o0OO00o;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzcc;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OO00 extends o000Oo0 {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ zzbz f37295OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Activity f37296OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ o00 f37297OoooO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO00(o00 o00Var, Activity activity, zzbz zzbzVar) {
        super(o00Var.f37233Oooo0o, true);
        this.f37297OoooO0O = o00Var;
        this.f37296OoooO00 = activity;
        this.f37295OoooO0 = zzbzVar;
    }

    @Override // p334o0OO00o.o000Oo0
    public final void OooO00o() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f37297OoooO0O.f37233Oooo0o.f15923OooO0oo)).onActivitySaveInstanceState(ObjectWrapper.wrap(this.f37296OoooO00), this.f37295OoooO0, this.f37306Oooo0oO);
    }
}
