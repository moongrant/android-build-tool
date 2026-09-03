package p566o0oOo00O;

import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.common.db.table.PayOrder;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO00O extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f45388Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ PayOrder f45389Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO00O(PremiumActivity premiumActivity, PayOrder payOrder) {
        super(0);
        this.f45388Oooo0o = premiumActivity;
        this.f45389Oooo0oO = payOrder;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        PremiumActivity premiumActivity = this.f45388Oooo0o;
        Objects.requireNonNull(premiumActivity);
        Intrinsics.checkNotNull(premiumActivity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
        BaseActivityK.OooOoo0(premiumActivity, OooOOO.OooO0OO(R.string.Validating_your_purchase), 0L, 2, null);
        if (this.f45389Oooo0oO.getIsConsume()) {
            PremiumActivity.OooOoo(this.f45388Oooo0o, this.f45389Oooo0oO);
            return null;
        }
        PremiumActivity.Oooo000(this.f45388Oooo0o, this.f45389Oooo0oO);
        return null;
    }
}
