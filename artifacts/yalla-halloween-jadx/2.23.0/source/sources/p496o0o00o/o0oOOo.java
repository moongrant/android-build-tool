package p496o0o00o;

import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.CountryModel;
import com.yalla.yalla.model.user.UserEditResult;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.ui.activity.user.UserCountrySelectActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOOo extends Lambda implements Function1<UserEditResult, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CountryModel f49119OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f49120OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ UserCountrySelectActivity f49121OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOOo(CountryModel countryModel, UserCountrySelectActivity userCountrySelectActivity, boolean z) {
        super(1);
        this.f49119OooO0Oo = countryModel;
        this.f49121OooO0o0 = userCountrySelectActivity;
        this.f49120OooO0o = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(UserEditResult userEditResult) {
        if (userEditResult != null) {
            o000000O o000000o2 = o000000O.f46674OooO00o;
            MutableLiveData mutableLiveDataOooO0OO = o000000O.OooO0OO();
            CountryModel countryModel = this.f49119OooO0Oo;
            mutableLiveDataOooO0OO.setValue(Integer.valueOf(countryModel.getCid()));
            OooO0O0.f24995OoooOOO.OooO00o().f25024OooOoo.setValue(Integer.valueOf(countryModel.getCid()));
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.Userinfo_edit_success);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
            UserCountrySelectActivity userCountrySelectActivity = this.f49121OooO0o0;
            if (userCountrySelectActivity.f27208OooOoO0 && !this.f49120OooO0o) {
                LiveEventBus.get("USER_CHANGE_COUNTRY").post(countryModel);
            }
            userCountrySelectActivity.finish();
        }
        return Unit.INSTANCE;
    }
}
