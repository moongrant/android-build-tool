package p507o0o00ooo;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<String, Unit> f50368OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<TextFieldValue> f50369OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y(Function1<? super String, Unit> function1, MutableState<TextFieldValue> mutableState) {
        super(0);
        this.f50368OooO0Oo = function1;
        this.f50369OooO0o0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function1<String, Unit> function1 = this.f50368OooO0Oo;
        if (function1 != null) {
            function1.invoke(x.OooO0O0(this.f50369OooO0o0).getText());
        }
        return Unit.INSTANCE;
    }
}
