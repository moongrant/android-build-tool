package OooO00o;

import android.content.Intent;
import android.os.Bundle;
import com.umeng.commonsdk.internal.a;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.login.bean.AppStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public androidx.activity.result.OooO0O0<Intent> f76OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public List<String> f77OooO0O0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public OooO0O0 f78OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Function1<? super OooOo, Unit> f79OooO0Oo;

    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public final OooOOOO OooO00o(Intent intent) {
        OooOOOO oooOOOO;
        Unit unit;
        OooO0O0 oooO0O0;
        int intExtra;
        Bundle bundleExtra;
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Intrinsics.areEqual(intent.getStringExtra("yp_sdk_version"), a.e)) {
            String stringExtra = intent.getStringExtra("yp_id");
            if ((stringExtra == null || StringsKt.isBlank(stringExtra)) || (intExtra = intent.getIntExtra("yp_operation", -1)) == -1 || (bundleExtra = intent.getBundleExtra("yp_data")) == null) {
                oooOOOO = null;
            } else {
                oooOOOO = new OooOOOO(stringExtra, intExtra, bundleExtra);
            }
        } else {
            oooOOOO = null;
        }
        if (oooOOOO == null) {
            unit = null;
        } else {
            if (this.f77OooO0O0.remove(oooOOOO.f83OooO00o)) {
                return oooOOOO;
            }
            OooO0O0 oooO0O1 = this.f78OooO0OO;
            if (oooO0O1 == null) {
                unit = null;
            } else {
                oooO0O1.OooO00o("The callId in response not equals to the request's");
                unit = Unit.INSTANCE;
            }
        }
        if (unit == null && (oooO0O0 = this.f78OooO0OO) != null) {
            oooO0O0.OooO00o("Response data parsed from intent is null");
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public final void OooO0O0() {
        OooOo appInfo = OooOo.f86OooO0O0;
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        String id = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(id, "randomUUID().toString()");
        this.f77OooO0O0.add(id);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intent intent = new Intent();
        intent.setClassName("com.yallatech.yallachat", "com.yallatech.support.open.YlOpenSDKActivity");
        intent.putExtra("yp_id", id);
        intent.putExtra("yp_sdk_version", a.e);
        intent.putExtra("yp_app_id", YCSDKOpenKit.getAppId$lib_release());
        intent.putExtra("yp_app_key", YCSDKOpenKit.getAppKey$lib_release());
        intent.putExtra("yp_operation", 2);
        androidx.activity.result.OooO0O0<Intent> oooO0O0 = this.f76OooO00o;
        if (oooO0O0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityLauncher");
            oooO0O0 = null;
        }
        oooO0O0.OooO0O0(intent);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public final void OooO0OO(@NotNull OooO appInfo, int i, @NotNull Bundle requestData, @Nullable AppStatus appStatus) {
        Intrinsics.checkNotNullParameter(appInfo, "nativeAppInfo");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        String id = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(id, "randomUUID().toString()");
        this.f77OooO0O0.add(id);
        String appId = YCSDKOpenKit.getAppId$lib_release();
        String appKey = YCSDKOpenKit.getAppKey$lib_release();
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intent intent = new Intent();
        Objects.requireNonNull(appInfo);
        intent.setClassName("com.yallatech.yallachat", "com.yallatech.support.open.YlOpenSDKActivity");
        intent.putExtra("yp_sdk_version", a.e);
        intent.putExtra("yp_app_id", appId);
        intent.putExtra("yp_app_key", appKey);
        intent.putExtra("yp_operation", i);
        intent.putExtra("yp_id", id);
        if (appStatus != null) {
            intent.putExtra("yl_platform_app_name", appStatus.getAppName());
            intent.putExtra("yl_platform_app_icon", appStatus.getAppIcon());
        }
        intent.putExtra("yp_data", requestData);
        androidx.activity.result.OooO0O0<Intent> oooO0O0 = this.f76OooO00o;
        if (oooO0O0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityLauncher");
            oooO0O0 = null;
        }
        oooO0O0.OooO0O0(intent);
    }
}
