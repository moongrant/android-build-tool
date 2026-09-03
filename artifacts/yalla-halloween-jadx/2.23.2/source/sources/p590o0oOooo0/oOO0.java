package p590o0oOooo0;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.app.application.App;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oOO0 f57167OooO00o = new oOO0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final LinkedHashMap f57168OooO0O0;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f57168OooO0O0 = linkedHashMap;
        linkedHashMap.put("Google Play", "Google Play");
        linkedHashMap.put("Yalla_Live", "Yalla_Live");
    }

    public static String OooO00o(oOO0 ooo0) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        String string;
        App app = App.f22232OooO0o;
        ooo0.getClass();
        Intrinsics.checkNotNullParameter("CHANNEL", "channelKey");
        if (app != null) {
            try {
                PackageManager packageManager = app.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(app.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && (string = bundle.getString("CHANNEL")) != null) {
                    return string;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "Google Play";
    }

    public final boolean OooO0O0() {
        return Intrinsics.areEqual("Yalla_huawei", OooO00o(this));
    }

    public final boolean OooO0OO() {
        return f57168OooO0O0.containsKey(OooO00o(this));
    }
}
