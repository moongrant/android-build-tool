package p506o0o00oOo;

import com.yalla.yalla.ui.activity.user.BadgeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0000o0 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BadgeActivity f50437OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0000o0(BadgeActivity badgeActivity) {
        super(1);
        this.f50437OooO0Oo = badgeActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        int i = BadgeActivity.f26604OooOo;
        BadgeActivity badgeActivity = this.f50437OooO0Oo;
        badgeActivity.OooOoO0().f44113OooO0O0.f45386OooO0OO.OooO00o(str, badgeActivity);
        return Unit.INSTANCE;
    }
}
