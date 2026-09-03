package p528o0o0OOOo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p642o0ooOOo.o0OO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0o00 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Modifier f53779OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O0o00O f53780OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f53781OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayoutScope f53782OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f53783OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ String f53784OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ o0OO0O0 f53785OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ o0OO0O0 f53786OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f53787OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final /* synthetic */ int f53788OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ int f53789OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0OO0o00(o0O0o00O o0o0o00o, ConstraintLayoutScope constraintLayoutScope, int i, int i2, String str, Modifier modifier, o0OO0O0 o0oo0o1, o0OO0O0 o0oo0o2, Function1<? super Integer, Unit> function1, int i3, int i4) {
        super(2);
        this.f53780OooO0Oo = o0o0o00o;
        this.f53782OooO0o0 = constraintLayoutScope;
        this.f53781OooO0o = i;
        this.f53783OooO0oO = i2;
        this.f53784OooO0oo = str;
        this.f53779OooO = modifier;
        this.f53785OooOO0 = o0oo0o1;
        this.f53786OooOO0O = o0oo0o2;
        this.f53787OooOO0o = function1;
        this.f53789OooOOO0 = i3;
        this.f53788OooOOO = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        o0O0o00O.OooO0o0(this.f53780OooO0Oo, this.f53782OooO0o0, this.f53781OooO0o, this.f53783OooO0oO, this.f53784OooO0oo, this.f53779OooO, this.f53785OooOO0, this.f53786OooOO0O, this.f53787OooOO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f53789OooOOO0 | 1), this.f53788OooOOO);
        return Unit.INSTANCE;
    }
}
