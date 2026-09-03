package p578o0oOoOoo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0OO0O extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ int f56450OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Modifier f56451OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f56452OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f56453OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f56454OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f56455OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oOO0OO0O(Modifier modifier, String str, MutableState<Float> mutableState, Function1<? super Integer, Unit> function1, int i, int i2) {
        super(2);
        this.f56451OooO0Oo = modifier;
        this.f56453OooO0o0 = str;
        this.f56452OooO0o = mutableState;
        this.f56454OooO0oO = function1;
        this.f56455OooO0oo = i;
        this.f56450OooO = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        oOO0OO.OooO0O0(this.f56451OooO0Oo, this.f56453OooO0o0, this.f56452OooO0o, this.f56454OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f56455OooO0oo | 1), this.f56450OooO);
        return Unit.INSTANCE;
    }
}
