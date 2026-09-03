package p500o0o00oO;

import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.code.android.util.OooOo00;
import com.code.android.util.o0000O0;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.ui.adapter.room.RoomBaseAdapter;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000O0<T extends RoomIndexModel> extends RoomBaseAdapter<T> {
    @Override // com.yalla.yalla.ui.adapter.room.RoomBaseAdapter, com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: Oooo0o0 */
    public final void OooO0oO(ViewHolder viewHolder, T t) {
        super.OooO0oO(viewHolder, t);
        viewHolder.setGone(oO00O0oO.v_divider, true);
        viewHolder.setGone(oO00O0oO.iv_official, t.isofficial == 1);
        int i = oO00O0oO.ll_item_title;
        viewHolder.setGone(i, OooOo00.OooO0O0(t.relatedType));
        viewHolder.setText(oO00O0oO.tv_item_title, t.relatedType);
        LinearLayout linearLayout = (LinearLayout) viewHolder.getView(i);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(linearLayout.getLayoutParams());
        if (OooOo00.OooO0O0(t.relatedType) && t.isofficial == 1) {
            layoutParams.setMargins(0, 0, 0, o0000O0.OooO00o(-8.0f));
        } else {
            layoutParams.setMargins(0, 0, 0, o0000O0.OooO00o(0.0f));
        }
        linearLayout.setLayoutParams(layoutParams);
    }
}
