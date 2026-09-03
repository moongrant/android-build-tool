package p537o0o0Oo0O;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.yalla.yalla.model.ReportModel;
import com.yalla.yalla.ui.vm.report.ReportVm;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ int f54504OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000OO00 f54505OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ ReportModel f54506OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Modifier f54507OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ ReportVm f54508OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f54509OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00(o000OO00 o000oo01, Modifier modifier, ReportModel reportModel, ReportVm reportVm, int i, int i2) {
        super(2);
        this.f54505OooO0Oo = o000oo01;
        this.f54507OooO0o0 = modifier;
        this.f54506OooO0o = reportModel;
        this.f54508OooO0oO = reportVm;
        this.f54509OooO0oo = i;
        this.f54504OooO = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        o000OO00.OooO0Oo(this.f54505OooO0Oo, this.f54507OooO0o0, this.f54506OooO0o, this.f54508OooO0oO, this.f54509OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f54504OooO | 1));
        return Unit.INSTANCE;
    }
}
