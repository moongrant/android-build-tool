package p579o0oOoo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.OooOo00;
import com.code.android.util.o000O0;
import com.qiniu.android.common.Constants;
import com.yalla.yalla.app.application.App;
import com.yalla.yalla.model.user.CountryItemData;
import com.yalla.yalla.model.user.CountryItemList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import p408o0Oo0o0O.o00Oo0;
import p584o0oOooO0.oO0O0OoO;
import p591o0oo000O.OooO;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nCountryCodeLoad.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryCodeLoad.kt\ncom/yalla/yalla/util/CountryCodeLoad\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,153:1\n37#2,2:154\n*S KotlinDebug\n*F\n+ 1 CountryCodeLoad.kt\ncom/yalla/yalla/util/CountryCodeLoad\n*L\n47#1:154,2\n*E\n"})
public final class oO0OoOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f56615OooO00o = new LinkedHashMap();

    public static CountryItemData OooO0O0(oO0OoOO0 oo0oooo0) {
        return oo0oooo0.OooO00o(o00Oo0.OooO00o().OooO0OO("loginCountryId", 0), false);
    }

    @NotNull
    public final CountryItemData OooO00o(int i, boolean z) {
        List<CountryItemData> arrayList;
        String strOooO00o;
        Integer num;
        Integer num2;
        String[] stringArray = App.f22702OooO0o.getResources().getStringArray(z ? oO0O0OoO.white_region_country_area : oO0O0OoO.region_country_area);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getContext().resources.g…rray.region_country_area)");
        HashMap map = new HashMap(stringArray.length);
        if (!(stringArray.length == 0)) {
            for (String s : stringArray) {
                Intrinsics.checkNotNullExpressionValue(s, "s");
                String[] strArr = (String[]) new Regex("_").split(s, 0).toArray(new String[0]);
                if (strArr.length == 2) {
                    map.put(strArr[1], Integer.valueOf(Integer.parseInt(strArr[0])));
                }
            }
        }
        if (i == 0 && OooOo00.OooO0O0(map)) {
            String strOooO0O0 = oO0Oo0oo.OooO0O0(o000O0.OooO00o());
            if (strOooO0O0 != null && (num2 = (Integer) map.get(strOooO0O0)) != null && num2.intValue() != 0) {
                i = num2.intValue();
            }
            if (i == 0 && (strOooO00o = oO0Oo0oo.OooO00o()) != null && (num = (Integer) map.get(strOooO00o)) != null && num.intValue() != 0) {
                i = num.intValue();
            }
        }
        CountryItemList countryItemListOooO0OO = OooO0OO();
        if (countryItemListOooO0OO == null || (arrayList = countryItemListOooO0OO.getAll()) == null) {
            arrayList = new ArrayList<>();
        }
        if (!arrayList.isEmpty()) {
            String str = Intrinsics.areEqual(OooO.OooO0O0(), "tr") ? "90" : "966";
            CountryItemData countryItemData = null;
            for (CountryItemData countryItemData2 : arrayList) {
                if (countryItemData2.getId() == i) {
                    return countryItemData2;
                }
                if (Intrinsics.areEqual(str, countryItemData2.getCountryCode())) {
                    countryItemData = countryItemData2;
                }
            }
            if (countryItemData != null) {
                return countryItemData;
            }
        }
        return CountryItemData.INSTANCE.createDefault();
    }

    public final CountryItemList OooO0OO() {
        CountryItemList countryItemList;
        boolean z;
        String strOooO0O0 = OooO.OooO0O0();
        LinkedHashMap linkedHashMap = this.f56615OooO00o;
        if (linkedHashMap.containsKey(strOooO0O0)) {
            return (CountryItemList) linkedHashMap.get(strOooO0O0);
        }
        try {
            String str = "country_code/countryCode-" + strOooO0O0 + ".json";
            InputStream inputStreamOpen = o000O0.OooO00o().getAssets().open(str);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "Utils.context.assets.open(fileName)");
            try {
                o000O0.OooO00o().getAssets().open(str);
                z = true;
            } catch (Exception e) {
                e.printStackTrace();
                z = false;
            }
            if (z) {
                inputStreamOpen = o000O0.OooO00o().getAssets().open(str);
                Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "Utils.context.assets.open(fileName)");
            }
            byte[] bArr = new byte[inputStreamOpen.available()];
            inputStreamOpen.read(bArr);
            inputStreamOpen.close();
            Charset charsetForName = Charset.forName(Constants.UTF_8);
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(\"utf-8\")");
            String str2 = new String(bArr, charsetForName);
            countryItemList = OooOo00.OooO0O0(str2) ? (CountryItemList) oOo00OO0.OooO00o(str2, CountryItemList.class) : null;
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        if (countryItemList != null) {
            linkedHashMap.clear();
            linkedHashMap.put(strOooO0O0, countryItemList);
        }
        return countryItemList;
    }
}
