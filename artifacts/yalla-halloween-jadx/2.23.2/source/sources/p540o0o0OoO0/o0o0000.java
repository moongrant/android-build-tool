package p540o0o0OoO0;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0o0000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f54872OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0o0000(MutableState<Boolean> mutableState) {
        super(0);
        this.f54872OooO0Oo = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f54872OooO0Oo.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
