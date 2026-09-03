package o00OO0O0;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.model.ChatModel;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o00OOO0 extends OooOO0O {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final ImageView f31549OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final TextView f31550OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final LinearLayout f31551OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final RecyclerView f31552OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ImageView f31553OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f31554OooOo0O;

    public static final class OooO00o extends p188o00o00o0.OooO0OO<ChatModel.VoteResult> {
        public OooO00o(FragmentActivity fragmentActivity, List<ChatModel.VoteResult> list) {
            super(fragmentActivity, R.layout.room_item_chat_vote_game, list);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            String string;
            p188o00o00o0.OooO0o helper = (p188o00o00o0.OooO0o) oooO00o;
            ChatModel.VoteResult item = (ChatModel.VoteResult) obj;
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(item, "item");
            boolean z = false;
            if (helper.getLayoutPosition() == 0) {
                o00OOO0.this.f31554OooOo0O = item.totalCount > 0;
            }
            helper.OooO0oO(R.id.tvVoteRank, helper.getLayoutPosition() > 2 || !o00OOO0.this.f31554OooOo0O);
            int layoutPosition = helper.getLayoutPosition();
            if ((layoutPosition >= 0 && layoutPosition < 3) && o00OOO0.this.f31554OooOo0O) {
                z = true;
            }
            helper.OooO0oO(R.id.ivVoteRank, z);
            View viewOooO0Oo = helper.OooO0Oo(R.id.ivVoteRank);
            Intrinsics.checkNotNull(viewOooO0Oo, "null cannot be cast to non-null type android.widget.ImageView");
            ImageView imageView = (ImageView) viewOooO0Oo;
            if (o00OOO0.this.f31554OooOo0O && helper.getLayoutPosition() == 0) {
                imageView.setImageResource(R.drawable.room_vote_game_rank_1);
            } else if (o00OOO0.this.f31554OooOo0O && helper.getLayoutPosition() == 1) {
                imageView.setImageResource(R.drawable.room_vote_game_rank_2);
            } else if (o00OOO0.this.f31554OooOo0O && helper.getLayoutPosition() == 2) {
                imageView.setImageResource(R.drawable.room_vote_game_rank_3);
            } else {
                helper.OooOO0(R.id.tvVoteRank, String.valueOf(helper.getLayoutPosition() + 1));
            }
            helper.OooOO0(R.id.tvVoteUserName, item.nickName);
            if (p168o00Ooo0.oo000o.OooO0o0()) {
                string = p028Oooo0o0.o0O0ooO.OooO00o(new StringBuilder(), item.totalCount, 'x');
            } else {
                StringBuilder sbOooO00o = p028Oooo0o0.o00O0O0O.OooO00o('x');
                sbOooO00o.append(item.totalCount);
                string = sbOooO00o.toString();
            }
            helper.OooOO0(R.id.tvGiftNumber, string);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO0(@NotNull FragmentActivity activity, @NotNull View view) {
        super(activity, view);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R.id.tvVoteTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.tvVoteTitle)");
        this.f31550OooOOo0 = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.iv_mora_pk);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.iv_mora_pk)");
        this.f31549OooOOo = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.llVoteResult);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(R.id.llVoteResult)");
        this.f31551OooOOoo = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.ivVoteGift);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "view.findViewById(R.id.ivVoteGift)");
        this.f31553OooOo00 = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.rvVote);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "view.findViewById(R.id.rvVote)");
        this.f31552OooOo0 = (RecyclerView) viewFindViewById5;
    }

    @Override // o00OO0O0.OooOO0O
    public final boolean OooO00o() {
        return false;
    }

    @Override // o00OO0O0.OooOO0O
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        OooO0O0(model, this.f31550OooOOo0);
        if (model.voteIsRunning) {
            this.f31550OooOOo0.setVisibility(0);
            this.f31549OooOOo.setVisibility(0);
            this.f31551OooOOoo.setVisibility(8);
            return;
        }
        this.f31550OooOOo0.setVisibility(8);
        this.f31549OooOOo.setVisibility(8);
        this.f31551OooOOoo.setVisibility(0);
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this.f31399OooO00o);
        oooO00o.OooO00o(o00OOO.OooO00o.OooO0Oo());
        oooO00o.f48429OooO0OO = CloudImageUtilKt.imgFormat(model.voteGiftImage);
        oooO00o.f48427OooO00o = 0;
        oooO00o.OooO0o(this.f31553OooOo00);
        OooO00o oooO00o2 = new OooO00o(this.f31399OooO00o, model.voteResultList);
        this.f31552OooOo0.setLayoutManager(new FixLinearLayoutManager(this.f31399OooO00o));
        this.f31552OooOo0.setAdapter(oooO00o2);
    }

    @Override // o00OO0O0.OooOO0O
    public final boolean OooO0Oo() {
        return true;
    }
}
