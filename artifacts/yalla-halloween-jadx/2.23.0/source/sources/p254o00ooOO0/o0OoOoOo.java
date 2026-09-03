package p254o00ooOO0;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.OooO00o;
import com.google.android.gms.common.api.internal.zabz;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OoOoOo implements zabz {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooO00o f41004OooO00o;

    public /* synthetic */ o0OoOoOo(OooO00o oooO00o) {
        this.f41004OooO00o = oooO00o;
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zaa(@NonNull ConnectionResult connectionResult) {
        OooO00o oooO00o = this.f41004OooO00o;
        oooO00o.f14783OooOOOo.lock();
        try {
            oooO00o.f14780OooOOO = connectionResult;
            OooO00o.OooO0Oo(oooO00o);
        } finally {
            oooO00o.f14783OooOOOo.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zab(@Nullable Bundle bundle) {
        OooO00o oooO00o = this.f41004OooO00o;
        oooO00o.f14783OooOOOo.lock();
        try {
            oooO00o.f14780OooOOO = ConnectionResult.RESULT_SUCCESS;
            OooO00o.OooO0Oo(oooO00o);
        } finally {
            oooO00o.f14783OooOOOo.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zac(int i, boolean z) {
        OooO00o oooO00o = this.f41004OooO00o;
        Lock lock = oooO00o.f14783OooOOOo;
        Lock lock2 = oooO00o.f14783OooOOOo;
        lock.lock();
        try {
            if (!oooO00o.f14782OooOOOO) {
                oooO00o.f14782OooOOOO = true;
                oooO00o.f14775OooO0oO.onConnectionSuspended(i);
            } else {
                oooO00o.f14782OooOOOO = false;
                oooO00o.f14774OooO0o0.zac(i, z);
                oooO00o.f14780OooOOO = null;
                oooO00o.f14781OooOOO0 = null;
            }
        } finally {
            lock2.unlock();
        }
    }
}
