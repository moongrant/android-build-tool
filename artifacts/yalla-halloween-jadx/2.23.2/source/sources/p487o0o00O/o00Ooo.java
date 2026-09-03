package p487o0o00O;

import android.os.Looper;
import androidx.activity.OooOo00;
import androidx.compose.foundation.layout.oo000o;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
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
import p269o00oooo0.o0O0oo0o;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;
import p650o0ooo.p4;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Ooo extends Lambda implements Function1<ApkUpResultModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AboutActivity f48833OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(AboutActivity aboutActivity) {
        super(1);
        this.f48833OooO0Oo = aboutActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApkUpResultModel apkUpResultModel) {
        double dDoubleValue;
        ApkUpResultModel apkUpResultModel2 = apkUpResultModel;
        boolean z = true;
        if (apkUpResultModel2 == null || !apkUpResultModel2.getIsUpdate()) {
            String strOooO0OO = o0000.OooO0OO(o000000.check_for_updates_notUpdate);
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z = false;
            }
            if (!z) {
                o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
            o0O0oo0o.OooO00o().OooO0oO();
        } else {
            o0O0oo0o.OooO00o().OooO0o0("App_Version", apkUpResultModel2.getAppVersion());
            o0O0oo0o.OooO00o().OooO(Boolean.valueOf(apkUpResultModel2.getIsForce()), oo000o.OooO00o(apkUpResultModel2.getBuild()), apkUpResultModel2.getContent(), apkUpResultModel2.getAppUrl(), apkUpResultModel2.getAppVersion());
            int i = AboutActivity.f24899OooOoOO;
            AboutActivity aboutActivity = this.f48833OooO0Oo;
            aboutActivity.getClass();
            if (o0O0oo0o.OooO00o() != null) {
                UpdateAppModel updateAppModel = new UpdateAppModel();
                updateAppModel.setNotificationInfo(o0Oo0oo.ic_logo, o0000.OooO0OO(o000000.update_Download), o0000.OooO0OO(o000000.download_Progress));
                String strOooO00o = o0O0oo0o.OooO00o().OooO00o(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION);
                Intrinsics.checkNotNullExpressionValue(strOooO00o, "getApkInfo_version(...)");
                updateAppModel.setTargetVersionCode(strOooO00o);
                String strOooO00o2 = o0O0oo0o.OooO00o().OooO00o("Neme");
                Intrinsics.checkNotNullExpressionValue(strOooO00o2, "getApkInfo_name(...)");
                updateAppModel.setTargetVersionName(strOooO00o2);
                updateAppModel.setCurrentVersionCode((String) aboutActivity.f24901OooOo.getValue());
                String strOooO00o3 = o0O0oo0o.OooO00o().OooO00o(ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
                Intrinsics.checkNotNullExpressionValue(strOooO00o3, "getApkInfo_message(...)");
                updateAppModel.setContent(strOooO00o3);
                String strOooO00o4 = o0O0oo0o.OooO00o().OooO00o("upLoadApkUrl");
                Intrinsics.checkNotNullExpressionValue(strOooO00o4, "getApkInfo_Url(...)");
                updateAppModel.setApkUrl(strOooO00o4);
                updateAppModel.setUpApkCode(0);
                double dDoubleValue2 = 0.0d;
                try {
                    Double dValueOf = Double.valueOf(updateAppModel.getTargetVersionCode());
                    Intrinsics.checkNotNullExpressionValue(dValueOf, "valueOf(...)");
                    dDoubleValue = dValueOf.doubleValue();
                    try {
                        Double dValueOf2 = Double.valueOf(updateAppModel.getCurrentVersionCode());
                        Intrinsics.checkNotNullExpressionValue(dValueOf2, "valueOf(...)");
                        dDoubleValue2 = dValueOf2.doubleValue();
                    } catch (Exception e) {
                        e = e;
                        e.printStackTrace();
                    }
                } catch (Exception e2) {
                    e = e2;
                    dDoubleValue = 0.0d;
                }
                if (dDoubleValue <= dDoubleValue2) {
                    updateAppModel.setUpApkCode(0);
                } else {
                    updateAppModel.setUpApkCode(1);
                    if (o0O0oo0o.OooO00o().OooO0O0("isUp", false)) {
                        updateAppModel.setUpApkCode(2);
                    }
                    aboutActivity.f24907OooOoO0 = updateAppModel;
                    ((p4) aboutActivity.f24906OooOoO.getValue()).OooOOO(aboutActivity.f24907OooOoO0);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
