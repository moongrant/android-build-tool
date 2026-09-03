package p496o0o00o;

import android.view.View;
import com.code.android.util.o0000;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.user.UserInfoEditRemarkActivity;
import com.yalla.yalla.ui.vm.user.UserInfoEditVM;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p466o0Oooo0o.oo00o;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O000 extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditRemarkActivity f49154OooO0oO;

    public oO0O000(UserInfoEditRemarkActivity userInfoEditRemarkActivity) {
        this.f49154OooO0oO = userInfoEditRemarkActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        o0OO000.OooO00o("104034");
        int i = UserInfoEditRemarkActivity.f27323OooOo0o;
        UserInfoEditRemarkActivity userInfoEditRemarkActivity = this.f49154OooO0oO;
        String string = StringsKt.trim((CharSequence) userInfoEditRemarkActivity.OooOo().f57751OooO0O0.getText().toString()).toString();
        BaseActivityK.OooOo0o(userInfoEditRemarkActivity, o0000.OooO0OO(oO00OOo0.setting), 0L, 2);
        UserInfoEditVM userInfoEditVM = (UserInfoEditVM) userInfoEditRemarkActivity.f27326OooOo00.getValue();
        UserInfoModel userInfoModel = userInfoEditRemarkActivity.f27325OooOo0;
        if (userInfoModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userInfo");
            userInfoModel = null;
        }
        userInfoEditVM.setFriendMemoName(string, userInfoModel.getUserId()).observe(userInfoEditRemarkActivity, new UserInfoEditRemarkActivity.OooO00o(new oO0O000o(userInfoEditRemarkActivity)));
    }
}
