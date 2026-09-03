package p496o0o00o;

import android.view.View;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.common.support.imagepicker.preview.component.video.widget.OooO00o;
import com.yalla.yalla.model.ProfileLimitModel;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p157o00OoOO0.o0OO00O;
import p466o0Oooo0o.oo00o;
import p584o0oOooO0.oO00OOo0;
import p601o0oo0O0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00O0o extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f49138OooO0oO;

    public oO00O0o(UserInfoEditActivity userInfoEditActivity) {
        this.f49138OooO0oO = userInfoEditActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        boolean z;
        Intrinsics.checkNotNullParameter(view, "view");
        UserInfoEditActivity userInfoEditActivity = this.f49138OooO0oO;
        ProfileLimitModel value = userInfoEditActivity.f27298Oooo000.getValue();
        int i = 1;
        if (value == null) {
            userInfoEditActivity.OooOoO().f58077OooO0O0.setFocusable(true);
            userInfoEditActivity.OooOoO().f58077OooO0O0.setFocusableInTouchMode(true);
            userInfoEditActivity.OooOoO().f58077OooO0O0.setSelection(userInfoEditActivity.OooOoO().f58077OooO0O0.length());
            userInfoEditActivity.OooOoO().f58077OooO0O0.postDelayed(new OooO00o(userInfoEditActivity, i), 200L);
            return;
        }
        String strOooO00o = o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.UserInfoEdit_ChangeLimit_HintContent_Name), String.valueOf(value.getBlockReason()));
        if (value.getExpireTime() <= 0 || (System.currentTimeMillis() / ((long) 1000)) - value.getExpireTime() > 0) {
            z = false;
        } else {
            strOooO00o = o0000O.OooO00o(o0000O.OooO00o(userInfoEditActivity.getString(oO00OOo0.UserInfoEdit_ChangeLimit_HintContent_Name_Time), String.valueOf(value.getBlockReason())), o0000oo.OooO0Oo(value.getExpireTime(), System.currentTimeMillis()));
            z = true;
        }
        o0OO00O o0oo00o2 = new o0OO00O(userInfoEditActivity);
        o0oo00o2.OooOo00(strOooO00o);
        if (z) {
            o0oo00o2.OooOOo0(true);
        } else {
            o0oo00o2.OooOo(true);
            String string = userInfoEditActivity.getString(oO00OOo0.Continue_);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.Continue_)");
            o0oo00o2.OooOOOo(string);
            o0oo00o2.OooOo0(new oO00OOo0(userInfoEditActivity));
        }
        o0oo00o2.OooOO0o();
    }
}
