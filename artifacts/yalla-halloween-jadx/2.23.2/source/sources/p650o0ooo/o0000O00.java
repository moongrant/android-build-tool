package p650o0ooo;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Long> f58453OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ long f58454OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f58455OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f58456OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f58457OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O00(MutableState<Long> mutableState, long j, long j2, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3) {
        super(0);
        this.f58453OooO0Oo = mutableState;
        this.f58455OooO0o0 = j;
        this.f58454OooO0o = j2;
        this.f58456OooO0oO = mutableState2;
        this.f58457OooO0oo = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        long j = this.f58455OooO0o0;
        long j2 = this.f58454OooO0o;
        MutableState<Boolean> mutableState = this.f58456OooO0oO;
        MutableState<Boolean> mutableState2 = this.f58457OooO0oo;
        MutableState<Long> mutableState3 = this.f58453OooO0Oo;
        mutableState3.setValue(Long.valueOf(mutableState3.getValue().longValue() - 1));
        o0000O0O.OooO00o(mutableState3, j, j2, mutableState, mutableState2);
        return Unit.INSTANCE;
    }
}
