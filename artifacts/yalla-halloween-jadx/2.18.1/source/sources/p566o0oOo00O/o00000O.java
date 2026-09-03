package p566o0oOo00O;

import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.user.BadgeRankActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p255o00ooO0o.oo0oOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ BadgeRankActivity f45192Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O(BadgeRankActivity badgeRankActivity) {
        super(0);
        this.f45192Oooo0o = badgeRankActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        oo0oOO0 oo0ooo0 = new oo0oOO0(this.f45192Oooo0o);
        oo0ooo0.OooOoo(R.string.user_badge_dialog_rank_title);
        oo0ooo0.OooOo0(R.string.user_badge_dialog_rank_content);
        oo0ooo0.OooOOO0();
        return Unit.INSTANCE;
    }
}
