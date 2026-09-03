package p506o0o00oOo;

import android.os.Looper;
import androidx.activity.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.user.UserEditResult;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoEditRemarkActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class r0 extends Lambda implements Function1<ApiResult<List<? extends UserEditResult>>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditRemarkActivity f50588OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(UserInfoEditRemarkActivity userInfoEditRemarkActivity) {
        super(1);
        this.f50588OooO0Oo = userInfoEditRemarkActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<List<? extends UserEditResult>> apiResult) {
        UserInfoEditRemarkActivity userInfoEditRemarkActivity = this.f50588OooO0Oo;
        userInfoEditRemarkActivity.OooOo0();
        if (apiResult.isSuccess()) {
            String strOooO0OO = o0000.OooO0OO(o000000.User_Edit_Remark_success);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
            Observable<Object> observable = LiveEventBus.get("Friend_Remark");
            UserInfoModel userInfoModel = userInfoEditRemarkActivity.f26860OooOo0;
            if (userInfoModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("userInfo");
                userInfoModel = null;
            }
            observable.post(Long.valueOf(userInfoModel.getUserId()));
            userInfoEditRemarkActivity.finish();
        }
        return Unit.INSTANCE;
    }
}
