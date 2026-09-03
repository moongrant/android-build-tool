package p256o00ooOO0;

import android.app.Dialog;
import com.google.android.gms.common.api.internal.zabw;
import com.google.android.gms.common.api.internal.zap;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00000 extends zabw {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Dialog f40317OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o0O0000O f40318OooO0O0;

    public o0O00000(o0O0000O o0o0000o2, Dialog dialog) {
        this.f40318OooO0O0 = o0o0000o2;
        this.f40317OooO00o = dialog;
    }

    @Override // com.google.android.gms.common.api.internal.zabw
    public final void zaa() {
        zap zapVar = this.f40318OooO0O0.f40320OooO0o0;
        zapVar.f14452OooO0o.set(null);
        zapVar.OooO0OO();
        Dialog dialog = this.f40317OooO00o;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }
}
