package p506o0o00oOo;

import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p316o0O0oOo0.o0ooOOo;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f50601OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(UserInfoEditActivity userInfoEditActivity) {
        super(0);
        this.f50601OooO0Oo = userInfoEditActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        int i = UserInfoEditActivity.f26818Oooo0oO;
        UserInfoEditActivity userInfoEditActivity = this.f50601OooO0Oo;
        userInfoEditActivity.OooOoO().f45657OooO0O0.setFocusable(true);
        userInfoEditActivity.OooOoO().f45657OooO0O0.setFocusableInTouchMode(true);
        return Boolean.valueOf(userInfoEditActivity.OooOoO().f45657OooO0O0.postDelayed(new o0ooOOo(userInfoEditActivity, 2), 200L));
    }
}
