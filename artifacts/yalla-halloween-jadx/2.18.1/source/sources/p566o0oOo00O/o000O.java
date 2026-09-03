package p566o0oOo00O;

import com.yalla.yalla.common.db.table.PayOrder;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O extends Lambda implements Function1<ApiError, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f45206Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ PayOrder f45207Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f45208Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O(PremiumActivity premiumActivity, PayOrder payOrder, Ref.BooleanRef booleanRef) {
        super(1);
        this.f45206Oooo0o = premiumActivity;
        this.f45207Oooo0oO = payOrder;
        this.f45208Oooo0oo = booleanRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiError apiError) {
        ApiError it = apiError;
        Intrinsics.checkNotNullParameter(it, "it");
        int code2 = it.getCode();
        if (code2 == 2000) {
            PremiumActivity premiumActivity = this.f45206Oooo0o;
            PremiumActivity.OooO00o oooO00o = PremiumActivity.f23360o0ooOOo;
            premiumActivity.Oooo0oO().deleteOrderToDB(this.f45207Oooo0oO.getOrderId());
            this.f45208Oooo0oo.element = true;
        } else if (code2 != 2005) {
            this.f45207Oooo0oO.setErrorCode(it.getCode());
            PremiumActivity premiumActivity2 = this.f45206Oooo0o;
            PremiumActivity.OooO00o oooO00o2 = PremiumActivity.f23360o0ooOOo;
            premiumActivity2.Oooo0oO().onConfirmOrderErrorUploadLog(this.f45207Oooo0oO);
            PremiumActivity premiumActivity3 = this.f45206Oooo0o;
            premiumActivity3.f23371o00O0O++;
            PremiumActivity.OooOooo(premiumActivity3, this.f45207Oooo0oO);
        } else {
            this.f45207Oooo0oO.setErrorCode(it.getCode());
            PremiumActivity premiumActivity4 = this.f45206Oooo0o;
            PremiumActivity.OooO00o oooO00o3 = PremiumActivity.f23360o0ooOOo;
            premiumActivity4.Oooo0oO().onConfirmOrderErrorUploadLog(this.f45207Oooo0oO);
            PremiumActivity premiumActivity5 = this.f45206Oooo0o;
            premiumActivity5.f23371o00O0O++;
            PremiumActivity.OooOooo(premiumActivity5, this.f45207Oooo0oO);
            this.f45206Oooo0o.Oooo0oO().deleteOrderToDB(this.f45207Oooo0oO.getOrderId());
        }
        return Unit.INSTANCE;
    }
}
