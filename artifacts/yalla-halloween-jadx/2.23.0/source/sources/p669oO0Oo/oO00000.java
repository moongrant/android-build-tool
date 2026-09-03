package p669oO0Oo;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SoftwareKeyboardController f60774OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f60775OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00000(SoftwareKeyboardController softwareKeyboardController, MutableState<Boolean> mutableState) {
        super(0);
        this.f60774OooO0Oo = softwareKeyboardController;
        this.f60775OooO0o0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        SoftwareKeyboardController softwareKeyboardController;
        MutableState<Boolean> mutableState = this.f60775OooO0o0;
        mutableState.setValue(Boolean.valueOf(!o0OOO0OO.OooO0OO(mutableState)));
        if (o0OOO0OO.OooO0OO(mutableState) && (softwareKeyboardController = this.f60774OooO0Oo) != null) {
            softwareKeyboardController.hide();
        }
        return Unit.INSTANCE;
    }
}
