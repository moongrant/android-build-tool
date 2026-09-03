package o0000OO0;

import androidx.compose.ui.window.PopupLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import java.util.Objects;
import p100o000oOoO.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO implements o0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PopupLayout f27446OooO00o;

    public OooOOO(PopupLayout popupLayout) {
        this.f27446OooO00o = popupLayout;
    }

    @Override // p100o000oOoO.o0o0Oo
    public final void dispose() {
        this.f27446OooO00o.OooO0Oo();
        PopupLayout popupLayout = this.f27446OooO00o;
        Objects.requireNonNull(popupLayout);
        ViewTreeLifecycleOwner.set(popupLayout, null);
        popupLayout.f6744OoooOo0.removeViewImmediate(popupLayout);
    }
}
