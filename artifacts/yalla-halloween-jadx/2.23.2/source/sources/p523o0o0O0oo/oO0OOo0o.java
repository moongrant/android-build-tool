package p523o0o0O0oo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OOo0o extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO0OoOO0 f53179OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Modifier f53180OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f53181OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f53182OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OOo0o(oO0OoOO0 oo0oooo0, int i, Modifier modifier, int i2) {
        super(2);
        this.f53179OooO0Oo = oo0oooo0;
        this.f53181OooO0o0 = i;
        this.f53180OooO0o = modifier;
        this.f53182OooO0oO = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f53182OooO0oO | 1);
        int i = this.f53181OooO0o0;
        Modifier modifier = this.f53180OooO0o;
        this.f53179OooO0Oo.OooO0O0(i, iUpdateChangedFlags, composer, modifier);
        return Unit.INSTANCE;
    }
}
