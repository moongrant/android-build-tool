package p256o00ooOO0;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.OooO00o;
import com.google.android.gms.common.api.internal.zabz;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O000Oo implements zabz {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooO00o f40322OooO00o;

    public /* synthetic */ o0O000Oo(OooO00o oooO00o) {
        this.f40322OooO00o = oooO00o;
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zaa(@NonNull ConnectionResult connectionResult) {
        OooO00o oooO00o = this.f40322OooO00o;
        oooO00o.f14307OooOOOo.lock();
        try {
            oooO00o.f14305OooOOO0 = connectionResult;
            OooO00o.OooO0Oo(oooO00o);
        } finally {
            oooO00o.f14307OooOOOo.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zab(@Nullable Bundle bundle) {
        OooO00o oooO00o = this.f40322OooO00o;
        oooO00o.f14307OooOOOo.lock();
        try {
            Bundle bundle2 = oooO00o.f14303OooOO0o;
            if (bundle2 == null) {
                oooO00o.f14303OooOO0o = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            oooO00o.f14305OooOOO0 = ConnectionResult.RESULT_SUCCESS;
            OooO00o.OooO0Oo(oooO00o);
        } finally {
            oooO00o.f14307OooOOOo.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zac(int i, boolean z) {
        ConnectionResult connectionResult;
        OooO00o oooO00o = this.f40322OooO00o;
        Lock lock = oooO00o.f14307OooOOOo;
        Lock lock2 = oooO00o.f14307OooOOOo;
        lock.lock();
        try {
            if (!oooO00o.f14306OooOOOO && (connectionResult = oooO00o.f14304OooOOO) != null && connectionResult.isSuccess()) {
                oooO00o.f14306OooOOOO = true;
                oooO00o.f14300OooO0oo.onConnectionSuspended(i);
                return;
            }
            oooO00o.f14306OooOOOO = false;
            oooO00o.f14298OooO0o0.zac(i, z);
            oooO00o.f14304OooOOO = null;
            oooO00o.f14305OooOOO0 = null;
        } finally {
            lock2.unlock();
        }
    }
}
