package p579o0oOoo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class oOOo0000 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oOOOOo0O f56691OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f56692OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Modifier f56693OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f56694OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOo0000(oOOOOo0O oooooo0o, Modifier modifier, int i, int i2) {
        super(2);
        this.f56691OooO0Oo = oooooo0o;
        this.f56693OooO0o0 = modifier;
        this.f56692OooO0o = i;
        this.f56694OooO0oO = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f56692OooO0o | 1);
        oOOOOo0O oooooo0o = this.f56691OooO0Oo;
        Modifier modifier = this.f56693OooO0o0;
        oooooo0o.OooO00o(iUpdateChangedFlags, this.f56694OooO0oO, composer, modifier);
        return Unit.INSTANCE;
    }
}
