package p519o0o0O0oO;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.ui.vm.main.RedemptionCodeVm;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ h0 f52353OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ float f52354OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RedemptionCodeVm f52355OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ float f52356OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f52357OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(h0 h0Var, RedemptionCodeVm redemptionCodeVm, float f, float f2, int i) {
        super(2);
        this.f52353OooO0Oo = h0Var;
        this.f52355OooO0o0 = redemptionCodeVm;
        this.f52354OooO0o = f;
        this.f52356OooO0oO = f2;
        this.f52357OooO0oo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        h0.OooO0oo(this.f52353OooO0Oo, this.f52355OooO0o0, this.f52354OooO0o, this.f52356OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52357OooO0oo | 1));
        return Unit.INSTANCE;
    }
}
