package p541o0o0OoOO;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0O0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f55236OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0O0O(MutableState<Boolean> mutableState) {
        super(0);
        this.f55236OooO0Oo = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f55236OooO0Oo.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
