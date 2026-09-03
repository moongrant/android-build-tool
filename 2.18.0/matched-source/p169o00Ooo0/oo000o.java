package p169o00Ooo0;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.util.DisplayMetrics;
import com.app.base.application.App;
import com.app.base.model.RegionCountriesModel;
import com.app.base.model.RegionModel;
import com.weieyu.yalla.R;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import p500o0o00Oo0.OooOOO;
import p619o0oo0o.o00000O0;

/* JADX INFO: loaded from: classes.dex */
public final class oo000o {
    public static String OooO00o() {
        switch (OooOOO.f41235OooO00o.OooOOO().getValue().intValue()) {
            case 0:
                return "en";
            case 1:
                return "ar";
            case 2:
                return "tr";
            case 3:
                return "in";
            case 4:
            default:
                return OooO0Oo();
            case 5:
                return "pt";
            case 6:
                return "es";
            case 7:
                return "hi";
            case 8:
                return "ur";
        }
    }

    public static int OooO0O0() {
        String strOooO00o = OooO00o();
        Objects.requireNonNull(strOooO00o);
        switch (strOooO00o) {
            case "ar":
                return 1;
            case "es":
                return 6;
            case "hi":
                return 7;
            case "in":
                return 3;
            case "pt":
                return 5;
            case "tr":
                return 2;
            case "ur":
                return 8;
            default:
                return 0;
        }
    }

    public static String OooO0OO(String str) {
        StringBuilder sb = new StringBuilder();
        p489o0o000oO.oo000o oo000oVar = p489o0o000oO.oo000o.f40977OooO00o;
        sb.append(p489o0o000oO.oo000o.f40980OooO0Oo);
        sb.append("/flags/Flag_");
        sb.append(str);
        sb.append(".png");
        return sb.toString();
    }

    public static String OooO0Oo() {
        String systemLanguage = o00000O0.OooO00o().getLanguage();
        String strOooO00o = p619o0oo0o.oo000o.OooO00o();
        String[] stringArray = App.f11473OoooO00.getResources().getStringArray(R.array.region_id_list);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getContext().resources.g…y(R.array.region_id_list)");
        HashMap map = new HashMap(stringArray.length);
        if (!(stringArray.length == 0)) {
            for (String item : stringArray) {
                Intrinsics.checkNotNullExpressionValue(item, "item");
                Object[] array = new Regex("_").split(item, 0).toArray(new String[0]);
                Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                String[] strArr = (String[]) array;
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
        if (!Intrinsics.areEqual("en", systemLanguage)) {
            return systemLanguage;
        }
        String[] stringArray2 = App.f11473OoooO00.getResources().getStringArray(R.array.id_countries_areaCode_region);
        Intrinsics.checkNotNullExpressionValue(stringArray2, "getContext().resources.g…ountries_areaCode_region)");
        HashMap map2 = new HashMap(stringArray2.length);
        if (!(stringArray2.length == 0)) {
            for (String item2 : stringArray2) {
                Intrinsics.checkNotNullExpressionValue(item2, "item");
                Object[] array2 = new Regex("_").split(item2, 0).toArray(new String[0]);
                Intrinsics.checkNotNull(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                String[] strArr2 = (String[]) array2;
                if (strArr2.length == 5) {
                    RegionCountriesModel regionCountriesModel = new RegionCountriesModel(Integer.parseInt(strArr2[0]), strArr2[1], Integer.parseInt(strArr2[2]), strArr2[3], Integer.parseInt(strArr2[4]));
                    String countriesCode = regionCountriesModel.getCountriesCode();
                    Intrinsics.checkNotNullExpressionValue(countriesCode, "regionCountriesModel.countriesCode");
                    map2.put(countriesCode, regionCountriesModel);
                }
            }
        }
        if (!map2.containsKey(strOooO00o) || map2.get(strOooO00o) == null) {
            return systemLanguage;
        }
        Object obj = map2.get(strOooO00o);
        Intrinsics.checkNotNull(obj);
        String region = ((RegionCountriesModel) obj).getRegion();
        Intrinsics.checkNotNullExpressionValue(region, "regionCountriesModelMap[…stemCountryCode]!!.region");
        return region;
    }

    public static void OooO0o(Context context) {
        try {
            Locale locale = new Locale(OooO00o(), o00000O0.OooO00o().getCountry(), o00000O0.OooO00o().getVariant());
            Resources resources = context.getResources();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            Configuration configuration = resources.getConfiguration();
            if (Build.VERSION.SDK_INT >= 24) {
                configuration.setLocale(locale);
                configuration.setLocales(new LocaleList(locale));
                context.createConfigurationContext(configuration);
                resources.updateConfiguration(configuration, displayMetrics);
            } else {
                configuration.setLocale(locale);
                resources.updateConfiguration(configuration, displayMetrics);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean OooO0o0() {
        return OooO0O0() == 1 || OooO0O0() == 8;
    }
}
