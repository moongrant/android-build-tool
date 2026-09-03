package p519o0o0O0oO;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Long> f52500OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ long f52501OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f52502OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f52503OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f52504OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0o(MutableState<Long> mutableState, long j, long j2, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3) {
        super(0);
        this.f52500OooO0Oo = mutableState;
        this.f52502OooO0o0 = j;
        this.f52501OooO0o = j2;
        this.f52503OooO0oO = mutableState2;
        this.f52504OooO0oo = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        long j = this.f52502OooO0o0;
        long j2 = this.f52501OooO0o;
        MutableState<Boolean> mutableState = this.f52503OooO0oO;
        MutableState<Boolean> mutableState2 = this.f52504OooO0oo;
        MutableState<Long> mutableState3 = this.f52500OooO0Oo;
        mutableState3.setValue(Long.valueOf(mutableState3.getValue().longValue() - 1));
        o000O00O.OooO00o(mutableState3, j, j2, mutableState, mutableState2);
        return Unit.INSTANCE;
    }
}
