package p617o0oo0o;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.o00000O;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.application.App;
import com.app.base.model.CountryCodeItemModel;
import com.app.base.model.CountryCodeModel;
import com.qiniu.android.common.Constants;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO0OO;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import p168o00Ooo0.o0O0O00;
import p168o00Ooo0.oo000o;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f48560OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Map<String, CountryCodeModel> f48561OooO0O0;

    public o00Ooo(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f48560OooO00o = context;
        this.f48561OooO0O0 = new LinkedHashMap();
    }

    @NotNull
    public final List<CountryCodeItemModel> OooO00o() {
        List<CountryCodeItemModel> moreCountries;
        CountryCodeModel countryCodeModelOooO0OO = OooO0OO(this.f48560OooO00o);
        return (countryCodeModelOooO0OO == null || (moreCountries = countryCodeModelOooO0OO.getMoreCountries()) == null) ? new ArrayList() : moreCountries;
    }

    @NotNull
    public final CountryCodeItemModel OooO0O0() {
        Integer num;
        int iOooO00o = o00000O.OooO0O0().OooO00o("LOGIN_PHONE_COUNTRYNAME_ID");
        String[] stringArray = App.f11458Oooo0oO.getResources().getStringArray(R.array.region_country_area);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getContext().resources.g…rray.region_country_area)");
        HashMap map = new HashMap(stringArray.length);
        if (!(stringArray.length == 0)) {
            for (String s : stringArray) {
                Intrinsics.checkNotNullExpressionValue(s, "s");
                Object[] array = new Regex("_").split(s, 0).toArray(new String[0]);
                Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                String[] strArr = (String[]) array;
                if (strArr.length == 2) {
                    map.put(strArr[1], Integer.valueOf(Integer.parseInt(strArr[0])));
                }
            }
        }
        if (iOooO00o == 0 && OooO0OO.OooO0O0(map) && (num = (Integer) map.get(oo000o.OooO00o())) != null && num.intValue() != 0) {
            iOooO00o = num.intValue();
        }
        List<CountryCodeItemModel> listOooO00o = OooO00o();
        if (!listOooO00o.isEmpty()) {
            CountryCodeItemModel countryCodeItemModel = null;
            for (CountryCodeItemModel countryCodeItemModel2 : listOooO00o) {
                if (o0O0O00.OooOO0o(countryCodeItemModel2.getId()) == iOooO00o) {
                    return countryCodeItemModel2;
                }
                if (Intrinsics.areEqual("966", countryCodeItemModel2.getCountryCode())) {
                    countryCodeItemModel = countryCodeItemModel2;
                }
            }
            if (countryCodeItemModel != null) {
                return countryCodeItemModel;
            }
        }
        return CountryCodeItemModel.INSTANCE.createDefault();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, com.app.base.model.CountryCodeModel>] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, com.app.base.model.CountryCodeModel>] */
    public final CountryCodeModel OooO0OO(Context context) {
        CountryCodeModel countryCodeModel;
        boolean z;
        String currentLanguage = oo000o.OooO00o();
        if (this.f48561OooO0O0.containsKey(currentLanguage)) {
            return (CountryCodeModel) this.f48561OooO0O0.get(currentLanguage);
        }
        try {
            String str = "country_code/" + currentLanguage + ".json";
            InputStream inputStreamOpen = context.getAssets().open(str);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "context.assets.open(fileName)");
            try {
                context.getAssets().open(str);
                z = true;
            } catch (Exception e) {
                e.printStackTrace();
                z = false;
            }
            if (z) {
                inputStreamOpen = context.getAssets().open(str);
                Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "context.assets.open(fileName)");
            }
            byte[] bArr = new byte[inputStreamOpen.available()];
            inputStreamOpen.read(bArr);
            inputStreamOpen.close();
            Charset charsetForName = Charset.forName(Constants.UTF_8);
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(\"utf-8\")");
            String str2 = new String(bArr, charsetForName);
            countryCodeModel = OooO0OO.OooO0O0(str2) ? (CountryCodeModel) o0Oo0oo.OooO0O0(str2, CountryCodeModel.class) : null;
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        if (countryCodeModel != null) {
            this.f48561OooO0O0.clear();
            Map<String, CountryCodeModel> map = this.f48561OooO0O0;
            Intrinsics.checkNotNullExpressionValue(currentLanguage, "currentLanguage");
            map.put(currentLanguage, countryCodeModel);
        }
        return countryCodeModel;
    }
}
