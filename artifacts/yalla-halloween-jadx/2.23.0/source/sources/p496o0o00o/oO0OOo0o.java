package p496o0o00o;

import android.content.Intent;
import android.view.View;
import com.code.android.util.o0000O;
import com.yalla.yalla.model.ProfileLimitModel;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import com.yalla.yalla.ui.activity.user.UserInfoEditBioActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p157o00OoOO0.o0OO00O;
import p466o0Oooo0o.oo00o;
import p584o0oOooO0.oO00OOo0;
import p601o0oo0O0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OOo0o extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f49169OooO0oO;

    public oO0OOo0o(UserInfoEditActivity userInfoEditActivity) {
        this.f49169OooO0oO = userInfoEditActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        boolean z;
        Intrinsics.checkNotNullParameter(view, "view");
        UserInfoEditActivity context = this.f49169OooO0oO;
        context.OooOoo();
        ProfileLimitModel value = context.f27299Oooo00O.getValue();
        if (value == null) {
            String string = context.OooOoO().f58088OooOOO0.getText().toString();
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) UserInfoEditBioActivity.class);
            intent.putExtra("bio", string);
            context.startActivity(intent);
            return;
        }
        String strOooO00o = o0000O.OooO00o(context.getString(oO00OOo0.UserInfoEdit_ChangeLimit_HintContent_Sign), String.valueOf(value.getBlockReason()));
        if (value.getExpireTime() <= 0 || (System.currentTimeMillis() / ((long) 1000)) - value.getExpireTime() > 0) {
            z = false;
        } else {
            strOooO00o = o0000O.OooO00o(o0000O.OooO00o(context.getString(oO00OOo0.UserInfoEdit_ChangeLimit_HintContent_Sign_Time), String.valueOf(value.getBlockReason())), o0000oo.OooO0Oo(value.getExpireTime(), System.currentTimeMillis()));
            z = true;
        }
        o0OO00O o0oo00o2 = new o0OO00O(context);
        o0oo00o2.OooOo00(strOooO00o);
        if (z) {
            o0oo00o2.OooOOo0(true);
        } else {
            o0oo00o2.OooOo(true);
            String string2 = context.getString(oO00OOo0.Continue_);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.Continue_)");
            o0oo00o2.OooOOOo(string2);
            o0oo00o2.OooOo0(new oO00Oo0(context));
        }
        o0oo00o2.OooOO0o();
    }
}
