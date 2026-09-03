package p278o0O00o;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.OooO00o;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.zego.zegoliveroom.constants.ZegoConstants;
import o0000O.o0O0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo000 extends OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f41042OooO00o;

    public Oooo000(BaseTransientBottomBar baseTransientBottomBar) {
        this.f41042OooO00o = baseTransientBottomBar;
    }

    @Override // androidx.core.view.OooO00o
    public final void onInitializeAccessibilityNodeInfo(View view, @NonNull o0O0O00 o0o0o00) {
        super.onInitializeAccessibilityNodeInfo(view, o0o0o00);
        o0o0o00.OooO00o(ZegoConstants.ErrorMask.RoomServerErrorMask);
        o0o0o00.f33510OooO00o.setDismissable(true);
    }

    @Override // androidx.core.view.OooO00o
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (i != 1048576) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        this.f41042OooO00o.OooO00o();
        return true;
    }
}
