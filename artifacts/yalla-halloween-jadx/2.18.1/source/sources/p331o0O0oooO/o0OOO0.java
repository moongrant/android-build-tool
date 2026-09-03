package p331o0O0oooO;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.OooO00o;
import com.google.android.gms.common.api.internal.zabz;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0 implements zabz {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooO00o f37131OooO00o;

    public /* synthetic */ o0OOO0(OooO00o oooO00o) {
        this.f37131OooO00o = oooO00o;
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zaa(@NonNull ConnectionResult connectionResult) {
        this.f37131OooO00o.f15285OooOOO0.lock();
        try {
            OooO00o oooO00o = this.f37131OooO00o;
            oooO00o.f15281OooOO0 = connectionResult;
            OooO00o.OooO0o(oooO00o);
        } finally {
            this.f37131OooO00o.f15285OooOOO0.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zab(@Nullable Bundle bundle) {
        this.f37131OooO00o.f15285OooOOO0.lock();
        try {
            OooO00o oooO00o = this.f37131OooO00o;
            Bundle bundle2 = oooO00o.f15272OooO;
            if (bundle2 == null) {
                oooO00o.f15272OooO = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            OooO00o oooO00o2 = this.f37131OooO00o;
            oooO00o2.f15281OooOO0 = ConnectionResult.RESULT_SUCCESS;
            OooO00o.OooO0o(oooO00o2);
        } finally {
            this.f37131OooO00o.f15285OooOOO0.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zac(int i, boolean z) {
        ConnectionResult connectionResult;
        this.f37131OooO00o.f15285OooOOO0.lock();
        try {
            OooO00o oooO00o = this.f37131OooO00o;
            if (!oooO00o.f15283OooOO0o && (connectionResult = oooO00o.f15282OooOO0O) != null && connectionResult.isSuccess()) {
                OooO00o oooO00o2 = this.f37131OooO00o;
                oooO00o2.f15283OooOO0o = true;
                oooO00o2.f15278OooO0o0.onConnectionSuspended(i);
                return;
            }
            OooO00o oooO00o3 = this.f37131OooO00o;
            oooO00o3.f15283OooOO0o = false;
            oooO00o3.f15274OooO0O0.zac(i, z);
            oooO00o3.f15282OooOO0O = null;
            oooO00o3.f15281OooOO0 = null;
        } finally {
            this.f37131OooO00o.f15285OooOOO0.unlock();
        }
    }
}
