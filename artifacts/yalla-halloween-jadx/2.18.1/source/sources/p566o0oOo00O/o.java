package p566o0oOo00O;

import android.view.View;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.user.UserInfoEditRemarkActivity;
import com.yalla.yalla.ui.vm.user.UserInfoEditVM;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p254o00ooO0O.o000O0O0;
import p501o0o00o.o0000O;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditRemarkActivity f45180Oooo;

    public o(UserInfoEditRemarkActivity userInfoEditRemarkActivity) {
        this.f45180Oooo = userInfoEditRemarkActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        UserInfoEditRemarkActivity userInfoEditRemarkActivity = this.f45180Oooo;
        UserInfoEditRemarkActivity.OooO00o oooO00o = UserInfoEditRemarkActivity.f23529OooooOO;
        String string = StringsKt.trim((CharSequence) userInfoEditRemarkActivity.OooOoo().f50124OooO0O0.getText().toString()).toString();
        BaseActivityK.OooOoo0(userInfoEditRemarkActivity, o000O0O0.OooO0OO(R.string.setting), 0L, 2, null);
        UserInfoEditVM userInfoEditVM = (UserInfoEditVM) userInfoEditRemarkActivity.f23531Ooooo00.getValue();
        UserInfoModel userInfoModel = userInfoEditRemarkActivity.f23532Ooooo0o;
        if (userInfoModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userInfo");
            userInfoModel = null;
        }
        userInfoEditVM.editFriendRemark(string, userInfoModel.getUserId()).observe(userInfoEditRemarkActivity, new o0000O(userInfoEditRemarkActivity, 6));
    }
}
