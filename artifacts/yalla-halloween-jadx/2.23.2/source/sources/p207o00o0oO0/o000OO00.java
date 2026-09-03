package p207o00o0oO0;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OO00 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f39610OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f39611OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f39612OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f39613OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f39614OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ boolean f39615OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f39616OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f39617OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f39618OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final /* synthetic */ Modifier f39619OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f39620OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final /* synthetic */ int f39621OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final /* synthetic */ int f39622OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final /* synthetic */ int f39623OooOOo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o000OO00(MutableState<Boolean> mutableState, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function4, boolean z, Function0<Unit> function0, Function0<Unit> function1, Function2<? super Composer, ? super Integer, Unit> function5, Function2<? super Composer, ? super Integer, Unit> function6, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function7, Modifier modifier, int i, int i2, int i3) {
        super(2);
        this.f39611OooO0Oo = mutableState;
        this.f39613OooO0o0 = function3;
        this.f39612OooO0o = function2;
        this.f39614OooO0oO = function4;
        this.f39615OooO0oo = z;
        this.f39610OooO = function0;
        this.f39616OooOO0 = function1;
        this.f39617OooOO0O = function5;
        this.f39618OooOO0o = function6;
        this.f39620OooOOO0 = function7;
        this.f39619OooOOO = modifier;
        this.f39621OooOOOO = i;
        this.f39622OooOOOo = i2;
        this.f39623OooOOo0 = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        o000O0Oo.OooO0o(this.f39611OooO0Oo, this.f39613OooO0o0, this.f39612OooO0o, this.f39614OooO0oO, this.f39615OooO0oo, this.f39610OooO, this.f39616OooOO0, this.f39617OooOO0O, this.f39618OooOO0o, this.f39620OooOOO0, this.f39619OooOOO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f39621OooOOOO | 1), RecomposeScopeImplKt.updateChangedFlags(this.f39622OooOOOo), this.f39623OooOOo0);
        return Unit.INSTANCE;
    }
}
