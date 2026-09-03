package p544o0o0OoOO;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.OooO00o;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.VoteGameGift;
import com.yalla.yalla.ui.view.materialdesign.FixGridLayoutManager;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class n7 extends OooO0OO<List<VoteGameGift>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<VoteGameGift> f44278OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(Ref.ObjectRef<VoteGameGift> objectRef, Context context, List<List<VoteGameGift>> list) {
        super(context, R.layout.room_item_vote_game_gift, list);
        this.f44278OooO00o = objectRef;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o oooO0o = (OooO0o) oooO00o;
        List list = (List) obj;
        if (oooO0o == null || list == null) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) oooO0o.OooO0Oo(R.id.rvItemChooseGift);
        m7 m7Var = new m7(list, this.f44278OooO00o, getContext());
        recyclerView.setLayoutManager(new FixGridLayoutManager(getContext(), 4));
        recyclerView.setAdapter(m7Var);
        final Ref.ObjectRef<VoteGameGift> objectRef = this.f44278OooO00o;
        m7Var.setOnItemClickListener(new BaseQuickAdapter.OooOOOO() { // from class: o0o0OoOO.l7
            /* JADX WARN: Type inference failed for: r4v3, types: [T, com.yalla.yalla.model.VoteGameGift] */
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
            public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                Ref.ObjectRef selectVoteGift = objectRef;
                n7 this$0 = this;
                Intrinsics.checkNotNullParameter(selectVoteGift, "$selectVoteGift");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (Intrinsics.areEqual(selectVoteGift.element, baseQuickAdapter.getData().get(i))) {
                    return;
                }
                Object obj2 = baseQuickAdapter.getData().get(i);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.yalla.yalla.model.VoteGameGift");
                selectVoteGift.element = (VoteGameGift) obj2;
                this$0.notifyDataSetChanged();
            }
        });
    }
}
