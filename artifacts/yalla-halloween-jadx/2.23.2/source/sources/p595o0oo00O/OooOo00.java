package p595o0oo00O;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.platform.extensions.OooO0O0;
import com.code.android.util.o000O00O;
import com.yalla.yalla.app.application.App;
import com.yalla.yalla.model.RegionCountriesModel;
import com.yalla.yalla.model.RegionModel;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p386o0OOooO.o0OOO0o;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o00oO0o;
import p590o0oOooo0.oOO0O0O;
import p590o0oOooo0.oOOo0O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooOo00 {
    @JvmStatic
    @NotNull
    public static final String OooO00o(@NotNull String countryId) {
        Intrinsics.checkNotNullParameter(countryId, "countryId");
        Lazy lazy = o0OOO0o.f43500OooO0O0;
        return o0OOO0o.f43501OooO0OO + "/flags/Flag_" + countryId + ".png";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    @NotNull
    public static final String OooO0O0() {
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Integer num = (Integer) o0O00oO0.OooOOO0().getValue();
        if (num != null && num.intValue() == 0) {
            return "en";
        }
        if (num != null && num.intValue() == 1) {
            return "ar";
        }
        if (num != null && num.intValue() == 2) {
            return "tr";
        }
        if (num != null && num.intValue() == 3) {
            return "in";
        }
        if (num != null && num.intValue() == 5) {
            return "pt";
        }
        if (num != null && num.intValue() == 6) {
            return "es";
        }
        if (num != null && num.intValue() == 7) {
            return "hi";
        }
        return (num != null && num.intValue() == 8) ? "ur" : OooO0Oo(o000O00O.OooO00o());
    }

    @JvmStatic
    public static final int OooO0OO() {
        String strOooO0O0 = OooO0O0();
        int iHashCode = strOooO0O0.hashCode();
        if (iHashCode == 3121) {
            return !strOooO0O0.equals("ar") ? 0 : 1;
        }
        if (iHashCode == 3241) {
            strOooO0O0.equals("en");
            return 0;
        }
        if (iHashCode == 3246) {
            return !strOooO0O0.equals("es") ? 0 : 6;
        }
        if (iHashCode == 3329) {
            return !strOooO0O0.equals("hi") ? 0 : 7;
        }
        if (iHashCode == 3365) {
            return !strOooO0O0.equals("in") ? 0 : 3;
        }
        if (iHashCode == 3588) {
            return !strOooO0O0.equals("pt") ? 0 : 5;
        }
        if (iHashCode != 3710) {
            return (iHashCode == 3741 && strOooO0O0.equals("ur")) ? 8 : 0;
        }
        return !strOooO0O0.equals("tr") ? 0 : 2;
    }

    @JvmStatic
    @NotNull
    public static final String OooO0Oo(@Nullable Context context) {
        if (context == null) {
            return "en";
        }
        String language = oOOo0O00.OooO00o().getLanguage();
        String strOooO0Oo = oOO0O0O.OooO0Oo(context);
        String[] stringArray = App.f22232OooO0o.getResources().getStringArray(o00oO0o.region_id_list);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        HashMap map = new HashMap(stringArray.length);
        if (!(stringArray.length == 0)) {
            for (String str : stringArray) {
                Intrinsics.checkNotNull(str);
                String[] strArr = (String[]) new Regex("_").split(str, 0).toArray(new String[0]);
                if (strArr.length == 2) {
                    RegionModel regionModel = new RegionModel(strArr[0], Integer.parseInt(strArr[1]));
                    String name = regionModel.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    map.put(name, regionModel);
                }
            }
        }
        if (map.containsKey(language)) {
            Intrinsics.checkNotNull(language);
        } else {
            language = "en";
        }
        if (Intrinsics.areEqual("en", language)) {
            String[] stringArray2 = App.f22232OooO0o.getResources().getStringArray(o00oO0o.id_countries_areaCode_region);
            Intrinsics.checkNotNullExpressionValue(stringArray2, "getStringArray(...)");
            HashMap map2 = new HashMap(stringArray2.length);
            if (!(stringArray2.length == 0)) {
                for (String str2 : stringArray2) {
                    Intrinsics.checkNotNull(str2);
                    String[] strArr2 = (String[]) new Regex("_").split(str2, 0).toArray(new String[0]);
                    if (strArr2.length == 5) {
                        RegionCountriesModel regionCountriesModel = new RegionCountriesModel(Integer.parseInt(strArr2[0]), strArr2[1], Integer.parseInt(strArr2[2]), strArr2[3], Integer.parseInt(strArr2[4]));
                        String countriesCode = regionCountriesModel.getCountriesCode();
                        Intrinsics.checkNotNullExpressionValue(countriesCode, "getCountriesCode(...)");
                        map2.put(countriesCode, regionCountriesModel);
                    }
                }
            }
            if (map2.containsKey(strOooO0Oo) && map2.get(strOooO0Oo) != null) {
                Object obj = map2.get(strOooO0Oo);
                Intrinsics.checkNotNull(obj);
                String region = ((RegionCountriesModel) obj).getRegion();
                Intrinsics.checkNotNullExpressionValue(region, "getRegion(...)");
                return region;
            }
        }
        return language;
    }

    @JvmStatic
    public static final void OooO0o(@NotNull Context context) {
        Configuration configuration;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Locale locale = new Locale(OooO0O0(), oOOo0O00.OooO00o().getCountry(), oOOo0O00.OooO00o().getVariant());
            Resources resources = context.getResources();
            if (resources != null && (configuration = resources.getConfiguration()) != null) {
                Intrinsics.checkNotNull(configuration);
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                if (Build.VERSION.SDK_INT >= 24) {
                    configuration.setLocale(locale);
                    OooOOOO.OooO00o();
                    configuration.setLocales(OooO0O0.OooO00o(new Locale[]{locale}));
                    context.createConfigurationContext(configuration);
                    resources.updateConfiguration(configuration, displayMetrics);
                } else {
                    configuration.setLocale(locale);
                    resources.updateConfiguration(configuration, displayMetrics);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @JvmStatic
    public static final boolean OooO0o0() {
        return OooO0OO() == 1 || OooO0OO() == 8;
    }
}
