package p544o0o0OoOO;

import android.content.Context;
import com.app.base.model.MusicSelecterModel;
import com.chad.library.adapter.base.OooO00o;
import com.weieyu.yalla.R;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p254o00ooO0O.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class r6 extends OooO0OO<ArrayList<MusicSelecterModel>> {
    public r6(Context context, List list) {
        super(context, R.layout.item_scan_music_class, list);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        String str;
        OooO0o oooO0o = (OooO0o) oooO00o;
        ArrayList arrayList = (ArrayList) obj;
        int i = 0;
        oooO0o.OooOO0(R.id.tv_folder_name, ((MusicSelecterModel) arrayList.get(0)).fileName);
        oooO0o.OooOO0(R.id.tv_folder_music_num, arrayList.size() + ZegoConstants.ZegoVideoDataAuxPublishingStream + o000O0O0.OooO0OO(R.string.songs));
        oooO0o.OooOO0(R.id.tv_folder_path, ((MusicSelecterModel) arrayList.get(0)).filePath);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((MusicSelecterModel) it.next()).select) {
                i++;
            }
        }
        if (i == 0) {
            str = "";
        } else {
            str = i + ZegoConstants.ZegoVideoDataAuxPublishingStream + o000O0O0.OooO0OO(R.string.songs);
        }
        oooO0o.OooOO0(R.id.tv_select_num, str);
    }
}
