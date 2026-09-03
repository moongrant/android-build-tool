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
public final class b extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Function1<Long, Unit> f56418OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Modifier f56419OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ float f56420OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f56421OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Integer> f56422OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f56423OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ Function1<Float, Unit> f56424OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ Function1<Long, Unit> f56425OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f56426OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final /* synthetic */ int f56427OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ int f56428OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Modifier modifier, long j, float f, MutableState<Integer> mutableState, MutableState<Float> mutableState2, Function1<? super Long, Unit> function1, Function1<? super Float, Unit> function2, Function1<? super Long, Unit> function3, Function1<? super Integer, Unit> function4, int i, int i2) {
        super(2);
        this.f56419OooO0Oo = modifier;
        this.f56421OooO0o0 = j;
        this.f56420OooO0o = f;
        this.f56422OooO0oO = mutableState;
        this.f56423OooO0oo = mutableState2;
        this.f56418OooO = function1;
        this.f56424OooOO0 = function2;
        this.f56425OooOO0O = function3;
        this.f56426OooOO0o = function4;
        this.f56428OooOOO0 = i;
        this.f56427OooOOO = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        d.OooO0O0(this.f56419OooO0Oo, this.f56421OooO0o0, this.f56420OooO0o, this.f56422OooO0oO, this.f56423OooO0oo, this.f56418OooO, this.f56424OooOO0, this.f56425OooOO0O, this.f56426OooOO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f56428OooOOO0 | 1), this.f56427OooOOO);
        return Unit.INSTANCE;
    }
}
