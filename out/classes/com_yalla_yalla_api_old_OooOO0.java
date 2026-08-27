package com.yalla.yalla.api.old;

import com.yalla.yalla.domain.DomainType;
import com.yalla.yalla.mixedroom.roomdata.RoomGiftScoreboardData;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class OooOO0 implements Function0 {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f45023OooO0oO;

    public /* synthetic */ OooOO0(int i) {
        this.f45023OooO0oO = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f45023OooO0oO) {
            case 0:
                Retrofit.Builder builderOooO0OO = OooOOO.OooO0OO();
                Lazy lazy = com.yalla.yalla.domain.OooOo00.f49344OooO00o;
                return builderOooO0OO.baseUrl(com.yalla.yalla.domain.OooOo00.OooO0Oo(DomainType.Main)).build();
            case 1:
                return Integer.valueOf(RoomGiftScoreboardData.ruleCrystalFraction_delegate$lambda$20());
            case 2:
                return Unit.INSTANCE;
            case 3:
                return Unit.INSTANCE;
            default:
                return new o0o0000.OooOOOO();
        }
    }
}
