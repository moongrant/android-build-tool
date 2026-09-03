package p496o0o00o;

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
import p157o00OoOO0.o0OO00O;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;
import p601o0oo0O0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00o00O extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f49151OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00o00O(UserInfoEditActivity userInfoEditActivity) {
        super(1);
        this.f49151OooO0Oo = userInfoEditActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        UserInfoEditActivity activity = this.f49151OooO0Oo;
        if (iIntValue == 0) {
            ProfileLimitModel value = activity.f27296OooOooo.getValue();
            boolean z = false;
            if (value != null) {
                String strOooO00o = o0000O.OooO00o(activity.getString(oO00OOo0.UserInfoEdit_ChangeLimit_HintContent_Header), String.valueOf(value.getBlockReason()));
                if (value.getExpireTime() > 0 && (System.currentTimeMillis() / ((long) 1000)) - value.getExpireTime() <= 0) {
                    strOooO00o = o0000O.OooO00o(o0000O.OooO00o(activity.getString(oO00OOo0.UserInfoEdit_ChangeLimit_HintContent_Header_Time), String.valueOf(value.getBlockReason())), o0000oo.OooO0Oo(value.getExpireTime(), System.currentTimeMillis()));
                    z = true;
                }
                o0OO00O o0oo00o2 = new o0OO00O(activity);
                o0oo00o2.OooOo00(strOooO00o);
                if (z) {
                    o0oo00o2.OooOOo0(true);
                } else {
                    o0oo00o2.OooOo(true);
                    String string = activity.getString(oO00OOo0.Continue_);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.Continue_)");
                    o0oo00o2.OooOOOo(string);
                    o0oo00o2.OooOo0(new oO00OOOo(activity));
                }
                o0oo00o2.OooOO0o();
            } else {
                activity.OooOoO().f58083OooO0oo.setEnabled(false);
                OooO00o.OooO0OO(activity, PermissionGroupReveal.f32883OooO0o, new oO00o0(activity), new oOo00ooO(activity));
            }
        } else if (iIntValue == 1) {
            o0OO000.OooO00o("105067");
            int i = UserDefaultHeadActivity.f27215OooOoO0;
            Intrinsics.checkNotNullParameter(activity, "activity");
            activity.startActivity(new Intent(activity, (Class<?>) UserDefaultHeadActivity.class));
        }
        return Unit.INSTANCE;
    }
}
