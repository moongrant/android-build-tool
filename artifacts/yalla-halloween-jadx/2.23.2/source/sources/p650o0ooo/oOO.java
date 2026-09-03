package p650o0ooo;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO extends PopupWindow {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ oOO0Oo00 f58905OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO(oOO0Oo00 ooo0oo00, FrameLayout frameLayout) {
        super((View) frameLayout, -2, -2, true);
        this.f58905OooO00o = ooo0oo00;
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        oOO0Oo00 ooo0oo00 = this.f58905OooO00o;
        ooo0oo00.f58978OooOOO = null;
        ooo0oo00.getClass();
    }
}
