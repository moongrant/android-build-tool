package p566o0oOo00O;

import android.content.Intent;
import android.view.View;
import com.app.base.model.ProfileLimitModel;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import com.yalla.yalla.ui.activity.user.UserInfoEditBioActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p255o00ooO0o.oo0oOO0;
import p621o0oo0o0o.o00O0;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f45286Oooo;

    public o0O(UserInfoEditActivity userInfoEditActivity) {
        this.f45286Oooo = userInfoEditActivity;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f45286Oooo.Oooo00o();
        UserInfoEditActivity context = this.f45286Oooo;
        ProfileLimitModel value = context.f23506o00Ooo.getValue();
        if (value == null) {
            String string = context.OooOooo().f50504OooOOO0.getText().toString();
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) UserInfoEditBioActivity.class);
            intent.putExtra("bio", string);
            context.startActivity(intent);
            return;
        }
        boolean z = false;
        String strOooO00o = OooOo.OooO00o(context.getString(R.string.UserInfoEdit_ChangeLimit_HintContent_Sign), String.valueOf(value.getBlockReason()));
        if (value.getExpireTime() > 0 && (System.currentTimeMillis() / ((long) 1000)) - value.getExpireTime() <= 0) {
            strOooO00o = OooOo.OooO00o(OooOo.OooO00o(context.getString(R.string.UserInfoEdit_ChangeLimit_HintContent_Sign_Time), String.valueOf(value.getBlockReason())), o00O0.f48624OooO00o.OooO0Oo(value.getExpireTime(), System.currentTimeMillis()));
            z = true;
        }
        oo0oOO0 oo0ooo0 = new oo0oOO0(context);
        oo0ooo0.OooOo0O(strOooO00o);
        if (z) {
            oo0ooo0.OooOOo(true);
        } else {
            oo0ooo0.OooOoOO(true);
            String string2 = context.getString(R.string.Continue_);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.Continue_)");
            oo0ooo0.OooOOo0(string2);
            oo0ooo0.OooOo0o(new o0OOO00(context));
        }
        oo0ooo0.OooOOO0();
    }
}
