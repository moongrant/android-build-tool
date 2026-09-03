package p509o0o00ooO;

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
import p184o00o00O0.OooO0OO;
import p368o0OOo0Oo.Oooo000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;
import p571o0oOoO0.o0000oo;
import p595o0oo00O.OooOo00;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class s4 extends p1 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final TextView f50805OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final LinearLayout f50806OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final ImageView f50807OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @NotNull
    public final ImageView f50808OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f50809OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public final RecyclerView f50810OooOoo0;

    public static final class OooO00o extends o0000oo<ChatModel.VoteResult> {
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
            s4 s4Var = s4.this;
            if (layoutPosition == 0) {
                s4Var.f50809OooOoo = item.getTotalCount() > 0;
            }
            int i = o0OO00O.tvVoteRank;
            helper.setGone(i, helper.getLayoutPosition() > 2 || !s4Var.f50809OooOoo);
            int i2 = o0OO00O.ivVoteRank;
            int layoutPosition2 = helper.getLayoutPosition();
            if ((layoutPosition2 >= 0 && layoutPosition2 < 3) && s4Var.f50809OooOoo) {
                z = true;
            }
            helper.setGone(i2, z);
            View view = helper.getView(i2);
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.ImageView");
            ImageView imageView = (ImageView) view;
            if (s4Var.f50809OooOoo && helper.getLayoutPosition() == 0) {
                imageView.setImageResource(o0Oo0oo.room_vote_game_rank_1);
            } else if (s4Var.f50809OooOoo && helper.getLayoutPosition() == 1) {
                imageView.setImageResource(o0Oo0oo.room_vote_game_rank_2);
            } else if (s4Var.f50809OooOoo && helper.getLayoutPosition() == 2) {
                imageView.setImageResource(o0Oo0oo.room_vote_game_rank_3);
            } else {
                helper.setText(i, String.valueOf(helper.getLayoutPosition() + 1));
            }
            helper.setText(o0OO00O.tvVoteUserName, item.getNickName());
            if (OooOo00.OooO0o0()) {
                strOooO00o = item.getTotalCount() + "x";
            } else {
                strOooO00o = android.support.v4.media.OooO00o.OooO00o("x", item.getTotalCount());
            }
            helper.setText(o0OO00O.tvGiftNumber, strOooO00o);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(o0OO00O.tvVoteTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f50805OooOo = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(o0OO00O.iv_mora_pk);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f50807OooOoO0 = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(o0OO00O.llVoteResult);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f50806OooOoO = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(o0OO00O.ivVoteGift);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f50808OooOoOO = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(o0OO00O.rvVote);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f50810OooOoo0 = (RecyclerView) viewFindViewById5;
    }

    @Override // p509o0o00ooO.p1
    public final boolean OooO00o() {
        return false;
    }

    @Override // p509o0o00ooO.p1
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        TextView textView = this.f50805OooOo;
        p1.OooO0O0(model, textView);
        boolean voteIsRunning = model.getVoteIsRunning();
        LinearLayout linearLayout = this.f50806OooOoO;
        ImageView imageView = this.f50807OooOoO0;
        if (voteIsRunning) {
            textView.setVisibility(0);
            imageView.setVisibility(0);
            linearLayout.setVisibility(8);
            return;
        }
        textView.setVisibility(8);
        imageView.setVisibility(8);
        linearLayout.setVisibility(0);
        FragmentActivity fragmentActivity = this.f50780OooO00o;
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(fragmentActivity);
        oooO00o.OooO00o(d1.OooO0O0());
        oooO00o.f43126OooO0OO = OooO0OO.OooO0Oo(model.getVoteGiftImage());
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0Oo(this.f50808OooOoOO);
        OooO00o oooO00o2 = new OooO00o(fragmentActivity, oo0o0Oo.room_item_chat_vote_game, model.getVoteResultList());
        FixLinearLayoutManager fixLinearLayoutManager = new FixLinearLayoutManager(fragmentActivity);
        RecyclerView recyclerView = this.f50810OooOoo0;
        recyclerView.setLayoutManager(fixLinearLayoutManager);
        recyclerView.setAdapter(oooO00o2);
    }

    @Override // p509o0o00ooO.p1
    public final boolean OooO0Oo() {
        return true;
    }
}
