package o0000OO0;

import androidx.compose.ui.window.PopupLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o00oO0o extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PopupLayout f27502Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oO0o(PopupLayout popupLayout) {
        super(0);
        this.f27502Oooo0o = popupLayout;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf((this.f27502Oooo0o.getParentLayoutCoordinates() == null || this.f27502Oooo0o.m2getPopupContentSizebOM6tXw() == null) ? false : true);
    }
}
