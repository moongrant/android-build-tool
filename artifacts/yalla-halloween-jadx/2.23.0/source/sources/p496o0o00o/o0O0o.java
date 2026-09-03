package p496o0o00o;

import com.yalla.yalla.model.CountryModel;
import com.yalla.yalla.ui.activity.user.UserCountrySelectActivity;
import com.yalla.yalla.ui.vm.user.UserInfoEditVM;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p377o0OOoOo.o000O000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserCountrySelectActivity f49077OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f49078OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ CountryModel f49079OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o(CountryModel countryModel, UserCountrySelectActivity userCountrySelectActivity, boolean z) {
        super(0);
        this.f49077OooO0Oo = userCountrySelectActivity;
        this.f49079OooO0o0 = countryModel;
        this.f49078OooO0o = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        UserCountrySelectActivity userCountrySelectActivity = this.f49077OooO0Oo;
        CountryModel countryModel = this.f49079OooO0o0;
        if (countryModel != null) {
            o000O000.OooO0Oo(UserInfoEditVM.userEdit$default((UserInfoEditVM) userCountrySelectActivity.f27204OooOo00.getValue(), null, null, null, null, null, null, null, countryModel.getCid(), 127, null), userCountrySelectActivity, false, null, null, new o0oOOo(countryModel, userCountrySelectActivity, this.f49078OooO0o), 14);
            return null;
        }
        int i = UserCountrySelectActivity.f27200OooOoOO;
        userCountrySelectActivity.getClass();
        return null;
    }
}
