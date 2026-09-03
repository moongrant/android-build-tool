package com.yalla.yalla.ui.activity.room;

import android.content.Context;
import android.widget.ImageView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.VoteGameGift;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.List;
import kotlin.jvm.internal.Ref;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0OOoo extends p571o0oOoO0.o0000oo<VoteGameGift> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<VoteGameGift> f26495OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0OOoo(int i, Context context, List list, Ref.ObjectRef objectRef) {
        super(i, context, list);
        this.f26495OooOoo0 = objectRef;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        VoteGameGift voteGameGift = (VoteGameGift) obj;
        if (viewHolder == null || voteGameGift == null) {
            return;
        }
        VoteGameGift voteGameGift2 = this.f26495OooOoo0.element;
        if (voteGameGift2 != null && voteGameGift2.getGiftId() == voteGameGift.getGiftId()) {
            viewHolder.itemView.setBackground(com.code.android.util.o0000.OooO0O0(p562o0oOo000.o0Oo0oo.room_shape_dialog_vote_game_gift));
        }
        ((ImageView) viewHolder.getView(p562o0oOo000.o0OO00O.ivVoteType)).setImageResource(voteGameGift.getGiftType() == 0 ? p562o0oOo000.o0Oo0oo.red_golds_big : p562o0oOo000.o0Oo0oo.icon_crystal_bg_dialog);
        viewHolder.setText(p562o0oOo000.o0OO00O.tvVoteGiftPrice, p605o0oo0O0O.o0O0O0Oo.OooO0Oo(String.valueOf(voteGameGift.getGiftPrice())));
        o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this.f56423OooOo);
        oooO00o.OooO00o(d1.OooO0O0());
        oooO00o.f43126OooO0OO = voteGameGift.getGiftImageUrl();
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0Oo((ImageView) viewHolder.getView(p562o0oOo000.o0OO00O.ivVoteGift));
    }
}
