package p578o0oOoOoo;

import androidx.compose.runtime.MutableIntState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOo0000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableIntState f56501OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOo0000(MutableIntState mutableIntState) {
        super(0);
        this.f56501OooO0Oo = mutableIntState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MutableIntState mutableIntState = this.f56501OooO0Oo;
        mutableIntState.setValue(mutableIntState.getValue().intValue() + 1);
        return Unit.INSTANCE;
    }
}
