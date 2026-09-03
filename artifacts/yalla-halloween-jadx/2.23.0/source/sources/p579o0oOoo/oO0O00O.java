package p579o0oOoo;

import android.os.Looper;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
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
import p377o0OOoOo.o0000OO0;
import p464o0Oooo.o000000O;
import p520o0o0O0oo.x6;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes5.dex */
public final class oO0O00O extends Lambda implements Function1<GiftPropModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ x6 f56568OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f56569OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ oO0O0O00 f56570OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O00O(x6 x6Var, oO0O0O00 oo0o0o00, MomentDetailModel momentDetailModel) {
        super(1);
        this.f56568OooO0Oo = x6Var;
        this.f56570OooO0o0 = oo0o0o00;
        this.f56569OooO0o = momentDetailModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(GiftPropModel giftPropModel) {
        GiftPropModel gift = giftPropModel;
        Intrinsics.checkNotNullParameter(gift, "gift");
        x6 x6Var = this.f56568OooO0Oo;
        if (x6Var.f53383OooOOOo > 0 && gift.getGiftId() != -1) {
            MomentDetailModel momentDetailModel = this.f56569OooO0o;
            long id = momentDetailModel.getId();
            long userId = momentDetailModel.getUserId();
            int i = x6Var.f53383OooOOOo;
            String strValueOf = String.valueOf(gift.getGiftId());
            long price = gift.getPrice();
            int typePay = gift.getTypePay();
            int typeUser = gift.getTypeUser();
            oO0O00 oo0o00 = new oO0O00(gift, x6Var);
            oO0O0O00 oo0o0o00 = this.f56570OooO0o0;
            oo0o0o00.getClass();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            Long l = (Long) o000000O.OooOOo0().getValue();
            boolean z = true;
            if (l != null && l.longValue() == userId) {
                String strOooO0OO = o0000.OooO0OO(oO00OOo0.gift_cannot_send_to_yourself);
                if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                    z = false;
                }
                if (!z) {
                    o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                    }
                }
            } else {
                o0OO000.OooO00o("103042");
                oo0o0o00.f56575OooO0OO.sendGift(id, o0OoOo0.OooOOO0("", Long.valueOf(userId)), strValueOf, i, typeUser == GiftPropTypeUser.Backpack.getValue() ? 1 : 0).observe(oo0o0o00.f56573OooO00o, new o0000OO0(new oO0O0O0o(strValueOf, typeUser, oo0o0o00, i, price, typePay, id, oo0o00), new oOo0oooO(oo0o0o00, strValueOf), null, true, 4));
            }
        }
        return Unit.INSTANCE;
    }
}
