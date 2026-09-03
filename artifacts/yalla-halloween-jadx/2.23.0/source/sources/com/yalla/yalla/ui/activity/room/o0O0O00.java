package com.yalla.yalla.ui.activity.room;

import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O00 extends p564o0oOo0OO.o000O<MusicTable> {
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        MusicTable musicTable = (MusicTable) obj;
        viewHolder.setImageResource(oO00O0oO.iv_select, musicTable.isSelect ? oOo00OO0.icon_music_selected : oOo00OO0.icon_music_unselect);
        viewHolder.setText(oO00O0oO.tv_music_name, musicTable.mDisplayName);
        viewHolder.setText(oO00O0oO.tv_music_author, musicTable.mArtist);
    }
}
