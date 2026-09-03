package p254o00ooOO0;

import android.app.Dialog;
import android.app.PendingIntent;
import androidx.annotation.MainThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.zap;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0oOOo f40933OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zap f40934OooO0o0;

    public o0(zap zapVar, o0oOOo o0oooo) {
        this.f40934OooO0o0 = zapVar;
        this.f40933OooO0Oo = o0oooo;
    }

    @Override // java.lang.Runnable
    @MainThread
    public final void run() {
        if (this.f40934OooO0o0.f14929OooO0o0) {
            ConnectionResult connectionResult = this.f40933OooO0Oo.f41009OooO0O0;
            if (connectionResult.hasResolution()) {
                zap zapVar = this.f40934OooO0o0;
                zapVar.f14753OooO0Oo.startActivityForResult(GoogleApiActivity.zaa(zapVar.getActivity(), (PendingIntent) Preconditions.checkNotNull(connectionResult.getResolution()), this.f40933OooO0Oo.f41008OooO00o, false), 1);
                return;
            }
            zap zapVar2 = this.f40934OooO0o0;
            if (zapVar2.f14931OooO0oo.getErrorResolutionIntent(zapVar2.getActivity(), connectionResult.getErrorCode(), null) != null) {
                zap zapVar3 = this.f40934OooO0o0;
                zapVar3.f14931OooO0oo.zag(zapVar3.getActivity(), this.f40934OooO0o0.f14753OooO0Oo, connectionResult.getErrorCode(), 2, this.f40934OooO0o0);
            } else {
                if (connectionResult.getErrorCode() == 18) {
                    zap zapVar4 = this.f40934OooO0o0;
                    Dialog dialogZab = zapVar4.f14931OooO0oo.zab(zapVar4.getActivity(), this.f40934OooO0o0);
                    zap zapVar5 = this.f40934OooO0o0;
                    zapVar5.f14931OooO0oo.zac(zapVar5.getActivity().getApplicationContext(), new o0O0o(this, dialogZab));
                    return;
                }
                zap zapVar6 = this.f40934OooO0o0;
                int i = this.f40933OooO0Oo.f41008OooO00o;
                zapVar6.f14928OooO0o.set(null);
                zapVar6.OooO0O0(connectionResult, i);
            }
        }
    }
}
