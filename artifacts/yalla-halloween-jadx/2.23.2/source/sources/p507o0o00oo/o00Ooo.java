package p507o0o00oo;

import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000O0;
import com.yalla.yalla.model.room.RoomIndexFollowingModel;
import com.yalla.yalla.ui.adapter.room.RoomBaseAdapter;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import p562o0oOo000.o0O0O00;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Ooo extends RoomBaseAdapter<RoomIndexFollowingModel> {

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f50616Oooo000;

    public o00Ooo(FragmentActivity fragmentActivity) {
        super(fragmentActivity, oo0o0Oo.item_room_following);
    }

    @Override // com.yalla.yalla.ui.adapter.room.RoomBaseAdapter
    /* JADX INFO: renamed from: Oooo, reason: merged with bridge method [inline-methods] */
    public final void OooO0oO(ViewHolder viewHolder, RoomIndexFollowingModel roomIndexFollowingModel) {
        super.OooO0oO(viewHolder, roomIndexFollowingModel);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ((LinearLayout) viewHolder.getView(o0OO00O.ll_item_room_info)).getLayoutParams();
        if (!this.f50616Oooo000) {
            viewHolder.setVisible(o0OO00O.lav_live, true);
            viewHolder.setVisible(o0OO00O.tv_online_num, true);
            viewHolder.setVisible(o0OO00O.mv_medal, true);
            layoutParams.setMarginEnd(o0000O0.OooO00o(8));
            viewHolder.setGone(o0OO00O.ivFollow, false);
            return;
        }
        layoutParams.setMarginEnd(o0000O0.OooO00o(28));
        viewHolder.setVisible(o0OO00O.lav_live, false);
        viewHolder.setVisible(o0OO00O.tv_online_num, false);
        viewHolder.setVisible(o0OO00O.mv_medal, false);
        int i = o0OO00O.ivFollow;
        viewHolder.setGone(i, true);
        viewHolder.addOnClickListener(i);
        viewHolder.setEnable(i, !roomIndexFollowingModel.localFollow);
        viewHolder.setBackgroundRes(i, roomIndexFollowingModel.localFollow ? o0Oo0oo.shape_circle_a5abb7_10 : o0Oo0oo.shape_corner_solid_00d8c9);
        viewHolder.setImageResource(i, roomIndexFollowingModel.localFollow ? o0O0O00.ic_heart_solid : o0O0O00.ic_heart);
    }
}
