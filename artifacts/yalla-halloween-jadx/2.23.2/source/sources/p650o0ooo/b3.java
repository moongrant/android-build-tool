package p650o0ooo;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p415o0Oo0oO0.o00Ooo;

/* JADX INFO: loaded from: classes4.dex */
public final class b3 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f58160OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f58161OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(MutableState<Boolean> mutableState, Function0<Unit> function0) {
        super(0);
        this.f58160OooO0Oo = mutableState;
        this.f58161OooO0o0 = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00Ooo.OooO().OooOOO0(this.f58160OooO0Oo.getValue().booleanValue());
        this.f58161OooO0o0.invoke();
        return Unit.INSTANCE;
    }
}
