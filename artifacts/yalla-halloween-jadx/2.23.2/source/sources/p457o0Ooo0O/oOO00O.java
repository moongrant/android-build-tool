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
public final class oOO00O extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Function1<Long, Unit> f47760OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Modifier f47761OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ float f47762OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f47763OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Integer> f47764OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f47765OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ Function1<Float, Unit> f47766OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ Function1<Long, Unit> f47767OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f47768OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final /* synthetic */ int f47769OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ int f47770OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oOO00O(Modifier modifier, long j, float f, MutableState<Integer> mutableState, MutableState<Float> mutableState2, Function1<? super Long, Unit> function1, Function1<? super Float, Unit> function2, Function1<? super Long, Unit> function3, Function1<? super Integer, Unit> function4, int i, int i2) {
        super(2);
        this.f47761OooO0Oo = modifier;
        this.f47763OooO0o0 = j;
        this.f47762OooO0o = f;
        this.f47764OooO0oO = mutableState;
        this.f47765OooO0oo = mutableState2;
        this.f47760OooO = function1;
        this.f47766OooOO0 = function2;
        this.f47767OooOO0O = function3;
        this.f47768OooOO0o = function4;
        this.f47770OooOOO0 = i;
        this.f47769OooOOO = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        o00O00o0.OooO0O0(this.f47761OooO0Oo, this.f47763OooO0o0, this.f47762OooO0o, this.f47764OooO0oO, this.f47765OooO0oo, this.f47760OooO, this.f47766OooOO0, this.f47767OooOO0O, this.f47768OooOO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f47770OooOOO0 | 1), this.f47769OooOOO);
        return Unit.INSTANCE;
    }
}
