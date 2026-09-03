package p506o0o00oOo;

import android.os.Looper;
import androidx.activity.OooOo00;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.user.UserEditResult;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends Lambda implements Function1<UserEditResult, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f50396OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(UserInfoEditActivity userInfoEditActivity) {
        super(1);
        this.f50396OooO0Oo = userInfoEditActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(UserEditResult userEditResult) {
        if (userEditResult != null) {
            UserInfoEditActivity userInfoEditActivity = this.f50396OooO0Oo;
            if (userInfoEditActivity.f26825OooOoO != null) {
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                MutableLiveData mutableLiveDataOooOOoo = o0O00oO0.OooOOoo();
                String str = userInfoEditActivity.f26825OooOoO;
                mutableLiveDataOooOOoo.postValue(str != null ? StringsKt.trim((CharSequence) str).toString() : null);
            }
            String str2 = userInfoEditActivity.f26827OooOoOO;
            if (str2 != null) {
                o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                o0O00oO0.OooOOO().postValue(Integer.valueOf(str2));
            }
            if (userInfoEditActivity.f26829OooOoo0 != null) {
                o0O00oO0 o0o00oo3 = o0O00oO0.f47936OooO00o;
                ((MutableLiveData) o0O00oO0.f47961OooOoOO.getValue()).postValue(userInfoEditActivity.f26829OooOoo0);
            }
            LiveEventBus.get("UserInfoEditChange").post(Boolean.TRUE);
            String strOooO0OO = o0000.OooO0OO(o000000.Userinfo_edit_success);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
            userInfoEditActivity.finish();
        }
        return Unit.INSTANCE;
    }
}
