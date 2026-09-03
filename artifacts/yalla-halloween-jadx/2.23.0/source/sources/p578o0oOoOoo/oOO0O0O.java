package p578o0oOoOoo;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0O0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f56440OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f56441OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oOO0O0O(Function1<? super Integer, Unit> function1, MutableState<Float> mutableState) {
        super(0);
        this.f56440OooO0Oo = function1;
        this.f56441OooO0o0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function1<Integer, Unit> function1 = this.f56440OooO0Oo;
        if (function1 != null) {
            Float value = this.f56441OooO0o0.getValue();
            if (value == null) {
                value = 0;
            }
            function1.invoke(Integer.valueOf(value.intValue()));
        }
        return Unit.INSTANCE;
    }
}
