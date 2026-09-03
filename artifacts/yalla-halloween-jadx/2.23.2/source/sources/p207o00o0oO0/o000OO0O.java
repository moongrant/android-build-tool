package p207o00o0oO0;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OO0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f39624OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f39625OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f39626OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO0O(boolean z, MutableState<Boolean> mutableState, Function0<Unit> function0) {
        super(0);
        this.f39624OooO0Oo = z;
        this.f39626OooO0o0 = mutableState;
        this.f39625OooO0o = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.f39624OooO0Oo) {
            this.f39626OooO0o0.setValue(Boolean.FALSE);
        }
        this.f39625OooO0o.invoke();
        return Unit.INSTANCE;
    }
}
