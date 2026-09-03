package p591o0oo000O;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.platform.extensions.OooO0O0;
import com.code.android.util.o000O0;
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
import p382o0OOoo0o.o0OoOo0;
import p464o0Oooo.o000000O;
import p579o0oOoo.oO00o000;
import p579o0oOoo.oO0Oo0oo;
import p584o0oOooO0.oO0O0OoO;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class OooO {
    @JvmStatic
    @NotNull
    public static final String OooO00o(@NotNull String countryId) {
        Intrinsics.checkNotNullParameter(countryId, "countryId");
        Lazy lazy = o0OoOo0.f44301OooO0O0;
        return o0OoOo0.f44302OooO0OO + "/flags/Flag_" + countryId + ".png";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    @NotNull
    public static final String OooO0O0() {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Integer num = (Integer) o000000O.OooOOO0().getValue();
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
        return (num != null && num.intValue() == 8) ? "ur" : OooO0Oo(o000O0.OooO00o());
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
        String systemLanguage = oO00o000.OooO00o().getLanguage();
        String strOooO0Oo = oO0Oo0oo.OooO0Oo(context);
        String[] stringArray = App.f22702OooO0o.getResources().getStringArray(oO0O0OoO.region_id_list);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getContext().resources.g…y(R.array.region_id_list)");
        HashMap map = new HashMap(stringArray.length);
        if (!(stringArray.length == 0)) {
            for (String item : stringArray) {
                Intrinsics.checkNotNullExpressionValue(item, "item");
                String[] strArr = (String[]) new Regex("_").split(item, 0).toArray(new String[0]);
                if (strArr.length == 2) {
                    RegionModel regionModel = new RegionModel(strArr[0], Integer.parseInt(strArr[1]));
                    String name = regionModel.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "regionModel.name");
                    map.put(name, regionModel);
                }
            }
        }
        if (map.containsKey(systemLanguage)) {
            Intrinsics.checkNotNullExpressionValue(systemLanguage, "systemLanguage");
        } else {
            systemLanguage = "en";
        }
        if (Intrinsics.areEqual("en", systemLanguage)) {
            String[] stringArray2 = App.f22702OooO0o.getResources().getStringArray(oO0O0OoO.id_countries_areaCode_region);
            Intrinsics.checkNotNullExpressionValue(stringArray2, "getContext().resources.g…ountries_areaCode_region)");
            HashMap map2 = new HashMap(stringArray2.length);
            if (!(stringArray2.length == 0)) {
                for (String item2 : stringArray2) {
                    Intrinsics.checkNotNullExpressionValue(item2, "item");
                    String[] strArr2 = (String[]) new Regex("_").split(item2, 0).toArray(new String[0]);
                    if (strArr2.length == 5) {
                        RegionCountriesModel regionCountriesModel = new RegionCountriesModel(Integer.parseInt(strArr2[0]), strArr2[1], Integer.parseInt(strArr2[2]), strArr2[3], Integer.parseInt(strArr2[4]));
                        String countriesCode = regionCountriesModel.getCountriesCode();
                        Intrinsics.checkNotNullExpressionValue(countriesCode, "regionCountriesModel.countriesCode");
                        map2.put(countriesCode, regionCountriesModel);
                    }
                }
            }
            if (map2.containsKey(strOooO0Oo) && map2.get(strOooO0Oo) != null) {
                Object obj = map2.get(strOooO0Oo);
                Intrinsics.checkNotNull(obj);
                String region = ((RegionCountriesModel) obj).getRegion();
                Intrinsics.checkNotNullExpressionValue(region, "regionCountriesModelMap[…stemCountryCode]!!.region");
                return region;
            }
        }
        return systemLanguage;
    }

    @JvmStatic
    public static final void OooO0o(@NotNull Context context) {
        Configuration configuration;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Locale locale = new Locale(OooO0O0(), oO00o000.OooO00o().getCountry(), oO00o000.OooO00o().getVariant());
            Resources resources = context.getResources();
            if (resources != null && (configuration = resources.getConfiguration()) != null) {
                Intrinsics.checkNotNullExpressionValue(configuration, "configuration");
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                if (Build.VERSION.SDK_INT >= 24) {
                    configuration.setLocale(locale);
                    OooO0o.OooO00o();
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
