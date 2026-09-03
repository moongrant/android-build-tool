package p541o0o0OoOO;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RowScope f55072OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Modifier f55073OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ oo00 f55074OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f55075OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f55076OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO(RowScope rowScope, oo00 oo00Var, Modifier modifier, int i, int i2) {
        super(2);
        this.f55072OooO0Oo = rowScope;
        this.f55074OooO0o0 = oo00Var;
        this.f55073OooO0o = modifier;
        this.f55075OooO0oO = i;
        this.f55076OooO0oo = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        oO0Oo0o0.OooOO0O(this.f55072OooO0Oo, this.f55074OooO0o0, this.f55073OooO0o, this.f55075OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f55076OooO0oo | 1));
        return Unit.INSTANCE;
    }
}
