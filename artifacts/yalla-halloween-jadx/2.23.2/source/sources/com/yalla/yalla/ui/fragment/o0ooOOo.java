package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o0ooOOo extends p571o0oOoO0.o0000oo<List<GiftPropModel>> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ GiftSendFragment f28423OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0ooOOo(GiftSendFragment giftSendFragment, Context context, int i) {
        super(context, i);
        this.f28423OooOoo0 = giftSendFragment;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        List item = (List) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        View view = helper.itemView;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) view;
        Context context = this.f56423OooOo;
        recyclerView.setLayoutManager(new GridLayoutManager(context, 4));
        GiftSendFragment giftSendFragment = this.f28423OooOoo0;
        giftSendFragment.closeDefaultAnimator(recyclerView);
        oo000o oo000oVar = new oo000o(item, giftSendFragment, context, p562o0oOo000.oo0o0Oo.item_gift_send_item);
        oo000oVar.f13178OooO0oO = new p045Oooooo.o000oOoO(giftSendFragment);
        oo000oVar.f13176OooO0o = new androidx.media3.session.o000000O(giftSendFragment, 2);
        recyclerView.setAdapter(oo000oVar);
    }
}
