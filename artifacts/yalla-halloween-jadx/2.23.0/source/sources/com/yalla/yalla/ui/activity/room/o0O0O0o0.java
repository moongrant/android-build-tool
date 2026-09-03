package com.yalla.yalla.ui.activity.room;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O0o0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SearchMusicActivity f26909OooO0Oo;

    public o0O0O0o0(SearchMusicActivity searchMusicActivity) {
        this.f26909OooO0Oo = searchMusicActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchMusicActivity searchMusicActivity = this.f26909OooO0Oo;
        searchMusicActivity.f26703OooOo0O.OooOoO0(searchMusicActivity.f26699OooOOoo);
        searchMusicActivity.f26703OooOo0O.Oooo00o();
        searchMusicActivity.f26701OooOo0 = 0;
        searchMusicActivity.f26697OooOOo.setEnabled(false);
    }
}
