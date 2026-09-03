package p642o0ooOOo;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO0oO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f59555OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0OOOO00 f59556OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0oO0(MutableState<Boolean> mutableState, o0OOOO00 o0oooo01) {
        super(0);
        this.f59555OooO0Oo = mutableState;
        this.f59556OooO0o0 = o0oooo01;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MutableState<Boolean> mutableState = this.f59555OooO0Oo;
        mutableState.setValue(Boolean.valueOf(!mutableState.getValue().booleanValue()));
        this.f59556OooO0o0.f59564OooO0oO = true;
        return Unit.INSTANCE;
    }
}
