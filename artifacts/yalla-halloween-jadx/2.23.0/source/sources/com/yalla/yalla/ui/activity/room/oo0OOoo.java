package com.yalla.yalla.ui.activity.room;

import android.view.View;
import com.yalla.yalla.model.MusicSelecterModel;
import java.util.Iterator;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0OOoo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SelectMusicActivity f26961OooO0Oo;

    public oo0OOoo(SelectMusicActivity selectMusicActivity) {
        this.f26961OooO0Oo = selectMusicActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SelectMusicActivity selectMusicActivity = this.f26961OooO0Oo;
        selectMusicActivity.f26710OooOo00 = !selectMusicActivity.f26710OooOo00;
        Iterator it = selectMusicActivity.f26708OooOOoo.iterator();
        while (it.hasNext()) {
            ((MusicSelecterModel) it.next()).select = selectMusicActivity.f26710OooOo00;
        }
        selectMusicActivity.f26709OooOo0.notifyDataSetChanged();
        int size = selectMusicActivity.f26710OooOo00 ? selectMusicActivity.f26708OooOOoo.size() : 0;
        boolean z = size != 0 && size == selectMusicActivity.f26708OooOOoo.size();
        selectMusicActivity.f26710OooOo00 = z;
        selectMusicActivity.f26706OooOOo.setImageResource(z ? oOo00OO0.icon_music_selected : oOo00OO0.icon_music_unselect);
    }
}
