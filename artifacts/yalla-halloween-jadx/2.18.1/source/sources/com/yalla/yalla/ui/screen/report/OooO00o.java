package com.yalla.yalla.ui.screen.report;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.app.base.model.ReportModel;
import com.yalla.yalla.ui.screen.report.utils.ReportParam;
import com.yalla.yalla.ui.vm.report.ReportVm;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o000O00O.OooO0OO;
import p584o0oOoo.o000O;
import p595o0oOoooo.t5;
import p595o0oOoooo.x5;
import p595o0oOoooo.y5;
import p604o0oo00oO.oO0Oo0oo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f24699Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f24700Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ReportVm f24701Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ oO0Oo0oo f24702Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ int f24703OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ ReportModel f24704OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(LifecycleOwner lifecycleOwner, ReportVm reportVm, oO0Oo0oo oo0oo0oo, int i, ReportModel reportModel, int i2) {
        super(0);
        this.f24700Oooo0o = lifecycleOwner;
        this.f24701Oooo0oO = reportVm;
        this.f24702Oooo0oo = oo0oo0oo;
        this.f24699Oooo = i;
        this.f24704OoooO00 = reportModel;
        this.f24703OoooO0 = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LifecycleOwner lifecycleOwner = this.f24700Oooo0o;
        ReportVm reportVm = this.f24701Oooo0oO;
        oO0Oo0oo oo0oo0oo = this.f24702Oooo0oo;
        int i = this.f24699Oooo;
        ReportModel reportModel = this.f24704OoooO00;
        int i2 = this.f24703OoooO0;
        Bundle bundleOooO0O0 = OooO0OO.OooO0O0(TuplesKt.to("report_params_data", new ReportParam(i, reportVm.getSourceId(), reportModel.getChildren(), reportModel.getId(), reportModel.getCatagoryId(), reportVm.getMessagesList(), reportVm.getExtendSourceId(), reportModel.getTitleType(), reportVm.getViewSourceType(), reportVm.getPrivateChatReportType())));
        Integer nodeType = reportModel.getNodeType();
        if (nodeType != null && nodeType.intValue() == 1) {
            o000O.OooO00o(x5.f47587OooO00o, bundleOooO0O0);
        } else if (nodeType != null && nodeType.intValue() == 2) {
            o000O.OooO00o(t5.f47563OooO00o, bundleOooO0O0);
        } else if (nodeType != null && nodeType.intValue() == 3) {
            reportVm.setCurrentSelectedPosition(i2);
        } else if (nodeType != null && nodeType.intValue() == 4) {
            o000O.OooO00o(y5.f47591OooO00o, bundleOooO0O0);
        } else if (nodeType != null && nodeType.intValue() == 5) {
            o0oo0000.OooO00o.OooO00o(lifecycleOwner, oo0oo0oo, reportVm, reportModel.getId(), reportModel.getCatagoryId());
        }
        return Unit.INSTANCE;
    }
}
