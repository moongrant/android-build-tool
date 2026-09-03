package p457o0Ooo0O;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ int f47656OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Modifier f47657OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f47658OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f47659OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f47660OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f47661OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0000O0(Modifier modifier, String str, MutableState<Float> mutableState, Function1<? super Integer, Unit> function1, int i, int i2) {
        super(2);
        this.f47657OooO0Oo = modifier;
        this.f47659OooO0o0 = str;
        this.f47658OooO0o = mutableState;
        this.f47660OooO0oO = function1;
        this.f47661OooO0oo = i;
        this.f47656OooO = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        o0000O0O.OooO0O0(this.f47657OooO0Oo, this.f47659OooO0o0, this.f47658OooO0o, this.f47660OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f47661OooO0oo | 1), this.f47656OooO);
        return Unit.INSTANCE;
    }
}
