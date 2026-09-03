package p537o0o0OoO;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0OOoo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f55408OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0OOoo(MutableState<Boolean> mutableState) {
        super(0);
        this.f55408OooO0Oo = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f55408OooO0Oo.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
