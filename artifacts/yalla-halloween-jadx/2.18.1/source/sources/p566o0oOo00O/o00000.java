package p566o0oOo00O;

import android.content.Intent;
import com.yalla.yalla.ui.activity.user.BadgeActivity;
import com.yalla.yalla.ui.activity.user.BadgeRuleActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ BadgeActivity f45188Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000(BadgeActivity badgeActivity) {
        super(0);
        this.f45188Oooo0o = badgeActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        BadgeRuleActivity.OooO00o oooO00o = BadgeRuleActivity.f23309Ooooo00;
        BadgeActivity context = this.f45188Oooo0o;
        Intrinsics.checkNotNullParameter(context, "context");
        context.startActivity(new Intent(context, (Class<?>) BadgeRuleActivity.class));
        return Unit.INSTANCE;
    }
}
