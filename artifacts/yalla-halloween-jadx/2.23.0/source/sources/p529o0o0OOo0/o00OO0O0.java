package p529o0o0OOo0;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.ReportModel;
import com.yalla.yalla.ui.screen.report.ReportRuleExplainPageScreen;
import com.yalla.yalla.ui.screen.report.ReportScreen;
import com.yalla.yalla.ui.screen.report.ReportScreenInnerPage;
import com.yalla.yalla.ui.screen.report.ReportUserScreen;
import com.yalla.yalla.ui.screen.report.utils.ReportParam;
import com.yalla.yalla.ui.vm.report.ReportVm;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p063o0000oO.o00Ooo;
import p526o0o0OOO0.oo0oOO0;
import p530o0o0OOoO.O0OO00;
import p571o0oOoOO.o0O0OOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ int f54446OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f54447OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0O0OOO0 f54448OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ReportVm f54449OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f54450OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ ReportModel f54451OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO0O0(LifecycleOwner lifecycleOwner, ReportVm reportVm, o0O0OOO0 o0o0ooo0, int i, ReportModel reportModel, int i2) {
        super(0);
        this.f54447OooO0Oo = lifecycleOwner;
        this.f54449OooO0o0 = reportVm;
        this.f54448OooO0o = o0o0ooo0;
        this.f54450OooO0oO = i;
        this.f54451OooO0oo = reportModel;
        this.f54446OooO = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = this.f54450OooO0oO;
        ReportVm reportVm = this.f54449OooO0o0;
        Long sourceId = reportVm.getSourceId();
        ReportModel reportModel = this.f54451OooO0oo;
        Bundle bundleOooO0O0 = o00Ooo.OooO0O0(TuplesKt.to(ReportScreen.PARAM_DATA, new ReportParam(i, sourceId, reportModel.getChildren(), reportModel.getId(), reportModel.getCatagoryId(), reportVm.getMessagesList(), reportVm.getExtendSourceId(), reportModel.getTitleType(), reportVm.getViewSourceType(), reportVm.getPrivateChatReportType(), reportVm.getFriendRequestMessage())));
        Integer nodeType = reportModel.getNodeType();
        if (nodeType != null && nodeType.intValue() == 1) {
            oo0oOO0.OooO0o0(ReportScreenInnerPage.INSTANCE, bundleOooO0O0, false, null, 12);
        } else if (nodeType != null && nodeType.intValue() == 2) {
            oo0oOO0.OooO0o0(ReportRuleExplainPageScreen.INSTANCE, bundleOooO0O0, false, null, 12);
        } else if (nodeType != null && nodeType.intValue() == 3) {
            reportVm.setCurrentSelectedPosition(this.f54446OooO);
        } else if (nodeType != null && nodeType.intValue() == 4) {
            oo0oOO0.OooO0o0(ReportUserScreen.INSTANCE, bundleOooO0O0, false, null, 12);
        } else if (nodeType != null && nodeType.intValue() == 5) {
            O0OO00.OooO00o(this.f54447OooO0Oo, this.f54448OooO0o, reportVm, reportModel.getId(), reportModel.getCatagoryId());
        }
        return Unit.INSTANCE;
    }
}
