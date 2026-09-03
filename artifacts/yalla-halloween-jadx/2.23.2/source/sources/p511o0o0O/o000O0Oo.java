package p511o0o0O;

import android.app.Activity;
import android.content.Context;
import com.code.android.util.o000O00O;
import com.code.android.util.o0OoOo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.gift.GiftPropTypeUser;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.screen.user.vip.VipScreen;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nGiftSendDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftSendDialog.kt\ncom/yalla/yalla/ui/dialog/giftDialog/GiftSendDialog$initView$1$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1595:1\n1#2:1596\n*E\n"})
public final class o000O0Oo extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000OO f51013OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0Oo(o00000OO o00000oo2) {
        super(1);
        this.f51013OooO0Oo = o00000oo2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        int value = GiftPropTypeUser.Member.getValue();
        o00000OO o00000oo2 = this.f51013OooO0Oo;
        if (iIntValue == value) {
            if (!OooO0O0.f24533OoooOOO.OooO00o().OooOO0O()) {
                LiveEventBus.get("JoinRoomDialogFromGiftSendDialogLink").post(Boolean.FALSE);
                OooO00o.f24524OooOOOO.f48544OooOoOO.setValue(Boolean.TRUE);
                o00000oo2.OooOo(true);
            }
        } else if (iIntValue == GiftPropTypeUser.Premium.getValue()) {
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            Pair pair = (Pair) o0O00oO0.OooOO0o().getValue();
            if (pair != null) {
                boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
                PremiumLevel premiumLevelOf = PremiumLevel.INSTANCE.of((Integer) pair.getSecond());
                if (!zBooleanValue || premiumLevelOf.getValue() <= 0) {
                    Context context = o000O00O.f13421OooO00o;
                    Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                    if (activityOooO0O0 != null) {
                        int i = PremiumActivity.f26673Oooo0oO;
                        PremiumActivity.OooO00o.OooO00o(activityOooO0O0, premiumLevelOf);
                    }
                }
            }
        } else if (iIntValue == GiftPropTypeUser.Wealth.getValue()) {
            o0oo0000.OooO00o.OooO0OO("305003", MapsKt.mapOf(new Pair("sources", 2)));
            o00000oo2.OooOoO0();
        } else if (iIntValue == GiftPropTypeUser.Vip.getValue()) {
            o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
            Pair pair2 = (Pair) o0O00oO0.OooOO0().getValue();
            if (o0OoOo0.OooO0o0(0, pair2 != null ? (Integer) pair2.getSecond() : null) <= 0) {
                Context context2 = o000O00O.f13421OooO00o;
                if (com.code.android.util.OooO0O0.OooO0O0() != null) {
                    VipScreen.navigate$default(VipScreen.INSTANCE, null, true, 1, null);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
