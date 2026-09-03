package p617o0oo0o;

import android.os.Looper;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO;
import com.yalla.yalla.model.GiftPropModel;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.ui.vm.moment.MomentVM;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o0o0000.OooOo;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p391o0OOooOo.o0O00000;
import p498o0o00Oo0.OooOOO;
import p501o0o00o.o000;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000 f48478Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o000O000 f48479Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f48480Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O(o000 o000Var, o000O000 o000o001, MomentDetailModel momentDetailModel) {
        super(0);
        this.f48478Oooo0o = o000Var;
        this.f48479Oooo0oO = o000o001;
        this.f48480Oooo0oo = momentDetailModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        GiftPropModel giftPropModel;
        o000 o000Var;
        GiftPropModel giftPropModel2;
        o000 o000Var2 = this.f48478Oooo0o;
        if (o000Var2.f41409OooOo00 > 0 && (giftPropModel = o000Var2.f41410OooOo0O) != null) {
            boolean z = true;
            if (!(giftPropModel.getGiftId() == -1) && (giftPropModel2 = (o000Var = this.f48478Oooo0o).f41410OooOo0O) != null) {
                o000O000 o000o001 = this.f48479Oooo0oO;
                MomentDetailModel momentDetailModel = this.f48480Oooo0oo;
                long id = momentDetailModel.getId();
                long userId = momentDetailModel.getUserId();
                int i = o000Var.f41409OooOo00;
                String strValueOf = String.valueOf(giftPropModel2.getGiftId());
                long price = giftPropModel2.getPrice();
                int typePay = giftPropModel2.getTypePay();
                o000OO o000oo2 = new o000OO(giftPropModel2, o000o001);
                Objects.requireNonNull(o000o001);
                Long value = OooOOO.f41216OooO00o.OooOo().getValue();
                if (value != null && value.longValue() == userId) {
                    String strOooO0OO = o000O0O0.OooO0OO(R.string.gift_cannot_send_to_yourself);
                    ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                    if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                        z = false;
                    }
                    if (!z) {
                        o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O0.run();
                        } else {
                            o00O000 o00o001 = o00O000.f34346OooO00o;
                            o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                        }
                    }
                } else {
                    o0O00000.OooO0OO("Moments_gifts_send");
                    ((MomentVM) o000o001.f48499OooO0Oo.getValue()).sendGift(id, OooO.OooO(Long.valueOf(userId), ""), strValueOf, i).observe(o000o001.f48496OooO00o, new OooOo(new o000O0o(o000o001, i, price, typePay, id, strValueOf, o000oo2), null, null, false, 14));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
