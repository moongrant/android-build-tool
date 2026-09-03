package p537o0o0Oo0O;

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
import p063o0000oO.o000oOoO;
import p532o0o0OOo0.o00O00;
import p538o0o0Oo0o.o00O0000;
import p577o0oOoOo.o0oOo0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OOo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ int f54538OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f54539OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0oOo0O0 f54540OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ReportVm f54541OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f54542OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ ReportModel f54543OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo0(LifecycleOwner lifecycleOwner, ReportVm reportVm, o0oOo0O0 o0ooo0o1, int i, ReportModel reportModel, int i2) {
        super(0);
        this.f54539OooO0Oo = lifecycleOwner;
        this.f54541OooO0o0 = reportVm;
        this.f54540OooO0o = o0ooo0o1;
        this.f54542OooO0oO = i;
        this.f54543OooO0oo = reportModel;
        this.f54538OooO = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = this.f54542OooO0oO;
        ReportVm reportVm = this.f54541OooO0o0;
        Long sourceId = reportVm.getSourceId();
        ReportModel reportModel = this.f54543OooO0oo;
        Bundle bundleOooO0O0 = o000oOoO.OooO0O0(TuplesKt.to(ReportScreen.PARAM_DATA, new ReportParam(i, sourceId, reportModel.getChildren(), reportModel.getId(), reportModel.getCatagoryId(), reportVm.getMessagesList(), reportVm.getExtendSourceId(), reportModel.getTitleType(), reportVm.getViewSourceType(), reportVm.getPrivateChatReportType(), reportVm.getFriendRequestMessage())));
        Integer nodeType = reportModel.getNodeType();
        if (nodeType != null && nodeType.intValue() == 1) {
            o00O00.OooO0o0(ReportScreenInnerPage.INSTANCE, bundleOooO0O0, false, null, 12);
        } else if (nodeType != null && nodeType.intValue() == 2) {
            o00O00.OooO0o0(ReportRuleExplainPageScreen.INSTANCE, bundleOooO0O0, false, null, 12);
        } else if (nodeType != null && nodeType.intValue() == 3) {
            reportVm.setCurrentSelectedPosition(this.f54538OooO);
        } else if (nodeType != null && nodeType.intValue() == 4) {
            o00O00.OooO0o0(ReportUserScreen.INSTANCE, bundleOooO0O0, false, null, 12);
        } else if (nodeType != null && nodeType.intValue() == 5) {
            o00O0000.OooO00o(this.f54539OooO0Oo, this.f54540OooO0o, reportVm, reportModel.getId(), reportModel.getCatagoryId());
        }
        return Unit.INSTANCE;
    }
}
