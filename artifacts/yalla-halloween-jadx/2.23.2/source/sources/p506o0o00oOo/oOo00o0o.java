package p506o0o00oOo;

import com.code.android.util.o0000;
import com.yalla.yalla.data.db.table.PayOrder;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo00o0o extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f50566OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ PayOrder f50567OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo00o0o(PremiumActivity premiumActivity, PayOrder payOrder) {
        super(0);
        this.f50566OooO0Oo = premiumActivity;
        this.f50567OooO0o0 = payOrder;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        PremiumActivity premiumActivity = this.f50566OooO0Oo;
        premiumActivity.getClass();
        Intrinsics.checkNotNull(premiumActivity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
        BaseActivityK.OooOo0o(premiumActivity, o0000.OooO0OO(o000000.Validating_your_purchase), 0L, 2);
        PayOrder payOrder = this.f50567OooO0o0;
        if (payOrder.getIsConsume()) {
            PremiumActivity.OooOo(premiumActivity, payOrder);
            return null;
        }
        PremiumActivity.OooOoo0(premiumActivity, payOrder);
        return null;
    }
}
