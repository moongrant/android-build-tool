package o0O000Oo;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import com.zego.zegoliveroom.constants.ZegoConstants;
import o0000O.o0O0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO extends androidx.core.view.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.bottomsheet.OooO0O0 f40960OooO00o;

    public OooO(com.google.android.material.bottomsheet.OooO0O0 oooO0O0) {
        this.f40960OooO00o = oooO0O0;
    }

    @Override // androidx.core.view.OooO00o
    public final void onInitializeAccessibilityNodeInfo(View view, @NonNull o0O0O00 o0o0o00) {
        super.onInitializeAccessibilityNodeInfo(view, o0o0o00);
        if (!this.f40960OooO00o.f16047OooOO0O) {
            o0o0o00.f33510OooO00o.setDismissable(false);
        } else {
            o0o0o00.OooO00o(ZegoConstants.ErrorMask.RoomServerErrorMask);
            o0o0o00.f33510OooO00o.setDismissable(true);
        }
    }

    @Override // androidx.core.view.OooO00o
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            com.google.android.material.bottomsheet.OooO0O0 oooO0O0 = this.f40960OooO00o;
            if (oooO0O0.f16047OooOO0O) {
                oooO0O0.cancel();
                return true;
            }
        }
        return super.performAccessibilityAction(view, i, bundle);
    }
}
