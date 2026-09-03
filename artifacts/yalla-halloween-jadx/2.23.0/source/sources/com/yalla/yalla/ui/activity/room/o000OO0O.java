package com.yalla.yalla.ui.activity.room;

import androidx.lifecycle.Observer;
import com.yalla.yalla.data.db.model.MusicTable;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO0O implements Observer<MusicTable> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MusicActivity f26852OooO0Oo;

    public o000OO0O(MusicActivity musicActivity) {
        this.f26852OooO0Oo = musicActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(MusicTable musicTable) {
        this.f26852OooO0Oo.f26586OooOo0O.notifyDataSetChanged();
    }
}
