package p544o0o0OoOO;

import android.content.Context;
import android.widget.ImageView;
import com.chad.library.adapter.base.OooO00o;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.model.VoteGameGift;
import java.util.List;
import kotlin.jvm.internal.Ref;
import p168o00Ooo0.o0O0O00;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class m7 extends OooO0OO<VoteGameGift> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<VoteGameGift> f44274OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(List<VoteGameGift> list, Ref.ObjectRef<VoteGameGift> objectRef, Context context) {
        super(context, R.layout.room_item_vote_game_gift_item, list);
        this.f44274OooO00o = objectRef;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o oooO0o = (OooO0o) oooO00o;
        VoteGameGift voteGameGift = (VoteGameGift) obj;
        if (oooO0o == null || voteGameGift == null) {
            return;
        }
        VoteGameGift voteGameGift2 = this.f44274OooO00o.element;
        if (voteGameGift2 != null && voteGameGift2.getGiftId() == voteGameGift.getGiftId()) {
            oooO0o.itemView.setBackground(OooOOO.OooO0O0(R.drawable.room_shape_dialog_vote_game_gift));
        }
        ((ImageView) oooO0o.OooO0Oo(R.id.ivVoteType)).setImageResource(voteGameGift.getGiftType() == 0 ? R.drawable.red_golds_big : R.drawable.icon_crystal_bg_dialog);
        oooO0o.OooOO0(R.id.tvVoteGiftPrice, o0O0O00.OooO0Oo(String.valueOf(voteGameGift.getGiftPrice())));
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(getContext());
        oooO00o2.OooO00o(o00OOO.OooO00o.OooO0Oo());
        oooO00o2.f48429OooO0OO = voteGameGift.getGiftImageUrl();
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.OooO0o((ImageView) oooO0o.OooO0Oo(R.id.ivVoteGift));
    }
}
