package p533o0o0Oo0;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O00 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RowScope f54703OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Modifier f54704OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ oo0O f54705OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f54706OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f54707OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00(RowScope rowScope, oo0O oo0o, Modifier modifier, int i, int i2) {
        super(2);
        this.f54703OooO0Oo = rowScope;
        this.f54705OooO0o0 = oo0o;
        this.f54704OooO0o = modifier;
        this.f54706OooO0oO = i;
        this.f54707OooO0oo = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        o000.OooOO0O(this.f54703OooO0Oo, this.f54705OooO0o0, this.f54704OooO0o, this.f54706OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f54707OooO0oo | 1));
        return Unit.INSTANCE;
    }
}
