package p486o0o00O00;

import android.os.Looper;
import com.android.billingclient.api.o0000OO0;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.model.ApkUpResultModel;
import com.yalla.yalla.model.UpdateAppModel;
import com.yalla.yalla.ui.activity.main.AboutActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p426o0OoOO.o0OOO0o;
import p519o0o0O0oO.p4;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoOo0 extends Lambda implements Function1<ApkUpResultModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AboutActivity f48392OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(AboutActivity aboutActivity) {
        super(1);
        this.f48392OooO0Oo = aboutActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApkUpResultModel apkUpResultModel) {
        Exception e;
        double dDoubleValue;
        ApkUpResultModel apkUpResultModel2 = apkUpResultModel;
        boolean z = true;
        if (apkUpResultModel2 == null || !apkUpResultModel2.getIsUpdate()) {
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.check_for_updates_notUpdate);
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z = false;
            }
            if (!z) {
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
            o0000OO0.OooO0O0().OooO0oO();
        } else {
            o0000OO0.OooO0O0().OooO0o0("App_Version", apkUpResultModel2.getAppVersion());
            o0000OO0.OooO0O0().OooO(Boolean.valueOf(apkUpResultModel2.getIsForce()), o0OOO0o.OooO00o(apkUpResultModel2.getBuild()), apkUpResultModel2.getContent(), apkUpResultModel2.getAppUrl(), apkUpResultModel2.getAppVersion());
            int i = AboutActivity.f25353OooOoOO;
            AboutActivity aboutActivity = this.f48392OooO0Oo;
            aboutActivity.getClass();
            if (o0000OO0.OooO0O0() != null) {
                UpdateAppModel updateAppModel = new UpdateAppModel();
                updateAppModel.setNotificationInfo(oOo00OO0.ic_logo, o0000.OooO0OO(oO00OOo0.update_Download), o0000.OooO0OO(oO00OOo0.download_Progress));
                String strOooO00o = o0000OO0.OooO0O0().OooO00o(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION);
                Intrinsics.checkNotNullExpressionValue(strOooO00o, "getTableXJ().apkInfo_version");
                updateAppModel.setTargetVersionCode(strOooO00o);
                String strOooO00o2 = o0000OO0.OooO0O0().OooO00o("Neme");
                Intrinsics.checkNotNullExpressionValue(strOooO00o2, "getTableXJ().apkInfo_name");
                updateAppModel.setTargetVersionName(strOooO00o2);
                updateAppModel.setCurrentVersionCode((String) aboutActivity.f25355OooOo.getValue());
                String strOooO00o3 = o0000OO0.OooO0O0().OooO00o(ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
                Intrinsics.checkNotNullExpressionValue(strOooO00o3, "getTableXJ().apkInfo_message");
                updateAppModel.setContent(strOooO00o3);
                String strOooO00o4 = o0000OO0.OooO0O0().OooO00o("upLoadApkUrl");
                Intrinsics.checkNotNullExpressionValue(strOooO00o4, "getTableXJ().apkInfo_Url");
                updateAppModel.setApkUrl(strOooO00o4);
                updateAppModel.setUpApkCode(0);
                double dDoubleValue2 = 0.0d;
                try {
                    Double dValueOf = Double.valueOf(updateAppModel.getTargetVersionCode());
                    Intrinsics.checkNotNullExpressionValue(dValueOf, "valueOf(apkUpdateModel.targetVersionCode)");
                    dDoubleValue = dValueOf.doubleValue();
                    try {
                        Double dValueOf2 = Double.valueOf(updateAppModel.getCurrentVersionCode());
                        Intrinsics.checkNotNullExpressionValue(dValueOf2, "valueOf(apkUpdateModel.currentVersionCode)");
                        dDoubleValue2 = dValueOf2.doubleValue();
                    } catch (Exception e2) {
                        e = e2;
                        e.printStackTrace();
                    }
                } catch (Exception e3) {
                    e = e3;
                    dDoubleValue = 0.0d;
                }
                if (dDoubleValue <= dDoubleValue2) {
                    updateAppModel.setUpApkCode(0);
                } else {
                    updateAppModel.setUpApkCode(1);
                    if (o0000OO0.OooO0O0().OooO0O0("isUp", false)) {
                        updateAppModel.setUpApkCode(2);
                    }
                    aboutActivity.f25361OooOoO0 = updateAppModel;
                    ((p4) aboutActivity.f25360OooOoO.getValue()).OooOOO(aboutActivity.f25361OooOoO0);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
