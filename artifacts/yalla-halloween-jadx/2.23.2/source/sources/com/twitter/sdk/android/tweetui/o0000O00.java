package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.services.FavoriteService;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O00 extends Oooo0<com.twitter.sdk.android.core.o0OOO0o> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ long f21967OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ com.twitter.sdk.android.core.OooO0O0 f21968OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0000oo f21969OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O00(o0000oo o0000ooVar, OooOo.OooO00o oooO00o, com.twitter.sdk.android.core.OooOO0 oooOO1, long j, OooOo.OooO00o oooO00o2) {
        super(oooO00o, oooOO1);
        this.f21969OooO0o0 = o0000ooVar;
        this.f21967OooO0OO = j;
        this.f21968OooO0Oo = oooO00o2;
    }

    @Override // com.twitter.sdk.android.core.OooO0O0
    public final void OooO0Oo(com.twitter.sdk.android.core.Oooo0<com.twitter.sdk.android.core.o0OOO0o> oooo0) {
        ((FavoriteService) this.f21969OooO0o0.f21975OooO00o.OooO00o(oooo0.f21502OooO00o).OooO00o(FavoriteService.class)).destroy(Long.valueOf(this.f21967OooO0OO), Boolean.FALSE).OooOooo(this.f21968OooO0Oo);
    }
}
