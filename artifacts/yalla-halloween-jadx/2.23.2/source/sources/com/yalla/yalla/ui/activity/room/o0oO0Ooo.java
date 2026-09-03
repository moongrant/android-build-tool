package com.yalla.yalla.ui.activity.room;

import android.content.Context;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.MusicSelecterModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oO0Ooo extends p571o0oOoO0.o0000oo<MusicSelecterModel> {
    public o0oO0Ooo(Context context, int i, ArrayList arrayList) {
        super(i, context, arrayList);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        MusicSelecterModel musicSelecterModel = (MusicSelecterModel) obj;
        viewHolder.setImageResource(p562o0oOo000.o0OO00O.iv_select, musicSelecterModel.select ? p562o0oOo000.o0Oo0oo.icon_music_selected : p562o0oOo000.o0Oo0oo.icon_music_unselect);
        viewHolder.setText(p562o0oOo000.o0OO00O.tv_music_name, musicSelecterModel.audio.getDisplayName());
        viewHolder.setText(p562o0oOo000.o0OO00O.tv_music_author, musicSelecterModel.audio.getArtist());
    }
}
