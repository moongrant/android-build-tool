package p158o00OoOOO;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f38367OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f38368OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f38369OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(MutableState<Boolean> mutableState, Function0<Unit> function0, Function0<Unit> function1) {
        super(0);
        this.f38367OooO0Oo = mutableState;
        this.f38369OooO0o0 = function0;
        this.f38368OooO0o = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f38367OooO0Oo.setValue(Boolean.FALSE);
        Function0<Unit> function0 = this.f38369OooO0o0;
        if (function0 != null) {
            function0.invoke();
        }
        Function0<Unit> function1 = this.f38368OooO0o;
        if (function1 != null) {
            function1.invoke();
        }
        return Unit.INSTANCE;
    }
}
