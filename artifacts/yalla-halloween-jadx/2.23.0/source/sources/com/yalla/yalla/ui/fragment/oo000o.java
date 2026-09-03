package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class oo000o extends p564o0oOo0OO.o000O<List<GiftPropModel>> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ GiftSendFragment f28949OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000o(GiftSendFragment giftSendFragment, Context context, int i) {
        super(context, i);
        this.f28949OooOoo0 = giftSendFragment;
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
        Context context = this.f56196OooOo;
        recyclerView.setLayoutManager(new GridLayoutManager(context, 4));
        final GiftSendFragment giftSendFragment = this.f28949OooOoo0;
        giftSendFragment.closeDefaultAnimator(recyclerView);
        o00Oo0 o00oo1 = new o00Oo0(item, giftSendFragment, context, oO00OO0O.item_gift_send_item);
        o00oo1.f10100OooO0oO = new p358o0OOOooO.o0OOO0o(giftSendFragment);
        o00oo1.f10098OooO0o = new BaseQuickAdapter.OooO0o() { // from class: com.yalla.yalla.ui.fragment.o00O0O
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
            public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view2, int i) {
                GiftSendFragment this$0 = giftSendFragment;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o00Ooo listener = new o00Ooo(i, view2, baseQuickAdapter, this$0);
                Intrinsics.checkNotNullParameter(listener, "listener");
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (Math.abs(jCurrentTimeMillis - com.code.android.util.o000OO0O.f10369OooO00o) > 200) {
                    com.code.android.util.o000OO0O.f10369OooO00o = jCurrentTimeMillis;
                    listener.invoke();
                }
            }
        };
        recyclerView.setAdapter(o00oo1);
    }
}
