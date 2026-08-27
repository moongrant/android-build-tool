package com.yalla.yalla.api.old;

import com.yalla.yalla.data.kv.table.DomainTable;
import com.yalla.yalla.domain.DomainType;
import com.yalla.yalla.mixedroom.roomdata.RoomInfoData;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class OooOOO0 implements Function0 {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f45031OooO0oO;

    public /* synthetic */ OooOOO0(int i) {
        this.f45031OooO0oO = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f45031OooO0oO) {
            case 0:
                Retrofit.Builder builderOooO0OO = OooOOO.OooO0OO();
                Lazy lazy = com.yalla.yalla.domain.OooOo00.f49344OooO00o;
                return builderOooO0OO.baseUrl(com.yalla.yalla.domain.OooOo00.OooO0Oo(DomainType.Room)).build();
            case 1:
                return Long.valueOf(RoomInfoData.roomId_delegate$lambda$0());
            default:
                return new DomainTable();
        }
    }
}
