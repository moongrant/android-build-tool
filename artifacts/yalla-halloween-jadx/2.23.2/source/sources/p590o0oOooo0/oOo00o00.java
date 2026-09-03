package p590o0oOooo0;

import com.yalla.yalla.model.user.CountryItemData;
import com.yalla.yalla.model.user.CountryItemList;
import com.yalla.yalla.ui.activity.BaseActivityK;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nAccountUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountUtil.kt\ncom/yalla/yalla/util/AccountUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,21:1\n1855#2,2:22\n*S KotlinDebug\n*F\n+ 1 AccountUtil.kt\ncom/yalla/yalla/util/AccountUtilKt\n*L\n13#1:22,2\n*E\n"})
public final class oOo00o00 {
    @NotNull
    public static final Pair OooO00o(@NotNull BaseActivityK context, @NotNull String phone) {
        List<CountryItemData> arrayList;
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(context, "context");
        CountryItemList countryItemListOooO0OO = new oOO0O0O0().OooO0OO();
        if (countryItemListOooO0OO == null || (arrayList = countryItemListOooO0OO.getAll()) == null) {
            arrayList = new ArrayList<>();
        }
        for (CountryItemData countryItemData : arrayList) {
            if (StringsKt__StringsJVMKt.startsWith$default(phone, countryItemData.getCountryCode(), false, 2, null)) {
                String strSubstring = phone.substring(countryItemData.getCountryCode().length(), phone.length());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return new Pair(countryItemData.getCountryCode(), strSubstring);
            }
        }
        return new Pair("", phone);
    }
}
