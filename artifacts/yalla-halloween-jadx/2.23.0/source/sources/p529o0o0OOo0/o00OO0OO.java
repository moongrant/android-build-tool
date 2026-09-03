package p529o0o0OOo0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.yalla.yalla.model.ReportModel;
import com.yalla.yalla.ui.vm.report.ReportVm;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ int f54452OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00OO00O f54453OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ ReportModel f54454OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Modifier f54455OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ ReportVm f54456OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f54457OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO0OO(o00OO00O o00oo00o, Modifier modifier, ReportModel reportModel, ReportVm reportVm, int i, int i2) {
        super(2);
        this.f54453OooO0Oo = o00oo00o;
        this.f54455OooO0o0 = modifier;
        this.f54454OooO0o = reportModel;
        this.f54456OooO0oO = reportVm;
        this.f54457OooO0oo = i;
        this.f54452OooO = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        o00OO00O.OooO0Oo(this.f54453OooO0Oo, this.f54455OooO0o0, this.f54454OooO0o, this.f54456OooO0oO, this.f54457OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f54452OooO | 1));
        return Unit.INSTANCE;
    }
}
