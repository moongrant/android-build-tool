package p644o0ooOOo;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOOO0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f58064OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ooo0Oo0 f58065OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOOO0o(MutableState<Boolean> mutableState, ooo0Oo0 ooo0oo0) {
        super(0);
        this.f58064OooO0Oo = mutableState;
        this.f58065OooO0o0 = ooo0oo0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MutableState<Boolean> mutableState = this.f58064OooO0Oo;
        mutableState.setValue(Boolean.valueOf(!mutableState.getValue().booleanValue()));
        this.f58065OooO0o0.f58102OooO0oO = true;
        return Unit.INSTANCE;
    }
}
