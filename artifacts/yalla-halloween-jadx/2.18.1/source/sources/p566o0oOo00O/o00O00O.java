package p566o0oOo00O;

import com.yalla.yalla.common.manager.data.SharedUrlManager;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p142o00OOooO.o00O0O;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O00O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f45252Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00O(PremiumActivity premiumActivity) {
        super(0);
        this.f45252Oooo0o = premiumActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PremiumActivity premiumActivity = this.f45252Oooo0o;
        PremiumActivity.OooO00o oooO00o = PremiumActivity.f23360o0ooOOo;
        Objects.requireNonNull(premiumActivity);
        SharedUrlManager.INSTANCE.getFeedBackUrl().observe(premiumActivity, new o00O0O(premiumActivity, 7));
        return Unit.INSTANCE;
    }
}
