package p496o0o00o;

import com.google.android.material.search.Oooo0;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00OOo0 extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f49144OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00OOo0(UserInfoEditActivity userInfoEditActivity) {
        super(0);
        this.f49144OooO0Oo = userInfoEditActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        int i = UserInfoEditActivity.f27283Oooo0oO;
        UserInfoEditActivity userInfoEditActivity = this.f49144OooO0Oo;
        userInfoEditActivity.OooOoO().f58077OooO0O0.setFocusable(true);
        userInfoEditActivity.OooOoO().f58077OooO0O0.setFocusableInTouchMode(true);
        return Boolean.valueOf(userInfoEditActivity.OooOoO().f58077OooO0O0.postDelayed(new Oooo0(userInfoEditActivity, 1), 200L));
    }
}
