package p437o0OoOOo0;

import com.android.billingclient.api.ProductDetails;
import com.code.android.util.o0OoOo0;
import com.qiniu.android.http.ResponseInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ProductDetails f47164OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ List<o000OO00> f47165OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO0O(ProductDetails productDetails, List<o000OO00> list) {
        super(0);
        this.f47164OooO0Oo = productDetails;
        this.f47165OooO0o0 = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ProductDetails.OooO0o oooO0o;
        ProductDetails.OooO0OO oooO0OO;
        ArrayList arrayList;
        ProductDetails.OooO0O0 oooO0O0;
        ProductDetails productDetails = this.f47164OooO0Oo;
        ArrayList arrayList2 = productDetails.f12758OooO0oO;
        if (arrayList2 != null && (oooO0o = (ProductDetails.OooO0o) arrayList2.get(0)) != null && (oooO0OO = oooO0o.f12766OooO0O0) != null && (arrayList = oooO0OO.f12764OooO00o) != null && (oooO0O0 = (ProductDetails.OooO0O0) arrayList.get(0)) != null) {
            String str = productDetails.f12754OooO0OO;
            Intrinsics.checkNotNullExpressionValue(str, "getProductId(...)");
            o000OO00 o000oo01 = new o000OO00(str);
            String strValueOf = String.valueOf((oooO0O0.f12762OooO00o / ((long) ResponseInfo.UnknownError)) / 100.0d);
            StringsKt__StringsKt.indexOf$default((CharSequence) strValueOf, ".", 0, false, 6, (Object) null);
            strValueOf.getClass();
            o000oo01.f47160OooO0O0 = o0OoOo0.OooO0OO(strValueOf, 0.0d);
            String str2 = oooO0O0.f12763OooO0O0;
            Intrinsics.checkNotNullExpressionValue(str2, "getPriceCurrencyCode(...)");
            Intrinsics.checkNotNullParameter(str2, "<set-?>");
            o000oo01.f47161OooO0OO = str2;
            o000oo01.f47162OooO0Oo = null;
            o000oo01.f47163OooO0o0 = productDetails;
            this.f47165OooO0o0.add(o000oo01);
        }
        return Unit.INSTANCE;
    }
}
