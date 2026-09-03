package p526o0o0OOO0;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p571o0oOoOO.oo0OOoo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0OOoo f53600OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0000(oo0OOoo oo0oooo) {
        super(0);
        this.f53600OooO0Oo = oo0oooo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MutableState<Integer> mutableState = this.f53600OooO0Oo.f56256OooO0Oo;
        if (mutableState.getValue().intValue() == 2) {
            mutableState.setValue(3);
        }
        return Unit.INSTANCE;
    }
}
