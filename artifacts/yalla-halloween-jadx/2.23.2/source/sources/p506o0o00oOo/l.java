package p506o0o00oOo;

import android.content.Intent;
import android.view.View;
import com.code.android.util.o0000O;
import com.yalla.yalla.model.ProfileLimitModel;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import com.yalla.yalla.ui.activity.user.UserInfoEditBioActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p205o00o0o0o.o000O;
import p473o0OoooOo.o0OOOO0o;
import p562o0oOo000.o000000;
import p606o0oo0O0o.o0O0O0o0;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f50423OooO0oO;

    public l(UserInfoEditActivity userInfoEditActivity) {
        this.f50423OooO0oO = userInfoEditActivity;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        boolean z;
        Intrinsics.checkNotNullParameter(view, "view");
        UserInfoEditActivity context = this.f50423OooO0oO;
        context.OooOoo();
        ProfileLimitModel value = context.f26834Oooo00O.getValue();
        if (value == null) {
            String string = context.OooOoO().f45668OooOOO0.getText().toString();
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) UserInfoEditBioActivity.class);
            intent.putExtra("bio", string);
            context.startActivity(intent);
            return;
        }
        String strOooO00o = o0000O.OooO00o(context.getString(o000000.UserInfoEdit_ChangeLimit_HintContent_Sign), String.valueOf(value.getBlockReason()));
        if (value.getExpireTime() <= 0 || (System.currentTimeMillis() / ((long) 1000)) - value.getExpireTime() > 0) {
            z = false;
        } else {
            strOooO00o = o0000O.OooO00o(o0000O.OooO00o(context.getString(o000000.UserInfoEdit_ChangeLimit_HintContent_Sign_Time), String.valueOf(value.getBlockReason())), o0O0O0o0.OooO0Oo(value.getExpireTime(), System.currentTimeMillis()));
            z = true;
        }
        o000O o000o = new o000O(context);
        o000o.OooOo00(strOooO00o);
        if (z) {
            o000o.OooOOo0(true);
        } else {
            o000o.OooOo(true);
            String string2 = context.getString(o000000.Continue_);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            o000o.OooOOOo(string2);
            o000o.OooOo0(new a0(context));
        }
        o000o.OooOO0o();
    }
}
