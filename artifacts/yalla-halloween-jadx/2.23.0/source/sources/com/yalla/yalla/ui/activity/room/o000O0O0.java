package com.yalla.yalla.ui.activity.room;

import androidx.lifecycle.Observer;
import com.yalla.yalla.data.manager.MusicState;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0O0 implements Observer<MusicState.State> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MusicActivity f26846OooO0Oo;

    public o000O0O0(MusicActivity musicActivity) {
        this.f26846OooO0Oo = musicActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(MusicState.State state) {
        this.f26846OooO0Oo.f26586OooOo0O.notifyDataSetChanged();
    }
}
