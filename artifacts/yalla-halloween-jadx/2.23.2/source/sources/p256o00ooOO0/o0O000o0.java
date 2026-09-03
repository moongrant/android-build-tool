package p256o00ooOO0;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.OooO00o;
import com.google.android.gms.common.api.internal.zabz;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O000o0 implements zabz {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooO00o f40323OooO00o;

    public /* synthetic */ o0O000o0(OooO00o oooO00o) {
        this.f40323OooO00o = oooO00o;
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zaa(@NonNull ConnectionResult connectionResult) {
        OooO00o oooO00o = this.f40323OooO00o;
        oooO00o.f14307OooOOOo.lock();
        try {
            oooO00o.f14304OooOOO = connectionResult;
            OooO00o.OooO0Oo(oooO00o);
        } finally {
            oooO00o.f14307OooOOOo.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zab(@Nullable Bundle bundle) {
        OooO00o oooO00o = this.f40323OooO00o;
        oooO00o.f14307OooOOOo.lock();
        try {
            oooO00o.f14304OooOOO = ConnectionResult.RESULT_SUCCESS;
            OooO00o.OooO0Oo(oooO00o);
        } finally {
            oooO00o.f14307OooOOOo.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zac(int i, boolean z) {
        OooO00o oooO00o = this.f40323OooO00o;
        Lock lock = oooO00o.f14307OooOOOo;
        Lock lock2 = oooO00o.f14307OooOOOo;
        lock.lock();
        try {
            if (!oooO00o.f14306OooOOOO) {
                oooO00o.f14306OooOOOO = true;
                oooO00o.f14299OooO0oO.onConnectionSuspended(i);
            } else {
                oooO00o.f14306OooOOOO = false;
                oooO00o.f14298OooO0o0.zac(i, z);
                oooO00o.f14304OooOOO = null;
                oooO00o.f14305OooOOO0 = null;
            }
        } finally {
            lock2.unlock();
        }
    }
}
