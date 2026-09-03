package p496o0o00o;

import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.user.UserEditResult;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00o000 extends Lambda implements Function1<UserEditResult, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f49150OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00o000(UserInfoEditActivity userInfoEditActivity) {
        super(1);
        this.f49150OooO0Oo = userInfoEditActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(UserEditResult userEditResult) {
        if (userEditResult != null) {
            UserInfoEditActivity userInfoEditActivity = this.f49150OooO0Oo;
            if (userInfoEditActivity.f27290OooOoO != null) {
                o000000O o000000o2 = o000000O.f46674OooO00o;
                MutableLiveData mutableLiveDataOooOOoo = o000000O.OooOOoo();
                String str = userInfoEditActivity.f27290OooOoO;
                mutableLiveDataOooOOoo.postValue(str != null ? StringsKt.trim((CharSequence) str).toString() : null);
            }
            String str2 = userInfoEditActivity.f27292OooOoOO;
            if (str2 != null) {
                o000000O o000000o3 = o000000O.f46674OooO00o;
                o000000O.OooOOO().postValue(Integer.valueOf(str2));
            }
            if (userInfoEditActivity.f27294OooOoo0 != null) {
                o000000O o000000o4 = o000000O.f46674OooO00o;
                ((MutableLiveData) o000000O.f46699OooOoOO.getValue()).postValue(userInfoEditActivity.f27294OooOoo0);
            }
            LiveEventBus.get("UserInfoEditChange").post(Boolean.TRUE);
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.Userinfo_edit_success);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
            userInfoEditActivity.finish();
        }
        return Unit.INSTANCE;
    }
}
