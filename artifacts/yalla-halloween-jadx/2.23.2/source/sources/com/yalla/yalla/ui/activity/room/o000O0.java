package com.yalla.yalla.ui.activity.room;

import androidx.lifecycle.Observer;
import com.yalla.yalla.data.db.model.MusicTable;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0 implements Observer<MusicTable> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MusicActivity f26388OooO0Oo;

    public o000O0(MusicActivity musicActivity) {
        this.f26388OooO0Oo = musicActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(MusicTable musicTable) {
        this.f26388OooO0Oo.f26134OooOo0O.notifyDataSetChanged();
    }
}
