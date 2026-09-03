package p650o0ooo;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import com.code.android.util.o000000;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f59047OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<TextFieldValue> f59048OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oo0O(Function1<? super Integer, Unit> function1, MutableState<TextFieldValue> mutableState) {
        super(0);
        this.f59047OooO0Oo = function1;
        this.f59048OooO0o0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f59047OooO0Oo.invoke(Integer.valueOf(o000000.OooO0o0(this.f59048OooO0o0.getValue().getText())));
        return Unit.INSTANCE;
    }
}
