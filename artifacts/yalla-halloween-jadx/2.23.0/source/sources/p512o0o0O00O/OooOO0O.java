package p512o0o0O00O;

import android.widget.EditText;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<String, Unit> f51510OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<EditText> f51511OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooOO0O(Function1<? super String, Unit> function1, MutableState<EditText> mutableState) {
        super(0);
        this.f51510OooO0Oo = function1;
        this.f51511OooO0o0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EditText value = this.f51511OooO0o0.getValue();
        this.f51510OooO0Oo.invoke(String.valueOf(value != null ? value.getText() : null));
        return Unit.INSTANCE;
    }
}
