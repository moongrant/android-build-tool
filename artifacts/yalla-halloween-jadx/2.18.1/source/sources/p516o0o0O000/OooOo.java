package p516o0o0O000;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.application.App;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooOo f42064OooO00o = new OooOo();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Map<String, String> f42065OooO0O0;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f42065OooO0O0 = linkedHashMap;
        linkedHashMap.put("Yalla", "Yalla");
        linkedHashMap.put("Yalla_Live", "Yalla_Live");
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    @Nullable
    public final String OooO00o() {
        String string;
        App app = App.f11458Oooo0oO;
        Intrinsics.checkNotNullParameter("UMENG_CHANNEL", "channelKey");
        if (app == null) {
            return null;
        }
        try {
            PackageManager packageManager = app.getPackageManager();
            if (packageManager != null) {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(app.getPackageName(), 128);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "packageManager.getApplic…ageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle == null || (string = bundle.getString("UMENG_CHANNEL")) == null) {
                    string = "";
                }
            } else {
                string = "";
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return Intrinsics.areEqual("Yalla_Other", string) ? "Yalla_huawei" : string;
    }

    public final boolean OooO0O0() {
        return Intrinsics.areEqual("Yalla_huawei", OooO00o());
    }

    public final boolean OooO0OO(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return StringsKt__StringsKt.contains$default(str, "com.yalla.huawei.premium.", false, 2, (Object) null);
    }

    public final boolean OooO0Oo() {
        return f42065OooO0O0.containsKey(OooO00o());
    }
}
