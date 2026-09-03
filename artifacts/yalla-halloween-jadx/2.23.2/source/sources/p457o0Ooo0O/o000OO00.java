package p457o0Ooo0O;

import androidx.compose.runtime.MutableIntState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableIntState f47714OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO00(MutableIntState mutableIntState) {
        super(0);
        this.f47714OooO0Oo = mutableIntState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MutableIntState mutableIntState = this.f47714OooO0Oo;
        mutableIntState.setValue(mutableIntState.getValue().intValue() + 1);
        return Unit.INSTANCE;
    }
}
