package p507o0o00ooo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Modifier f49870OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f49871OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f49872OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Modifier modifier, int i, int i2) {
        super(2);
        this.f49870OooO0Oo = modifier;
        this.f49872OooO0o0 = i;
        this.f49871OooO0o = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        h.OooO00o(RecomposeScopeImplKt.updateChangedFlags(this.f49872OooO0o0 | 1), this.f49871OooO0o, composer, this.f49870OooO0Oo);
        return Unit.INSTANCE;
    }
}
