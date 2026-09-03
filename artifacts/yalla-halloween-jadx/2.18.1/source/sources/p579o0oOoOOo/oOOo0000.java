package p579o0oOoOOo;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class oOOo0000 extends PopupWindow {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ oOOOOo0O f46192OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOo0000(oOOOOo0O oooooo0o, FrameLayout frameLayout) {
        super((View) frameLayout, -2, -2, true);
        this.f46192OooO00o = oooooo0o;
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        oOOOOo0O oooooo0o = this.f46192OooO00o;
        oooooo0o.f46185OoooOOO = null;
        Objects.requireNonNull(oooooo0o);
    }
}
