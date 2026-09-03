package p535o0o0Oo0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p644o0ooOOo.o0OO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oO0Ooo extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Modifier f53818OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0 f53819OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f53820OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayoutScope f53821OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f53822OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ String f53823OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ o0OO f53824OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ o0OO f53825OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f53826OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final /* synthetic */ int f53827OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ int f53828OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0oO0Ooo(o0 o0Var, ConstraintLayoutScope constraintLayoutScope, int i, int i2, String str, Modifier modifier, o0OO o0oo, o0OO o0oo2, Function1<? super Integer, Unit> function1, int i3, int i4) {
        super(2);
        this.f53819OooO0Oo = o0Var;
        this.f53821OooO0o0 = constraintLayoutScope;
        this.f53820OooO0o = i;
        this.f53822OooO0oO = i2;
        this.f53823OooO0oo = str;
        this.f53818OooO = modifier;
        this.f53824OooOO0 = o0oo;
        this.f53825OooOO0O = o0oo2;
        this.f53826OooOO0o = function1;
        this.f53828OooOOO0 = i3;
        this.f53827OooOOO = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        o0.OooO0o0(this.f53819OooO0Oo, this.f53821OooO0o0, this.f53820OooO0o, this.f53822OooO0oO, this.f53823OooO0oo, this.f53818OooO, this.f53824OooOO0, this.f53825OooOO0O, this.f53826OooOO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f53828OooOOO0 | 1), this.f53827OooOOO);
        return Unit.INSTANCE;
    }
}
