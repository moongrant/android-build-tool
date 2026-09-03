package p566o0oOo00O;

import android.view.View;
import com.app.base.model.ProfileLimitModel;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p255o00ooO0o.oo0oOO0;
import p538o0o0Oo0.o00OO0OO;
import p621o0oo0o0o.o00O0;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO00o0 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f45324Oooo;

    public o0OO00o0(UserInfoEditActivity userInfoEditActivity) {
        this.f45324Oooo = userInfoEditActivity;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        UserInfoEditActivity userInfoEditActivity = this.f45324Oooo;
        ProfileLimitModel value = userInfoEditActivity.f23505o00Oo0.getValue();
        int i = 1;
        if (value == null) {
            userInfoEditActivity.OooOooo().f50493OooO0O0.setFocusable(true);
            userInfoEditActivity.OooOooo().f50493OooO0O0.setFocusableInTouchMode(true);
            userInfoEditActivity.OooOooo().f50493OooO0O0.setSelection(userInfoEditActivity.OooOooo().f50493OooO0O0.length());
            userInfoEditActivity.OooOooo().f50493OooO0O0.postDelayed(new o00OO0OO(userInfoEditActivity, i), 200L);
            return;
        }
        boolean z = false;
        String strOooO00o = OooOo.OooO00o(OooOOO.OooO0OO(R.string.UserInfoEdit_ChangeLimit_HintContent_Name), String.valueOf(value.getBlockReason()));
        if (value.getExpireTime() > 0 && (System.currentTimeMillis() / ((long) 1000)) - value.getExpireTime() <= 0) {
            strOooO00o = OooOo.OooO00o(OooOo.OooO00o(userInfoEditActivity.getString(R.string.UserInfoEdit_ChangeLimit_HintContent_Name_Time), String.valueOf(value.getBlockReason())), o00O0.f48624OooO00o.OooO0Oo(value.getExpireTime(), System.currentTimeMillis()));
            z = true;
        }
        oo0oOO0 oo0ooo0 = new oo0oOO0(userInfoEditActivity);
        oo0ooo0.OooOo0O(strOooO00o);
        if (z) {
            oo0ooo0.OooOOo(true);
        } else {
            oo0ooo0.OooOoOO(true);
            String string = userInfoEditActivity.getString(R.string.Continue_);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.Continue_)");
            oo0ooo0.OooOOo0(string);
            oo0ooo0.OooOo0o(new o0OO0oO0(userInfoEditActivity));
        }
        oo0ooo0.OooOOO0();
    }
}
