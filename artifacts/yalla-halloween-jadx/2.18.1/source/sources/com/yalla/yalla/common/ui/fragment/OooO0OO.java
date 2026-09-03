package com.yalla.yalla.common.ui.fragment;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.GiftPropModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p074o000O0oo.OooOOO0;
import p188o00o00o0.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO extends p188o00o00o0.OooO0OO<List<GiftPropModel>> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f20913OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ GiftSendFragment f20914OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(GiftSendFragment giftSendFragment, Context context) {
        super(context, R.layout.item_gift_send_page);
        this.f20914OooO00o = giftSendFragment;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
        OooO0o helper = (OooO0o) oooO00o;
        List item = (List) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        View view = helper.itemView;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) view;
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 4));
        this.f20914OooO00o.closeDefaultAnimator(recyclerView);
        OooO00o oooO00o2 = new OooO00o(item, this.f20914OooO00o, getContext());
        GiftSendFragment giftSendFragment = this.f20914OooO00o;
        oooO00o2.setOnItemLongClickListener(new o00OOO00.OooO0O0(giftSendFragment, 1));
        oooO00o2.setOnItemClickListener(new OooOOO0(giftSendFragment));
        recyclerView.setAdapter(oooO00o2);
    }
}
