package p506o0o00oOo;

import android.os.Looper;
import androidx.activity.OooOo00;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
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
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O00o0 extends Lambda implements Function1<UserEditResult, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CountryModel f50481OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f50482OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ UserCountrySelectActivity f50483OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O00o0(CountryModel countryModel, UserCountrySelectActivity userCountrySelectActivity, boolean z) {
        super(1);
        this.f50481OooO0Oo = countryModel;
        this.f50483OooO0o0 = userCountrySelectActivity;
        this.f50482OooO0o = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(UserEditResult userEditResult) {
        if (userEditResult != null) {
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            MutableLiveData mutableLiveDataOooO0OO = o0O00oO0.OooO0OO();
            CountryModel countryModel = this.f50481OooO0Oo;
            mutableLiveDataOooO0OO.setValue(Integer.valueOf(countryModel.getCid()));
            OooO0O0.f24533OoooOOO.OooO00o().f24562OooOoo.setValue(Integer.valueOf(countryModel.getCid()));
            String strOooO0OO = o0000.OooO0OO(o000000.Userinfo_edit_success);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
            UserCountrySelectActivity userCountrySelectActivity = this.f50483OooO0o0;
            if (userCountrySelectActivity.f26743OooOoO0 && !this.f50482OooO0o) {
                LiveEventBus.get("USER_CHANGE_COUNTRY").post(countryModel);
            }
            userCountrySelectActivity.finish();
        }
        return Unit.INSTANCE;
    }
}
