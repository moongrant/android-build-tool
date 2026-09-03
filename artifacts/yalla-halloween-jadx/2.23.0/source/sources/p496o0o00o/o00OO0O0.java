package p496o0o00o;

import com.code.android.util.o0000;
import com.yalla.yalla.data.db.table.PayOrder;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO0O0 extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f49030OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ PayOrder f49031OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO0O0(PremiumActivity premiumActivity, PayOrder payOrder) {
        super(0);
        this.f49030OooO0Oo = premiumActivity;
        this.f49031OooO0o0 = payOrder;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        PremiumActivity premiumActivity = this.f49030OooO0Oo;
        premiumActivity.getClass();
        Intrinsics.checkNotNull(premiumActivity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
        BaseActivityK.OooOo0o(premiumActivity, o0000.OooO0OO(oO00OOo0.Validating_your_purchase), 0L, 2);
        PayOrder payOrder = this.f49031OooO0o0;
        if (payOrder.getIsConsume()) {
            PremiumActivity.OooOo(premiumActivity, payOrder);
            return null;
        }
        PremiumActivity.OooOoo0(premiumActivity, payOrder);
        return null;
    }
}
