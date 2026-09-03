package com.yalla.yalla.module.event.ui.screen;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.model.user.UserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO0 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ p107o000ooO0.OooOOOO<UserInfoModel> f23416OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(p107o000ooO0.OooOOOO<UserInfoModel> oooOOOO) {
        super(4);
        this.f23416OooO0Oo = oooOOOO;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        LazyItemScope items = lazyItemScope;
        int iIntValue = num.intValue();
        Composer composer2 = composer;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((iIntValue2 & 112) == 0) {
            iIntValue2 |= composer2.changed(iIntValue) ? 32 : 16;
        }
        if ((iIntValue2 & 721) == 144 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1496122668, iIntValue2, -1, "com.yalla.yalla.module.event.ui.screen.EventDetailScreen.EventMember.<anonymous>.<anonymous>.<anonymous> (EventDetailScreen.kt:505)");
            }
            UserInfoModel userInfoModelOooO00o = this.f23416OooO0Oo.OooO00o(iIntValue);
            if (userInfoModelOooO00o != null) {
                EventDetailScreen.INSTANCE.EventDetailUser(userInfoModelOooO00o.getUserHeader(), userInfoModelOooO00o.getUserName(), userInfoModelOooO00o.getSex(), false, userInfoModelOooO00o.isPremium(), PremiumLevel.INSTANCE.of(Integer.valueOf(userInfoModelOooO00o.getPremiumLevel())), userInfoModelOooO00o.getVipState() == VipState.Vip.getValue(), VipLevel.INSTANCE.of(userInfoModelOooO00o.getVipLevel()), userInfoModelOooO00o.getWealthLevel(), userInfoModelOooO00o.getWealthBadgeWithBg(), new OooOO0O(userInfoModelOooO00o), composer2, 0, 48, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
