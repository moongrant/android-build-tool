package p496o0o00o;

import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OOO00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f49168OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OOO00(UserInfoEditActivity userInfoEditActivity) {
        super(0);
        this.f49168OooO0Oo = userInfoEditActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        UserInfoEditActivity userInfoEditActivity = this.f49168OooO0Oo;
        userInfoEditActivity.OooOoo();
        UserInfoEditActivity.OooOo(userInfoEditActivity);
        return Unit.INSTANCE;
    }
}
