package p544o0o0OoOO;

import android.content.Context;
import com.app.base.model.MusicSelecterModel;
import com.chad.library.adapter.base.OooO00o;
import com.weieyu.yalla.R;
import java.util.List;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class z6 extends OooO0OO<MusicSelecterModel> {
    public z6(Context context, List list) {
        super(context, R.layout.item_music_delete, list);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o oooO0o = (OooO0o) oooO00o;
        MusicSelecterModel musicSelecterModel = (MusicSelecterModel) obj;
        oooO0o.OooO0oo(R.id.iv_select, musicSelecterModel.select ? R.drawable.icon_music_selected : R.drawable.icon_music_unselect);
        oooO0o.OooOO0(R.id.tv_music_name, musicSelecterModel.audio.getDisplayName());
        oooO0o.OooOO0(R.id.tv_music_author, musicSelecterModel.audio.getArtist());
    }
}
