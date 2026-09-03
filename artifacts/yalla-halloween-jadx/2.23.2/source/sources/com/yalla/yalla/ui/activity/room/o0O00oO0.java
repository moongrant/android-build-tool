package com.yalla.yalla.ui.activity.room;

import android.view.View;
import com.yalla.yalla.model.MusicSelecterModel;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00oO0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SelectMusicActivity f26452OooO0Oo;

    public o0O00oO0(SelectMusicActivity selectMusicActivity) {
        this.f26452OooO0Oo = selectMusicActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SelectMusicActivity selectMusicActivity = this.f26452OooO0Oo;
        selectMusicActivity.f26256OooOo00 = !selectMusicActivity.f26256OooOo00;
        Iterator it = selectMusicActivity.f26254OooOOoo.iterator();
        while (it.hasNext()) {
            ((MusicSelecterModel) it.next()).select = selectMusicActivity.f26256OooOo00;
        }
        selectMusicActivity.f26255OooOo0.notifyDataSetChanged();
        int size = selectMusicActivity.f26256OooOo00 ? selectMusicActivity.f26254OooOOoo.size() : 0;
        boolean z = size != 0 && size == selectMusicActivity.f26254OooOOoo.size();
        selectMusicActivity.f26256OooOo00 = z;
        selectMusicActivity.f26252OooOOo.setImageResource(z ? p562o0oOo000.o0Oo0oo.icon_music_selected : p562o0oOo000.o0Oo0oo.icon_music_unselect);
    }
}
