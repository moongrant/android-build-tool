package com.yalla.yalla.ui.activity.room;

import androidx.lifecycle.Observer;
import com.yalla.yalla.data.db.model.MusicTable;
import java.util.List;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0Oo implements Observer<List<MusicTable>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MusicActivity f26847OooO0Oo;

    public o000O0Oo(MusicActivity musicActivity) {
        this.f26847OooO0Oo = musicActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(List<MusicTable> list) {
        String str;
        List<MusicTable> list2 = list;
        MusicActivity musicActivity = this.f26847OooO0Oo;
        musicActivity.f26586OooOo0O.OooOoO0(list2);
        musicActivity.f26586OooOo0O.Oooo00o();
        if (list2.size() > 0) {
            str = "(" + list2.size() + ")";
        } else {
            str = "";
        }
        musicActivity.OooOo00(musicActivity.getString(oO00OOo0.title_activity_music) + str);
        musicActivity.f26587OooOo0o.setVisibility(list2.size() == 0 ? 8 : 0);
    }
}
