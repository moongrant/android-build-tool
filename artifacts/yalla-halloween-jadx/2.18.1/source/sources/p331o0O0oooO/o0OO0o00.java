package p331o0O0oooO;

import android.app.Dialog;
import com.google.android.gms.common.api.internal.zabw;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO0o00 extends zabw {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Dialog f37129OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o0OO0o f37130OooO0O0;

    public o0OO0o00(o0OO0o o0oo0o2, Dialog dialog) {
        this.f37130OooO0O0 = o0oo0o2;
        this.f37129OooO00o = dialog;
    }

    @Override // com.google.android.gms.common.api.internal.zabw
    public final void zaa() {
        this.f37130OooO0O0.f37128Oooo0oO.OooO0o0();
        if (this.f37129OooO00o.isShowing()) {
            this.f37129OooO00o.dismiss();
        }
    }
}
