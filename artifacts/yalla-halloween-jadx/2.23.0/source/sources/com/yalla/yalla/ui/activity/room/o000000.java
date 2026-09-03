package com.yalla.yalla.ui.activity.room;

import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ DeleteMusicActivity f26828OooO0Oo;

    public o000000(DeleteMusicActivity deleteMusicActivity) {
        this.f26828OooO0Oo = deleteMusicActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        p587o0oOooo.o0OO000.OooO00o("102142");
        DeleteMusicActivity deleteMusicActivity = this.f26828OooO0Oo;
        deleteMusicActivity.f26521OooOo0.notifyDataSetChanged();
        deleteMusicActivity.f26521OooOo0.Oooo00o();
        if (deleteMusicActivity.f26521OooOo0.f10111OooOOoo.size() == 0) {
            str = "";
        } else {
            str = "(" + deleteMusicActivity.f26521OooOo0.f10111OooOOoo.size() + ")";
        }
        deleteMusicActivity.OooOo00(com.code.android.util.o0000.OooO0OO(oO00OOo0.title_activity_music) + str);
        DeleteMusicActivity.OooOo0(deleteMusicActivity);
        deleteMusicActivity.f26524OooOo0o.OooO00o();
        if (com.code.android.util.OooOo00.OooO00o(str)) {
            deleteMusicActivity.finish();
        }
    }
}
