package p431o0OoOOOO;

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
public final class o00OO0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ProductDetails f45907OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ List<o00OO> f45908OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO0O0(ProductDetails productDetails, List<o00OO> list) {
        super(0);
        this.f45907OooO0Oo = productDetails;
        this.f45908OooO0o0 = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ProductDetails.OooO0o oooO0o;
        ProductDetails.OooO0OO oooO0OO;
        ArrayList arrayList;
        ProductDetails.OooO0O0 oooO0O0;
        ProductDetails productDetails = this.f45907OooO0Oo;
        ArrayList arrayList2 = productDetails.f9667OooO0oO;
        if (arrayList2 != null && (oooO0o = (ProductDetails.OooO0o) arrayList2.get(0)) != null && (oooO0OO = oooO0o.f9675OooO0O0) != null && (arrayList = oooO0OO.f9673OooO00o) != null && (oooO0O0 = (ProductDetails.OooO0O0) arrayList.get(0)) != null) {
            String str = productDetails.f9663OooO0OO;
            Intrinsics.checkNotNullExpressionValue(str, "productDetails.productId");
            o00OO o00oo2 = new o00OO(str);
            String strValueOf = String.valueOf((oooO0O0.f9671OooO00o / ((long) ResponseInfo.UnknownError)) / 100.0d);
            StringsKt__StringsKt.indexOf$default((CharSequence) strValueOf, ".", 0, false, 6, (Object) null);
            strValueOf.getClass();
            o00oo2.f45871OooO0O0 = o0OoOo0.OooO0OO(strValueOf, 0.0d);
            String str2 = oooO0O0.f9672OooO0O0;
            Intrinsics.checkNotNullExpressionValue(str2, "pricingPhase.priceCurrencyCode");
            Intrinsics.checkNotNullParameter(str2, "<set-?>");
            o00oo2.f45872OooO0OO = str2;
            o00oo2.f45873OooO0Oo = null;
            o00oo2.f45874OooO0o0 = productDetails;
            this.f45908OooO0o0.add(o00oo2);
        }
        return Unit.INSTANCE;
    }
}
