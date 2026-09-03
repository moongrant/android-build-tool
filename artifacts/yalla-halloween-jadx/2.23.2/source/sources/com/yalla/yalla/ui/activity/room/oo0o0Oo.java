package com.yalla.yalla.ui.activity.room;

import androidx.lifecycle.Observer;
import com.yalla.yalla.data.db.model.MusicTable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0o0Oo implements Observer<List<MusicTable>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ DeleteMusicActivity f26499OooO0Oo;

    public oo0o0Oo(DeleteMusicActivity deleteMusicActivity) {
        this.f26499OooO0Oo = deleteMusicActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(List<MusicTable> list) {
        List<MusicTable> list2 = list;
        DeleteMusicActivity deleteMusicActivity = this.f26499OooO0Oo;
        deleteMusicActivity.f26069OooOo0.OooOoO0(list2);
        deleteMusicActivity.f26069OooOo0.Oooo00o();
        deleteMusicActivity.OooOo00(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.title_activity_music) + "(" + list2.size() + ")");
        deleteMusicActivity.OooOo0o(0);
    }
}
