package p536o0o0OOoo;

import com.yalla.yalla.common.manager.error.CommonError;
import com.yalla.yalla.common.manager.error.CommonErrorHandler;
import com.yalla.yalla.model.GiftPropModel;
import com.yalla.yalla.model.GiftPropTypePay;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p189o00o00oO.oo0o0Oo;
import p498o0o00Oo0.OooOOO;
import p501o0o00o.o000;
import p522o0o0O0o.oOO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f43817Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o000 f43818Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(PrivateChatActivity privateChatActivity, o000 o000Var) {
        super(0);
        this.f43817Oooo0o = privateChatActivity;
        this.f43818Oooo0oO = o000Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.f43817Oooo0o.Oooo0o()) {
            o000 o000Var = this.f43818Oooo0oO;
            GiftPropModel giftPropModel = o000Var.f41410OooOo0O;
            if (giftPropModel != null) {
                PrivateChatActivity privateChatActivity = this.f43817Oooo0o;
                long price = ((long) o000Var.f41409OooOo00) * ((long) giftPropModel.getPrice());
                boolean z = giftPropModel.getTypePay() == GiftPropTypePay.Coin.getValue() && price > oOO00O.OooO0o(OooOOO.f41216OooO00o.OooO0OO().getValue());
                boolean z2 = giftPropModel.getTypePay() == GiftPropTypePay.Crystal.getValue() && price > oOO00O.OooO0o(OooOOO.f41216OooO00o.OooO0o().getValue());
                if (z) {
                    oo0o0Oo.OooO0O0(CommonError.Coin_NotEnough, null, 2, null, CommonErrorHandler.INSTANCE);
                } else if (z2) {
                    oo0o0Oo.OooO0O0(CommonError.Crystal_NotEnough, null, 2, null, CommonErrorHandler.INSTANCE);
                } else {
                    privateChatActivity.Oooo0O0().sendGiftMessage(giftPropModel.getGiftId(), giftPropModel.getImageUrl(), giftPropModel.isBlind(), giftPropModel.isCustomMade(), o000Var.f41409OooOo00);
                    this.f43817Oooo0o.Oooo000();
                    this.f43818Oooo0oO.OooO0Oo();
                }
            } else {
                this.f43817Oooo0o.Oooo000();
                this.f43818Oooo0oO.OooO0Oo();
            }
        }
        return Unit.INSTANCE;
    }
}
