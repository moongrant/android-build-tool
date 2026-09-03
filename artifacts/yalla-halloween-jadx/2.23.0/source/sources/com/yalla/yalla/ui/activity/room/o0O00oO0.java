package com.yalla.yalla.ui.activity.room;

import android.content.Context;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.MusicSelecterModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.Iterator;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00oO0 extends p564o0oOo0OO.o000O<ArrayList<MusicSelecterModel>> {
    public o0O00oO0(Context context, int i, ArrayList arrayList) {
        super(i, context, arrayList);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        String str;
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        ArrayList arrayList = (ArrayList) obj;
        int i = 0;
        viewHolder.setText(oO00O0oO.tv_folder_name, ((MusicSelecterModel) arrayList.get(0)).fileName);
        viewHolder.setText(oO00O0oO.tv_folder_music_num, arrayList.size() + ZegoConstants.ZegoVideoDataAuxPublishingStream + com.code.android.util.o0000.OooO0OO(oO00OOo0.songs));
        viewHolder.setText(oO00O0oO.tv_folder_path, ((MusicSelecterModel) arrayList.get(0)).filePath);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((MusicSelecterModel) it.next()).select) {
                i++;
            }
        }
        int i2 = oO00O0oO.tv_select_num;
        if (i == 0) {
            str = "";
        } else {
            str = i + ZegoConstants.ZegoVideoDataAuxPublishingStream + com.code.android.util.o0000.OooO0OO(oO00OOo0.songs);
        }
        viewHolder.setText(i2, str);
    }
}
