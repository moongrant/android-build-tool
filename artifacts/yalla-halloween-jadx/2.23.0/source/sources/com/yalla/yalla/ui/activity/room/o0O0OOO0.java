package com.yalla.yalla.ui.activity.room;

import android.content.Context;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.MusicSelecterModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.ArrayList;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OOO0 extends p564o0oOo0OO.o000O<MusicSelecterModel> {
    public o0O0OOO0(Context context, int i, ArrayList arrayList) {
        super(i, context, arrayList);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        MusicSelecterModel musicSelecterModel = (MusicSelecterModel) obj;
        viewHolder.setImageResource(oO00O0oO.iv_select, musicSelecterModel.select ? oOo00OO0.icon_music_selected : oOo00OO0.icon_music_unselect);
        viewHolder.setText(oO00O0oO.tv_music_name, musicSelecterModel.audio.getDisplayName());
        viewHolder.setText(oO00O0oO.tv_music_author, musicSelecterModel.audio.getArtist());
    }
}
