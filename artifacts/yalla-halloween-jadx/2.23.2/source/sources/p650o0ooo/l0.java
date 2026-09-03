package p650o0ooo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.ui.vm.main.RedemptionCodeVm;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ k0 f58367OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ float f58368OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RedemptionCodeVm f58369OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ float f58370OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f58371OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(k0 k0Var, RedemptionCodeVm redemptionCodeVm, float f, float f2, int i) {
        super(2);
        this.f58367OooO0Oo = k0Var;
        this.f58369OooO0o0 = redemptionCodeVm;
        this.f58368OooO0o = f;
        this.f58370OooO0oO = f2;
        this.f58371OooO0oo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        k0.OooO0oo(this.f58367OooO0Oo, this.f58369OooO0o0, this.f58368OooO0o, this.f58370OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f58371OooO0oo | 1));
        return Unit.INSTANCE;
    }
}
