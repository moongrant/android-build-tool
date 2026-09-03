package com.yalla.yalla.ui.activity.room;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ DeleteMusicActivity f26373OooO0Oo;

    public o000000(DeleteMusicActivity deleteMusicActivity) {
        this.f26373OooO0Oo = deleteMusicActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        o0oo0000.OooO00o.OooO0O0("102142");
        DeleteMusicActivity deleteMusicActivity = this.f26373OooO0Oo;
        deleteMusicActivity.f26069OooOo0.notifyDataSetChanged();
        deleteMusicActivity.f26069OooOo0.Oooo00o();
        if (deleteMusicActivity.f26069OooOo0.f13189OooOOoo.size() == 0) {
            str = "";
        } else {
            str = "(" + deleteMusicActivity.f26069OooOo0.f13189OooOOoo.size() + ")";
        }
        deleteMusicActivity.OooOo00(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.title_activity_music) + str);
        DeleteMusicActivity.OooOo0(deleteMusicActivity);
        deleteMusicActivity.f26072OooOo0o.OooO00o();
        if (com.code.android.util.OooOo00.OooO00o(str)) {
            deleteMusicActivity.finish();
        }
    }
}
