package p506o0o00oOo;

import com.yalla.yalla.model.CountryModel;
import com.yalla.yalla.ui.activity.user.UserCountrySelectActivity;
import com.yalla.yalla.ui.vm.user.UserInfoEditVM;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p384o0OOoo0O.o00O0O;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O00oO extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserCountrySelectActivity f50484OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f50485OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ CountryModel f50486OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O00oO(CountryModel countryModel, UserCountrySelectActivity userCountrySelectActivity, boolean z) {
        super(0);
        this.f50484OooO0Oo = userCountrySelectActivity;
        this.f50486OooO0o0 = countryModel;
        this.f50485OooO0o = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        UserCountrySelectActivity userCountrySelectActivity = this.f50484OooO0Oo;
        CountryModel countryModel = this.f50486OooO0o0;
        if (countryModel != null) {
            o00O0O.OooO0Oo(UserInfoEditVM.userEdit$default((UserInfoEditVM) userCountrySelectActivity.f26739OooOo00.getValue(), null, null, null, null, null, null, null, countryModel.getCid(), 127, null), userCountrySelectActivity, false, null, null, new oO0O00o0(countryModel, userCountrySelectActivity, this.f50485OooO0o), 14);
            return null;
        }
        int i = UserCountrySelectActivity.f26735OooOoOO;
        userCountrySelectActivity.getClass();
        return null;
    }
}
