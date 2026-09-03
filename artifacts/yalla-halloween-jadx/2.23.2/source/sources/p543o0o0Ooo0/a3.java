package p543o0o0Ooo0;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class a3 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f55362OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(MutableState<Boolean> mutableState) {
        super(0);
        this.f55362OooO0Oo = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MutableState<Boolean> mutableState = this.f55362OooO0Oo;
        mutableState.setValue(Boolean.valueOf(!mutableState.getValue().booleanValue()));
        return Unit.INSTANCE;
    }
}
