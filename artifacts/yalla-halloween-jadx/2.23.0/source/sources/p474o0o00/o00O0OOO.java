package p474o0o00;

import com.yalla.yalla.model.user.CountryItemList;
import com.yalla.yalla.ui.activity.account.PhoneCountryCodeSelectActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OOO extends Lambda implements Function1<CountryItemList, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PhoneCountryCodeSelectActivity f47272OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OOO(PhoneCountryCodeSelectActivity phoneCountryCodeSelectActivity) {
        super(1);
        this.f47272OooO0Oo = phoneCountryCodeSelectActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(CountryItemList countryItemList) {
        CountryItemList countryItemList2 = countryItemList;
        if (countryItemList2 != null) {
            boolean z = !countryItemList2.getHot().isEmpty();
            PhoneCountryCodeSelectActivity phoneCountryCodeSelectActivity = this.f47272OooO0Oo;
            if (z) {
                phoneCountryCodeSelectActivity.f25257OooOo0o = countryItemList2.getHot().size();
                phoneCountryCodeSelectActivity.f25256OooOo0O.addAll(countryItemList2.getHot());
            }
            if (!countryItemList2.getAll().isEmpty()) {
                phoneCountryCodeSelectActivity.f25256OooOo0O.addAll(countryItemList2.getAll());
            }
            o00OO000 o00oo001 = phoneCountryCodeSelectActivity.f25253OooOo;
            if (o00oo001 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                o00oo001 = null;
            }
            o00oo001.notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }
}
