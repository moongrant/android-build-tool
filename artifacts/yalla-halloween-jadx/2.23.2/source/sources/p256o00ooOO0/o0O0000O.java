package p256o00ooOO0;

import android.app.Dialog;
import android.app.PendingIntent;
import androidx.annotation.MainThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.zap;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0000O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0 f40319OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zap f40320OooO0o0;

    public o0O0000O(zap zapVar, o0 o0Var) {
        this.f40320OooO0o0 = zapVar;
        this.f40319OooO0Oo = o0Var;
    }

    @Override // java.lang.Runnable
    @MainThread
    public final void run() {
        if (this.f40320OooO0o0.f14453OooO0o0) {
            ConnectionResult connectionResult = this.f40319OooO0Oo.f40262OooO0O0;
            if (connectionResult.hasResolution()) {
                zap zapVar = this.f40320OooO0o0;
                zapVar.f14277OooO0Oo.startActivityForResult(GoogleApiActivity.zaa(zapVar.getActivity(), (PendingIntent) Preconditions.checkNotNull(connectionResult.getResolution()), this.f40319OooO0Oo.f40261OooO00o, false), 1);
                return;
            }
            zap zapVar2 = this.f40320OooO0o0;
            if (zapVar2.f14455OooO0oo.getErrorResolutionIntent(zapVar2.getActivity(), connectionResult.getErrorCode(), null) != null) {
                zap zapVar3 = this.f40320OooO0o0;
                zapVar3.f14455OooO0oo.zag(zapVar3.getActivity(), this.f40320OooO0o0.f14277OooO0Oo, connectionResult.getErrorCode(), 2, this.f40320OooO0o0);
            } else {
                if (connectionResult.getErrorCode() == 18) {
                    zap zapVar4 = this.f40320OooO0o0;
                    Dialog dialogZab = zapVar4.f14455OooO0oo.zab(zapVar4.getActivity(), this.f40320OooO0o0);
                    zap zapVar5 = this.f40320OooO0o0;
                    zapVar5.f14455OooO0oo.zac(zapVar5.getActivity().getApplicationContext(), new o0O00000(this, dialogZab));
                    return;
                }
                zap zapVar6 = this.f40320OooO0o0;
                int i = this.f40319OooO0Oo.f40261OooO00o;
                zapVar6.f14452OooO0o.set(null);
                zapVar6.OooO0O0(connectionResult, i);
            }
        }
    }
}
