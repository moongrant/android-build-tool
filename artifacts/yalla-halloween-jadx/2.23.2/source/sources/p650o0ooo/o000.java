package p650o0ooo;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Long> f58426OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f58427OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f58428OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000(long j, MutableState mutableState, MutableState mutableState2) {
        super(0);
        this.f58426OooO0Oo = mutableState;
        this.f58428OooO0o0 = j;
        this.f58427OooO0o = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MutableState<Long> mutableState = this.f58426OooO0Oo;
        long jLongValue = mutableState.getValue().longValue();
        long j = this.f58428OooO0o0;
        if (jLongValue > j) {
            mutableState.setValue(Long.valueOf(mutableState.getValue().longValue() - ((long) 100)));
        }
        this.f58427OooO0o.setValue(Boolean.valueOf(mutableState.getValue().longValue() > j));
        return Unit.INSTANCE;
    }
}
