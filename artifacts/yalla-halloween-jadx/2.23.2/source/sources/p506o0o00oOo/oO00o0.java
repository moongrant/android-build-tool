package p506o0o00oOo;

import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p583o0oOoo00.o00000OO;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f50464OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00o0(PremiumActivity premiumActivity) {
        super(0);
        this.f50464OooO0Oo = premiumActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = PremiumActivity.f26673Oooo0oO;
        PremiumActivity premiumActivity = this.f50464OooO0Oo;
        premiumActivity.getClass();
        o00000OO.f56664OooO0o0.observe(premiumActivity, new PremiumActivity.Oooo0(new oO0OO00o(premiumActivity)));
        return Unit.INSTANCE;
    }
}
