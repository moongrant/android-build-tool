package p496o0o00o;

import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00OOO extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f49067OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00OOO(UserInfoActivity userInfoActivity) {
        super(1);
        this.f49067OooO0Oo = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean it = bool;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.booleanValue()) {
            UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f27240Oooo0o;
            this.f49067OooO0Oo.Oooo00O();
        }
        return Unit.INSTANCE;
    }
}
