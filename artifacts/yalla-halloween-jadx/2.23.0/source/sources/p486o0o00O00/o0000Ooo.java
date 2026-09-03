package p486o0o00O00;

import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000Ooo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SoftwareKeyboardController f48273OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000Ooo(SoftwareKeyboardController softwareKeyboardController) {
        super(0);
        this.f48273OooO0Oo = softwareKeyboardController;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        SoftwareKeyboardController softwareKeyboardController = this.f48273OooO0Oo;
        if (softwareKeyboardController != null) {
            softwareKeyboardController.hide();
        }
        return Unit.INSTANCE;
    }
}
