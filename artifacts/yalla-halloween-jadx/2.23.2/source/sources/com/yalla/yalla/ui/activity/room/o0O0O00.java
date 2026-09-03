package com.yalla.yalla.ui.activity.room;

import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O00 extends p571o0oOoO0.o0000oo<MusicTable> {
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        MusicTable musicTable = (MusicTable) obj;
        viewHolder.setImageResource(p562o0oOo000.o0OO00O.iv_select, musicTable.isSelect ? p562o0oOo000.o0Oo0oo.icon_music_selected : p562o0oOo000.o0Oo0oo.icon_music_unselect);
        viewHolder.setText(p562o0oOo000.o0OO00O.tv_music_name, musicTable.mDisplayName);
        viewHolder.setText(p562o0oOo000.o0OO00O.tv_music_author, musicTable.mArtist);
    }
}
