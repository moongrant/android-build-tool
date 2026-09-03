package p334o0OO00o;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzcc;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O extends o000Oo0 {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ o00 f37270OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Activity f37271OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O(o00 o00Var, Activity activity) {
        super(o00Var.f37233Oooo0o, true);
        this.f37270OoooO0 = o00Var;
        this.f37271OoooO00 = activity;
    }

    @Override // p334o0OO00o.o000Oo0
    public final void OooO00o() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f37270OoooO0.f37233Oooo0o.f15923OooO0oo)).onActivityStopped(ObjectWrapper.wrap(this.f37271OoooO00), this.f37306Oooo0oO);
    }
}
