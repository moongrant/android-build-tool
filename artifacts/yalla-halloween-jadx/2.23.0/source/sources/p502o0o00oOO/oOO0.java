package p502o0o00oOO;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p139o00OOooO.OooO0o;
import p362o0OOo0O.OooOO0;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oOo00OO0;
import p591o0oo000O.OooO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oOO0 extends o0OOO0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final TextView f49631OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final LinearLayout f49632OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final ImageView f49633OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @NotNull
    public final ImageView f49634OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f49635OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public final RecyclerView f49636OooOoo0;

    public static final class OooO00o extends o000O<ChatModel.VoteResult> {
        public OooO00o(FragmentActivity fragmentActivity, int i, List<ChatModel.VoteResult> list) {
            super(i, fragmentActivity, list);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            String strOooO00o;
            ViewHolder helper = (ViewHolder) baseViewHolder;
            ChatModel.VoteResult item = (ChatModel.VoteResult) obj;
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(item, "item");
            int layoutPosition = helper.getLayoutPosition();
            boolean z = false;
            oOO0 ooo0 = oOO0.this;
            if (layoutPosition == 0) {
                ooo0.f49635OooOoo = item.getTotalCount() > 0;
            }
            int i = oO00O0oO.tvVoteRank;
            helper.setGone(i, helper.getLayoutPosition() > 2 || !ooo0.f49635OooOoo);
            int i2 = oO00O0oO.ivVoteRank;
            int layoutPosition2 = helper.getLayoutPosition();
            if ((layoutPosition2 >= 0 && layoutPosition2 < 3) && ooo0.f49635OooOoo) {
                z = true;
            }
            helper.setGone(i2, z);
            View view = helper.getView(i2);
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.ImageView");
            ImageView imageView = (ImageView) view;
            if (ooo0.f49635OooOoo && helper.getLayoutPosition() == 0) {
                imageView.setImageResource(oOo00OO0.room_vote_game_rank_1);
            } else if (ooo0.f49635OooOoo && helper.getLayoutPosition() == 1) {
                imageView.setImageResource(oOo00OO0.room_vote_game_rank_2);
            } else if (ooo0.f49635OooOoo && helper.getLayoutPosition() == 2) {
                imageView.setImageResource(oOo00OO0.room_vote_game_rank_3);
            } else {
                helper.setText(i, String.valueOf(helper.getLayoutPosition() + 1));
            }
            helper.setText(oO00O0oO.tvVoteUserName, item.getNickName());
            if (OooO.OooO0o0()) {
                strOooO00o = item.getTotalCount() + "x";
            } else {
                strOooO00o = android.support.v4.media.OooO00o.OooO00o("x", item.getTotalCount());
            }
            helper.setText(oO00O0oO.tvGiftNumber, strOooO00o);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(oO00O0oO.tvVoteTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.tvVoteTitle)");
        this.f49631OooOo = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(oO00O0oO.iv_mora_pk);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.iv_mora_pk)");
        this.f49633OooOoO0 = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(oO00O0oO.llVoteResult);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(R.id.llVoteResult)");
        this.f49632OooOoO = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(oO00O0oO.ivVoteGift);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "view.findViewById(R.id.ivVoteGift)");
        this.f49634OooOoOO = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(oO00O0oO.rvVote);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "view.findViewById(R.id.rvVote)");
        this.f49636OooOoo0 = (RecyclerView) viewFindViewById5;
    }

    @Override // p502o0o00oOO.o0OOO0
    public final boolean OooO00o() {
        return false;
    }

    @Override // p502o0o00oOO.o0OOO0
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        TextView textView = this.f49631OooOo;
        o0OOO0.OooO0O0(model, textView);
        boolean voteIsRunning = model.getVoteIsRunning();
        LinearLayout linearLayout = this.f49632OooOoO;
        ImageView imageView = this.f49633OooOoO0;
        if (voteIsRunning) {
            textView.setVisibility(0);
            imageView.setVisibility(0);
            linearLayout.setVisibility(8);
            return;
        }
        textView.setVisibility(8);
        imageView.setVisibility(8);
        linearLayout.setVisibility(0);
        FragmentActivity fragmentActivity = this.f49471OooO00o;
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(fragmentActivity);
        oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0O0());
        oooO00o.f43911OooO0OO = OooO0o.OooO0Oo(model.getVoteGiftImage());
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo(this.f49634OooOoOO);
        OooO00o oooO00o2 = new OooO00o(fragmentActivity, oO00OO0O.room_item_chat_vote_game, model.getVoteResultList());
        FixLinearLayoutManager fixLinearLayoutManager = new FixLinearLayoutManager(fragmentActivity);
        RecyclerView recyclerView = this.f49636OooOoo0;
        recyclerView.setLayoutManager(fixLinearLayoutManager);
        recyclerView.setAdapter(oooO00o2);
    }

    @Override // p502o0o00oOO.o0OOO0
    public final boolean OooO0Oo() {
        return true;
    }
}
