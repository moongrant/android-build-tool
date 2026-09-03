package com.yalla.yalla.ui.activity.room;

import androidx.lifecycle.Observer;
import com.yalla.yalla.data.db.model.MusicTable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O00O implements Observer<List<MusicTable>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MusicActivity f26392OooO0Oo;

    public o000O00O(MusicActivity musicActivity) {
        this.f26392OooO0Oo = musicActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(List<MusicTable> list) {
        String str;
        List<MusicTable> list2 = list;
        MusicActivity musicActivity = this.f26392OooO0Oo;
        musicActivity.f26134OooOo0O.OooOoO0(list2);
        musicActivity.f26134OooOo0O.Oooo00o();
        if (list2.size() > 0) {
            str = "(" + list2.size() + ")";
        } else {
            str = "";
        }
        musicActivity.OooOo00(musicActivity.getString(p562o0oOo000.o000000.title_activity_music) + str);
        musicActivity.f26135OooOo0o.setVisibility(list2.size() == 0 ? 8 : 0);
    }
}
