package o00OO0;

import android.content.Context;
import com.app.base.adapter.room.RoomBaseAdapter;
import com.app.base.model.RoomIndexModel;
import com.weieyu.yalla.R;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends RoomBaseAdapter {
    public OooO0O0(Context context) {
        super(context);
    }

    @Override // com.app.base.adapter.room.RoomBaseAdapter
    /* JADX INFO: renamed from: OooO00o */
    public final void convert(p188o00o00o0.OooO0o oooO0o, RoomIndexModel roomIndexModel) {
        super.convert(oooO0o, roomIndexModel);
        oooO0o.OooO0oO(R.id.iv_official, roomIndexModel.isofficial == 1);
    }
}
