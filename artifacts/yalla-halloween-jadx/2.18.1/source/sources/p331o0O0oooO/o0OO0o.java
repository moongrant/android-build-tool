package p331o0O0oooO;

import android.app.Dialog;
import android.app.PendingIntent;
import androidx.annotation.MainThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.zap;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO0o implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final o0OOooO0 f37127Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ zap f37128Oooo0oO;

    public o0OO0o(zap zapVar, o0OOooO0 o0ooooo1) {
        this.f37128Oooo0oO = zapVar;
        this.f37127Oooo0o = o0ooooo1;
    }

    @Override // java.lang.Runnable
    @MainThread
    public final void run() {
        if (this.f37128Oooo0oO.f15431Oooo0oO) {
            ConnectionResult connectionResult = this.f37127Oooo0o.f37142OooO0O0;
            if (connectionResult.hasResolution()) {
                zap zapVar = this.f37128Oooo0oO;
                zapVar.f15254Oooo0o.startActivityForResult(GoogleApiActivity.zaa(zapVar.getActivity(), (PendingIntent) Preconditions.checkNotNull(connectionResult.getResolution()), this.f37127Oooo0o.f37141OooO00o, false), 1);
                return;
            }
            zap zapVar2 = this.f37128Oooo0oO;
            if (zapVar2.f15433OoooO00.getErrorResolutionIntent(zapVar2.getActivity(), connectionResult.getErrorCode(), null) != null) {
                zap zapVar3 = this.f37128Oooo0oO;
                zapVar3.f15433OoooO00.zag(zapVar3.getActivity(), this.f37128Oooo0oO.f15254Oooo0o, connectionResult.getErrorCode(), 2, this.f37128Oooo0oO);
            } else {
                if (connectionResult.getErrorCode() != 18) {
                    this.f37128Oooo0oO.OooO0O0(connectionResult, this.f37127Oooo0o.f37141OooO00o);
                    return;
                }
                zap zapVar4 = this.f37128Oooo0oO;
                Dialog dialogZab = zapVar4.f15433OoooO00.zab(zapVar4.getActivity(), this.f37128Oooo0oO);
                zap zapVar5 = this.f37128Oooo0oO;
                zapVar5.f15433OoooO00.zac(zapVar5.getActivity().getApplicationContext(), new o0OO0o00(this, dialogZab));
            }
        }
    }
}
