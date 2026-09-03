package p531o0o0OOoo;

import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SoftwareKeyboardController f54517OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(SoftwareKeyboardController softwareKeyboardController) {
        super(1);
        this.f54517OooO0Oo = softwareKeyboardController;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        SoftwareKeyboardController softwareKeyboardController = this.f54517OooO0Oo;
        if (softwareKeyboardController != null) {
            softwareKeyboardController.hide();
        }
        return Unit.INSTANCE;
    }
}
