package com.yalla.yalla.ui.activity.room;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.VoteGameGift;
import com.yalla.yalla.ui.view.materialdesign.FixGridLayoutManager;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.List;
import kotlin.jvm.internal.Ref;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00o0 extends p564o0oOo0OO.o000O<List<VoteGameGift>> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<VoteGameGift> f26928OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00o0(int i, Context context, List list, Ref.ObjectRef objectRef) {
        super(i, context, list);
        this.f26928OooOoo0 = objectRef;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        List list = (List) obj;
        if (viewHolder == null || list == null) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) viewHolder.getView(oO00O0oO.rvItemChooseGift);
        int i = oO00OO0O.room_item_vote_game_gift_item;
        Context context = this.f56196OooOo;
        Ref.ObjectRef<VoteGameGift> objectRef = this.f26928OooOoo0;
        o0OO00OO o0oo00oo2 = new o0OO00OO(i, context, list, objectRef);
        recyclerView.setLayoutManager(new FixGridLayoutManager(context, 4));
        recyclerView.setAdapter(o0oo00oo2);
        o0oo00oo2.f10098OooO0o = new p039OoooOoo.o00O0OO0(objectRef, this);
    }
}
