package p506o0o00oOo;

import android.content.Intent;
import com.code.android.util.o0000O;
import com.yalla.yalla.model.ProfileLimitModel;
import com.yalla.yalla.ui.activity.user.UserDefaultHeadActivity;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import com.yalla.yalla.util.permission.OooO00o;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p205o00o0o0o.o000O;
import p562o0oOo000.o000000;
import p606o0oo0O0o.o0O0O0o0;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f50406OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(UserInfoEditActivity userInfoEditActivity) {
        super(1);
        this.f50406OooO0Oo = userInfoEditActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        UserInfoEditActivity activity = this.f50406OooO0Oo;
        if (iIntValue == 0) {
            ProfileLimitModel value = activity.f26831OooOooo.getValue();
            boolean z = false;
            if (value != null) {
                String strOooO00o = o0000O.OooO00o(activity.getString(o000000.UserInfoEdit_ChangeLimit_HintContent_Header), String.valueOf(value.getBlockReason()));
                if (value.getExpireTime() > 0 && (System.currentTimeMillis() / ((long) 1000)) - value.getExpireTime() <= 0) {
                    strOooO00o = o0000O.OooO00o(o0000O.OooO00o(activity.getString(o000000.UserInfoEdit_ChangeLimit_HintContent_Header_Time), String.valueOf(value.getBlockReason())), o0O0O0o0.OooO0Oo(value.getExpireTime(), System.currentTimeMillis()));
                    z = true;
                }
                o000O o000o = new o000O(activity);
                o000o.OooOo00(strOooO00o);
                if (z) {
                    o000o.OooOOo0(true);
                } else {
                    o000o.OooOo(true);
                    String string = activity.getString(o000000.Continue_);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    o000o.OooOOOo(string);
                    o000o.OooOo0(new x(activity));
                }
                o000o.OooOO0o();
            } else {
                activity.OooOoO().f45663OooO0oo.setEnabled(false);
                OooO00o.OooO0OO(activity, PermissionGroupReveal.f32339OooO0o, new g0(activity), new i0(activity));
            }
        } else if (iIntValue == 1) {
            o0oo0000.OooO00o.OooO0O0("105067");
            int i = UserDefaultHeadActivity.f26750OooOoO0;
            Intrinsics.checkNotNullParameter(activity, "activity");
            activity.startActivity(new Intent(activity, (Class<?>) UserDefaultHeadActivity.class));
        }
        return Unit.INSTANCE;
    }
}
