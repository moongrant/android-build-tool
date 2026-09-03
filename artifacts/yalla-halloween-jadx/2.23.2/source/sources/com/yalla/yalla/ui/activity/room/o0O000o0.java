package com.yalla.yalla.ui.activity.room;

import android.content.Context;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.MusicSelecterModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000o0 extends p571o0oOoO0.o0000oo<ArrayList<MusicSelecterModel>> {
    public o0O000o0(Context context, int i, ArrayList arrayList) {
        super(i, context, arrayList);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        String str;
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        ArrayList arrayList = (ArrayList) obj;
        int i = 0;
        viewHolder.setText(p562o0oOo000.o0OO00O.tv_folder_name, ((MusicSelecterModel) arrayList.get(0)).fileName);
        viewHolder.setText(p562o0oOo000.o0OO00O.tv_folder_music_num, arrayList.size() + ZegoConstants.ZegoVideoDataAuxPublishingStream + com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.songs));
        viewHolder.setText(p562o0oOo000.o0OO00O.tv_folder_path, ((MusicSelecterModel) arrayList.get(0)).filePath);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((MusicSelecterModel) it.next()).select) {
                i++;
            }
        }
        int i2 = p562o0oOo000.o0OO00O.tv_select_num;
        if (i == 0) {
            str = "";
        } else {
            str = i + ZegoConstants.ZegoVideoDataAuxPublishingStream + com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.songs);
        }
        viewHolder.setText(i2, str);
    }
}
