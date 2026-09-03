package OooO0O0;

import OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.o0OoOo0;
import android.content.Intent;
import android.os.Bundle;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.login.bean.AppStatus;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public androidx.activity.result.OooO0O0<Intent> f104OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ArrayList f105OooO0O0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public OooO00o f106OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public o0OoOo0.OooO00o f107OooO0Oo;

    /* JADX WARN: Code duplicated, block: B:20:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    public final OooOOO OooO00o(Intent intent) {
        OooOOO oooOOO;
        Unit unit;
        OooO00o oooO00o;
        int intExtra;
        Bundle bundleExtra;
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Intrinsics.areEqual(intent.getStringExtra("yp_sdk_version"), "1.2.0")) {
            String stringExtra = intent.getStringExtra("yp_id");
            if ((stringExtra == null || StringsKt.isBlank(stringExtra)) || (intExtra = intent.getIntExtra("yp_operation", -1)) == -1 || (bundleExtra = intent.getBundleExtra("yp_data")) == null) {
                oooOOO = null;
            } else {
                oooOOO = new OooOOO(stringExtra, intExtra, bundleExtra);
            }
        } else {
            oooOOO = null;
        }
        if (oooOOO == null) {
            unit = null;
        } else {
            if (this.f105OooO0O0.remove(oooOOO.f101OooO00o)) {
                return oooOOO;
            }
            OooO00o oooO00o2 = this.f106OooO0OO;
            if (oooO00o2 == null) {
                unit = null;
            } else {
                oooO00o2.OooO0O0("The callId in response not equals to the request's");
                unit = Unit.INSTANCE;
            }
        }
        if (unit == null && (oooO00o = this.f106OooO0OO) != null) {
            oooO00o.OooO0O0("Response data parsed from intent is null");
        }
        return null;
    }

    public final void OooO0O0(@NotNull OooO0o appInfo, int i, @NotNull Bundle requestData, @Nullable AppStatus appStatus) {
        Intrinsics.checkNotNullParameter(appInfo, "nativeAppInfo");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        String id = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(id, "randomUUID().toString()");
        this.f105OooO0O0.add(id);
        String appId = YCSDKOpenKit.getAppId$lib_release();
        String appKey = YCSDKOpenKit.getAppKey$lib_release();
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intent intent = new Intent();
        appInfo.getClass();
        intent.setClassName("com.yallatech.yallachat", "com.yallatech.support.open.YlOpenSDKActivity");
        intent.putExtra("yp_sdk_version", "1.2.0");
        intent.putExtra("yp_app_id", appId);
        intent.putExtra("yp_app_key", appKey);
        intent.putExtra("yp_operation", i);
        intent.putExtra("yp_id", id);
        if (appStatus != null) {
            intent.putExtra("yl_platform_app_name", appStatus.getAppName());
            intent.putExtra("yl_platform_app_icon", appStatus.getAppIcon());
        }
        intent.putExtra("yp_data", requestData);
        androidx.activity.result.OooO0O0<Intent> oooO0O0 = this.f104OooO00o;
        if (oooO0O0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityLauncher");
            oooO0O0 = null;
        }
        oooO0O0.OooO0O0(intent);
    }

    public final void OooO0OO(@NotNull OooOo00 appInfo) {
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        String id = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(id, "randomUUID().toString()");
        this.f105OooO0O0.add(id);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intent intent = new Intent();
        intent.setClassName("com.yallatech.yallachat", "com.yallatech.support.open.YlOpenSDKActivity");
        intent.putExtra("yp_id", id);
        intent.putExtra("yp_sdk_version", "1.2.0");
        intent.putExtra("yp_app_id", YCSDKOpenKit.getAppId$lib_release());
        intent.putExtra("yp_app_key", YCSDKOpenKit.getAppKey$lib_release());
        intent.putExtra("yp_operation", 2);
        androidx.activity.result.OooO0O0<Intent> oooO0O0 = this.f104OooO00o;
        if (oooO0O0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityLauncher");
            oooO0O0 = null;
        }
        oooO0O0.OooO0O0(intent);
    }
}
