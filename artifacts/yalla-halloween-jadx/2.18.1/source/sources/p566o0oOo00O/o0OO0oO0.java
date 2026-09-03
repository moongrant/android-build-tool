package p566o0oOo00O;

import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p310o0O0o0oo.o00O0O0O;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO0oO0 extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f45328Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0oO0(UserInfoEditActivity userInfoEditActivity) {
        super(0);
        this.f45328Oooo0o = userInfoEditActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        UserInfoEditActivity userInfoEditActivity = this.f45328Oooo0o;
        UserInfoEditActivity.OooO00o oooO00o = UserInfoEditActivity.f23493o0ooOOo;
        userInfoEditActivity.OooOooo().f50493OooO0O0.setFocusable(true);
        this.f45328Oooo0o.OooOooo().f50493OooO0O0.setFocusableInTouchMode(true);
        return Boolean.valueOf(this.f45328Oooo0o.OooOooo().f50493OooO0O0.postDelayed(new o00O0O0O(this.f45328Oooo0o, 1), 200L));
    }
}
