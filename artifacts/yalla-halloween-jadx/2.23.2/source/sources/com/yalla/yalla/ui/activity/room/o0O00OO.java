package com.yalla.yalla.ui.activity.room;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00OO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SearchMusicActivity f26448OooO0Oo;

    public o0O00OO(SearchMusicActivity searchMusicActivity) {
        this.f26448OooO0Oo = searchMusicActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchMusicActivity searchMusicActivity = this.f26448OooO0Oo;
        searchMusicActivity.f26249OooOo0O.OooOoO0(searchMusicActivity.f26245OooOOoo);
        searchMusicActivity.f26249OooOo0O.Oooo00o();
        searchMusicActivity.f26247OooOo0 = 0;
        searchMusicActivity.f26243OooOOo.setEnabled(false);
    }
}
