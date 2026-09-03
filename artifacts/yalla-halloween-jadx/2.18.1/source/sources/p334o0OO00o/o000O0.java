package p334o0OO00o;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzcc;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0 extends o000Oo0 {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Activity f37272OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Bundle f37273OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ o00 f37274OoooO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0(o00 o00Var, Bundle bundle, Activity activity) {
        super(o00Var.f37233Oooo0o, true);
        this.f37274OoooO0O = o00Var;
        this.f37273OoooO00 = bundle;
        this.f37272OoooO0 = activity;
    }

    @Override // p334o0OO00o.o000Oo0
    public final void OooO00o() throws RemoteException {
        Bundle bundle;
        if (this.f37273OoooO00 != null) {
            bundle = new Bundle();
            if (this.f37273OoooO00.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f37273OoooO00.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        ((zzcc) Preconditions.checkNotNull(this.f37274OoooO0O.f37233Oooo0o.f15923OooO0oo)).onActivityCreated(ObjectWrapper.wrap(this.f37272OoooO0), bundle, this.f37306Oooo0oO);
    }
}
