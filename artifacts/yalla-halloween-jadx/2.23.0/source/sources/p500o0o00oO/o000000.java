package p500o0o00oO;

import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000O0;
import com.yalla.yalla.model.room.RoomIndexFollowingModel;
import com.yalla.yalla.ui.adapter.room.RoomBaseAdapter;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000 extends RoomBaseAdapter<RoomIndexFollowingModel> {

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f49422Oooo000;

    public o000000(FragmentActivity fragmentActivity) {
        super(fragmentActivity, oO00OO0O.item_room_following);
    }

    @Override // com.yalla.yalla.ui.adapter.room.RoomBaseAdapter
    /* JADX INFO: renamed from: Oooo, reason: merged with bridge method [inline-methods] */
    public final void OooO0oO(ViewHolder viewHolder, RoomIndexFollowingModel roomIndexFollowingModel) {
        super.OooO0oO(viewHolder, roomIndexFollowingModel);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ((LinearLayout) viewHolder.getView(oO00O0oO.ll_item_room_info)).getLayoutParams();
        if (!this.f49422Oooo000) {
            viewHolder.setVisible(oO00O0oO.lav_live, true);
            viewHolder.setVisible(oO00O0oO.tv_online_num, true);
            viewHolder.setVisible(oO00O0oO.mv_medal, true);
            layoutParams.setMarginEnd(o0000O0.OooO00o(8));
            viewHolder.setGone(oO00O0oO.ivFollow, false);
            return;
        }
        layoutParams.setMarginEnd(o0000O0.OooO00o(28));
        viewHolder.setVisible(oO00O0oO.lav_live, false);
        viewHolder.setVisible(oO00O0oO.tv_online_num, false);
        viewHolder.setVisible(oO00O0oO.mv_medal, false);
        int i = oO00O0oO.ivFollow;
        viewHolder.setGone(i, true);
        viewHolder.addOnClickListener(i);
        viewHolder.setEnable(i, !roomIndexFollowingModel.localFollow);
        viewHolder.setBackgroundRes(i, roomIndexFollowingModel.localFollow ? oOo00OO0.shape_circle_a5abb7_10 : oOo00OO0.shape_corner_solid_00d8c9);
        viewHolder.setImageResource(i, roomIndexFollowingModel.localFollow ? oO00OOO.ic_heart_solid : oO00OOO.ic_heart);
    }
}
