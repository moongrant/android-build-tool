package p520o0o0O0oo;

import android.view.View;
import com.code.android.util.o000O00O;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.gift.GiftPropTypeShow;
import com.yalla.yalla.ui.dialog.giftDialog.GiftCustomMadeWebManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class p8 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ x6 f53325OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(x6 x6Var) {
        super(1);
        this.f53325OooO0Oo = x6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        GiftPropModel giftPropModel;
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        x6 x6Var = this.f53325OooO0Oo;
        if (x6Var.f53383OooOOOo > 0 && (giftPropModel = x6Var.f53384OooOOo) != null) {
            if (!(giftPropModel.getGiftId() == -1)) {
                if (Intrinsics.areEqual(x6Var.f53382OooOOOO, d6.f53265OooO0o0)) {
                    o000O00O.OooO00o(oO00OOo0.gift_toast_pp);
                } else {
                    o000000O o000000o2 = o000000O.f46674OooO00o;
                    Long l = (Long) o000000O.OooOOo0().getValue();
                    long jLongValue = x6Var.f53382OooOOOO.getUserId().getValue().longValue();
                    if (l != null && l.longValue() == jLongValue) {
                        o000O00O.OooO00o(oO00OOo0.gift_cannot_send_to_yourself);
                    } else {
                        e9 e9Var = new e9(x6Var);
                        if (x6Var.OooOOoo().f27999OooO0Oo) {
                            GiftCustomMadeWebManager giftCustomMadeWebManagerOooOOoo = x6Var.OooOOoo();
                            boolean z = x6Var.f53374OooO == GiftPropTypeShow.InRoom;
                            c9 sendCallBack = new c9(e9Var);
                            giftCustomMadeWebManagerOooOOoo.getClass();
                            Intrinsics.checkNotNullParameter(sendCallBack, "sendCallBack");
                            if (giftCustomMadeWebManagerOooOOoo.f27999OooO0Oo) {
                                giftCustomMadeWebManagerOooOOoo.f28002OooO0oO = sendCallBack;
                                giftCustomMadeWebManagerOooOOoo.f28003OooO0oo = z;
                                giftCustomMadeWebManagerOooOOoo.OooO0O0();
                            }
                        } else {
                            e9Var.invoke();
                        }
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
