package com.yalla.yalla.ui.activity.room;

import android.widget.ImageView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OO0 extends p571o0oOoO0.o0000oo<RoomUserInfoModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ VoteGameCreateActivity f26456OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OO0(VoteGameCreateActivity voteGameCreateActivity, int i) {
        super(voteGameCreateActivity, i);
        this.f26456OooOoo0 = voteGameCreateActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        RoomUserInfoModel roomUserInfoModel = (RoomUserInfoModel) obj;
        if (viewHolder == null || roomUserInfoModel == null) {
            return;
        }
        if (roomUserInfoModel.getUserId().getValue().longValue() == 0) {
            ((ImageView) viewHolder.getView(p562o0oOo000.o0OO00O.ivVoteUserAvatar)).setImageResource(p562o0oOo000.o0Oo0oo.room_vote_game_default_add);
        } else {
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this.f56423OooOo);
            oooO00o.OooO00o(d1.OooO0OO());
            oooO00o.f43126OooO0OO = roomUserInfoModel.getUserHeader().getValue();
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0Oo((ImageView) viewHolder.getView(p562o0oOo000.o0OO00O.ivVoteUserAvatar));
        }
        int i = p562o0oOo000.o0OO00O.ivVoteDeleteSelect;
        int i2 = 1;
        viewHolder.setGone(i, roomUserInfoModel.getUserId().getValue().longValue() != 0);
        ((ImageView) viewHolder.getView(i)).setOnClickListener(new p492o0o00OO0.OooO0OO(i2, this.f26456OooOoo0, roomUserInfoModel));
    }
}
