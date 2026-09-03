package p532o0o0OOo0;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p577o0oOoOo.o0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O f53454OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000(o0O o0o) {
        super(0);
        this.f53454OooO0Oo = o0o;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MutableState<Integer> mutableState = this.f53454OooO0Oo.f56500OooO0Oo;
        if (mutableState.getValue().intValue() == 2) {
            mutableState.setValue(3);
        }
        return Unit.INSTANCE;
    }
}
