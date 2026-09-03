package p496o0o00o;

import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p402o0Oo0OOO.o00O000o;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO00O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f49029OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO00O(PremiumActivity premiumActivity) {
        super(0);
        this.f49029OooO0Oo = premiumActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = PremiumActivity.f27140Oooo0oO;
        PremiumActivity premiumActivity = this.f49029OooO0Oo;
        premiumActivity.getClass();
        o00O000o.f44495OooO0o0.observe(premiumActivity, new PremiumActivity.Oooo0(new oo0O(premiumActivity)));
        return Unit.INSTANCE;
    }
}
