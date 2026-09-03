package p519o0o0O0oO;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0O0O extends PopupWindow {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ oOO0O00O f52977OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0O0O(oOO0O00O ooo0o00o, FrameLayout frameLayout) {
        super((View) frameLayout, -2, -2, true);
        this.f52977OooO00o = ooo0o00o;
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        oOO0O00O ooo0o00o = this.f52977OooO00o;
        ooo0o00o.f52971OooOOO = null;
        ooo0o00o.getClass();
    }
}
