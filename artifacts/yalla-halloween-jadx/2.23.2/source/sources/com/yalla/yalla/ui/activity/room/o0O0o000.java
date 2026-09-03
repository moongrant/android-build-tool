package com.yalla.yalla.ui.activity.room;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.VoteGameGift;
import com.yalla.yalla.ui.view.materialdesign.FixGridLayoutManager;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o000 extends p571o0oOoO0.o0000oo<List<VoteGameGift>> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<VoteGameGift> f26463OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o000(int i, Context context, List list, Ref.ObjectRef objectRef) {
        super(i, context, list);
        this.f26463OooOoo0 = objectRef;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        List list = (List) obj;
        if (viewHolder == null || list == null) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) viewHolder.getView(p562o0oOo000.o0OO00O.rvItemChooseGift);
        int i = p562o0oOo000.oo0o0Oo.room_item_vote_game_gift_item;
        Context context = this.f56423OooOo;
        final Ref.ObjectRef<VoteGameGift> objectRef = this.f26463OooOoo0;
        oo0OOoo oo0oooo = new oo0OOoo(i, context, list, objectRef);
        recyclerView.setLayoutManager(new FixGridLayoutManager(context, 4));
        recyclerView.setAdapter(oo0oooo);
        oo0oooo.f13176OooO0o = new BaseQuickAdapter.OooO0o() { // from class: com.yalla.yalla.ui.activity.room.o0O0OOOo
            /* JADX WARN: Type inference failed for: r4v3, types: [T, com.yalla.yalla.model.VoteGameGift] */
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
            public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i2) {
                Ref.ObjectRef selectVoteGift = objectRef;
                Intrinsics.checkNotNullParameter(selectVoteGift, "$selectVoteGift");
                o0O0o000 this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (Intrinsics.areEqual(selectVoteGift.element, baseQuickAdapter.f13189OooOOoo.get(i2))) {
                    return;
                }
                Object obj2 = baseQuickAdapter.f13189OooOOoo.get(i2);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.yalla.yalla.model.VoteGameGift");
                selectVoteGift.element = (VoteGameGift) obj2;
                this$0.notifyDataSetChanged();
            }
        };
    }
}
