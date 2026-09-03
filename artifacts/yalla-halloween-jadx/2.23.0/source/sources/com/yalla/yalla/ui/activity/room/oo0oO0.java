package com.yalla.yalla.ui.activity.room;

import android.view.View;
import android.widget.ImageView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0oO0 extends p564o0oOo0OO.o000O<RoomUserInfoModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ VoteGameCreateActivity f26964OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0oO0(VoteGameCreateActivity voteGameCreateActivity, int i) {
        super(voteGameCreateActivity, i);
        this.f26964OooOoo0 = voteGameCreateActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        final RoomUserInfoModel roomUserInfoModel = (RoomUserInfoModel) obj;
        if (viewHolder == null || roomUserInfoModel == null) {
            return;
        }
        if (roomUserInfoModel.getUserId().getValue().longValue() == 0) {
            ((ImageView) viewHolder.getView(oO00O0oO.ivVoteUserAvatar)).setImageResource(oOo00OO0.room_vote_game_default_add);
        } else {
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this.f56196OooOo);
            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
            oooO00o.f43911OooO0OO = roomUserInfoModel.getUserHeader().getValue();
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0Oo((ImageView) viewHolder.getView(oO00O0oO.ivVoteUserAvatar));
        }
        int i = oO00O0oO.ivVoteDeleteSelect;
        viewHolder.setGone(i, roomUserInfoModel.getUserId().getValue().longValue() != 0);
        ImageView imageView = (ImageView) viewHolder.getView(i);
        final VoteGameCreateActivity voteGameCreateActivity = this.f26964OooOoo0;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.yalla.yalla.ui.activity.room.o0OO000o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoteGameCreateActivity this$0 = voteGameCreateActivity;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int size = this$0.f26757OooOo0.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ArrayList arrayList = this$0.f26757OooOo0;
                    if (((RoomUserInfoModel) arrayList.get(i2)).getUserId().getValue().longValue() == roomUserInfoModel.getUserId().getValue().longValue()) {
                        arrayList.remove(i2);
                        this$0.OooOoO0();
                        return;
                    }
                }
            }
        });
    }
}
