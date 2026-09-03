package com.yalla.yalla.common.manager.googlepay;

import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.SkuDetails;
import com.qiniu.android.http.ResponseInfo;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/yalla/yalla/common/manager/googlepay/GooglePayPrice;", "", "()V", "getGooglePayPriceFormat", "", "skuDetails", "Lcom/android/billingclient/api/SkuDetails;", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GooglePayPrice {
    public static final int $stable = 0;

    @NotNull
    public static final GooglePayPrice INSTANCE = new GooglePayPrice();

    private GooglePayPrice() {
    }

    @NotNull
    public final String getGooglePayPriceFormat(@NotNull SkuDetails skuDetails) {
        double d;
        Intrinsics.checkNotNullParameter(skuDetails, "skuDetails");
        String strValueOf = String.valueOf((skuDetails.f11255OooO0O0.optLong("price_amount_micros") / ((long) ResponseInfo.UnknownError)) / 100.0d);
        StringsKt__StringsKt.indexOf$default((CharSequence) strValueOf, ".", 0, false, 6, (Object) null);
        Objects.requireNonNull(strValueOf);
        StringBuilder sb = new StringBuilder();
        sb.append(skuDetails.OooO00o());
        sb.append(' ');
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Object[] objArr = new Object[1];
        Intrinsics.checkNotNullParameter(strValueOf, "<this>");
        try {
            d = Double.parseDouble(strValueOf);
        } catch (NumberFormatException unused) {
            d = 0.0d;
        }
        objArr[0] = Double.valueOf(d);
        String str = String.format("%.2f", Arrays.copyOf(objArr, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        sb.append(str);
        return sb.toString();
    }
}
