package p506o0o00oOo;

import android.view.View;
import com.code.android.util.o0000;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.user.UserInfoEditRemarkActivity;
import com.yalla.yalla.ui.vm.user.UserInfoEditVM;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o0oo0000.OooO00o;
import org.jetbrains.annotations.NotNull;
import p473o0OoooOo.o0OOOO0o;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class q0 extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditRemarkActivity f50586OooO0oO;

    public q0(UserInfoEditRemarkActivity userInfoEditRemarkActivity) {
        this.f50586OooO0oO = userInfoEditRemarkActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        OooO00o.OooO0O0("104034");
        int i = UserInfoEditRemarkActivity.f26858OooOo0o;
        UserInfoEditRemarkActivity userInfoEditRemarkActivity = this.f50586OooO0oO;
        String string = StringsKt.trim((CharSequence) userInfoEditRemarkActivity.OooOo().f45493OooO0O0.getText().toString()).toString();
        BaseActivityK.OooOo0o(userInfoEditRemarkActivity, o0000.OooO0OO(o000000.setting), 0L, 2);
        UserInfoEditVM userInfoEditVM = (UserInfoEditVM) userInfoEditRemarkActivity.f26861OooOo00.getValue();
        UserInfoModel userInfoModel = userInfoEditRemarkActivity.f26860OooOo0;
        if (userInfoModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userInfo");
            userInfoModel = null;
        }
        userInfoEditVM.setFriendMemoName(string, userInfoModel.getUserId()).observe(userInfoEditRemarkActivity, new UserInfoEditRemarkActivity.OooO00o(new r0(userInfoEditRemarkActivity)));
    }
}
