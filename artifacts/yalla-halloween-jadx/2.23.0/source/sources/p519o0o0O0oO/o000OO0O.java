package p519o0o0O0oO;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Long> f52511OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f52512OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f52513OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO0O(long j, MutableState mutableState, MutableState mutableState2) {
        super(0);
        this.f52511OooO0Oo = mutableState;
        this.f52513OooO0o0 = j;
        this.f52512OooO0o = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MutableState<Long> mutableState = this.f52511OooO0Oo;
        mutableState.setValue(Long.valueOf(mutableState.getValue().longValue() + ((long) 100)));
        this.f52512OooO0o.setValue(Boolean.valueOf(mutableState.getValue().longValue() > this.f52513OooO0o0));
        return Unit.INSTANCE;
    }
}
