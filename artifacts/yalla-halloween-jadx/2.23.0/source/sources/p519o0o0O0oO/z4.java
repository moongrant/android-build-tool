package p519o0o0O0oO;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class z4 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f53245OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(MutableState<Boolean> mutableState) {
        super(0);
        this.f53245OooO0Oo = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f53245OooO0Oo.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
