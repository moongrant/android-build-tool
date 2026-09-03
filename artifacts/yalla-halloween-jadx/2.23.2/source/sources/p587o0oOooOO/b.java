package p587o0oOooOO;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Modifier f56745OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f56746OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f56747OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f56748OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, int i, int i2) {
        super(2);
        this.f56745OooO0Oo = modifier;
        this.f56747OooO0o0 = function2;
        this.f56746OooO0o = i;
        this.f56748OooO0oO = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f56746OooO0o | 1);
        O0000000.OooO0O0(this.f56745OooO0Oo, this.f56747OooO0o0, composer, iUpdateChangedFlags, this.f56748OooO0oO);
        return Unit.INSTANCE;
    }
}
