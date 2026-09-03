package p544o0o0OoOO;

import android.content.Context;
import com.chad.library.adapter.base.OooO00o;
import com.weieyu.yalla.R;
import com.yalla.yalla.data.db.model.MusicTable;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class r3 extends OooO0OO<MusicTable> {
    public r3(Context context) {
        super(context, R.layout.item_music_delete);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o oooO0o = (OooO0o) oooO00o;
        MusicTable musicTable = (MusicTable) obj;
        oooO0o.OooO0oo(R.id.iv_select, musicTable.isSelect ? R.drawable.icon_music_selected : R.drawable.icon_music_unselect);
        oooO0o.OooOO0(R.id.tv_music_name, musicTable.mDisplayName);
        oooO0o.OooOO0(R.id.tv_music_author, musicTable.mArtist);
    }
}
