package o00OO0;

import android.content.Context;
import android.widget.LinearLayout;
import com.app.base.adapter.room.RoomBaseAdapter;
import com.app.base.model.RoomIndexFollowingModel;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO extends RoomBaseAdapter<RoomIndexFollowingModel> {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f31177OooO0o0;

    public OooO0OO(Context context) {
        super(context, R.layout.item_room_following);
    }

    @Override // com.app.base.adapter.room.RoomBaseAdapter, com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
    public final void convert(p188o00o00o0.OooO0o oooO0o, RoomIndexFollowingModel roomIndexFollowingModel) {
        super.convert(oooO0o, roomIndexFollowingModel);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ((LinearLayout) oooO0o.OooO0Oo(R.id.ll_item_room_info)).getLayoutParams();
        if (!this.f31177OooO0o0) {
            oooO0o.OooOO0o(R.id.lav_live, true);
            oooO0o.OooOO0o(R.id.tv_online_num, true);
            oooO0o.OooOO0o(R.id.mv_medal, true);
            layoutParams.setMarginEnd(OooOo00.OooO00o(8.0f));
            oooO0o.OooO0oO(R.id.ivFollow, false);
            return;
        }
        layoutParams.setMarginEnd(OooOo00.OooO00o(28.0f));
        oooO0o.OooOO0o(R.id.lav_live, false);
        oooO0o.OooOO0o(R.id.tv_online_num, false);
        oooO0o.OooOO0o(R.id.mv_medal, false);
        oooO0o.OooO0oO(R.id.ivFollow, true);
        oooO0o.OooO0O0(R.id.ivFollow);
        oooO0o.OooOOO0(R.id.ivFollow, !roomIndexFollowingModel.localFollow);
        oooO0o.OooO0o(R.id.ivFollow, roomIndexFollowingModel.localFollow ? R.drawable.shape_circle_a5abb7_10 : R.drawable.shape_corner_solid_00d8c9);
        oooO0o.OooO0oo(R.id.ivFollow, roomIndexFollowingModel.localFollow ? R.mipmap.ic_heart_solid : R.mipmap.ic_heart);
    }
}
