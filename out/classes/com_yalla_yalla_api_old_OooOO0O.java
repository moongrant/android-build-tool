package com.yalla.yalla.api.old;

import com.yalla.yalla.domain.DomainType;
import com.yalla.yalla.mixedroom.roomdata.RoomGiftScoreboardData;
import com.yalla.yalla.ui.composable.common.TipBubble;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class OooOO0O implements Function0 {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f45024OooO0oO;

    public /* synthetic */ OooOO0O(int i) {
        this.f45024OooO0oO = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f45024OooO0oO) {
            case 0:
                Retrofit.Builder builderOooO0OO = OooOOO.OooO0OO();
                Lazy lazy = com.yalla.yalla.domain.OooOo00.f49344OooO00o;
                return builderOooO0OO.baseUrl(com.yalla.yalla.domain.OooOo00.OooO0Oo(DomainType.Moment)).build();
            case 1:
                return Boolean.valueOf(RoomGiftScoreboardData.showCountdownVisibleAnim_delegate$lambda$21());
            case 2:
                TipBubble tipBubble = TipBubble.f76282OooO00o;
                TipBubble.OooO0O0();
                return Unit.INSTANCE;
            default:
                return new o0o0000.OooOo();
        }
    }
}
