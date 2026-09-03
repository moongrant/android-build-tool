package p496o0o00o;

import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.model.user.UserEditResult;
import com.yalla.yalla.ui.activity.user.UserInfoEditBioActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo000o0 extends Lambda implements Function1<UserEditResult, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditBioActivity f49184OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo000o0(UserInfoEditBioActivity userInfoEditBioActivity) {
        super(1);
        this.f49184OooO0Oo = userInfoEditBioActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(UserEditResult userEditResult) {
        if (userEditResult != null) {
            o000000O o000000o2 = o000000O.f46674OooO00o;
            MutableLiveData mutableLiveData = (MutableLiveData) o000000O.f46697OooOoO.getValue();
            UserInfoEditBioActivity userInfoEditBioActivity = this.f49184OooO0Oo;
            String str = userInfoEditBioActivity.f27315OooOo0O;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("stringSign");
                str = null;
            }
            mutableLiveData.postValue(str);
            Observable<Object> observable = LiveEventBus.get("UserSign");
            String str3 = userInfoEditBioActivity.f27315OooOo0O;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("stringSign");
            } else {
                str2 = str3;
            }
            observable.post(str2);
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.Userinfo_edit_success);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
            userInfoEditBioActivity.finish();
        }
        return Unit.INSTANCE;
    }
}
