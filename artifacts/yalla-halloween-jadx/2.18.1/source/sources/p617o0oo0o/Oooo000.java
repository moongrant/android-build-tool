package p617o0oo0o;

import android.content.Context;
import android.text.TextUtils;
import com.app.base.model.CountryCodeItemModel;
import com.facebook.appevents.AppEventsConstants;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo000 {
    @NotNull
    public static final Pair<String, String> OooO00o(@NotNull String phone, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(context, "context");
        for (CountryCodeItemModel countryCodeItemModel : new o00Ooo(context).OooO00o()) {
            if (StringsKt.OooOoOO(phone, countryCodeItemModel.getCountryCode())) {
                String strSubstring = phone.substring(countryCodeItemModel.getCountryCode().length(), phone.length());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return new Pair<>(countryCodeItemModel.getCountryCode(), strSubstring);
            }
        }
        return new Pair<>("", phone);
    }

    public static final boolean OooO0O0(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return (TextUtils.isEmpty(msg) || Intrinsics.areEqual(AppEventsConstants.EVENT_PARAM_VALUE_NO, msg)) ? false : true;
    }
}
