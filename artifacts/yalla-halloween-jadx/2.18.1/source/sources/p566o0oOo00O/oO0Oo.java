package p566o0oOo00O;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.user.UserInfoEditBioActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p160o00OoOO0.o00OO0O0;
import p254o00ooO0O.o000O0O0;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0Oo extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditBioActivity f45377OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Oo(UserInfoEditBioActivity userInfoEditBioActivity, FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.f45377OooO00o = userInfoEditBioActivity;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(@NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        MutableLiveData<String> mutableLiveDataOooOOo = OooOOO.f41216OooO00o.OooOOo();
        String str = this.f45377OooO00o.f23525Ooooo0o;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stringSign");
            str = null;
        }
        mutableLiveDataOooOOo.postValue(str);
        Observable<Object> observable = LiveEventBus.get("UserSign");
        String str3 = this.f45377OooO00o.f23525Ooooo0o;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stringSign");
        } else {
            str2 = str3;
        }
        observable.post(str2);
        ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.Userinfo_edit_success));
        this.f45377OooO00o.finish();
    }
}
