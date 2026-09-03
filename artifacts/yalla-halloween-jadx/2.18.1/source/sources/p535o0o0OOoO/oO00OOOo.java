package p535o0o0OOoO;

import android.os.Looper;
import com.android.billingclient.api.o00000O;
import com.code.android.util.ToastUtil;
import com.facebook.share.internal.ShareConstants;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.ApkUpResultModel;
import com.yalla.yalla.model.UpdateAppModel;
import com.yalla.yalla.ui.activity.main.AboutActivity;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p074o000O0oo.OooOOO;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p579o0oOoOOo.q1;

/* JADX INFO: loaded from: classes2.dex */
public final class oO00OOOo extends Lambda implements Function1<ApkUpResultModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ AboutActivity f43632Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00OOOo(AboutActivity aboutActivity) {
        super(1);
        this.f43632Oooo0o = aboutActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApkUpResultModel apkUpResultModel) {
        Exception e;
        double dDoubleValue;
        ApkUpResultModel apkUpResultModel2 = apkUpResultModel;
        if (apkUpResultModel2 == null || !apkUpResultModel2.getIsUpdate()) {
            String strOooO0OO = o000O0O0.OooO0OO(R.string.check_for_updates_notUpdate);
            ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o0o0oooOooO0O0.run();
                } else {
                    o00O000 o00o001 = o00O000.f34346OooO00o;
                    o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                }
            }
            o00000O.OooO0O0().OooO();
        } else {
            o00000O.OooO0O0().OooO0oO("App_Version", apkUpResultModel2.getAppVersion());
            o00000O.OooO0O0().OooOOO(Boolean.valueOf(apkUpResultModel2.getIsForce()), apkUpResultModel2.getBuild() + "", apkUpResultModel2.getContent(), apkUpResultModel2.getAppUrl(), apkUpResultModel2.getAppVersion());
            AboutActivity aboutActivity = this.f43632Oooo0o;
            int i = AboutActivity.f21906OoooooO;
            Objects.requireNonNull(aboutActivity);
            if (o00000O.OooO0O0() != null) {
                UpdateAppModel updateAppModel = new UpdateAppModel();
                updateAppModel.setNotificationInfo(R.drawable.ic_logo, o000O0O0.OooO0OO(R.string.update_Download), o000O0O0.OooO0OO(R.string.download_Progress));
                String strOooOO0O = o00000O.OooO0O0().OooOO0O();
                Intrinsics.checkNotNullExpressionValue(strOooOO0O, "getTableXJ().apkInfo_version");
                updateAppModel.setTargetVersionCode(strOooOO0O);
                String strOooO0OO2 = o00000O.OooO0O0().OooO0OO("Neme");
                Intrinsics.checkNotNullExpressionValue(strOooO0OO2, "getTableXJ().apkInfo_name");
                updateAppModel.setTargetVersionName(strOooO0OO2);
                Object value = aboutActivity.f21912OooooOo.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "<get-mCurrentVersionCode>(...)");
                updateAppModel.setCurrentVersionCode((String) value);
                String strOooO0OO3 = o00000O.OooO0O0().OooO0OO(ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
                Intrinsics.checkNotNullExpressionValue(strOooO0OO3, "getTableXJ().apkInfo_message");
                updateAppModel.setContent(strOooO0OO3);
                String strOooO0OO4 = o00000O.OooO0O0().OooO0OO("upLoadApkUrl");
                Intrinsics.checkNotNullExpressionValue(strOooO0OO4, "getTableXJ().apkInfo_Url");
                updateAppModel.setApkUrl(strOooO0OO4);
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
                    if (o00000O.OooO0O0().OooOO0()) {
                        updateAppModel.setUpApkCode(2);
                    }
                    aboutActivity.f21914Oooooo0 = updateAppModel;
                    ((q1) aboutActivity.f21913Oooooo.getValue()).OooOOOO(aboutActivity.f21914Oooooo0);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
