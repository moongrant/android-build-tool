package p540o0o0OoO0;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ooo0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FocusRequester f55069OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f55070OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ SoftwareKeyboardController f55071OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooo0o(FocusRequester focusRequester, SoftwareKeyboardController softwareKeyboardController, MutableState<Boolean> mutableState) {
        super(0);
        this.f55069OooO0Oo = focusRequester;
        this.f55071OooO0o0 = softwareKeyboardController;
        this.f55070OooO0o = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f55070OooO0o.setValue(Boolean.FALSE);
        this.f55069OooO0Oo.requestFocus();
        SoftwareKeyboardController softwareKeyboardController = this.f55071OooO0o0;
        if (softwareKeyboardController != null) {
            softwareKeyboardController.show();
        }
        return Unit.INSTANCE;
    }
}
