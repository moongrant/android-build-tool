package p579o0oOoo;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class ooo0Oo0 {
    public static void OooO00o(@NotNull PackageManager pm, @NotNull String name) {
        Intrinsics.checkNotNullParameter(pm, "pm");
        Intrinsics.checkNotNullParameter(name, "name");
        ComponentName componentName = new ComponentName(o000O0.OooO00o(), name);
        if (pm.getComponentEnabledSetting(componentName) == 2) {
            return;
        }
        pm.setComponentEnabledSetting(componentName, 2, 1);
    }

    public static void OooO0O0(@NotNull PackageManager pm, @NotNull String name) {
        Intrinsics.checkNotNullParameter(pm, "pm");
        Intrinsics.checkNotNullParameter(name, "name");
        ComponentName componentName = new ComponentName(o000O0.OooO00o(), name);
        if (pm.getComponentEnabledSetting(componentName) == 1) {
            return;
        }
        pm.setComponentEnabledSetting(componentName, 1, 1);
    }

    public static boolean OooO0OO(@NotNull PackageManager pm, @NotNull String name) {
        Intrinsics.checkNotNullParameter(pm, "pm");
        Intrinsics.checkNotNullParameter(name, "name");
        return pm.getComponentEnabledSetting(new ComponentName(o000O0.OooO00o(), name)) == 1;
    }
}
