package com.yalla.yalla.ui.activity.room;

import android.content.Context;
import android.widget.ImageView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.VoteGameGift;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.List;
import kotlin.jvm.internal.Ref;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00OO extends p564o0oOo0OO.o000O<VoteGameGift> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<VoteGameGift> f26927OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00OO(int i, Context context, List list, Ref.ObjectRef objectRef) {
        super(i, context, list);
        this.f26927OooOoo0 = objectRef;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        VoteGameGift voteGameGift = (VoteGameGift) obj;
        if (viewHolder == null || voteGameGift == null) {
            return;
        }
        VoteGameGift voteGameGift2 = this.f26927OooOoo0.element;
        if (voteGameGift2 != null && voteGameGift2.getGiftId() == voteGameGift.getGiftId()) {
            viewHolder.itemView.setBackground(com.code.android.util.o0000.OooO0O0(oOo00OO0.room_shape_dialog_vote_game_gift));
        }
        ((ImageView) viewHolder.getView(oO00O0oO.ivVoteType)).setImageResource(voteGameGift.getGiftType() == 0 ? oOo00OO0.red_golds_big : oOo00OO0.icon_crystal_bg_dialog);
        viewHolder.setText(oO00O0oO.tvVoteGiftPrice, p590o0oo0.OooOOOO.OooO0Oo(String.valueOf(voteGameGift.getGiftPrice())));
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this.f56196OooOo);
        oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0O0());
        oooO00o.f43911OooO0OO = voteGameGift.getGiftImageUrl();
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo((ImageView) viewHolder.getView(oO00O0oO.ivVoteGift));
    }
}
