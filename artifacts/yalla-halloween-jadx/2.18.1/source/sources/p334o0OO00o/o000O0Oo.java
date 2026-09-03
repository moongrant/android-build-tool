package p334o0OO00o;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzcc;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0Oo extends o000Oo0 {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ o00 f37286OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Activity f37287OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0Oo(o00 o00Var, Activity activity) {
        super(o00Var.f37233Oooo0o, true);
        this.f37286OoooO0 = o00Var;
        this.f37287OoooO00 = activity;
    }

    @Override // p334o0OO00o.o000Oo0
    public final void OooO00o() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f37286OoooO0.f37233Oooo0o.f15923OooO0oo)).onActivityStarted(ObjectWrapper.wrap(this.f37287OoooO00), this.f37306Oooo0oO);
    }
}
