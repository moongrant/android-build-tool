package p591o0oo000O;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class OooOO0 {

    @StabilityInferred(parameters = 0)
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f56799OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final String f56800OooO0O0;

        public OooO00o(int i, @NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.f56799OooO00o = i;
            this.f56800OooO0O0 = text;
        }
    }

    @NotNull
    public static String OooO00o(@NotNull Context context, @StringRes int i, @NotNull String str, @NotNull Locale locale) {
        Exception e;
        Resources resourcesForApplication;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(str, "default");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Resources resources = null;
        try {
            resourcesForApplication = context.getApplicationContext().getPackageManager().getResourcesForApplication(context.getPackageName());
            if (resourcesForApplication != null) {
                try {
                    Configuration configuration = resourcesForApplication.getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration, "it.configuration");
                    configuration.locale = locale;
                    resourcesForApplication.updateConfiguration(configuration, null);
                } catch (Exception e2) {
                    e = e2;
                    resources = resourcesForApplication;
                    e.printStackTrace();
                    resourcesForApplication = resources;
                }
            }
        } catch (Exception e3) {
            e = e3;
        }
        if (resourcesForApplication != null) {
            try {
                str = resourcesForApplication.getString(i);
            } catch (Exception unused) {
            }
            Intrinsics.checkNotNullExpressionValue(str, "{\n            try {\n    …t\n            }\n        }");
        }
        return str;
    }
}
