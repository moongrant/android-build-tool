package p254o00ooOO0;

import android.app.Dialog;
import com.google.android.gms.common.api.internal.zabw;
import com.google.android.gms.common.api.internal.zap;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0o extends zabw {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Dialog f41000OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o0 f41001OooO0O0;

    public o0O0o(o0 o0Var, Dialog dialog) {
        this.f41001OooO0O0 = o0Var;
        this.f41000OooO00o = dialog;
    }

    @Override // com.google.android.gms.common.api.internal.zabw
    public final void zaa() {
        zap zapVar = this.f41001OooO0O0.f40934OooO0o0;
        zapVar.f14928OooO0o.set(null);
        zapVar.OooO0OO();
        Dialog dialog = this.f41000OooO00o;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }
}
