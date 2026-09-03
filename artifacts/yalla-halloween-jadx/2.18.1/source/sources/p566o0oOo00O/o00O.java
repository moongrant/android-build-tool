package p566o0oOo00O;

import android.content.Context;
import android.os.Looper;
import com.app.base.model.CountryModel;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.user.UserCountrySelectActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p160o00OoOO0.o00OO0O0;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p498o0o00Oo0.OooOOO;
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ CountryModel f45234OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ boolean f45235OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ UserCountrySelectActivity f45236OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O(UserCountrySelectActivity userCountrySelectActivity, Context context, CountryModel countryModel, boolean z) {
        super(context);
        this.f45236OooO0OO = userCountrySelectActivity;
        this.f45234OooO00o = countryModel;
        this.f45235OooO0O0 = z;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(String str) {
        OooOOO.f41216OooO00o.OooO0Oo().setValue(Integer.valueOf(this.f45234OooO00o.getCid()));
        o00OO00O.f43313OooooOo.OooO00o().f43351Oooo0O0.setValue(Integer.valueOf(this.f45234OooO00o.getCid()));
        String strOooO0OO = o000O0O0.OooO0OO(R.string.Userinfo_edit_success);
        ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
            o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o0o0oooOooO0O0.run();
            } else {
                o00O000 o00o001 = o00O000.f34346OooO00o;
                o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
            }
        }
        if (this.f45236OooO0OO.f23425OooooO0 && !this.f45235OooO0O0) {
            LiveEventBus.get("USER_CHANGE_COUNTRY").post(this.f45234OooO00o);
        }
        this.f45236OooO0OO.finish();
    }
}
