package o00OO0;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.app.base.adapter.room.RoomBaseAdapter;
import com.app.base.model.RoomIndexModel;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo00;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O<T extends RoomIndexModel> extends RoomBaseAdapter<T> {
    public OooOO0O(Context context) {
        super(context, R.layout.item_room_related);
    }

    @Override // com.app.base.adapter.room.RoomBaseAdapter, com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: OooO00o */
    public final void convert(p188o00o00o0.OooO0o oooO0o, T t) {
        super.convert(oooO0o, t);
        oooO0o.OooO0oO(R.id.v_divider, true);
        oooO0o.OooO0oO(R.id.iv_official, t.isofficial == 1);
        oooO0o.OooO0oO(R.id.ll_item_title, com.yalla.support.common.util.OooO0OO.OooO0O0(t.relatedType));
        oooO0o.OooOO0(R.id.tv_item_title, t.relatedType);
        LinearLayout linearLayout = (LinearLayout) oooO0o.OooO0Oo(R.id.ll_item_title);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(linearLayout.getLayoutParams());
        if (com.yalla.support.common.util.OooO0OO.OooO0O0(t.relatedType) && t.isofficial == 1) {
            layoutParams.setMargins(0, 0, 0, OooOo00.OooO00o(-8.0f));
        } else {
            layoutParams.setMargins(0, 0, 0, OooOo00.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
        }
        linearLayout.setLayoutParams(layoutParams);
    }
}
