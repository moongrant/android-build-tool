package p549o0oOO0Oo;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p569o0oOo0o0.o00000OO;
import p569o0oOo0o0.o0ooOOo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f55865OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableIntState f55866OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(MutableState<Boolean> mutableState, MutableIntState mutableIntState) {
        super(0);
        this.f55865OooO0Oo = mutableState;
        this.f55866OooO0o0 = mutableIntState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f55865OooO0Oo.setValue(Boolean.FALSE);
        if (this.f55866OooO0o0.getIntValue() != 3) {
            o0ooOOo o0ooooo = o00000OO.f56398OooO00o;
            if (o0ooooo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("account");
                o0ooooo = null;
            }
            o0ooooo.OooO0O0();
        }
        return Unit.INSTANCE;
    }
}
