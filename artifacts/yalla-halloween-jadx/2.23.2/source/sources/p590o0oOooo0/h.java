package p590o0oOooo0;

import android.os.Looper;
import androidx.activity.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.gift.GiftPropTypeUser;
import com.yalla.yalla.model.moment.MomentDetailModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o0oo0000.OooO00o;
import p384o0OOoo0O.o000oOoO;
import p475o0Ooooo0.o0O00oO0;
import p511o0o0O.o00000OO;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends Lambda implements Function1<GiftPropModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000OO f57116OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f57117OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ l f57118OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o00000OO o00000oo2, l lVar, MomentDetailModel momentDetailModel) {
        super(1);
        this.f57116OooO0Oo = o00000oo2;
        this.f57118OooO0o0 = lVar;
        this.f57117OooO0o = momentDetailModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(GiftPropModel giftPropModel) {
        GiftPropModel gift = giftPropModel;
        Intrinsics.checkNotNullParameter(gift, "gift");
        o00000OO o00000oo2 = this.f57116OooO0Oo;
        if (o00000oo2.f50967OooOOOo > 0 && gift.getGiftId() != -1) {
            MomentDetailModel momentDetailModel = this.f57117OooO0o;
            long id = momentDetailModel.getId();
            long userId = momentDetailModel.getUserId();
            int i = o00000oo2.f50967OooOOOo;
            String strValueOf = String.valueOf(gift.getGiftId());
            long price = gift.getPrice();
            int typePay = gift.getTypePay();
            int typeUser = gift.getTypeUser();
            g gVar = new g(gift, o00000oo2);
            l lVar = this.f57118OooO0o0;
            lVar.getClass();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            Long l = (Long) o0O00oO0.OooOOo0().getValue();
            boolean z = true;
            if (l != null && l.longValue() == userId) {
                String strOooO0OO = o0000.OooO0OO(o000000.gift_cannot_send_to_yourself);
                if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                    z = false;
                }
                if (!z) {
                    o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                    }
                }
            } else {
                OooO00o.OooO0O0("103042");
                lVar.f57132OooO0OO.sendGift(id, o0OoOo0.OooOOO0("", Long.valueOf(userId)), strValueOf, i, typeUser == GiftPropTypeUser.Backpack.getValue() ? 1 : 0).observe(lVar.f57130OooO00o, new o000oOoO(new m(strValueOf, typeUser, lVar, i, price, typePay, id, gVar), new n(lVar, strValueOf), null, true, 4));
            }
        }
        return Unit.INSTANCE;
    }
}
