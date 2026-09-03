package p566o0oOo00O;

import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p255o00ooO0o.oo0oOO0;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0O0Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oo0oOO0 f45303Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f45304Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0Oo(oo0oOO0 oo0ooo0, UserInfoActivity userInfoActivity) {
        super(0);
        this.f45303Oooo0o = oo0ooo0;
        this.f45304Oooo0oO = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O00000.OooO0OO("Me_profile_background_aristocracy");
        this.f45303Oooo0o.OooO0Oo();
        PremiumActivity.OooO00o oooO00o = PremiumActivity.f23360o0ooOOo;
        UserInfoActivity userInfoActivity = this.f45304Oooo0oO;
        Objects.requireNonNull(userInfoActivity);
        oooO00o.OooO00o(userInfoActivity, PremiumLevel.Premium4);
        return Unit.INSTANCE;
    }
}
