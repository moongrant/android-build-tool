package p595o0oOoooo;

import com.app.base.model.ReportModel;
import com.yalla.yalla.ui.screen.report.ReportScreenCommonPage;
import com.yalla.yalla.ui.vm.report.ReportVm;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class w5 extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ ReportVm f47581Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ReportScreenCommonPage f47582Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00OOOO0 f47583Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ ReportModel f47584Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ int f47585OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ int f47586OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(ReportScreenCommonPage reportScreenCommonPage, o00OOOO0 o00oooo1, ReportModel reportModel, ReportVm reportVm, int i, int i2) {
        super(2);
        this.f47582Oooo0o = reportScreenCommonPage;
        this.f47583Oooo0oO = o00oooo1;
        this.f47584Oooo0oo = reportModel;
        this.f47581Oooo = reportVm;
        this.f47586OoooO00 = i;
        this.f47585OoooO0 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        ReportScreenCommonPage.OooO0Oo(this.f47582Oooo0o, this.f47583Oooo0oO, this.f47584Oooo0oo, this.f47581Oooo, this.f47586OoooO00, ooo00o, this.f47585OoooO0 | 1);
        return Unit.INSTANCE;
    }
}
