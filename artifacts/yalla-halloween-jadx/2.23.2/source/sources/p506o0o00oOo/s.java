package p506o0o00oOo;

import android.view.View;
import androidx.fragment.app.o000oOoO;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.yalla.yalla.model.ProfileLimitModel;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p205o00o0o0o.o000O;
import p473o0OoooOo.o0OOOO0o;
import p562o0oOo000.o000000;
import p606o0oo0O0o.o0O0O0o0;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f50589OooO0oO;

    public s(UserInfoEditActivity userInfoEditActivity) {
        this.f50589OooO0oO = userInfoEditActivity;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        boolean z;
        Intrinsics.checkNotNullParameter(view, "view");
        UserInfoEditActivity userInfoEditActivity = this.f50589OooO0oO;
        ProfileLimitModel value = userInfoEditActivity.f26833Oooo000.getValue();
        if (value == null) {
            userInfoEditActivity.OooOoO().f45657OooO0O0.setFocusable(true);
            userInfoEditActivity.OooOoO().f45657OooO0O0.setFocusableInTouchMode(true);
            userInfoEditActivity.OooOoO().f45657OooO0O0.setSelection(userInfoEditActivity.OooOoO().f45657OooO0O0.length());
            userInfoEditActivity.OooOoO().f45657OooO0O0.postDelayed(new o000oOoO(userInfoEditActivity, 2), 200L);
            return;
        }
        String strOooO00o = o0000O.OooO00o(o0000.OooO0OO(o000000.UserInfoEdit_ChangeLimit_HintContent_Name), String.valueOf(value.getBlockReason()));
        if (value.getExpireTime() <= 0 || (System.currentTimeMillis() / ((long) 1000)) - value.getExpireTime() > 0) {
            z = false;
        } else {
            strOooO00o = o0000O.OooO00o(o0000O.OooO00o(userInfoEditActivity.getString(o000000.UserInfoEdit_ChangeLimit_HintContent_Name_Time), String.valueOf(value.getBlockReason())), o0O0O0o0.OooO0Oo(value.getExpireTime(), System.currentTimeMillis()));
            z = true;
        }
        o000O o000o = new o000O(userInfoEditActivity);
        o000o.OooOo00(strOooO00o);
        if (z) {
            o000o.OooOOo0(true);
        } else {
            o000o.OooOo(true);
            String string = userInfoEditActivity.getString(o000000.Continue_);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            o000o.OooOOOo(string);
            o000o.OooOo0(new y(userInfoEditActivity));
        }
        o000o.OooOO0o();
    }
}
