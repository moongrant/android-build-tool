package p207o00o0oO0;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f39411OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f39412OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f39413OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f39414OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0000O(boolean z, MutableState<Boolean> mutableState, Function1<? super Integer, Unit> function1, int i) {
        super(0);
        this.f39411OooO0Oo = z;
        this.f39413OooO0o0 = mutableState;
        this.f39412OooO0o = function1;
        this.f39414OooO0oO = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.f39411OooO0Oo) {
            this.f39413OooO0o0.setValue(Boolean.FALSE);
        }
        this.f39412OooO0o.invoke(Integer.valueOf(this.f39414OooO0oO));
        return Unit.INSTANCE;
    }
}
