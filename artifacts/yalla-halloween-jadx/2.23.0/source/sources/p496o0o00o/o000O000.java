package p496o0o00o;

import com.yalla.yalla.ui.activity.user.BadgeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O000 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BadgeActivity f48986OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O000(BadgeActivity badgeActivity) {
        super(1);
        this.f48986OooO0Oo = badgeActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        int i = BadgeActivity.f27070OooOo;
        BadgeActivity badgeActivity = this.f48986OooO0Oo;
        badgeActivity.OooOoO0().f59205OooO0O0.f57521OooO0OO.OooO00o(str, badgeActivity);
        return Unit.INSTANCE;
    }
}
