package p511o0o0O;

import android.view.View;
import com.code.android.util.o000O00;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.gift.GiftPropTypeShow;
import com.yalla.yalla.ui.dialog.giftDialog.GiftCustomMadeWebManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oo00o extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000OO f51068OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo00o(o00000OO o00000oo2) {
        super(1);
        this.f51068OooO0Oo = o00000oo2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        GiftPropModel giftPropModel;
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        o00000OO o00000oo2 = this.f51068OooO0Oo;
        if (o00000oo2.f50967OooOOOo > 0 && (giftPropModel = o00000oo2.f50968OooOOo) != null) {
            if (!(giftPropModel.getGiftId() == -1)) {
                if (Intrinsics.areEqual(o00000oo2.f50966OooOOOO, Oooo000.f50937OooO0o0)) {
                    o000O00.OooO00o(o000000.gift_toast_pp);
                } else {
                    o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                    Long l = (Long) o0O00oO0.OooOOo0().getValue();
                    long jLongValue = o00000oo2.f50966OooOOOO.getUserId().getValue().longValue();
                    if (l != null && l.longValue() == jLongValue) {
                        o000O00.OooO00o(o000000.gift_cannot_send_to_yourself);
                    } else {
                        o00OO0O0 o00oo0o1 = new o00OO0O0(o00000oo2);
                        if (o00000oo2.OooOOo().f27527OooO0Oo) {
                            GiftCustomMadeWebManager giftCustomMadeWebManagerOooOOo = o00000oo2.OooOOo();
                            boolean z = o00000oo2.f50958OooO == GiftPropTypeShow.InRoom;
                            o00OO000 sendCallBack = new o00OO000(o00oo0o1);
                            giftCustomMadeWebManagerOooOOo.getClass();
                            Intrinsics.checkNotNullParameter(sendCallBack, "sendCallBack");
                            if (giftCustomMadeWebManagerOooOOo.f27527OooO0Oo) {
                                giftCustomMadeWebManagerOooOOo.f27530OooO0oO = sendCallBack;
                                giftCustomMadeWebManagerOooOOo.f27531OooO0oo = z;
                                giftCustomMadeWebManagerOooOOo.OooO0O0();
                            }
                        } else {
                            o00oo0o1.invoke();
                        }
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
