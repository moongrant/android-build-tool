package p491o0o00O0o;

import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.user.CountryItemList;
import com.yalla.yalla.ui.activity.account.PhoneCountryCodeSelectActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOO extends Lambda implements Function1<ApiResult<CountryItemList>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PhoneCountryCodeSelectActivity f49066OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOO(PhoneCountryCodeSelectActivity phoneCountryCodeSelectActivity) {
        super(1);
        this.f49066OooO0Oo = phoneCountryCodeSelectActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<CountryItemList> apiResult) {
        ApiResult<CountryItemList> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f49066OooO0Oo.OooOo0();
        return Unit.INSTANCE;
    }
}
