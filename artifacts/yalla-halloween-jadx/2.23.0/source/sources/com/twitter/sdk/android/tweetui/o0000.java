package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.services.FavoriteService;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000 extends Oooo0<com.twitter.sdk.android.core.o0Oo0oo> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ long f22430OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ com.twitter.sdk.android.core.OooO0O0 f22431OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0000oo f22432OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000(o0000oo o0000ooVar, OooOo.OooO00o oooO00o, com.twitter.sdk.android.core.OooOO0O oooOO0O, long j, OooOo.OooO00o oooO00o2) {
        super(oooO00o, oooOO0O);
        this.f22432OooO0o0 = o0000ooVar;
        this.f22430OooO0OO = j;
        this.f22431OooO0Oo = oooO00o2;
    }

    @Override // com.twitter.sdk.android.core.OooO0O0
    public final void OooO0Oo(com.twitter.sdk.android.core.o000oOoO<com.twitter.sdk.android.core.o0Oo0oo> o000oooo2) {
        ((FavoriteService) this.f22432OooO0o0.f22451OooO00o.OooO00o(o000oooo2.f22205OooO00o).OooO00o(FavoriteService.class)).create(Long.valueOf(this.f22430OooO0OO), Boolean.FALSE).OooOooO(this.f22431OooO0Oo);
    }
}
